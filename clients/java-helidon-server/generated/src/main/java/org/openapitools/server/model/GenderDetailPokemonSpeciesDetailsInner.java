package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.AbilityDetailPokemonInnerPokemon;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class GenderDetailPokemonSpeciesDetailsInner   {

    private Integer rate;
    private AbilityDetailPokemonInnerPokemon pokemonSpecies;

    /**
     * Default constructor.
     */
    public GenderDetailPokemonSpeciesDetailsInner() {
    // JSON-B / Jackson
    }

    /**
     * Create GenderDetailPokemonSpeciesDetailsInner.
     *
     * @param rate rate
     * @param pokemonSpecies pokemonSpecies
     */
    public GenderDetailPokemonSpeciesDetailsInner(
        Integer rate, 
        AbilityDetailPokemonInnerPokemon pokemonSpecies
    ) {
        this.rate = rate;
        this.pokemonSpecies = pokemonSpecies;
    }



    /**
     * Get rate
     * @return rate
     */
    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    /**
     * Get pokemonSpecies
     * @return pokemonSpecies
     */
    public AbilityDetailPokemonInnerPokemon getPokemonSpecies() {
        return pokemonSpecies;
    }

    public void setPokemonSpecies(AbilityDetailPokemonInnerPokemon pokemonSpecies) {
        this.pokemonSpecies = pokemonSpecies;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GenderDetailPokemonSpeciesDetailsInner {\n");
        
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

