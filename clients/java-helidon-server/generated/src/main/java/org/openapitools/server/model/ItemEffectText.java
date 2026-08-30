package org.openapitools.server.model;

import org.openapitools.server.model.LanguageSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ItemEffectText   {

    private String effect;
    private String shortEffect;
    private LanguageSummary language;

    /**
     * Default constructor.
     */
    public ItemEffectText() {
    // JSON-B / Jackson
    }

    /**
     * Create ItemEffectText.
     *
     * @param effect effect
     * @param shortEffect shortEffect
     * @param language language
     */
    public ItemEffectText(
        String effect, 
        String shortEffect, 
        LanguageSummary language
    ) {
        this.effect = effect;
        this.shortEffect = shortEffect;
        this.language = language;
    }



    /**
     * Get effect
     * @return effect
     */
    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    /**
     * Get shortEffect
     * @return shortEffect
     */
    public String getShortEffect() {
        return shortEffect;
    }

    public void setShortEffect(String shortEffect) {
        this.shortEffect = shortEffect;
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
        sb.append("class ItemEffectText {\n");
        
        sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
        sb.append("    shortEffect: ").append(toIndentedString(shortEffect)).append("\n");
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

