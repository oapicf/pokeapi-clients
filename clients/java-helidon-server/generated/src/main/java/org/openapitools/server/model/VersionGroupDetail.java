package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.GenerationSummary;
import org.openapitools.server.model.MoveLearnMethodSummary;
import org.openapitools.server.model.PokedexSummary;
import org.openapitools.server.model.RegionSummary;
import org.openapitools.server.model.VersionSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class VersionGroupDetail   {

    private Integer id;
    private String name;
    private Integer order;
    private GenerationSummary generation;
    private List<@Valid MoveLearnMethodSummary> moveLearnMethods = new ArrayList<>();
    private List<@Valid PokedexSummary> pokedexes = new ArrayList<>();
    private List<@Valid RegionSummary> regions = new ArrayList<>();
    private List<@Valid VersionSummary> versions = new ArrayList<>();

    /**
     * Default constructor.
     */
    public VersionGroupDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create VersionGroupDetail.
     *
     * @param id The identifier for this resource.
     * @param name The name for this resource.
     * @param order Order for sorting. Almost by date of release, except similar versions are grouped together.
     * @param generation The generation this version was introduced in.
     * @param moveLearnMethods A list of methods in which Pokémon can learn moves in this version group.
     * @param pokedexes A list of Pokédexes introduces in this version group.
     * @param regions A list of regions that can be visited in this version group.
     * @param versions The versions this version group owns.
     */
    public VersionGroupDetail(
        Integer id, 
        String name, 
        Integer order, 
        GenerationSummary generation, 
        List<@Valid MoveLearnMethodSummary> moveLearnMethods, 
        List<@Valid PokedexSummary> pokedexes, 
        List<@Valid RegionSummary> regions, 
        List<@Valid VersionSummary> versions
    ) {
        this.id = id;
        this.name = name;
        this.order = order;
        this.generation = generation;
        this.moveLearnMethods = moveLearnMethods;
        this.pokedexes = pokedexes;
        this.regions = regions;
        this.versions = versions;
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
     * Order for sorting. Almost by date of release, except similar versions are grouped together.
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
     * The generation this version was introduced in.
     * @return generation
     */
    public GenerationSummary getGeneration() {
        return generation;
    }

    public void setGeneration(GenerationSummary generation) {
        this.generation = generation;
    }

    /**
     * A list of methods in which Pokémon can learn moves in this version group.
     * @return moveLearnMethods
     */
    public List<@Valid MoveLearnMethodSummary> getMoveLearnMethods() {
        return moveLearnMethods;
    }

    public void setMoveLearnMethods(List<@Valid MoveLearnMethodSummary> moveLearnMethods) {
        this.moveLearnMethods = moveLearnMethods;
    }

    /**
     * A list of Pokédexes introduces in this version group.
     * @return pokedexes
     */
    public List<@Valid PokedexSummary> getPokedexes() {
        return pokedexes;
    }

    public void setPokedexes(List<@Valid PokedexSummary> pokedexes) {
        this.pokedexes = pokedexes;
    }

    /**
     * A list of regions that can be visited in this version group.
     * @return regions
     */
    public List<@Valid RegionSummary> getRegions() {
        return regions;
    }

    public void setRegions(List<@Valid RegionSummary> regions) {
        this.regions = regions;
    }

    /**
     * The versions this version group owns.
     * @return versions
     */
    public List<@Valid VersionSummary> getVersions() {
        return versions;
    }

    public void setVersions(List<@Valid VersionSummary> versions) {
        this.versions = versions;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionGroupDetail {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
        sb.append("    moveLearnMethods: ").append(toIndentedString(moveLearnMethods)).append("\n");
        sb.append("    pokedexes: ").append(toIndentedString(pokedexes)).append("\n");
        sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
        sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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

