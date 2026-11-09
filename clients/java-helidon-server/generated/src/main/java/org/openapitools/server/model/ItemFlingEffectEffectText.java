package org.openapitools.server.model;

import org.openapitools.server.model.LanguageSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ItemFlingEffectEffectText   {

    private String effect;
    private LanguageSummary language;

    /**
     * Default constructor.
     */
    public ItemFlingEffectEffectText() {
    // JSON-B / Jackson
    }

    /**
     * Create ItemFlingEffectEffectText.
     *
     * @param effect The localized effect text for an API resource in a specific language.
     * @param language The language this effect is in.
     */
    public ItemFlingEffectEffectText(
        String effect, 
        LanguageSummary language
    ) {
        this.effect = effect;
        this.language = language;
    }



    /**
     * The localized effect text for an API resource in a specific language.
     * @return effect
     */
    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    /**
     * The language this effect is in.
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
        sb.append("class ItemFlingEffectEffectText {\n");
        
        sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
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

