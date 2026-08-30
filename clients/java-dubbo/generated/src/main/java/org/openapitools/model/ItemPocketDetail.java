package org.openapitools.model;

import org.openapitools.model.ItemCategorySummary;
import org.openapitools.model.ItemPocketName;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ItemPocketDetail implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("categories")
  private List<ItemCategorySummary> categories = new ArrayList<>();

  @JsonProperty("names")
  private List<ItemPocketName> names = new ArrayList<>();

  /**
   * 
   * @return id
   */
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * 
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * 
   * @return categories
   */
  public List<ItemCategorySummary> getCategories() {
    return categories;
  }

  public void setCategories(List<ItemCategorySummary> categories) {
    this.categories = categories;
  }

  /**
   * 
   * @return names
   */
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
    return Objects.equals(this.id, itemPocketDetail.id) &&
        Objects.equals(this.name, itemPocketDetail.name) &&
        Objects.equals(this.categories, itemPocketDetail.categories) &&
        Objects.equals(this.names, itemPocketDetail.names);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
