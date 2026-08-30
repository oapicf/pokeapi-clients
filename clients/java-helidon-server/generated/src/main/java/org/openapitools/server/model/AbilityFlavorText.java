package org.openapitools.server.model;

import org.openapitools.server.model.LanguageSummary;
import org.openapitools.server.model.VersionGroupSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AbilityFlavorText   {

    private String flavorText;
    private LanguageSummary language;
    private VersionGroupSummary versionGroup;

    /**
     * Default constructor.
     */
    public AbilityFlavorText() {
    // JSON-B / Jackson
    }

    /**
     * Create AbilityFlavorText.
     *
     * @param flavorText flavorText
     * @param language language
     * @param versionGroup versionGroup
     */
    public AbilityFlavorText(
        String flavorText, 
        LanguageSummary language, 
        VersionGroupSummary versionGroup
    ) {
        this.flavorText = flavorText;
        this.language = language;
        this.versionGroup = versionGroup;
    }



    /**
     * Get flavorText
     * @return flavorText
     */
    public String getFlavorText() {
        return flavorText;
    }

    public void setFlavorText(String flavorText) {
        this.flavorText = flavorText;
    }

    /**
     * Get language
     * @return language
     */
    public LanguageSummary getLanguage() {
        return language;
    }

    public void setLanguage(LanguageSummary language) {
        this.language = language;
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
        sb.append("class AbilityFlavorText {\n");
        
        sb.append("    flavorText: ").append(toIndentedString(flavorText)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

