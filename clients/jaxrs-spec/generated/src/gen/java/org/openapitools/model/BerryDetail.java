package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BerryDetailFlavorsInner;
import org.openapitools.model.BerryFirmnessSummary;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T04:17:57.915073257Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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
  private @Valid List<@Valid BerryDetailFlavorsInner> flavors = new ArrayList<>();
  private ItemSummary item;
  private TypeSummary naturalGiftType;

  public BerryDetail() {
  }

  @JsonCreator
  public BerryDetail(
    @JsonProperty(required = true, value = "id") Integer id,
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "growth_time") Integer growthTime,
    @JsonProperty(required = true, value = "max_harvest") Integer maxHarvest,
    @JsonProperty(required = true, value = "natural_gift_power") Integer naturalGiftPower,
    @JsonProperty(required = true, value = "size") Integer size,
    @JsonProperty(required = true, value = "smoothness") Integer smoothness,
    @JsonProperty(required = true, value = "soil_dryness") Integer soilDryness,
    @JsonProperty(required = true, value = "firmness") BerryFirmnessSummary firmness,
    @JsonProperty(required = true, value = "flavors") List<@Valid BerryDetailFlavorsInner> flavors,
    @JsonProperty(required = true, value = "item") ItemSummary item,
    @JsonProperty(required = true, value = "natural_gift_type") TypeSummary naturalGiftType
  ) {
    this.id = id;
    this.name = name;
    this.growthTime = growthTime;
    this.maxHarvest = maxHarvest;
    this.naturalGiftPower = naturalGiftPower;
    this.size = size;
    this.smoothness = smoothness;
    this.soilDryness = soilDryness;
    this.firmness = firmness;
    this.flavors = flavors;
    this.item = item;
    this.naturalGiftType = naturalGiftType;
  }

  /**
   **/
  public BerryDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "id")
  public Integer getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  public BerryDetail name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "name")
  @NotNull  @Size(max=100)public String getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public BerryDetail growthTime(Integer growthTime) {
    this.growthTime = growthTime;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "growth_time")
  @NotNull public Integer getGrowthTime() {
    return growthTime;
  }

  @JsonProperty(required = true, value = "growth_time")
  public void setGrowthTime(Integer growthTime) {
    this.growthTime = growthTime;
  }

  /**
   **/
  public BerryDetail maxHarvest(Integer maxHarvest) {
    this.maxHarvest = maxHarvest;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "max_harvest")
  @NotNull public Integer getMaxHarvest() {
    return maxHarvest;
  }

  @JsonProperty(required = true, value = "max_harvest")
  public void setMaxHarvest(Integer maxHarvest) {
    this.maxHarvest = maxHarvest;
  }

  /**
   **/
  public BerryDetail naturalGiftPower(Integer naturalGiftPower) {
    this.naturalGiftPower = naturalGiftPower;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "natural_gift_power")
  @NotNull public Integer getNaturalGiftPower() {
    return naturalGiftPower;
  }

  @JsonProperty(required = true, value = "natural_gift_power")
  public void setNaturalGiftPower(Integer naturalGiftPower) {
    this.naturalGiftPower = naturalGiftPower;
  }

  /**
   **/
  public BerryDetail size(Integer size) {
    this.size = size;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "size")
  @NotNull public Integer getSize() {
    return size;
  }

  @JsonProperty(required = true, value = "size")
  public void setSize(Integer size) {
    this.size = size;
  }

  /**
   **/
  public BerryDetail smoothness(Integer smoothness) {
    this.smoothness = smoothness;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "smoothness")
  @NotNull public Integer getSmoothness() {
    return smoothness;
  }

  @JsonProperty(required = true, value = "smoothness")
  public void setSmoothness(Integer smoothness) {
    this.smoothness = smoothness;
  }

  /**
   **/
  public BerryDetail soilDryness(Integer soilDryness) {
    this.soilDryness = soilDryness;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "soil_dryness")
  @NotNull public Integer getSoilDryness() {
    return soilDryness;
  }

  @JsonProperty(required = true, value = "soil_dryness")
  public void setSoilDryness(Integer soilDryness) {
    this.soilDryness = soilDryness;
  }

  /**
   **/
  public BerryDetail firmness(BerryFirmnessSummary firmness) {
    this.firmness = firmness;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "firmness")
  @NotNull @Valid public BerryFirmnessSummary getFirmness() {
    return firmness;
  }

  @JsonProperty(required = true, value = "firmness")
  public void setFirmness(BerryFirmnessSummary firmness) {
    this.firmness = firmness;
  }

  /**
   **/
  public BerryDetail flavors(List<@Valid BerryDetailFlavorsInner> flavors) {
    this.flavors = flavors;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "flavors")
  @NotNull @Valid public List<@Valid BerryDetailFlavorsInner> getFlavors() {
    return flavors;
  }

  @JsonProperty(required = true, value = "flavors")
  public void setFlavors(List<@Valid BerryDetailFlavorsInner> flavors) {
    this.flavors = flavors;
  }

  public BerryDetail addFlavorsItem(BerryDetailFlavorsInner flavorsItem) {
    if (this.flavors == null) {
      this.flavors = new ArrayList<>();
    }

    this.flavors.add(flavorsItem);
    return this;
  }

  public BerryDetail removeFlavorsItem(BerryDetailFlavorsInner flavorsItem) {
    if (flavorsItem != null && this.flavors != null) {
      this.flavors.remove(flavorsItem);
    }

    return this;
  }
  /**
   **/
  public BerryDetail item(ItemSummary item) {
    this.item = item;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "item")
  @NotNull @Valid public ItemSummary getItem() {
    return item;
  }

  @JsonProperty(required = true, value = "item")
  public void setItem(ItemSummary item) {
    this.item = item;
  }

  /**
   **/
  public BerryDetail naturalGiftType(TypeSummary naturalGiftType) {
    this.naturalGiftType = naturalGiftType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

