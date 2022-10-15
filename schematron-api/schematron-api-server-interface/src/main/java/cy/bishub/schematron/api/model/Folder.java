package cy.bishub.schematron.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * Folder Model
 */
@ApiModel(description = "Folder Model")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-15T14:14:52.033+02:00[Europe/Paris]")
@javax.persistence.Entity(name="Folder")
public class Folder   {

  @javax.persistence.Id@javax.persistence.GeneratedValue( strategy=javax.persistence.GenerationType.AUTO)@javax.persistence.Column(columnDefinition = "serial")
  @JsonProperty("id")
  
  private Long id;

  @javax.persistence.OneToOne(cascade = javax.persistence.CascadeType.ALL)@javax.persistence.JoinColumn(referencedColumnName = "id")
  @JsonProperty("parent")
  
  private Folder parent;

  
  @JsonProperty("name")
  
  private String name;

  
  @JsonProperty("created")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  
  private OffsetDateTime created;

  
  @JsonProperty("updated")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  
  private OffsetDateTime updated;

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

  public Folder parent(Folder parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Get parent
   * @return parent
  */
  @ApiModelProperty(value = "")
@Valid   public Folder getParent() {
    return parent;
  }

  public void setParent(Folder parent) {
    this.parent = parent;
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

  public Folder created(OffsetDateTime created) {
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

  public Folder updated(OffsetDateTime updated) {
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
    Folder folder = (Folder) o;
    return Objects.equals(this.id, folder.id) &&
        Objects.equals(this.parent, folder.parent) &&
        Objects.equals(this.name, folder.name) &&
        Objects.equals(this.created, folder.created) &&
        Objects.equals(this.updated, folder.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parent, name, created, updated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Folder {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
