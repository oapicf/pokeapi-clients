package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.EncounterConditionSummary;
import org.openapitools.server.model.EncounterConditionValueName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class EncounterConditionValueDetail   {

    private Integer id;
    private String name;
    private EncounterConditionSummary condition;
    private List<@Valid EncounterConditionValueName> names = new ArrayList<>();

    /**
     * Default constructor.
     */
    public EncounterConditionValueDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create EncounterConditionValueDetail.
     *
     * @param id id
     * @param name name
     * @param condition condition
     * @param names names
     */
    public EncounterConditionValueDetail(
        Integer id, 
        String name, 
        EncounterConditionSummary condition, 
        List<@Valid EncounterConditionValueName> names
    ) {
        this.id = id;
        this.name = name;
        this.condition = condition;
        this.names = names;
    }



    /**
     * Get id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get condition
     * @return condition
     */
    public EncounterConditionSummary getCondition() {
        return condition;
    }

    public void setCondition(EncounterConditionSummary condition) {
        this.condition = condition;
    }

    /**
     * Get names
     * @return names
     */
    public List<@Valid EncounterConditionValueName> getNames() {
        return names;
    }

    public void setNames(List<@Valid EncounterConditionValueName> names) {
        this.names = names;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EncounterConditionValueDetail {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    names: ").append(toIndentedString(names)).append("\n");
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

