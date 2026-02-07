/*
 * PokéAPI
 *
 * All the Pokémon data you'll ever need in one place, easily accessible through a modern free open-source RESTful API.  ## What is this?  This is a full RESTful API linked to an extensive database detailing everything about the Pokémon main game series.  We've covered everything from Pokémon to Berry Flavors.  ## Where do I start?  We have awesome [documentation](https://pokeapi.co/docs/v2) on how to use this API. It takes minutes to get started.  This API will always be publicly available and will never require any extensive setup process to consume.  Created by [**Paul Hallett**(]https://github.com/phalt) and other [**PokéAPI contributors***](https://github.com/PokeAPI/pokeapi#contributing) around the world. Pokémon and Pokémon character names are trademarks of Nintendo.     
 *
 * OpenAPI document version: 2.7.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-02-07T04:17:17.108399996Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner   {
  
  private EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender gender;
  private EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender heldItem;
  private EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender item;
  private Object knownMove = null;
  private Object knownMoveType = null;
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

  /**
   */
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner gender(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender gender) {
    this.gender = gender;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("gender")
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender getGender() {
    return gender;
  }
  public void setGender(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender gender) {
    this.gender = gender;
  }

  /**
   */
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner heldItem(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender heldItem) {
    this.heldItem = heldItem;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("held_item")
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender getHeldItem() {
    return heldItem;
  }
  public void setHeldItem(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender heldItem) {
    this.heldItem = heldItem;
  }

  /**
   */
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner item(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender item) {
    this.item = item;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("item")
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender getItem() {
    return item;
  }
  public void setItem(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender item) {
    this.item = item;
  }

  /**
   */
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner knownMove(Object knownMove) {
    this.knownMove = knownMove;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("known_move")
  public Object getKnownMove() {
    return knownMove;
  }
  public void setKnownMove(Object knownMove) {
    this.knownMove = knownMove;
  }

  /**
   */
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner knownMoveType(Object knownMoveType) {
    this.knownMoveType = knownMoveType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("known_move_type")
  public Object getKnownMoveType() {
    return knownMoveType;
  }
  public void setKnownMoveType(Object knownMoveType) {
    this.knownMoveType = knownMoveType;
  }

  /**
   */
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner location(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender location) {
    this.location = location;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("location")
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender getLocation() {
    return location;
  }
  public void setLocation(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender location) {
    this.location = location;
  }

  /**
   */
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner minAffection(Integer minAffection) {
    this.minAffection = minAffection;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("min_affection")
  public Integer getMinAffection() {
    return minAffection;
  }
  public void setMinAffection(Integer minAffection) {
    this.minAffection = minAffection;
  }

  /**
   */
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner minBeauty(Integer minBeauty) {
    this.minBeauty = minBeauty;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("min_beauty")
  public Integer getMinBeauty() {
    return minBeauty;
  }
  public void setMinBeauty(Integer minBeauty) {
    this.minBeauty = minBeauty;
  }

  /**
   */
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner minHappiness(Integer minHappiness) {
    this.minHappiness = minHappiness;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("min_happiness")
  public Integer getMinHappiness() {
    return minHappiness;
  }
  public void setMinHappiness(Integer minHappiness) {
    this.minHappiness = minHappiness;
  }

  /**
   */
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner minLevel(Integer minLevel) {
    this.minLevel = minLevel;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("min_level")
  public Integer getMinLevel() {
    return minLevel;
  }
  public void setMinLevel(Integer minLevel) {
    this.minLevel = minLevel;
  }

  /**
   */
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner needsOverworldRain(Boolean needsOverworldRain) {
    this.needsOverworldRain = needsOverworldRain;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("needs_overworld_rain")
  public Boolean getNeedsOverworldRain() {
    return needsOverworldRain;
  }
  public void setNeedsOverworldRain(Boolean needsOverworldRain) {
    this.needsOverworldRain = needsOverworldRain;
  }

  /**
   */
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner partySpecies(String partySpecies) {
    this.partySpecies = partySpecies;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("party_species")
  public String getPartySpecies() {
    return partySpecies;
  }
  public void setPartySpecies(String partySpecies) {
    this.partySpecies = partySpecies;
  }

  /**
   */
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner partyType(String partyType) {
    this.partyType = partyType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("party_type")
  public String getPartyType() {
    return partyType;
  }
  public void setPartyType(String partyType) {
    this.partyType = partyType;
  }

  /**
   */
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner relativePhysicalStats(String relativePhysicalStats) {
    this.relativePhysicalStats = relativePhysicalStats;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("relative_physical_stats")
  public String getRelativePhysicalStats() {
    return relativePhysicalStats;
  }
  public void setRelativePhysicalStats(String relativePhysicalStats) {
    this.relativePhysicalStats = relativePhysicalStats;
  }

  /**
   */
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner timeOfDay(String timeOfDay) {
    this.timeOfDay = timeOfDay;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("time_of_day")
  public String getTimeOfDay() {
    return timeOfDay;
  }
  public void setTimeOfDay(String timeOfDay) {
    this.timeOfDay = timeOfDay;
  }

  /**
   */
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner tradeSpecies(String tradeSpecies) {
    this.tradeSpecies = tradeSpecies;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("trade_species")
  public String getTradeSpecies() {
    return tradeSpecies;
  }
  public void setTradeSpecies(String tradeSpecies) {
    this.tradeSpecies = tradeSpecies;
  }

  /**
   */
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner trigger(AbilityDetailPokemonInnerPokemon trigger) {
    this.trigger = trigger;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("trigger")
  public AbilityDetailPokemonInnerPokemon getTrigger() {
    return trigger;
  }
  public void setTrigger(AbilityDetailPokemonInnerPokemon trigger) {
    this.trigger = trigger;
  }

  /**
   */
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner turnUpsideDown(Boolean turnUpsideDown) {
    this.turnUpsideDown = turnUpsideDown;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
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

