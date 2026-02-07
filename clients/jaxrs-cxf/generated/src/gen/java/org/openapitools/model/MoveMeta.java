package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MoveMetaAilmentSummary;
import org.openapitools.model.MoveMetaCategorySummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MoveMeta  {
  
  @ApiModelProperty(required = true, value = "")

  @Valid

  private MoveMetaAilmentSummary ailment;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private MoveMetaCategorySummary category;

  @ApiModelProperty(value = "")

  private Integer minHits;

  @ApiModelProperty(value = "")

  private Integer maxHits;

  @ApiModelProperty(value = "")

  private Integer minTurns;

  @ApiModelProperty(value = "")

  private Integer maxTurns;

  @ApiModelProperty(value = "")

  private Integer drain;

  @ApiModelProperty(value = "")

  private Integer healing;

  @ApiModelProperty(value = "")

  private Integer critRate;

  @ApiModelProperty(value = "")

  private Integer ailmentChance;

  @ApiModelProperty(value = "")

  private Integer flinchChance;

  @ApiModelProperty(value = "")

  private Integer statChance;
 /**
   * Get ailment
   * @return ailment
  **/
  @JsonProperty("ailment")
  @NotNull
  public MoveMetaAilmentSummary getAilment() {
    return ailment;
  }

  public void setAilment(MoveMetaAilmentSummary ailment) {
    this.ailment = ailment;
  }

  public MoveMeta ailment(MoveMetaAilmentSummary ailment) {
    this.ailment = ailment;
    return this;
  }

 /**
   * Get category
   * @return category
  **/
  @JsonProperty("category")
  @NotNull
  public MoveMetaCategorySummary getCategory() {
    return category;
  }

  public void setCategory(MoveMetaCategorySummary category) {
    this.category = category;
  }

  public MoveMeta category(MoveMetaCategorySummary category) {
    this.category = category;
    return this;
  }

 /**
   * Get minHits
   * @return minHits
  **/
  @JsonProperty("min_hits")
  public Integer getMinHits() {
    return minHits;
  }

  public void setMinHits(Integer minHits) {
    this.minHits = minHits;
  }

  public MoveMeta minHits(Integer minHits) {
    this.minHits = minHits;
    return this;
  }

 /**
   * Get maxHits
   * @return maxHits
  **/
  @JsonProperty("max_hits")
  public Integer getMaxHits() {
    return maxHits;
  }

  public void setMaxHits(Integer maxHits) {
    this.maxHits = maxHits;
  }

  public MoveMeta maxHits(Integer maxHits) {
    this.maxHits = maxHits;
    return this;
  }

 /**
   * Get minTurns
   * @return minTurns
  **/
  @JsonProperty("min_turns")
  public Integer getMinTurns() {
    return minTurns;
  }

  public void setMinTurns(Integer minTurns) {
    this.minTurns = minTurns;
  }

  public MoveMeta minTurns(Integer minTurns) {
    this.minTurns = minTurns;
    return this;
  }

 /**
   * Get maxTurns
   * @return maxTurns
  **/
  @JsonProperty("max_turns")
  public Integer getMaxTurns() {
    return maxTurns;
  }

  public void setMaxTurns(Integer maxTurns) {
    this.maxTurns = maxTurns;
  }

  public MoveMeta maxTurns(Integer maxTurns) {
    this.maxTurns = maxTurns;
    return this;
  }

 /**
   * Get drain
   * @return drain
  **/
  @JsonProperty("drain")
  public Integer getDrain() {
    return drain;
  }

  public void setDrain(Integer drain) {
    this.drain = drain;
  }

  public MoveMeta drain(Integer drain) {
    this.drain = drain;
    return this;
  }

 /**
   * Get healing
   * @return healing
  **/
  @JsonProperty("healing")
  public Integer getHealing() {
    return healing;
  }

  public void setHealing(Integer healing) {
    this.healing = healing;
  }

  public MoveMeta healing(Integer healing) {
    this.healing = healing;
    return this;
  }

 /**
   * Get critRate
   * @return critRate
  **/
  @JsonProperty("crit_rate")
  public Integer getCritRate() {
    return critRate;
  }

  public void setCritRate(Integer critRate) {
    this.critRate = critRate;
  }

  public MoveMeta critRate(Integer critRate) {
    this.critRate = critRate;
    return this;
  }

 /**
   * Get ailmentChance
   * @return ailmentChance
  **/
  @JsonProperty("ailment_chance")
  public Integer getAilmentChance() {
    return ailmentChance;
  }

  public void setAilmentChance(Integer ailmentChance) {
    this.ailmentChance = ailmentChance;
  }

  public MoveMeta ailmentChance(Integer ailmentChance) {
    this.ailmentChance = ailmentChance;
    return this;
  }

 /**
   * Get flinchChance
   * @return flinchChance
  **/
  @JsonProperty("flinch_chance")
  public Integer getFlinchChance() {
    return flinchChance;
  }

  public void setFlinchChance(Integer flinchChance) {
    this.flinchChance = flinchChance;
  }

  public MoveMeta flinchChance(Integer flinchChance) {
    this.flinchChance = flinchChance;
    return this;
  }

 /**
   * Get statChance
   * @return statChance
  **/
  @JsonProperty("stat_chance")
  public Integer getStatChance() {
    return statChance;
  }

  public void setStatChance(Integer statChance) {
    this.statChance = statChance;
  }

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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

