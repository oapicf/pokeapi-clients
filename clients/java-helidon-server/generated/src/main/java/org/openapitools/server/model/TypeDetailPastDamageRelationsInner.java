package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.server.model.TypeDetailPastDamageRelationsInnerDamageRelations;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class TypeDetailPastDamageRelationsInner   {

    private AbilityDetailPokemonInnerPokemon generation;
    private TypeDetailPastDamageRelationsInnerDamageRelations damageRelations;

    /**
     * Default constructor.
     */
    public TypeDetailPastDamageRelationsInner() {
    // JSON-B / Jackson
    }

    /**
     * Create TypeDetailPastDamageRelationsInner.
     *
     * @param generation generation
     * @param damageRelations damageRelations
     */
    public TypeDetailPastDamageRelationsInner(
        AbilityDetailPokemonInnerPokemon generation, 
        TypeDetailPastDamageRelationsInnerDamageRelations damageRelations
    ) {
        this.generation = generation;
        this.damageRelations = damageRelations;
    }



    /**
     * Get generation
     * @return generation
     */
    public AbilityDetailPokemonInnerPokemon getGeneration() {
        return generation;
    }

    public void setGeneration(AbilityDetailPokemonInnerPokemon generation) {
        this.generation = generation;
    }

    /**
     * Get damageRelations
     * @return damageRelations
     */
    public TypeDetailPastDamageRelationsInnerDamageRelations getDamageRelations() {
        return damageRelations;
    }

    public void setDamageRelations(TypeDetailPastDamageRelationsInnerDamageRelations damageRelations) {
        this.damageRelations = damageRelations;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TypeDetailPastDamageRelationsInner {\n");
        
        sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
        sb.append("    damageRelations: ").append(toIndentedString(damageRelations)).append("\n");
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

