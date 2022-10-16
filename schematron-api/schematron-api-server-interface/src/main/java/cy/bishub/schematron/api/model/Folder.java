package cy.bishub.schematron.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import cy.bishub.schematron.api.model.Document;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Folder Model
 */
@ApiModel(description = "Folder Model")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-16T11:11:56.606013+02:00[Europe/Paris]")
@javax.persistence.Entity(name="Folder")
public class Folder   {

  @javax.persistence.Id@javax.persistence.GeneratedValue( strategy=javax.persistence.GenerationType.AUTO)@javax.persistence.Column(columnDefinition = "serial")
  @JsonProperty("id")
  
  private Long id;

  
  @JsonProperty("name")
  
  private String name;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL,orphanRemoval=true)
  @JsonProperty("children")
  @Valid
  
  
  private List<Folder> children = null;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL,orphanRemoval=true)
  @JsonProperty("documents")
  @Valid
  
  
  private List<Document> documents = null;

  public Folder id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Folder name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(value = "")
@Size(min = 1)   public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Folder children(List<Folder> children) {
    this.children = children;
    return this;
  }

  public Folder addChildrenItem(Folder childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<>();
    }
    this.children.add(childrenItem);
    return this;
  }

  /**
   * Get children
   * @return children
  */
  @ApiModelProperty(value = "")
@Valid   public List<Folder> getChildren() {
    return children;
  }

  public void setChildren(List<Folder> children) {
    this.children = children;
  }

  public Folder documents(List<Document> documents) {
    this.documents = documents;
    return this;
  }

  public Folder addDocumentsItem(Document documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<>();
    }
    this.documents.add(documentsItem);
    return this;
  }

  /**
   * Get documents
   * @return documents
  */
  @ApiModelProperty(value = "")
@Valid   public List<Document> getDocuments() {
    return documents;
  }

  public void setDocuments(List<Document> documents) {
    this.documents = documents;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Folder folder = (Folder) o;
    return Objects.equals(this.id, folder.id) &&
        Objects.equals(this.name, folder.name) &&
        Objects.equals(this.children, folder.children) &&
        Objects.equals(this.documents, folder.documents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, children, documents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Folder {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
