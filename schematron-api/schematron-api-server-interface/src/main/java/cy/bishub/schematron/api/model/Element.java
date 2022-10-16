package cy.bishub.schematron.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import cy.bishub.schematron.api.model.Attribute;
import cy.bishub.schematron.api.model.Document;
import cy.bishub.schematron.api.model.Namespace;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
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
 * Element Model
 */
@ApiModel(description = "Element Model")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-16T11:11:56.606013+02:00[Europe/Paris]")
@javax.persistence.Entity(name="Element")
public class Element   {

  @javax.persistence.Id@javax.persistence.GeneratedValue( strategy=javax.persistence.GenerationType.AUTO)@javax.persistence.Column(columnDefinition = "serial")
  @JsonProperty("id")
  
  private Long id;

  
  @JsonProperty("name")
  
  private String name;

  
  @JsonProperty("content")
  
  private String content;

  @javax.persistence.OneToOne(cascade = javax.persistence.CascadeType.ALL)@javax.persistence.JoinColumn(referencedColumnName = "id")
  @JsonProperty("document")
  
  private Document document;

  @javax.persistence.OneToOne(cascade = javax.persistence.CascadeType.ALL)@javax.persistence.JoinColumn(referencedColumnName = "id")
  @JsonProperty("namespace")
  
  private Namespace namespace;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL,orphanRemoval=true)
  @JsonProperty("attributes")
  @Valid
  
  
  private List<Attribute> attributes = null;

  @javax.persistence.OneToOne(cascade = javax.persistence.CascadeType.ALL)@javax.persistence.JoinColumn(referencedColumnName = "id")
  @JsonProperty("parent")
  
  private Element parent;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL,orphanRemoval=true)
  @JsonProperty("children")
  @Valid
  
  
  private List<Element> children = null;

  
  @JsonProperty("created")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  
  private OffsetDateTime created;

  
  @JsonProperty("updated")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  
  private OffsetDateTime updated;

  public Element id(Long id) {
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

  public Element name(String name) {
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

  public Element content(String content) {
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

  public Element document(Document document) {
    this.document = document;
    return this;
  }

  /**
   * Get document
   * @return document
  */
  @ApiModelProperty(value = "")
@Valid   public Document getDocument() {
    return document;
  }

  public void setDocument(Document document) {
    this.document = document;
  }

  public Element namespace(Namespace namespace) {
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

  public Element attributes(List<Attribute> attributes) {
    this.attributes = attributes;
    return this;
  }

  public Element addAttributesItem(Attribute attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

  /**
   * Get attributes
   * @return attributes
  */
  @ApiModelProperty(value = "")
@Valid   public List<Attribute> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<Attribute> attributes) {
    this.attributes = attributes;
  }

  public Element parent(Element parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Get parent
   * @return parent
  */
  @ApiModelProperty(value = "")
@Valid   public Element getParent() {
    return parent;
  }

  public void setParent(Element parent) {
    this.parent = parent;
  }

  public Element children(List<Element> children) {
    this.children = children;
    return this;
  }

  public Element addChildrenItem(Element childrenItem) {
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
@Valid   public List<Element> getChildren() {
    return children;
  }

  public void setChildren(List<Element> children) {
    this.children = children;
  }

  public Element created(OffsetDateTime created) {
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

  public Element updated(OffsetDateTime updated) {
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
    Element element = (Element) o;
    return Objects.equals(this.id, element.id) &&
        Objects.equals(this.name, element.name) &&
        Objects.equals(this.content, element.content) &&
        Objects.equals(this.document, element.document) &&
        Objects.equals(this.namespace, element.namespace) &&
        Objects.equals(this.attributes, element.attributes) &&
        Objects.equals(this.parent, element.parent) &&
        Objects.equals(this.children, element.children) &&
        Objects.equals(this.created, element.created) &&
        Objects.equals(this.updated, element.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, content, document, namespace, attributes, parent, children, created, updated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Element {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
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
