package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PokemonEvolution
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-09T13:53:47.069318184Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonEvolution {

  private VersionGroupSummary versionGroup;

  private @Nullable Boolean isDefault;

  private JsonNullable<ItemSummary> item = JsonNullable.<ItemSummary>undefined();

  private EvolutionTriggerSummary trigger;

  private JsonNullable<Integer> gender = JsonNullable.<Integer>undefined();

  private JsonNullable<ItemSummary> heldItem = JsonNullable.<ItemSummary>undefined();

  private PokemonEvolutionKnownMove knownMove;

  private PokemonEvolutionKnownMove knownMoveType;

  private JsonNullable<LocationSummary> location = JsonNullable.<LocationSummary>undefined();

  private JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> minLevel = JsonNullable.<Integer>undefined();

  private JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> minHappiness = JsonNullable.<Integer>undefined();

  private JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> minBeauty = JsonNullable.<Integer>undefined();

  private JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> minAffection = JsonNullable.<Integer>undefined();

  private @Nullable Boolean nearSpecialRock;

  private @Nullable Boolean needsMultiplayer;

  private @Nullable Boolean needsOverworldRain;

  private JsonNullable<PokemonSpeciesSummary> partySpecies = JsonNullable.<PokemonSpeciesSummary>undefined();

  private JsonNullable<TypeSummary> partyType = JsonNullable.<TypeSummary>undefined();

  private JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> relativePhysicalStats = JsonNullable.<Integer>undefined();

  private @Nullable String timeOfDay;

  private JsonNullable<PokemonSpeciesSummary> tradeSpecies = JsonNullable.<PokemonSpeciesSummary>undefined();

  private @Nullable Boolean turnUpsideDown;

  private JsonNullable<RegionSummary> region = JsonNullable.<RegionSummary>undefined();

  private JsonNullable<PokemonFormSummary> requiredPokemonForm = JsonNullable.<PokemonFormSummary>undefined();

  private JsonNullable<PokemonFormSummary> evolvedPokemonForm = JsonNullable.<PokemonFormSummary>undefined();

  private JsonNullable<MoveSummary> usedMove = JsonNullable.<MoveSummary>undefined();

  private JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> minMoveCount = JsonNullable.<Integer>undefined();

  private JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> minSteps = JsonNullable.<Integer>undefined();

  private JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> minDamageTaken = JsonNullable.<Integer>undefined();

  private JsonNullable<List<@Valid NatureSummary>> allowedNatures = JsonNullable.<List<@Valid NatureSummary>>undefined();

  private JsonNullable<EvolutionConditionExpression> conditionExpression = JsonNullable.<EvolutionConditionExpression>undefined();

  public PokemonEvolution() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PokemonEvolution(VersionGroupSummary versionGroup, ItemSummary item, EvolutionTriggerSummary trigger, ItemSummary heldItem, PokemonEvolutionKnownMove knownMove, PokemonEvolutionKnownMove knownMoveType, LocationSummary location, PokemonSpeciesSummary partySpecies, TypeSummary partyType, PokemonSpeciesSummary tradeSpecies, RegionSummary region, PokemonFormSummary requiredPokemonForm, PokemonFormSummary evolvedPokemonForm, MoveSummary usedMove, List<@Valid NatureSummary> allowedNatures, EvolutionConditionExpression conditionExpression) {
    this.versionGroup = versionGroup;
    this.item = JsonNullable.of(item);
    this.trigger = trigger;
    this.heldItem = JsonNullable.of(heldItem);
    this.knownMove = knownMove;
    this.knownMoveType = knownMoveType;
    this.location = JsonNullable.of(location);
    this.partySpecies = JsonNullable.of(partySpecies);
    this.partyType = JsonNullable.of(partyType);
    this.tradeSpecies = JsonNullable.of(tradeSpecies);
    this.region = JsonNullable.of(region);
    this.requiredPokemonForm = JsonNullable.of(requiredPokemonForm);
    this.evolvedPokemonForm = JsonNullable.of(evolvedPokemonForm);
    this.usedMove = JsonNullable.of(usedMove);
    this.allowedNatures = JsonNullable.of(allowedNatures);
    this.conditionExpression = JsonNullable.of(conditionExpression);
  }

  public PokemonEvolution versionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
    return this;
  }

  /**
   * The version group in which these evolution requirements apply.
   * @return versionGroup
   */
  @NotNull @Valid 
  @Schema(name = "version_group", description = "The version group in which these evolution requirements apply.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("version_group")
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }

  @JsonProperty("version_group")
  public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

  public PokemonEvolution isDefault(@Nullable Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * Whether the evolution is considered as the expected evolution in a main series game. Each unique Pokémon variety of a line capable of evolution should have exactly one 'default' evolution. For example, the Meowth species has three default evolutions as there are three distinct varieties it can evolve into: Persian, Alolan Persian, and Perrserker.
   * @return isDefault
   */
  
  @Schema(name = "is_default", description = "Whether the evolution is considered as the expected evolution in a main series game. Each unique Pokémon variety of a line capable of evolution should have exactly one 'default' evolution. For example, the Meowth species has three default evolutions as there are three distinct varieties it can evolve into: Persian, Alolan Persian, and Perrserker.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_default")
  public @Nullable Boolean getIsDefault() {
    return isDefault;
  }

  @JsonProperty("is_default")
  public void setIsDefault(@Nullable Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public PokemonEvolution item(ItemSummary item) {
    this.item = JsonNullable.of(item);
    return this;
  }

  /**
   * The item required to cause evolution this into Pokémon species.
   * @return item
   */
  /* @Present */ @Valid 
  @Schema(name = "item", description = "The item required to cause evolution this into Pokémon species.", requiredMode = Schema.RequiredMode.REQUIRED, nullable = true)
  @JsonProperty("item")
  public JsonNullable<ItemSummary> getItem() {
    return item;
  }

  @JsonProperty("item")
  public void setItem(JsonNullable<ItemSummary> item) {
    this.item = item;
  }

  public PokemonEvolution trigger(EvolutionTriggerSummary trigger) {
    this.trigger = trigger;
    return this;
  }

  /**
   * The type of event that triggers evolution into this Pokémon species.
   * @return trigger
   */
  @NotNull @Valid 
  @Schema(name = "trigger", description = "The type of event that triggers evolution into this Pokémon species.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("trigger")
  public EvolutionTriggerSummary getTrigger() {
    return trigger;
  }

  @JsonProperty("trigger")
  public void setTrigger(EvolutionTriggerSummary trigger) {
    this.trigger = trigger;
  }

  public PokemonEvolution gender(Integer gender) {
    this.gender = JsonNullable.of(gender);
    return this;
  }

  /**
   * The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species.
   * @return gender
   */
  
  @Schema(name = "gender", description = "The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species.", requiredMode = Schema.RequiredMode.NOT_REQUIRED, nullable = true)
  @JsonProperty("gender")
  public JsonNullable<Integer> getGender() {
    return gender;
  }

  public void setGender(JsonNullable<Integer> gender) {
    this.gender = gender;
  }

  public PokemonEvolution heldItem(ItemSummary heldItem) {
    this.heldItem = JsonNullable.of(heldItem);
    return this;
  }

  /**
   * The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species.
   * @return heldItem
   */
  /* @Present */ @Valid 
  @Schema(name = "held_item", description = "The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species.", requiredMode = Schema.RequiredMode.REQUIRED, nullable = true)
  @JsonProperty("held_item")
  public JsonNullable<ItemSummary> getHeldItem() {
    return heldItem;
  }

  @JsonProperty("held_item")
  public void setHeldItem(JsonNullable<ItemSummary> heldItem) {
    this.heldItem = heldItem;
  }

  public PokemonEvolution knownMove(PokemonEvolutionKnownMove knownMove) {
    this.knownMove = knownMove;
    return this;
  }

  /**
   * Get knownMove
   * @return knownMove
   */
  @NotNull @Valid 
  @Schema(name = "known_move", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("known_move")
  public PokemonEvolutionKnownMove getKnownMove() {
    return knownMove;
  }

  @JsonProperty("known_move")
  public void setKnownMove(PokemonEvolutionKnownMove knownMove) {
    this.knownMove = knownMove;
  }

  public PokemonEvolution knownMoveType(PokemonEvolutionKnownMove knownMoveType) {
    this.knownMoveType = knownMoveType;
    return this;
  }

  /**
   * Get knownMoveType
   * @return knownMoveType
   */
  @NotNull @Valid 
  @Schema(name = "known_move_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("known_move_type")
  public PokemonEvolutionKnownMove getKnownMoveType() {
    return knownMoveType;
  }

  @JsonProperty("known_move_type")
  public void setKnownMoveType(PokemonEvolutionKnownMove knownMoveType) {
    this.knownMoveType = knownMoveType;
  }

  public PokemonEvolution location(LocationSummary location) {
    this.location = JsonNullable.of(location);
    return this;
  }

  /**
   * The location the evolution must be triggered at.
   * @return location
   */
  /* @Present */ @Valid 
  @Schema(name = "location", description = "The location the evolution must be triggered at.", requiredMode = Schema.RequiredMode.REQUIRED, nullable = true)
  @JsonProperty("location")
  public JsonNullable<LocationSummary> getLocation() {
    return location;
  }

  @JsonProperty("location")
  public void setLocation(JsonNullable<LocationSummary> location) {
    this.location = location;
  }

  public PokemonEvolution minLevel(Integer minLevel) {
    this.minLevel = JsonNullable.of(minLevel);
    return this;
  }

  /**
   * The minimum required level of the evolving Pokémon species to evolve into this Pokémon species.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return minLevel
   */
  @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "min_level", description = "The minimum required level of the evolving Pokémon species to evolve into this Pokémon species.", requiredMode = Schema.RequiredMode.NOT_REQUIRED, nullable = true)
  @JsonProperty("min_level")
  public JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> getMinLevel() {
    return minLevel;
  }

  public void setMinLevel(JsonNullable<Integer> minLevel) {
    this.minLevel = minLevel;
  }

  public PokemonEvolution minHappiness(Integer minHappiness) {
    this.minHappiness = JsonNullable.of(minHappiness);
    return this;
  }

  /**
   * The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return minHappiness
   */
  @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "min_happiness", description = "The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species.", requiredMode = Schema.RequiredMode.NOT_REQUIRED, nullable = true)
  @JsonProperty("min_happiness")
  public JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> getMinHappiness() {
    return minHappiness;
  }

  public void setMinHappiness(JsonNullable<Integer> minHappiness) {
    this.minHappiness = minHappiness;
  }

  public PokemonEvolution minBeauty(Integer minBeauty) {
    this.minBeauty = JsonNullable.of(minBeauty);
    return this;
  }

  /**
   * The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return minBeauty
   */
  @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "min_beauty", description = "The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species.", requiredMode = Schema.RequiredMode.NOT_REQUIRED, nullable = true)
  @JsonProperty("min_beauty")
  public JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> getMinBeauty() {
    return minBeauty;
  }

  public void setMinBeauty(JsonNullable<Integer> minBeauty) {
    this.minBeauty = minBeauty;
  }

  public PokemonEvolution minAffection(Integer minAffection) {
    this.minAffection = JsonNullable.of(minAffection);
    return this;
  }

  /**
   * The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return minAffection
   */
  @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "min_affection", description = "The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species.", requiredMode = Schema.RequiredMode.NOT_REQUIRED, nullable = true)
  @JsonProperty("min_affection")
  public JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> getMinAffection() {
    return minAffection;
  }

  public void setMinAffection(JsonNullable<Integer> minAffection) {
    this.minAffection = minAffection;
  }

  public PokemonEvolution nearSpecialRock(@Nullable Boolean nearSpecialRock) {
    this.nearSpecialRock = nearSpecialRock;
    return this;
  }

  /**
   * Whether or not you need to be near a Moss Rock or Icy Rock to evolve into this Pokémon species.
   * @return nearSpecialRock
   */
  
  @Schema(name = "near_special_rock", description = "Whether or not you need to be near a Moss Rock or Icy Rock to evolve into this Pokémon species.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("near_special_rock")
  public @Nullable Boolean getNearSpecialRock() {
    return nearSpecialRock;
  }

  @JsonProperty("near_special_rock")
  public void setNearSpecialRock(@Nullable Boolean nearSpecialRock) {
    this.nearSpecialRock = nearSpecialRock;
  }

  public PokemonEvolution needsMultiplayer(@Nullable Boolean needsMultiplayer) {
    this.needsMultiplayer = needsMultiplayer;
    return this;
  }

  /**
   * Whether or not multiplayer link play is needed to evolve into this Pokémon species (e.g. Union Circle).
   * @return needsMultiplayer
   */
  
  @Schema(name = "needs_multiplayer", description = "Whether or not multiplayer link play is needed to evolve into this Pokémon species (e.g. Union Circle).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("needs_multiplayer")
  public @Nullable Boolean getNeedsMultiplayer() {
    return needsMultiplayer;
  }

  @JsonProperty("needs_multiplayer")
  public void setNeedsMultiplayer(@Nullable Boolean needsMultiplayer) {
    this.needsMultiplayer = needsMultiplayer;
  }

  public PokemonEvolution needsOverworldRain(@Nullable Boolean needsOverworldRain) {
    this.needsOverworldRain = needsOverworldRain;
    return this;
  }

  /**
   * Whether or not it must be raining in the overworld to cause evolution this Pokémon species.
   * @return needsOverworldRain
   */
  
  @Schema(name = "needs_overworld_rain", description = "Whether or not it must be raining in the overworld to cause evolution this Pokémon species.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("needs_overworld_rain")
  public @Nullable Boolean getNeedsOverworldRain() {
    return needsOverworldRain;
  }

  @JsonProperty("needs_overworld_rain")
  public void setNeedsOverworldRain(@Nullable Boolean needsOverworldRain) {
    this.needsOverworldRain = needsOverworldRain;
  }

  public PokemonEvolution partySpecies(PokemonSpeciesSummary partySpecies) {
    this.partySpecies = JsonNullable.of(partySpecies);
    return this;
  }

  /**
   * The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species.
   * @return partySpecies
   */
  /* @Present */ @Valid 
  @Schema(name = "party_species", description = "The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species.", requiredMode = Schema.RequiredMode.REQUIRED, nullable = true)
  @JsonProperty("party_species")
  public JsonNullable<PokemonSpeciesSummary> getPartySpecies() {
    return partySpecies;
  }

  @JsonProperty("party_species")
  public void setPartySpecies(JsonNullable<PokemonSpeciesSummary> partySpecies) {
    this.partySpecies = partySpecies;
  }

  public PokemonEvolution partyType(TypeSummary partyType) {
    this.partyType = JsonNullable.of(partyType);
    return this;
  }

  /**
   * The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species.
   * @return partyType
   */
  /* @Present */ @Valid 
  @Schema(name = "party_type", description = "The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species.", requiredMode = Schema.RequiredMode.REQUIRED, nullable = true)
  @JsonProperty("party_type")
  public JsonNullable<TypeSummary> getPartyType() {
    return partyType;
  }

  @JsonProperty("party_type")
  public void setPartyType(JsonNullable<TypeSummary> partyType) {
    this.partyType = partyType;
  }

  public PokemonEvolution relativePhysicalStats(Integer relativePhysicalStats) {
    this.relativePhysicalStats = JsonNullable.of(relativePhysicalStats);
    return this;
  }

  /**
   * The required relation between the Pokémon's Attack and Defense stats. 1 means Attack > Defense. 0 means Attack = Defense. -1 means Attack < Defense.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return relativePhysicalStats
   */
  @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "relative_physical_stats", description = "The required relation between the Pokémon's Attack and Defense stats. 1 means Attack > Defense. 0 means Attack = Defense. -1 means Attack < Defense.", requiredMode = Schema.RequiredMode.NOT_REQUIRED, nullable = true)
  @JsonProperty("relative_physical_stats")
  public JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> getRelativePhysicalStats() {
    return relativePhysicalStats;
  }

  public void setRelativePhysicalStats(JsonNullable<Integer> relativePhysicalStats) {
    this.relativePhysicalStats = relativePhysicalStats;
  }

  public PokemonEvolution timeOfDay(@Nullable String timeOfDay) {
    this.timeOfDay = timeOfDay;
    return this;
  }

  /**
   * The required time of day. Day or night.
   * @return timeOfDay
   */
  @Size(max = 10) 
  @Schema(name = "time_of_day", description = "The required time of day. Day or night.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("time_of_day")
  public @Nullable String getTimeOfDay() {
    return timeOfDay;
  }

  @JsonProperty("time_of_day")
  public void setTimeOfDay(@Nullable String timeOfDay) {
    this.timeOfDay = timeOfDay;
  }

  public PokemonEvolution tradeSpecies(PokemonSpeciesSummary tradeSpecies) {
    this.tradeSpecies = JsonNullable.of(tradeSpecies);
    return this;
  }

  /**
   * Pokémon species for which this one must be traded.
   * @return tradeSpecies
   */
  /* @Present */ @Valid 
  @Schema(name = "trade_species", description = "Pokémon species for which this one must be traded.", requiredMode = Schema.RequiredMode.REQUIRED, nullable = true)
  @JsonProperty("trade_species")
  public JsonNullable<PokemonSpeciesSummary> getTradeSpecies() {
    return tradeSpecies;
  }

  @JsonProperty("trade_species")
  public void setTradeSpecies(JsonNullable<PokemonSpeciesSummary> tradeSpecies) {
    this.tradeSpecies = tradeSpecies;
  }

  public PokemonEvolution turnUpsideDown(@Nullable Boolean turnUpsideDown) {
    this.turnUpsideDown = turnUpsideDown;
    return this;
  }

  /**
   * Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up.
   * @return turnUpsideDown
   */
  
  @Schema(name = "turn_upside_down", description = "Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("turn_upside_down")
  public @Nullable Boolean getTurnUpsideDown() {
    return turnUpsideDown;
  }

  @JsonProperty("turn_upside_down")
  public void setTurnUpsideDown(@Nullable Boolean turnUpsideDown) {
    this.turnUpsideDown = turnUpsideDown;
  }

  public PokemonEvolution region(RegionSummary region) {
    this.region = JsonNullable.of(region);
    return this;
  }

  /**
   * The required region in which this evolution can occur.
   * @return region
   */
  /* @Present */ @Valid 
  @Schema(name = "region", description = "The required region in which this evolution can occur.", requiredMode = Schema.RequiredMode.REQUIRED, nullable = true)
  @JsonProperty("region")
  public JsonNullable<RegionSummary> getRegion() {
    return region;
  }

  @JsonProperty("region")
  public void setRegion(JsonNullable<RegionSummary> region) {
    this.region = region;
  }

  public PokemonEvolution requiredPokemonForm(PokemonFormSummary requiredPokemonForm) {
    this.requiredPokemonForm = JsonNullable.of(requiredPokemonForm);
    return this;
  }

  /**
   * The Pokémon form required before evolving, or null if unrestricted.
   * @return requiredPokemonForm
   */
  /* @Present */ @Valid 
  @Schema(name = "required_pokemon_form", description = "The Pokémon form required before evolving, or null if unrestricted.", requiredMode = Schema.RequiredMode.REQUIRED, nullable = true)
  @JsonProperty("required_pokemon_form")
  public JsonNullable<PokemonFormSummary> getRequiredPokemonForm() {
    return requiredPokemonForm;
  }

  @JsonProperty("required_pokemon_form")
  public void setRequiredPokemonForm(JsonNullable<PokemonFormSummary> requiredPokemonForm) {
    this.requiredPokemonForm = requiredPokemonForm;
  }

  public PokemonEvolution evolvedPokemonForm(PokemonFormSummary evolvedPokemonForm) {
    this.evolvedPokemonForm = JsonNullable.of(evolvedPokemonForm);
    return this;
  }

  /**
   * The Pokémon form produced by this evolution, or null if unspecified.
   * @return evolvedPokemonForm
   */
  /* @Present */ @Valid 
  @Schema(name = "evolved_pokemon_form", description = "The Pokémon form produced by this evolution, or null if unspecified.", requiredMode = Schema.RequiredMode.REQUIRED, nullable = true)
  @JsonProperty("evolved_pokemon_form")
  public JsonNullable<PokemonFormSummary> getEvolvedPokemonForm() {
    return evolvedPokemonForm;
  }

  @JsonProperty("evolved_pokemon_form")
  public void setEvolvedPokemonForm(JsonNullable<PokemonFormSummary> evolvedPokemonForm) {
    this.evolvedPokemonForm = evolvedPokemonForm;
  }

  public PokemonEvolution usedMove(MoveSummary usedMove) {
    this.usedMove = JsonNullable.of(usedMove);
    return this;
  }

  /**
   * The move that must be used by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species.
   * @return usedMove
   */
  /* @Present */ @Valid 
  @Schema(name = "used_move", description = "The move that must be used by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species.", requiredMode = Schema.RequiredMode.REQUIRED, nullable = true)
  @JsonProperty("used_move")
  public JsonNullable<MoveSummary> getUsedMove() {
    return usedMove;
  }

  @JsonProperty("used_move")
  public void setUsedMove(JsonNullable<MoveSummary> usedMove) {
    this.usedMove = usedMove;
  }

  public PokemonEvolution minMoveCount(Integer minMoveCount) {
    this.minMoveCount = JsonNullable.of(minMoveCount);
    return this;
  }

  /**
   * The minimum number of times a move must be used in order to evolve into this Pokémon species.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return minMoveCount
   */
  @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "min_move_count", description = "The minimum number of times a move must be used in order to evolve into this Pokémon species.", requiredMode = Schema.RequiredMode.NOT_REQUIRED, nullable = true)
  @JsonProperty("min_move_count")
  public JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> getMinMoveCount() {
    return minMoveCount;
  }

  public void setMinMoveCount(JsonNullable<Integer> minMoveCount) {
    this.minMoveCount = minMoveCount;
  }

  public PokemonEvolution minSteps(Integer minSteps) {
    this.minSteps = JsonNullable.of(minSteps);
    return this;
  }

  /**
   * The minimum number of steps that must be taken in order to evolve into this Pokémon species.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return minSteps
   */
  @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "min_steps", description = "The minimum number of steps that must be taken in order to evolve into this Pokémon species.", requiredMode = Schema.RequiredMode.NOT_REQUIRED, nullable = true)
  @JsonProperty("min_steps")
  public JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> getMinSteps() {
    return minSteps;
  }

  public void setMinSteps(JsonNullable<Integer> minSteps) {
    this.minSteps = minSteps;
  }

  public PokemonEvolution minDamageTaken(Integer minDamageTaken) {
    this.minDamageTaken = JsonNullable.of(minDamageTaken);
    return this;
  }

  /**
   * The minimum amount of damage taken during the evolution trigger event in order to evolve into this Pokémon species.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return minDamageTaken
   */
  @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "min_damage_taken", description = "The minimum amount of damage taken during the evolution trigger event in order to evolve into this Pokémon species.", requiredMode = Schema.RequiredMode.NOT_REQUIRED, nullable = true)
  @JsonProperty("min_damage_taken")
  public JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> getMinDamageTaken() {
    return minDamageTaken;
  }

  public void setMinDamageTaken(JsonNullable<Integer> minDamageTaken) {
    this.minDamageTaken = minDamageTaken;
  }

  public PokemonEvolution allowedNatures(List<@Valid NatureSummary> allowedNatures) {
    this.allowedNatures = JsonNullable.of(allowedNatures);
    return this;
  }

  public PokemonEvolution addAllowedNaturesItem(NatureSummary allowedNaturesItem) {
    if (this.allowedNatures == null || !this.allowedNatures.isPresent() || this.allowedNatures.get() == null) {
      this.allowedNatures = JsonNullable.of(new ArrayList<>());
    }
    this.allowedNatures.get().add(allowedNaturesItem);
    return this;
  }

  /**
   * The natures that allow this evolution, or null if unrestricted.
   * @return allowedNatures
   */
  
  @Schema(name = "allowed_natures", accessMode = Schema.AccessMode.READ_ONLY, description = "The natures that allow this evolution, or null if unrestricted.", requiredMode = Schema.RequiredMode.REQUIRED, nullable = true)
  @JsonProperty("allowed_natures")
  public JsonNullable<List<@Valid NatureSummary>> getAllowedNatures() {
    return allowedNatures;
  }

  @JsonProperty("allowed_natures")
  public void setAllowedNatures(JsonNullable<List<@Valid NatureSummary>> allowedNatures) {
    this.allowedNatures = allowedNatures;
  }

  public PokemonEvolution conditionExpression(EvolutionConditionExpression conditionExpression) {
    this.conditionExpression = JsonNullable.of(conditionExpression);
    return this;
  }

  /**
   * An additional evolution condition expressed in reverse Polish notation, or null if none.
   * @return conditionExpression
   */
  @Valid 
  @Schema(name = "condition_expression", accessMode = Schema.AccessMode.READ_ONLY, description = "An additional evolution condition expressed in reverse Polish notation, or null if none.", requiredMode = Schema.RequiredMode.REQUIRED, nullable = true)
  @JsonProperty("condition_expression")
  public JsonNullable<EvolutionConditionExpression> getConditionExpression() {
    return conditionExpression;
  }

  @JsonProperty("condition_expression")
  public void setConditionExpression(JsonNullable<EvolutionConditionExpression> conditionExpression) {
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
        equalsNullable(this.gender, pokemonEvolution.gender) &&
        Objects.equals(this.heldItem, pokemonEvolution.heldItem) &&
        Objects.equals(this.knownMove, pokemonEvolution.knownMove) &&
        Objects.equals(this.knownMoveType, pokemonEvolution.knownMoveType) &&
        Objects.equals(this.location, pokemonEvolution.location) &&
        equalsNullable(this.minLevel, pokemonEvolution.minLevel) &&
        equalsNullable(this.minHappiness, pokemonEvolution.minHappiness) &&
        equalsNullable(this.minBeauty, pokemonEvolution.minBeauty) &&
        equalsNullable(this.minAffection, pokemonEvolution.minAffection) &&
        Objects.equals(this.nearSpecialRock, pokemonEvolution.nearSpecialRock) &&
        Objects.equals(this.needsMultiplayer, pokemonEvolution.needsMultiplayer) &&
        Objects.equals(this.needsOverworldRain, pokemonEvolution.needsOverworldRain) &&
        Objects.equals(this.partySpecies, pokemonEvolution.partySpecies) &&
        Objects.equals(this.partyType, pokemonEvolution.partyType) &&
        equalsNullable(this.relativePhysicalStats, pokemonEvolution.relativePhysicalStats) &&
        Objects.equals(this.timeOfDay, pokemonEvolution.timeOfDay) &&
        Objects.equals(this.tradeSpecies, pokemonEvolution.tradeSpecies) &&
        Objects.equals(this.turnUpsideDown, pokemonEvolution.turnUpsideDown) &&
        Objects.equals(this.region, pokemonEvolution.region) &&
        Objects.equals(this.requiredPokemonForm, pokemonEvolution.requiredPokemonForm) &&
        Objects.equals(this.evolvedPokemonForm, pokemonEvolution.evolvedPokemonForm) &&
        Objects.equals(this.usedMove, pokemonEvolution.usedMove) &&
        equalsNullable(this.minMoveCount, pokemonEvolution.minMoveCount) &&
        equalsNullable(this.minSteps, pokemonEvolution.minSteps) &&
        equalsNullable(this.minDamageTaken, pokemonEvolution.minDamageTaken) &&
        Objects.equals(this.allowedNatures, pokemonEvolution.allowedNatures) &&
        Objects.equals(this.conditionExpression, pokemonEvolution.conditionExpression);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionGroup, isDefault, item, trigger, hashCodeNullable(gender), heldItem, knownMove, knownMoveType, location, hashCodeNullable(minLevel), hashCodeNullable(minHappiness), hashCodeNullable(minBeauty), hashCodeNullable(minAffection), nearSpecialRock, needsMultiplayer, needsOverworldRain, partySpecies, partyType, hashCodeNullable(relativePhysicalStats), timeOfDay, tradeSpecies, turnUpsideDown, region, requiredPokemonForm, evolvedPokemonForm, usedMove, hashCodeNullable(minMoveCount), hashCodeNullable(minSteps), hashCodeNullable(minDamageTaken), allowedNatures, conditionExpression);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

