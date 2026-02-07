package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BerryDetailFlavorsInner;
import org.openapitools.model.BerryFirmnessSummary;
import org.openapitools.model.ItemSummary;
import org.openapitools.model.TypeSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BerryDetail  {
  
  @ApiModelProperty(required = true, value = "")
  private Integer id;

  @ApiModelProperty(required = true, value = "")
  private String name;

  @ApiModelProperty(required = true, value = "")
  private Integer growthTime;

  @ApiModelProperty(required = true, value = "")
  private Integer maxHarvest;

  @ApiModelProperty(required = true, value = "")
  private Integer naturalGiftPower;

  @ApiModelProperty(required = true, value = "")
  private Integer size;

  @ApiModelProperty(required = true, value = "")
  private Integer smoothness;

  @ApiModelProperty(required = true, value = "")
  private Integer soilDryness;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private BerryFirmnessSummary firmness;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid BerryDetailFlavorsInner> flavors = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private ItemSummary item;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private TypeSummary naturalGiftType;
 /**
  * Get id
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
  * Get name
  * @return name
  */
  @JsonProperty("name")
  @NotNull
 @Size(max=100)  public String getName() {
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
  * Get growthTime
  * @return growthTime
  */
  @JsonProperty("growth_time")
  @NotNull
  public Integer getGrowthTime() {
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
  * Get maxHarvest
  * @return maxHarvest
  */
  @JsonProperty("max_harvest")
  @NotNull
  public Integer getMaxHarvest() {
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
  * Get naturalGiftPower
  * @return naturalGiftPower
  */
  @JsonProperty("natural_gift_power")
  @NotNull
  public Integer getNaturalGiftPower() {
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
  * Get size
  * @return size
  */
  @JsonProperty("size")
  @NotNull
  public Integer getSize() {
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
  * Get smoothness
  * @return smoothness
  */
  @JsonProperty("smoothness")
  @NotNull
  public Integer getSmoothness() {
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
  * Get soilDryness
  * @return soilDryness
  */
  @JsonProperty("soil_dryness")
  @NotNull
  public Integer getSoilDryness() {
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
  * Get firmness
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
  * Get flavors
  * @return flavors
  */
  @JsonProperty("flavors")
  @NotNull
  public List<@Valid BerryDetailFlavorsInner> getFlavors() {
    return flavors;
  }

  /**
   * Sets the <code>flavors</code> property.
   */
 public void setFlavors(List<@Valid BerryDetailFlavorsInner> flavors) {
    this.flavors = flavors;
  }

  /**
   * Sets the <code>flavors</code> property.
   */
  public BerryDetail flavors(List<@Valid BerryDetailFlavorsInner> flavors) {
    this.flavors = flavors;
    return this;
  }

  /**
   * Adds a new item to the <code>flavors</code> list.
   */
  public BerryDetail addFlavorsItem(BerryDetailFlavorsInner flavorsItem) {
    this.flavors.add(flavorsItem);
    return this;
  }

 /**
  * Get item
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
  * Get naturalGiftType
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

