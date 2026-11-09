package apimodels;

import apimodels.BerryFirmnessSummary;
import apimodels.BerryFlavorMap;
import apimodels.ItemSummary;
import apimodels.TypeSummary;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * BerryDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BerryDetail   {
  @JsonProperty("id")
  @NotNull

  private Integer id;

  @JsonProperty("name")
  @NotNull
@Size(max=200)

  private String name;

  @JsonProperty("growth_time")
  @Min(-2147483648)
@Max(2147483647)

  private Integer growthTime;

  @JsonProperty("max_harvest")
  @Min(-2147483648)
@Max(2147483647)

  private Integer maxHarvest;

  @JsonProperty("natural_gift_power")
  @Min(-2147483648)
@Max(2147483647)

  private Integer naturalGiftPower;

  @JsonProperty("size")
  @Min(-2147483648)
@Max(2147483647)

  private Integer size;

  @JsonProperty("smoothness")
  @Min(-2147483648)
@Max(2147483647)

  private Integer smoothness;

  @JsonProperty("soil_dryness")
  @Min(-2147483648)
@Max(2147483647)

  private Integer soilDryness;

  @JsonProperty("firmness")
  @NotNull
@Valid

  private BerryFirmnessSummary firmness;

  @JsonProperty("flavors")
  @NotNull
@Valid

  private List<@Valid BerryFlavorMap> flavors = new ArrayList<>();

  @JsonProperty("item")
  @NotNull
@Valid

  private ItemSummary item;

  @JsonProperty("natural_gift_type")
  @NotNull
@Valid

  private TypeSummary naturalGiftType;

  public BerryDetail id(Integer id) {
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

  public BerryDetail name(String name) {
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

  public BerryDetail growthTime(Integer growthTime) {
    this.growthTime = growthTime;
    return this;
  }

   /**
   * Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return growthTime
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
  public BerryFirmnessSummary getFirmness() {
    return firmness;
  }

  public void setFirmness(BerryFirmnessSummary firmness) {
    this.firmness = firmness;
  }

  public BerryDetail flavors(List<@Valid BerryFlavorMap> flavors) {
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
  **/
  public List<@Valid BerryFlavorMap> getFlavors() {
    return flavors;
  }

  public void setFlavors(List<@Valid BerryFlavorMap> flavors) {
    this.flavors = flavors;
  }

  public BerryDetail item(ItemSummary item) {
    this.item = item;
    return this;
  }

   /**
   * Berries are actually items. This is a reference to the item specific data for this berry.
   * @return item
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

