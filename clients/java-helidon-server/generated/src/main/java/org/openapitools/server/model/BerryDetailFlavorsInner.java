package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.BerryDetailFlavorsInnerFlavor;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class BerryDetailFlavorsInner   {

    private Integer potency;
    private BerryDetailFlavorsInnerFlavor flavor;

    /**
     * Default constructor.
     */
    public BerryDetailFlavorsInner() {
    // JSON-B / Jackson
    }

    /**
     * Create BerryDetailFlavorsInner.
     *
     * @param potency potency
     * @param flavor flavor
     */
    public BerryDetailFlavorsInner(
        Integer potency, 
        BerryDetailFlavorsInnerFlavor flavor
    ) {
        this.potency = potency;
        this.flavor = flavor;
    }



    /**
     * Get potency
     * @return potency
     */
    public Integer getPotency() {
        return potency;
    }

    public void setPotency(Integer potency) {
        this.potency = potency;
    }

    /**
     * Get flavor
     * @return flavor
     */
    public BerryDetailFlavorsInnerFlavor getFlavor() {
        return flavor;
    }

    public void setFlavor(BerryDetailFlavorsInnerFlavor flavor) {
        this.flavor = flavor;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BerryDetailFlavorsInner {\n");
        
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

