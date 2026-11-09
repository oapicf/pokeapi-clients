package org.openapitools.model;

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
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("PokemonEvolution")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-11-09T13:50:06.168269698Z[Etc/UTC]", comments = "Generator version: 7.26.0")
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

  public PokemonEvolution() {
  }

  @JsonCreator
  public PokemonEvolution(
    @JsonProperty(required = true, value = "version_group") VersionGroupSummary versionGroup,
    @JsonProperty(required = true, value = "item") ItemSummary item,
    @JsonProperty(required = true, value = "trigger") EvolutionTriggerSummary trigger,
    @JsonProperty(required = true, value = "held_item") ItemSummary heldItem,
    @JsonProperty(required = true, value = "known_move") PokemonEvolutionKnownMove knownMove,
    @JsonProperty(required = true, value = "known_move_type") PokemonEvolutionKnownMove knownMoveType,
    @JsonProperty(required = true, value = "location") LocationSummary location,
    @JsonProperty(required = true, value = "party_species") PokemonSpeciesSummary partySpecies,
    @JsonProperty(required = true, value = "party_type") TypeSummary partyType,
    @JsonProperty(required = true, value = "trade_species") PokemonSpeciesSummary tradeSpecies,
    @JsonProperty(required = true, value = "region") RegionSummary region,
    @JsonProperty(required = true, value = "required_pokemon_form") PokemonFormSummary requiredPokemonForm,
    @JsonProperty(required = true, value = "evolved_pokemon_form") PokemonFormSummary evolvedPokemonForm,
    @JsonProperty(required = true, value = "used_move") MoveSummary usedMove,
    @JsonProperty(required = true, value = "allowed_natures") List<@Valid NatureSummary> allowedNatures,
    @JsonProperty(required = true, value = "condition_expression") EvolutionConditionExpression conditionExpression
  ) {
    this.versionGroup = versionGroup;
    this.item = item;
    this.trigger = trigger;
    this.heldItem = heldItem;
    this.knownMove = knownMove;
    this.knownMoveType = knownMoveType;
    this.location = location;
    this.partySpecies = partySpecies;
    this.partyType = partyType;
    this.tradeSpecies = tradeSpecies;
    this.region = region;
    this.requiredPokemonForm = requiredPokemonForm;
    this.evolvedPokemonForm = evolvedPokemonForm;
    this.usedMove = usedMove;
    this.allowedNatures = allowedNatures;
    this.conditionExpression = conditionExpression;
  }

  /**
   * The version group in which these evolution requirements apply.
   **/
  public PokemonEvolution versionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The version group in which these evolution requirements apply.")
  @JsonProperty(required = true, value = "version_group")
  @NotNull @Valid public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }

  @JsonProperty(required = true, value = "version_group")
  public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

  /**
   * Whether the evolution is considered as the expected evolution in a main series game. Each unique Pokémon variety of a line capable of evolution should have exactly one &#39;default&#39; evolution. For example, the Meowth species has three default evolutions as there are three distinct varieties it can evolve into: Persian, Alolan Persian, and Perrserker.
   **/
  public PokemonEvolution isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  
  @ApiModelProperty(value = "Whether the evolution is considered as the expected evolution in a main series game. Each unique Pokémon variety of a line capable of evolution should have exactly one 'default' evolution. For example, the Meowth species has three default evolutions as there are three distinct varieties it can evolve into: Persian, Alolan Persian, and Perrserker.")
  @JsonProperty("is_default")
  public Boolean getIsDefault() {
    return isDefault;
  }

  @JsonProperty("is_default")
  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  /**
   * The item required to cause evolution this into Pokémon species.
   **/
  public PokemonEvolution item(ItemSummary item) {
    this.item = item;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The item required to cause evolution this into Pokémon species.")
  @JsonProperty(required = true, value = "item")
  @NotNull @Valid public ItemSummary getItem() {
    return item;
  }

  @JsonProperty(required = true, value = "item")
  public void setItem(ItemSummary item) {
    this.item = item;
  }

  /**
   * The type of event that triggers evolution into this Pokémon species.
   **/
  public PokemonEvolution trigger(EvolutionTriggerSummary trigger) {
    this.trigger = trigger;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The type of event that triggers evolution into this Pokémon species.")
  @JsonProperty(required = true, value = "trigger")
  @NotNull @Valid public EvolutionTriggerSummary getTrigger() {
    return trigger;
  }

  @JsonProperty(required = true, value = "trigger")
  public void setTrigger(EvolutionTriggerSummary trigger) {
    this.trigger = trigger;
  }

  /**
   * The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species.
   **/
  public PokemonEvolution gender(Integer gender) {
    this.gender = gender;
    return this;
  }

  
  @ApiModelProperty(value = "The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species.")
  @JsonProperty("gender")
  public Integer getGender() {
    return gender;
  }

  @JsonProperty("gender")
  public void setGender(Integer gender) {
    this.gender = gender;
  }

  /**
   * The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species.
   **/
  public PokemonEvolution heldItem(ItemSummary heldItem) {
    this.heldItem = heldItem;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species.")
  @JsonProperty(required = true, value = "held_item")
  @NotNull @Valid public ItemSummary getHeldItem() {
    return heldItem;
  }

  @JsonProperty(required = true, value = "held_item")
  public void setHeldItem(ItemSummary heldItem) {
    this.heldItem = heldItem;
  }

  /**
   **/
  public PokemonEvolution knownMove(PokemonEvolutionKnownMove knownMove) {
    this.knownMove = knownMove;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "known_move")
  @NotNull @Valid public PokemonEvolutionKnownMove getKnownMove() {
    return knownMove;
  }

  @JsonProperty(required = true, value = "known_move")
  public void setKnownMove(PokemonEvolutionKnownMove knownMove) {
    this.knownMove = knownMove;
  }

  /**
   **/
  public PokemonEvolution knownMoveType(PokemonEvolutionKnownMove knownMoveType) {
    this.knownMoveType = knownMoveType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "known_move_type")
  @NotNull @Valid public PokemonEvolutionKnownMove getKnownMoveType() {
    return knownMoveType;
  }

  @JsonProperty(required = true, value = "known_move_type")
  public void setKnownMoveType(PokemonEvolutionKnownMove knownMoveType) {
    this.knownMoveType = knownMoveType;
  }

  /**
   * The location the evolution must be triggered at.
   **/
  public PokemonEvolution location(LocationSummary location) {
    this.location = location;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The location the evolution must be triggered at.")
  @JsonProperty(required = true, value = "location")
  @NotNull @Valid public LocationSummary getLocation() {
    return location;
  }

  @JsonProperty(required = true, value = "location")
  public void setLocation(LocationSummary location) {
    this.location = location;
  }

  /**
   * The minimum required level of the evolving Pokémon species to evolve into this Pokémon species.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public PokemonEvolution minLevel(Integer minLevel) {
    this.minLevel = minLevel;
    return this;
  }

  
  @ApiModelProperty(value = "The minimum required level of the evolving Pokémon species to evolve into this Pokémon species.")
  @JsonProperty("min_level")
   @Min(-2147483648) @Max(2147483647)public Integer getMinLevel() {
    return minLevel;
  }

  @JsonProperty("min_level")
  public void setMinLevel(Integer minLevel) {
    this.minLevel = minLevel;
  }

  /**
   * The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public PokemonEvolution minHappiness(Integer minHappiness) {
    this.minHappiness = minHappiness;
    return this;
  }

  
  @ApiModelProperty(value = "The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species.")
  @JsonProperty("min_happiness")
   @Min(-2147483648) @Max(2147483647)public Integer getMinHappiness() {
    return minHappiness;
  }

  @JsonProperty("min_happiness")
  public void setMinHappiness(Integer minHappiness) {
    this.minHappiness = minHappiness;
  }

  /**
   * The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public PokemonEvolution minBeauty(Integer minBeauty) {
    this.minBeauty = minBeauty;
    return this;
  }

  
  @ApiModelProperty(value = "The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species.")
  @JsonProperty("min_beauty")
   @Min(-2147483648) @Max(2147483647)public Integer getMinBeauty() {
    return minBeauty;
  }

  @JsonProperty("min_beauty")
  public void setMinBeauty(Integer minBeauty) {
    this.minBeauty = minBeauty;
  }

  /**
   * The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public PokemonEvolution minAffection(Integer minAffection) {
    this.minAffection = minAffection;
    return this;
  }

  
  @ApiModelProperty(value = "The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species.")
  @JsonProperty("min_affection")
   @Min(-2147483648) @Max(2147483647)public Integer getMinAffection() {
    return minAffection;
  }

  @JsonProperty("min_affection")
  public void setMinAffection(Integer minAffection) {
    this.minAffection = minAffection;
  }

  /**
   * Whether or not you need to be near a Moss Rock or Icy Rock to evolve into this Pokémon species.
   **/
  public PokemonEvolution nearSpecialRock(Boolean nearSpecialRock) {
    this.nearSpecialRock = nearSpecialRock;
    return this;
  }

  
  @ApiModelProperty(value = "Whether or not you need to be near a Moss Rock or Icy Rock to evolve into this Pokémon species.")
  @JsonProperty("near_special_rock")
  public Boolean getNearSpecialRock() {
    return nearSpecialRock;
  }

  @JsonProperty("near_special_rock")
  public void setNearSpecialRock(Boolean nearSpecialRock) {
    this.nearSpecialRock = nearSpecialRock;
  }

  /**
   * Whether or not multiplayer link play is needed to evolve into this Pokémon species (e.g. Union Circle).
   **/
  public PokemonEvolution needsMultiplayer(Boolean needsMultiplayer) {
    this.needsMultiplayer = needsMultiplayer;
    return this;
  }

  
  @ApiModelProperty(value = "Whether or not multiplayer link play is needed to evolve into this Pokémon species (e.g. Union Circle).")
  @JsonProperty("needs_multiplayer")
  public Boolean getNeedsMultiplayer() {
    return needsMultiplayer;
  }

  @JsonProperty("needs_multiplayer")
  public void setNeedsMultiplayer(Boolean needsMultiplayer) {
    this.needsMultiplayer = needsMultiplayer;
  }

  /**
   * Whether or not it must be raining in the overworld to cause evolution this Pokémon species.
   **/
  public PokemonEvolution needsOverworldRain(Boolean needsOverworldRain) {
    this.needsOverworldRain = needsOverworldRain;
    return this;
  }

  
  @ApiModelProperty(value = "Whether or not it must be raining in the overworld to cause evolution this Pokémon species.")
  @JsonProperty("needs_overworld_rain")
  public Boolean getNeedsOverworldRain() {
    return needsOverworldRain;
  }

  @JsonProperty("needs_overworld_rain")
  public void setNeedsOverworldRain(Boolean needsOverworldRain) {
    this.needsOverworldRain = needsOverworldRain;
  }

  /**
   * The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species.
   **/
  public PokemonEvolution partySpecies(PokemonSpeciesSummary partySpecies) {
    this.partySpecies = partySpecies;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species.")
  @JsonProperty(required = true, value = "party_species")
  @NotNull @Valid public PokemonSpeciesSummary getPartySpecies() {
    return partySpecies;
  }

  @JsonProperty(required = true, value = "party_species")
  public void setPartySpecies(PokemonSpeciesSummary partySpecies) {
    this.partySpecies = partySpecies;
  }

  /**
   * The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species.
   **/
  public PokemonEvolution partyType(TypeSummary partyType) {
    this.partyType = partyType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species.")
  @JsonProperty(required = true, value = "party_type")
  @NotNull @Valid public TypeSummary getPartyType() {
    return partyType;
  }

  @JsonProperty(required = true, value = "party_type")
  public void setPartyType(TypeSummary partyType) {
    this.partyType = partyType;
  }

  /**
   * The required relation between the Pokémon&#39;s Attack and Defense stats. 1 means Attack &gt; Defense. 0 means Attack &#x3D; Defense. -1 means Attack &lt; Defense.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public PokemonEvolution relativePhysicalStats(Integer relativePhysicalStats) {
    this.relativePhysicalStats = relativePhysicalStats;
    return this;
  }

  
  @ApiModelProperty(value = "The required relation between the Pokémon's Attack and Defense stats. 1 means Attack > Defense. 0 means Attack = Defense. -1 means Attack < Defense.")
  @JsonProperty("relative_physical_stats")
   @Min(-2147483648) @Max(2147483647)public Integer getRelativePhysicalStats() {
    return relativePhysicalStats;
  }

  @JsonProperty("relative_physical_stats")
  public void setRelativePhysicalStats(Integer relativePhysicalStats) {
    this.relativePhysicalStats = relativePhysicalStats;
  }

  /**
   * The required time of day. Day or night.
   **/
  public PokemonEvolution timeOfDay(String timeOfDay) {
    this.timeOfDay = timeOfDay;
    return this;
  }

  
  @ApiModelProperty(value = "The required time of day. Day or night.")
  @JsonProperty("time_of_day")
   @Size(max=10)public String getTimeOfDay() {
    return timeOfDay;
  }

  @JsonProperty("time_of_day")
  public void setTimeOfDay(String timeOfDay) {
    this.timeOfDay = timeOfDay;
  }

  /**
   * Pokémon species for which this one must be traded.
   **/
  public PokemonEvolution tradeSpecies(PokemonSpeciesSummary tradeSpecies) {
    this.tradeSpecies = tradeSpecies;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Pokémon species for which this one must be traded.")
  @JsonProperty(required = true, value = "trade_species")
  @NotNull @Valid public PokemonSpeciesSummary getTradeSpecies() {
    return tradeSpecies;
  }

  @JsonProperty(required = true, value = "trade_species")
  public void setTradeSpecies(PokemonSpeciesSummary tradeSpecies) {
    this.tradeSpecies = tradeSpecies;
  }

  /**
   * Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up.
   **/
  public PokemonEvolution turnUpsideDown(Boolean turnUpsideDown) {
    this.turnUpsideDown = turnUpsideDown;
    return this;
  }

  
  @ApiModelProperty(value = "Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up.")
  @JsonProperty("turn_upside_down")
  public Boolean getTurnUpsideDown() {
    return turnUpsideDown;
  }

  @JsonProperty("turn_upside_down")
  public void setTurnUpsideDown(Boolean turnUpsideDown) {
    this.turnUpsideDown = turnUpsideDown;
  }

  /**
   * The required region in which this evolution can occur.
   **/
  public PokemonEvolution region(RegionSummary region) {
    this.region = region;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The required region in which this evolution can occur.")
  @JsonProperty(required = true, value = "region")
  @NotNull @Valid public RegionSummary getRegion() {
    return region;
  }

  @JsonProperty(required = true, value = "region")
  public void setRegion(RegionSummary region) {
    this.region = region;
  }

  /**
   * The Pokémon form required before evolving, or null if unrestricted.
   **/
  public PokemonEvolution requiredPokemonForm(PokemonFormSummary requiredPokemonForm) {
    this.requiredPokemonForm = requiredPokemonForm;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Pokémon form required before evolving, or null if unrestricted.")
  @JsonProperty(required = true, value = "required_pokemon_form")
  @NotNull @Valid public PokemonFormSummary getRequiredPokemonForm() {
    return requiredPokemonForm;
  }

  @JsonProperty(required = true, value = "required_pokemon_form")
  public void setRequiredPokemonForm(PokemonFormSummary requiredPokemonForm) {
    this.requiredPokemonForm = requiredPokemonForm;
  }

  /**
   * The Pokémon form produced by this evolution, or null if unspecified.
   **/
  public PokemonEvolution evolvedPokemonForm(PokemonFormSummary evolvedPokemonForm) {
    this.evolvedPokemonForm = evolvedPokemonForm;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Pokémon form produced by this evolution, or null if unspecified.")
  @JsonProperty(required = true, value = "evolved_pokemon_form")
  @NotNull @Valid public PokemonFormSummary getEvolvedPokemonForm() {
    return evolvedPokemonForm;
  }

  @JsonProperty(required = true, value = "evolved_pokemon_form")
  public void setEvolvedPokemonForm(PokemonFormSummary evolvedPokemonForm) {
    this.evolvedPokemonForm = evolvedPokemonForm;
  }

  /**
   * The move that must be used by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species.
   **/
  public PokemonEvolution usedMove(MoveSummary usedMove) {
    this.usedMove = usedMove;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The move that must be used by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species.")
  @JsonProperty(required = true, value = "used_move")
  @NotNull @Valid public MoveSummary getUsedMove() {
    return usedMove;
  }

  @JsonProperty(required = true, value = "used_move")
  public void setUsedMove(MoveSummary usedMove) {
    this.usedMove = usedMove;
  }

  /**
   * The minimum number of times a move must be used in order to evolve into this Pokémon species.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public PokemonEvolution minMoveCount(Integer minMoveCount) {
    this.minMoveCount = minMoveCount;
    return this;
  }

  
  @ApiModelProperty(value = "The minimum number of times a move must be used in order to evolve into this Pokémon species.")
  @JsonProperty("min_move_count")
   @Min(-2147483648) @Max(2147483647)public Integer getMinMoveCount() {
    return minMoveCount;
  }

  @JsonProperty("min_move_count")
  public void setMinMoveCount(Integer minMoveCount) {
    this.minMoveCount = minMoveCount;
  }

  /**
   * The minimum number of steps that must be taken in order to evolve into this Pokémon species.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public PokemonEvolution minSteps(Integer minSteps) {
    this.minSteps = minSteps;
    return this;
  }

  
  @ApiModelProperty(value = "The minimum number of steps that must be taken in order to evolve into this Pokémon species.")
  @JsonProperty("min_steps")
   @Min(-2147483648) @Max(2147483647)public Integer getMinSteps() {
    return minSteps;
  }

  @JsonProperty("min_steps")
  public void setMinSteps(Integer minSteps) {
    this.minSteps = minSteps;
  }

  /**
   * The minimum amount of damage taken during the evolution trigger event in order to evolve into this Pokémon species.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public PokemonEvolution minDamageTaken(Integer minDamageTaken) {
    this.minDamageTaken = minDamageTaken;
    return this;
  }

  
  @ApiModelProperty(value = "The minimum amount of damage taken during the evolution trigger event in order to evolve into this Pokémon species.")
  @JsonProperty("min_damage_taken")
   @Min(-2147483648) @Max(2147483647)public Integer getMinDamageTaken() {
    return minDamageTaken;
  }

  @JsonProperty("min_damage_taken")
  public void setMinDamageTaken(Integer minDamageTaken) {
    this.minDamageTaken = minDamageTaken;
  }

  /**
   * The natures that allow this evolution, or null if unrestricted.
   **/
  public PokemonEvolution allowedNatures(List<@Valid NatureSummary> allowedNatures) {
    this.allowedNatures = allowedNatures;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The natures that allow this evolution, or null if unrestricted.")
  @JsonProperty(required = true, value = "allowed_natures")
  public List<@Valid NatureSummary> getAllowedNatures() {
    return allowedNatures;
  }

  @JsonProperty(required = true, value = "allowed_natures")
  public void setAllowedNatures(List<@Valid NatureSummary> allowedNatures) {
    this.allowedNatures = allowedNatures;
  }

  public PokemonEvolution addAllowedNaturesItem(NatureSummary allowedNaturesItem) {
    if (this.allowedNatures == null) {
      this.allowedNatures = new ArrayList<>();
    }

    this.allowedNatures.add(allowedNaturesItem);
    return this;
  }

  public PokemonEvolution removeAllowedNaturesItem(NatureSummary allowedNaturesItem) {
    if (allowedNaturesItem != null && this.allowedNatures != null) {
      this.allowedNatures.remove(allowedNaturesItem);
    }

    return this;
  }
  /**
   * An additional evolution condition expressed in reverse Polish notation, or null if none.
   **/
  public PokemonEvolution conditionExpression(EvolutionConditionExpression conditionExpression) {
    this.conditionExpression = conditionExpression;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "An additional evolution condition expressed in reverse Polish notation, or null if none.")
  @JsonProperty(required = true, value = "condition_expression")
  @Valid public EvolutionConditionExpression getConditionExpression() {
    return conditionExpression;
  }

  @JsonProperty(required = true, value = "condition_expression")
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
