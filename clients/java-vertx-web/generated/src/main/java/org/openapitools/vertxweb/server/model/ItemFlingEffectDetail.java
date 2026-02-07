package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.ItemFlingEffectEffectText;
import org.openapitools.vertxweb.server.model.ItemSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItemFlingEffectDetail   {
  
  private Integer id;
  private String name;
  private List<ItemFlingEffectEffectText> effectEntries = new ArrayList<>();
  private List<ItemSummary> items = new ArrayList<>();

  public ItemFlingEffectDetail () {

  }

  public ItemFlingEffectDetail (Integer id, String name, List<ItemFlingEffectEffectText> effectEntries, List<ItemSummary> items) {
    this.id = id;
    this.name = name;
    this.effectEntries = effectEntries;
    this.items = items;
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

    
  @JsonProperty("effect_entries")
  public List<ItemFlingEffectEffectText> getEffectEntries() {
    return effectEntries;
  }
  public void setEffectEntries(List<ItemFlingEffectEffectText> effectEntries) {
    this.effectEntries = effectEntries;
  }

    
  @JsonProperty("items")
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
    return Objects.equals(id, itemFlingEffectDetail.id) &&
        Objects.equals(name, itemFlingEffectDetail.name) &&
        Objects.equals(effectEntries, itemFlingEffectDetail.effectEntries) &&
        Objects.equals(items, itemFlingEffectDetail.items);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
