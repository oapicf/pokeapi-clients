package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ItemAttributeDescription;
import org.openapitools.model.ItemAttributeName;
import org.openapitools.model.ItemSummary;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ItemAttributeDetail  {
  
 /**
  * The identifier for this resource.
  */
  @ApiModelProperty(required = true, value = "The identifier for this resource.")

  private Integer id;

 /**
  * The name for this resource.
  */
  @ApiModelProperty(required = true, value = "The name for this resource.")

  private String name;

 /**
  * The description of this item attribute listed in different languages.
  */
  @ApiModelProperty(required = true, value = "The description of this item attribute listed in different languages.")

  private List<ItemAttributeDescription> descriptions = new ArrayList<>();

 /**
  * A list of items that have this attribute.
  */
  @ApiModelProperty(required = true, value = "A list of items that have this attribute.")

  private List<ItemSummary> items = new ArrayList<>();

 /**
  * The name of this item attribute listed in different languages.
  */
  @ApiModelProperty(required = true, value = "The name of this item attribute listed in different languages.")

  private List<ItemAttributeName> names = new ArrayList<>();
 /**
   * The identifier for this resource.
   * @return id
  **/
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }


 /**
   * The name for this resource.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ItemAttributeDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
   * The description of this item attribute listed in different languages.
   * @return descriptions
  **/
  @JsonProperty("descriptions")
  public List<ItemAttributeDescription> getDescriptions() {
    return descriptions;
  }


 /**
   * A list of items that have this attribute.
   * @return items
  **/
  @JsonProperty("items")
  public List<ItemSummary> getItems() {
    return items;
  }


 /**
   * The name of this item attribute listed in different languages.
   * @return names
  **/
  @JsonProperty("names")
  public List<ItemAttributeName> getNames() {
    return names;
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
    return Objects.equals(this.id, itemAttributeDetail.id) &&
        Objects.equals(this.name, itemAttributeDetail.name) &&
        Objects.equals(this.descriptions, itemAttributeDetail.descriptions) &&
        Objects.equals(this.items, itemAttributeDetail.items) &&
        Objects.equals(this.names, itemAttributeDetail.names);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

