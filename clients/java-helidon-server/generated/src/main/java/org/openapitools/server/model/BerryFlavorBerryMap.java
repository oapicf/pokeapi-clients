package org.openapitools.server.model;

import org.openapitools.server.model.BerrySummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class BerryFlavorBerryMap   {

    private Integer potency;
    private BerrySummary berry;

    /**
     * Default constructor.
     */
    public BerryFlavorBerryMap() {
    // JSON-B / Jackson
    }

    /**
     * Create BerryFlavorBerryMap.
     *
     * @param potency How powerful the referenced flavor is for this berry.
     * @param berry The berry with the referenced flavor.
     */
    public BerryFlavorBerryMap(
        Integer potency, 
        BerrySummary berry
    ) {
        this.potency = potency;
        this.berry = berry;
    }



    /**
     * How powerful the referenced flavor is for this berry.
     * minimum: -2147483648
     * maximum: 2147483647
     * @return potency
     */
    public Integer getPotency() {
        return potency;
    }

    public void setPotency(Integer potency) {
        this.potency = potency;
    }

    /**
     * The berry with the referenced flavor.
     * @return berry
     */
    public BerrySummary getBerry() {
        return berry;
    }

    public void setBerry(BerrySummary berry) {
        this.berry = berry;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BerryFlavorBerryMap {\n");
        
        sb.append("    potency: ").append(toIndentedString(potency)).append("\n");
        sb.append("    berry: ").append(toIndentedString(berry)).append("\n");
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

