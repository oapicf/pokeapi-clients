package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BerryFirmnessSummary;
import org.openapitools.model.BerryFlavorMap;
import org.openapitools.model.ItemSummary;
import org.openapitools.model.TypeSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BerryDetail  {
  
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
  * Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked.
  */
  @ApiModelProperty(value = "Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked.")
  private Integer growthTime;

 /**
  * The maximum number of these berries that can grow on one tree in Generation IV.
  */
  @ApiModelProperty(value = "The maximum number of these berries that can grow on one tree in Generation IV.")
  private Integer maxHarvest;

 /**
  * The power of the move \"Natural Gift\" when used with this Berry.
  */
  @ApiModelProperty(value = "The power of the move \"Natural Gift\" when used with this Berry.")
  private Integer naturalGiftPower;

 /**
  * The size of this Berry, in millimeters.
  */
  @ApiModelProperty(value = "The size of this Berry, in millimeters.")
  private Integer size;

 /**
  * The smoothness of this Berry, used in making Pokéblocks or Poffins.
  */
  @ApiModelProperty(value = "The smoothness of this Berry, used in making Pokéblocks or Poffins.")
  private Integer smoothness;

 /**
  * The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly.
  */
  @ApiModelProperty(value = "The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly.")
  private Integer soilDryness;

 /**
  * The firmness of this berry, used in making Pokéblocks or Poffins.
  */
  @ApiModelProperty(required = true, value = "The firmness of this berry, used in making Pokéblocks or Poffins.")
  @Valid
  private BerryFirmnessSummary firmness;

 /**
  * A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry.
  */
  @ApiModelProperty(required = true, value = "A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry.")
  private List<@Valid BerryFlavorMap> flavors = new ArrayList<>();

 /**
  * Berries are actually items. This is a reference to the item specific data for this berry.
  */
  @ApiModelProperty(required = true, value = "Berries are actually items. This is a reference to the item specific data for this berry.")
  @Valid
  private ItemSummary item;

 /**
  * The type inherited by \"Natural Gift\" when used with this Berry.
  */
  @ApiModelProperty(required = true, value = "The type inherited by \"Natural Gift\" when used with this Berry.")
  @Valid
  private TypeSummary naturalGiftType;
 /**
  * The identifier for this resource.
  * @return id
  */
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public BerryDetail id(Integer id) {
    this.id = id;
    return this;
  }

 /**
  * The name for this resource.
  * @return name
  */
  @JsonProperty("name")
  @NotNull
 @Size(max=200)  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public BerryDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked.
  * minimum: -2147483648
  * maximum: 2147483647
  * @return growthTime
  */
  @JsonProperty("growth_time")
 @Min(-2147483648) @Max(2147483647)  public Integer getGrowthTime() {
    return growthTime;
  }

  /**
   * Sets the <code>growthTime</code> property.
   */
 public void setGrowthTime(Integer growthTime) {
    this.growthTime = growthTime;
  }

  /**
   * Sets the <code>growthTime</code> property.
   */
  public BerryDetail growthTime(Integer growthTime) {
    this.growthTime = growthTime;
    return this;
  }

 /**
  * The maximum number of these berries that can grow on one tree in Generation IV.
  * minimum: -2147483648
  * maximum: 2147483647
  * @return maxHarvest
  */
  @JsonProperty("max_harvest")
 @Min(-2147483648) @Max(2147483647)  public Integer getMaxHarvest() {
    return maxHarvest;
  }

  /**
   * Sets the <code>maxHarvest</code> property.
   */
 public void setMaxHarvest(Integer maxHarvest) {
    this.maxHarvest = maxHarvest;
  }

  /**
   * Sets the <code>maxHarvest</code> property.
   */
  public BerryDetail maxHarvest(Integer maxHarvest) {
    this.maxHarvest = maxHarvest;
    return this;
  }

 /**
  * The power of the move \&quot;Natural Gift\&quot; when used with this Berry.
  * minimum: -2147483648
  * maximum: 2147483647
  * @return naturalGiftPower
  */
  @JsonProperty("natural_gift_power")
 @Min(-2147483648) @Max(2147483647)  public Integer getNaturalGiftPower() {
    return naturalGiftPower;
  }

  /**
   * Sets the <code>naturalGiftPower</code> property.
   */
 public void setNaturalGiftPower(Integer naturalGiftPower) {
    this.naturalGiftPower = naturalGiftPower;
  }

  /**
   * Sets the <code>naturalGiftPower</code> property.
   */
  public BerryDetail naturalGiftPower(Integer naturalGiftPower) {
    this.naturalGiftPower = naturalGiftPower;
    return this;
  }

 /**
  * The size of this Berry, in millimeters.
  * minimum: -2147483648
  * maximum: 2147483647
  * @return size
  */
  @JsonProperty("size")
 @Min(-2147483648) @Max(2147483647)  public Integer getSize() {
    return size;
  }

  /**
   * Sets the <code>size</code> property.
   */
 public void setSize(Integer size) {
    this.size = size;
  }

  /**
   * Sets the <code>size</code> property.
   */
  public BerryDetail size(Integer size) {
    this.size = size;
    return this;
  }

 /**
  * The smoothness of this Berry, used in making Pokéblocks or Poffins.
  * minimum: -2147483648
  * maximum: 2147483647
  * @return smoothness
  */
  @JsonProperty("smoothness")
 @Min(-2147483648) @Max(2147483647)  public Integer getSmoothness() {
    return smoothness;
  }

  /**
   * Sets the <code>smoothness</code> property.
   */
 public void setSmoothness(Integer smoothness) {
    this.smoothness = smoothness;
  }

  /**
   * Sets the <code>smoothness</code> property.
   */
  public BerryDetail smoothness(Integer smoothness) {
    this.smoothness = smoothness;
    return this;
  }

 /**
  * The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly.
  * minimum: -2147483648
  * maximum: 2147483647
  * @return soilDryness
  */
  @JsonProperty("soil_dryness")
 @Min(-2147483648) @Max(2147483647)  public Integer getSoilDryness() {
    return soilDryness;
  }

  /**
   * Sets the <code>soilDryness</code> property.
   */
 public void setSoilDryness(Integer soilDryness) {
    this.soilDryness = soilDryness;
  }

  /**
   * Sets the <code>soilDryness</code> property.
   */
  public BerryDetail soilDryness(Integer soilDryness) {
    this.soilDryness = soilDryness;
    return this;
  }

 /**
  * The firmness of this berry, used in making Pokéblocks or Poffins.
  * @return firmness
  */
  @JsonProperty("firmness")
  @NotNull
  public BerryFirmnessSummary getFirmness() {
    return firmness;
  }

  /**
   * Sets the <code>firmness</code> property.
   */
 public void setFirmness(BerryFirmnessSummary firmness) {
    this.firmness = firmness;
  }

  /**
   * Sets the <code>firmness</code> property.
   */
  public BerryDetail firmness(BerryFirmnessSummary firmness) {
    this.firmness = firmness;
    return this;
  }

 /**
  * A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry.
  * @return flavors
  */
  @JsonProperty("flavors")
  @NotNull
  public List<@Valid BerryFlavorMap> getFlavors() {
    return flavors;
  }

  /**
   * Sets the <code>flavors</code> property.
   * <br><em>N.B. <code>flavors</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setFlavors(List<@Valid BerryFlavorMap> flavors) {
    this.flavors = flavors;
  }

  /**
   * Sets the <code>flavors</code> property.
   * <br><em>N.B. <code>flavors</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public BerryDetail flavors(List<@Valid BerryFlavorMap> flavors) {
    this.flavors = flavors;
    return this;
  }

  /**
   * Adds a new item to the <code>flavors</code> list.
   * <br><em>N.B. <code>flavors</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public BerryDetail addFlavorsItem(BerryFlavorMap flavorsItem) {
    this.flavors.add(flavorsItem);
    return this;
  }

 /**
  * Berries are actually items. This is a reference to the item specific data for this berry.
  * @return item
  */
  @JsonProperty("item")
  @NotNull
  public ItemSummary getItem() {
    return item;
  }

  /**
   * Sets the <code>item</code> property.
   */
 public void setItem(ItemSummary item) {
    this.item = item;
  }

  /**
   * Sets the <code>item</code> property.
   */
  public BerryDetail item(ItemSummary item) {
    this.item = item;
    return this;
  }

 /**
  * The type inherited by \&quot;Natural Gift\&quot; when used with this Berry.
  * @return naturalGiftType
  */
  @JsonProperty("natural_gift_type")
  @NotNull
  public TypeSummary getNaturalGiftType() {
    return naturalGiftType;
  }

  /**
   * Sets the <code>naturalGiftType</code> property.
   */
 public void setNaturalGiftType(TypeSummary naturalGiftType) {
    this.naturalGiftType = naturalGiftType;
  }

  /**
   * Sets the <code>naturalGiftType</code> property.
   */
  public BerryDetail naturalGiftType(TypeSummary naturalGiftType) {
    this.naturalGiftType = naturalGiftType;
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BerryDetail berryDetail = (BerryDetail) o;
    return Objects.equals(this.id, berryDetail.id) &&
        Objects.equals(this.name, berryDetail.name) &&
        Objects.equals(this.growthTime, berryDetail.growthTime) &&
        Objects.equals(this.maxHarvest, berryDetail.maxHarvest) &&
        Objects.equals(this.naturalGiftPower, berryDetail.naturalGiftPower) &&
        Objects.equals(this.size, berryDetail.size) &&
        Objects.equals(this.smoothness, berryDetail.smoothness) &&
        Objects.equals(this.soilDryness, berryDetail.soilDryness) &&
        Objects.equals(this.firmness, berryDetail.firmness) &&
        Objects.equals(this.flavors, berryDetail.flavors) &&
        Objects.equals(this.item, berryDetail.item) &&
        Objects.equals(this.naturalGiftType, berryDetail.naturalGiftType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, growthTime, maxHarvest, naturalGiftPower, size, smoothness, soilDryness, firmness, flavors, item, naturalGiftType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BerryDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    growthTime: ").append(toIndentedString(growthTime)).append("\n");
    sb.append("    maxHarvest: ").append(toIndentedString(maxHarvest)).append("\n");
    sb.append("    naturalGiftPower: ").append(toIndentedString(naturalGiftPower)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    smoothness: ").append(toIndentedString(smoothness)).append("\n");
    sb.append("    soilDryness: ").append(toIndentedString(soilDryness)).append("\n");
    sb.append("    firmness: ").append(toIndentedString(firmness)).append("\n");
    sb.append("    flavors: ").append(toIndentedString(flavors)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    naturalGiftType: ").append(toIndentedString(naturalGiftType)).append("\n");
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

