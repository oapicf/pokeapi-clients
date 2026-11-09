package org.openapitools.server.model;

import org.openapitools.server.model.TypeSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokemonFormType   {

    private Integer slot;
    private TypeSummary type;

    /**
     * Default constructor.
     */
    public PokemonFormType() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonFormType.
     *
     * @param slot The order the Pokémon&#39;s types are listed in.
     * @param type The type the referenced Form has.
     */
    public PokemonFormType(
        Integer slot, 
        TypeSummary type
    ) {
        this.slot = slot;
        this.type = type;
    }



    /**
     * The order the Pokémon's types are listed in.
     * minimum: -2147483648
     * maximum: 2147483647
     * @return slot
     */
    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    /**
     * The type the referenced Form has.
     * @return type
     */
    public TypeSummary getType() {
        return type;
    }

    public void setType(TypeSummary type) {
        this.type = type;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonFormType {\n");
        
        sb.append("    slot: ").append(toIndentedString(slot)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

