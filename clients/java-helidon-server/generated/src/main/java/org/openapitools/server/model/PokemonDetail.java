package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.PokemonDetailAbilitiesInner;
import org.openapitools.server.model.PokemonDetailCries;
import org.openapitools.server.model.PokemonDetailHeldItems;
import org.openapitools.server.model.PokemonDetailMovesInner;
import org.openapitools.server.model.PokemonDetailPastAbilitiesInner;
import org.openapitools.server.model.PokemonDetailPastTypesInner;
import org.openapitools.server.model.PokemonDetailSprites;
import org.openapitools.server.model.PokemonDetailTypesInner;
import org.openapitools.server.model.PokemonFormSummary;
import org.openapitools.server.model.PokemonGameIndex;
import org.openapitools.server.model.PokemonSpeciesSummary;
import org.openapitools.server.model.PokemonStat;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokemonDetail   {

    private Integer id;
    private String name;
    private Integer baseExperience;
    private Integer height;
    private Boolean isDefault;
    private Integer order;
    private Integer weight;
    private List<@Valid PokemonDetailAbilitiesInner> abilities = new ArrayList<>();
    private List<@Valid PokemonDetailPastAbilitiesInner> pastAbilities = new ArrayList<>();
    private List<@Valid PokemonFormSummary> forms = new ArrayList<>();
    private List<@Valid PokemonGameIndex> gameIndices = new ArrayList<>();
    private PokemonDetailHeldItems heldItems;
    private String locationAreaEncounters;
    private List<@Valid PokemonDetailMovesInner> moves = new ArrayList<>();
    private PokemonSpeciesSummary species;
    private PokemonDetailSprites sprites;
    private PokemonDetailCries cries;
    private List<@Valid PokemonStat> stats = new ArrayList<>();
    private List<@Valid PokemonDetailTypesInner> types = new ArrayList<>();
    private List<@Valid PokemonDetailPastTypesInner> pastTypes = new ArrayList<>();

    /**
     * Default constructor.
     */
    public PokemonDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonDetail.
     *
     * @param id id
     * @param name name
     * @param baseExperience baseExperience
     * @param height height
     * @param isDefault isDefault
     * @param order order
     * @param weight weight
     * @param abilities abilities
     * @param pastAbilities pastAbilities
     * @param forms forms
     * @param gameIndices gameIndices
     * @param heldItems heldItems
     * @param locationAreaEncounters locationAreaEncounters
     * @param moves moves
     * @param species species
     * @param sprites sprites
     * @param cries cries
     * @param stats stats
     * @param types types
     * @param pastTypes pastTypes
     */
    public PokemonDetail(
        Integer id, 
        String name, 
        Integer baseExperience, 
        Integer height, 
        Boolean isDefault, 
        Integer order, 
        Integer weight, 
        List<@Valid PokemonDetailAbilitiesInner> abilities, 
        List<@Valid PokemonDetailPastAbilitiesInner> pastAbilities, 
        List<@Valid PokemonFormSummary> forms, 
        List<@Valid PokemonGameIndex> gameIndices, 
        PokemonDetailHeldItems heldItems, 
        String locationAreaEncounters, 
        List<@Valid PokemonDetailMovesInner> moves, 
        PokemonSpeciesSummary species, 
        PokemonDetailSprites sprites, 
        PokemonDetailCries cries, 
        List<@Valid PokemonStat> stats, 
        List<@Valid PokemonDetailTypesInner> types, 
        List<@Valid PokemonDetailPastTypesInner> pastTypes
    ) {
        this.id = id;
        this.name = name;
        this.baseExperience = baseExperience;
        this.height = height;
        this.isDefault = isDefault;
        this.order = order;
        this.weight = weight;
        this.abilities = abilities;
        this.pastAbilities = pastAbilities;
        this.forms = forms;
        this.gameIndices = gameIndices;
        this.heldItems = heldItems;
        this.locationAreaEncounters = locationAreaEncounters;
        this.moves = moves;
        this.species = species;
        this.sprites = sprites;
        this.cries = cries;
        this.stats = stats;
        this.types = types;
        this.pastTypes = pastTypes;
    }



    /**
     * Get id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get baseExperience
     * @return baseExperience
     */
    public Integer getBaseExperience() {
        return baseExperience;
    }

    public void setBaseExperience(Integer baseExperience) {
        this.baseExperience = baseExperience;
    }

    /**
     * Get height
     * @return height
     */
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * Get isDefault
     * @return isDefault
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * Get order
     * @return order
     */
    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    /**
     * Get weight
     * @return weight
     */
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * Get abilities
     * @return abilities
     */
    public List<@Valid PokemonDetailAbilitiesInner> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<@Valid PokemonDetailAbilitiesInner> abilities) {
        this.abilities = abilities;
    }

    /**
     * Get pastAbilities
     * @return pastAbilities
     */
    public List<@Valid PokemonDetailPastAbilitiesInner> getPastAbilities() {
        return pastAbilities;
    }

    public void setPastAbilities(List<@Valid PokemonDetailPastAbilitiesInner> pastAbilities) {
        this.pastAbilities = pastAbilities;
    }

    /**
     * Get forms
     * @return forms
     */
    public List<@Valid PokemonFormSummary> getForms() {
        return forms;
    }

    public void setForms(List<@Valid PokemonFormSummary> forms) {
        this.forms = forms;
    }

    /**
     * Get gameIndices
     * @return gameIndices
     */
    public List<@Valid PokemonGameIndex> getGameIndices() {
        return gameIndices;
    }

    public void setGameIndices(List<@Valid PokemonGameIndex> gameIndices) {
        this.gameIndices = gameIndices;
    }

    /**
     * Get heldItems
     * @return heldItems
     */
    public PokemonDetailHeldItems getHeldItems() {
        return heldItems;
    }

    public void setHeldItems(PokemonDetailHeldItems heldItems) {
        this.heldItems = heldItems;
    }

    /**
     * Get locationAreaEncounters
     * @return locationAreaEncounters
     */
    public String getLocationAreaEncounters() {
        return locationAreaEncounters;
    }

    public void setLocationAreaEncounters(String locationAreaEncounters) {
        this.locationAreaEncounters = locationAreaEncounters;
    }

    /**
     * Get moves
     * @return moves
     */
    public List<@Valid PokemonDetailMovesInner> getMoves() {
        return moves;
    }

    public void setMoves(List<@Valid PokemonDetailMovesInner> moves) {
        this.moves = moves;
    }

    /**
     * Get species
     * @return species
     */
    public PokemonSpeciesSummary getSpecies() {
        return species;
    }

    public void setSpecies(PokemonSpeciesSummary species) {
        this.species = species;
    }

    /**
     * Get sprites
     * @return sprites
     */
    public PokemonDetailSprites getSprites() {
        return sprites;
    }

    public void setSprites(PokemonDetailSprites sprites) {
        this.sprites = sprites;
    }

    /**
     * Get cries
     * @return cries
     */
    public PokemonDetailCries getCries() {
        return cries;
    }

    public void setCries(PokemonDetailCries cries) {
        this.cries = cries;
    }

    /**
     * Get stats
     * @return stats
     */
    public List<@Valid PokemonStat> getStats() {
        return stats;
    }

    public void setStats(List<@Valid PokemonStat> stats) {
        this.stats = stats;
    }

    /**
     * Get types
     * @return types
     */
    public List<@Valid PokemonDetailTypesInner> getTypes() {
        return types;
    }

    public void setTypes(List<@Valid PokemonDetailTypesInner> types) {
        this.types = types;
    }

    /**
     * Get pastTypes
     * @return pastTypes
     */
    public List<@Valid PokemonDetailPastTypesInner> getPastTypes() {
        return pastTypes;
    }

    public void setPastTypes(List<@Valid PokemonDetailPastTypesInner> pastTypes) {
        this.pastTypes = pastTypes;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonDetail {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    baseExperience: ").append(toIndentedString(baseExperience)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    abilities: ").append(toIndentedString(abilities)).append("\n");
        sb.append("    pastAbilities: ").append(toIndentedString(pastAbilities)).append("\n");
        sb.append("    forms: ").append(toIndentedString(forms)).append("\n");
        sb.append("    gameIndices: ").append(toIndentedString(gameIndices)).append("\n");
        sb.append("    heldItems: ").append(toIndentedString(heldItems)).append("\n");
        sb.append("    locationAreaEncounters: ").append(toIndentedString(locationAreaEncounters)).append("\n");
        sb.append("    moves: ").append(toIndentedString(moves)).append("\n");
        sb.append("    species: ").append(toIndentedString(species)).append("\n");
        sb.append("    sprites: ").append(toIndentedString(sprites)).append("\n");
        sb.append("    cries: ").append(toIndentedString(cries)).append("\n");
        sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
        sb.append("    types: ").append(toIndentedString(types)).append("\n");
        sb.append("    pastTypes: ").append(toIndentedString(pastTypes)).append("\n");
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

