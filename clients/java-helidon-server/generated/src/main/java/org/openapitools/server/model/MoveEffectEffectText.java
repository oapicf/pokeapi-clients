package org.openapitools.server.model;

import org.openapitools.server.model.LanguageSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class MoveEffectEffectText   {

    private String effect;
    private String shortEffect;
    private LanguageSummary language;

    /**
     * Default constructor.
     */
    public MoveEffectEffectText() {
    // JSON-B / Jackson
    }

    /**
     * Create MoveEffectEffectText.
     *
     * @param effect The localized effect text for an API resource in a specific language.
     * @param shortEffect The localized effect text in brief.
     * @param language The language this effect is in.
     */
    public MoveEffectEffectText(
        String effect, 
        String shortEffect, 
        LanguageSummary language
    ) {
        this.effect = effect;
        this.shortEffect = shortEffect;
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
     * The localized effect text in brief.
     * @return shortEffect
     */
    public String getShortEffect() {
        return shortEffect;
    }

    public void setShortEffect(String shortEffect) {
        this.shortEffect = shortEffect;
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
        sb.append("class MoveEffectEffectText {\n");
        
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

