package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MoveMetaAilmentSummary;
import org.openapitools.model.MoveMetaCategorySummary;
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
 * MoveMeta
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-09T13:53:47.069318184Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class MoveMeta {

  private MoveMetaAilmentSummary ailment;

  private MoveMetaCategorySummary category;

  private JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> minHits = JsonNullable.<Integer>undefined();

  private JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> maxHits = JsonNullable.<Integer>undefined();

  private JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> minTurns = JsonNullable.<Integer>undefined();

  private JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> maxTurns = JsonNullable.<Integer>undefined();

  private JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> drain = JsonNullable.<Integer>undefined();

  private JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> healing = JsonNullable.<Integer>undefined();

  private JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> critRate = JsonNullable.<Integer>undefined();

  private JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> ailmentChance = JsonNullable.<Integer>undefined();

  private JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> flinchChance = JsonNullable.<Integer>undefined();

  private JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> statChance = JsonNullable.<Integer>undefined();

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
   * The status ailment this move inflicts on its target.
   * @return ailment
   */
  @NotNull @Valid 
  @Schema(name = "ailment", description = "The status ailment this move inflicts on its target.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ailment")
  public MoveMetaAilmentSummary getAilment() {
    return ailment;
  }

  @JsonProperty("ailment")
  public void setAilment(MoveMetaAilmentSummary ailment) {
    this.ailment = ailment;
  }

  public MoveMeta category(MoveMetaCategorySummary category) {
    this.category = category;
    return this;
  }

  /**
   * The category of move this move falls under, e.g. damage or ailment.
   * @return category
   */
  @NotNull @Valid 
  @Schema(name = "category", description = "The category of move this move falls under, e.g. damage or ailment.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("category")
  public MoveMetaCategorySummary getCategory() {
    return category;
  }

  @JsonProperty("category")
  public void setCategory(MoveMetaCategorySummary category) {
    this.category = category;
  }

  public MoveMeta minHits(Integer minHits) {
    this.minHits = JsonNullable.of(minHits);
    return this;
  }

  /**
   * The minimum number of times this move hits. Null if it always only hits once.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return minHits
   */
  @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "min_hits", description = "The minimum number of times this move hits. Null if it always only hits once.", requiredMode = Schema.RequiredMode.NOT_REQUIRED, nullable = true)
  @JsonProperty("min_hits")
  public JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> getMinHits() {
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
   * The maximum number of times this move hits. Null if it always only hits once.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return maxHits
   */
  @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "max_hits", description = "The maximum number of times this move hits. Null if it always only hits once.", requiredMode = Schema.RequiredMode.NOT_REQUIRED, nullable = true)
  @JsonProperty("max_hits")
  public JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> getMaxHits() {
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
   * The minimum number of turns this move continues to take effect. Null if it always only lasts one turn.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return minTurns
   */
  @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "min_turns", description = "The minimum number of turns this move continues to take effect. Null if it always only lasts one turn.", requiredMode = Schema.RequiredMode.NOT_REQUIRED, nullable = true)
  @JsonProperty("min_turns")
  public JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> getMinTurns() {
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
   * The maximum number of turns this move continues to take effect. Null if it always only lasts one turn.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return maxTurns
   */
  @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "max_turns", description = "The maximum number of turns this move continues to take effect. Null if it always only lasts one turn.", requiredMode = Schema.RequiredMode.NOT_REQUIRED, nullable = true)
  @JsonProperty("max_turns")
  public JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> getMaxTurns() {
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
   * HP drain (if positive) or Recoil damage (if negative), in percent of damage done.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return drain
   */
  @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "drain", description = "HP drain (if positive) or Recoil damage (if negative), in percent of damage done.", requiredMode = Schema.RequiredMode.NOT_REQUIRED, nullable = true)
  @JsonProperty("drain")
  public JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> getDrain() {
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
   * The amount of hp gained by the attacking Pokemon, in percent of it's maximum HP.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return healing
   */
  @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "healing", description = "The amount of hp gained by the attacking Pokemon, in percent of it's maximum HP.", requiredMode = Schema.RequiredMode.NOT_REQUIRED, nullable = true)
  @JsonProperty("healing")
  public JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> getHealing() {
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
   * Critical hit rate bonus.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return critRate
   */
  @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "crit_rate", description = "Critical hit rate bonus.", requiredMode = Schema.RequiredMode.NOT_REQUIRED, nullable = true)
  @JsonProperty("crit_rate")
  public JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> getCritRate() {
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
   * The likelihood this attack will cause an ailment.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return ailmentChance
   */
  @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "ailment_chance", description = "The likelihood this attack will cause an ailment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED, nullable = true)
  @JsonProperty("ailment_chance")
  public JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> getAilmentChance() {
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
   * The likelihood this attack will cause the target Pokémon to flinch.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return flinchChance
   */
  @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "flinch_chance", description = "The likelihood this attack will cause the target Pokémon to flinch.", requiredMode = Schema.RequiredMode.NOT_REQUIRED, nullable = true)
  @JsonProperty("flinch_chance")
  public JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> getFlinchChance() {
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
   * The likelihood this attack will cause a stat change in the target Pokémon.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return statChance
   */
  @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "stat_chance", description = "The likelihood this attack will cause a stat change in the target Pokémon.", requiredMode = Schema.RequiredMode.NOT_REQUIRED, nullable = true)
  @JsonProperty("stat_chance")
  public JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> getStatChance() {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

