package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.BerryFlavorDetailBerriesInnerBerry;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class BerryFlavorDetailBerriesInner   {

    private Integer potency;
    private BerryFlavorDetailBerriesInnerBerry berry;

    /**
     * Default constructor.
     */
    public BerryFlavorDetailBerriesInner() {
    // JSON-B / Jackson
    }

    /**
     * Create BerryFlavorDetailBerriesInner.
     *
     * @param potency potency
     * @param berry berry
     */
    public BerryFlavorDetailBerriesInner(
        Integer potency, 
        BerryFlavorDetailBerriesInnerBerry berry
    ) {
        this.potency = potency;
        this.berry = berry;
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
     * Get berry
     * @return berry
     */
    public BerryFlavorDetailBerriesInnerBerry getBerry() {
        return berry;
    }

    public void setBerry(BerryFlavorDetailBerriesInnerBerry berry) {
        this.berry = berry;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BerryFlavorDetailBerriesInner {\n");
        
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

