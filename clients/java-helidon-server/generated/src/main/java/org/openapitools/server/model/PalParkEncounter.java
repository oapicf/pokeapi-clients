package org.openapitools.server.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.PokemonSpeciesSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PalParkEncounter   {

    private Integer baseScore;
    private Integer rate;
    private PokemonSpeciesSummary pokemonSpecies;

    /**
     * Default constructor.
     */
    public PalParkEncounter() {
    // JSON-B / Jackson
    }

    /**
     * Create PalParkEncounter.
     *
     * @param baseScore The base score given to the player when this Pokémon is caught during a pal park run.
     * @param rate The base rate for encountering this Pokémon in this pal park area.
     * @param pokemonSpecies The Pokémon species being encountered.
     */
    public PalParkEncounter(
        Integer baseScore, 
        Integer rate, 
        PokemonSpeciesSummary pokemonSpecies
    ) {
        this.baseScore = baseScore;
        this.rate = rate;
        this.pokemonSpecies = pokemonSpecies;
    }



    /**
     * The base score given to the player when this Pokémon is caught during a pal park run.
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
     * The base rate for encountering this Pokémon in this pal park area.
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
     * The Pokémon species being encountered.
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
        sb.append("class PalParkEncounter {\n");
        
        sb.append("    baseScore: ").append(toIndentedString(baseScore)).append("\n");
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

