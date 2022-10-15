package cy.bishub.schematron.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import cy.bishub.schematron.api.model.Attribute;
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
 * AttributeList
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-15T15:13:55.822+02:00[Europe/Paris]")
// TODO Add x-java-class-annotation
public class AttributeList   {

  
  @JsonProperty("items")
  @Valid
  
  
  private List<Attribute> items = null;

  
  @JsonProperty("itemsTotalCount")
  
  private Long itemsTotalCount;

  
  @JsonProperty("itemPageCount")
  
  private Long itemPageCount;

  
  @JsonProperty("pageCurrent")
  
  private Long pageCurrent;

  
  @JsonProperty("pageSize")
  
  private Long pageSize;

  
  @JsonProperty("pageCount")
  
  private Long pageCount;

  public AttributeList items(List<Attribute> items) {
    this.items = items;
    return this;
  }

  public AttributeList addItemsItem(Attribute itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
  */
  @ApiModelProperty(value = "")
@Valid   public List<Attribute> getItems() {
    return items;
  }

  public void setItems(List<Attribute> items) {
    this.items = items;
  }

  public AttributeList itemsTotalCount(Long itemsTotalCount) {
    this.itemsTotalCount = itemsTotalCount;
    return this;
  }

  /**
   * Get itemsTotalCount
   * @return itemsTotalCount
  */
  @ApiModelProperty(value = "")
  public Long getItemsTotalCount() {
    return itemsTotalCount;
  }

  public void setItemsTotalCount(Long itemsTotalCount) {
    this.itemsTotalCount = itemsTotalCount;
  }

  public AttributeList itemPageCount(Long itemPageCount) {
    this.itemPageCount = itemPageCount;
    return this;
  }

  /**
   * Get itemPageCount
   * @return itemPageCount
  */
  @ApiModelProperty(value = "")
  public Long getItemPageCount() {
    return itemPageCount;
  }

  public void setItemPageCount(Long itemPageCount) {
    this.itemPageCount = itemPageCount;
  }

  public AttributeList pageCurrent(Long pageCurrent) {
    this.pageCurrent = pageCurrent;
    return this;
  }

  /**
   * Get pageCurrent
   * @return pageCurrent
  */
  @ApiModelProperty(value = "")
  public Long getPageCurrent() {
    return pageCurrent;
  }

  public void setPageCurrent(Long pageCurrent) {
    this.pageCurrent = pageCurrent;
  }

  public AttributeList pageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Get pageSize
   * @return pageSize
  */
  @ApiModelProperty(value = "")
  public Long getPageSize() {
    return pageSize;
  }

  public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
  }

  public AttributeList pageCount(Long pageCount) {
    this.pageCount = pageCount;
    return this;
  }

  /**
   * Get pageCount
   * @return pageCount
  */
  @ApiModelProperty(value = "")
  public Long getPageCount() {
    return pageCount;
  }

  public void setPageCount(Long pageCount) {
    this.pageCount = pageCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttributeList attributeList = (AttributeList) o;
    return Objects.equals(this.items, attributeList.items) &&
        Objects.equals(this.itemsTotalCount, attributeList.itemsTotalCount) &&
        Objects.equals(this.itemPageCount, attributeList.itemPageCount) &&
        Objects.equals(this.pageCurrent, attributeList.pageCurrent) &&
        Objects.equals(this.pageSize, attributeList.pageSize) &&
        Objects.equals(this.pageCount, attributeList.pageCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, itemsTotalCount, itemPageCount, pageCurrent, pageSize, pageCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttributeList {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    itemsTotalCount: ").append(toIndentedString(itemsTotalCount)).append("\n");
    sb.append("    itemPageCount: ").append(toIndentedString(itemPageCount)).append("\n");
    sb.append("    pageCurrent: ").append(toIndentedString(pageCurrent)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
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
