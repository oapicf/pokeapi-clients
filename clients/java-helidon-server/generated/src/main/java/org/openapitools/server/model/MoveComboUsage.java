package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.MoveSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class MoveComboUsage   {

    private List<@Valid MoveSummary> useBefore;
    private List<@Valid MoveSummary> useAfter;

    /**
     * Default constructor.
     */
    public MoveComboUsage() {
    // JSON-B / Jackson
    }

    /**
     * Create MoveComboUsage.
     *
     * @param useBefore A list of moves to use before this move.
     * @param useAfter A list of moves to use after this move.
     */
    public MoveComboUsage(
        List<@Valid MoveSummary> useBefore, 
        List<@Valid MoveSummary> useAfter
    ) {
        this.useBefore = useBefore;
        this.useAfter = useAfter;
    }



    /**
     * A list of moves to use before this move.
     * @return useBefore
     */
    public List<@Valid MoveSummary> getUseBefore() {
        return useBefore;
    }

    public void setUseBefore(List<@Valid MoveSummary> useBefore) {
        this.useBefore = useBefore;
    }

    /**
     * A list of moves to use after this move.
     * @return useAfter
     */
    public List<@Valid MoveSummary> getUseAfter() {
        return useAfter;
    }

    public void setUseAfter(List<@Valid MoveSummary> useAfter) {
        this.useAfter = useAfter;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MoveComboUsage {\n");
        
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

