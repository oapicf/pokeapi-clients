package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.PokeathlonStatAffectingNature;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokeathlonStatAffectingNatures   {

    private List<@Valid PokeathlonStatAffectingNature> increase = new ArrayList<>();
    private List<@Valid PokeathlonStatAffectingNature> decrease = new ArrayList<>();

    /**
     * Default constructor.
     */
    public PokeathlonStatAffectingNatures() {
    // JSON-B / Jackson
    }

    /**
     * Create PokeathlonStatAffectingNatures.
     *
     * @param increase A list of natures and how they change the referenced Pokéathlon stat.
     * @param decrease A list of natures and how they change the referenced Pokéathlon stat.
     */
    public PokeathlonStatAffectingNatures(
        List<@Valid PokeathlonStatAffectingNature> increase, 
        List<@Valid PokeathlonStatAffectingNature> decrease
    ) {
        this.increase = increase;
        this.decrease = decrease;
    }



    /**
     * A list of natures and how they change the referenced Pokéathlon stat.
     * @return increase
     */
    public List<@Valid PokeathlonStatAffectingNature> getIncrease() {
        return increase;
    }

    public void setIncrease(List<@Valid PokeathlonStatAffectingNature> increase) {
        this.increase = increase;
    }

    /**
     * A list of natures and how they change the referenced Pokéathlon stat.
     * @return decrease
     */
    public List<@Valid PokeathlonStatAffectingNature> getDecrease() {
        return decrease;
    }

    public void setDecrease(List<@Valid PokeathlonStatAffectingNature> decrease) {
        this.decrease = decrease;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokeathlonStatAffectingNatures {\n");
        
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

