package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner
 */

@JsonTypeName("EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-02-07T04:17:25.266083787Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner {

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

  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender gender, EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender heldItem, EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender item, Object knownMove, Object knownMoveType, EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender location, Integer minAffection, Integer minBeauty, Integer minHappiness, Integer minLevel, Boolean needsOverworldRain, String partySpecies, String partyType, String relativePhysicalStats, String timeOfDay, String tradeSpecies, AbilityDetailPokemonInnerPokemon trigger, Boolean turnUpsideDown) {
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

  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner gender(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
   */
  @NotNull @Valid 
  @Schema(name = "gender", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("gender")
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender getGender() {
    return gender;
  }

  public void setGender(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender gender) {
    this.gender = gender;
  }

  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner heldItem(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender heldItem) {
    this.heldItem = heldItem;
    return this;
  }

  /**
   * Get heldItem
   * @return heldItem
   */
  @NotNull @Valid 
  @Schema(name = "held_item", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("held_item")
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender getHeldItem() {
    return heldItem;
  }

  public void setHeldItem(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender heldItem) {
    this.heldItem = heldItem;
  }

  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner item(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender item) {
    this.item = item;
    return this;
  }

  /**
   * Get item
   * @return item
   */
  @NotNull @Valid 
  @Schema(name = "item", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("item")
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender getItem() {
    return item;
  }

  public void setItem(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender item) {
    this.item = item;
  }

  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner knownMove(Object knownMove) {
    this.knownMove = knownMove;
    return this;
  }

  /**
   * Get knownMove
   * @return knownMove
   */
  @NotNull 
  @Schema(name = "known_move", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("known_move")
  public Object getKnownMove() {
    return knownMove;
  }

  public void setKnownMove(Object knownMove) {
    this.knownMove = knownMove;
  }

  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner knownMoveType(Object knownMoveType) {
    this.knownMoveType = knownMoveType;
    return this;
  }

  /**
   * Get knownMoveType
   * @return knownMoveType
   */
  @NotNull 
  @Schema(name = "known_move_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("known_move_type")
  public Object getKnownMoveType() {
    return knownMoveType;
  }

  public void setKnownMoveType(Object knownMoveType) {
    this.knownMoveType = knownMoveType;
  }

  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner location(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
   */
  @NotNull @Valid 
  @Schema(name = "location", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("location")
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender getLocation() {
    return location;
  }

  public void setLocation(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender location) {
    this.location = location;
  }

  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner minAffection(Integer minAffection) {
    this.minAffection = minAffection;
    return this;
  }

  /**
   * Get minAffection
   * @return minAffection
   */
  @NotNull 
  @Schema(name = "min_affection", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("min_affection")
  public Integer getMinAffection() {
    return minAffection;
  }

  public void setMinAffection(Integer minAffection) {
    this.minAffection = minAffection;
  }

  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner minBeauty(Integer minBeauty) {
    this.minBeauty = minBeauty;
    return this;
  }

  /**
   * Get minBeauty
   * @return minBeauty
   */
  @NotNull 
  @Schema(name = "min_beauty", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("min_beauty")
  public Integer getMinBeauty() {
    return minBeauty;
  }

  public void setMinBeauty(Integer minBeauty) {
    this.minBeauty = minBeauty;
  }

  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner minHappiness(Integer minHappiness) {
    this.minHappiness = minHappiness;
    return this;
  }

  /**
   * Get minHappiness
   * @return minHappiness
   */
  @NotNull 
  @Schema(name = "min_happiness", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("min_happiness")
  public Integer getMinHappiness() {
    return minHappiness;
  }

  public void setMinHappiness(Integer minHappiness) {
    this.minHappiness = minHappiness;
  }

  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner minLevel(Integer minLevel) {
    this.minLevel = minLevel;
    return this;
  }

  /**
   * Get minLevel
   * @return minLevel
   */
  @NotNull 
  @Schema(name = "min_level", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("min_level")
  public Integer getMinLevel() {
    return minLevel;
  }

  public void setMinLevel(Integer minLevel) {
    this.minLevel = minLevel;
  }

  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner needsOverworldRain(Boolean needsOverworldRain) {
    this.needsOverworldRain = needsOverworldRain;
    return this;
  }

  /**
   * Get needsOverworldRain
   * @return needsOverworldRain
   */
  @NotNull 
  @Schema(name = "needs_overworld_rain", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("needs_overworld_rain")
  public Boolean getNeedsOverworldRain() {
    return needsOverworldRain;
  }

  public void setNeedsOverworldRain(Boolean needsOverworldRain) {
    this.needsOverworldRain = needsOverworldRain;
  }

  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner partySpecies(String partySpecies) {
    this.partySpecies = partySpecies;
    return this;
  }

  /**
   * Get partySpecies
   * @return partySpecies
   */
  @NotNull 
  @Schema(name = "party_species", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("party_species")
  public String getPartySpecies() {
    return partySpecies;
  }

  public void setPartySpecies(String partySpecies) {
    this.partySpecies = partySpecies;
  }

  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner partyType(String partyType) {
    this.partyType = partyType;
    return this;
  }

  /**
   * Get partyType
   * @return partyType
   */
  @NotNull 
  @Schema(name = "party_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("party_type")
  public String getPartyType() {
    return partyType;
  }

  public void setPartyType(String partyType) {
    this.partyType = partyType;
  }

  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner relativePhysicalStats(String relativePhysicalStats) {
    this.relativePhysicalStats = relativePhysicalStats;
    return this;
  }

  /**
   * Get relativePhysicalStats
   * @return relativePhysicalStats
   */
  @NotNull 
  @Schema(name = "relative_physical_stats", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("relative_physical_stats")
  public String getRelativePhysicalStats() {
    return relativePhysicalStats;
  }

  public void setRelativePhysicalStats(String relativePhysicalStats) {
    this.relativePhysicalStats = relativePhysicalStats;
  }

  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner timeOfDay(String timeOfDay) {
    this.timeOfDay = timeOfDay;
    return this;
  }

  /**
   * Get timeOfDay
   * @return timeOfDay
   */
  @NotNull 
  @Schema(name = "time_of_day", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("time_of_day")
  public String getTimeOfDay() {
    return timeOfDay;
  }

  public void setTimeOfDay(String timeOfDay) {
    this.timeOfDay = timeOfDay;
  }

  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner tradeSpecies(String tradeSpecies) {
    this.tradeSpecies = tradeSpecies;
    return this;
  }

  /**
   * Get tradeSpecies
   * @return tradeSpecies
   */
  @NotNull 
  @Schema(name = "trade_species", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("trade_species")
  public String getTradeSpecies() {
    return tradeSpecies;
  }

  public void setTradeSpecies(String tradeSpecies) {
    this.tradeSpecies = tradeSpecies;
  }

  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner trigger(AbilityDetailPokemonInnerPokemon trigger) {
    this.trigger = trigger;
    return this;
  }

  /**
   * Get trigger
   * @return trigger
   */
  @NotNull @Valid 
  @Schema(name = "trigger", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("trigger")
  public AbilityDetailPokemonInnerPokemon getTrigger() {
    return trigger;
  }

  public void setTrigger(AbilityDetailPokemonInnerPokemon trigger) {
    this.trigger = trigger;
  }

  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner turnUpsideDown(Boolean turnUpsideDown) {
    this.turnUpsideDown = turnUpsideDown;
    return this;
  }

  /**
   * Get turnUpsideDown
   * @return turnUpsideDown
   */
  @NotNull 
  @Schema(name = "turn_upside_down", requiredMode = Schema.RequiredMode.REQUIRED)
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

