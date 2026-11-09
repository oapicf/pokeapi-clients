package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.PokedexDescription;
import org.openapitools.server.model.PokedexName;
import org.openapitools.server.model.PokemonDexNumber;
import org.openapitools.server.model.RegionSummary;
import org.openapitools.server.model.VersionGroupSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokedexDetail   {

    private Integer id;
    private String name;
    private Boolean isMainSeries;
    private List<@Valid PokedexDescription> descriptions = new ArrayList<>();
    private List<@Valid PokedexName> names = new ArrayList<>();
    private List<@Valid PokemonDexNumber> pokemonEntries = new ArrayList<>();
    private RegionSummary region;
    private List<@Valid VersionGroupSummary> versionGroups = new ArrayList<>();

    /**
     * Default constructor.
     */
    public PokedexDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create PokedexDetail.
     *
     * @param id The identifier for this resource.
     * @param name The name for this resource.
     * @param isMainSeries Whether or not this Pokédex originated in the main series of the video games.
     * @param descriptions The description of this resource listed in different languages.
     * @param names The name of this resource listed in different languages.
     * @param pokemonEntries A list of Pokémon catalogued in this Pokédex and their indexes.
     * @param region The region this Pokédex catalogues Pokémon for.
     * @param versionGroups A list of version groups this Pokédex is relevant to.
     */
    public PokedexDetail(
        Integer id, 
        String name, 
        Boolean isMainSeries, 
        List<@Valid PokedexDescription> descriptions, 
        List<@Valid PokedexName> names, 
        List<@Valid PokemonDexNumber> pokemonEntries, 
        RegionSummary region, 
        List<@Valid VersionGroupSummary> versionGroups
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
     * Whether or not this Pokédex originated in the main series of the video games.
     * @return isMainSeries
     */
    public Boolean getIsMainSeries() {
        return isMainSeries;
    }

    public void setIsMainSeries(Boolean isMainSeries) {
        this.isMainSeries = isMainSeries;
    }

    /**
     * The description of this resource listed in different languages.
     * @return descriptions
     */
    public List<@Valid PokedexDescription> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<@Valid PokedexDescription> descriptions) {
        this.descriptions = descriptions;
    }

    /**
     * The name of this resource listed in different languages.
     * @return names
     */
    public List<@Valid PokedexName> getNames() {
        return names;
    }

    public void setNames(List<@Valid PokedexName> names) {
        this.names = names;
    }

    /**
     * A list of Pokémon catalogued in this Pokédex and their indexes.
     * @return pokemonEntries
     */
    public List<@Valid PokemonDexNumber> getPokemonEntries() {
        return pokemonEntries;
    }

    public void setPokemonEntries(List<@Valid PokemonDexNumber> pokemonEntries) {
        this.pokemonEntries = pokemonEntries;
    }

    /**
     * The region this Pokédex catalogues Pokémon for.
     * @return region
     */
    public RegionSummary getRegion() {
        return region;
    }

    public void setRegion(RegionSummary region) {
        this.region = region;
    }

    /**
     * A list of version groups this Pokédex is relevant to.
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

