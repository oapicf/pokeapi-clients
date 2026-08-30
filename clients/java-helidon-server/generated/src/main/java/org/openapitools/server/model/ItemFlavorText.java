package org.openapitools.server.model;

import org.openapitools.server.model.LanguageSummary;
import org.openapitools.server.model.VersionGroupSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ItemFlavorText   {

    private String text;
    private VersionGroupSummary versionGroup;
    private LanguageSummary language;

    /**
     * Default constructor.
     */
    public ItemFlavorText() {
    // JSON-B / Jackson
    }

    /**
     * Create ItemFlavorText.
     *
     * @param text text
     * @param versionGroup versionGroup
     * @param language language
     */
    public ItemFlavorText(
        String text, 
        VersionGroupSummary versionGroup, 
        LanguageSummary language
    ) {
        this.text = text;
        this.versionGroup = versionGroup;
        this.language = language;
    }



    /**
     * Get text
     * @return text
     */
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemFlavorText {\n");
        
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    versionGroup: ").append(toIndentedString(versionGroup)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

