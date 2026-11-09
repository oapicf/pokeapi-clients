package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.LocationAreaPokemonEncounterVersion;
import org.openapitools.server.model.PokemonSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class LocationAreaPokemonEncounter   {

    private PokemonSummary pokemon;
    private List<@Valid LocationAreaPokemonEncounterVersion> versionDetails = new ArrayList<>();

    /**
     * Default constructor.
     */
    public LocationAreaPokemonEncounter() {
    // JSON-B / Jackson
    }

    /**
     * Create LocationAreaPokemonEncounter.
     *
     * @param pokemon The Pokémon being encountered.
     * @param versionDetails A list of versions and encounters with Pokémon that might happen in the referenced location area.
     */
    public LocationAreaPokemonEncounter(
        PokemonSummary pokemon, 
        List<@Valid LocationAreaPokemonEncounterVersion> versionDetails
    ) {
        this.pokemon = pokemon;
        this.versionDetails = versionDetails;
    }



    /**
     * The Pokémon being encountered.
     * @return pokemon
     */
    public PokemonSummary getPokemon() {
        return pokemon;
    }

    public void setPokemon(PokemonSummary pokemon) {
        this.pokemon = pokemon;
    }

    /**
     * A list of versions and encounters with Pokémon that might happen in the referenced location area.
     * @return versionDetails
     */
    public List<@Valid LocationAreaPokemonEncounterVersion> getVersionDetails() {
        return versionDetails;
    }

    public void setVersionDetails(List<@Valid LocationAreaPokemonEncounterVersion> versionDetails) {
        this.versionDetails = versionDetails;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LocationAreaPokemonEncounter {\n");
        
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

