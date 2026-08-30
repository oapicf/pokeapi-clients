package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.EncounterMethodName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class EncounterMethodDetail   {

    private Integer id;
    private String name;
    private Integer order;
    private List<@Valid EncounterMethodName> names = new ArrayList<>();

    /**
     * Default constructor.
     */
    public EncounterMethodDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create EncounterMethodDetail.
     *
     * @param id id
     * @param name name
     * @param order order
     * @param names names
     */
    public EncounterMethodDetail(
        Integer id, 
        String name, 
        Integer order, 
        List<@Valid EncounterMethodName> names
    ) {
        this.id = id;
        this.name = name;
        this.order = order;
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
     * Get order
     * @return order
     */
    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    /**
     * Get names
     * @return names
     */
    public List<@Valid EncounterMethodName> getNames() {
        return names;
    }

    public void setNames(List<@Valid EncounterMethodName> names) {
        this.names = names;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EncounterMethodDetail {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
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

