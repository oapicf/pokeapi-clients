package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.BerryFlavorSummary;
import org.openapitools.server.model.ContestTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ContestTypeDetail   {

    private Integer id;
    private String name;
    private BerryFlavorSummary berryFlavor;
    private List<@Valid ContestTypeName> names = new ArrayList<>();

    /**
     * Default constructor.
     */
    public ContestTypeDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create ContestTypeDetail.
     *
     * @param id The identifier for this resource.
     * @param name The name for this resource.
     * @param berryFlavor The berry flavor that correlates with this contest type.
     * @param names The name of this contest type listed in different languages.
     */
    public ContestTypeDetail(
        Integer id, 
        String name, 
        BerryFlavorSummary berryFlavor, 
        List<@Valid ContestTypeName> names
    ) {
        this.id = id;
        this.name = name;
        this.berryFlavor = berryFlavor;
        this.names = names;
    }



    /**
     * The identifier for this resource.
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * The name for this resource.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The berry flavor that correlates with this contest type.
     * @return berryFlavor
     */
    public BerryFlavorSummary getBerryFlavor() {
        return berryFlavor;
    }

    public void setBerryFlavor(BerryFlavorSummary berryFlavor) {
        this.berryFlavor = berryFlavor;
    }

    /**
     * The name of this contest type listed in different languages.
     * @return names
     */
    public List<@Valid ContestTypeName> getNames() {
        return names;
    }

    public void setNames(List<@Valid ContestTypeName> names) {
        this.names = names;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContestTypeDetail {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    berryFlavor: ").append(toIndentedString(berryFlavor)).append("\n");
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

