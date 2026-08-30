package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.AbilityDetailPokemonInnerPokemon;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class MoveChangeEffectEntriesInner   {

    private String effect;
    private String shortEffect;
    private AbilityDetailPokemonInnerPokemon language;

    /**
     * Default constructor.
     */
    public MoveChangeEffectEntriesInner() {
    // JSON-B / Jackson
    }

    /**
     * Create MoveChangeEffectEntriesInner.
     *
     * @param effect effect
     * @param shortEffect shortEffect
     * @param language language
     */
    public MoveChangeEffectEntriesInner(
        String effect, 
        String shortEffect, 
        AbilityDetailPokemonInnerPokemon language
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
    public AbilityDetailPokemonInnerPokemon getLanguage() {
        return language;
    }

    public void setLanguage(AbilityDetailPokemonInnerPokemon language) {
        this.language = language;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MoveChangeEffectEntriesInner {\n");
        
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

