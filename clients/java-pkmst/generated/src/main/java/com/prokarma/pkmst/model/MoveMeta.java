package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.MoveMetaAilmentSummary;
import com.prokarma.pkmst.model.MoveMetaCategorySummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * MoveMeta
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-11-09T13:49:28.343088631Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class MoveMeta   {
  @JsonProperty("ailment")
  private MoveMetaAilmentSummary ailment;

  @JsonProperty("category")
  private MoveMetaCategorySummary category;

  @JsonProperty("min_hits")
  private Integer minHits;

  @JsonProperty("max_hits")
  private Integer maxHits;

  @JsonProperty("min_turns")
  private Integer minTurns;

  @JsonProperty("max_turns")
  private Integer maxTurns;

  @JsonProperty("drain")
  private Integer drain;

  @JsonProperty("healing")
  private Integer healing;

  @JsonProperty("crit_rate")
  private Integer critRate;

  @JsonProperty("ailment_chance")
  private Integer ailmentChance;

  @JsonProperty("flinch_chance")
  private Integer flinchChance;

  @JsonProperty("stat_chance")
  private Integer statChance;

  public MoveMeta ailment(MoveMetaAilmentSummary ailment) {
    this.ailment = ailment;
    return this;
  }

  /**
   * The status ailment this move inflicts on its target.
   * @return ailment
   */
  @ApiModelProperty(required = true, value = "The status ailment this move inflicts on its target.")
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
   * The category of move this move falls under, e.g. damage or ailment.
   * @return category
   */
  @ApiModelProperty(required = true, value = "The category of move this move falls under, e.g. damage or ailment.")
  public MoveMetaCategorySummary getCategory() {
    return category;
  }

  public void setCategory(MoveMetaCategorySummary category) {
    this.category = category;
  }

  public MoveMeta minHits(Integer minHits) {
    this.minHits = minHits;
    return this;
  }

  /**
   * The minimum number of times this move hits. Null if it always only hits once.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return minHits
   */
  @ApiModelProperty(value = "The minimum number of times this move hits. Null if it always only hits once.")
  public Integer getMinHits() {
    return minHits;
  }

  public void setMinHits(Integer minHits) {
    this.minHits = minHits;
  }

  public MoveMeta maxHits(Integer maxHits) {
    this.maxHits = maxHits;
    return this;
  }

  /**
   * The maximum number of times this move hits. Null if it always only hits once.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return maxHits
   */
  @ApiModelProperty(value = "The maximum number of times this move hits. Null if it always only hits once.")
  public Integer getMaxHits() {
    return maxHits;
  }

  public void setMaxHits(Integer maxHits) {
    this.maxHits = maxHits;
  }

  public MoveMeta minTurns(Integer minTurns) {
    this.minTurns = minTurns;
    return this;
  }

  /**
   * The minimum number of turns this move continues to take effect. Null if it always only lasts one turn.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return minTurns
   */
  @ApiModelProperty(value = "The minimum number of turns this move continues to take effect. Null if it always only lasts one turn.")
  public Integer getMinTurns() {
    return minTurns;
  }

  public void setMinTurns(Integer minTurns) {
    this.minTurns = minTurns;
  }

  public MoveMeta maxTurns(Integer maxTurns) {
    this.maxTurns = maxTurns;
    return this;
  }

  /**
   * The maximum number of turns this move continues to take effect. Null if it always only lasts one turn.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return maxTurns
   */
  @ApiModelProperty(value = "The maximum number of turns this move continues to take effect. Null if it always only lasts one turn.")
  public Integer getMaxTurns() {
    return maxTurns;
  }

  public void setMaxTurns(Integer maxTurns) {
    this.maxTurns = maxTurns;
  }

  public MoveMeta drain(Integer drain) {
    this.drain = drain;
    return this;
  }

  /**
   * HP drain (if positive) or Recoil damage (if negative), in percent of damage done.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return drain
   */
  @ApiModelProperty(value = "HP drain (if positive) or Recoil damage (if negative), in percent of damage done.")
  public Integer getDrain() {
    return drain;
  }

  public void setDrain(Integer drain) {
    this.drain = drain;
  }

  public MoveMeta healing(Integer healing) {
    this.healing = healing;
    return this;
  }

  /**
   * The amount of hp gained by the attacking Pokemon, in percent of it's maximum HP.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return healing
   */
  @ApiModelProperty(value = "The amount of hp gained by the attacking Pokemon, in percent of it's maximum HP.")
  public Integer getHealing() {
    return healing;
  }

  public void setHealing(Integer healing) {
    this.healing = healing;
  }

  public MoveMeta critRate(Integer critRate) {
    this.critRate = critRate;
    return this;
  }

  /**
   * Critical hit rate bonus.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return critRate
   */
  @ApiModelProperty(value = "Critical hit rate bonus.")
  public Integer getCritRate() {
    return critRate;
  }

  public void setCritRate(Integer critRate) {
    this.critRate = critRate;
  }

  public MoveMeta ailmentChance(Integer ailmentChance) {
    this.ailmentChance = ailmentChance;
    return this;
  }

  /**
   * The likelihood this attack will cause an ailment.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return ailmentChance
   */
  @ApiModelProperty(value = "The likelihood this attack will cause an ailment.")
  public Integer getAilmentChance() {
    return ailmentChance;
  }

  public void setAilmentChance(Integer ailmentChance) {
    this.ailmentChance = ailmentChance;
  }

  public MoveMeta flinchChance(Integer flinchChance) {
    this.flinchChance = flinchChance;
    return this;
  }

  /**
   * The likelihood this attack will cause the target Pokémon to flinch.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return flinchChance
   */
  @ApiModelProperty(value = "The likelihood this attack will cause the target Pokémon to flinch.")
  public Integer getFlinchChance() {
    return flinchChance;
  }

  public void setFlinchChance(Integer flinchChance) {
    this.flinchChance = flinchChance;
  }

  public MoveMeta statChance(Integer statChance) {
    this.statChance = statChance;
    return this;
  }

  /**
   * The likelihood this attack will cause a stat change in the target Pokémon.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return statChance
   */
  @ApiModelProperty(value = "The likelihood this attack will cause a stat change in the target Pokémon.")
  public Integer getStatChance() {
    return statChance;
  }

  public void setStatChance(Integer statChance) {
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
        Objects.equals(this.minHits, moveMeta.minHits) &&
        Objects.equals(this.maxHits, moveMeta.maxHits) &&
        Objects.equals(this.minTurns, moveMeta.minTurns) &&
        Objects.equals(this.maxTurns, moveMeta.maxTurns) &&
        Objects.equals(this.drain, moveMeta.drain) &&
        Objects.equals(this.healing, moveMeta.healing) &&
        Objects.equals(this.critRate, moveMeta.critRate) &&
        Objects.equals(this.ailmentChance, moveMeta.ailmentChance) &&
        Objects.equals(this.flinchChance, moveMeta.flinchChance) &&
        Objects.equals(this.statChance, moveMeta.statChance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ailment, category, minHits, maxHits, minTurns, maxTurns, drain, healing, critRate, ailmentChance, flinchChance, statChance);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

