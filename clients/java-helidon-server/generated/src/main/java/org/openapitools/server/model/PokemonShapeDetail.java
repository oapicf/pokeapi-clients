package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.PokemonShapeDetailAwesomeNamesInner;
import org.openapitools.server.model.PokemonShapeDetailNamesInner;
import org.openapitools.server.model.PokemonSpeciesSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokemonShapeDetail   {

    private Integer id;
    private String name;
    private List<@Valid PokemonShapeDetailAwesomeNamesInner> awesomeNames = new ArrayList<>();
    private List<@Valid PokemonShapeDetailNamesInner> names = new ArrayList<>();
    private List<@Valid PokemonSpeciesSummary> pokemonSpecies = new ArrayList<>();

    /**
     * Default constructor.
     */
    public PokemonShapeDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonShapeDetail.
     *
     * @param id id
     * @param name name
     * @param awesomeNames awesomeNames
     * @param names names
     * @param pokemonSpecies pokemonSpecies
     */
    public PokemonShapeDetail(
        Integer id, 
        String name, 
        List<@Valid PokemonShapeDetailAwesomeNamesInner> awesomeNames, 
        List<@Valid PokemonShapeDetailNamesInner> names, 
        List<@Valid PokemonSpeciesSummary> pokemonSpecies
    ) {
        this.id = id;
        this.name = name;
        this.awesomeNames = awesomeNames;
        this.names = names;
        this.pokemonSpecies = pokemonSpecies;
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
     * Get awesomeNames
     * @return awesomeNames
     */
    public List<@Valid PokemonShapeDetailAwesomeNamesInner> getAwesomeNames() {
        return awesomeNames;
    }

    public void setAwesomeNames(List<@Valid PokemonShapeDetailAwesomeNamesInner> awesomeNames) {
        this.awesomeNames = awesomeNames;
    }

    /**
     * Get names
     * @return names
     */
    public List<@Valid PokemonShapeDetailNamesInner> getNames() {
        return names;
    }

    public void setNames(List<@Valid PokemonShapeDetailNamesInner> names) {
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonShapeDetail {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    awesomeNames: ").append(toIndentedString(awesomeNames)).append("\n");
        sb.append("    names: ").append(toIndentedString(names)).append("\n");
        sb.append("    pokemonSpecies: ").append(toIndentedString(pokemonSpecies)).append("\n");
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

