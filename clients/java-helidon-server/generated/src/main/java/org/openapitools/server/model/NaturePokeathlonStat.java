package org.openapitools.server.model;

import org.openapitools.server.model.PokeathlonStatSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class NaturePokeathlonStat   {

    private Integer maxChange;
    private PokeathlonStatSummary pokeathlonStat;

    /**
     * Default constructor.
     */
    public NaturePokeathlonStat() {
    // JSON-B / Jackson
    }

    /**
     * Create NaturePokeathlonStat.
     *
     * @param maxChange The amount of change.
     * @param pokeathlonStat The stat being affected.
     */
    public NaturePokeathlonStat(
        Integer maxChange, 
        PokeathlonStatSummary pokeathlonStat
    ) {
        this.maxChange = maxChange;
        this.pokeathlonStat = pokeathlonStat;
    }



    /**
     * The amount of change.
     * minimum: -2147483648
     * maximum: 2147483647
     * @return maxChange
     */
    public Integer getMaxChange() {
        return maxChange;
    }

    public void setMaxChange(Integer maxChange) {
        this.maxChange = maxChange;
    }

    /**
     * The stat being affected.
     * @return pokeathlonStat
     */
    public PokeathlonStatSummary getPokeathlonStat() {
        return pokeathlonStat;
    }

    public void setPokeathlonStat(PokeathlonStatSummary pokeathlonStat) {
        this.pokeathlonStat = pokeathlonStat;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NaturePokeathlonStat {\n");
        
        sb.append("    maxChange: ").append(toIndentedString(maxChange)).append("\n");
        sb.append("    pokeathlonStat: ").append(toIndentedString(pokeathlonStat)).append("\n");
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

