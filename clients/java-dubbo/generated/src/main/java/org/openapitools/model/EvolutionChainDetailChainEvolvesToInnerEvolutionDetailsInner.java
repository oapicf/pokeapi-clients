package org.openapitools.model;

import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("gender")
  private EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender gender;

  @JsonProperty("held_item")
  private EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender heldItem;

  @JsonProperty("item")
  private EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender item;

  @JsonProperty("known_move")
  private EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender knownMove;

  @JsonProperty("known_move_type")
  private EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender knownMoveType;

  @JsonProperty("location")
  private EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender location;

  @JsonProperty("min_affection")
  private Integer minAffection;

  @JsonProperty("min_beauty")
  private Integer minBeauty;

  @JsonProperty("min_happiness")
  private Integer minHappiness;

  @JsonProperty("min_level")
  private Integer minLevel;

  @JsonProperty("needs_overworld_rain")
  private Boolean needsOverworldRain;

  @JsonProperty("party_species")
  private String partySpecies;

  @JsonProperty("party_type")
  private String partyType;

  @JsonProperty("relative_physical_stats")
  private String relativePhysicalStats;

  @JsonProperty("time_of_day")
  private String timeOfDay;

  @JsonProperty("trade_species")
  private String tradeSpecies;

  @JsonProperty("trigger")
  private AbilityDetailPokemonInnerPokemon trigger;

  @JsonProperty("turn_upside_down")
  private Boolean turnUpsideDown;

  /**
   * 
   * @return gender
   */
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender getGender() {
    return gender;
  }

  public void setGender(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender gender) {
    this.gender = gender;
  }

  /**
   * 
   * @return heldItem
   */
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender getHeldItem() {
    return heldItem;
  }

  public void setHeldItem(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender heldItem) {
    this.heldItem = heldItem;
  }

  /**
   * 
   * @return item
   */
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender getItem() {
    return item;
  }

  public void setItem(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender item) {
    this.item = item;
  }

  /**
   * 
   * @return knownMove
   */
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender getKnownMove() {
    return knownMove;
  }

  public void setKnownMove(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender knownMove) {
    this.knownMove = knownMove;
  }

  /**
   * 
   * @return knownMoveType
   */
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender getKnownMoveType() {
    return knownMoveType;
  }

  public void setKnownMoveType(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender knownMoveType) {
    this.knownMoveType = knownMoveType;
  }

  /**
   * 
   * @return location
   */
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender getLocation() {
    return location;
  }

  public void setLocation(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender location) {
    this.location = location;
  }

  /**
   * 
   * @return minAffection
   */
  public Integer getMinAffection() {
    return minAffection;
  }

  public void setMinAffection(Integer minAffection) {
    this.minAffection = minAffection;
  }

  /**
   * 
   * @return minBeauty
   */
  public Integer getMinBeauty() {
    return minBeauty;
  }

  public void setMinBeauty(Integer minBeauty) {
    this.minBeauty = minBeauty;
  }

  /**
   * 
   * @return minHappiness
   */
  public Integer getMinHappiness() {
    return minHappiness;
  }

  public void setMinHappiness(Integer minHappiness) {
    this.minHappiness = minHappiness;
  }

  /**
   * 
   * @return minLevel
   */
  public Integer getMinLevel() {
    return minLevel;
  }

  public void setMinLevel(Integer minLevel) {
    this.minLevel = minLevel;
  }

  /**
   * 
   * @return needsOverworldRain
   */
  public Boolean getNeedsOverworldRain() {
    return needsOverworldRain;
  }

  public void setNeedsOverworldRain(Boolean needsOverworldRain) {
    this.needsOverworldRain = needsOverworldRain;
  }

  /**
   * 
   * @return partySpecies
   */
  public String getPartySpecies() {
    return partySpecies;
  }

  public void setPartySpecies(String partySpecies) {
    this.partySpecies = partySpecies;
  }

  /**
   * 
   * @return partyType
   */
  public String getPartyType() {
    return partyType;
  }

  public void setPartyType(String partyType) {
    this.partyType = partyType;
  }

  /**
   * 
   * @return relativePhysicalStats
   */
  public String getRelativePhysicalStats() {
    return relativePhysicalStats;
  }

  public void setRelativePhysicalStats(String relativePhysicalStats) {
    this.relativePhysicalStats = relativePhysicalStats;
  }

  /**
   * 
   * @return timeOfDay
   */
  public String getTimeOfDay() {
    return timeOfDay;
  }

  public void setTimeOfDay(String timeOfDay) {
    this.timeOfDay = timeOfDay;
  }

  /**
   * 
   * @return tradeSpecies
   */
  public String getTradeSpecies() {
    return tradeSpecies;
  }

  public void setTradeSpecies(String tradeSpecies) {
    this.tradeSpecies = tradeSpecies;
  }

  /**
   * 
   * @return trigger
   */
  public AbilityDetailPokemonInnerPokemon getTrigger() {
    return trigger;
  }

  public void setTrigger(AbilityDetailPokemonInnerPokemon trigger) {
    this.trigger = trigger;
  }

  /**
   * 
   * @return turnUpsideDown
   */
  public Boolean getTurnUpsideDown() {
    return turnUpsideDown;
  }

  public void setTurnUpsideDown(Boolean turnUpsideDown) {
    this.turnUpsideDown = turnUpsideDown;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
