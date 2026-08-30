package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.server.model.PokemonDetailMovesInnerVersionGroupDetailsInner;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokemonDetailMovesInner   {

    private AbilityDetailPokemonInnerPokemon move;
    private List<@Valid PokemonDetailMovesInnerVersionGroupDetailsInner> versionGroupDetails = new ArrayList<>();

    /**
     * Default constructor.
     */
    public PokemonDetailMovesInner() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonDetailMovesInner.
     *
     * @param move move
     * @param versionGroupDetails versionGroupDetails
     */
    public PokemonDetailMovesInner(
        AbilityDetailPokemonInnerPokemon move, 
        List<@Valid PokemonDetailMovesInnerVersionGroupDetailsInner> versionGroupDetails
    ) {
        this.move = move;
        this.versionGroupDetails = versionGroupDetails;
    }



    /**
     * Get move
     * @return move
     */
    public AbilityDetailPokemonInnerPokemon getMove() {
        return move;
    }

    public void setMove(AbilityDetailPokemonInnerPokemon move) {
        this.move = move;
    }

    /**
     * Get versionGroupDetails
     * @return versionGroupDetails
     */
    public List<@Valid PokemonDetailMovesInnerVersionGroupDetailsInner> getVersionGroupDetails() {
        return versionGroupDetails;
    }

    public void setVersionGroupDetails(List<@Valid PokemonDetailMovesInnerVersionGroupDetailsInner> versionGroupDetails) {
        this.versionGroupDetails = versionGroupDetails;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonDetailMovesInner {\n");
        
        sb.append("    move: ").append(toIndentedString(move)).append("\n");
        sb.append("    versionGroupDetails: ").append(toIndentedString(versionGroupDetails)).append("\n");
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

