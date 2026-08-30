package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.AbilityChangeEffectText;
import org.openapitools.server.model.VersionGroupSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AbilityChange   {

    private VersionGroupSummary versionGroup;
    private List<@Valid AbilityChangeEffectText> effectEntries = new ArrayList<>();

    /**
     * Default constructor.
     */
    public AbilityChange() {
    // JSON-B / Jackson
    }

    /**
     * Create AbilityChange.
     *
     * @param versionGroup versionGroup
     * @param effectEntries effectEntries
     */
    public AbilityChange(
        VersionGroupSummary versionGroup, 
        List<@Valid AbilityChangeEffectText> effectEntries
    ) {
        this.versionGroup = versionGroup;
        this.effectEntries = effectEntries;
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
     * Get effectEntries
     * @return effectEntries
     */
    public List<@Valid AbilityChangeEffectText> getEffectEntries() {
        return effectEntries;
    }

    public void setEffectEntries(List<@Valid AbilityChangeEffectText> effectEntries) {
        this.effectEntries = effectEntries;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AbilityChange {\n");
        
        sb.append("    versionGroup: ").append(toIndentedString(versionGroup)).append("\n");
        sb.append("    effectEntries: ").append(toIndentedString(effectEntries)).append("\n");
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

