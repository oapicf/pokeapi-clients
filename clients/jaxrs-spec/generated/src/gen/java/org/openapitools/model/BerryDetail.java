package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("BerryDetail")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-11-09T13:50:06.168269698Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class BerryDetail   {
  private Integer id;
  private String name;
  private Integer growthTime;
  private Integer maxHarvest;
  private Integer naturalGiftPower;
  private Integer size;
  private Integer smoothness;
  private Integer soilDryness;
  private BerryFirmnessSummary firmness;
  private List<@Valid BerryFlavorMap> flavors = new ArrayList<>();
  private ItemSummary item;
  private TypeSummary naturalGiftType;

  public BerryDetail() {
  }

  @JsonCreator
  public BerryDetail(
    @JsonProperty(required = true, value = "id") Integer id,
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "firmness") BerryFirmnessSummary firmness,
    @JsonProperty(required = true, value = "flavors") List<@Valid BerryFlavorMap> flavors,
    @JsonProperty(required = true, value = "item") ItemSummary item,
    @JsonProperty(required = true, value = "natural_gift_type") TypeSummary naturalGiftType
  ) {
    this.id = id;
    this.name = name;
    this.firmness = firmness;
    this.flavors = flavors;
    this.item = item;
    this.naturalGiftType = naturalGiftType;
  }

  /**
   * The identifier for this resource.
   **/
  public BerryDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The identifier for this resource.")
  @JsonProperty(required = true, value = "id")
  public Integer getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The name for this resource.
   **/
  public BerryDetail name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name for this resource.")
  @JsonProperty(required = true, value = "name")
  @NotNull  @Size(max=200)public String getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public BerryDetail growthTime(Integer growthTime) {
    this.growthTime = growthTime;
    return this;
  }

  
  @ApiModelProperty(value = "Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked.")
  @JsonProperty("growth_time")
   @Min(-2147483648) @Max(2147483647)public Integer getGrowthTime() {
    return growthTime;
  }

  @JsonProperty("growth_time")
  public void setGrowthTime(Integer growthTime) {
    this.growthTime = growthTime;
  }

  /**
   * The maximum number of these berries that can grow on one tree in Generation IV.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public BerryDetail maxHarvest(Integer maxHarvest) {
    this.maxHarvest = maxHarvest;
    return this;
  }

  
  @ApiModelProperty(value = "The maximum number of these berries that can grow on one tree in Generation IV.")
  @JsonProperty("max_harvest")
   @Min(-2147483648) @Max(2147483647)public Integer getMaxHarvest() {
    return maxHarvest;
  }

  @JsonProperty("max_harvest")
  public void setMaxHarvest(Integer maxHarvest) {
    this.maxHarvest = maxHarvest;
  }

  /**
   * The power of the move \&quot;Natural Gift\&quot; when used with this Berry.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public BerryDetail naturalGiftPower(Integer naturalGiftPower) {
    this.naturalGiftPower = naturalGiftPower;
    return this;
  }

  
  @ApiModelProperty(value = "The power of the move \"Natural Gift\" when used with this Berry.")
  @JsonProperty("natural_gift_power")
   @Min(-2147483648) @Max(2147483647)public Integer getNaturalGiftPower() {
    return naturalGiftPower;
  }

  @JsonProperty("natural_gift_power")
  public void setNaturalGiftPower(Integer naturalGiftPower) {
    this.naturalGiftPower = naturalGiftPower;
  }

  /**
   * The size of this Berry, in millimeters.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public BerryDetail size(Integer size) {
    this.size = size;
    return this;
  }

  
  @ApiModelProperty(value = "The size of this Berry, in millimeters.")
  @JsonProperty("size")
   @Min(-2147483648) @Max(2147483647)public Integer getSize() {
    return size;
  }

  @JsonProperty("size")
  public void setSize(Integer size) {
    this.size = size;
  }

  /**
   * The smoothness of this Berry, used in making Pokéblocks or Poffins.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public BerryDetail smoothness(Integer smoothness) {
    this.smoothness = smoothness;
    return this;
  }

  
  @ApiModelProperty(value = "The smoothness of this Berry, used in making Pokéblocks or Poffins.")
  @JsonProperty("smoothness")
   @Min(-2147483648) @Max(2147483647)public Integer getSmoothness() {
    return smoothness;
  }

  @JsonProperty("smoothness")
  public void setSmoothness(Integer smoothness) {
    this.smoothness = smoothness;
  }

  /**
   * The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public BerryDetail soilDryness(Integer soilDryness) {
    this.soilDryness = soilDryness;
    return this;
  }

  
  @ApiModelProperty(value = "The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly.")
  @JsonProperty("soil_dryness")
   @Min(-2147483648) @Max(2147483647)public Integer getSoilDryness() {
    return soilDryness;
  }

  @JsonProperty("soil_dryness")
  public void setSoilDryness(Integer soilDryness) {
    this.soilDryness = soilDryness;
  }

  /**
   * The firmness of this berry, used in making Pokéblocks or Poffins.
   **/
  public BerryDetail firmness(BerryFirmnessSummary firmness) {
    this.firmness = firmness;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The firmness of this berry, used in making Pokéblocks or Poffins.")
  @JsonProperty(required = true, value = "firmness")
  @NotNull @Valid public BerryFirmnessSummary getFirmness() {
    return firmness;
  }

  @JsonProperty(required = true, value = "firmness")
  public void setFirmness(BerryFirmnessSummary firmness) {
    this.firmness = firmness;
  }

  /**
   * A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry.
   **/
  public BerryDetail flavors(List<@Valid BerryFlavorMap> flavors) {
    this.flavors = flavors;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry.")
  @JsonProperty(required = true, value = "flavors")
  public List<@Valid BerryFlavorMap> getFlavors() {
    return flavors;
  }

  @JsonProperty(required = true, value = "flavors")
  public void setFlavors(List<@Valid BerryFlavorMap> flavors) {
    this.flavors = flavors;
  }

  public BerryDetail addFlavorsItem(BerryFlavorMap flavorsItem) {
    if (this.flavors == null) {
      this.flavors = new ArrayList<>();
    }

    this.flavors.add(flavorsItem);
    return this;
  }

  public BerryDetail removeFlavorsItem(BerryFlavorMap flavorsItem) {
    if (flavorsItem != null && this.flavors != null) {
      this.flavors.remove(flavorsItem);
    }

    return this;
  }
  /**
   * Berries are actually items. This is a reference to the item specific data for this berry.
   **/
  public BerryDetail item(ItemSummary item) {
    this.item = item;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Berries are actually items. This is a reference to the item specific data for this berry.")
  @JsonProperty(required = true, value = "item")
  @NotNull @Valid public ItemSummary getItem() {
    return item;
  }

  @JsonProperty(required = true, value = "item")
  public void setItem(ItemSummary item) {
    this.item = item;
  }

  /**
   * The type inherited by \&quot;Natural Gift\&quot; when used with this Berry.
   **/
  public BerryDetail naturalGiftType(TypeSummary naturalGiftType) {
    this.naturalGiftType = naturalGiftType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The type inherited by \"Natural Gift\" when used with this Berry.")
  @JsonProperty(required = true, value = "natural_gift_type")
  @NotNull @Valid public TypeSummary getNaturalGiftType() {
    return naturalGiftType;
  }

  @JsonProperty(required = true, value = "natural_gift_type")
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
