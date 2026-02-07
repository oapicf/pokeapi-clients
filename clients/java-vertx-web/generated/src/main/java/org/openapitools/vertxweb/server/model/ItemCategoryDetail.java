package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.ItemCategoryName;
import org.openapitools.vertxweb.server.model.ItemPocketSummary;
import org.openapitools.vertxweb.server.model.ItemSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItemCategoryDetail   {
  
  private Integer id;
  private String name;
  private List<ItemSummary> items = new ArrayList<>();
  private List<ItemCategoryName> names = new ArrayList<>();
  private ItemPocketSummary pocket;

  public ItemCategoryDetail () {

  }

  public ItemCategoryDetail (Integer id, String name, List<ItemSummary> items, List<ItemCategoryName> names, ItemPocketSummary pocket) {
    this.id = id;
    this.name = name;
    this.items = items;
    this.names = names;
    this.pocket = pocket;
  }

    
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("items")
  public List<ItemSummary> getItems() {
    return items;
  }
  public void setItems(List<ItemSummary> items) {
    this.items = items;
  }

    
  @JsonProperty("names")
  public List<ItemCategoryName> getNames() {
    return names;
  }
  public void setNames(List<ItemCategoryName> names) {
    this.names = names;
  }

    
  @JsonProperty("pocket")
  public ItemPocketSummary getPocket() {
    return pocket;
  }
  public void setPocket(ItemPocketSummary pocket) {
    this.pocket = pocket;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemCategoryDetail itemCategoryDetail = (ItemCategoryDetail) o;
    return Objects.equals(id, itemCategoryDetail.id) &&
        Objects.equals(name, itemCategoryDetail.name) &&
        Objects.equals(items, itemCategoryDetail.items) &&
        Objects.equals(names, itemCategoryDetail.names) &&
        Objects.equals(pocket, itemCategoryDetail.pocket);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, items, names, pocket);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemCategoryDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    pocket: ").append(toIndentedString(pocket)).append("\n");
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
