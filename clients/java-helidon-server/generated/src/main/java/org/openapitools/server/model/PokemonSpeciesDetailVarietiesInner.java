package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.AbilityDetailPokemonInnerPokemon;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokemonSpeciesDetailVarietiesInner   {

    private Boolean isDefault;
    private AbilityDetailPokemonInnerPokemon pokemon;

    /**
     * Default constructor.
     */
    public PokemonSpeciesDetailVarietiesInner() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonSpeciesDetailVarietiesInner.
     *
     * @param isDefault isDefault
     * @param pokemon pokemon
     */
    public PokemonSpeciesDetailVarietiesInner(
        Boolean isDefault, 
        AbilityDetailPokemonInnerPokemon pokemon
    ) {
        this.isDefault = isDefault;
        this.pokemon = pokemon;
    }



    /**
     * Get isDefault
     * @return isDefault
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * Get pokemon
     * @return pokemon
     */
    public AbilityDetailPokemonInnerPokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(AbilityDetailPokemonInnerPokemon pokemon) {
        this.pokemon = pokemon;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonSpeciesDetailVarietiesInner {\n");
        
        sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
        sb.append("    pokemon: ").append(toIndentedString(pokemon)).append("\n");
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

