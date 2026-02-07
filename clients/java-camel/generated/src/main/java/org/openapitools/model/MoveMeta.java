package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MoveMetaAilmentSummary;
import org.openapitools.model.MoveMetaCategorySummary;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * MoveMeta
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-02-07T04:17:25.266083787Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MoveMeta {

  private MoveMetaAilmentSummary ailment;

  private MoveMetaCategorySummary category;

  private JsonNullable<Integer> minHits = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> maxHits = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> minTurns = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> maxTurns = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> drain = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> healing = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> critRate = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> ailmentChance = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> flinchChance = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> statChance = JsonNullable.<Integer>undefined();

  public MoveMeta() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MoveMeta(MoveMetaAilmentSummary ailment, MoveMetaCategorySummary category) {
    this.ailment = ailment;
    this.category = category;
  }

  public MoveMeta ailment(MoveMetaAilmentSummary ailment) {
    this.ailment = ailment;
    return this;
  }

  /**
   * Get ailment
   * @return ailment
   */
  @NotNull @Valid 
  @Schema(name = "ailment", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ailment")
  public MoveMetaAilmentSummary getAilment() {
    return ailment;
  }

  public void setAilment(MoveMetaAilmentSummary ailment) {
    this.ailment = ailment;
  }

  public MoveMeta category(MoveMetaCategorySummary category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
   */
  @NotNull @Valid 
  @Schema(name = "category", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("category")
  public MoveMetaCategorySummary getCategory() {
    return category;
  }

  public void setCategory(MoveMetaCategorySummary category) {
    this.category = category;
  }

  public MoveMeta minHits(Integer minHits) {
    this.minHits = JsonNullable.of(minHits);
    return this;
  }

  /**
   * Get minHits
   * @return minHits
   */
  
  @Schema(name = "min_hits", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("min_hits")
  public JsonNullable<Integer> getMinHits() {
    return minHits;
  }

  public void setMinHits(JsonNullable<Integer> minHits) {
    this.minHits = minHits;
  }

  public MoveMeta maxHits(Integer maxHits) {
    this.maxHits = JsonNullable.of(maxHits);
    return this;
  }

  /**
   * Get maxHits
   * @return maxHits
   */
  
  @Schema(name = "max_hits", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("max_hits")
  public JsonNullable<Integer> getMaxHits() {
    return maxHits;
  }

  public void setMaxHits(JsonNullable<Integer> maxHits) {
    this.maxHits = maxHits;
  }

  public MoveMeta minTurns(Integer minTurns) {
    this.minTurns = JsonNullable.of(minTurns);
    return this;
  }

  /**
   * Get minTurns
   * @return minTurns
   */
  
  @Schema(name = "min_turns", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("min_turns")
  public JsonNullable<Integer> getMinTurns() {
    return minTurns;
  }

  public void setMinTurns(JsonNullable<Integer> minTurns) {
    this.minTurns = minTurns;
  }

  public MoveMeta maxTurns(Integer maxTurns) {
    this.maxTurns = JsonNullable.of(maxTurns);
    return this;
  }

  /**
   * Get maxTurns
   * @return maxTurns
   */
  
  @Schema(name = "max_turns", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("max_turns")
  public JsonNullable<Integer> getMaxTurns() {
    return maxTurns;
  }

  public void setMaxTurns(JsonNullable<Integer> maxTurns) {
    this.maxTurns = maxTurns;
  }

  public MoveMeta drain(Integer drain) {
    this.drain = JsonNullable.of(drain);
    return this;
  }

  /**
   * Get drain
   * @return drain
   */
  
  @Schema(name = "drain", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("drain")
  public JsonNullable<Integer> getDrain() {
    return drain;
  }

  public void setDrain(JsonNullable<Integer> drain) {
    this.drain = drain;
  }

  public MoveMeta healing(Integer healing) {
    this.healing = JsonNullable.of(healing);
    return this;
  }

  /**
   * Get healing
   * @return healing
   */
  
  @Schema(name = "healing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("healing")
  public JsonNullable<Integer> getHealing() {
    return healing;
  }

  public void setHealing(JsonNullable<Integer> healing) {
    this.healing = healing;
  }

  public MoveMeta critRate(Integer critRate) {
    this.critRate = JsonNullable.of(critRate);
    return this;
  }

  /**
   * Get critRate
   * @return critRate
   */
  
  @Schema(name = "crit_rate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("crit_rate")
  public JsonNullable<Integer> getCritRate() {
    return critRate;
  }

  public void setCritRate(JsonNullable<Integer> critRate) {
    this.critRate = critRate;
  }

  public MoveMeta ailmentChance(Integer ailmentChance) {
    this.ailmentChance = JsonNullable.of(ailmentChance);
    return this;
  }

  /**
   * Get ailmentChance
   * @return ailmentChance
   */
  
  @Schema(name = "ailment_chance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ailment_chance")
  public JsonNullable<Integer> getAilmentChance() {
    return ailmentChance;
  }

  public void setAilmentChance(JsonNullable<Integer> ailmentChance) {
    this.ailmentChance = ailmentChance;
  }

  public MoveMeta flinchChance(Integer flinchChance) {
    this.flinchChance = JsonNullable.of(flinchChance);
    return this;
  }

  /**
   * Get flinchChance
   * @return flinchChance
   */
  
  @Schema(name = "flinch_chance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flinch_chance")
  public JsonNullable<Integer> getFlinchChance() {
    return flinchChance;
  }

  public void setFlinchChance(JsonNullable<Integer> flinchChance) {
    this.flinchChance = flinchChance;
  }

  public MoveMeta statChance(Integer statChance) {
    this.statChance = JsonNullable.of(statChance);
    return this;
  }

  /**
   * Get statChance
   * @return statChance
   */
  
  @Schema(name = "stat_chance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stat_chance")
  public JsonNullable<Integer> getStatChance() {
    return statChance;
  }

  public void setStatChance(JsonNullable<Integer> statChance) {
    this.statChance = statChance;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoveMeta moveMeta = (MoveMeta) o;
    return Objects.equals(this.ailment, moveMeta.ailment) &&
        Objects.equals(this.category, moveMeta.category) &&
        equalsNullable(this.minHits, moveMeta.minHits) &&
        equalsNullable(this.maxHits, moveMeta.maxHits) &&
        equalsNullable(this.minTurns, moveMeta.minTurns) &&
        equalsNullable(this.maxTurns, moveMeta.maxTurns) &&
        equalsNullable(this.drain, moveMeta.drain) &&
        equalsNullable(this.healing, moveMeta.healing) &&
        equalsNullable(this.critRate, moveMeta.critRate) &&
        equalsNullable(this.ailmentChance, moveMeta.ailmentChance) &&
        equalsNullable(this.flinchChance, moveMeta.flinchChance) &&
        equalsNullable(this.statChance, moveMeta.statChance);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ailment, category, hashCodeNullable(minHits), hashCodeNullable(maxHits), hashCodeNullable(minTurns), hashCodeNullable(maxTurns), hashCodeNullable(drain), hashCodeNullable(healing), hashCodeNullable(critRate), hashCodeNullable(ailmentChance), hashCodeNullable(flinchChance), hashCodeNullable(statChance));
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
    sb.append("class MoveMeta {\n");
    sb.append("    ailment: ").append(toIndentedString(ailment)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    minHits: ").append(toIndentedString(minHits)).append("\n");
    sb.append("    maxHits: ").append(toIndentedString(maxHits)).append("\n");
    sb.append("    minTurns: ").append(toIndentedString(minTurns)).append("\n");
    sb.append("    maxTurns: ").append(toIndentedString(maxTurns)).append("\n");
    sb.append("    drain: ").append(toIndentedString(drain)).append("\n");
    sb.append("    healing: ").append(toIndentedString(healing)).append("\n");
    sb.append("    critRate: ").append(toIndentedString(critRate)).append("\n");
    sb.append("    ailmentChance: ").append(toIndentedString(ailmentChance)).append("\n");
    sb.append("    flinchChance: ").append(toIndentedString(flinchChance)).append("\n");
    sb.append("    statChance: ").append(toIndentedString(statChance)).append("\n");
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

