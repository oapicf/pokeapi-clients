package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.EvolutionConditionExpression;
import org.openapitools.server.model.EvolutionTriggerSummary;
import org.openapitools.server.model.ItemSummary;
import org.openapitools.server.model.LocationSummary;
import org.openapitools.server.model.MoveSummary;
import org.openapitools.server.model.NatureSummary;
import org.openapitools.server.model.PokemonEvolutionKnownMove;
import org.openapitools.server.model.PokemonFormSummary;
import org.openapitools.server.model.PokemonSpeciesSummary;
import org.openapitools.server.model.RegionSummary;
import org.openapitools.server.model.TypeSummary;
import org.openapitools.server.model.VersionGroupSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



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
     * Default constructor.
     */
    public PokemonEvolution() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonEvolution.
     *
     * @param versionGroup The version group in which these evolution requirements apply.
     * @param isDefault Whether the evolution is considered as the expected evolution in a main series game. Each unique Pokémon variety of a line capable of evolution should have exactly one &#39;default&#39; evolution. For example, the Meowth species has three default evolutions as there are three distinct varieties it can evolve into: Persian, Alolan Persian, and Perrserker.
     * @param item The item required to cause evolution this into Pokémon species.
     * @param trigger The type of event that triggers evolution into this Pokémon species.
     * @param gender The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species.
     * @param heldItem The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species.
     * @param knownMove knownMove
     * @param knownMoveType knownMoveType
     * @param location The location the evolution must be triggered at.
     * @param minLevel The minimum required level of the evolving Pokémon species to evolve into this Pokémon species.
     * @param minHappiness The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species.
     * @param minBeauty The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species.
     * @param minAffection The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species.
     * @param nearSpecialRock Whether or not you need to be near a Moss Rock or Icy Rock to evolve into this Pokémon species.
     * @param needsMultiplayer Whether or not multiplayer link play is needed to evolve into this Pokémon species (e.g. Union Circle).
     * @param needsOverworldRain Whether or not it must be raining in the overworld to cause evolution this Pokémon species.
     * @param partySpecies The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species.
     * @param partyType The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species.
     * @param relativePhysicalStats The required relation between the Pokémon&#39;s Attack and Defense stats. 1 means Attack &gt; Defense. 0 means Attack &#x3D; Defense. -1 means Attack &lt; Defense.
     * @param timeOfDay The required time of day. Day or night.
     * @param tradeSpecies Pokémon species for which this one must be traded.
     * @param turnUpsideDown Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up.
     * @param region The required region in which this evolution can occur.
     * @param requiredPokemonForm The Pokémon form required before evolving, or null if unrestricted.
     * @param evolvedPokemonForm The Pokémon form produced by this evolution, or null if unspecified.
     * @param usedMove The move that must be used by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species.
     * @param minMoveCount The minimum number of times a move must be used in order to evolve into this Pokémon species.
     * @param minSteps The minimum number of steps that must be taken in order to evolve into this Pokémon species.
     * @param minDamageTaken The minimum amount of damage taken during the evolution trigger event in order to evolve into this Pokémon species.
     * @param allowedNatures The natures that allow this evolution, or null if unrestricted.
     * @param conditionExpression An additional evolution condition expressed in reverse Polish notation, or null if none.
     */
    public PokemonEvolution(
        VersionGroupSummary versionGroup, 
        Boolean isDefault, 
        ItemSummary item, 
        EvolutionTriggerSummary trigger, 
        Integer gender, 
        ItemSummary heldItem, 
        PokemonEvolutionKnownMove knownMove, 
        PokemonEvolutionKnownMove knownMoveType, 
        LocationSummary location, 
        Integer minLevel, 
        Integer minHappiness, 
        Integer minBeauty, 
        Integer minAffection, 
        Boolean nearSpecialRock, 
        Boolean needsMultiplayer, 
        Boolean needsOverworldRain, 
        PokemonSpeciesSummary partySpecies, 
        TypeSummary partyType, 
        Integer relativePhysicalStats, 
        String timeOfDay, 
        PokemonSpeciesSummary tradeSpecies, 
        Boolean turnUpsideDown, 
        RegionSummary region, 
        PokemonFormSummary requiredPokemonForm, 
        PokemonFormSummary evolvedPokemonForm, 
        MoveSummary usedMove, 
        Integer minMoveCount, 
        Integer minSteps, 
        Integer minDamageTaken, 
        List<@Valid NatureSummary> allowedNatures, 
        EvolutionConditionExpression conditionExpression
    ) {
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



    /**
     * The version group in which these evolution requirements apply.
     * @return versionGroup
     */
    public VersionGroupSummary getVersionGroup() {
        return versionGroup;
    }

    public void setVersionGroup(VersionGroupSummary versionGroup) {
        this.versionGroup = versionGroup;
    }

    /**
     * Whether the evolution is considered as the expected evolution in a main series game. Each unique Pokémon variety of a line capable of evolution should have exactly one 'default' evolution. For example, the Meowth species has three default evolutions as there are three distinct varieties it can evolve into: Persian, Alolan Persian, and Perrserker.
     * @return isDefault
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * The item required to cause evolution this into Pokémon species.
     * @return item
     */
    public ItemSummary getItem() {
        return item;
    }

    public void setItem(ItemSummary item) {
        this.item = item;
    }

    /**
     * The type of event that triggers evolution into this Pokémon species.
     * @return trigger
     */
    public EvolutionTriggerSummary getTrigger() {
        return trigger;
    }

    public void setTrigger(EvolutionTriggerSummary trigger) {
        this.trigger = trigger;
    }

    /**
     * The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species.
     * @return gender
     */
    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species.
     * @return heldItem
     */
    public ItemSummary getHeldItem() {
        return heldItem;
    }

    public void setHeldItem(ItemSummary heldItem) {
        this.heldItem = heldItem;
    }

    /**
     * Get knownMove
     * @return knownMove
     */
    public PokemonEvolutionKnownMove getKnownMove() {
        return knownMove;
    }

    public void setKnownMove(PokemonEvolutionKnownMove knownMove) {
        this.knownMove = knownMove;
    }

    /**
     * Get knownMoveType
     * @return knownMoveType
     */
    public PokemonEvolutionKnownMove getKnownMoveType() {
        return knownMoveType;
    }

    public void setKnownMoveType(PokemonEvolutionKnownMove knownMoveType) {
        this.knownMoveType = knownMoveType;
    }

    /**
     * The location the evolution must be triggered at.
     * @return location
     */
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
     * @return minLevel
     */
    public Integer getMinLevel() {
        return minLevel;
    }

    public void setMinLevel(Integer minLevel) {
        this.minLevel = minLevel;
    }

    /**
     * The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species.
     * minimum: -2147483648
     * maximum: 2147483647
     * @return minHappiness
     */
    public Integer getMinHappiness() {
        return minHappiness;
    }

    public void setMinHappiness(Integer minHappiness) {
        this.minHappiness = minHappiness;
    }

    /**
     * The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species.
     * minimum: -2147483648
     * maximum: 2147483647
     * @return minBeauty
     */
    public Integer getMinBeauty() {
        return minBeauty;
    }

    public void setMinBeauty(Integer minBeauty) {
        this.minBeauty = minBeauty;
    }

    /**
     * The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species.
     * minimum: -2147483648
     * maximum: 2147483647
     * @return minAffection
     */
    public Integer getMinAffection() {
        return minAffection;
    }

    public void setMinAffection(Integer minAffection) {
        this.minAffection = minAffection;
    }

    /**
     * Whether or not you need to be near a Moss Rock or Icy Rock to evolve into this Pokémon species.
     * @return nearSpecialRock
     */
    public Boolean getNearSpecialRock() {
        return nearSpecialRock;
    }

    public void setNearSpecialRock(Boolean nearSpecialRock) {
        this.nearSpecialRock = nearSpecialRock;
    }

    /**
     * Whether or not multiplayer link play is needed to evolve into this Pokémon species (e.g. Union Circle).
     * @return needsMultiplayer
     */
    public Boolean getNeedsMultiplayer() {
        return needsMultiplayer;
    }

    public void setNeedsMultiplayer(Boolean needsMultiplayer) {
        this.needsMultiplayer = needsMultiplayer;
    }

    /**
     * Whether or not it must be raining in the overworld to cause evolution this Pokémon species.
     * @return needsOverworldRain
     */
    public Boolean getNeedsOverworldRain() {
        return needsOverworldRain;
    }

    public void setNeedsOverworldRain(Boolean needsOverworldRain) {
        this.needsOverworldRain = needsOverworldRain;
    }

    /**
     * The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species.
     * @return partySpecies
     */
    public PokemonSpeciesSummary getPartySpecies() {
        return partySpecies;
    }

    public void setPartySpecies(PokemonSpeciesSummary partySpecies) {
        this.partySpecies = partySpecies;
    }

    /**
     * The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species.
     * @return partyType
     */
    public TypeSummary getPartyType() {
        return partyType;
    }

    public void setPartyType(TypeSummary partyType) {
        this.partyType = partyType;
    }

    /**
     * The required relation between the Pokémon's Attack and Defense stats. 1 means Attack > Defense. 0 means Attack = Defense. -1 means Attack < Defense.
     * minimum: -2147483648
     * maximum: 2147483647
     * @return relativePhysicalStats
     */
    public Integer getRelativePhysicalStats() {
        return relativePhysicalStats;
    }

    public void setRelativePhysicalStats(Integer relativePhysicalStats) {
        this.relativePhysicalStats = relativePhysicalStats;
    }

    /**
     * The required time of day. Day or night.
     * @return timeOfDay
     */
    public String getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    /**
     * Pokémon species for which this one must be traded.
     * @return tradeSpecies
     */
    public PokemonSpeciesSummary getTradeSpecies() {
        return tradeSpecies;
    }

    public void setTradeSpecies(PokemonSpeciesSummary tradeSpecies) {
        this.tradeSpecies = tradeSpecies;
    }

    /**
     * Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up.
     * @return turnUpsideDown
     */
    public Boolean getTurnUpsideDown() {
        return turnUpsideDown;
    }

    public void setTurnUpsideDown(Boolean turnUpsideDown) {
        this.turnUpsideDown = turnUpsideDown;
    }

    /**
     * The required region in which this evolution can occur.
     * @return region
     */
    public RegionSummary getRegion() {
        return region;
    }

    public void setRegion(RegionSummary region) {
        this.region = region;
    }

    /**
     * The Pokémon form required before evolving, or null if unrestricted.
     * @return requiredPokemonForm
     */
    public PokemonFormSummary getRequiredPokemonForm() {
        return requiredPokemonForm;
    }

    public void setRequiredPokemonForm(PokemonFormSummary requiredPokemonForm) {
        this.requiredPokemonForm = requiredPokemonForm;
    }

    /**
     * The Pokémon form produced by this evolution, or null if unspecified.
     * @return evolvedPokemonForm
     */
    public PokemonFormSummary getEvolvedPokemonForm() {
        return evolvedPokemonForm;
    }

    public void setEvolvedPokemonForm(PokemonFormSummary evolvedPokemonForm) {
        this.evolvedPokemonForm = evolvedPokemonForm;
    }

    /**
     * The move that must be used by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species.
     * @return usedMove
     */
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
     * @return minMoveCount
     */
    public Integer getMinMoveCount() {
        return minMoveCount;
    }

    public void setMinMoveCount(Integer minMoveCount) {
        this.minMoveCount = minMoveCount;
    }

    /**
     * The minimum number of steps that must be taken in order to evolve into this Pokémon species.
     * minimum: -2147483648
     * maximum: 2147483647
     * @return minSteps
     */
    public Integer getMinSteps() {
        return minSteps;
    }

    public void setMinSteps(Integer minSteps) {
        this.minSteps = minSteps;
    }

    /**
     * The minimum amount of damage taken during the evolution trigger event in order to evolve into this Pokémon species.
     * minimum: -2147483648
     * maximum: 2147483647
     * @return minDamageTaken
     */
    public Integer getMinDamageTaken() {
        return minDamageTaken;
    }

    public void setMinDamageTaken(Integer minDamageTaken) {
        this.minDamageTaken = minDamageTaken;
    }

    /**
     * The natures that allow this evolution, or null if unrestricted.
     * @return allowedNatures
     */
    public List<@Valid NatureSummary> getAllowedNatures() {
        return allowedNatures;
    }

    public void setAllowedNatures(List<@Valid NatureSummary> allowedNatures) {
        this.allowedNatures = allowedNatures;
    }

    /**
     * An additional evolution condition expressed in reverse Polish notation, or null if none.
     * @return conditionExpression
     */
    public EvolutionConditionExpression getConditionExpression() {
        return conditionExpression;
    }

    public void setConditionExpression(EvolutionConditionExpression conditionExpression) {
        this.conditionExpression = conditionExpression;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

