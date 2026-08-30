package org.openapitools.server.model;

import org.openapitools.server.model.MoveBattleStyleSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class NatureBattleStylePreference   {

    private Integer lowHpPreference;
    private Integer highHpPreference;
    private MoveBattleStyleSummary moveBattleStyle;

    /**
     * Default constructor.
     */
    public NatureBattleStylePreference() {
    // JSON-B / Jackson
    }

    /**
     * Create NatureBattleStylePreference.
     *
     * @param lowHpPreference lowHpPreference
     * @param highHpPreference highHpPreference
     * @param moveBattleStyle moveBattleStyle
     */
    public NatureBattleStylePreference(
        Integer lowHpPreference, 
        Integer highHpPreference, 
        MoveBattleStyleSummary moveBattleStyle
    ) {
        this.lowHpPreference = lowHpPreference;
        this.highHpPreference = highHpPreference;
        this.moveBattleStyle = moveBattleStyle;
    }



    /**
     * Get lowHpPreference
     * @return lowHpPreference
     */
    public Integer getLowHpPreference() {
        return lowHpPreference;
    }

    public void setLowHpPreference(Integer lowHpPreference) {
        this.lowHpPreference = lowHpPreference;
    }

    /**
     * Get highHpPreference
     * @return highHpPreference
     */
    public Integer getHighHpPreference() {
        return highHpPreference;
    }

    public void setHighHpPreference(Integer highHpPreference) {
        this.highHpPreference = highHpPreference;
    }

    /**
     * Get moveBattleStyle
     * @return moveBattleStyle
     */
    public MoveBattleStyleSummary getMoveBattleStyle() {
        return moveBattleStyle;
    }

    public void setMoveBattleStyle(MoveBattleStyleSummary moveBattleStyle) {
        this.moveBattleStyle = moveBattleStyle;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NatureBattleStylePreference {\n");
        
        sb.append("    lowHpPreference: ").append(toIndentedString(lowHpPreference)).append("\n");
        sb.append("    highHpPreference: ").append(toIndentedString(highHpPreference)).append("\n");
        sb.append("    moveBattleStyle: ").append(toIndentedString(moveBattleStyle)).append("\n");
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

