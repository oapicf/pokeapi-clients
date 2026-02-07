package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T15:24:06.001755207Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner() {
  }

  @JsonCreator
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner(
    @JsonProperty(required = true, value = "gender") EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender gender,
    @JsonProperty(required = true, value = "held_item") EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender heldItem,
    @JsonProperty(required = true, value = "item") EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender item,
    @JsonProperty(required = true, value = "known_move") Object knownMove,
    @JsonProperty(required = true, value = "known_move_type") Object knownMoveType,
    @JsonProperty(required = true, value = "location") EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender location,
    @JsonProperty(required = true, value = "min_affection") Integer minAffection,
    @JsonProperty(required = true, value = "min_beauty") Integer minBeauty,
    @JsonProperty(required = true, value = "min_happiness") Integer minHappiness,
    @JsonProperty(required = true, value = "min_level") Integer minLevel,
    @JsonProperty(required = true, value = "needs_overworld_rain") Boolean needsOverworldRain,
    @JsonProperty(required = true, value = "party_species") String partySpecies,
    @JsonProperty(required = true, value = "party_type") String partyType,
    @JsonProperty(required = true, value = "relative_physical_stats") String relativePhysicalStats,
    @JsonProperty(required = true, value = "time_of_day") String timeOfDay,
    @JsonProperty(required = true, value = "trade_species") String tradeSpecies,
    @JsonProperty(required = true, value = "trigger") AbilityDetailPokemonInnerPokemon trigger,
    @JsonProperty(required = true, value = "turn_upside_down") Boolean turnUpsideDown
  ) {
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

  /**
   **/
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner gender(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender gender) {
    this.gender = gender;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "gender")
  @NotNull @Valid public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender getGender() {
    return gender;
  }

  @JsonProperty(required = true, value = "gender")
  public void setGender(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender gender) {
    this.gender = gender;
  }

  /**
   **/
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner heldItem(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender heldItem) {
    this.heldItem = heldItem;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "held_item")
  @NotNull @Valid public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender getHeldItem() {
    return heldItem;
  }

  @JsonProperty(required = true, value = "held_item")
  public void setHeldItem(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender heldItem) {
    this.heldItem = heldItem;
  }

  /**
   **/
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner item(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender item) {
    this.item = item;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "item")
  @NotNull @Valid public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender getItem() {
    return item;
  }

  @JsonProperty(required = true, value = "item")
  public void setItem(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender item) {
    this.item = item;
  }

  /**
   **/
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner knownMove(Object knownMove) {
    this.knownMove = knownMove;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "known_move")
  @NotNull public Object getKnownMove() {
    return knownMove;
  }

  @JsonProperty(required = true, value = "known_move")
  public void setKnownMove(Object knownMove) {
    this.knownMove = knownMove;
  }

  /**
   **/
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner knownMoveType(Object knownMoveType) {
    this.knownMoveType = knownMoveType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "known_move_type")
  @NotNull public Object getKnownMoveType() {
    return knownMoveType;
  }

  @JsonProperty(required = true, value = "known_move_type")
  public void setKnownMoveType(Object knownMoveType) {
    this.knownMoveType = knownMoveType;
  }

  /**
   **/
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner location(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender location) {
    this.location = location;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "location")
  @NotNull @Valid public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender getLocation() {
    return location;
  }

  @JsonProperty(required = true, value = "location")
  public void setLocation(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender location) {
    this.location = location;
  }

  /**
   **/
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner minAffection(Integer minAffection) {
    this.minAffection = minAffection;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "min_affection")
  @NotNull public Integer getMinAffection() {
    return minAffection;
  }

  @JsonProperty(required = true, value = "min_affection")
  public void setMinAffection(Integer minAffection) {
    this.minAffection = minAffection;
  }

  /**
   **/
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner minBeauty(Integer minBeauty) {
    this.minBeauty = minBeauty;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "min_beauty")
  @NotNull public Integer getMinBeauty() {
    return minBeauty;
  }

  @JsonProperty(required = true, value = "min_beauty")
  public void setMinBeauty(Integer minBeauty) {
    this.minBeauty = minBeauty;
  }

  /**
   **/
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner minHappiness(Integer minHappiness) {
    this.minHappiness = minHappiness;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "min_happiness")
  @NotNull public Integer getMinHappiness() {
    return minHappiness;
  }

  @JsonProperty(required = true, value = "min_happiness")
  public void setMinHappiness(Integer minHappiness) {
    this.minHappiness = minHappiness;
  }

  /**
   **/
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner minLevel(Integer minLevel) {
    this.minLevel = minLevel;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "min_level")
  @NotNull public Integer getMinLevel() {
    return minLevel;
  }

  @JsonProperty(required = true, value = "min_level")
  public void setMinLevel(Integer minLevel) {
    this.minLevel = minLevel;
  }

  /**
   **/
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner needsOverworldRain(Boolean needsOverworldRain) {
    this.needsOverworldRain = needsOverworldRain;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "needs_overworld_rain")
  @NotNull public Boolean getNeedsOverworldRain() {
    return needsOverworldRain;
  }

  @JsonProperty(required = true, value = "needs_overworld_rain")
  public void setNeedsOverworldRain(Boolean needsOverworldRain) {
    this.needsOverworldRain = needsOverworldRain;
  }

  /**
   **/
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner partySpecies(String partySpecies) {
    this.partySpecies = partySpecies;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "party_species")
  @NotNull public String getPartySpecies() {
    return partySpecies;
  }

  @JsonProperty(required = true, value = "party_species")
  public void setPartySpecies(String partySpecies) {
    this.partySpecies = partySpecies;
  }

  /**
   **/
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner partyType(String partyType) {
    this.partyType = partyType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "party_type")
  @NotNull public String getPartyType() {
    return partyType;
  }

  @JsonProperty(required = true, value = "party_type")
  public void setPartyType(String partyType) {
    this.partyType = partyType;
  }

  /**
   **/
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner relativePhysicalStats(String relativePhysicalStats) {
    this.relativePhysicalStats = relativePhysicalStats;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "relative_physical_stats")
  @NotNull public String getRelativePhysicalStats() {
    return relativePhysicalStats;
  }

  @JsonProperty(required = true, value = "relative_physical_stats")
  public void setRelativePhysicalStats(String relativePhysicalStats) {
    this.relativePhysicalStats = relativePhysicalStats;
  }

  /**
   **/
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner timeOfDay(String timeOfDay) {
    this.timeOfDay = timeOfDay;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "time_of_day")
  @NotNull public String getTimeOfDay() {
    return timeOfDay;
  }

  @JsonProperty(required = true, value = "time_of_day")
  public void setTimeOfDay(String timeOfDay) {
    this.timeOfDay = timeOfDay;
  }

  /**
   **/
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner tradeSpecies(String tradeSpecies) {
    this.tradeSpecies = tradeSpecies;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "trade_species")
  @NotNull public String getTradeSpecies() {
    return tradeSpecies;
  }

  @JsonProperty(required = true, value = "trade_species")
  public void setTradeSpecies(String tradeSpecies) {
    this.tradeSpecies = tradeSpecies;
  }

  /**
   **/
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner trigger(AbilityDetailPokemonInnerPokemon trigger) {
    this.trigger = trigger;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "trigger")
  @NotNull @Valid public AbilityDetailPokemonInnerPokemon getTrigger() {
    return trigger;
  }

  @JsonProperty(required = true, value = "trigger")
  public void setTrigger(AbilityDetailPokemonInnerPokemon trigger) {
    this.trigger = trigger;
  }

  /**
   **/
  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner turnUpsideDown(Boolean turnUpsideDown) {
    this.turnUpsideDown = turnUpsideDown;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "turn_upside_down")
  @NotNull public Boolean getTurnUpsideDown() {
    return turnUpsideDown;
  }

  @JsonProperty(required = true, value = "turn_upside_down")
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

