package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.MoveStatChange;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class StatAffectingMoves   {

    private List<@Valid MoveStatChange> increase = new ArrayList<>();
    private List<@Valid MoveStatChange> decrease = new ArrayList<>();

    /**
     * Default constructor.
     */
    public StatAffectingMoves() {
    // JSON-B / Jackson
    }

    /**
     * Create StatAffectingMoves.
     *
     * @param increase A list of moves and how they change the referenced stat.
     * @param decrease A list of moves and how they change the referenced stat.
     */
    public StatAffectingMoves(
        List<@Valid MoveStatChange> increase, 
        List<@Valid MoveStatChange> decrease
    ) {
        this.increase = increase;
        this.decrease = decrease;
    }



    /**
     * A list of moves and how they change the referenced stat.
     * @return increase
     */
    public List<@Valid MoveStatChange> getIncrease() {
        return increase;
    }

    public void setIncrease(List<@Valid MoveStatChange> increase) {
        this.increase = increase;
    }

    /**
     * A list of moves and how they change the referenced stat.
     * @return decrease
     */
    public List<@Valid MoveStatChange> getDecrease() {
        return decrease;
    }

    public void setDecrease(List<@Valid MoveStatChange> decrease) {
        this.decrease = decrease;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatAffectingMoves {\n");
        
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

