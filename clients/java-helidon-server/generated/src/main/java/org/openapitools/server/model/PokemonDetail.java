package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.PokemonAbility;
import org.openapitools.server.model.PokemonCries;
import org.openapitools.server.model.PokemonFormSummary;
import org.openapitools.server.model.PokemonGameIndex;
import org.openapitools.server.model.PokemonHeldItemSummary;
import org.openapitools.server.model.PokemonMove;
import org.openapitools.server.model.PokemonPastAbility;
import org.openapitools.server.model.PokemonPastStat;
import org.openapitools.server.model.PokemonPastType;
import org.openapitools.server.model.PokemonSpeciesSummary;
import org.openapitools.server.model.PokemonSprites;
import org.openapitools.server.model.PokemonStat;
import org.openapitools.server.model.PokemonType;
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
    private List<@Valid PokemonAbility> abilities = new ArrayList<>();
    private List<@Valid PokemonPastAbility> pastAbilities = new ArrayList<>();
    private List<@Valid PokemonFormSummary> forms = new ArrayList<>();
    private List<@Valid PokemonGameIndex> gameIndices = new ArrayList<>();
    private List<@Valid PokemonHeldItemSummary> heldItems = new ArrayList<>();
    private String locationAreaEncounters;
    private List<@Valid PokemonMove> moves = new ArrayList<>();
    private PokemonSpeciesSummary species;
    private PokemonSprites sprites;
    private PokemonCries cries;
    private List<@Valid PokemonStat> stats = new ArrayList<>();
    private List<@Valid PokemonPastStat> pastStats = new ArrayList<>();
    private List<@Valid PokemonType> types = new ArrayList<>();
    private List<@Valid PokemonPastType> pastTypes = new ArrayList<>();

    /**
     * Default constructor.
     */
    public PokemonDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonDetail.
     *
     * @param id The identifier for this resource.
     * @param name The name for this resource.
     * @param baseExperience The base experience gained for defeating this Pokémon.
     * @param height The height of this Pokémon in decimetres.
     * @param isDefault Set for exactly one Pokémon used as the default for each species.
     * @param order Order for sorting. Almost national order, except families are grouped together.
     * @param weight The weight of this Pokémon in hectograms.
     * @param abilities A list of abilities this Pokémon could potentially have.
     * @param pastAbilities A list of details showing abilities this pokémon had in previous generations
     * @param forms A list of forms this Pokémon can take on.
     * @param gameIndices A list of game indices relevent to Pokémon item by generation.
     * @param heldItems A list of items this Pokémon may be holding when encountered.
     * @param locationAreaEncounters A link to a list of location areas, as well as encounter details pertaining to specific versions.
     * @param moves A list of moves along with learn methods and level details pertaining to specific version groups.
     * @param species The species this Pokémon belongs to.
     * @param sprites A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/sprites#sprites&#39;&gt;PokeAPI/sprites&lt;/a&gt;
     * @param cries A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/cries#cries&#39;&gt;PokeAPI/cries&lt;/a&gt;
     * @param stats A list of base stat values for this Pokémon.
     * @param pastStats A list of details showing stats this pokémon had in previous generations
     * @param types A list of details showing types this Pokémon has.
     * @param pastTypes A list of details showing types this pokémon had in previous generations
     */
    public PokemonDetail(
        Integer id, 
        String name, 
        Integer baseExperience, 
        Integer height, 
        Boolean isDefault, 
        Integer order, 
        Integer weight, 
        List<@Valid PokemonAbility> abilities, 
        List<@Valid PokemonPastAbility> pastAbilities, 
        List<@Valid PokemonFormSummary> forms, 
        List<@Valid PokemonGameIndex> gameIndices, 
        List<@Valid PokemonHeldItemSummary> heldItems, 
        String locationAreaEncounters, 
        List<@Valid PokemonMove> moves, 
        PokemonSpeciesSummary species, 
        PokemonSprites sprites, 
        PokemonCries cries, 
        List<@Valid PokemonStat> stats, 
        List<@Valid PokemonPastStat> pastStats, 
        List<@Valid PokemonType> types, 
        List<@Valid PokemonPastType> pastTypes
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
        this.pastStats = pastStats;
        this.types = types;
        this.pastTypes = pastTypes;
    }



    /**
     * The identifier for this resource.
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * The name for this resource.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The base experience gained for defeating this Pokémon.
     * minimum: -2147483648
     * maximum: 2147483647
     * @return baseExperience
     */
    public Integer getBaseExperience() {
        return baseExperience;
    }

    public void setBaseExperience(Integer baseExperience) {
        this.baseExperience = baseExperience;
    }

    /**
     * The height of this Pokémon in decimetres.
     * minimum: -2147483648
     * maximum: 2147483647
     * @return height
     */
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * Set for exactly one Pokémon used as the default for each species.
     * @return isDefault
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * Order for sorting. Almost national order, except families are grouped together.
     * minimum: -2147483648
     * maximum: 2147483647
     * @return order
     */
    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    /**
     * The weight of this Pokémon in hectograms.
     * minimum: -2147483648
     * maximum: 2147483647
     * @return weight
     */
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * A list of abilities this Pokémon could potentially have.
     * @return abilities
     */
    public List<@Valid PokemonAbility> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<@Valid PokemonAbility> abilities) {
        this.abilities = abilities;
    }

    /**
     * A list of details showing abilities this pokémon had in previous generations
     * @return pastAbilities
     */
    public List<@Valid PokemonPastAbility> getPastAbilities() {
        return pastAbilities;
    }

    public void setPastAbilities(List<@Valid PokemonPastAbility> pastAbilities) {
        this.pastAbilities = pastAbilities;
    }

    /**
     * A list of forms this Pokémon can take on.
     * @return forms
     */
    public List<@Valid PokemonFormSummary> getForms() {
        return forms;
    }

    public void setForms(List<@Valid PokemonFormSummary> forms) {
        this.forms = forms;
    }

    /**
     * A list of game indices relevent to Pokémon item by generation.
     * @return gameIndices
     */
    public List<@Valid PokemonGameIndex> getGameIndices() {
        return gameIndices;
    }

    public void setGameIndices(List<@Valid PokemonGameIndex> gameIndices) {
        this.gameIndices = gameIndices;
    }

    /**
     * A list of items this Pokémon may be holding when encountered.
     * @return heldItems
     */
    public List<@Valid PokemonHeldItemSummary> getHeldItems() {
        return heldItems;
    }

    public void setHeldItems(List<@Valid PokemonHeldItemSummary> heldItems) {
        this.heldItems = heldItems;
    }

    /**
     * A link to a list of location areas, as well as encounter details pertaining to specific versions.
     * @return locationAreaEncounters
     */
    public String getLocationAreaEncounters() {
        return locationAreaEncounters;
    }

    public void setLocationAreaEncounters(String locationAreaEncounters) {
        this.locationAreaEncounters = locationAreaEncounters;
    }

    /**
     * A list of moves along with learn methods and level details pertaining to specific version groups.
     * @return moves
     */
    public List<@Valid PokemonMove> getMoves() {
        return moves;
    }

    public void setMoves(List<@Valid PokemonMove> moves) {
        this.moves = moves;
    }

    /**
     * The species this Pokémon belongs to.
     * @return species
     */
    public PokemonSpeciesSummary getSpecies() {
        return species;
    }

    public void setSpecies(PokemonSpeciesSummary species) {
        this.species = species;
    }

    /**
     * A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at <a href='https://github.com/PokeAPI/sprites#sprites'>PokeAPI/sprites</a>
     * @return sprites
     */
    public PokemonSprites getSprites() {
        return sprites;
    }

    public void setSprites(PokemonSprites sprites) {
        this.sprites = sprites;
    }

    /**
     * A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at <a href='https://github.com/PokeAPI/cries#cries'>PokeAPI/cries</a>
     * @return cries
     */
    public PokemonCries getCries() {
        return cries;
    }

    public void setCries(PokemonCries cries) {
        this.cries = cries;
    }

    /**
     * A list of base stat values for this Pokémon.
     * @return stats
     */
    public List<@Valid PokemonStat> getStats() {
        return stats;
    }

    public void setStats(List<@Valid PokemonStat> stats) {
        this.stats = stats;
    }

    /**
     * A list of details showing stats this pokémon had in previous generations
     * @return pastStats
     */
    public List<@Valid PokemonPastStat> getPastStats() {
        return pastStats;
    }

    public void setPastStats(List<@Valid PokemonPastStat> pastStats) {
        this.pastStats = pastStats;
    }

    /**
     * A list of details showing types this Pokémon has.
     * @return types
     */
    public List<@Valid PokemonType> getTypes() {
        return types;
    }

    public void setTypes(List<@Valid PokemonType> types) {
        this.types = types;
    }

    /**
     * A list of details showing types this pokémon had in previous generations
     * @return pastTypes
     */
    public List<@Valid PokemonPastType> getPastTypes() {
        return pastTypes;
    }

    public void setPastTypes(List<@Valid PokemonPastType> pastTypes) {
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
        sb.append("    pastStats: ").append(toIndentedString(pastStats)).append("\n");
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

