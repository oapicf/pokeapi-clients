package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.NatureSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class StatAffectingNatures   {

    private List<@Valid NatureSummary> increase = new ArrayList<>();
    private List<@Valid NatureSummary> decrease = new ArrayList<>();

    /**
     * Default constructor.
     */
    public StatAffectingNatures() {
    // JSON-B / Jackson
    }

    /**
     * Create StatAffectingNatures.
     *
     * @param increase A list of natures and how they change the referenced stat.
     * @param decrease A list of nature sand how they change the referenced stat.
     */
    public StatAffectingNatures(
        List<@Valid NatureSummary> increase, 
        List<@Valid NatureSummary> decrease
    ) {
        this.increase = increase;
        this.decrease = decrease;
    }



    /**
     * A list of natures and how they change the referenced stat.
     * @return increase
     */
    public List<@Valid NatureSummary> getIncrease() {
        return increase;
    }

    public void setIncrease(List<@Valid NatureSummary> increase) {
        this.increase = increase;
    }

    /**
     * A list of nature sand how they change the referenced stat.
     * @return decrease
     */
    public List<@Valid NatureSummary> getDecrease() {
        return decrease;
    }

    public void setDecrease(List<@Valid NatureSummary> decrease) {
        this.decrease = decrease;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatAffectingNatures {\n");
        
        sb.append("    increase: ").append(toIndentedString(increase)).append("\n");
        sb.append("    decrease: ").append(toIndentedString(decrease)).append("\n");
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

