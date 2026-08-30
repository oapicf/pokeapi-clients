package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.server.model.GenerationSummary;
import org.openapitools.server.model.VersionSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class VersionGroupDetail   {

    private Integer id;
    private String name;
    private Integer order;
    private GenerationSummary generation;
    private List<@Valid AbilityDetailPokemonInnerPokemon> moveLearnMethods = new ArrayList<>();
    private List<@Valid AbilityDetailPokemonInnerPokemon> pokedexes = new ArrayList<>();
    private List<@Valid AbilityDetailPokemonInnerPokemon> regions = new ArrayList<>();
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
     * @param id id
     * @param name name
     * @param order order
     * @param generation generation
     * @param moveLearnMethods moveLearnMethods
     * @param pokedexes pokedexes
     * @param regions regions
     * @param versions versions
     */
    public VersionGroupDetail(
        Integer id, 
        String name, 
        Integer order, 
        GenerationSummary generation, 
        List<@Valid AbilityDetailPokemonInnerPokemon> moveLearnMethods, 
        List<@Valid AbilityDetailPokemonInnerPokemon> pokedexes, 
        List<@Valid AbilityDetailPokemonInnerPokemon> regions, 
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
     * Get generation
     * @return generation
     */
    public GenerationSummary getGeneration() {
        return generation;
    }

    public void setGeneration(GenerationSummary generation) {
        this.generation = generation;
    }

    /**
     * Get moveLearnMethods
     * @return moveLearnMethods
     */
    public List<@Valid AbilityDetailPokemonInnerPokemon> getMoveLearnMethods() {
        return moveLearnMethods;
    }

    public void setMoveLearnMethods(List<@Valid AbilityDetailPokemonInnerPokemon> moveLearnMethods) {
        this.moveLearnMethods = moveLearnMethods;
    }

    /**
     * Get pokedexes
     * @return pokedexes
     */
    public List<@Valid AbilityDetailPokemonInnerPokemon> getPokedexes() {
        return pokedexes;
    }

    public void setPokedexes(List<@Valid AbilityDetailPokemonInnerPokemon> pokedexes) {
        this.pokedexes = pokedexes;
    }

    /**
     * Get regions
     * @return regions
     */
    public List<@Valid AbilityDetailPokemonInnerPokemon> getRegions() {
        return regions;
    }

    public void setRegions(List<@Valid AbilityDetailPokemonInnerPokemon> regions) {
        this.regions = regions;
    }

    /**
     * Get versions
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

