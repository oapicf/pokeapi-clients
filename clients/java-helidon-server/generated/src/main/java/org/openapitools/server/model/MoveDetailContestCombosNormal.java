package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.AbilityDetailPokemonInnerPokemon;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class MoveDetailContestCombosNormal   {

    private List<@Valid AbilityDetailPokemonInnerPokemon> useBefore = new ArrayList<>();
    private List<@Valid AbilityDetailPokemonInnerPokemon> useAfter = new ArrayList<>();

    /**
     * Default constructor.
     */
    public MoveDetailContestCombosNormal() {
    // JSON-B / Jackson
    }

    /**
     * Create MoveDetailContestCombosNormal.
     *
     * @param useBefore useBefore
     * @param useAfter useAfter
     */
    public MoveDetailContestCombosNormal(
        List<@Valid AbilityDetailPokemonInnerPokemon> useBefore, 
        List<@Valid AbilityDetailPokemonInnerPokemon> useAfter
    ) {
        this.useBefore = useBefore;
        this.useAfter = useAfter;
    }



    /**
     * Get useBefore
     * @return useBefore
     */
    public List<@Valid AbilityDetailPokemonInnerPokemon> getUseBefore() {
        return useBefore;
    }

    public void setUseBefore(List<@Valid AbilityDetailPokemonInnerPokemon> useBefore) {
        this.useBefore = useBefore;
    }

    /**
     * Get useAfter
     * @return useAfter
     */
    public List<@Valid AbilityDetailPokemonInnerPokemon> getUseAfter() {
        return useAfter;
    }

    public void setUseAfter(List<@Valid AbilityDetailPokemonInnerPokemon> useAfter) {
        this.useAfter = useAfter;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MoveDetailContestCombosNormal {\n");
        
        sb.append("    useBefore: ").append(toIndentedString(useBefore)).append("\n");
        sb.append("    useAfter: ").append(toIndentedString(useAfter)).append("\n");
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

