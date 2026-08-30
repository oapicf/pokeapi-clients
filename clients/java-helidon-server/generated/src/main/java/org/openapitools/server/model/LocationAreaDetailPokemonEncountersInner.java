package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.server.model.LocationAreaDetailPokemonEncountersInnerVersionDetailsInner;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class LocationAreaDetailPokemonEncountersInner   {

    private AbilityDetailPokemonInnerPokemon pokemon;
    private List<@Valid LocationAreaDetailPokemonEncountersInnerVersionDetailsInner> versionDetails = new ArrayList<>();

    /**
     * Default constructor.
     */
    public LocationAreaDetailPokemonEncountersInner() {
    // JSON-B / Jackson
    }

    /**
     * Create LocationAreaDetailPokemonEncountersInner.
     *
     * @param pokemon pokemon
     * @param versionDetails versionDetails
     */
    public LocationAreaDetailPokemonEncountersInner(
        AbilityDetailPokemonInnerPokemon pokemon, 
        List<@Valid LocationAreaDetailPokemonEncountersInnerVersionDetailsInner> versionDetails
    ) {
        this.pokemon = pokemon;
        this.versionDetails = versionDetails;
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
     * Get versionDetails
     * @return versionDetails
     */
    public List<@Valid LocationAreaDetailPokemonEncountersInnerVersionDetailsInner> getVersionDetails() {
        return versionDetails;
    }

    public void setVersionDetails(List<@Valid LocationAreaDetailPokemonEncountersInnerVersionDetailsInner> versionDetails) {
        this.versionDetails = versionDetails;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LocationAreaDetailPokemonEncountersInner {\n");
        
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

