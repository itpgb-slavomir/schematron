package cy.bishub.schematron.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import cy.bishub.schematron.api.model.Element;
import cy.bishub.schematron.api.model.Namespace;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
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
 * Attribute Model
 */
@ApiModel(description = "Attribute Model")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-15T15:13:55.822+02:00[Europe/Paris]")
@javax.persistence.Entity(name="Attribute")
public class Attribute   {

  @javax.persistence.Id@javax.persistence.GeneratedValue( strategy=javax.persistence.GenerationType.AUTO)@javax.persistence.Column(columnDefinition = "serial")
  @JsonProperty("id")
  
  private Long id;

  
  @JsonProperty("name")
  
  private String name;

  
  @JsonProperty("content")
  
  private String content;

  @javax.persistence.OneToOne(cascade = javax.persistence.CascadeType.ALL)@javax.persistence.JoinColumn(referencedColumnName = "id")
  @JsonProperty("namespace")
  
  private Namespace namespace;

  @javax.persistence.OneToOne(cascade = javax.persistence.CascadeType.ALL)@javax.persistence.JoinColumn(referencedColumnName = "id")
  @JsonProperty("element")
  
  private Element element;

  
  @JsonProperty("created")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  
  private OffsetDateTime created;

  
  @JsonProperty("updated")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  
  private OffsetDateTime updated;

  public Attribute id(Long id) {
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

  public Attribute name(String name) {
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

  public Attribute content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
  */
  @ApiModelProperty(value = "")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Attribute namespace(Namespace namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * Get namespace
   * @return namespace
  */
  @ApiModelProperty(value = "")
@Valid   public Namespace getNamespace() {
    return namespace;
  }

  public void setNamespace(Namespace namespace) {
    this.namespace = namespace;
  }

  public Attribute element(Element element) {
    this.element = element;
    return this;
  }

  /**
   * Get element
   * @return element
  */
  @ApiModelProperty(value = "")
@Valid   public Element getElement() {
    return element;
  }

  public void setElement(Element element) {
    this.element = element;
  }

  public Attribute created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
  */
  @ApiModelProperty(value = "")
@Valid   public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public Attribute updated(OffsetDateTime updated) {
    this.updated = updated;
    return this;
  }

  /**
   * Get updated
   * @return updated
  */
  @ApiModelProperty(value = "")
@Valid   public OffsetDateTime getUpdated() {
    return updated;
  }

  public void setUpdated(OffsetDateTime updated) {
    this.updated = updated;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attribute attribute = (Attribute) o;
    return Objects.equals(this.id, attribute.id) &&
        Objects.equals(this.name, attribute.name) &&
        Objects.equals(this.content, attribute.content) &&
        Objects.equals(this.namespace, attribute.namespace) &&
        Objects.equals(this.element, attribute.element) &&
        Objects.equals(this.created, attribute.created) &&
        Objects.equals(this.updated, attribute.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, content, namespace, element, created, updated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attribute {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    element: ").append(toIndentedString(element)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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
