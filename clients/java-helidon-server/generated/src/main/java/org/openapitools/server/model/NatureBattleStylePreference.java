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
     * @param lowHpPreference Chance of using the move, in percent, if HP is under one half.
     * @param highHpPreference Chance of using the move, in percent, if HP is over one half.
     * @param moveBattleStyle The move battle style.
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
     * Chance of using the move, in percent, if HP is under one half.
     * minimum: -2147483648
     * maximum: 2147483647
     * @return lowHpPreference
     */
    public Integer getLowHpPreference() {
        return lowHpPreference;
    }

    public void setLowHpPreference(Integer lowHpPreference) {
        this.lowHpPreference = lowHpPreference;
    }

    /**
     * Chance of using the move, in percent, if HP is over one half.
     * minimum: -2147483648
     * maximum: 2147483647
     * @return highHpPreference
     */
    public Integer getHighHpPreference() {
        return highHpPreference;
    }

    public void setHighHpPreference(Integer highHpPreference) {
        this.highHpPreference = highHpPreference;
    }

    /**
     * The move battle style.
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

