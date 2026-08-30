package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.AbilityDetailPokemonInnerPokemon;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PalParkAreaDetailPokemonEncountersInner   {

    private Integer baseScore;
    private AbilityDetailPokemonInnerPokemon pokemonSpecies;
    private Integer rate;

    /**
     * Default constructor.
     */
    public PalParkAreaDetailPokemonEncountersInner() {
    // JSON-B / Jackson
    }

    /**
     * Create PalParkAreaDetailPokemonEncountersInner.
     *
     * @param baseScore baseScore
     * @param pokemonSpecies pokemonSpecies
     * @param rate rate
     */
    public PalParkAreaDetailPokemonEncountersInner(
        Integer baseScore, 
        AbilityDetailPokemonInnerPokemon pokemonSpecies, 
        Integer rate
    ) {
        this.baseScore = baseScore;
        this.pokemonSpecies = pokemonSpecies;
        this.rate = rate;
    }



    /**
     * Get baseScore
     * @return baseScore
     */
    public Integer getBaseScore() {
        return baseScore;
    }

    public void setBaseScore(Integer baseScore) {
        this.baseScore = baseScore;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PalParkAreaDetailPokemonEncountersInner {\n");
        
        sb.append("    baseScore: ").append(toIndentedString(baseScore)).append("\n");
        sb.append("    pokemonSpecies: ").append(toIndentedString(pokemonSpecies)).append("\n");
        sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
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

