package org.openapitools.server.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.PalParkAreaSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokemonSpeciesPalParkEncounter   {

    private Integer baseScore;
    private Integer rate;
    private PalParkAreaSummary area;

    /**
     * Default constructor.
     */
    public PokemonSpeciesPalParkEncounter() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonSpeciesPalParkEncounter.
     *
     * @param baseScore The base score given to the player when the referenced Pokémon is caught during a pal park run.
     * @param rate The base rate for encountering the referenced Pokémon in this pal park area.
     * @param area The pal park area where this encounter happens.
     */
    public PokemonSpeciesPalParkEncounter(
        Integer baseScore, 
        Integer rate, 
        PalParkAreaSummary area
    ) {
        this.baseScore = baseScore;
        this.rate = rate;
        this.area = area;
    }



    /**
     * The base score given to the player when the referenced Pokémon is caught during a pal park run.
     * minimum: -2147483648
     * maximum: 2147483647
     * @return baseScore
     */
    public Integer getBaseScore() {
        return baseScore;
    }

    public void setBaseScore(Integer baseScore) {
        this.baseScore = baseScore;
    }

    /**
     * The base rate for encountering the referenced Pokémon in this pal park area.
     * minimum: -2147483648
     * maximum: 2147483647
     * @return rate
     */
    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    /**
     * The pal park area where this encounter happens.
     * @return area
     */
    public PalParkAreaSummary getArea() {
        return area;
    }

    public void setArea(PalParkAreaSummary area) {
        this.area = area;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonSpeciesPalParkEncounter {\n");
        
        sb.append("    baseScore: ").append(toIndentedString(baseScore)).append("\n");
        sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
        sb.append("    area: ").append(toIndentedString(area)).append("\n");
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

