package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.MoveBattleStyleName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class MoveBattleStyleDetail   {

    private Integer id;
    private String name;
    private List<@Valid MoveBattleStyleName> names = new ArrayList<>();

    /**
     * Default constructor.
     */
    public MoveBattleStyleDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create MoveBattleStyleDetail.
     *
     * @param id id
     * @param name name
     * @param names names
     */
    public MoveBattleStyleDetail(
        Integer id, 
        String name, 
        List<@Valid MoveBattleStyleName> names
    ) {
        this.id = id;
        this.name = name;
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
     * Get names
     * @return names
     */
    public List<@Valid MoveBattleStyleName> getNames() {
        return names;
    }

    public void setNames(List<@Valid MoveBattleStyleName> names) {
        this.names = names;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MoveBattleStyleDetail {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

