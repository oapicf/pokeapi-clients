package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.AbilitySummary;
import org.openapitools.server.model.GenerationName;
import org.openapitools.server.model.MoveSummary;
import org.openapitools.server.model.PokemonSpeciesSummary;
import org.openapitools.server.model.RegionSummary;
import org.openapitools.server.model.TypeSummary;
import org.openapitools.server.model.VersionGroupSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class GenerationDetail   {

    private Integer id;
    private String name;
    private List<@Valid AbilitySummary> abilities = new ArrayList<>();
    private RegionSummary mainRegion;
    private List<@Valid MoveSummary> moves = new ArrayList<>();
    private List<@Valid GenerationName> names = new ArrayList<>();
    private List<@Valid PokemonSpeciesSummary> pokemonSpecies = new ArrayList<>();
    private List<@Valid TypeSummary> types = new ArrayList<>();
    private List<@Valid VersionGroupSummary> versionGroups = new ArrayList<>();

    /**
     * Default constructor.
     */
    public GenerationDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create GenerationDetail.
     *
     * @param id id
     * @param name name
     * @param abilities abilities
     * @param mainRegion mainRegion
     * @param moves moves
     * @param names names
     * @param pokemonSpecies pokemonSpecies
     * @param types types
     * @param versionGroups versionGroups
     */
    public GenerationDetail(
        Integer id, 
        String name, 
        List<@Valid AbilitySummary> abilities, 
        RegionSummary mainRegion, 
        List<@Valid MoveSummary> moves, 
        List<@Valid GenerationName> names, 
        List<@Valid PokemonSpeciesSummary> pokemonSpecies, 
        List<@Valid TypeSummary> types, 
        List<@Valid VersionGroupSummary> versionGroups
    ) {
        this.id = id;
        this.name = name;
        this.abilities = abilities;
        this.mainRegion = mainRegion;
        this.moves = moves;
        this.names = names;
        this.pokemonSpecies = pokemonSpecies;
        this.types = types;
        this.versionGroups = versionGroups;
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
     * Get abilities
     * @return abilities
     */
    public List<@Valid AbilitySummary> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<@Valid AbilitySummary> abilities) {
        this.abilities = abilities;
    }

    /**
     * Get mainRegion
     * @return mainRegion
     */
    public RegionSummary getMainRegion() {
        return mainRegion;
    }

    public void setMainRegion(RegionSummary mainRegion) {
        this.mainRegion = mainRegion;
    }

    /**
     * Get moves
     * @return moves
     */
    public List<@Valid MoveSummary> getMoves() {
        return moves;
    }

    public void setMoves(List<@Valid MoveSummary> moves) {
        this.moves = moves;
    }

    /**
     * Get names
     * @return names
     */
    public List<@Valid GenerationName> getNames() {
        return names;
    }

    public void setNames(List<@Valid GenerationName> names) {
        this.names = names;
    }

    /**
     * Get pokemonSpecies
     * @return pokemonSpecies
     */
    public List<@Valid PokemonSpeciesSummary> getPokemonSpecies() {
        return pokemonSpecies;
    }

    public void setPokemonSpecies(List<@Valid PokemonSpeciesSummary> pokemonSpecies) {
        this.pokemonSpecies = pokemonSpecies;
    }

    /**
     * Get types
     * @return types
     */
    public List<@Valid TypeSummary> getTypes() {
        return types;
    }

    public void setTypes(List<@Valid TypeSummary> types) {
        this.types = types;
    }

    /**
     * Get versionGroups
     * @return versionGroups
     */
    public List<@Valid VersionGroupSummary> getVersionGroups() {
        return versionGroups;
    }

    public void setVersionGroups(List<@Valid VersionGroupSummary> versionGroups) {
        this.versionGroups = versionGroups;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GenerationDetail {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    abilities: ").append(toIndentedString(abilities)).append("\n");
        sb.append("    mainRegion: ").append(toIndentedString(mainRegion)).append("\n");
        sb.append("    moves: ").append(toIndentedString(moves)).append("\n");
        sb.append("    names: ").append(toIndentedString(names)).append("\n");
        sb.append("    pokemonSpecies: ").append(toIndentedString(pokemonSpecies)).append("\n");
        sb.append("    types: ").append(toIndentedString(types)).append("\n");
        sb.append("    versionGroups: ").append(toIndentedString(versionGroups)).append("\n");
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

