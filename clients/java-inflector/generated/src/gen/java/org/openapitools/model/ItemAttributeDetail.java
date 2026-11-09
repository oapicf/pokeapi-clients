package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ItemAttributeDescription;
import org.openapitools.model.ItemAttributeName;
import org.openapitools.model.ItemSummary;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-11-09T13:49:15.621225368Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class ItemAttributeDetail   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("descriptions")
  private List<ItemAttributeDescription> descriptions = new ArrayList<>();

  @JsonProperty("items")
  private List<ItemSummary> items = new ArrayList<>();

  @JsonProperty("names")
  private List<ItemAttributeName> names = new ArrayList<>();

  /**
   * The identifier for this resource.
   **/
  public ItemAttributeDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The identifier for this resource.")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The name for this resource.
   **/
  public ItemAttributeDetail name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name for this resource.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The description of this item attribute listed in different languages.
   **/
  public ItemAttributeDetail descriptions(List<ItemAttributeDescription> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The description of this item attribute listed in different languages.")
  @JsonProperty("descriptions")
  public List<ItemAttributeDescription> getDescriptions() {
    return descriptions;
  }
  public void setDescriptions(List<ItemAttributeDescription> descriptions) {
    this.descriptions = descriptions;
  }

  /**
   * A list of items that have this attribute.
   **/
  public ItemAttributeDetail items(List<ItemSummary> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of items that have this attribute.")
  @JsonProperty("items")
  public List<ItemSummary> getItems() {
    return items;
  }
  public void setItems(List<ItemSummary> items) {
    this.items = items;
  }

  /**
   * The name of this item attribute listed in different languages.
   **/
  public ItemAttributeDetail names(List<ItemAttributeName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name of this item attribute listed in different languages.")
  @JsonProperty("names")
  public List<ItemAttributeName> getNames() {
    return names;
  }
  public void setNames(List<ItemAttributeName> names) {
    this.names = names;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemAttributeDetail itemAttributeDetail = (ItemAttributeDetail) o;
    return Objects.equals(id, itemAttributeDetail.id) &&
        Objects.equals(name, itemAttributeDetail.name) &&
        Objects.equals(descriptions, itemAttributeDetail.descriptions) &&
        Objects.equals(items, itemAttributeDetail.items) &&
        Objects.equals(names, itemAttributeDetail.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, descriptions, items, names);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemAttributeDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

