package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.EvolutionConditionExpression;
import org.openapitools.vertxweb.server.model.EvolutionTriggerSummary;
import org.openapitools.vertxweb.server.model.ItemSummary;
import org.openapitools.vertxweb.server.model.LocationSummary;
import org.openapitools.vertxweb.server.model.MoveSummary;
import org.openapitools.vertxweb.server.model.NatureSummary;
import org.openapitools.vertxweb.server.model.PokemonEvolutionKnownMove;
import org.openapitools.vertxweb.server.model.PokemonFormSummary;
import org.openapitools.vertxweb.server.model.PokemonSpeciesSummary;
import org.openapitools.vertxweb.server.model.RegionSummary;
import org.openapitools.vertxweb.server.model.TypeSummary;
import org.openapitools.vertxweb.server.model.VersionGroupSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
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
  private List<NatureSummary> allowedNatures;
  private EvolutionConditionExpression conditionExpression;

  public PokemonEvolution () {

  }

  public PokemonEvolution (VersionGroupSummary versionGroup, Boolean isDefault, ItemSummary item, EvolutionTriggerSummary trigger, Integer gender, ItemSummary heldItem, PokemonEvolutionKnownMove knownMove, PokemonEvolutionKnownMove knownMoveType, LocationSummary location, Integer minLevel, Integer minHappiness, Integer minBeauty, Integer minAffection, Boolean nearSpecialRock, Boolean needsMultiplayer, Boolean needsOverworldRain, PokemonSpeciesSummary partySpecies, TypeSummary partyType, Integer relativePhysicalStats, String timeOfDay, PokemonSpeciesSummary tradeSpecies, Boolean turnUpsideDown, RegionSummary region, PokemonFormSummary requiredPokemonForm, PokemonFormSummary evolvedPokemonForm, MoveSummary usedMove, Integer minMoveCount, Integer minSteps, Integer minDamageTaken, List<NatureSummary> allowedNatures, EvolutionConditionExpression conditionExpression) {
    this.versionGroup = versionGroup;
    this.isDefault = isDefault;
    this.item = item;
    this.trigger = trigger;
    this.gender = gender;
    this.heldItem = heldItem;
    this.knownMove = knownMove;
    this.knownMoveType = knownMoveType;
    this.location = location;
    this.minLevel = minLevel;
    this.minHappiness = minHappiness;
    this.minBeauty = minBeauty;
    this.minAffection = minAffection;
    this.nearSpecialRock = nearSpecialRock;
    this.needsMultiplayer = needsMultiplayer;
    this.needsOverworldRain = needsOverworldRain;
    this.partySpecies = partySpecies;
    this.partyType = partyType;
    this.relativePhysicalStats = relativePhysicalStats;
    this.timeOfDay = timeOfDay;
    this.tradeSpecies = tradeSpecies;
    this.turnUpsideDown = turnUpsideDown;
    this.region = region;
    this.requiredPokemonForm = requiredPokemonForm;
    this.evolvedPokemonForm = evolvedPokemonForm;
    this.usedMove = usedMove;
    this.minMoveCount = minMoveCount;
    this.minSteps = minSteps;
    this.minDamageTaken = minDamageTaken;
    this.allowedNatures = allowedNatures;
    this.conditionExpression = conditionExpression;
  }

    
  @JsonProperty("version_group")
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }
  public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

    
  @JsonProperty("is_default")
  public Boolean getIsDefault() {
    return isDefault;
  }
  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

    
  @JsonProperty("item")
  public ItemSummary getItem() {
    return item;
  }
  public void setItem(ItemSummary item) {
    this.item = item;
  }

    
  @JsonProperty("trigger")
  public EvolutionTriggerSummary getTrigger() {
    return trigger;
  }
  public void setTrigger(EvolutionTriggerSummary trigger) {
    this.trigger = trigger;
  }

    
  @JsonProperty("gender")
  public Integer getGender() {
    return gender;
  }
  public void setGender(Integer gender) {
    this.gender = gender;
  }

    
  @JsonProperty("held_item")
  public ItemSummary getHeldItem() {
    return heldItem;
  }
  public void setHeldItem(ItemSummary heldItem) {
    this.heldItem = heldItem;
  }

    
  @JsonProperty("known_move")
  public PokemonEvolutionKnownMove getKnownMove() {
    return knownMove;
  }
  public void setKnownMove(PokemonEvolutionKnownMove knownMove) {
    this.knownMove = knownMove;
  }

    
  @JsonProperty("known_move_type")
  public PokemonEvolutionKnownMove getKnownMoveType() {
    return knownMoveType;
  }
  public void setKnownMoveType(PokemonEvolutionKnownMove knownMoveType) {
    this.knownMoveType = knownMoveType;
  }

    
  @JsonProperty("location")
  public LocationSummary getLocation() {
    return location;
  }
  public void setLocation(LocationSummary location) {
    this.location = location;
  }

    
  @JsonProperty("min_level")
  public Integer getMinLevel() {
    return minLevel;
  }
  public void setMinLevel(Integer minLevel) {
    this.minLevel = minLevel;
  }

    
  @JsonProperty("min_happiness")
  public Integer getMinHappiness() {
    return minHappiness;
  }
  public void setMinHappiness(Integer minHappiness) {
    this.minHappiness = minHappiness;
  }

    
  @JsonProperty("min_beauty")
  public Integer getMinBeauty() {
    return minBeauty;
  }
  public void setMinBeauty(Integer minBeauty) {
    this.minBeauty = minBeauty;
  }

    
  @JsonProperty("min_affection")
  public Integer getMinAffection() {
    return minAffection;
  }
  public void setMinAffection(Integer minAffection) {
    this.minAffection = minAffection;
  }

    
  @JsonProperty("near_special_rock")
  public Boolean getNearSpecialRock() {
    return nearSpecialRock;
  }
  public void setNearSpecialRock(Boolean nearSpecialRock) {
    this.nearSpecialRock = nearSpecialRock;
  }

    
  @JsonProperty("needs_multiplayer")
  public Boolean getNeedsMultiplayer() {
    return needsMultiplayer;
  }
  public void setNeedsMultiplayer(Boolean needsMultiplayer) {
    this.needsMultiplayer = needsMultiplayer;
  }

    
  @JsonProperty("needs_overworld_rain")
  public Boolean getNeedsOverworldRain() {
    return needsOverworldRain;
  }
  public void setNeedsOverworldRain(Boolean needsOverworldRain) {
    this.needsOverworldRain = needsOverworldRain;
  }

    
  @JsonProperty("party_species")
  public PokemonSpeciesSummary getPartySpecies() {
    return partySpecies;
  }
  public void setPartySpecies(PokemonSpeciesSummary partySpecies) {
    this.partySpecies = partySpecies;
  }

    
  @JsonProperty("party_type")
  public TypeSummary getPartyType() {
    return partyType;
  }
  public void setPartyType(TypeSummary partyType) {
    this.partyType = partyType;
  }

    
  @JsonProperty("relative_physical_stats")
  public Integer getRelativePhysicalStats() {
    return relativePhysicalStats;
  }
  public void setRelativePhysicalStats(Integer relativePhysicalStats) {
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
  public PokemonSpeciesSummary getTradeSpecies() {
    return tradeSpecies;
  }
  public void setTradeSpecies(PokemonSpeciesSummary tradeSpecies) {
    this.tradeSpecies = tradeSpecies;
  }

    
  @JsonProperty("turn_upside_down")
  public Boolean getTurnUpsideDown() {
    return turnUpsideDown;
  }
  public void setTurnUpsideDown(Boolean turnUpsideDown) {
    this.turnUpsideDown = turnUpsideDown;
  }

    
  @JsonProperty("region")
  public RegionSummary getRegion() {
    return region;
  }
  public void setRegion(RegionSummary region) {
    this.region = region;
  }

    
  @JsonProperty("required_pokemon_form")
  public PokemonFormSummary getRequiredPokemonForm() {
    return requiredPokemonForm;
  }
  public void setRequiredPokemonForm(PokemonFormSummary requiredPokemonForm) {
    this.requiredPokemonForm = requiredPokemonForm;
  }

    
  @JsonProperty("evolved_pokemon_form")
  public PokemonFormSummary getEvolvedPokemonForm() {
    return evolvedPokemonForm;
  }
  public void setEvolvedPokemonForm(PokemonFormSummary evolvedPokemonForm) {
    this.evolvedPokemonForm = evolvedPokemonForm;
  }

    
  @JsonProperty("used_move")
  public MoveSummary getUsedMove() {
    return usedMove;
  }
  public void setUsedMove(MoveSummary usedMove) {
    this.usedMove = usedMove;
  }

    
  @JsonProperty("min_move_count")
  public Integer getMinMoveCount() {
    return minMoveCount;
  }
  public void setMinMoveCount(Integer minMoveCount) {
    this.minMoveCount = minMoveCount;
  }

    
  @JsonProperty("min_steps")
  public Integer getMinSteps() {
    return minSteps;
  }
  public void setMinSteps(Integer minSteps) {
    this.minSteps = minSteps;
  }

    
  @JsonProperty("min_damage_taken")
  public Integer getMinDamageTaken() {
    return minDamageTaken;
  }
  public void setMinDamageTaken(Integer minDamageTaken) {
    this.minDamageTaken = minDamageTaken;
  }

    
  @JsonProperty("allowed_natures")
  public List<NatureSummary> getAllowedNatures() {
    return allowedNatures;
  }
  public void setAllowedNatures(List<NatureSummary> allowedNatures) {
    this.allowedNatures = allowedNatures;
  }

    
  @JsonProperty("condition_expression")
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
