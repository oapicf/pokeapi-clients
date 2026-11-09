package org.openapitools.server.model;

import org.openapitools.server.model.PokemonSpeciesSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class GenderPokemonSpecies   {

    private Integer rate;
    private PokemonSpeciesSummary pokemonSpecies;

    /**
     * Default constructor.
     */
    public GenderPokemonSpecies() {
    // JSON-B / Jackson
    }

    /**
     * Create GenderPokemonSpecies.
     *
     * @param rate The chance of this Pokémon being female, in eighths; or -1 for genderless.
     * @param pokemonSpecies A Pokémon species that can be the referenced gender.
     */
    public GenderPokemonSpecies(
        Integer rate, 
        PokemonSpeciesSummary pokemonSpecies
    ) {
        this.rate = rate;
        this.pokemonSpecies = pokemonSpecies;
    }



    /**
     * The chance of this Pokémon being female, in eighths; or -1 for genderless.
     * @return rate
     */
    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    /**
     * A Pokémon species that can be the referenced gender.
     * @return pokemonSpecies
     */
    public PokemonSpeciesSummary getPokemonSpecies() {
        return pokemonSpecies;
    }

    public void setPokemonSpecies(PokemonSpeciesSummary pokemonSpecies) {
        this.pokemonSpecies = pokemonSpecies;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GenderPokemonSpecies {\n");
        
        sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
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

