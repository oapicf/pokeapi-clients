package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.vertxweb.server.model.EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner   {
  
  private EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender gender;
  private EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender heldItem;
  private EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender item;
  private Object knownMove;
  private Object knownMoveType;
  private EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender location;
  private Integer minAffection;
  private Integer minBeauty;
  private Integer minHappiness;
  private Integer minLevel;
  private Boolean needsOverworldRain;
  private String partySpecies;
  private String partyType;
  private String relativePhysicalStats;
  private String timeOfDay;
  private String tradeSpecies;
  private AbilityDetailPokemonInnerPokemon trigger;
  private Boolean turnUpsideDown;

  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner () {

  }

  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner (EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender gender, EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender heldItem, EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender item, Object knownMove, Object knownMoveType, EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender location, Integer minAffection, Integer minBeauty, Integer minHappiness, Integer minLevel, Boolean needsOverworldRain, String partySpecies, String partyType, String relativePhysicalStats, String timeOfDay, String tradeSpecies, AbilityDetailPokemonInnerPokemon trigger, Boolean turnUpsideDown) {
    this.gender = gender;
    this.heldItem = heldItem;
    this.item = item;
    this.knownMove = knownMove;
    this.knownMoveType = knownMoveType;
    this.location = location;
    this.minAffection = minAffection;
    this.minBeauty = minBeauty;
    this.minHappiness = minHappiness;
    this.minLevel = minLevel;
    this.needsOverworldRain = needsOverworldRain;
    this.partySpecies = partySpecies;
    this.partyType = partyType;
    this.relativePhysicalStats = relativePhysicalStats;
    this.timeOfDay = timeOfDay;
    this.tradeSpecies = tradeSpecies;
    this.trigger = trigger;
    this.turnUpsideDown = turnUpsideDown;
  }

    
  @JsonProperty("gender")
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender getGender() {
    return gender;
  }
  public void setGender(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender gender) {
    this.gender = gender;
  }

    
  @JsonProperty("held_item")
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender getHeldItem() {
    return heldItem;
  }
  public void setHeldItem(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender heldItem) {
    this.heldItem = heldItem;
  }

    
  @JsonProperty("item")
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender getItem() {
    return item;
  }
  public void setItem(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender item) {
    this.item = item;
  }

    
  @JsonProperty("known_move")
  public Object getKnownMove() {
    return knownMove;
  }
  public void setKnownMove(Object knownMove) {
    this.knownMove = knownMove;
  }

    
  @JsonProperty("known_move_type")
  public Object getKnownMoveType() {
    return knownMoveType;
  }
  public void setKnownMoveType(Object knownMoveType) {
    this.knownMoveType = knownMoveType;
  }

    
  @JsonProperty("location")
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender getLocation() {
    return location;
  }
  public void setLocation(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender location) {
    this.location = location;
  }

    
  @JsonProperty("min_affection")
  public Integer getMinAffection() {
    return minAffection;
  }
  public void setMinAffection(Integer minAffection) {
    this.minAffection = minAffection;
  }

    
  @JsonProperty("min_beauty")
  public Integer getMinBeauty() {
    return minBeauty;
  }
  public void setMinBeauty(Integer minBeauty) {
    this.minBeauty = minBeauty;
  }

    
  @JsonProperty("min_happiness")
  public Integer getMinHappiness() {
    return minHappiness;
  }
  public void setMinHappiness(Integer minHappiness) {
    this.minHappiness = minHappiness;
  }

    
  @JsonProperty("min_level")
  public Integer getMinLevel() {
    return minLevel;
  }
  public void setMinLevel(Integer minLevel) {
    this.minLevel = minLevel;
  }

    
  @JsonProperty("needs_overworld_rain")
  public Boolean getNeedsOverworldRain() {
    return needsOverworldRain;
  }
  public void setNeedsOverworldRain(Boolean needsOverworldRain) {
    this.needsOverworldRain = needsOverworldRain;
  }

    
  @JsonProperty("party_species")
  public String getPartySpecies() {
    return partySpecies;
  }
  public void setPartySpecies(String partySpecies) {
    this.partySpecies = partySpecies;
  }

    
  @JsonProperty("party_type")
  public String getPartyType() {
    return partyType;
  }
  public void setPartyType(String partyType) {
    this.partyType = partyType;
  }

    
  @JsonProperty("relative_physical_stats")
  public String getRelativePhysicalStats() {
    return relativePhysicalStats;
  }
  public void setRelativePhysicalStats(String relativePhysicalStats) {
    this.relativePhysicalStats = relativePhysicalStats;
  }

    
  @JsonProperty("time_of_day")
  public String getTimeOfDay() {
    return timeOfDay;
  }
  public void setTimeOfDay(String timeOfDay) {
    this.timeOfDay = timeOfDay;
  }

    
  @JsonProperty("trade_species")
  public String getTradeSpecies() {
    return tradeSpecies;
  }
  public void setTradeSpecies(String tradeSpecies) {
    this.tradeSpecies = tradeSpecies;
  }

    
  @JsonProperty("trigger")
  public AbilityDetailPokemonInnerPokemon getTrigger() {
    return trigger;
  }
  public void setTrigger(AbilityDetailPokemonInnerPokemon trigger) {
    this.trigger = trigger;
  }

    
  @JsonProperty("turn_upside_down")
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
    return Objects.equals(gender, evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.gender) &&
        Objects.equals(heldItem, evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.heldItem) &&
        Objects.equals(item, evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.item) &&
        Objects.equals(knownMove, evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.knownMove) &&
        Objects.equals(knownMoveType, evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.knownMoveType) &&
        Objects.equals(location, evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.location) &&
        Objects.equals(minAffection, evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.minAffection) &&
        Objects.equals(minBeauty, evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.minBeauty) &&
        Objects.equals(minHappiness, evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.minHappiness) &&
        Objects.equals(minLevel, evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.minLevel) &&
        Objects.equals(needsOverworldRain, evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.needsOverworldRain) &&
        Objects.equals(partySpecies, evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.partySpecies) &&
        Objects.equals(partyType, evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.partyType) &&
        Objects.equals(relativePhysicalStats, evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.relativePhysicalStats) &&
        Objects.equals(timeOfDay, evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.timeOfDay) &&
        Objects.equals(tradeSpecies, evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.tradeSpecies) &&
        Objects.equals(trigger, evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.trigger) &&
        Objects.equals(turnUpsideDown, evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.turnUpsideDown);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
