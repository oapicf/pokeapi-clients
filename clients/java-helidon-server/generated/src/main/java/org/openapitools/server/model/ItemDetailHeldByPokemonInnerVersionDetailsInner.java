package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.AbilityDetailPokemonInnerPokemon;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ItemDetailHeldByPokemonInnerVersionDetailsInner   {

    private Integer rarity;
    private AbilityDetailPokemonInnerPokemon version;

    /**
     * Default constructor.
     */
    public ItemDetailHeldByPokemonInnerVersionDetailsInner() {
    // JSON-B / Jackson
    }

    /**
     * Create ItemDetailHeldByPokemonInnerVersionDetailsInner.
     *
     * @param rarity rarity
     * @param version version
     */
    public ItemDetailHeldByPokemonInnerVersionDetailsInner(
        Integer rarity, 
        AbilityDetailPokemonInnerPokemon version
    ) {
        this.rarity = rarity;
        this.version = version;
    }



    /**
     * Get rarity
     * @return rarity
     */
    public Integer getRarity() {
        return rarity;
    }

    public void setRarity(Integer rarity) {
        this.rarity = rarity;
    }

    /**
     * Get version
     * @return version
     */
    public AbilityDetailPokemonInnerPokemon getVersion() {
        return version;
    }

    public void setVersion(AbilityDetailPokemonInnerPokemon version) {
        this.version = version;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemDetailHeldByPokemonInnerVersionDetailsInner {\n");
        
        sb.append("    rarity: ").append(toIndentedString(rarity)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

