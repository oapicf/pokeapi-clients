package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.EvolutionConditionExpression;
import org.openapitools.model.EvolutionTriggerSummary;
import org.openapitools.model.ItemSummary;
import org.openapitools.model.LocationSummary;
import org.openapitools.model.MoveSummary;
import org.openapitools.model.NatureSummary;
import org.openapitools.model.PokemonEvolutionKnownMove;
import org.openapitools.model.PokemonFormSummary;
import org.openapitools.model.PokemonSpeciesSummary;
import org.openapitools.model.RegionSummary;
import org.openapitools.model.TypeSummary;
import org.openapitools.model.VersionGroupSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-11-09T13:50:03.149615362Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonEvolution   {
  
  private VersionGroupSummary versionGroup;
  private Boolean isDefault;
  private ItemSummary item;
  private EvolutionTriggerSummary trigger;
  private Integer gender;
  private ItemSummary heldItem;
  private PokemonEvolutionKnownMove knownMove;
  private PokemonEvolutionKnownMove knownMoveType;
  private LocationSummary location;
  private Integer minLevel;
  private Integer minHappiness;
  private Integer minBeauty;
  private Integer minAffection;
  private Boolean nearSpecialRock;
  private Boolean needsMultiplayer;
  private Boolean needsOverworldRain;
  private PokemonSpeciesSummary partySpecies;
  private TypeSummary partyType;
  private Integer relativePhysicalStats;
  private String timeOfDay;
  private PokemonSpeciesSummary tradeSpecies;
  private Boolean turnUpsideDown;
  private RegionSummary region;
  private PokemonFormSummary requiredPokemonForm;
  private PokemonFormSummary evolvedPokemonForm;
  private MoveSummary usedMove;
  private Integer minMoveCount;
  private Integer minSteps;
  private Integer minDamageTaken;
  private List<@Valid NatureSummary> allowedNatures;
  private EvolutionConditionExpression conditionExpression;

  /**
   * The version group in which these evolution requirements apply.
   **/
  
  @ApiModelProperty(required = true, value = "The version group in which these evolution requirements apply.")
  @JsonProperty("version_group")
  @NotNull
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }
  public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

  /**
   * Whether the evolution is considered as the expected evolution in a main series game. Each unique Pokémon variety of a line capable of evolution should have exactly one &#39;default&#39; evolution. For example, the Meowth species has three default evolutions as there are three distinct varieties it can evolve into: Persian, Alolan Persian, and Perrserker.
   **/
  
  @ApiModelProperty(value = "Whether the evolution is considered as the expected evolution in a main series game. Each unique Pokémon variety of a line capable of evolution should have exactly one 'default' evolution. For example, the Meowth species has three default evolutions as there are three distinct varieties it can evolve into: Persian, Alolan Persian, and Perrserker.")
  @JsonProperty("is_default")
  public Boolean getIsDefault() {
    return isDefault;
  }
  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  /**
   * The item required to cause evolution this into Pokémon species.
   **/
  
  @ApiModelProperty(required = true, value = "The item required to cause evolution this into Pokémon species.")
  @JsonProperty("item")
  @NotNull
  public ItemSummary getItem() {
    return item;
  }
  public void setItem(ItemSummary item) {
    this.item = item;
  }

  /**
   * The type of event that triggers evolution into this Pokémon species.
   **/
  
  @ApiModelProperty(required = true, value = "The type of event that triggers evolution into this Pokémon species.")
  @JsonProperty("trigger")
  @NotNull
  public EvolutionTriggerSummary getTrigger() {
    return trigger;
  }
  public void setTrigger(EvolutionTriggerSummary trigger) {
    this.trigger = trigger;
  }

  /**
   * The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species.
   **/
  
  @ApiModelProperty(value = "The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species.")
  @JsonProperty("gender")
  public Integer getGender() {
    return gender;
  }
  public void setGender(Integer gender) {
    this.gender = gender;
  }

  /**
   * The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species.
   **/
  
  @ApiModelProperty(required = true, value = "The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species.")
  @JsonProperty("held_item")
  @NotNull
  public ItemSummary getHeldItem() {
    return heldItem;
  }
  public void setHeldItem(ItemSummary heldItem) {
    this.heldItem = heldItem;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("known_move")
  @NotNull
  public PokemonEvolutionKnownMove getKnownMove() {
    return knownMove;
  }
  public void setKnownMove(PokemonEvolutionKnownMove knownMove) {
    this.knownMove = knownMove;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("known_move_type")
  @NotNull
  public PokemonEvolutionKnownMove getKnownMoveType() {
    return knownMoveType;
  }
  public void setKnownMoveType(PokemonEvolutionKnownMove knownMoveType) {
    this.knownMoveType = knownMoveType;
  }

  /**
   * The location the evolution must be triggered at.
   **/
  
  @ApiModelProperty(required = true, value = "The location the evolution must be triggered at.")
  @JsonProperty("location")
  @NotNull
  public LocationSummary getLocation() {
    return location;
  }
  public void setLocation(LocationSummary location) {
    this.location = location;
  }

  /**
   * The minimum required level of the evolving Pokémon species to evolve into this Pokémon species.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  
  @ApiModelProperty(value = "The minimum required level of the evolving Pokémon species to evolve into this Pokémon species.")
  @JsonProperty("min_level")
 @Min(-2147483648) @Max(2147483647)  public Integer getMinLevel() {
    return minLevel;
  }
  public void setMinLevel(Integer minLevel) {
    this.minLevel = minLevel;
  }

  /**
   * The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  
  @ApiModelProperty(value = "The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species.")
  @JsonProperty("min_happiness")
 @Min(-2147483648) @Max(2147483647)  public Integer getMinHappiness() {
    return minHappiness;
  }
  public void setMinHappiness(Integer minHappiness) {
    this.minHappiness = minHappiness;
  }

  /**
   * The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  
  @ApiModelProperty(value = "The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species.")
  @JsonProperty("min_beauty")
 @Min(-2147483648) @Max(2147483647)  public Integer getMinBeauty() {
    return minBeauty;
  }
  public void setMinBeauty(Integer minBeauty) {
    this.minBeauty = minBeauty;
  }

  /**
   * The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  
  @ApiModelProperty(value = "The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species.")
  @JsonProperty("min_affection")
 @Min(-2147483648) @Max(2147483647)  public Integer getMinAffection() {
    return minAffection;
  }
  public void setMinAffection(Integer minAffection) {
    this.minAffection = minAffection;
  }

  /**
   * Whether or not you need to be near a Moss Rock or Icy Rock to evolve into this Pokémon species.
   **/
  
  @ApiModelProperty(value = "Whether or not you need to be near a Moss Rock or Icy Rock to evolve into this Pokémon species.")
  @JsonProperty("near_special_rock")
  public Boolean getNearSpecialRock() {
    return nearSpecialRock;
  }
  public void setNearSpecialRock(Boolean nearSpecialRock) {
    this.nearSpecialRock = nearSpecialRock;
  }

  /**
   * Whether or not multiplayer link play is needed to evolve into this Pokémon species (e.g. Union Circle).
   **/
  
  @ApiModelProperty(value = "Whether or not multiplayer link play is needed to evolve into this Pokémon species (e.g. Union Circle).")
  @JsonProperty("needs_multiplayer")
  public Boolean getNeedsMultiplayer() {
    return needsMultiplayer;
  }
  public void setNeedsMultiplayer(Boolean needsMultiplayer) {
    this.needsMultiplayer = needsMultiplayer;
  }

  /**
   * Whether or not it must be raining in the overworld to cause evolution this Pokémon species.
   **/
  
  @ApiModelProperty(value = "Whether or not it must be raining in the overworld to cause evolution this Pokémon species.")
  @JsonProperty("needs_overworld_rain")
  public Boolean getNeedsOverworldRain() {
    return needsOverworldRain;
  }
  public void setNeedsOverworldRain(Boolean needsOverworldRain) {
    this.needsOverworldRain = needsOverworldRain;
  }

  /**
   * The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species.
   **/
  
  @ApiModelProperty(required = true, value = "The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species.")
  @JsonProperty("party_species")
  @NotNull
  public PokemonSpeciesSummary getPartySpecies() {
    return partySpecies;
  }
  public void setPartySpecies(PokemonSpeciesSummary partySpecies) {
    this.partySpecies = partySpecies;
  }

  /**
   * The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species.
   **/
  
  @ApiModelProperty(required = true, value = "The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species.")
  @JsonProperty("party_type")
  @NotNull
  public TypeSummary getPartyType() {
    return partyType;
  }
  public void setPartyType(TypeSummary partyType) {
    this.partyType = partyType;
  }

  /**
   * The required relation between the Pokémon&#39;s Attack and Defense stats. 1 means Attack &gt; Defense. 0 means Attack &#x3D; Defense. -1 means Attack &lt; Defense.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  
  @ApiModelProperty(value = "The required relation between the Pokémon's Attack and Defense stats. 1 means Attack > Defense. 0 means Attack = Defense. -1 means Attack < Defense.")
  @JsonProperty("relative_physical_stats")
 @Min(-2147483648) @Max(2147483647)  public Integer getRelativePhysicalStats() {
    return relativePhysicalStats;
  }
  public void setRelativePhysicalStats(Integer relativePhysicalStats) {
    this.relativePhysicalStats = relativePhysicalStats;
  }

  /**
   * The required time of day. Day or night.
   **/
  
  @ApiModelProperty(value = "The required time of day. Day or night.")
  @JsonProperty("time_of_day")
 @Size(max=10)  public String getTimeOfDay() {
    return timeOfDay;
  }
  public void setTimeOfDay(String timeOfDay) {
    this.timeOfDay = timeOfDay;
  }

  /**
   * Pokémon species for which this one must be traded.
   **/
  
  @ApiModelProperty(required = true, value = "Pokémon species for which this one must be traded.")
  @JsonProperty("trade_species")
  @NotNull
  public PokemonSpeciesSummary getTradeSpecies() {
    return tradeSpecies;
  }
  public void setTradeSpecies(PokemonSpeciesSummary tradeSpecies) {
    this.tradeSpecies = tradeSpecies;
  }

  /**
   * Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up.
   **/
  
  @ApiModelProperty(value = "Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up.")
  @JsonProperty("turn_upside_down")
  public Boolean getTurnUpsideDown() {
    return turnUpsideDown;
  }
  public void setTurnUpsideDown(Boolean turnUpsideDown) {
    this.turnUpsideDown = turnUpsideDown;
  }

  /**
   * The required region in which this evolution can occur.
   **/
  
  @ApiModelProperty(required = true, value = "The required region in which this evolution can occur.")
  @JsonProperty("region")
  @NotNull
  public RegionSummary getRegion() {
    return region;
  }
  public void setRegion(RegionSummary region) {
    this.region = region;
  }

  /**
   * The Pokémon form required before evolving, or null if unrestricted.
   **/
  
  @ApiModelProperty(required = true, value = "The Pokémon form required before evolving, or null if unrestricted.")
  @JsonProperty("required_pokemon_form")
  @NotNull
  public PokemonFormSummary getRequiredPokemonForm() {
    return requiredPokemonForm;
  }
  public void setRequiredPokemonForm(PokemonFormSummary requiredPokemonForm) {
    this.requiredPokemonForm = requiredPokemonForm;
  }

  /**
   * The Pokémon form produced by this evolution, or null if unspecified.
   **/
  
  @ApiModelProperty(required = true, value = "The Pokémon form produced by this evolution, or null if unspecified.")
  @JsonProperty("evolved_pokemon_form")
  @NotNull
  public PokemonFormSummary getEvolvedPokemonForm() {
    return evolvedPokemonForm;
  }
  public void setEvolvedPokemonForm(PokemonFormSummary evolvedPokemonForm) {
    this.evolvedPokemonForm = evolvedPokemonForm;
  }

  /**
   * The move that must be used by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species.
   **/
  
  @ApiModelProperty(required = true, value = "The move that must be used by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species.")
  @JsonProperty("used_move")
  @NotNull
  public MoveSummary getUsedMove() {
    return usedMove;
  }
  public void setUsedMove(MoveSummary usedMove) {
    this.usedMove = usedMove;
  }

  /**
   * The minimum number of times a move must be used in order to evolve into this Pokémon species.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  
  @ApiModelProperty(value = "The minimum number of times a move must be used in order to evolve into this Pokémon species.")
  @JsonProperty("min_move_count")
 @Min(-2147483648) @Max(2147483647)  public Integer getMinMoveCount() {
    return minMoveCount;
  }
  public void setMinMoveCount(Integer minMoveCount) {
    this.minMoveCount = minMoveCount;
  }

  /**
   * The minimum number of steps that must be taken in order to evolve into this Pokémon species.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  
  @ApiModelProperty(value = "The minimum number of steps that must be taken in order to evolve into this Pokémon species.")
  @JsonProperty("min_steps")
 @Min(-2147483648) @Max(2147483647)  public Integer getMinSteps() {
    return minSteps;
  }
  public void setMinSteps(Integer minSteps) {
    this.minSteps = minSteps;
  }

  /**
   * The minimum amount of damage taken during the evolution trigger event in order to evolve into this Pokémon species.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  
  @ApiModelProperty(value = "The minimum amount of damage taken during the evolution trigger event in order to evolve into this Pokémon species.")
  @JsonProperty("min_damage_taken")
 @Min(-2147483648) @Max(2147483647)  public Integer getMinDamageTaken() {
    return minDamageTaken;
  }
  public void setMinDamageTaken(Integer minDamageTaken) {
    this.minDamageTaken = minDamageTaken;
  }

  /**
   * The natures that allow this evolution, or null if unrestricted.
   **/
  
  @ApiModelProperty(required = true, value = "The natures that allow this evolution, or null if unrestricted.")
  @JsonProperty("allowed_natures")
  @NotNull
  public List<@Valid NatureSummary> getAllowedNatures() {
    return allowedNatures;
  }
  public void setAllowedNatures(List<@Valid NatureSummary> allowedNatures) {
    this.allowedNatures = allowedNatures;
  }

  /**
   * An additional evolution condition expressed in reverse Polish notation, or null if none.
   **/
  
  @ApiModelProperty(required = true, value = "An additional evolution condition expressed in reverse Polish notation, or null if none.")
  @JsonProperty("condition_expression")
  @NotNull
  public EvolutionConditionExpression getConditionExpression() {
    return conditionExpression;
  }
  public void setConditionExpression(EvolutionConditionExpression conditionExpression) {
    this.conditionExpression = conditionExpression;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonEvolution pokemonEvolution = (PokemonEvolution) o;
    return Objects.equals(this.versionGroup, pokemonEvolution.versionGroup) &&
        Objects.equals(this.isDefault, pokemonEvolution.isDefault) &&
        Objects.equals(this.item, pokemonEvolution.item) &&
        Objects.equals(this.trigger, pokemonEvolution.trigger) &&
        Objects.equals(this.gender, pokemonEvolution.gender) &&
        Objects.equals(this.heldItem, pokemonEvolution.heldItem) &&
        Objects.equals(this.knownMove, pokemonEvolution.knownMove) &&
        Objects.equals(this.knownMoveType, pokemonEvolution.knownMoveType) &&
        Objects.equals(this.location, pokemonEvolution.location) &&
        Objects.equals(this.minLevel, pokemonEvolution.minLevel) &&
        Objects.equals(this.minHappiness, pokemonEvolution.minHappiness) &&
        Objects.equals(this.minBeauty, pokemonEvolution.minBeauty) &&
        Objects.equals(this.minAffection, pokemonEvolution.minAffection) &&
        Objects.equals(this.nearSpecialRock, pokemonEvolution.nearSpecialRock) &&
        Objects.equals(this.needsMultiplayer, pokemonEvolution.needsMultiplayer) &&
        Objects.equals(this.needsOverworldRain, pokemonEvolution.needsOverworldRain) &&
        Objects.equals(this.partySpecies, pokemonEvolution.partySpecies) &&
        Objects.equals(this.partyType, pokemonEvolution.partyType) &&
        Objects.equals(this.relativePhysicalStats, pokemonEvolution.relativePhysicalStats) &&
        Objects.equals(this.timeOfDay, pokemonEvolution.timeOfDay) &&
        Objects.equals(this.tradeSpecies, pokemonEvolution.tradeSpecies) &&
        Objects.equals(this.turnUpsideDown, pokemonEvolution.turnUpsideDown) &&
        Objects.equals(this.region, pokemonEvolution.region) &&
        Objects.equals(this.requiredPokemonForm, pokemonEvolution.requiredPokemonForm) &&
        Objects.equals(this.evolvedPokemonForm, pokemonEvolution.evolvedPokemonForm) &&
        Objects.equals(this.usedMove, pokemonEvolution.usedMove) &&
        Objects.equals(this.minMoveCount, pokemonEvolution.minMoveCount) &&
        Objects.equals(this.minSteps, pokemonEvolution.minSteps) &&
        Objects.equals(this.minDamageTaken, pokemonEvolution.minDamageTaken) &&
        Objects.equals(this.allowedNatures, pokemonEvolution.allowedNatures) &&
        Objects.equals(this.conditionExpression, pokemonEvolution.conditionExpression);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionGroup, isDefault, item, trigger, gender, heldItem, knownMove, knownMoveType, location, minLevel, minHappiness, minBeauty, minAffection, nearSpecialRock, needsMultiplayer, needsOverworldRain, partySpecies, partyType, relativePhysicalStats, timeOfDay, tradeSpecies, turnUpsideDown, region, requiredPokemonForm, evolvedPokemonForm, usedMove, minMoveCount, minSteps, minDamageTaken, allowedNatures, conditionExpression);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonEvolution {\n");
    
    sb.append("    versionGroup: ").append(toIndentedString(versionGroup)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    heldItem: ").append(toIndentedString(heldItem)).append("\n");
    sb.append("    knownMove: ").append(toIndentedString(knownMove)).append("\n");
    sb.append("    knownMoveType: ").append(toIndentedString(knownMoveType)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    minLevel: ").append(toIndentedString(minLevel)).append("\n");
    sb.append("    minHappiness: ").append(toIndentedString(minHappiness)).append("\n");
    sb.append("    minBeauty: ").append(toIndentedString(minBeauty)).append("\n");
    sb.append("    minAffection: ").append(toIndentedString(minAffection)).append("\n");
    sb.append("    nearSpecialRock: ").append(toIndentedString(nearSpecialRock)).append("\n");
    sb.append("    needsMultiplayer: ").append(toIndentedString(needsMultiplayer)).append("\n");
    sb.append("    needsOverworldRain: ").append(toIndentedString(needsOverworldRain)).append("\n");
    sb.append("    partySpecies: ").append(toIndentedString(partySpecies)).append("\n");
    sb.append("    partyType: ").append(toIndentedString(partyType)).append("\n");
    sb.append("    relativePhysicalStats: ").append(toIndentedString(relativePhysicalStats)).append("\n");
    sb.append("    timeOfDay: ").append(toIndentedString(timeOfDay)).append("\n");
    sb.append("    tradeSpecies: ").append(toIndentedString(tradeSpecies)).append("\n");
    sb.append("    turnUpsideDown: ").append(toIndentedString(turnUpsideDown)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    requiredPokemonForm: ").append(toIndentedString(requiredPokemonForm)).append("\n");
    sb.append("    evolvedPokemonForm: ").append(toIndentedString(evolvedPokemonForm)).append("\n");
    sb.append("    usedMove: ").append(toIndentedString(usedMove)).append("\n");
    sb.append("    minMoveCount: ").append(toIndentedString(minMoveCount)).append("\n");
    sb.append("    minSteps: ").append(toIndentedString(minSteps)).append("\n");
    sb.append("    minDamageTaken: ").append(toIndentedString(minDamageTaken)).append("\n");
    sb.append("    allowedNatures: ").append(toIndentedString(allowedNatures)).append("\n");
    sb.append("    conditionExpression: ").append(toIndentedString(conditionExpression)).append("\n");
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

