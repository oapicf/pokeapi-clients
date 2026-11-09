package org.openapitools.server.model;

import org.openapitools.server.model.VersionSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokemonHeldItemVersion   {

    private Integer rarity;
    private VersionSummary version;

    /**
     * Default constructor.
     */
    public PokemonHeldItemVersion() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonHeldItemVersion.
     *
     * @param rarity How often the item is held.
     * @param version The version in which the item is held.
     */
    public PokemonHeldItemVersion(
        Integer rarity, 
        VersionSummary version
    ) {
        this.rarity = rarity;
        this.version = version;
    }



    /**
     * How often the item is held.
     * @return rarity
     */
    public Integer getRarity() {
        return rarity;
    }

    public void setRarity(Integer rarity) {
        this.rarity = rarity;
    }

    /**
     * The version in which the item is held.
     * @return version
     */
    public VersionSummary getVersion() {
        return version;
    }

    public void setVersion(VersionSummary version) {
        this.version = version;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonHeldItemVersion {\n");
        
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

