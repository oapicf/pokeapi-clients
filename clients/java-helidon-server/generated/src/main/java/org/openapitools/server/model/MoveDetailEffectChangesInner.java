package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.server.model.MoveDetailEffectChangesInnerEffectEntriesInner;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class MoveDetailEffectChangesInner   {

    private List<@Valid MoveDetailEffectChangesInnerEffectEntriesInner> effectEntries = new ArrayList<>();
    private AbilityDetailPokemonInnerPokemon versionGroup;

    /**
     * Default constructor.
     */
    public MoveDetailEffectChangesInner() {
    // JSON-B / Jackson
    }

    /**
     * Create MoveDetailEffectChangesInner.
     *
     * @param effectEntries effectEntries
     * @param versionGroup versionGroup
     */
    public MoveDetailEffectChangesInner(
        List<@Valid MoveDetailEffectChangesInnerEffectEntriesInner> effectEntries, 
        AbilityDetailPokemonInnerPokemon versionGroup
    ) {
        this.effectEntries = effectEntries;
        this.versionGroup = versionGroup;
    }



    /**
     * Get effectEntries
     * @return effectEntries
     */
    public List<@Valid MoveDetailEffectChangesInnerEffectEntriesInner> getEffectEntries() {
        return effectEntries;
    }

    public void setEffectEntries(List<@Valid MoveDetailEffectChangesInnerEffectEntriesInner> effectEntries) {
        this.effectEntries = effectEntries;
    }

    /**
     * Get versionGroup
     * @return versionGroup
     */
    public AbilityDetailPokemonInnerPokemon getVersionGroup() {
        return versionGroup;
    }

    public void setVersionGroup(AbilityDetailPokemonInnerPokemon versionGroup) {
        this.versionGroup = versionGroup;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MoveDetailEffectChangesInner {\n");
        
        sb.append("    effectEntries: ").append(toIndentedString(effectEntries)).append("\n");
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

