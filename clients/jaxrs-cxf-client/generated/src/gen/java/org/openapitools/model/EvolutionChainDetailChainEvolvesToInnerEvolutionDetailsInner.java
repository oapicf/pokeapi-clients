package org.openapitools.model;

import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner  {
  
  @ApiModelProperty(required = true, value = "")

  private EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender gender;

  @ApiModelProperty(required = true, value = "")

  private EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender heldItem;

  @ApiModelProperty(required = true, value = "")

  private EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender item;

  @ApiModelProperty(required = true, value = "")

  private Object knownMove = null;

  @ApiModelProperty(required = true, value = "")

  private Object knownMoveType = null;

  @ApiModelProperty(required = true, value = "")

  private EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender location;

  @ApiModelProperty(required = true, value = "")

  private Integer minAffection;

  @ApiModelProperty(required = true, value = "")

  private Integer minBeauty;

  @ApiModelProperty(required = true, value = "")

  private Integer minHappiness;

  @ApiModelProperty(required = true, value = "")

  private Integer minLevel;

  @ApiModelProperty(required = true, value = "")

  private Boolean needsOverworldRain;

  @ApiModelProperty(required = true, value = "")

  private String partySpecies;

  @ApiModelProperty(required = true, value = "")

  private String partyType;

  @ApiModelProperty(required = true, value = "")

  private String relativePhysicalStats;

  @ApiModelProperty(required = true, value = "")

  private String timeOfDay;

  @ApiModelProperty(required = true, value = "")

  private String tradeSpecies;

  @ApiModelProperty(required = true, value = "")

  private AbilityDetailPokemonInnerPokemon trigger;

  @ApiModelProperty(required = true, value = "")

  private Boolean turnUpsideDown;
 /**
   * Get gender
   * @return gender
  **/
  @JsonProperty("gender")
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender getGender() {
    return gender;
  }

  public void setGender(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender gender) {
    this.gender = gender;
  }

  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner gender(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender gender) {
    this.gender = gender;
    return this;
  }

 /**
   * Get heldItem
   * @return heldItem
  **/
  @JsonProperty("held_item")
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender getHeldItem() {
    return heldItem;
  }

  public void setHeldItem(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender heldItem) {
    this.heldItem = heldItem;
  }

  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner heldItem(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender heldItem) {
    this.heldItem = heldItem;
    return this;
  }

 /**
   * Get item
   * @return item
  **/
  @JsonProperty("item")
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender getItem() {
    return item;
  }

  public void setItem(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender item) {
    this.item = item;
  }

  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner item(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender item) {
    this.item = item;
    return this;
  }

 /**
   * Get knownMove
   * @return knownMove
  **/
  @JsonProperty("known_move")
  public Object getKnownMove() {
    return knownMove;
  }

  public void setKnownMove(Object knownMove) {
    this.knownMove = knownMove;
  }

  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner knownMove(Object knownMove) {
    this.knownMove = knownMove;
    return this;
  }

 /**
   * Get knownMoveType
   * @return knownMoveType
  **/
  @JsonProperty("known_move_type")
  public Object getKnownMoveType() {
    return knownMoveType;
  }

  public void setKnownMoveType(Object knownMoveType) {
    this.knownMoveType = knownMoveType;
  }

  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner knownMoveType(Object knownMoveType) {
    this.knownMoveType = knownMoveType;
    return this;
  }

 /**
   * Get location
   * @return location
  **/
  @JsonProperty("location")
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender getLocation() {
    return location;
  }

  public void setLocation(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender location) {
    this.location = location;
  }

  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner location(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender location) {
    this.location = location;
    return this;
  }

 /**
   * Get minAffection
   * @return minAffection
  **/
  @JsonProperty("min_affection")
  public Integer getMinAffection() {
    return minAffection;
  }

  public void setMinAffection(Integer minAffection) {
    this.minAffection = minAffection;
  }

  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner minAffection(Integer minAffection) {
    this.minAffection = minAffection;
    return this;
  }

 /**
   * Get minBeauty
   * @return minBeauty
  **/
  @JsonProperty("min_beauty")
  public Integer getMinBeauty() {
    return minBeauty;
  }

  public void setMinBeauty(Integer minBeauty) {
    this.minBeauty = minBeauty;
  }

  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner minBeauty(Integer minBeauty) {
    this.minBeauty = minBeauty;
    return this;
  }

 /**
   * Get minHappiness
   * @return minHappiness
  **/
  @JsonProperty("min_happiness")
  public Integer getMinHappiness() {
    return minHappiness;
  }

  public void setMinHappiness(Integer minHappiness) {
    this.minHappiness = minHappiness;
  }

  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner minHappiness(Integer minHappiness) {
    this.minHappiness = minHappiness;
    return this;
  }

 /**
   * Get minLevel
   * @return minLevel
  **/
  @JsonProperty("min_level")
  public Integer getMinLevel() {
    return minLevel;
  }

  public void setMinLevel(Integer minLevel) {
    this.minLevel = minLevel;
  }

  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner minLevel(Integer minLevel) {
    this.minLevel = minLevel;
    return this;
  }

 /**
   * Get needsOverworldRain
   * @return needsOverworldRain
  **/
  @JsonProperty("needs_overworld_rain")
  public Boolean getNeedsOverworldRain() {
    return needsOverworldRain;
  }

  public void setNeedsOverworldRain(Boolean needsOverworldRain) {
    this.needsOverworldRain = needsOverworldRain;
  }

  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner needsOverworldRain(Boolean needsOverworldRain) {
    this.needsOverworldRain = needsOverworldRain;
    return this;
  }

 /**
   * Get partySpecies
   * @return partySpecies
  **/
  @JsonProperty("party_species")
  public String getPartySpecies() {
    return partySpecies;
  }

  public void setPartySpecies(String partySpecies) {
    this.partySpecies = partySpecies;
  }

  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner partySpecies(String partySpecies) {
    this.partySpecies = partySpecies;
    return this;
  }

 /**
   * Get partyType
   * @return partyType
  **/
  @JsonProperty("party_type")
  public String getPartyType() {
    return partyType;
  }

  public void setPartyType(String partyType) {
    this.partyType = partyType;
  }

  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner partyType(String partyType) {
    this.partyType = partyType;
    return this;
  }

 /**
   * Get relativePhysicalStats
   * @return relativePhysicalStats
  **/
  @JsonProperty("relative_physical_stats")
  public String getRelativePhysicalStats() {
    return relativePhysicalStats;
  }

  public void setRelativePhysicalStats(String relativePhysicalStats) {
    this.relativePhysicalStats = relativePhysicalStats;
  }

  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner relativePhysicalStats(String relativePhysicalStats) {
    this.relativePhysicalStats = relativePhysicalStats;
    return this;
  }

 /**
   * Get timeOfDay
   * @return timeOfDay
  **/
  @JsonProperty("time_of_day")
  public String getTimeOfDay() {
    return timeOfDay;
  }

  public void setTimeOfDay(String timeOfDay) {
    this.timeOfDay = timeOfDay;
  }

  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner timeOfDay(String timeOfDay) {
    this.timeOfDay = timeOfDay;
    return this;
  }

 /**
   * Get tradeSpecies
   * @return tradeSpecies
  **/
  @JsonProperty("trade_species")
  public String getTradeSpecies() {
    return tradeSpecies;
  }

  public void setTradeSpecies(String tradeSpecies) {
    this.tradeSpecies = tradeSpecies;
  }

  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner tradeSpecies(String tradeSpecies) {
    this.tradeSpecies = tradeSpecies;
    return this;
  }

 /**
   * Get trigger
   * @return trigger
  **/
  @JsonProperty("trigger")
  public AbilityDetailPokemonInnerPokemon getTrigger() {
    return trigger;
  }

  public void setTrigger(AbilityDetailPokemonInnerPokemon trigger) {
    this.trigger = trigger;
  }

  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner trigger(AbilityDetailPokemonInnerPokemon trigger) {
    this.trigger = trigger;
    return this;
  }

 /**
   * Get turnUpsideDown
   * @return turnUpsideDown
  **/
  @JsonProperty("turn_upside_down")
  public Boolean getTurnUpsideDown() {
    return turnUpsideDown;
  }

  public void setTurnUpsideDown(Boolean turnUpsideDown) {
    this.turnUpsideDown = turnUpsideDown;
  }

  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner turnUpsideDown(Boolean turnUpsideDown) {
    this.turnUpsideDown = turnUpsideDown;
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
    EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner = (EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner) o;
    return Objects.equals(this.gender, evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.gender) &&
        Objects.equals(this.heldItem, evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.heldItem) &&
        Objects.equals(this.item, evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.item) &&
        Objects.equals(this.knownMove, evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.knownMove) &&
        Objects.equals(this.knownMoveType, evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.knownMoveType) &&
        Objects.equals(this.location, evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.location) &&
        Objects.equals(this.minAffection, evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.minAffection) &&
        Objects.equals(this.minBeauty, evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.minBeauty) &&
        Objects.equals(this.minHappiness, evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.minHappiness) &&
        Objects.equals(this.minLevel, evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.minLevel) &&
        Objects.equals(this.needsOverworldRain, evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.needsOverworldRain) &&
        Objects.equals(this.partySpecies, evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.partySpecies) &&
        Objects.equals(this.partyType, evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.partyType) &&
        Objects.equals(this.relativePhysicalStats, evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.relativePhysicalStats) &&
        Objects.equals(this.timeOfDay, evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.timeOfDay) &&
        Objects.equals(this.tradeSpecies, evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.tradeSpecies) &&
        Objects.equals(this.trigger, evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.trigger) &&
        Objects.equals(this.turnUpsideDown, evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.turnUpsideDown);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gender, heldItem, item, knownMove, knownMoveType, location, minAffection, minBeauty, minHappiness, minLevel, needsOverworldRain, partySpecies, partyType, relativePhysicalStats, timeOfDay, tradeSpecies, trigger, turnUpsideDown);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner {\n");
    
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    heldItem: ").append(toIndentedString(heldItem)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    knownMove: ").append(toIndentedString(knownMove)).append("\n");
    sb.append("    knownMoveType: ").append(toIndentedString(knownMoveType)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    minAffection: ").append(toIndentedString(minAffection)).append("\n");
    sb.append("    minBeauty: ").append(toIndentedString(minBeauty)).append("\n");
    sb.append("    minHappiness: ").append(toIndentedString(minHappiness)).append("\n");
    sb.append("    minLevel: ").append(toIndentedString(minLevel)).append("\n");
    sb.append("    needsOverworldRain: ").append(toIndentedString(needsOverworldRain)).append("\n");
    sb.append("    partySpecies: ").append(toIndentedString(partySpecies)).append("\n");
    sb.append("    partyType: ").append(toIndentedString(partyType)).append("\n");
    sb.append("    relativePhysicalStats: ").append(toIndentedString(relativePhysicalStats)).append("\n");
    sb.append("    timeOfDay: ").append(toIndentedString(timeOfDay)).append("\n");
    sb.append("    tradeSpecies: ").append(toIndentedString(tradeSpecies)).append("\n");
    sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
    sb.append("    turnUpsideDown: ").append(toIndentedString(turnUpsideDown)).append("\n");
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

