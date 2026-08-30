package org.openapitools.server.model;

import org.openapitools.server.model.VersionSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokemonGameIndex   {

    private Integer gameIndex;
    private VersionSummary version;

    /**
     * Default constructor.
     */
    public PokemonGameIndex() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonGameIndex.
     *
     * @param gameIndex gameIndex
     * @param version version
     */
    public PokemonGameIndex(
        Integer gameIndex, 
        VersionSummary version
    ) {
        this.gameIndex = gameIndex;
        this.version = version;
    }



    /**
     * Get gameIndex
     * @return gameIndex
     */
    public Integer getGameIndex() {
        return gameIndex;
    }

    public void setGameIndex(Integer gameIndex) {
        this.gameIndex = gameIndex;
    }

    /**
     * Get version
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
        sb.append("class PokemonGameIndex {\n");
        
        sb.append("    gameIndex: ").append(toIndentedString(gameIndex)).append("\n");
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

