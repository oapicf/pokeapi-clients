package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.server.model.GenderDetailPokemonSpeciesDetailsInner;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class GenderDetail   {

    private Integer id;
    private String name;
    private List<@Valid GenderDetailPokemonSpeciesDetailsInner> pokemonSpeciesDetails = new ArrayList<>();
    private List<@Valid AbilityDetailPokemonInnerPokemon> requiredForEvolution = new ArrayList<>();

    /**
     * Default constructor.
     */
    public GenderDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create GenderDetail.
     *
     * @param id id
     * @param name name
     * @param pokemonSpeciesDetails pokemonSpeciesDetails
     * @param requiredForEvolution requiredForEvolution
     */
    public GenderDetail(
        Integer id, 
        String name, 
        List<@Valid GenderDetailPokemonSpeciesDetailsInner> pokemonSpeciesDetails, 
        List<@Valid AbilityDetailPokemonInnerPokemon> requiredForEvolution
    ) {
        this.id = id;
        this.name = name;
        this.pokemonSpeciesDetails = pokemonSpeciesDetails;
        this.requiredForEvolution = requiredForEvolution;
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
     * Get pokemonSpeciesDetails
     * @return pokemonSpeciesDetails
     */
    public List<@Valid GenderDetailPokemonSpeciesDetailsInner> getPokemonSpeciesDetails() {
        return pokemonSpeciesDetails;
    }

    public void setPokemonSpeciesDetails(List<@Valid GenderDetailPokemonSpeciesDetailsInner> pokemonSpeciesDetails) {
        this.pokemonSpeciesDetails = pokemonSpeciesDetails;
    }

    /**
     * Get requiredForEvolution
     * @return requiredForEvolution
     */
    public List<@Valid AbilityDetailPokemonInnerPokemon> getRequiredForEvolution() {
        return requiredForEvolution;
    }

    public void setRequiredForEvolution(List<@Valid AbilityDetailPokemonInnerPokemon> requiredForEvolution) {
        this.requiredForEvolution = requiredForEvolution;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GenderDetail {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    pokemonSpeciesDetails: ").append(toIndentedString(pokemonSpeciesDetails)).append("\n");
        sb.append("    requiredForEvolution: ").append(toIndentedString(requiredForEvolution)).append("\n");
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

