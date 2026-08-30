package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.EncounterConditionName;
import org.openapitools.server.model.EncounterConditionValueSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class EncounterConditionDetail   {

    private Integer id;
    private String name;
    private List<@Valid EncounterConditionValueSummary> values = new ArrayList<>();
    private List<@Valid EncounterConditionName> names = new ArrayList<>();

    /**
     * Default constructor.
     */
    public EncounterConditionDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create EncounterConditionDetail.
     *
     * @param id id
     * @param name name
     * @param values values
     * @param names names
     */
    public EncounterConditionDetail(
        Integer id, 
        String name, 
        List<@Valid EncounterConditionValueSummary> values, 
        List<@Valid EncounterConditionName> names
    ) {
        this.id = id;
        this.name = name;
        this.values = values;
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
     * Get values
     * @return values
     */
    public List<@Valid EncounterConditionValueSummary> getValues() {
        return values;
    }

    public void setValues(List<@Valid EncounterConditionValueSummary> values) {
        this.values = values;
    }

    /**
     * Get names
     * @return names
     */
    public List<@Valid EncounterConditionName> getNames() {
        return names;
    }

    public void setNames(List<@Valid EncounterConditionName> names) {
        this.names = names;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EncounterConditionDetail {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

