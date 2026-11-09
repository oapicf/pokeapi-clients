package org.openapitools.server.model;

import java.util.HashMap;
import java.util.Map;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokemonSpritesOtherOfficialArtwork   {

    private String frontDefault;
    private String frontShiny;
    private Map<String, Map<String, Object>> versions = new HashMap<>();

    /**
     * Default constructor.
     */
    public PokemonSpritesOtherOfficialArtwork() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonSpritesOtherOfficialArtwork.
     *
     * @param frontDefault The URL of the default front official artwork, or null if unavailable.
     * @param frontShiny The URL of the shiny front official artwork, or null if unavailable.
     * @param versions Additional official artwork grouped by version. Available keys vary by resource.
     */
    public PokemonSpritesOtherOfficialArtwork(
        String frontDefault, 
        String frontShiny, 
        Map<String, Map<String, Object>> versions
    ) {
        this.frontDefault = frontDefault;
        this.frontShiny = frontShiny;
        this.versions = versions;
    }



    /**
     * The URL of the default front official artwork, or null if unavailable.
     * @return frontDefault
     */
    public String getFrontDefault() {
        return frontDefault;
    }

    public void setFrontDefault(String frontDefault) {
        this.frontDefault = frontDefault;
    }

    /**
     * The URL of the shiny front official artwork, or null if unavailable.
     * @return frontShiny
     */
    public String getFrontShiny() {
        return frontShiny;
    }

    public void setFrontShiny(String frontShiny) {
        this.frontShiny = frontShiny;
    }

    /**
     * Additional official artwork grouped by version. Available keys vary by resource.
     * @return versions
     */
    public Map<String, Map<String, Object>> getVersions() {
        return versions;
    }

    public void setVersions(Map<String, Map<String, Object>> versions) {
        this.versions = versions;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonSpritesOtherOfficialArtwork {\n");
        
        sb.append("    frontDefault: ").append(toIndentedString(frontDefault)).append("\n");
        sb.append("    frontShiny: ").append(toIndentedString(frontShiny)).append("\n");
        sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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

