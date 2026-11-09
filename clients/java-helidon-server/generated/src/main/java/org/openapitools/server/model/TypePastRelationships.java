package org.openapitools.server.model;

import org.openapitools.server.model.GenerationSummary;
import org.openapitools.server.model.TypeRelationships;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class TypePastRelationships   {

    private GenerationSummary generation;
    private TypeRelationships damageRelations;

    /**
     * Default constructor.
     */
    public TypePastRelationships() {
    // JSON-B / Jackson
    }

    /**
     * Create TypePastRelationships.
     *
     * @param generation The last generation in which the referenced type had the listed damage relations
     * @param damageRelations The damage relations the referenced type had up to and including the listed generation
     */
    public TypePastRelationships(
        GenerationSummary generation, 
        TypeRelationships damageRelations
    ) {
        this.generation = generation;
        this.damageRelations = damageRelations;
    }



    /**
     * The last generation in which the referenced type had the listed damage relations
     * @return generation
     */
    public GenerationSummary getGeneration() {
        return generation;
    }

    public void setGeneration(GenerationSummary generation) {
        this.generation = generation;
    }

    /**
     * The damage relations the referenced type had up to and including the listed generation
     * @return damageRelations
     */
    public TypeRelationships getDamageRelations() {
        return damageRelations;
    }

    public void setDamageRelations(TypeRelationships damageRelations) {
        this.damageRelations = damageRelations;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TypePastRelationships {\n");
        
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

