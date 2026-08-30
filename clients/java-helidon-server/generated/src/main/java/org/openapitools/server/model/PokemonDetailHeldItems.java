package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.server.model.ItemDetailHeldByPokemonInnerVersionDetailsInner;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokemonDetailHeldItems   {

    private AbilityDetailPokemonInnerPokemon item;
    private List<@Valid ItemDetailHeldByPokemonInnerVersionDetailsInner> versionDetails = new ArrayList<>();

    /**
     * Default constructor.
     */
    public PokemonDetailHeldItems() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonDetailHeldItems.
     *
     * @param item item
     * @param versionDetails versionDetails
     */
    public PokemonDetailHeldItems(
        AbilityDetailPokemonInnerPokemon item, 
        List<@Valid ItemDetailHeldByPokemonInnerVersionDetailsInner> versionDetails
    ) {
        this.item = item;
        this.versionDetails = versionDetails;
    }



    /**
     * Get item
     * @return item
     */
    public AbilityDetailPokemonInnerPokemon getItem() {
        return item;
    }

    public void setItem(AbilityDetailPokemonInnerPokemon item) {
        this.item = item;
    }

    /**
     * Get versionDetails
     * @return versionDetails
     */
    public List<@Valid ItemDetailHeldByPokemonInnerVersionDetailsInner> getVersionDetails() {
        return versionDetails;
    }

    public void setVersionDetails(List<@Valid ItemDetailHeldByPokemonInnerVersionDetailsInner> versionDetails) {
        this.versionDetails = versionDetails;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonDetailHeldItems {\n");
        
        sb.append("    item: ").append(toIndentedString(item)).append("\n");
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

