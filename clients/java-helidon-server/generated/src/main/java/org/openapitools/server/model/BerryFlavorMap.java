package org.openapitools.server.model;

import org.openapitools.server.model.BerryFlavorSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class BerryFlavorMap   {

    private Integer potency;
    private BerryFlavorSummary flavor;

    /**
     * Default constructor.
     */
    public BerryFlavorMap() {
    // JSON-B / Jackson
    }

    /**
     * Create BerryFlavorMap.
     *
     * @param potency How powerful the referenced flavor is for this berry.
     * @param flavor The referenced berry flavor.
     */
    public BerryFlavorMap(
        Integer potency, 
        BerryFlavorSummary flavor
    ) {
        this.potency = potency;
        this.flavor = flavor;
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
     * The referenced berry flavor.
     * @return flavor
     */
    public BerryFlavorSummary getFlavor() {
        return flavor;
    }

    public void setFlavor(BerryFlavorSummary flavor) {
        this.flavor = flavor;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BerryFlavorMap {\n");
        
        sb.append("    potency: ").append(toIndentedString(potency)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
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

