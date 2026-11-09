package apimodels;

import apimodels.ItemAttributeDescription;
import apimodels.ItemAttributeName;
import apimodels.ItemSummary;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ItemAttributeDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ItemAttributeDetail   {
  @JsonProperty("id")
  @NotNull

  private Integer id;

  @JsonProperty("name")
  @NotNull
@Size(max=200)

  private String name;

  @JsonProperty("descriptions")
  @NotNull
@Valid

  private List<@Valid ItemAttributeDescription> descriptions = new ArrayList<>();

  @JsonProperty("items")
  @NotNull
@Valid

  private List<@Valid ItemSummary> items = new ArrayList<>();

  @JsonProperty("names")
  @NotNull
@Valid

  private List<@Valid ItemAttributeName> names = new ArrayList<>();

  public ItemAttributeDetail id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The identifier for this resource.
   * @return id
  **/
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ItemAttributeDetail name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name for this resource.
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ItemAttributeDetail descriptions(List<@Valid ItemAttributeDescription> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  public ItemAttributeDetail addDescriptionsItem(ItemAttributeDescription descriptionsItem) {
    if (this.descriptions == null) {
      this.descriptions = new ArrayList<>();
    }
    this.descriptions.add(descriptionsItem);
    return this;
  }

   /**
   * The description of this item attribute listed in different languages.
   * @return descriptions
  **/
  public List<@Valid ItemAttributeDescription> getDescriptions() {
    return descriptions;
  }

  public void setDescriptions(List<@Valid ItemAttributeDescription> descriptions) {
    this.descriptions = descriptions;
  }

  public ItemAttributeDetail items(List<@Valid ItemSummary> items) {
    this.items = items;
    return this;
  }

  public ItemAttributeDetail addItemsItem(ItemSummary itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * A list of items that have this attribute.
   * @return items
  **/
  public List<@Valid ItemSummary> getItems() {
    return items;
  }

  public void setItems(List<@Valid ItemSummary> items) {
    this.items = items;
  }

  public ItemAttributeDetail names(List<@Valid ItemAttributeName> names) {
    this.names = names;
    return this;
  }

  public ItemAttributeDetail addNamesItem(ItemAttributeName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }

   /**
   * The name of this item attribute listed in different languages.
   * @return names
  **/
  public List<@Valid ItemAttributeName> getNames() {
    return names;
  }

  public void setNames(List<@Valid ItemAttributeName> names) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

