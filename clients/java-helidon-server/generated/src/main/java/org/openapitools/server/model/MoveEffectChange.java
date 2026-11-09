package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.MoveEffectChangeEffectText;
import org.openapitools.server.model.VersionGroupSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class MoveEffectChange   {

    private VersionGroupSummary versionGroup;
    private List<@Valid MoveEffectChangeEffectText> effectEntries = new ArrayList<>();

    /**
     * Default constructor.
     */
    public MoveEffectChange() {
    // JSON-B / Jackson
    }

    /**
     * Create MoveEffectChange.
     *
     * @param versionGroup The version group in which the previous effect of this ability originated.
     * @param effectEntries The previous effect of this ability listed in different languages.
     */
    public MoveEffectChange(
        VersionGroupSummary versionGroup, 
        List<@Valid MoveEffectChangeEffectText> effectEntries
    ) {
        this.versionGroup = versionGroup;
        this.effectEntries = effectEntries;
    }



    /**
     * The version group in which the previous effect of this ability originated.
     * @return versionGroup
     */
    public VersionGroupSummary getVersionGroup() {
        return versionGroup;
    }

    public void setVersionGroup(VersionGroupSummary versionGroup) {
        this.versionGroup = versionGroup;
    }

    /**
     * The previous effect of this ability listed in different languages.
     * @return effectEntries
     */
    public List<@Valid MoveEffectChangeEffectText> getEffectEntries() {
        return effectEntries;
    }

    public void setEffectEntries(List<@Valid MoveEffectChangeEffectText> effectEntries) {
        this.effectEntries = effectEntries;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MoveEffectChange {\n");
        
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

