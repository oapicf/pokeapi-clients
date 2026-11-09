package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MoveMetaAilmentSummary;
import org.openapitools.model.MoveMetaCategorySummary;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-11-09T13:49:15.621225368Z[Etc/UTC]", comments = "Generator version: 7.26.0")
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

  /**
   * The status ailment this move inflicts on its target.
   **/
  public MoveMeta ailment(MoveMetaAilmentSummary ailment) {
    this.ailment = ailment;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The status ailment this move inflicts on its target.")
  @JsonProperty("ailment")
  public MoveMetaAilmentSummary getAilment() {
    return ailment;
  }
  public void setAilment(MoveMetaAilmentSummary ailment) {
    this.ailment = ailment;
  }

  /**
   * The category of move this move falls under, e.g. damage or ailment.
   **/
  public MoveMeta category(MoveMetaCategorySummary category) {
    this.category = category;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The category of move this move falls under, e.g. damage or ailment.")
  @JsonProperty("category")
  public MoveMetaCategorySummary getCategory() {
    return category;
  }
  public void setCategory(MoveMetaCategorySummary category) {
    this.category = category;
  }

  /**
   * The minimum number of times this move hits. Null if it always only hits once.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public MoveMeta minHits(Integer minHits) {
    this.minHits = minHits;
    return this;
  }

  
  @ApiModelProperty(value = "The minimum number of times this move hits. Null if it always only hits once.")
  @JsonProperty("min_hits")
  public Integer getMinHits() {
    return minHits;
  }
  public void setMinHits(Integer minHits) {
    this.minHits = minHits;
  }

  /**
   * The maximum number of times this move hits. Null if it always only hits once.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public MoveMeta maxHits(Integer maxHits) {
    this.maxHits = maxHits;
    return this;
  }

  
  @ApiModelProperty(value = "The maximum number of times this move hits. Null if it always only hits once.")
  @JsonProperty("max_hits")
  public Integer getMaxHits() {
    return maxHits;
  }
  public void setMaxHits(Integer maxHits) {
    this.maxHits = maxHits;
  }

  /**
   * The minimum number of turns this move continues to take effect. Null if it always only lasts one turn.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public MoveMeta minTurns(Integer minTurns) {
    this.minTurns = minTurns;
    return this;
  }

  
  @ApiModelProperty(value = "The minimum number of turns this move continues to take effect. Null if it always only lasts one turn.")
  @JsonProperty("min_turns")
  public Integer getMinTurns() {
    return minTurns;
  }
  public void setMinTurns(Integer minTurns) {
    this.minTurns = minTurns;
  }

  /**
   * The maximum number of turns this move continues to take effect. Null if it always only lasts one turn.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public MoveMeta maxTurns(Integer maxTurns) {
    this.maxTurns = maxTurns;
    return this;
  }

  
  @ApiModelProperty(value = "The maximum number of turns this move continues to take effect. Null if it always only lasts one turn.")
  @JsonProperty("max_turns")
  public Integer getMaxTurns() {
    return maxTurns;
  }
  public void setMaxTurns(Integer maxTurns) {
    this.maxTurns = maxTurns;
  }

  /**
   * HP drain (if positive) or Recoil damage (if negative), in percent of damage done.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public MoveMeta drain(Integer drain) {
    this.drain = drain;
    return this;
  }

  
  @ApiModelProperty(value = "HP drain (if positive) or Recoil damage (if negative), in percent of damage done.")
  @JsonProperty("drain")
  public Integer getDrain() {
    return drain;
  }
  public void setDrain(Integer drain) {
    this.drain = drain;
  }

  /**
   * The amount of hp gained by the attacking Pokemon, in percent of it's maximum HP.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public MoveMeta healing(Integer healing) {
    this.healing = healing;
    return this;
  }

  
  @ApiModelProperty(value = "The amount of hp gained by the attacking Pokemon, in percent of it's maximum HP.")
  @JsonProperty("healing")
  public Integer getHealing() {
    return healing;
  }
  public void setHealing(Integer healing) {
    this.healing = healing;
  }

  /**
   * Critical hit rate bonus.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public MoveMeta critRate(Integer critRate) {
    this.critRate = critRate;
    return this;
  }

  
  @ApiModelProperty(value = "Critical hit rate bonus.")
  @JsonProperty("crit_rate")
  public Integer getCritRate() {
    return critRate;
  }
  public void setCritRate(Integer critRate) {
    this.critRate = critRate;
  }

  /**
   * The likelihood this attack will cause an ailment.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public MoveMeta ailmentChance(Integer ailmentChance) {
    this.ailmentChance = ailmentChance;
    return this;
  }

  
  @ApiModelProperty(value = "The likelihood this attack will cause an ailment.")
  @JsonProperty("ailment_chance")
  public Integer getAilmentChance() {
    return ailmentChance;
  }
  public void setAilmentChance(Integer ailmentChance) {
    this.ailmentChance = ailmentChance;
  }

  /**
   * The likelihood this attack will cause the target Pokémon to flinch.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public MoveMeta flinchChance(Integer flinchChance) {
    this.flinchChance = flinchChance;
    return this;
  }

  
  @ApiModelProperty(value = "The likelihood this attack will cause the target Pokémon to flinch.")
  @JsonProperty("flinch_chance")
  public Integer getFlinchChance() {
    return flinchChance;
  }
  public void setFlinchChance(Integer flinchChance) {
    this.flinchChance = flinchChance;
  }

  /**
   * The likelihood this attack will cause a stat change in the target Pokémon.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public MoveMeta statChance(Integer statChance) {
    this.statChance = statChance;
    return this;
  }

  
  @ApiModelProperty(value = "The likelihood this attack will cause a stat change in the target Pokémon.")
  @JsonProperty("stat_chance")
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
    return Objects.equals(ailment, moveMeta.ailment) &&
        Objects.equals(category, moveMeta.category) &&
        Objects.equals(minHits, moveMeta.minHits) &&
        Objects.equals(maxHits, moveMeta.maxHits) &&
        Objects.equals(minTurns, moveMeta.minTurns) &&
        Objects.equals(maxTurns, moveMeta.maxTurns) &&
        Objects.equals(drain, moveMeta.drain) &&
        Objects.equals(healing, moveMeta.healing) &&
        Objects.equals(critRate, moveMeta.critRate) &&
        Objects.equals(ailmentChance, moveMeta.ailmentChance) &&
        Objects.equals(flinchChance, moveMeta.flinchChance) &&
        Objects.equals(statChance, moveMeta.statChance);
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

