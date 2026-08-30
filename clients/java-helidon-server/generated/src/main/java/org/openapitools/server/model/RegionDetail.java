package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.server.model.GenerationSummary;
import org.openapitools.server.model.LocationSummary;
import org.openapitools.server.model.PokedexSummary;
import org.openapitools.server.model.RegionName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class RegionDetail   {

    private Integer id;
    private String name;
    private List<@Valid LocationSummary> locations = new ArrayList<>();
    private GenerationSummary mainGeneration;
    private List<@Valid RegionName> names = new ArrayList<>();
    private List<@Valid PokedexSummary> pokedexes = new ArrayList<>();
    private List<@Valid AbilityDetailPokemonInnerPokemon> versionGroups = new ArrayList<>();

    /**
     * Default constructor.
     */
    public RegionDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create RegionDetail.
     *
     * @param id id
     * @param name name
     * @param locations locations
     * @param mainGeneration mainGeneration
     * @param names names
     * @param pokedexes pokedexes
     * @param versionGroups versionGroups
     */
    public RegionDetail(
        Integer id, 
        String name, 
        List<@Valid LocationSummary> locations, 
        GenerationSummary mainGeneration, 
        List<@Valid RegionName> names, 
        List<@Valid PokedexSummary> pokedexes, 
        List<@Valid AbilityDetailPokemonInnerPokemon> versionGroups
    ) {
        this.id = id;
        this.name = name;
        this.locations = locations;
        this.mainGeneration = mainGeneration;
        this.names = names;
        this.pokedexes = pokedexes;
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
     * Get locations
     * @return locations
     */
    public List<@Valid LocationSummary> getLocations() {
        return locations;
    }

    public void setLocations(List<@Valid LocationSummary> locations) {
        this.locations = locations;
    }

    /**
     * Get mainGeneration
     * @return mainGeneration
     */
    public GenerationSummary getMainGeneration() {
        return mainGeneration;
    }

    public void setMainGeneration(GenerationSummary mainGeneration) {
        this.mainGeneration = mainGeneration;
    }

    /**
     * Get names
     * @return names
     */
    public List<@Valid RegionName> getNames() {
        return names;
    }

    public void setNames(List<@Valid RegionName> names) {
        this.names = names;
    }

    /**
     * Get pokedexes
     * @return pokedexes
     */
    public List<@Valid PokedexSummary> getPokedexes() {
        return pokedexes;
    }

    public void setPokedexes(List<@Valid PokedexSummary> pokedexes) {
        this.pokedexes = pokedexes;
    }

    /**
     * Get versionGroups
     * @return versionGroups
     */
    public List<@Valid AbilityDetailPokemonInnerPokemon> getVersionGroups() {
        return versionGroups;
    }

    public void setVersionGroups(List<@Valid AbilityDetailPokemonInnerPokemon> versionGroups) {
        this.versionGroups = versionGroups;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RegionDetail {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
        sb.append("    mainGeneration: ").append(toIndentedString(mainGeneration)).append("\n");
        sb.append("    names: ").append(toIndentedString(names)).append("\n");
        sb.append("    pokedexes: ").append(toIndentedString(pokedexes)).append("\n");
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

