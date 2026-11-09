package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MoveMetaAilmentSummary;
import org.openapitools.model.MoveMetaCategorySummary;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class MoveMeta   {
  
  private MoveMetaAilmentSummary ailment;

  private MoveMetaCategorySummary category;

  private Integer minHits;

  private Integer maxHits;

  private Integer minTurns;

  private Integer maxTurns;

  private Integer drain;

  private Integer healing;

  private Integer critRate;

  private Integer ailmentChance;

  private Integer flinchChance;

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
  @NotNull
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
  @NotNull
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
 @Min(-2147483648) @Max(2147483647)  public Integer getMinHits() {
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
 @Min(-2147483648) @Max(2147483647)  public Integer getMaxHits() {
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
 @Min(-2147483648) @Max(2147483647)  public Integer getMinTurns() {
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
 @Min(-2147483648) @Max(2147483647)  public Integer getMaxTurns() {
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
 @Min(-2147483648) @Max(2147483647)  public Integer getDrain() {
    return drain;
  }
  public void setDrain(Integer drain) {
    this.drain = drain;
  }


  /**
   * The amount of hp gained by the attacking Pokemon, in percent of it&#39;s maximum HP.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public MoveMeta healing(Integer healing) {
    this.healing = healing;
    return this;
  }

  
  @ApiModelProperty(value = "The amount of hp gained by the attacking Pokemon, in percent of it's maximum HP.")
  @JsonProperty("healing")
 @Min(-2147483648) @Max(2147483647)  public Integer getHealing() {
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
 @Min(-2147483648) @Max(2147483647)  public Integer getCritRate() {
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
 @Min(-2147483648) @Max(2147483647)  public Integer getAilmentChance() {
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
 @Min(-2147483648) @Max(2147483647)  public Integer getFlinchChance() {
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
 @Min(-2147483648) @Max(2147483647)  public Integer getStatChance() {
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

