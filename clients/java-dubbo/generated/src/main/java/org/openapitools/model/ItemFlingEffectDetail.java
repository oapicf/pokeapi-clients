package org.openapitools.model;

import org.openapitools.model.ItemFlingEffectEffectText;
import org.openapitools.model.ItemSummary;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ItemFlingEffectDetail implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("effect_entries")
  private List<ItemFlingEffectEffectText> effectEntries = new ArrayList<>();

  @JsonProperty("items")
  private List<ItemSummary> items = new ArrayList<>();

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
   * @return effectEntries
   */
  public List<ItemFlingEffectEffectText> getEffectEntries() {
    return effectEntries;
  }

  public void setEffectEntries(List<ItemFlingEffectEffectText> effectEntries) {
    this.effectEntries = effectEntries;
  }

  /**
   * 
   * @return items
   */
  public List<ItemSummary> getItems() {
    return items;
  }

  public void setItems(List<ItemSummary> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemFlingEffectDetail itemFlingEffectDetail = (ItemFlingEffectDetail) o;
    return Objects.equals(this.id, itemFlingEffectDetail.id) &&
        Objects.equals(this.name, itemFlingEffectDetail.name) &&
        Objects.equals(this.effectEntries, itemFlingEffectDetail.effectEntries) &&
        Objects.equals(this.items, itemFlingEffectDetail.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, effectEntries, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemFlingEffectDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    effectEntries: ").append(toIndentedString(effectEntries)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
