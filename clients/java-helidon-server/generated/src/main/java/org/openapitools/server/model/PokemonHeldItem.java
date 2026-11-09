package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.PokemonHeldItemVersion;
import org.openapitools.server.model.PokemonSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokemonHeldItem   {

    private PokemonSummary pokemon;
    private List<@Valid PokemonHeldItemVersion> versionDetails = new ArrayList<>();

    /**
     * Default constructor.
     */
    public PokemonHeldItem() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonHeldItem.
     *
     * @param pokemon The Pokémon that holds this item.
     * @param versionDetails The details for the version that this item is held in by the Pokémon.
     */
    public PokemonHeldItem(
        PokemonSummary pokemon, 
        List<@Valid PokemonHeldItemVersion> versionDetails
    ) {
        this.pokemon = pokemon;
        this.versionDetails = versionDetails;
    }



    /**
     * The Pokémon that holds this item.
     * @return pokemon
     */
    public PokemonSummary getPokemon() {
        return pokemon;
    }

    public void setPokemon(PokemonSummary pokemon) {
        this.pokemon = pokemon;
    }

    /**
     * The details for the version that this item is held in by the Pokémon.
     * @return versionDetails
     */
    public List<@Valid PokemonHeldItemVersion> getVersionDetails() {
        return versionDetails;
    }

    public void setVersionDetails(List<@Valid PokemonHeldItemVersion> versionDetails) {
        this.versionDetails = versionDetails;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonHeldItem {\n");
        
        sb.append("    pokemon: ").append(toIndentedString(pokemon)).append("\n");
        sb.append("    versionDetails: ").append(toIndentedString(versionDetails)).append("\n");
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

