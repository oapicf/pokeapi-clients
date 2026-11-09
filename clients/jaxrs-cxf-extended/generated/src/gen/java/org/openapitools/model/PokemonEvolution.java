package org.openapitools.model;

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

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonEvolution  {
  
 /**
  * The version group in which these evolution requirements apply.
  */
  @ApiModelProperty(required = true, value = "The version group in which these evolution requirements apply.")
  @Valid
  private VersionGroupSummary versionGroup;

 /**
  * Whether the evolution is considered as the expected evolution in a main series game. Each unique Pokémon variety of a line capable of evolution should have exactly one 'default' evolution. For example, the Meowth species has three default evolutions as there are three distinct varieties it can evolve into: Persian, Alolan Persian, and Perrserker.
  */
  @ApiModelProperty(value = "Whether the evolution is considered as the expected evolution in a main series game. Each unique Pokémon variety of a line capable of evolution should have exactly one 'default' evolution. For example, the Meowth species has three default evolutions as there are three distinct varieties it can evolve into: Persian, Alolan Persian, and Perrserker.")
  private Boolean isDefault;

 /**
  * The item required to cause evolution this into Pokémon species.
  */
  @ApiModelProperty(required = true, value = "The item required to cause evolution this into Pokémon species.")
  @Valid
  private ItemSummary item;

 /**
  * The type of event that triggers evolution into this Pokémon species.
  */
  @ApiModelProperty(required = true, value = "The type of event that triggers evolution into this Pokémon species.")
  @Valid
  private EvolutionTriggerSummary trigger;

 /**
  * The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species.
  */
  @ApiModelProperty(value = "The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species.")
  private Integer gender;

 /**
  * The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species.
  */
  @ApiModelProperty(required = true, value = "The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species.")
  @Valid
  private ItemSummary heldItem;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private PokemonEvolutionKnownMove knownMove;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private PokemonEvolutionKnownMove knownMoveType;

 /**
  * The location the evolution must be triggered at.
  */
  @ApiModelProperty(required = true, value = "The location the evolution must be triggered at.")
  @Valid
  private LocationSummary location;

 /**
  * The minimum required level of the evolving Pokémon species to evolve into this Pokémon species.
  */
  @ApiModelProperty(value = "The minimum required level of the evolving Pokémon species to evolve into this Pokémon species.")
  private Integer minLevel;

 /**
  * The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species.
  */
  @ApiModelProperty(value = "The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species.")
  private Integer minHappiness;

 /**
  * The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species.
  */
  @ApiModelProperty(value = "The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species.")
  private Integer minBeauty;

 /**
  * The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species.
  */
  @ApiModelProperty(value = "The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species.")
  private Integer minAffection;

 /**
  * Whether or not you need to be near a Moss Rock or Icy Rock to evolve into this Pokémon species.
  */
  @ApiModelProperty(value = "Whether or not you need to be near a Moss Rock or Icy Rock to evolve into this Pokémon species.")
  private Boolean nearSpecialRock;

 /**
  * Whether or not multiplayer link play is needed to evolve into this Pokémon species (e.g. Union Circle).
  */
  @ApiModelProperty(value = "Whether or not multiplayer link play is needed to evolve into this Pokémon species (e.g. Union Circle).")
  private Boolean needsMultiplayer;

 /**
  * Whether or not it must be raining in the overworld to cause evolution this Pokémon species.
  */
  @ApiModelProperty(value = "Whether or not it must be raining in the overworld to cause evolution this Pokémon species.")
  private Boolean needsOverworldRain;

 /**
  * The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species.
  */
  @ApiModelProperty(required = true, value = "The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species.")
  @Valid
  private PokemonSpeciesSummary partySpecies;

 /**
  * The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species.
  */
  @ApiModelProperty(required = true, value = "The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species.")
  @Valid
  private TypeSummary partyType;

 /**
  * The required relation between the Pokémon's Attack and Defense stats. 1 means Attack > Defense. 0 means Attack = Defense. -1 means Attack < Defense.
  */
  @ApiModelProperty(value = "The required relation between the Pokémon's Attack and Defense stats. 1 means Attack > Defense. 0 means Attack = Defense. -1 means Attack < Defense.")
  private Integer relativePhysicalStats;

 /**
  * The required time of day. Day or night.
  */
  @ApiModelProperty(value = "The required time of day. Day or night.")
  private String timeOfDay;

 /**
  * Pokémon species for which this one must be traded.
  */
  @ApiModelProperty(required = true, value = "Pokémon species for which this one must be traded.")
  @Valid
  private PokemonSpeciesSummary tradeSpecies;

 /**
  * Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up.
  */
  @ApiModelProperty(value = "Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up.")
  private Boolean turnUpsideDown;

 /**
  * The required region in which this evolution can occur.
  */
  @ApiModelProperty(required = true, value = "The required region in which this evolution can occur.")
  @Valid
  private RegionSummary region;

 /**
  * The Pokémon form required before evolving, or null if unrestricted.
  */
  @ApiModelProperty(required = true, value = "The Pokémon form required before evolving, or null if unrestricted.")
  @Valid
  private PokemonFormSummary requiredPokemonForm;

 /**
  * The Pokémon form produced by this evolution, or null if unspecified.
  */
  @ApiModelProperty(required = true, value = "The Pokémon form produced by this evolution, or null if unspecified.")
  @Valid
  private PokemonFormSummary evolvedPokemonForm;

 /**
  * The move that must be used by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species.
  */
  @ApiModelProperty(required = true, value = "The move that must be used by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species.")
  @Valid
  private MoveSummary usedMove;

 /**
  * The minimum number of times a move must be used in order to evolve into this Pokémon species.
  */
  @ApiModelProperty(value = "The minimum number of times a move must be used in order to evolve into this Pokémon species.")
  private Integer minMoveCount;

 /**
  * The minimum number of steps that must be taken in order to evolve into this Pokémon species.
  */
  @ApiModelProperty(value = "The minimum number of steps that must be taken in order to evolve into this Pokémon species.")
  private Integer minSteps;

 /**
  * The minimum amount of damage taken during the evolution trigger event in order to evolve into this Pokémon species.
  */
  @ApiModelProperty(value = "The minimum amount of damage taken during the evolution trigger event in order to evolve into this Pokémon species.")
  private Integer minDamageTaken;

 /**
  * The natures that allow this evolution, or null if unrestricted.
  */
  @ApiModelProperty(required = true, value = "The natures that allow this evolution, or null if unrestricted.")
  private List<@Valid NatureSummary> allowedNatures;

 /**
  * An additional evolution condition expressed in reverse Polish notation, or null if none.
  */
  @ApiModelProperty(required = true, value = "An additional evolution condition expressed in reverse Polish notation, or null if none.")
  @Valid
  private EvolutionConditionExpression conditionExpression;
 /**
  * The version group in which these evolution requirements apply.
  * @return versionGroup
  */
  @JsonProperty("version_group")
  @NotNull
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }

  /**
   * Sets the <code>versionGroup</code> property.
   */
 public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

  /**
   * Sets the <code>versionGroup</code> property.
   */
  public PokemonEvolution versionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
    return this;
  }

 /**
  * Whether the evolution is considered as the expected evolution in a main series game. Each unique Pokémon variety of a line capable of evolution should have exactly one &#39;default&#39; evolution. For example, the Meowth species has three default evolutions as there are three distinct varieties it can evolve into: Persian, Alolan Persian, and Perrserker.
  * @return isDefault
  */
  @JsonProperty("is_default")
  public Boolean getIsDefault() {
    return isDefault;
  }

  /**
   * Sets the <code>isDefault</code> property.
   */
 public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  /**
   * Sets the <code>isDefault</code> property.
   */
  public PokemonEvolution isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

 /**
  * The item required to cause evolution this into Pokémon species.
  * @return item
  */
  @JsonProperty("item")
  @NotNull
  public ItemSummary getItem() {
    return item;
  }

  /**
   * Sets the <code>item</code> property.
   */
 public void setItem(ItemSummary item) {
    this.item = item;
  }

  /**
   * Sets the <code>item</code> property.
   */
  public PokemonEvolution item(ItemSummary item) {
    this.item = item;
    return this;
  }

 /**
  * The type of event that triggers evolution into this Pokémon species.
  * @return trigger
  */
  @JsonProperty("trigger")
  @NotNull
  public EvolutionTriggerSummary getTrigger() {
    return trigger;
  }

  /**
   * Sets the <code>trigger</code> property.
   */
 public void setTrigger(EvolutionTriggerSummary trigger) {
    this.trigger = trigger;
  }

  /**
   * Sets the <code>trigger</code> property.
   */
  public PokemonEvolution trigger(EvolutionTriggerSummary trigger) {
    this.trigger = trigger;
    return this;
  }

 /**
  * The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species.
  * @return gender
  */
  @JsonProperty("gender")
  public Integer getGender() {
    return gender;
  }

  /**
   * Sets the <code>gender</code> property.
   */
 public void setGender(Integer gender) {
    this.gender = gender;
  }

  /**
   * Sets the <code>gender</code> property.
   */
  public PokemonEvolution gender(Integer gender) {
    this.gender = gender;
    return this;
  }

 /**
  * The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species.
  * @return heldItem
  */
  @JsonProperty("held_item")
  @NotNull
  public ItemSummary getHeldItem() {
    return heldItem;
  }

  /**
   * Sets the <code>heldItem</code> property.
   */
 public void setHeldItem(ItemSummary heldItem) {
    this.heldItem = heldItem;
  }

  /**
   * Sets the <code>heldItem</code> property.
   */
  public PokemonEvolution heldItem(ItemSummary heldItem) {
    this.heldItem = heldItem;
    return this;
  }

 /**
  * Get knownMove
  * @return knownMove
  */
  @JsonProperty("known_move")
  @NotNull
  public PokemonEvolutionKnownMove getKnownMove() {
    return knownMove;
  }

  /**
   * Sets the <code>knownMove</code> property.
   */
 public void setKnownMove(PokemonEvolutionKnownMove knownMove) {
    this.knownMove = knownMove;
  }

  /**
   * Sets the <code>knownMove</code> property.
   */
  public PokemonEvolution knownMove(PokemonEvolutionKnownMove knownMove) {
    this.knownMove = knownMove;
    return this;
  }

 /**
  * Get knownMoveType
  * @return knownMoveType
  */
  @JsonProperty("known_move_type")
  @NotNull
  public PokemonEvolutionKnownMove getKnownMoveType() {
    return knownMoveType;
  }

  /**
   * Sets the <code>knownMoveType</code> property.
   */
 public void setKnownMoveType(PokemonEvolutionKnownMove knownMoveType) {
    this.knownMoveType = knownMoveType;
  }

  /**
   * Sets the <code>knownMoveType</code> property.
   */
  public PokemonEvolution knownMoveType(PokemonEvolutionKnownMove knownMoveType) {
    this.knownMoveType = knownMoveType;
    return this;
  }

 /**
  * The location the evolution must be triggered at.
  * @return location
  */
  @JsonProperty("location")
  @NotNull
  public LocationSummary getLocation() {
    return location;
  }

  /**
   * Sets the <code>location</code> property.
   */
 public void setLocation(LocationSummary location) {
    this.location = location;
  }

  /**
   * Sets the <code>location</code> property.
   */
  public PokemonEvolution location(LocationSummary location) {
    this.location = location;
    return this;
  }

 /**
  * The minimum required level of the evolving Pokémon species to evolve into this Pokémon species.
  * minimum: -2147483648
  * maximum: 2147483647
  * @return minLevel
  */
  @JsonProperty("min_level")
 @Min(-2147483648) @Max(2147483647)  public Integer getMinLevel() {
    return minLevel;
  }

  /**
   * Sets the <code>minLevel</code> property.
   */
 public void setMinLevel(Integer minLevel) {
    this.minLevel = minLevel;
  }

  /**
   * Sets the <code>minLevel</code> property.
   */
  public PokemonEvolution minLevel(Integer minLevel) {
    this.minLevel = minLevel;
    return this;
  }

 /**
  * The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species.
  * minimum: -2147483648
  * maximum: 2147483647
  * @return minHappiness
  */
  @JsonProperty("min_happiness")
 @Min(-2147483648) @Max(2147483647)  public Integer getMinHappiness() {
    return minHappiness;
  }

  /**
   * Sets the <code>minHappiness</code> property.
   */
 public void setMinHappiness(Integer minHappiness) {
    this.minHappiness = minHappiness;
  }

  /**
   * Sets the <code>minHappiness</code> property.
   */
  public PokemonEvolution minHappiness(Integer minHappiness) {
    this.minHappiness = minHappiness;
    return this;
  }

 /**
  * The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species.
  * minimum: -2147483648
  * maximum: 2147483647
  * @return minBeauty
  */
  @JsonProperty("min_beauty")
 @Min(-2147483648) @Max(2147483647)  public Integer getMinBeauty() {
    return minBeauty;
  }

  /**
   * Sets the <code>minBeauty</code> property.
   */
 public void setMinBeauty(Integer minBeauty) {
    this.minBeauty = minBeauty;
  }

  /**
   * Sets the <code>minBeauty</code> property.
   */
  public PokemonEvolution minBeauty(Integer minBeauty) {
    this.minBeauty = minBeauty;
    return this;
  }

 /**
  * The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species.
  * minimum: -2147483648
  * maximum: 2147483647
  * @return minAffection
  */
  @JsonProperty("min_affection")
 @Min(-2147483648) @Max(2147483647)  public Integer getMinAffection() {
    return minAffection;
  }

  /**
   * Sets the <code>minAffection</code> property.
   */
 public void setMinAffection(Integer minAffection) {
    this.minAffection = minAffection;
  }

  /**
   * Sets the <code>minAffection</code> property.
   */
  public PokemonEvolution minAffection(Integer minAffection) {
    this.minAffection = minAffection;
    return this;
  }

 /**
  * Whether or not you need to be near a Moss Rock or Icy Rock to evolve into this Pokémon species.
  * @return nearSpecialRock
  */
  @JsonProperty("near_special_rock")
  public Boolean getNearSpecialRock() {
    return nearSpecialRock;
  }

  /**
   * Sets the <code>nearSpecialRock</code> property.
   */
 public void setNearSpecialRock(Boolean nearSpecialRock) {
    this.nearSpecialRock = nearSpecialRock;
  }

  /**
   * Sets the <code>nearSpecialRock</code> property.
   */
  public PokemonEvolution nearSpecialRock(Boolean nearSpecialRock) {
    this.nearSpecialRock = nearSpecialRock;
    return this;
  }

 /**
  * Whether or not multiplayer link play is needed to evolve into this Pokémon species (e.g. Union Circle).
  * @return needsMultiplayer
  */
  @JsonProperty("needs_multiplayer")
  public Boolean getNeedsMultiplayer() {
    return needsMultiplayer;
  }

  /**
   * Sets the <code>needsMultiplayer</code> property.
   */
 public void setNeedsMultiplayer(Boolean needsMultiplayer) {
    this.needsMultiplayer = needsMultiplayer;
  }

  /**
   * Sets the <code>needsMultiplayer</code> property.
   */
  public PokemonEvolution needsMultiplayer(Boolean needsMultiplayer) {
    this.needsMultiplayer = needsMultiplayer;
    return this;
  }

 /**
  * Whether or not it must be raining in the overworld to cause evolution this Pokémon species.
  * @return needsOverworldRain
  */
  @JsonProperty("needs_overworld_rain")
  public Boolean getNeedsOverworldRain() {
    return needsOverworldRain;
  }

  /**
   * Sets the <code>needsOverworldRain</code> property.
   */
 public void setNeedsOverworldRain(Boolean needsOverworldRain) {
    this.needsOverworldRain = needsOverworldRain;
  }

  /**
   * Sets the <code>needsOverworldRain</code> property.
   */
  public PokemonEvolution needsOverworldRain(Boolean needsOverworldRain) {
    this.needsOverworldRain = needsOverworldRain;
    return this;
  }

 /**
  * The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species.
  * @return partySpecies
  */
  @JsonProperty("party_species")
  @NotNull
  public PokemonSpeciesSummary getPartySpecies() {
    return partySpecies;
  }

  /**
   * Sets the <code>partySpecies</code> property.
   */
 public void setPartySpecies(PokemonSpeciesSummary partySpecies) {
    this.partySpecies = partySpecies;
  }

  /**
   * Sets the <code>partySpecies</code> property.
   */
  public PokemonEvolution partySpecies(PokemonSpeciesSummary partySpecies) {
    this.partySpecies = partySpecies;
    return this;
  }

 /**
  * The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species.
  * @return partyType
  */
  @JsonProperty("party_type")
  @NotNull
  public TypeSummary getPartyType() {
    return partyType;
  }

  /**
   * Sets the <code>partyType</code> property.
   */
 public void setPartyType(TypeSummary partyType) {
    this.partyType = partyType;
  }

  /**
   * Sets the <code>partyType</code> property.
   */
  public PokemonEvolution partyType(TypeSummary partyType) {
    this.partyType = partyType;
    return this;
  }

 /**
  * The required relation between the Pokémon&#39;s Attack and Defense stats. 1 means Attack &gt; Defense. 0 means Attack &#x3D; Defense. -1 means Attack &lt; Defense.
  * minimum: -2147483648
  * maximum: 2147483647
  * @return relativePhysicalStats
  */
  @JsonProperty("relative_physical_stats")
 @Min(-2147483648) @Max(2147483647)  public Integer getRelativePhysicalStats() {
    return relativePhysicalStats;
  }

  /**
   * Sets the <code>relativePhysicalStats</code> property.
   */
 public void setRelativePhysicalStats(Integer relativePhysicalStats) {
    this.relativePhysicalStats = relativePhysicalStats;
  }

  /**
   * Sets the <code>relativePhysicalStats</code> property.
   */
  public PokemonEvolution relativePhysicalStats(Integer relativePhysicalStats) {
    this.relativePhysicalStats = relativePhysicalStats;
    return this;
  }

 /**
  * The required time of day. Day or night.
  * @return timeOfDay
  */
  @JsonProperty("time_of_day")
 @Size(max=10)  public String getTimeOfDay() {
    return timeOfDay;
  }

  /**
   * Sets the <code>timeOfDay</code> property.
   */
 public void setTimeOfDay(String timeOfDay) {
    this.timeOfDay = timeOfDay;
  }

  /**
   * Sets the <code>timeOfDay</code> property.
   */
  public PokemonEvolution timeOfDay(String timeOfDay) {
    this.timeOfDay = timeOfDay;
    return this;
  }

 /**
  * Pokémon species for which this one must be traded.
  * @return tradeSpecies
  */
  @JsonProperty("trade_species")
  @NotNull
  public PokemonSpeciesSummary getTradeSpecies() {
    return tradeSpecies;
  }

  /**
   * Sets the <code>tradeSpecies</code> property.
   */
 public void setTradeSpecies(PokemonSpeciesSummary tradeSpecies) {
    this.tradeSpecies = tradeSpecies;
  }

  /**
   * Sets the <code>tradeSpecies</code> property.
   */
  public PokemonEvolution tradeSpecies(PokemonSpeciesSummary tradeSpecies) {
    this.tradeSpecies = tradeSpecies;
    return this;
  }

 /**
  * Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up.
  * @return turnUpsideDown
  */
  @JsonProperty("turn_upside_down")
  public Boolean getTurnUpsideDown() {
    return turnUpsideDown;
  }

  /**
   * Sets the <code>turnUpsideDown</code> property.
   */
 public void setTurnUpsideDown(Boolean turnUpsideDown) {
    this.turnUpsideDown = turnUpsideDown;
  }

  /**
   * Sets the <code>turnUpsideDown</code> property.
   */
  public PokemonEvolution turnUpsideDown(Boolean turnUpsideDown) {
    this.turnUpsideDown = turnUpsideDown;
    return this;
  }

 /**
  * The required region in which this evolution can occur.
  * @return region
  */
  @JsonProperty("region")
  @NotNull
  public RegionSummary getRegion() {
    return region;
  }

  /**
   * Sets the <code>region</code> property.
   */
 public void setRegion(RegionSummary region) {
    this.region = region;
  }

  /**
   * Sets the <code>region</code> property.
   */
  public PokemonEvolution region(RegionSummary region) {
    this.region = region;
    return this;
  }

 /**
  * The Pokémon form required before evolving, or null if unrestricted.
  * @return requiredPokemonForm
  */
  @JsonProperty("required_pokemon_form")
  @NotNull
  public PokemonFormSummary getRequiredPokemonForm() {
    return requiredPokemonForm;
  }

  /**
   * Sets the <code>requiredPokemonForm</code> property.
   */
 public void setRequiredPokemonForm(PokemonFormSummary requiredPokemonForm) {
    this.requiredPokemonForm = requiredPokemonForm;
  }

  /**
   * Sets the <code>requiredPokemonForm</code> property.
   */
  public PokemonEvolution requiredPokemonForm(PokemonFormSummary requiredPokemonForm) {
    this.requiredPokemonForm = requiredPokemonForm;
    return this;
  }

 /**
  * The Pokémon form produced by this evolution, or null if unspecified.
  * @return evolvedPokemonForm
  */
  @JsonProperty("evolved_pokemon_form")
  @NotNull
  public PokemonFormSummary getEvolvedPokemonForm() {
    return evolvedPokemonForm;
  }

  /**
   * Sets the <code>evolvedPokemonForm</code> property.
   */
 public void setEvolvedPokemonForm(PokemonFormSummary evolvedPokemonForm) {
    this.evolvedPokemonForm = evolvedPokemonForm;
  }

  /**
   * Sets the <code>evolvedPokemonForm</code> property.
   */
  public PokemonEvolution evolvedPokemonForm(PokemonFormSummary evolvedPokemonForm) {
    this.evolvedPokemonForm = evolvedPokemonForm;
    return this;
  }

 /**
  * The move that must be used by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species.
  * @return usedMove
  */
  @JsonProperty("used_move")
  @NotNull
  public MoveSummary getUsedMove() {
    return usedMove;
  }

  /**
   * Sets the <code>usedMove</code> property.
   */
 public void setUsedMove(MoveSummary usedMove) {
    this.usedMove = usedMove;
  }

  /**
   * Sets the <code>usedMove</code> property.
   */
  public PokemonEvolution usedMove(MoveSummary usedMove) {
    this.usedMove = usedMove;
    return this;
  }

 /**
  * The minimum number of times a move must be used in order to evolve into this Pokémon species.
  * minimum: -2147483648
  * maximum: 2147483647
  * @return minMoveCount
  */
  @JsonProperty("min_move_count")
 @Min(-2147483648) @Max(2147483647)  public Integer getMinMoveCount() {
    return minMoveCount;
  }

  /**
   * Sets the <code>minMoveCount</code> property.
   */
 public void setMinMoveCount(Integer minMoveCount) {
    this.minMoveCount = minMoveCount;
  }

  /**
   * Sets the <code>minMoveCount</code> property.
   */
  public PokemonEvolution minMoveCount(Integer minMoveCount) {
    this.minMoveCount = minMoveCount;
    return this;
  }

 /**
  * The minimum number of steps that must be taken in order to evolve into this Pokémon species.
  * minimum: -2147483648
  * maximum: 2147483647
  * @return minSteps
  */
  @JsonProperty("min_steps")
 @Min(-2147483648) @Max(2147483647)  public Integer getMinSteps() {
    return minSteps;
  }

  /**
   * Sets the <code>minSteps</code> property.
   */
 public void setMinSteps(Integer minSteps) {
    this.minSteps = minSteps;
  }

  /**
   * Sets the <code>minSteps</code> property.
   */
  public PokemonEvolution minSteps(Integer minSteps) {
    this.minSteps = minSteps;
    return this;
  }

 /**
  * The minimum amount of damage taken during the evolution trigger event in order to evolve into this Pokémon species.
  * minimum: -2147483648
  * maximum: 2147483647
  * @return minDamageTaken
  */
  @JsonProperty("min_damage_taken")
 @Min(-2147483648) @Max(2147483647)  public Integer getMinDamageTaken() {
    return minDamageTaken;
  }

  /**
   * Sets the <code>minDamageTaken</code> property.
   */
 public void setMinDamageTaken(Integer minDamageTaken) {
    this.minDamageTaken = minDamageTaken;
  }

  /**
   * Sets the <code>minDamageTaken</code> property.
   */
  public PokemonEvolution minDamageTaken(Integer minDamageTaken) {
    this.minDamageTaken = minDamageTaken;
    return this;
  }

 /**
  * The natures that allow this evolution, or null if unrestricted.
  * @return allowedNatures
  */
  @JsonProperty("allowed_natures")
  @NotNull
  public List<@Valid NatureSummary> getAllowedNatures() {
    return allowedNatures;
  }

  /**
   * Sets the <code>allowedNatures</code> property.
   * <br><em>N.B. <code>allowedNatures</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setAllowedNatures(List<@Valid NatureSummary> allowedNatures) {
    this.allowedNatures = allowedNatures;
  }

  /**
   * Sets the <code>allowedNatures</code> property.
   * <br><em>N.B. <code>allowedNatures</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokemonEvolution allowedNatures(List<@Valid NatureSummary> allowedNatures) {
    this.allowedNatures = allowedNatures;
    return this;
  }

  /**
   * Adds a new item to the <code>allowedNatures</code> list.
   * <br><em>N.B. <code>allowedNatures</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokemonEvolution addAllowedNaturesItem(NatureSummary allowedNaturesItem) {
    this.allowedNatures.add(allowedNaturesItem);
    return this;
  }

 /**
  * An additional evolution condition expressed in reverse Polish notation, or null if none.
  * @return conditionExpression
  */
  @JsonProperty("condition_expression")
  @NotNull
  public EvolutionConditionExpression getConditionExpression() {
    return conditionExpression;
  }

  /**
   * Sets the <code>conditionExpression</code> property.
   * <br><em>N.B. <code>conditionExpression</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setConditionExpression(EvolutionConditionExpression conditionExpression) {
    this.conditionExpression = conditionExpression;
  }

  /**
   * Sets the <code>conditionExpression</code> property.
   * <br><em>N.B. <code>conditionExpression</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokemonEvolution conditionExpression(EvolutionConditionExpression conditionExpression) {
    this.conditionExpression = conditionExpression;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

