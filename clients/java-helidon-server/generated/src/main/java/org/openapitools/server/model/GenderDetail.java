package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.GenderPokemonSpecies;
import org.openapitools.server.model.PokemonSpeciesSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class GenderDetail   {

    private Integer id;
    private String name;
    private List<@Valid GenderPokemonSpecies> pokemonSpeciesDetails = new ArrayList<>();
    private List<@Valid PokemonSpeciesSummary> requiredForEvolution = new ArrayList<>();

    /**
     * Default constructor.
     */
    public GenderDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create GenderDetail.
     *
     * @param id The identifier for this resource.
     * @param name The name for this resource.
     * @param pokemonSpeciesDetails A list of Pokémon species that can be this gender and how likely it is that they will be.
     * @param requiredForEvolution A list of Pokémon species that required this gender in order for a Pokémon to evolve into them.
     */
    public GenderDetail(
        Integer id, 
        String name, 
        List<@Valid GenderPokemonSpecies> pokemonSpeciesDetails, 
        List<@Valid PokemonSpeciesSummary> requiredForEvolution
    ) {
        this.id = id;
        this.name = name;
        this.pokemonSpeciesDetails = pokemonSpeciesDetails;
        this.requiredForEvolution = requiredForEvolution;
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
     * A list of Pokémon species that can be this gender and how likely it is that they will be.
     * @return pokemonSpeciesDetails
     */
    public List<@Valid GenderPokemonSpecies> getPokemonSpeciesDetails() {
        return pokemonSpeciesDetails;
    }

    public void setPokemonSpeciesDetails(List<@Valid GenderPokemonSpecies> pokemonSpeciesDetails) {
        this.pokemonSpeciesDetails = pokemonSpeciesDetails;
    }

    /**
     * A list of Pokémon species that required this gender in order for a Pokémon to evolve into them.
     * @return requiredForEvolution
     */
    public List<@Valid PokemonSpeciesSummary> getRequiredForEvolution() {
        return requiredForEvolution;
    }

    public void setRequiredForEvolution(List<@Valid PokemonSpeciesSummary> requiredForEvolution) {
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

