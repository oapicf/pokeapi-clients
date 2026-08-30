package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.server.model.PokedexDescription;
import org.openapitools.server.model.PokedexDetailPokemonEntriesInner;
import org.openapitools.server.model.PokedexName;
import org.openapitools.server.model.RegionSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokedexDetail   {

    private Integer id;
    private String name;
    private Boolean isMainSeries;
    private List<@Valid PokedexDescription> descriptions = new ArrayList<>();
    private List<@Valid PokedexName> names = new ArrayList<>();
    private List<@Valid PokedexDetailPokemonEntriesInner> pokemonEntries = new ArrayList<>();
    private RegionSummary region;
    private List<@Valid AbilityDetailPokemonInnerPokemon> versionGroups = new ArrayList<>();

    /**
     * Default constructor.
     */
    public PokedexDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create PokedexDetail.
     *
     * @param id id
     * @param name name
     * @param isMainSeries isMainSeries
     * @param descriptions descriptions
     * @param names names
     * @param pokemonEntries pokemonEntries
     * @param region region
     * @param versionGroups versionGroups
     */
    public PokedexDetail(
        Integer id, 
        String name, 
        Boolean isMainSeries, 
        List<@Valid PokedexDescription> descriptions, 
        List<@Valid PokedexName> names, 
        List<@Valid PokedexDetailPokemonEntriesInner> pokemonEntries, 
        RegionSummary region, 
        List<@Valid AbilityDetailPokemonInnerPokemon> versionGroups
    ) {
        this.id = id;
        this.name = name;
        this.isMainSeries = isMainSeries;
        this.descriptions = descriptions;
        this.names = names;
        this.pokemonEntries = pokemonEntries;
        this.region = region;
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
     * Get isMainSeries
     * @return isMainSeries
     */
    public Boolean getIsMainSeries() {
        return isMainSeries;
    }

    public void setIsMainSeries(Boolean isMainSeries) {
        this.isMainSeries = isMainSeries;
    }

    /**
     * Get descriptions
     * @return descriptions
     */
    public List<@Valid PokedexDescription> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<@Valid PokedexDescription> descriptions) {
        this.descriptions = descriptions;
    }

    /**
     * Get names
     * @return names
     */
    public List<@Valid PokedexName> getNames() {
        return names;
    }

    public void setNames(List<@Valid PokedexName> names) {
        this.names = names;
    }

    /**
     * Get pokemonEntries
     * @return pokemonEntries
     */
    public List<@Valid PokedexDetailPokemonEntriesInner> getPokemonEntries() {
        return pokemonEntries;
    }

    public void setPokemonEntries(List<@Valid PokedexDetailPokemonEntriesInner> pokemonEntries) {
        this.pokemonEntries = pokemonEntries;
    }

    /**
     * Get region
     * @return region
     */
    public RegionSummary getRegion() {
        return region;
    }

    public void setRegion(RegionSummary region) {
        this.region = region;
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
        sb.append("class PokedexDetail {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    isMainSeries: ").append(toIndentedString(isMainSeries)).append("\n");
        sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
        sb.append("    names: ").append(toIndentedString(names)).append("\n");
        sb.append("    pokemonEntries: ").append(toIndentedString(pokemonEntries)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
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

