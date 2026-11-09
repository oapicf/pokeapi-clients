package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.MoveSummary;
import org.openapitools.server.model.PokemonMoveVersionGroup;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokemonMove   {

    private MoveSummary move;
    private List<@Valid PokemonMoveVersionGroup> versionGroupDetails = new ArrayList<>();

    /**
     * Default constructor.
     */
    public PokemonMove() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonMove.
     *
     * @param move The move the Pokémon can learn.
     * @param versionGroupDetails The details of the version in which the Pokémon can learn the move.
     */
    public PokemonMove(
        MoveSummary move, 
        List<@Valid PokemonMoveVersionGroup> versionGroupDetails
    ) {
        this.move = move;
        this.versionGroupDetails = versionGroupDetails;
    }



    /**
     * The move the Pokémon can learn.
     * @return move
     */
    public MoveSummary getMove() {
        return move;
    }

    public void setMove(MoveSummary move) {
        this.move = move;
    }

    /**
     * The details of the version in which the Pokémon can learn the move.
     * @return versionGroupDetails
     */
    public List<@Valid PokemonMoveVersionGroup> getVersionGroupDetails() {
        return versionGroupDetails;
    }

    public void setVersionGroupDetails(List<@Valid PokemonMoveVersionGroup> versionGroupDetails) {
        this.versionGroupDetails = versionGroupDetails;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonMove {\n");
        
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

