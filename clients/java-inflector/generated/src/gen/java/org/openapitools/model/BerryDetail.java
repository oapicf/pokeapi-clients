package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BerryDetailFlavorsInner;
import org.openapitools.model.BerryFirmnessSummary;
import org.openapitools.model.ItemSummary;
import org.openapitools.model.TypeSummary;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-02-07T04:16:44.910526458Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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
  private List<BerryDetailFlavorsInner> flavors = new ArrayList<>();

  @JsonProperty("item")
  private ItemSummary item;

  @JsonProperty("natural_gift_type")
  private TypeSummary naturalGiftType;

  /**
   **/
  public BerryDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
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
  @JsonProperty("name")
  public String getName() {
    return name;
  }
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
  @JsonProperty("growth_time")
  public Integer getGrowthTime() {
    return growthTime;
  }
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
  @JsonProperty("max_harvest")
  public Integer getMaxHarvest() {
    return maxHarvest;
  }
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
  @JsonProperty("natural_gift_power")
  public Integer getNaturalGiftPower() {
    return naturalGiftPower;
  }
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
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }
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
  @JsonProperty("smoothness")
  public Integer getSmoothness() {
    return smoothness;
  }
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
  @JsonProperty("soil_dryness")
  public Integer getSoilDryness() {
    return soilDryness;
  }
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
  @JsonProperty("firmness")
  public BerryFirmnessSummary getFirmness() {
    return firmness;
  }
  public void setFirmness(BerryFirmnessSummary firmness) {
    this.firmness = firmness;
  }

  /**
   **/
  public BerryDetail flavors(List<BerryDetailFlavorsInner> flavors) {
    this.flavors = flavors;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("flavors")
  public List<BerryDetailFlavorsInner> getFlavors() {
    return flavors;
  }
  public void setFlavors(List<BerryDetailFlavorsInner> flavors) {
    this.flavors = flavors;
  }

  /**
   **/
  public BerryDetail item(ItemSummary item) {
    this.item = item;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("item")
  public ItemSummary getItem() {
    return item;
  }
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
  @JsonProperty("natural_gift_type")
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
    return Objects.equals(id, berryDetail.id) &&
        Objects.equals(name, berryDetail.name) &&
        Objects.equals(growthTime, berryDetail.growthTime) &&
        Objects.equals(maxHarvest, berryDetail.maxHarvest) &&
        Objects.equals(naturalGiftPower, berryDetail.naturalGiftPower) &&
        Objects.equals(size, berryDetail.size) &&
        Objects.equals(smoothness, berryDetail.smoothness) &&
        Objects.equals(soilDryness, berryDetail.soilDryness) &&
        Objects.equals(firmness, berryDetail.firmness) &&
        Objects.equals(flavors, berryDetail.flavors) &&
        Objects.equals(item, berryDetail.item) &&
        Objects.equals(naturalGiftType, berryDetail.naturalGiftType);
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

