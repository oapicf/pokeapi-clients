package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BerryFirmnessSummary;
import org.openapitools.model.BerryFlavorMap;
import org.openapitools.model.ItemSummary;
import org.openapitools.model.TypeSummary;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * BerryDetail
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-09T13:53:47.069318184Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class BerryDetail {

  private Integer id;

  private String name;

  private JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> growthTime = JsonNullable.<Integer>undefined();

  private JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> maxHarvest = JsonNullable.<Integer>undefined();

  private JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> naturalGiftPower = JsonNullable.<Integer>undefined();

  private JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> size = JsonNullable.<Integer>undefined();

  private JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> smoothness = JsonNullable.<Integer>undefined();

  private JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> soilDryness = JsonNullable.<Integer>undefined();

  private JsonNullable<BerryFirmnessSummary> firmness = JsonNullable.<BerryFirmnessSummary>undefined();

  private List<@Valid BerryFlavorMap> flavors = new ArrayList<>();

  private ItemSummary item;

  private JsonNullable<TypeSummary> naturalGiftType = JsonNullable.<TypeSummary>undefined();

  public BerryDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BerryDetail(Integer id, String name, BerryFirmnessSummary firmness, List<@Valid BerryFlavorMap> flavors, ItemSummary item, TypeSummary naturalGiftType) {
    this.id = id;
    this.name = name;
    this.firmness = JsonNullable.of(firmness);
    this.flavors = flavors;
    this.item = item;
    this.naturalGiftType = JsonNullable.of(naturalGiftType);
  }

  public BerryDetail id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The identifier for this resource.
   * @return id
   */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The identifier for this resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  @JsonProperty("id")
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
  @NotNull @Size(max = 200) 
  @Schema(name = "name", description = "The name for this resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  public BerryDetail growthTime(Integer growthTime) {
    this.growthTime = JsonNullable.of(growthTime);
    return this;
  }

  /**
   * Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return growthTime
   */
  @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "growth_time", description = "Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked.", requiredMode = Schema.RequiredMode.NOT_REQUIRED, nullable = true)
  @JsonProperty("growth_time")
  public JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> getGrowthTime() {
    return growthTime;
  }

  public void setGrowthTime(JsonNullable<Integer> growthTime) {
    this.growthTime = growthTime;
  }

  public BerryDetail maxHarvest(Integer maxHarvest) {
    this.maxHarvest = JsonNullable.of(maxHarvest);
    return this;
  }

  /**
   * The maximum number of these berries that can grow on one tree in Generation IV.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return maxHarvest
   */
  @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "max_harvest", description = "The maximum number of these berries that can grow on one tree in Generation IV.", requiredMode = Schema.RequiredMode.NOT_REQUIRED, nullable = true)
  @JsonProperty("max_harvest")
  public JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> getMaxHarvest() {
    return maxHarvest;
  }

  public void setMaxHarvest(JsonNullable<Integer> maxHarvest) {
    this.maxHarvest = maxHarvest;
  }

  public BerryDetail naturalGiftPower(Integer naturalGiftPower) {
    this.naturalGiftPower = JsonNullable.of(naturalGiftPower);
    return this;
  }

  /**
   * The power of the move \"Natural Gift\" when used with this Berry.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return naturalGiftPower
   */
  @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "natural_gift_power", description = "The power of the move \"Natural Gift\" when used with this Berry.", requiredMode = Schema.RequiredMode.NOT_REQUIRED, nullable = true)
  @JsonProperty("natural_gift_power")
  public JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> getNaturalGiftPower() {
    return naturalGiftPower;
  }

  public void setNaturalGiftPower(JsonNullable<Integer> naturalGiftPower) {
    this.naturalGiftPower = naturalGiftPower;
  }

  public BerryDetail size(Integer size) {
    this.size = JsonNullable.of(size);
    return this;
  }

  /**
   * The size of this Berry, in millimeters.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return size
   */
  @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "size", description = "The size of this Berry, in millimeters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED, nullable = true)
  @JsonProperty("size")
  public JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> getSize() {
    return size;
  }

  public void setSize(JsonNullable<Integer> size) {
    this.size = size;
  }

  public BerryDetail smoothness(Integer smoothness) {
    this.smoothness = JsonNullable.of(smoothness);
    return this;
  }

  /**
   * The smoothness of this Berry, used in making Pokéblocks or Poffins.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return smoothness
   */
  @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "smoothness", description = "The smoothness of this Berry, used in making Pokéblocks or Poffins.", requiredMode = Schema.RequiredMode.NOT_REQUIRED, nullable = true)
  @JsonProperty("smoothness")
  public JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> getSmoothness() {
    return smoothness;
  }

  public void setSmoothness(JsonNullable<Integer> smoothness) {
    this.smoothness = smoothness;
  }

  public BerryDetail soilDryness(Integer soilDryness) {
    this.soilDryness = JsonNullable.of(soilDryness);
    return this;
  }

  /**
   * The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return soilDryness
   */
  @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "soil_dryness", description = "The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly.", requiredMode = Schema.RequiredMode.NOT_REQUIRED, nullable = true)
  @JsonProperty("soil_dryness")
  public JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> getSoilDryness() {
    return soilDryness;
  }

  public void setSoilDryness(JsonNullable<Integer> soilDryness) {
    this.soilDryness = soilDryness;
  }

  public BerryDetail firmness(BerryFirmnessSummary firmness) {
    this.firmness = JsonNullable.of(firmness);
    return this;
  }

  /**
   * The firmness of this berry, used in making Pokéblocks or Poffins.
   * @return firmness
   */
  /* @Present */ @Valid 
  @Schema(name = "firmness", description = "The firmness of this berry, used in making Pokéblocks or Poffins.", requiredMode = Schema.RequiredMode.REQUIRED, nullable = true)
  @JsonProperty("firmness")
  public JsonNullable<BerryFirmnessSummary> getFirmness() {
    return firmness;
  }

  @JsonProperty("firmness")
  public void setFirmness(JsonNullable<BerryFirmnessSummary> firmness) {
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
   */
  
  @Schema(name = "flavors", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("flavors")
  public List<@Valid BerryFlavorMap> getFlavors() {
    return flavors;
  }

  @JsonProperty("flavors")
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
   */
  @NotNull @Valid 
  @Schema(name = "item", description = "Berries are actually items. This is a reference to the item specific data for this berry.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("item")
  public ItemSummary getItem() {
    return item;
  }

  @JsonProperty("item")
  public void setItem(ItemSummary item) {
    this.item = item;
  }

  public BerryDetail naturalGiftType(TypeSummary naturalGiftType) {
    this.naturalGiftType = JsonNullable.of(naturalGiftType);
    return this;
  }

  /**
   * The type inherited by \"Natural Gift\" when used with this Berry.
   * @return naturalGiftType
   */
  /* @Present */ @Valid 
  @Schema(name = "natural_gift_type", description = "The type inherited by \"Natural Gift\" when used with this Berry.", requiredMode = Schema.RequiredMode.REQUIRED, nullable = true)
  @JsonProperty("natural_gift_type")
  public JsonNullable<TypeSummary> getNaturalGiftType() {
    return naturalGiftType;
  }

  @JsonProperty("natural_gift_type")
  public void setNaturalGiftType(JsonNullable<TypeSummary> naturalGiftType) {
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
        equalsNullable(this.growthTime, berryDetail.growthTime) &&
        equalsNullable(this.maxHarvest, berryDetail.maxHarvest) &&
        equalsNullable(this.naturalGiftPower, berryDetail.naturalGiftPower) &&
        equalsNullable(this.size, berryDetail.size) &&
        equalsNullable(this.smoothness, berryDetail.smoothness) &&
        equalsNullable(this.soilDryness, berryDetail.soilDryness) &&
        Objects.equals(this.firmness, berryDetail.firmness) &&
        Objects.equals(this.flavors, berryDetail.flavors) &&
        Objects.equals(this.item, berryDetail.item) &&
        Objects.equals(this.naturalGiftType, berryDetail.naturalGiftType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, hashCodeNullable(growthTime), hashCodeNullable(maxHarvest), hashCodeNullable(naturalGiftPower), hashCodeNullable(size), hashCodeNullable(smoothness), hashCodeNullable(soilDryness), firmness, flavors, item, naturalGiftType);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

