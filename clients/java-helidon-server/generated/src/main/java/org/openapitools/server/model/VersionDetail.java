package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.VersionGroupSummary;
import org.openapitools.server.model.VersionName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I'm not sure how to add anything other than a hyperlink
 */
public class VersionDetail   {

    private Integer id;
    private String name;
    private List<@Valid VersionName> names = new ArrayList<>();
    private VersionGroupSummary versionGroup;

    /**
     * Default constructor.
     */
    public VersionDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create VersionDetail.
     *
     * @param id id
     * @param name name
     * @param names names
     * @param versionGroup versionGroup
     */
    public VersionDetail(
        Integer id, 
        String name, 
        List<@Valid VersionName> names, 
        VersionGroupSummary versionGroup
    ) {
        this.id = id;
        this.name = name;
        this.names = names;
        this.versionGroup = versionGroup;
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
    public List<@Valid VersionName> getNames() {
        return names;
    }

    public void setNames(List<@Valid VersionName> names) {
        this.names = names;
    }

    /**
     * Get versionGroup
     * @return versionGroup
     */
    public VersionGroupSummary getVersionGroup() {
        return versionGroup;
    }

    public void setVersionGroup(VersionGroupSummary versionGroup) {
        this.versionGroup = versionGroup;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionDetail {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    names: ").append(toIndentedString(names)).append("\n");
        sb.append("    versionGroup: ").append(toIndentedString(versionGroup)).append("\n");
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

