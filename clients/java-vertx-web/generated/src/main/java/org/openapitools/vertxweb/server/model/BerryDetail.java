package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.BerryDetailFlavorsInner;
import org.openapitools.vertxweb.server.model.BerryFirmnessSummary;
import org.openapitools.vertxweb.server.model.ItemSummary;
import org.openapitools.vertxweb.server.model.TypeSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
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
  private List<BerryDetailFlavorsInner> flavors = new ArrayList<>();
  private ItemSummary item;
  private TypeSummary naturalGiftType;

  public BerryDetail () {

  }

  public BerryDetail (Integer id, String name, Integer growthTime, Integer maxHarvest, Integer naturalGiftPower, Integer size, Integer smoothness, Integer soilDryness, BerryFirmnessSummary firmness, List<BerryDetailFlavorsInner> flavors, ItemSummary item, TypeSummary naturalGiftType) {
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

    
  @JsonProperty("growth_time")
  public Integer getGrowthTime() {
    return growthTime;
  }
  public void setGrowthTime(Integer growthTime) {
    this.growthTime = growthTime;
  }

    
  @JsonProperty("max_harvest")
  public Integer getMaxHarvest() {
    return maxHarvest;
  }
  public void setMaxHarvest(Integer maxHarvest) {
    this.maxHarvest = maxHarvest;
  }

    
  @JsonProperty("natural_gift_power")
  public Integer getNaturalGiftPower() {
    return naturalGiftPower;
  }
  public void setNaturalGiftPower(Integer naturalGiftPower) {
    this.naturalGiftPower = naturalGiftPower;
  }

    
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }
  public void setSize(Integer size) {
    this.size = size;
  }

    
  @JsonProperty("smoothness")
  public Integer getSmoothness() {
    return smoothness;
  }
  public void setSmoothness(Integer smoothness) {
    this.smoothness = smoothness;
  }

    
  @JsonProperty("soil_dryness")
  public Integer getSoilDryness() {
    return soilDryness;
  }
  public void setSoilDryness(Integer soilDryness) {
    this.soilDryness = soilDryness;
  }

    
  @JsonProperty("firmness")
  public BerryFirmnessSummary getFirmness() {
    return firmness;
  }
  public void setFirmness(BerryFirmnessSummary firmness) {
    this.firmness = firmness;
  }

    
  @JsonProperty("flavors")
  public List<BerryDetailFlavorsInner> getFlavors() {
    return flavors;
  }
  public void setFlavors(List<BerryDetailFlavorsInner> flavors) {
    this.flavors = flavors;
  }

    
  @JsonProperty("item")
  public ItemSummary getItem() {
    return item;
  }
  public void setItem(ItemSummary item) {
    this.item = item;
  }

    
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
