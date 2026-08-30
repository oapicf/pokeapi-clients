package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.server.model.MoveLearnMethodDescription;
import org.openapitools.server.model.MoveLearnMethodName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class MoveLearnMethodDetail   {

    private Integer id;
    private String name;
    private List<@Valid MoveLearnMethodName> names = new ArrayList<>();
    private List<@Valid MoveLearnMethodDescription> descriptions = new ArrayList<>();
    private List<@Valid AbilityDetailPokemonInnerPokemon> versionGroups = new ArrayList<>();

    /**
     * Default constructor.
     */
    public MoveLearnMethodDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create MoveLearnMethodDetail.
     *
     * @param id id
     * @param name name
     * @param names names
     * @param descriptions descriptions
     * @param versionGroups versionGroups
     */
    public MoveLearnMethodDetail(
        Integer id, 
        String name, 
        List<@Valid MoveLearnMethodName> names, 
        List<@Valid MoveLearnMethodDescription> descriptions, 
        List<@Valid AbilityDetailPokemonInnerPokemon> versionGroups
    ) {
        this.id = id;
        this.name = name;
        this.names = names;
        this.descriptions = descriptions;
        this.versionGroups = versionGroups;
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
    public List<@Valid MoveLearnMethodName> getNames() {
        return names;
    }

    public void setNames(List<@Valid MoveLearnMethodName> names) {
        this.names = names;
    }

    /**
     * Get descriptions
     * @return descriptions
     */
    public List<@Valid MoveLearnMethodDescription> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<@Valid MoveLearnMethodDescription> descriptions) {
        this.descriptions = descriptions;
    }

    /**
     * Get versionGroups
     * @return versionGroups
     */
    public List<@Valid AbilityDetailPokemonInnerPokemon> getVersionGroups() {
        return versionGroups;
    }

    public void setVersionGroups(List<@Valid AbilityDetailPokemonInnerPokemon> versionGroups) {
        this.versionGroups = versionGroups;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MoveLearnMethodDetail {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    names: ").append(toIndentedString(names)).append("\n");
        sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
        sb.append("    versionGroups: ").append(toIndentedString(versionGroups)).append("\n");
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

