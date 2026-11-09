package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokemonSpritesOtherDreamWorld   {

    private String frontDefault;
    private String frontFemale;

    /**
     * Default constructor.
     */
    public PokemonSpritesOtherDreamWorld() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonSpritesOtherDreamWorld.
     *
     * @param frontDefault The URL of the default Pokémon Dream World front image, or null if unavailable.
     * @param frontFemale The URL of the female Pokémon Dream World front image, or null if unavailable.
     */
    public PokemonSpritesOtherDreamWorld(
        String frontDefault, 
        String frontFemale
    ) {
        this.frontDefault = frontDefault;
        this.frontFemale = frontFemale;
    }



    /**
     * The URL of the default Pokémon Dream World front image, or null if unavailable.
     * @return frontDefault
     */
    public String getFrontDefault() {
        return frontDefault;
    }

    public void setFrontDefault(String frontDefault) {
        this.frontDefault = frontDefault;
    }

    /**
     * The URL of the female Pokémon Dream World front image, or null if unavailable.
     * @return frontFemale
     */
    public String getFrontFemale() {
        return frontFemale;
    }

    public void setFrontFemale(String frontFemale) {
        this.frontFemale = frontFemale;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonSpritesOtherDreamWorld {\n");
        
        sb.append("    frontDefault: ").append(toIndentedString(frontDefault)).append("\n");
        sb.append("    frontFemale: ").append(toIndentedString(frontFemale)).append("\n");
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

