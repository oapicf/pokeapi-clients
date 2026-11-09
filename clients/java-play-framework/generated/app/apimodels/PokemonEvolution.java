package apimodels;

import apimodels.EvolutionConditionExpression;
import apimodels.EvolutionTriggerSummary;
import apimodels.ItemSummary;
import apimodels.LocationSummary;
import apimodels.MoveSummary;
import apimodels.NatureSummary;
import apimodels.PokemonEvolutionKnownMove;
import apimodels.PokemonFormSummary;
import apimodels.PokemonSpeciesSummary;
import apimodels.RegionSummary;
import apimodels.TypeSummary;
import apimodels.VersionGroupSummary;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PokemonEvolution
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PokemonEvolution   {
  @JsonProperty("version_group")
  @NotNull
@Valid

  private VersionGroupSummary versionGroup;

  @JsonProperty("is_default")
  
  private Boolean isDefault;

  @JsonProperty("item")
  @NotNull
@Valid

  private ItemSummary item;

  @JsonProperty("trigger")
  @NotNull
@Valid

  private EvolutionTriggerSummary trigger;

  @JsonProperty("gender")
  
  private Integer gender;

  @JsonProperty("held_item")
  @NotNull
@Valid

  private ItemSummary heldItem;

  @JsonProperty("known_move")
  @NotNull
@Valid

  private PokemonEvolutionKnownMove knownMove;

  @JsonProperty("known_move_type")
  @NotNull
@Valid

  private PokemonEvolutionKnownMove knownMoveType;

  @JsonProperty("location")
  @NotNull
@Valid

  private LocationSummary location;

  @JsonProperty("min_level")
  @Min(-2147483648)
@Max(2147483647)

  private Integer minLevel;

  @JsonProperty("min_happiness")
  @Min(-2147483648)
@Max(2147483647)

  private Integer minHappiness;

  @JsonProperty("min_beauty")
  @Min(-2147483648)
@Max(2147483647)

  private Integer minBeauty;

  @JsonProperty("min_affection")
  @Min(-2147483648)
@Max(2147483647)

  private Integer minAffection;

  @JsonProperty("near_special_rock")
  
  private Boolean nearSpecialRock;

  @JsonProperty("needs_multiplayer")
  
  private Boolean needsMultiplayer;

  @JsonProperty("needs_overworld_rain")
  
  private Boolean needsOverworldRain;

  @JsonProperty("party_species")
  @NotNull
@Valid

  private PokemonSpeciesSummary partySpecies;

  @JsonProperty("party_type")
  @NotNull
@Valid

  private TypeSummary partyType;

  @JsonProperty("relative_physical_stats")
  @Min(-2147483648)
@Max(2147483647)

  private Integer relativePhysicalStats;

  @JsonProperty("time_of_day")
  @Size(max=10)

  private String timeOfDay;

  @JsonProperty("trade_species")
  @NotNull
@Valid

  private PokemonSpeciesSummary tradeSpecies;

  @JsonProperty("turn_upside_down")
  
  private Boolean turnUpsideDown;

  @JsonProperty("region")
  @NotNull
@Valid

  private RegionSummary region;

  @JsonProperty("required_pokemon_form")
  @NotNull
@Valid

  private PokemonFormSummary requiredPokemonForm;

  @JsonProperty("evolved_pokemon_form")
  @NotNull
@Valid

  private PokemonFormSummary evolvedPokemonForm;

  @JsonProperty("used_move")
  @NotNull
@Valid

  private MoveSummary usedMove;

  @JsonProperty("min_move_count")
  @Min(-2147483648)
@Max(2147483647)

  private Integer minMoveCount;

  @JsonProperty("min_steps")
  @Min(-2147483648)
@Max(2147483647)

  private Integer minSteps;

  @JsonProperty("min_damage_taken")
  @Min(-2147483648)
@Max(2147483647)

  private Integer minDamageTaken;

  @JsonProperty("allowed_natures")
  @NotNull
@Valid

  private List<@Valid NatureSummary> allowedNatures = null;

  @JsonProperty("condition_expression")
  @NotNull
@Valid

  private EvolutionConditionExpression conditionExpression;

  public PokemonEvolution versionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
    return this;
  }

   /**
   * The version group in which these evolution requirements apply.
   * @return versionGroup
  **/
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }

  public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

  public PokemonEvolution isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Whether the evolution is considered as the expected evolution in a main series game. Each unique Pokémon variety of a line capable of evolution should have exactly one 'default' evolution. For example, the Meowth species has three default evolutions as there are three distinct varieties it can evolve into: Persian, Alolan Persian, and Perrserker.
   * @return isDefault
  **/
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public PokemonEvolution item(ItemSummary item) {
    this.item = item;
    return this;
  }

   /**
   * The item required to cause evolution this into Pokémon species.
   * @return item
  **/
  public ItemSummary getItem() {
    return item;
  }

  public void setItem(ItemSummary item) {
    this.item = item;
  }

  public PokemonEvolution trigger(EvolutionTriggerSummary trigger) {
    this.trigger = trigger;
    return this;
  }

   /**
   * The type of event that triggers evolution into this Pokémon species.
   * @return trigger
  **/
  public EvolutionTriggerSummary getTrigger() {
    return trigger;
  }

  public void setTrigger(EvolutionTriggerSummary trigger) {
    this.trigger = trigger;
  }

  public PokemonEvolution gender(Integer gender) {
    this.gender = gender;
    return this;
  }

   /**
   * The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species.
   * @return gender
  **/
  public Integer getGender() {
    return gender;
  }

  public void setGender(Integer gender) {
    this.gender = gender;
  }

  public PokemonEvolution heldItem(ItemSummary heldItem) {
    this.heldItem = heldItem;
    return this;
  }

   /**
   * The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species.
   * @return heldItem
  **/
  public ItemSummary getHeldItem() {
    return heldItem;
  }

  public void setHeldItem(ItemSummary heldItem) {
    this.heldItem = heldItem;
  }

  public PokemonEvolution knownMove(PokemonEvolutionKnownMove knownMove) {
    this.knownMove = knownMove;
    return this;
  }

   /**
   * Get knownMove
   * @return knownMove
  **/
  public PokemonEvolutionKnownMove getKnownMove() {
    return knownMove;
  }

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
  **/
  public PokemonEvolutionKnownMove getKnownMoveType() {
    return knownMoveType;
  }

  public void setKnownMoveType(PokemonEvolutionKnownMove knownMoveType) {
    this.knownMoveType = knownMoveType;
  }

  public PokemonEvolution location(LocationSummary location) {
    this.location = location;
    return this;
  }

   /**
   * The location the evolution must be triggered at.
   * @return location
  **/
  public LocationSummary getLocation() {
    return location;
  }

  public void setLocation(LocationSummary location) {
    this.location = location;
  }

  public PokemonEvolution minLevel(Integer minLevel) {
    this.minLevel = minLevel;
    return this;
  }

   /**
   * The minimum required level of the evolving Pokémon species to evolve into this Pokémon species.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return minLevel
  **/
  public Integer getMinLevel() {
    return minLevel;
  }

  public void setMinLevel(Integer minLevel) {
    this.minLevel = minLevel;
  }

  public PokemonEvolution minHappiness(Integer minHappiness) {
    this.minHappiness = minHappiness;
    return this;
  }

   /**
   * The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return minHappiness
  **/
  public Integer getMinHappiness() {
    return minHappiness;
  }

  public void setMinHappiness(Integer minHappiness) {
    this.minHappiness = minHappiness;
  }

  public PokemonEvolution minBeauty(Integer minBeauty) {
    this.minBeauty = minBeauty;
    return this;
  }

   /**
   * The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return minBeauty
  **/
  public Integer getMinBeauty() {
    return minBeauty;
  }

  public void setMinBeauty(Integer minBeauty) {
    this.minBeauty = minBeauty;
  }

  public PokemonEvolution minAffection(Integer minAffection) {
    this.minAffection = minAffection;
    return this;
  }

   /**
   * The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return minAffection
  **/
  public Integer getMinAffection() {
    return minAffection;
  }

  public void setMinAffection(Integer minAffection) {
    this.minAffection = minAffection;
  }

  public PokemonEvolution nearSpecialRock(Boolean nearSpecialRock) {
    this.nearSpecialRock = nearSpecialRock;
    return this;
  }

   /**
   * Whether or not you need to be near a Moss Rock or Icy Rock to evolve into this Pokémon species.
   * @return nearSpecialRock
  **/
  public Boolean getNearSpecialRock() {
    return nearSpecialRock;
  }

  public void setNearSpecialRock(Boolean nearSpecialRock) {
    this.nearSpecialRock = nearSpecialRock;
  }

  public PokemonEvolution needsMultiplayer(Boolean needsMultiplayer) {
    this.needsMultiplayer = needsMultiplayer;
    return this;
  }

   /**
   * Whether or not multiplayer link play is needed to evolve into this Pokémon species (e.g. Union Circle).
   * @return needsMultiplayer
  **/
  public Boolean getNeedsMultiplayer() {
    return needsMultiplayer;
  }

  public void setNeedsMultiplayer(Boolean needsMultiplayer) {
    this.needsMultiplayer = needsMultiplayer;
  }

  public PokemonEvolution needsOverworldRain(Boolean needsOverworldRain) {
    this.needsOverworldRain = needsOverworldRain;
    return this;
  }

   /**
   * Whether or not it must be raining in the overworld to cause evolution this Pokémon species.
   * @return needsOverworldRain
  **/
  public Boolean getNeedsOverworldRain() {
    return needsOverworldRain;
  }

  public void setNeedsOverworldRain(Boolean needsOverworldRain) {
    this.needsOverworldRain = needsOverworldRain;
  }

  public PokemonEvolution partySpecies(PokemonSpeciesSummary partySpecies) {
    this.partySpecies = partySpecies;
    return this;
  }

   /**
   * The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species.
   * @return partySpecies
  **/
  public PokemonSpeciesSummary getPartySpecies() {
    return partySpecies;
  }

  public void setPartySpecies(PokemonSpeciesSummary partySpecies) {
    this.partySpecies = partySpecies;
  }

  public PokemonEvolution partyType(TypeSummary partyType) {
    this.partyType = partyType;
    return this;
  }

   /**
   * The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species.
   * @return partyType
  **/
  public TypeSummary getPartyType() {
    return partyType;
  }

  public void setPartyType(TypeSummary partyType) {
    this.partyType = partyType;
  }

  public PokemonEvolution relativePhysicalStats(Integer relativePhysicalStats) {
    this.relativePhysicalStats = relativePhysicalStats;
    return this;
  }

   /**
   * The required relation between the Pokémon's Attack and Defense stats. 1 means Attack > Defense. 0 means Attack = Defense. -1 means Attack < Defense.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return relativePhysicalStats
  **/
  public Integer getRelativePhysicalStats() {
    return relativePhysicalStats;
  }

  public void setRelativePhysicalStats(Integer relativePhysicalStats) {
    this.relativePhysicalStats = relativePhysicalStats;
  }

  public PokemonEvolution timeOfDay(String timeOfDay) {
    this.timeOfDay = timeOfDay;
    return this;
  }

   /**
   * The required time of day. Day or night.
   * @return timeOfDay
  **/
  public String getTimeOfDay() {
    return timeOfDay;
  }

  public void setTimeOfDay(String timeOfDay) {
    this.timeOfDay = timeOfDay;
  }

  public PokemonEvolution tradeSpecies(PokemonSpeciesSummary tradeSpecies) {
    this.tradeSpecies = tradeSpecies;
    return this;
  }

   /**
   * Pokémon species for which this one must be traded.
   * @return tradeSpecies
  **/
  public PokemonSpeciesSummary getTradeSpecies() {
    return tradeSpecies;
  }

  public void setTradeSpecies(PokemonSpeciesSummary tradeSpecies) {
    this.tradeSpecies = tradeSpecies;
  }

  public PokemonEvolution turnUpsideDown(Boolean turnUpsideDown) {
    this.turnUpsideDown = turnUpsideDown;
    return this;
  }

   /**
   * Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up.
   * @return turnUpsideDown
  **/
  public Boolean getTurnUpsideDown() {
    return turnUpsideDown;
  }

  public void setTurnUpsideDown(Boolean turnUpsideDown) {
    this.turnUpsideDown = turnUpsideDown;
  }

  public PokemonEvolution region(RegionSummary region) {
    this.region = region;
    return this;
  }

   /**
   * The required region in which this evolution can occur.
   * @return region
  **/
  public RegionSummary getRegion() {
    return region;
  }

  public void setRegion(RegionSummary region) {
    this.region = region;
  }

  public PokemonEvolution requiredPokemonForm(PokemonFormSummary requiredPokemonForm) {
    this.requiredPokemonForm = requiredPokemonForm;
    return this;
  }

   /**
   * The Pokémon form required before evolving, or null if unrestricted.
   * @return requiredPokemonForm
  **/
  public PokemonFormSummary getRequiredPokemonForm() {
    return requiredPokemonForm;
  }

  public void setRequiredPokemonForm(PokemonFormSummary requiredPokemonForm) {
    this.requiredPokemonForm = requiredPokemonForm;
  }

  public PokemonEvolution evolvedPokemonForm(PokemonFormSummary evolvedPokemonForm) {
    this.evolvedPokemonForm = evolvedPokemonForm;
    return this;
  }

   /**
   * The Pokémon form produced by this evolution, or null if unspecified.
   * @return evolvedPokemonForm
  **/
  public PokemonFormSummary getEvolvedPokemonForm() {
    return evolvedPokemonForm;
  }

  public void setEvolvedPokemonForm(PokemonFormSummary evolvedPokemonForm) {
    this.evolvedPokemonForm = evolvedPokemonForm;
  }

  public PokemonEvolution usedMove(MoveSummary usedMove) {
    this.usedMove = usedMove;
    return this;
  }

   /**
   * The move that must be used by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species.
   * @return usedMove
  **/
  public MoveSummary getUsedMove() {
    return usedMove;
  }

  public void setUsedMove(MoveSummary usedMove) {
    this.usedMove = usedMove;
  }

  public PokemonEvolution minMoveCount(Integer minMoveCount) {
    this.minMoveCount = minMoveCount;
    return this;
  }

   /**
   * The minimum number of times a move must be used in order to evolve into this Pokémon species.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return minMoveCount
  **/
  public Integer getMinMoveCount() {
    return minMoveCount;
  }

  public void setMinMoveCount(Integer minMoveCount) {
    this.minMoveCount = minMoveCount;
  }

  public PokemonEvolution minSteps(Integer minSteps) {
    this.minSteps = minSteps;
    return this;
  }

   /**
   * The minimum number of steps that must be taken in order to evolve into this Pokémon species.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return minSteps
  **/
  public Integer getMinSteps() {
    return minSteps;
  }

  public void setMinSteps(Integer minSteps) {
    this.minSteps = minSteps;
  }

  public PokemonEvolution minDamageTaken(Integer minDamageTaken) {
    this.minDamageTaken = minDamageTaken;
    return this;
  }

   /**
   * The minimum amount of damage taken during the evolution trigger event in order to evolve into this Pokémon species.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return minDamageTaken
  **/
  public Integer getMinDamageTaken() {
    return minDamageTaken;
  }

  public void setMinDamageTaken(Integer minDamageTaken) {
    this.minDamageTaken = minDamageTaken;
  }

  public PokemonEvolution allowedNatures(List<@Valid NatureSummary> allowedNatures) {
    this.allowedNatures = allowedNatures;
    return this;
  }

  public PokemonEvolution addAllowedNaturesItem(NatureSummary allowedNaturesItem) {
    if (this.allowedNatures == null) {
      this.allowedNatures = new ArrayList<>();
    }
    this.allowedNatures.add(allowedNaturesItem);
    return this;
  }

   /**
   * The natures that allow this evolution, or null if unrestricted.
   * @return allowedNatures
  **/
  public List<@Valid NatureSummary> getAllowedNatures() {
    return allowedNatures;
  }

  public void setAllowedNatures(List<@Valid NatureSummary> allowedNatures) {
    this.allowedNatures = allowedNatures;
  }

  public PokemonEvolution conditionExpression(EvolutionConditionExpression conditionExpression) {
    this.conditionExpression = conditionExpression;
    return this;
  }

   /**
   * An additional evolution condition expressed in reverse Polish notation, or null if none.
   * @return conditionExpression
  **/
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
    return Objects.equals(versionGroup, pokemonEvolution.versionGroup) &&
        Objects.equals(isDefault, pokemonEvolution.isDefault) &&
        Objects.equals(item, pokemonEvolution.item) &&
        Objects.equals(trigger, pokemonEvolution.trigger) &&
        Objects.equals(gender, pokemonEvolution.gender) &&
        Objects.equals(heldItem, pokemonEvolution.heldItem) &&
        Objects.equals(knownMove, pokemonEvolution.knownMove) &&
        Objects.equals(knownMoveType, pokemonEvolution.knownMoveType) &&
        Objects.equals(location, pokemonEvolution.location) &&
        Objects.equals(minLevel, pokemonEvolution.minLevel) &&
        Objects.equals(minHappiness, pokemonEvolution.minHappiness) &&
        Objects.equals(minBeauty, pokemonEvolution.minBeauty) &&
        Objects.equals(minAffection, pokemonEvolution.minAffection) &&
        Objects.equals(nearSpecialRock, pokemonEvolution.nearSpecialRock) &&
        Objects.equals(needsMultiplayer, pokemonEvolution.needsMultiplayer) &&
        Objects.equals(needsOverworldRain, pokemonEvolution.needsOverworldRain) &&
        Objects.equals(partySpecies, pokemonEvolution.partySpecies) &&
        Objects.equals(partyType, pokemonEvolution.partyType) &&
        Objects.equals(relativePhysicalStats, pokemonEvolution.relativePhysicalStats) &&
        Objects.equals(timeOfDay, pokemonEvolution.timeOfDay) &&
        Objects.equals(tradeSpecies, pokemonEvolution.tradeSpecies) &&
        Objects.equals(turnUpsideDown, pokemonEvolution.turnUpsideDown) &&
        Objects.equals(region, pokemonEvolution.region) &&
        Objects.equals(requiredPokemonForm, pokemonEvolution.requiredPokemonForm) &&
        Objects.equals(evolvedPokemonForm, pokemonEvolution.evolvedPokemonForm) &&
        Objects.equals(usedMove, pokemonEvolution.usedMove) &&
        Objects.equals(minMoveCount, pokemonEvolution.minMoveCount) &&
        Objects.equals(minSteps, pokemonEvolution.minSteps) &&
        Objects.equals(minDamageTaken, pokemonEvolution.minDamageTaken) &&
        Objects.equals(allowedNatures, pokemonEvolution.allowedNatures) &&
        Objects.equals(conditionExpression, pokemonEvolution.conditionExpression);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionGroup, isDefault, item, trigger, gender, heldItem, knownMove, knownMoveType, location, minLevel, minHappiness, minBeauty, minAffection, nearSpecialRock, needsMultiplayer, needsOverworldRain, partySpecies, partyType, relativePhysicalStats, timeOfDay, tradeSpecies, turnUpsideDown, region, requiredPokemonForm, evolvedPokemonForm, usedMove, minMoveCount, minSteps, minDamageTaken, allowedNatures, conditionExpression);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

