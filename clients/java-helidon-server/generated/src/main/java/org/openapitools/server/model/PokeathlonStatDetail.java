package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.PokeathlonStatDetailAffectingNatures;
import org.openapitools.server.model.PokeathlonStatName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokeathlonStatDetail   {

    private Integer id;
    private String name;
    private PokeathlonStatDetailAffectingNatures affectingNatures;
    private List<@Valid PokeathlonStatName> names = new ArrayList<>();

    /**
     * Default constructor.
     */
    public PokeathlonStatDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create PokeathlonStatDetail.
     *
     * @param id id
     * @param name name
     * @param affectingNatures affectingNatures
     * @param names names
     */
    public PokeathlonStatDetail(
        Integer id, 
        String name, 
        PokeathlonStatDetailAffectingNatures affectingNatures, 
        List<@Valid PokeathlonStatName> names
    ) {
        this.id = id;
        this.name = name;
        this.affectingNatures = affectingNatures;
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
     * Get affectingNatures
     * @return affectingNatures
     */
    public PokeathlonStatDetailAffectingNatures getAffectingNatures() {
        return affectingNatures;
    }

    public void setAffectingNatures(PokeathlonStatDetailAffectingNatures affectingNatures) {
        this.affectingNatures = affectingNatures;
    }

    /**
     * Get names
     * @return names
     */
    public List<@Valid PokeathlonStatName> getNames() {
        return names;
    }

    public void setNames(List<@Valid PokeathlonStatName> names) {
        this.names = names;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokeathlonStatDetail {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    affectingNatures: ").append(toIndentedString(affectingNatures)).append("\n");
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

