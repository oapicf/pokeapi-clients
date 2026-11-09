package org.openapitools.server.model;

import org.openapitools.server.model.MoveSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class MoveStatChange   {

    private Integer change;
    private MoveSummary move;

    /**
     * Default constructor.
     */
    public MoveStatChange() {
    // JSON-B / Jackson
    }

    /**
     * Create MoveStatChange.
     *
     * @param change The maximum amount of change to the referenced stat.
     * @param move The move causing the change.
     */
    public MoveStatChange(
        Integer change, 
        MoveSummary move
    ) {
        this.change = change;
        this.move = move;
    }



    /**
     * The maximum amount of change to the referenced stat.
     * minimum: -2147483648
     * maximum: 2147483647
     * @return change
     */
    public Integer getChange() {
        return change;
    }

    public void setChange(Integer change) {
        this.change = change;
    }

    /**
     * The move causing the change.
     * @return move
     */
    public MoveSummary getMove() {
        return move;
    }

    public void setMove(MoveSummary move) {
        this.move = move;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MoveStatChange {\n");
        
        sb.append("    change: ").append(toIndentedString(change)).append("\n");
        sb.append("    move: ").append(toIndentedString(move)).append("\n");
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

