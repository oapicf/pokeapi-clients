package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-07T15:23:57.425124504Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("ailment")
  @NotNull
  @Valid
  public MoveMetaAilmentSummary getAilment() {
    return ailment;
  }
  public void setAilment(MoveMetaAilmentSummary ailment) {
    this.ailment = ailment;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("category")
  @NotNull
  @Valid
  public MoveMetaCategorySummary getCategory() {
    return category;
  }
  public void setCategory(MoveMetaCategorySummary category) {
    this.category = category;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("min_hits")
  public Integer getMinHits() {
    return minHits;
  }
  public void setMinHits(Integer minHits) {
    this.minHits = minHits;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("max_hits")
  public Integer getMaxHits() {
    return maxHits;
  }
  public void setMaxHits(Integer maxHits) {
    this.maxHits = maxHits;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("min_turns")
  public Integer getMinTurns() {
    return minTurns;
  }
  public void setMinTurns(Integer minTurns) {
    this.minTurns = minTurns;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("max_turns")
  public Integer getMaxTurns() {
    return maxTurns;
  }
  public void setMaxTurns(Integer maxTurns) {
    this.maxTurns = maxTurns;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("drain")
  public Integer getDrain() {
    return drain;
  }
  public void setDrain(Integer drain) {
    this.drain = drain;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("healing")
  public Integer getHealing() {
    return healing;
  }
  public void setHealing(Integer healing) {
    this.healing = healing;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("crit_rate")
  public Integer getCritRate() {
    return critRate;
  }
  public void setCritRate(Integer critRate) {
    this.critRate = critRate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ailment_chance")
  public Integer getAilmentChance() {
    return ailmentChance;
  }
  public void setAilmentChance(Integer ailmentChance) {
    this.ailmentChance = ailmentChance;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("flinch_chance")
  public Integer getFlinchChance() {
    return flinchChance;
  }
  public void setFlinchChance(Integer flinchChance) {
    this.flinchChance = flinchChance;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

