package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MoveMetaAilmentSummary;
import org.openapitools.model.MoveMetaCategorySummary;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class MoveMeta implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The status ailment this move inflicts on its target.
   */
  @JsonProperty("ailment")
  private MoveMetaAilmentSummary ailment;

  /**
   * The category of move this move falls under, e.g. damage or ailment.
   */
  @JsonProperty("category")
  private MoveMetaCategorySummary category;

  /**
   * The minimum number of times this move hits. Null if it always only hits once.
   */
  @JsonProperty("min_hits")
  private Integer minHits;

  /**
   * The maximum number of times this move hits. Null if it always only hits once.
   */
  @JsonProperty("max_hits")
  private Integer maxHits;

  /**
   * The minimum number of turns this move continues to take effect. Null if it always only lasts one turn.
   */
  @JsonProperty("min_turns")
  private Integer minTurns;

  /**
   * The maximum number of turns this move continues to take effect. Null if it always only lasts one turn.
   */
  @JsonProperty("max_turns")
  private Integer maxTurns;

  /**
   * HP drain (if positive) or Recoil damage (if negative), in percent of damage done.
   */
  @JsonProperty("drain")
  private Integer drain;

  /**
   * The amount of hp gained by the attacking Pokemon, in percent of it&#39;s maximum HP.
   */
  @JsonProperty("healing")
  private Integer healing;

  /**
   * Critical hit rate bonus.
   */
  @JsonProperty("crit_rate")
  private Integer critRate;

  /**
   * The likelihood this attack will cause an ailment.
   */
  @JsonProperty("ailment_chance")
  private Integer ailmentChance;

  /**
   * The likelihood this attack will cause the target Pokémon to flinch.
   */
  @JsonProperty("flinch_chance")
  private Integer flinchChance;

  /**
   * The likelihood this attack will cause a stat change in the target Pokémon.
   */
  @JsonProperty("stat_chance")
  private Integer statChance;

  /**
   * The status ailment this move inflicts on its target.
   * @return ailment
   */
  public MoveMetaAilmentSummary getAilment() {
    return ailment;
  }

  public void setAilment(MoveMetaAilmentSummary ailment) {
    this.ailment = ailment;
  }

  /**
   * The category of move this move falls under, e.g. damage or ailment.
   * @return category
   */
  public MoveMetaCategorySummary getCategory() {
    return category;
  }

  public void setCategory(MoveMetaCategorySummary category) {
    this.category = category;
  }

  /**
   * The minimum number of times this move hits. Null if it always only hits once.
   * @return minHits
   */
  public Integer getMinHits() {
    return minHits;
  }

  public void setMinHits(Integer minHits) {
    this.minHits = minHits;
  }

  /**
   * The maximum number of times this move hits. Null if it always only hits once.
   * @return maxHits
   */
  public Integer getMaxHits() {
    return maxHits;
  }

  public void setMaxHits(Integer maxHits) {
    this.maxHits = maxHits;
  }

  /**
   * The minimum number of turns this move continues to take effect. Null if it always only lasts one turn.
   * @return minTurns
   */
  public Integer getMinTurns() {
    return minTurns;
  }

  public void setMinTurns(Integer minTurns) {
    this.minTurns = minTurns;
  }

  /**
   * The maximum number of turns this move continues to take effect. Null if it always only lasts one turn.
   * @return maxTurns
   */
  public Integer getMaxTurns() {
    return maxTurns;
  }

  public void setMaxTurns(Integer maxTurns) {
    this.maxTurns = maxTurns;
  }

  /**
   * HP drain (if positive) or Recoil damage (if negative), in percent of damage done.
   * @return drain
   */
  public Integer getDrain() {
    return drain;
  }

  public void setDrain(Integer drain) {
    this.drain = drain;
  }

  /**
   * The amount of hp gained by the attacking Pokemon, in percent of it&#39;s maximum HP.
   * @return healing
   */
  public Integer getHealing() {
    return healing;
  }

  public void setHealing(Integer healing) {
    this.healing = healing;
  }

  /**
   * Critical hit rate bonus.
   * @return critRate
   */
  public Integer getCritRate() {
    return critRate;
  }

  public void setCritRate(Integer critRate) {
    this.critRate = critRate;
  }

  /**
   * The likelihood this attack will cause an ailment.
   * @return ailmentChance
   */
  public Integer getAilmentChance() {
    return ailmentChance;
  }

  public void setAilmentChance(Integer ailmentChance) {
    this.ailmentChance = ailmentChance;
  }

  /**
   * The likelihood this attack will cause the target Pokémon to flinch.
   * @return flinchChance
   */
  public Integer getFlinchChance() {
    return flinchChance;
  }

  public void setFlinchChance(Integer flinchChance) {
    this.flinchChance = flinchChance;
  }

  /**
   * The likelihood this attack will cause a stat change in the target Pokémon.
   * @return statChance
   */
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
