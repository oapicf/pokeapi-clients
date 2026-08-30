package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.AbilityDetailPokemonInnerPokemon;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokemonSpeciesDetailPalParkEncountersInner   {

    private AbilityDetailPokemonInnerPokemon area;
    private Integer baseScore;
    private Integer rate;

    /**
     * Default constructor.
     */
    public PokemonSpeciesDetailPalParkEncountersInner() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonSpeciesDetailPalParkEncountersInner.
     *
     * @param area area
     * @param baseScore baseScore
     * @param rate rate
     */
    public PokemonSpeciesDetailPalParkEncountersInner(
        AbilityDetailPokemonInnerPokemon area, 
        Integer baseScore, 
        Integer rate
    ) {
        this.area = area;
        this.baseScore = baseScore;
        this.rate = rate;
    }



    /**
     * Get area
     * @return area
     */
    public AbilityDetailPokemonInnerPokemon getArea() {
        return area;
    }

    public void setArea(AbilityDetailPokemonInnerPokemon area) {
        this.area = area;
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
        sb.append("class PokemonSpeciesDetailPalParkEncountersInner {\n");
        
        sb.append("    area: ").append(toIndentedString(area)).append("\n");
        sb.append("    baseScore: ").append(toIndentedString(baseScore)).append("\n");
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

