package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.ItemSummary;
import org.openapitools.server.model.PokemonHeldItemVersion;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokemonHeldItemSummary   {

    private ItemSummary item;
    private List<@Valid PokemonHeldItemVersion> versionDetails = new ArrayList<>();

    /**
     * Default constructor.
     */
    public PokemonHeldItemSummary() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonHeldItemSummary.
     *
     * @param item The item the referenced Pokémon holds.
     * @param versionDetails The details of the different versions in which the item is held.
     */
    public PokemonHeldItemSummary(
        ItemSummary item, 
        List<@Valid PokemonHeldItemVersion> versionDetails
    ) {
        this.item = item;
        this.versionDetails = versionDetails;
    }



    /**
     * The item the referenced Pokémon holds.
     * @return item
     */
    public ItemSummary getItem() {
        return item;
    }

    public void setItem(ItemSummary item) {
        this.item = item;
    }

    /**
     * The details of the different versions in which the item is held.
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
        sb.append("class PokemonHeldItemSummary {\n");
        
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

