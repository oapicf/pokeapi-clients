package org.openapitools.server.model;

import org.openapitools.server.model.PokemonSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AbilityPokemonDetail   {

    private Boolean isHidden;
    private Integer slot;
    private PokemonSummary pokemon;

    /**
     * Default constructor.
     */
    public AbilityPokemonDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create AbilityPokemonDetail.
     *
     * @param isHidden Whether or not this a hidden ability for the referenced Pokémon.
     * @param slot Pokémon have 3 ability &#39;slots&#39; which hold references to possible abilities they could have. This is the slot of this ability for the referenced pokemon.
     * @param pokemon The Pokémon this ability could belong to.
     */
    public AbilityPokemonDetail(
        Boolean isHidden, 
        Integer slot, 
        PokemonSummary pokemon
    ) {
        this.isHidden = isHidden;
        this.slot = slot;
        this.pokemon = pokemon;
    }



    /**
     * Whether or not this a hidden ability for the referenced Pokémon.
     * @return isHidden
     */
    public Boolean getIsHidden() {
        return isHidden;
    }

    public void setIsHidden(Boolean isHidden) {
        this.isHidden = isHidden;
    }

    /**
     * Pokémon have 3 ability 'slots' which hold references to possible abilities they could have. This is the slot of this ability for the referenced pokemon.
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
     * The Pokémon this ability could belong to.
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
        sb.append("class AbilityPokemonDetail {\n");
        
        sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
        sb.append("    slot: ").append(toIndentedString(slot)).append("\n");
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

