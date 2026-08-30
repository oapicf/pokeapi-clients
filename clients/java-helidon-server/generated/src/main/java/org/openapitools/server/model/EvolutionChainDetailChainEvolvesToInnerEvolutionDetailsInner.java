package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.server.model.EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner   {

    private EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender gender;
    private EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender heldItem;
    private EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender item;
    private EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender knownMove;
    private EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender knownMoveType;
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
     * Default constructor.
     */
    public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner() {
    // JSON-B / Jackson
    }

    /**
     * Create EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.
     *
     * @param gender gender
     * @param heldItem heldItem
     * @param item item
     * @param knownMove knownMove
     * @param knownMoveType knownMoveType
     * @param location location
     * @param minAffection minAffection
     * @param minBeauty minBeauty
     * @param minHappiness minHappiness
     * @param minLevel minLevel
     * @param needsOverworldRain needsOverworldRain
     * @param partySpecies partySpecies
     * @param partyType partyType
     * @param relativePhysicalStats relativePhysicalStats
     * @param timeOfDay timeOfDay
     * @param tradeSpecies tradeSpecies
     * @param trigger trigger
     * @param turnUpsideDown turnUpsideDown
     */
    public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner(
        EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender gender, 
        EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender heldItem, 
        EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender item, 
        EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender knownMove, 
        EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender knownMoveType, 
        EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender location, 
        Integer minAffection, 
        Integer minBeauty, 
        Integer minHappiness, 
        Integer minLevel, 
        Boolean needsOverworldRain, 
        String partySpecies, 
        String partyType, 
        String relativePhysicalStats, 
        String timeOfDay, 
        String tradeSpecies, 
        AbilityDetailPokemonInnerPokemon trigger, 
        Boolean turnUpsideDown
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
     * Get gender
     * @return gender
     */
    public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender getGender() {
        return gender;
    }

    public void setGender(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender gender) {
        this.gender = gender;
    }

    /**
     * Get heldItem
     * @return heldItem
     */
    public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender getHeldItem() {
        return heldItem;
    }

    public void setHeldItem(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender heldItem) {
        this.heldItem = heldItem;
    }

    /**
     * Get item
     * @return item
     */
    public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender getItem() {
        return item;
    }

    public void setItem(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender item) {
        this.item = item;
    }

    /**
     * Get knownMove
     * @return knownMove
     */
    public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender getKnownMove() {
        return knownMove;
    }

    public void setKnownMove(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender knownMove) {
        this.knownMove = knownMove;
    }

    /**
     * Get knownMoveType
     * @return knownMoveType
     */
    public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender getKnownMoveType() {
        return knownMoveType;
    }

    public void setKnownMoveType(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender knownMoveType) {
        this.knownMoveType = knownMoveType;
    }

    /**
     * Get location
     * @return location
     */
    public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender getLocation() {
        return location;
    }

    public void setLocation(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender location) {
        this.location = location;
    }

    /**
     * Get minAffection
     * @return minAffection
     */
    public Integer getMinAffection() {
        return minAffection;
    }

    public void setMinAffection(Integer minAffection) {
        this.minAffection = minAffection;
    }

    /**
     * Get minBeauty
     * @return minBeauty
     */
    public Integer getMinBeauty() {
        return minBeauty;
    }

    public void setMinBeauty(Integer minBeauty) {
        this.minBeauty = minBeauty;
    }

    /**
     * Get minHappiness
     * @return minHappiness
     */
    public Integer getMinHappiness() {
        return minHappiness;
    }

    public void setMinHappiness(Integer minHappiness) {
        this.minHappiness = minHappiness;
    }

    /**
     * Get minLevel
     * @return minLevel
     */
    public Integer getMinLevel() {
        return minLevel;
    }

    public void setMinLevel(Integer minLevel) {
        this.minLevel = minLevel;
    }

    /**
     * Get needsOverworldRain
     * @return needsOverworldRain
     */
    public Boolean getNeedsOverworldRain() {
        return needsOverworldRain;
    }

    public void setNeedsOverworldRain(Boolean needsOverworldRain) {
        this.needsOverworldRain = needsOverworldRain;
    }

    /**
     * Get partySpecies
     * @return partySpecies
     */
    public String getPartySpecies() {
        return partySpecies;
    }

    public void setPartySpecies(String partySpecies) {
        this.partySpecies = partySpecies;
    }

    /**
     * Get partyType
     * @return partyType
     */
    public String getPartyType() {
        return partyType;
    }

    public void setPartyType(String partyType) {
        this.partyType = partyType;
    }

    /**
     * Get relativePhysicalStats
     * @return relativePhysicalStats
     */
    public String getRelativePhysicalStats() {
        return relativePhysicalStats;
    }

    public void setRelativePhysicalStats(String relativePhysicalStats) {
        this.relativePhysicalStats = relativePhysicalStats;
    }

    /**
     * Get timeOfDay
     * @return timeOfDay
     */
    public String getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    /**
     * Get tradeSpecies
     * @return tradeSpecies
     */
    public String getTradeSpecies() {
        return tradeSpecies;
    }

    public void setTradeSpecies(String tradeSpecies) {
        this.tradeSpecies = tradeSpecies;
    }

    /**
     * Get trigger
     * @return trigger
     */
    public AbilityDetailPokemonInnerPokemon getTrigger() {
        return trigger;
    }

    public void setTrigger(AbilityDetailPokemonInnerPokemon trigger) {
        this.trigger = trigger;
    }

    /**
     * Get turnUpsideDown
     * @return turnUpsideDown
     */
    public Boolean getTurnUpsideDown() {
        return turnUpsideDown;
    }

    public void setTurnUpsideDown(Boolean turnUpsideDown) {
        this.turnUpsideDown = turnUpsideDown;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

