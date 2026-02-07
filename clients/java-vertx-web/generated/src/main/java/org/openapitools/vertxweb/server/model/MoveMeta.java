package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.MoveMetaAilmentSummary;
import org.openapitools.vertxweb.server.model.MoveMetaCategorySummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
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

  public MoveMeta () {

  }

  public MoveMeta (MoveMetaAilmentSummary ailment, MoveMetaCategorySummary category, Integer minHits, Integer maxHits, Integer minTurns, Integer maxTurns, Integer drain, Integer healing, Integer critRate, Integer ailmentChance, Integer flinchChance, Integer statChance) {
    this.ailment = ailment;
    this.category = category;
    this.minHits = minHits;
    this.maxHits = maxHits;
    this.minTurns = minTurns;
    this.maxTurns = maxTurns;
    this.drain = drain;
    this.healing = healing;
    this.critRate = critRate;
    this.ailmentChance = ailmentChance;
    this.flinchChance = flinchChance;
    this.statChance = statChance;
  }

    
  @JsonProperty("ailment")
  public MoveMetaAilmentSummary getAilment() {
    return ailment;
  }
  public void setAilment(MoveMetaAilmentSummary ailment) {
    this.ailment = ailment;
  }

    
  @JsonProperty("category")
  public MoveMetaCategorySummary getCategory() {
    return category;
  }
  public void setCategory(MoveMetaCategorySummary category) {
    this.category = category;
  }

    
  @JsonProperty("min_hits")
  public Integer getMinHits() {
    return minHits;
  }
  public void setMinHits(Integer minHits) {
    this.minHits = minHits;
  }

    
  @JsonProperty("max_hits")
  public Integer getMaxHits() {
    return maxHits;
  }
  public void setMaxHits(Integer maxHits) {
    this.maxHits = maxHits;
  }

    
  @JsonProperty("min_turns")
  public Integer getMinTurns() {
    return minTurns;
  }
  public void setMinTurns(Integer minTurns) {
    this.minTurns = minTurns;
  }

    
  @JsonProperty("max_turns")
  public Integer getMaxTurns() {
    return maxTurns;
  }
  public void setMaxTurns(Integer maxTurns) {
    this.maxTurns = maxTurns;
  }

    
  @JsonProperty("drain")
  public Integer getDrain() {
    return drain;
  }
  public void setDrain(Integer drain) {
    this.drain = drain;
  }

    
  @JsonProperty("healing")
  public Integer getHealing() {
    return healing;
  }
  public void setHealing(Integer healing) {
    this.healing = healing;
  }

    
  @JsonProperty("crit_rate")
  public Integer getCritRate() {
    return critRate;
  }
  public void setCritRate(Integer critRate) {
    this.critRate = critRate;
  }

    
  @JsonProperty("ailment_chance")
  public Integer getAilmentChance() {
    return ailmentChance;
  }
  public void setAilmentChance(Integer ailmentChance) {
    this.ailmentChance = ailmentChance;
  }

    
  @JsonProperty("flinch_chance")
  public Integer getFlinchChance() {
    return flinchChance;
  }
  public void setFlinchChance(Integer flinchChance) {
    this.flinchChance = flinchChance;
  }

    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
