package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.GenerationSummary;
import org.openapitools.server.model.LocationSummary;
import org.openapitools.server.model.PokedexSummary;
import org.openapitools.server.model.RegionName;
import org.openapitools.server.model.VersionGroupSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class RegionDetail   {

    private Integer id;
    private String name;
    private List<@Valid LocationSummary> locations = new ArrayList<>();
    private GenerationSummary mainGeneration;
    private List<@Valid RegionName> names = new ArrayList<>();
    private List<@Valid PokedexSummary> pokedexes = new ArrayList<>();
    private List<@Valid VersionGroupSummary> versionGroups = new ArrayList<>();

    /**
     * Default constructor.
     */
    public RegionDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create RegionDetail.
     *
     * @param id The identifier for this resource.
     * @param name The name for this resource.
     * @param locations A list of locations that can be found in this region.
     * @param mainGeneration The generation this region was introduced in.
     * @param names The name of this resource listed in different languages.
     * @param pokedexes A list of pokédexes that catalogue Pokémon in this region.
     * @param versionGroups A list of version groups where this region can be visited.
     */
    public RegionDetail(
        Integer id, 
        String name, 
        List<@Valid LocationSummary> locations, 
        GenerationSummary mainGeneration, 
        List<@Valid RegionName> names, 
        List<@Valid PokedexSummary> pokedexes, 
        List<@Valid VersionGroupSummary> versionGroups
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
     * A list of locations that can be found in this region.
     * @return locations
     */
    public List<@Valid LocationSummary> getLocations() {
        return locations;
    }

    public void setLocations(List<@Valid LocationSummary> locations) {
        this.locations = locations;
    }

    /**
     * The generation this region was introduced in.
     * @return mainGeneration
     */
    public GenerationSummary getMainGeneration() {
        return mainGeneration;
    }

    public void setMainGeneration(GenerationSummary mainGeneration) {
        this.mainGeneration = mainGeneration;
    }

    /**
     * The name of this resource listed in different languages.
     * @return names
     */
    public List<@Valid RegionName> getNames() {
        return names;
    }

    public void setNames(List<@Valid RegionName> names) {
        this.names = names;
    }

    /**
     * A list of pokédexes that catalogue Pokémon in this region.
     * @return pokedexes
     */
    public List<@Valid PokedexSummary> getPokedexes() {
        return pokedexes;
    }

    public void setPokedexes(List<@Valid PokedexSummary> pokedexes) {
        this.pokedexes = pokedexes;
    }

    /**
     * A list of version groups where this region can be visited.
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

