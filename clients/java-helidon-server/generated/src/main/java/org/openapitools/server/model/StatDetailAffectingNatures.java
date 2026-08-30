package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.AbilityDetailPokemonInnerPokemon;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class StatDetailAffectingNatures   {

    private List<@Valid AbilityDetailPokemonInnerPokemon> increase = new ArrayList<>();
    private List<@Valid AbilityDetailPokemonInnerPokemon> decrease = new ArrayList<>();

    /**
     * Default constructor.
     */
    public StatDetailAffectingNatures() {
    // JSON-B / Jackson
    }

    /**
     * Create StatDetailAffectingNatures.
     *
     * @param increase increase
     * @param decrease decrease
     */
    public StatDetailAffectingNatures(
        List<@Valid AbilityDetailPokemonInnerPokemon> increase, 
        List<@Valid AbilityDetailPokemonInnerPokemon> decrease
    ) {
        this.increase = increase;
        this.decrease = decrease;
    }



    /**
     * Get increase
     * @return increase
     */
    public List<@Valid AbilityDetailPokemonInnerPokemon> getIncrease() {
        return increase;
    }

    public void setIncrease(List<@Valid AbilityDetailPokemonInnerPokemon> increase) {
        this.increase = increase;
    }

    /**
     * Get decrease
     * @return decrease
     */
    public List<@Valid AbilityDetailPokemonInnerPokemon> getDecrease() {
        return decrease;
    }

    public void setDecrease(List<@Valid AbilityDetailPokemonInnerPokemon> decrease) {
        this.decrease = decrease;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatDetailAffectingNatures {\n");
        
        sb.append("    increase: ").append(toIndentedString(increase)).append("\n");
        sb.append("    decrease: ").append(toIndentedString(decrease)).append("\n");
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

