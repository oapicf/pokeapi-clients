package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MoveMetaAilmentSummary;
import org.openapitools.model.MoveMetaCategorySummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MoveMeta  {
  
 /**
  * The status ailment this move inflicts on its target.
  */
  @ApiModelProperty(required = true, value = "The status ailment this move inflicts on its target.")
  @Valid
  private MoveMetaAilmentSummary ailment;

 /**
  * The category of move this move falls under, e.g. damage or ailment.
  */
  @ApiModelProperty(required = true, value = "The category of move this move falls under, e.g. damage or ailment.")
  @Valid
  private MoveMetaCategorySummary category;

 /**
  * The minimum number of times this move hits. Null if it always only hits once.
  */
  @ApiModelProperty(value = "The minimum number of times this move hits. Null if it always only hits once.")
  private Integer minHits;

 /**
  * The maximum number of times this move hits. Null if it always only hits once.
  */
  @ApiModelProperty(value = "The maximum number of times this move hits. Null if it always only hits once.")
  private Integer maxHits;

 /**
  * The minimum number of turns this move continues to take effect. Null if it always only lasts one turn.
  */
  @ApiModelProperty(value = "The minimum number of turns this move continues to take effect. Null if it always only lasts one turn.")
  private Integer minTurns;

 /**
  * The maximum number of turns this move continues to take effect. Null if it always only lasts one turn.
  */
  @ApiModelProperty(value = "The maximum number of turns this move continues to take effect. Null if it always only lasts one turn.")
  private Integer maxTurns;

 /**
  * HP drain (if positive) or Recoil damage (if negative), in percent of damage done.
  */
  @ApiModelProperty(value = "HP drain (if positive) or Recoil damage (if negative), in percent of damage done.")
  private Integer drain;

 /**
  * The amount of hp gained by the attacking Pokemon, in percent of it's maximum HP.
  */
  @ApiModelProperty(value = "The amount of hp gained by the attacking Pokemon, in percent of it's maximum HP.")
  private Integer healing;

 /**
  * Critical hit rate bonus.
  */
  @ApiModelProperty(value = "Critical hit rate bonus.")
  private Integer critRate;

 /**
  * The likelihood this attack will cause an ailment.
  */
  @ApiModelProperty(value = "The likelihood this attack will cause an ailment.")
  private Integer ailmentChance;

 /**
  * The likelihood this attack will cause the target Pokémon to flinch.
  */
  @ApiModelProperty(value = "The likelihood this attack will cause the target Pokémon to flinch.")
  private Integer flinchChance;

 /**
  * The likelihood this attack will cause a stat change in the target Pokémon.
  */
  @ApiModelProperty(value = "The likelihood this attack will cause a stat change in the target Pokémon.")
  private Integer statChance;
 /**
  * The status ailment this move inflicts on its target.
  * @return ailment
  */
  @JsonProperty("ailment")
  @NotNull
  public MoveMetaAilmentSummary getAilment() {
    return ailment;
  }

  /**
   * Sets the <code>ailment</code> property.
   */
 public void setAilment(MoveMetaAilmentSummary ailment) {
    this.ailment = ailment;
  }

  /**
   * Sets the <code>ailment</code> property.
   */
  public MoveMeta ailment(MoveMetaAilmentSummary ailment) {
    this.ailment = ailment;
    return this;
  }

 /**
  * The category of move this move falls under, e.g. damage or ailment.
  * @return category
  */
  @JsonProperty("category")
  @NotNull
  public MoveMetaCategorySummary getCategory() {
    return category;
  }

  /**
   * Sets the <code>category</code> property.
   */
 public void setCategory(MoveMetaCategorySummary category) {
    this.category = category;
  }

  /**
   * Sets the <code>category</code> property.
   */
  public MoveMeta category(MoveMetaCategorySummary category) {
    this.category = category;
    return this;
  }

 /**
  * The minimum number of times this move hits. Null if it always only hits once.
  * minimum: -2147483648
  * maximum: 2147483647
  * @return minHits
  */
  @JsonProperty("min_hits")
 @Min(-2147483648) @Max(2147483647)  public Integer getMinHits() {
    return minHits;
  }

  /**
   * Sets the <code>minHits</code> property.
   */
 public void setMinHits(Integer minHits) {
    this.minHits = minHits;
  }

  /**
   * Sets the <code>minHits</code> property.
   */
  public MoveMeta minHits(Integer minHits) {
    this.minHits = minHits;
    return this;
  }

 /**
  * The maximum number of times this move hits. Null if it always only hits once.
  * minimum: -2147483648
  * maximum: 2147483647
  * @return maxHits
  */
  @JsonProperty("max_hits")
 @Min(-2147483648) @Max(2147483647)  public Integer getMaxHits() {
    return maxHits;
  }

  /**
   * Sets the <code>maxHits</code> property.
   */
 public void setMaxHits(Integer maxHits) {
    this.maxHits = maxHits;
  }

  /**
   * Sets the <code>maxHits</code> property.
   */
  public MoveMeta maxHits(Integer maxHits) {
    this.maxHits = maxHits;
    return this;
  }

 /**
  * The minimum number of turns this move continues to take effect. Null if it always only lasts one turn.
  * minimum: -2147483648
  * maximum: 2147483647
  * @return minTurns
  */
  @JsonProperty("min_turns")
 @Min(-2147483648) @Max(2147483647)  public Integer getMinTurns() {
    return minTurns;
  }

  /**
   * Sets the <code>minTurns</code> property.
   */
 public void setMinTurns(Integer minTurns) {
    this.minTurns = minTurns;
  }

  /**
   * Sets the <code>minTurns</code> property.
   */
  public MoveMeta minTurns(Integer minTurns) {
    this.minTurns = minTurns;
    return this;
  }

 /**
  * The maximum number of turns this move continues to take effect. Null if it always only lasts one turn.
  * minimum: -2147483648
  * maximum: 2147483647
  * @return maxTurns
  */
  @JsonProperty("max_turns")
 @Min(-2147483648) @Max(2147483647)  public Integer getMaxTurns() {
    return maxTurns;
  }

  /**
   * Sets the <code>maxTurns</code> property.
   */
 public void setMaxTurns(Integer maxTurns) {
    this.maxTurns = maxTurns;
  }

  /**
   * Sets the <code>maxTurns</code> property.
   */
  public MoveMeta maxTurns(Integer maxTurns) {
    this.maxTurns = maxTurns;
    return this;
  }

 /**
  * HP drain (if positive) or Recoil damage (if negative), in percent of damage done.
  * minimum: -2147483648
  * maximum: 2147483647
  * @return drain
  */
  @JsonProperty("drain")
 @Min(-2147483648) @Max(2147483647)  public Integer getDrain() {
    return drain;
  }

  /**
   * Sets the <code>drain</code> property.
   */
 public void setDrain(Integer drain) {
    this.drain = drain;
  }

  /**
   * Sets the <code>drain</code> property.
   */
  public MoveMeta drain(Integer drain) {
    this.drain = drain;
    return this;
  }

 /**
  * The amount of hp gained by the attacking Pokemon, in percent of it&#39;s maximum HP.
  * minimum: -2147483648
  * maximum: 2147483647
  * @return healing
  */
  @JsonProperty("healing")
 @Min(-2147483648) @Max(2147483647)  public Integer getHealing() {
    return healing;
  }

  /**
   * Sets the <code>healing</code> property.
   */
 public void setHealing(Integer healing) {
    this.healing = healing;
  }

  /**
   * Sets the <code>healing</code> property.
   */
  public MoveMeta healing(Integer healing) {
    this.healing = healing;
    return this;
  }

 /**
  * Critical hit rate bonus.
  * minimum: -2147483648
  * maximum: 2147483647
  * @return critRate
  */
  @JsonProperty("crit_rate")
 @Min(-2147483648) @Max(2147483647)  public Integer getCritRate() {
    return critRate;
  }

  /**
   * Sets the <code>critRate</code> property.
   */
 public void setCritRate(Integer critRate) {
    this.critRate = critRate;
  }

  /**
   * Sets the <code>critRate</code> property.
   */
  public MoveMeta critRate(Integer critRate) {
    this.critRate = critRate;
    return this;
  }

 /**
  * The likelihood this attack will cause an ailment.
  * minimum: -2147483648
  * maximum: 2147483647
  * @return ailmentChance
  */
  @JsonProperty("ailment_chance")
 @Min(-2147483648) @Max(2147483647)  public Integer getAilmentChance() {
    return ailmentChance;
  }

  /**
   * Sets the <code>ailmentChance</code> property.
   */
 public void setAilmentChance(Integer ailmentChance) {
    this.ailmentChance = ailmentChance;
  }

  /**
   * Sets the <code>ailmentChance</code> property.
   */
  public MoveMeta ailmentChance(Integer ailmentChance) {
    this.ailmentChance = ailmentChance;
    return this;
  }

 /**
  * The likelihood this attack will cause the target Pokémon to flinch.
  * minimum: -2147483648
  * maximum: 2147483647
  * @return flinchChance
  */
  @JsonProperty("flinch_chance")
 @Min(-2147483648) @Max(2147483647)  public Integer getFlinchChance() {
    return flinchChance;
  }

  /**
   * Sets the <code>flinchChance</code> property.
   */
 public void setFlinchChance(Integer flinchChance) {
    this.flinchChance = flinchChance;
  }

  /**
   * Sets the <code>flinchChance</code> property.
   */
  public MoveMeta flinchChance(Integer flinchChance) {
    this.flinchChance = flinchChance;
    return this;
  }

 /**
  * The likelihood this attack will cause a stat change in the target Pokémon.
  * minimum: -2147483648
  * maximum: 2147483647
  * @return statChance
  */
  @JsonProperty("stat_chance")
 @Min(-2147483648) @Max(2147483647)  public Integer getStatChance() {
    return statChance;
  }

  /**
   * Sets the <code>statChance</code> property.
   */
 public void setStatChance(Integer statChance) {
    this.statChance = statChance;
  }

  /**
   * Sets the <code>statChance</code> property.
   */
  public MoveMeta statChance(Integer statChance) {
    this.statChance = statChance;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

