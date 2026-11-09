package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.BerryFirmnessSummary;
import com.prokarma.pkmst.model.BerryFlavorMap;
import com.prokarma.pkmst.model.ItemSummary;
import com.prokarma.pkmst.model.TypeSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * BerryDetail
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-11-09T13:49:28.343088631Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class BerryDetail   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("growth_time")
  private Integer growthTime;

  @JsonProperty("max_harvest")
  private Integer maxHarvest;

  @JsonProperty("natural_gift_power")
  private Integer naturalGiftPower;

  @JsonProperty("size")
  private Integer size;

  @JsonProperty("smoothness")
  private Integer smoothness;

  @JsonProperty("soil_dryness")
  private Integer soilDryness;

  @JsonProperty("firmness")
  private BerryFirmnessSummary firmness;

  @JsonProperty("flavors")
  
  private List<BerryFlavorMap> flavors = new ArrayList<>();

  @JsonProperty("item")
  private ItemSummary item;

  @JsonProperty("natural_gift_type")
  private TypeSummary naturalGiftType;

  public BerryDetail id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The identifier for this resource.
   * @return id
   */
  @ApiModelProperty(required = true, readOnly = true, value = "The identifier for this resource.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public BerryDetail name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name for this resource.
   * @return name
   */
  @ApiModelProperty(required = true, value = "The name for this resource.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BerryDetail growthTime(Integer growthTime) {
    this.growthTime = growthTime;
    return this;
  }

  /**
   * Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return growthTime
   */
  @ApiModelProperty(value = "Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked.")
  public Integer getGrowthTime() {
    return growthTime;
  }

  public void setGrowthTime(Integer growthTime) {
    this.growthTime = growthTime;
  }

  public BerryDetail maxHarvest(Integer maxHarvest) {
    this.maxHarvest = maxHarvest;
    return this;
  }

  /**
   * The maximum number of these berries that can grow on one tree in Generation IV.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return maxHarvest
   */
  @ApiModelProperty(value = "The maximum number of these berries that can grow on one tree in Generation IV.")
  public Integer getMaxHarvest() {
    return maxHarvest;
  }

  public void setMaxHarvest(Integer maxHarvest) {
    this.maxHarvest = maxHarvest;
  }

  public BerryDetail naturalGiftPower(Integer naturalGiftPower) {
    this.naturalGiftPower = naturalGiftPower;
    return this;
  }

  /**
   * The power of the move \"Natural Gift\" when used with this Berry.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return naturalGiftPower
   */
  @ApiModelProperty(value = "The power of the move \"Natural Gift\" when used with this Berry.")
  public Integer getNaturalGiftPower() {
    return naturalGiftPower;
  }

  public void setNaturalGiftPower(Integer naturalGiftPower) {
    this.naturalGiftPower = naturalGiftPower;
  }

  public BerryDetail size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * The size of this Berry, in millimeters.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return size
   */
  @ApiModelProperty(value = "The size of this Berry, in millimeters.")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public BerryDetail smoothness(Integer smoothness) {
    this.smoothness = smoothness;
    return this;
  }

  /**
   * The smoothness of this Berry, used in making Pokéblocks or Poffins.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return smoothness
   */
  @ApiModelProperty(value = "The smoothness of this Berry, used in making Pokéblocks or Poffins.")
  public Integer getSmoothness() {
    return smoothness;
  }

  public void setSmoothness(Integer smoothness) {
    this.smoothness = smoothness;
  }

  public BerryDetail soilDryness(Integer soilDryness) {
    this.soilDryness = soilDryness;
    return this;
  }

  /**
   * The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return soilDryness
   */
  @ApiModelProperty(value = "The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly.")
  public Integer getSoilDryness() {
    return soilDryness;
  }

  public void setSoilDryness(Integer soilDryness) {
    this.soilDryness = soilDryness;
  }

  public BerryDetail firmness(BerryFirmnessSummary firmness) {
    this.firmness = firmness;
    return this;
  }

  /**
   * The firmness of this berry, used in making Pokéblocks or Poffins.
   * @return firmness
   */
  @ApiModelProperty(required = true, value = "The firmness of this berry, used in making Pokéblocks or Poffins.")
  public BerryFirmnessSummary getFirmness() {
    return firmness;
  }

  public void setFirmness(BerryFirmnessSummary firmness) {
    this.firmness = firmness;
  }

  public BerryDetail flavors(List<BerryFlavorMap> flavors) {
    this.flavors = flavors;
    return this;
  }

  public BerryDetail addFlavorsItem(BerryFlavorMap flavorsItem) {
    if (this.flavors == null) {
      this.flavors = new ArrayList<>();
    }
    this.flavors.add(flavorsItem);
    return this;
  }

  /**
   * A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry.
   * @return flavors
   */
  @ApiModelProperty(required = true, readOnly = true, value = "A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry.")
  public List<BerryFlavorMap> getFlavors() {
    return flavors;
  }

  public void setFlavors(List<BerryFlavorMap> flavors) {
    this.flavors = flavors;
  }

  public BerryDetail item(ItemSummary item) {
    this.item = item;
    return this;
  }

  /**
   * Berries are actually items. This is a reference to the item specific data for this berry.
   * @return item
   */
  @ApiModelProperty(required = true, value = "Berries are actually items. This is a reference to the item specific data for this berry.")
  public ItemSummary getItem() {
    return item;
  }

  public void setItem(ItemSummary item) {
    this.item = item;
  }

  public BerryDetail naturalGiftType(TypeSummary naturalGiftType) {
    this.naturalGiftType = naturalGiftType;
    return this;
  }

  /**
   * The type inherited by \"Natural Gift\" when used with this Berry.
   * @return naturalGiftType
   */
  @ApiModelProperty(required = true, value = "The type inherited by \"Natural Gift\" when used with this Berry.")
  public TypeSummary getNaturalGiftType() {
    return naturalGiftType;
  }

  public void setNaturalGiftType(TypeSummary naturalGiftType) {
    this.naturalGiftType = naturalGiftType;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

