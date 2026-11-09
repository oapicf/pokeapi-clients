package org.openapitools.server.model;

import org.openapitools.server.model.PokemonSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokemonSpeciesVariety   {

    private Boolean isDefault;
    private PokemonSummary pokemon;

    /**
     * Default constructor.
     */
    public PokemonSpeciesVariety() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonSpeciesVariety.
     *
     * @param isDefault Whether this variety is the default variety.
     * @param pokemon The Pokémon variety.
     */
    public PokemonSpeciesVariety(
        Boolean isDefault, 
        PokemonSummary pokemon
    ) {
        this.isDefault = isDefault;
        this.pokemon = pokemon;
    }



    /**
     * Whether this variety is the default variety.
     * @return isDefault
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * The Pokémon variety.
     * @return pokemon
     */
    public PokemonSummary getPokemon() {
        return pokemon;
    }

    public void setPokemon(PokemonSummary pokemon) {
        this.pokemon = pokemon;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonSpeciesVariety {\n");
        
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

