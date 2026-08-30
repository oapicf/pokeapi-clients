package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.PokeathlonStatDetailAffectingNaturesDecreaseInner;
import org.openapitools.server.model.PokeathlonStatDetailAffectingNaturesIncreaseInner;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokeathlonStatDetailAffectingNatures   {

    private List<@Valid PokeathlonStatDetailAffectingNaturesDecreaseInner> decrease = new ArrayList<>();
    private List<@Valid PokeathlonStatDetailAffectingNaturesIncreaseInner> increase = new ArrayList<>();

    /**
     * Default constructor.
     */
    public PokeathlonStatDetailAffectingNatures() {
    // JSON-B / Jackson
    }

    /**
     * Create PokeathlonStatDetailAffectingNatures.
     *
     * @param decrease decrease
     * @param increase increase
     */
    public PokeathlonStatDetailAffectingNatures(
        List<@Valid PokeathlonStatDetailAffectingNaturesDecreaseInner> decrease, 
        List<@Valid PokeathlonStatDetailAffectingNaturesIncreaseInner> increase
    ) {
        this.decrease = decrease;
        this.increase = increase;
    }



    /**
     * Get decrease
     * @return decrease
     */
    public List<@Valid PokeathlonStatDetailAffectingNaturesDecreaseInner> getDecrease() {
        return decrease;
    }

    public void setDecrease(List<@Valid PokeathlonStatDetailAffectingNaturesDecreaseInner> decrease) {
        this.decrease = decrease;
    }

    /**
     * Get increase
     * @return increase
     */
    public List<@Valid PokeathlonStatDetailAffectingNaturesIncreaseInner> getIncrease() {
        return increase;
    }

    public void setIncrease(List<@Valid PokeathlonStatDetailAffectingNaturesIncreaseInner> increase) {
        this.increase = increase;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokeathlonStatDetailAffectingNatures {\n");
        
        sb.append("    decrease: ").append(toIndentedString(decrease)).append("\n");
        sb.append("    increase: ").append(toIndentedString(increase)).append("\n");
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

