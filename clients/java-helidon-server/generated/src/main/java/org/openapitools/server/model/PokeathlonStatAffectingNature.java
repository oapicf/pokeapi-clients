package org.openapitools.server.model;

import org.openapitools.server.model.NatureSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokeathlonStatAffectingNature   {

    private Integer maxChange;
    private NatureSummary nature;

    /**
     * Default constructor.
     */
    public PokeathlonStatAffectingNature() {
    // JSON-B / Jackson
    }

    /**
     * Create PokeathlonStatAffectingNature.
     *
     * @param maxChange The maximum amount of change to the referenced Pokéathlon stat.
     * @param nature The nature causing the change.
     */
    public PokeathlonStatAffectingNature(
        Integer maxChange, 
        NatureSummary nature
    ) {
        this.maxChange = maxChange;
        this.nature = nature;
    }



    /**
     * The maximum amount of change to the referenced Pokéathlon stat.
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
     * The nature causing the change.
     * @return nature
     */
    public NatureSummary getNature() {
        return nature;
    }

    public void setNature(NatureSummary nature) {
        this.nature = nature;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokeathlonStatAffectingNature {\n");
        
        sb.append("    maxChange: ").append(toIndentedString(maxChange)).append("\n");
        sb.append("    nature: ").append(toIndentedString(nature)).append("\n");
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

