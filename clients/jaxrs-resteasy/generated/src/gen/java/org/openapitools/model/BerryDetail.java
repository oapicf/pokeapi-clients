package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-11-09T13:50:00.159999817Z[Etc/UTC]", comments = "Generator version: 7.26.0")
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

  /**
   * The identifier for this resource.
   **/
  
  @ApiModelProperty(required = true, value = "The identifier for this resource.")
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The name for this resource.
   **/
  
  @ApiModelProperty(required = true, value = "The name for this resource.")
  @JsonProperty("name")
  @NotNull
 @Size(max=200)  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  
  @ApiModelProperty(value = "Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked.")
  @JsonProperty("growth_time")
 @Min(-2147483648) @Max(2147483647)  public Integer getGrowthTime() {
    return growthTime;
  }
  public void setGrowthTime(Integer growthTime) {
    this.growthTime = growthTime;
  }

  /**
   * The maximum number of these berries that can grow on one tree in Generation IV.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  
  @ApiModelProperty(value = "The maximum number of these berries that can grow on one tree in Generation IV.")
  @JsonProperty("max_harvest")
 @Min(-2147483648) @Max(2147483647)  public Integer getMaxHarvest() {
    return maxHarvest;
  }
  public void setMaxHarvest(Integer maxHarvest) {
    this.maxHarvest = maxHarvest;
  }

  /**
   * The power of the move \&quot;Natural Gift\&quot; when used with this Berry.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  
  @ApiModelProperty(value = "The power of the move \"Natural Gift\" when used with this Berry.")
  @JsonProperty("natural_gift_power")
 @Min(-2147483648) @Max(2147483647)  public Integer getNaturalGiftPower() {
    return naturalGiftPower;
  }
  public void setNaturalGiftPower(Integer naturalGiftPower) {
    this.naturalGiftPower = naturalGiftPower;
  }

  /**
   * The size of this Berry, in millimeters.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  
  @ApiModelProperty(value = "The size of this Berry, in millimeters.")
  @JsonProperty("size")
 @Min(-2147483648) @Max(2147483647)  public Integer getSize() {
    return size;
  }
  public void setSize(Integer size) {
    this.size = size;
  }

  /**
   * The smoothness of this Berry, used in making Pokéblocks or Poffins.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  
  @ApiModelProperty(value = "The smoothness of this Berry, used in making Pokéblocks or Poffins.")
  @JsonProperty("smoothness")
 @Min(-2147483648) @Max(2147483647)  public Integer getSmoothness() {
    return smoothness;
  }
  public void setSmoothness(Integer smoothness) {
    this.smoothness = smoothness;
  }

  /**
   * The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  
  @ApiModelProperty(value = "The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly.")
  @JsonProperty("soil_dryness")
 @Min(-2147483648) @Max(2147483647)  public Integer getSoilDryness() {
    return soilDryness;
  }
  public void setSoilDryness(Integer soilDryness) {
    this.soilDryness = soilDryness;
  }

  /**
   * The firmness of this berry, used in making Pokéblocks or Poffins.
   **/
  
  @ApiModelProperty(required = true, value = "The firmness of this berry, used in making Pokéblocks or Poffins.")
  @JsonProperty("firmness")
  @NotNull
  @Valid
  public BerryFirmnessSummary getFirmness() {
    return firmness;
  }
  public void setFirmness(BerryFirmnessSummary firmness) {
    this.firmness = firmness;
  }

  /**
   * A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry.
   **/
  
  @ApiModelProperty(required = true, value = "A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry.")
  @JsonProperty("flavors")
  @NotNull
  public List<@Valid BerryFlavorMap> getFlavors() {
    return flavors;
  }
  public void setFlavors(List<@Valid BerryFlavorMap> flavors) {
    this.flavors = flavors;
  }

  /**
   * Berries are actually items. This is a reference to the item specific data for this berry.
   **/
  
  @ApiModelProperty(required = true, value = "Berries are actually items. This is a reference to the item specific data for this berry.")
  @JsonProperty("item")
  @NotNull
  @Valid
  public ItemSummary getItem() {
    return item;
  }
  public void setItem(ItemSummary item) {
    this.item = item;
  }

  /**
   * The type inherited by \&quot;Natural Gift\&quot; when used with this Berry.
   **/
  
  @ApiModelProperty(required = true, value = "The type inherited by \"Natural Gift\" when used with this Berry.")
  @JsonProperty("natural_gift_type")
  @NotNull
  @Valid
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

