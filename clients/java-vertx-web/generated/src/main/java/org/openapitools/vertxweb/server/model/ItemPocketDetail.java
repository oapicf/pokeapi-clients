package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.ItemCategorySummary;
import org.openapitools.vertxweb.server.model.ItemPocketName;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItemPocketDetail   {
  
  private Integer id;
  private String name;
  private List<ItemCategorySummary> categories = new ArrayList<>();
  private List<ItemPocketName> names = new ArrayList<>();

  public ItemPocketDetail () {

  }

  public ItemPocketDetail (Integer id, String name, List<ItemCategorySummary> categories, List<ItemPocketName> names) {
    this.id = id;
    this.name = name;
    this.categories = categories;
    this.names = names;
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

    
  @JsonProperty("categories")
  public List<ItemCategorySummary> getCategories() {
    return categories;
  }
  public void setCategories(List<ItemCategorySummary> categories) {
    this.categories = categories;
  }

    
  @JsonProperty("names")
  public List<ItemPocketName> getNames() {
    return names;
  }
  public void setNames(List<ItemPocketName> names) {
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
    ItemPocketDetail itemPocketDetail = (ItemPocketDetail) o;
    return Objects.equals(id, itemPocketDetail.id) &&
        Objects.equals(name, itemPocketDetail.name) &&
        Objects.equals(categories, itemPocketDetail.categories) &&
        Objects.equals(names, itemPocketDetail.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, categories, names);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemPocketDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
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
