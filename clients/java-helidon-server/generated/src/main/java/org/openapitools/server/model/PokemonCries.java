package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokemonCries   {

    private String latest;
    private String legacy;

    /**
     * Default constructor.
     */
    public PokemonCries() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonCries.
     *
     * @param latest The latest depiction of this Pokémon&#39;s cry.
     * @param legacy The legacy depiction of this Pokémon&#39;s cry.
     */
    public PokemonCries(
        String latest, 
        String legacy
    ) {
        this.latest = latest;
        this.legacy = legacy;
    }



    /**
     * The latest depiction of this Pokémon's cry.
     * @return latest
     */
    public String getLatest() {
        return latest;
    }

    public void setLatest(String latest) {
        this.latest = latest;
    }

    /**
     * The legacy depiction of this Pokémon's cry.
     * @return legacy
     */
    public String getLegacy() {
        return legacy;
    }

    public void setLegacy(String legacy) {
        this.legacy = legacy;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonCries {\n");
        
        sb.append("    latest: ").append(toIndentedString(latest)).append("\n");
        sb.append("    legacy: ").append(toIndentedString(legacy)).append("\n");
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

