package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.BerryFirmnessName;
import org.openapitools.server.model.BerrySummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class BerryFirmnessDetail   {

    private Integer id;
    private String name;
    private List<@Valid BerrySummary> berries = new ArrayList<>();
    private List<@Valid BerryFirmnessName> names = new ArrayList<>();

    /**
     * Default constructor.
     */
    public BerryFirmnessDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create BerryFirmnessDetail.
     *
     * @param id id
     * @param name name
     * @param berries berries
     * @param names names
     */
    public BerryFirmnessDetail(
        Integer id, 
        String name, 
        List<@Valid BerrySummary> berries, 
        List<@Valid BerryFirmnessName> names
    ) {
        this.id = id;
        this.name = name;
        this.berries = berries;
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
     * Get berries
     * @return berries
     */
    public List<@Valid BerrySummary> getBerries() {
        return berries;
    }

    public void setBerries(List<@Valid BerrySummary> berries) {
        this.berries = berries;
    }

    /**
     * Get names
     * @return names
     */
    public List<@Valid BerryFirmnessName> getNames() {
        return names;
    }

    public void setNames(List<@Valid BerryFirmnessName> names) {
        this.names = names;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BerryFirmnessDetail {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    berries: ").append(toIndentedString(berries)).append("\n");
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

