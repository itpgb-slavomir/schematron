package cy.bishub.schematron.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-09T00:27:57.669+02:00[Europe/Paris]")
@javax.persistence.Entity(name="Folder")
public class Folder   {

  @javax.persistence.Id@javax.persistence.GeneratedValue( strategy=javax.persistence.GenerationType.AUTO)@javax.persistence.Column(columnDefinition = "serial")
  @JsonProperty("id")
  
  private Long id;

  
  @JsonProperty("name")
  
  private String name;

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
        Objects.equals(this.name, folder.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Folder {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
