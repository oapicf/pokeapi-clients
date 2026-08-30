package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.AbilityDetailPokemonInnerPokemon;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class MoveDetailEffectChangesInnerEffectEntriesInner   {

    private String effect;
    private AbilityDetailPokemonInnerPokemon language;

    /**
     * Default constructor.
     */
    public MoveDetailEffectChangesInnerEffectEntriesInner() {
    // JSON-B / Jackson
    }

    /**
     * Create MoveDetailEffectChangesInnerEffectEntriesInner.
     *
     * @param effect effect
     * @param language language
     */
    public MoveDetailEffectChangesInnerEffectEntriesInner(
        String effect, 
        AbilityDetailPokemonInnerPokemon language
    ) {
        this.effect = effect;
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
        sb.append("class MoveDetailEffectChangesInnerEffectEntriesInner {\n");
        
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

