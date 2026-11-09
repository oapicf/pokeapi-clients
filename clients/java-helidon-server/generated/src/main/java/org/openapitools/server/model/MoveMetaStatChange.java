package org.openapitools.server.model;

import org.openapitools.server.model.StatSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class MoveMetaStatChange   {

    private Integer change;
    private StatSummary stat;

    /**
     * Default constructor.
     */
    public MoveMetaStatChange() {
    // JSON-B / Jackson
    }

    /**
     * Create MoveMetaStatChange.
     *
     * @param change The amount of change.
     * @param stat The stat being affected.
     */
    public MoveMetaStatChange(
        Integer change, 
        StatSummary stat
    ) {
        this.change = change;
        this.stat = stat;
    }



    /**
     * The amount of change.
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
     * The stat being affected.
     * @return stat
     */
    public StatSummary getStat() {
        return stat;
    }

    public void setStat(StatSummary stat) {
        this.stat = stat;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MoveMetaStatChange {\n");
        
        sb.append("    change: ").append(toIndentedString(change)).append("\n");
        sb.append("    stat: ").append(toIndentedString(stat)).append("\n");
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

