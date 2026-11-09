package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokemonSpritesOtherShowdown   {

    private String frontDefault;
    private String frontFemale;
    private String frontShiny;
    private String frontShinyFemale;
    private String backDefault;
    private String backFemale;
    private String backShiny;
    private String backShinyFemale;

    /**
     * Default constructor.
     */
    public PokemonSpritesOtherShowdown() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonSpritesOtherShowdown.
     *
     * @param frontDefault The URL of the default Pokémon Showdown front image, or null if unavailable.
     * @param frontFemale The URL of the female Pokémon Showdown front image, or null if unavailable.
     * @param frontShiny The URL of the shiny Pokémon Showdown front image, or null if unavailable.
     * @param frontShinyFemale The URL of the shiny female Pokémon Showdown front image, or null if unavailable.
     * @param backDefault The URL of the default Pokémon Showdown back image, or null if unavailable.
     * @param backFemale The URL of the female Pokémon Showdown back image, or null if unavailable.
     * @param backShiny The URL of the shiny Pokémon Showdown back image, or null if unavailable.
     * @param backShinyFemale The URL of the shiny female Pokémon Showdown back image, or null if unavailable.
     */
    public PokemonSpritesOtherShowdown(
        String frontDefault, 
        String frontFemale, 
        String frontShiny, 
        String frontShinyFemale, 
        String backDefault, 
        String backFemale, 
        String backShiny, 
        String backShinyFemale
    ) {
        this.frontDefault = frontDefault;
        this.frontFemale = frontFemale;
        this.frontShiny = frontShiny;
        this.frontShinyFemale = frontShinyFemale;
        this.backDefault = backDefault;
        this.backFemale = backFemale;
        this.backShiny = backShiny;
        this.backShinyFemale = backShinyFemale;
    }



    /**
     * The URL of the default Pokémon Showdown front image, or null if unavailable.
     * @return frontDefault
     */
    public String getFrontDefault() {
        return frontDefault;
    }

    public void setFrontDefault(String frontDefault) {
        this.frontDefault = frontDefault;
    }

    /**
     * The URL of the female Pokémon Showdown front image, or null if unavailable.
     * @return frontFemale
     */
    public String getFrontFemale() {
        return frontFemale;
    }

    public void setFrontFemale(String frontFemale) {
        this.frontFemale = frontFemale;
    }

    /**
     * The URL of the shiny Pokémon Showdown front image, or null if unavailable.
     * @return frontShiny
     */
    public String getFrontShiny() {
        return frontShiny;
    }

    public void setFrontShiny(String frontShiny) {
        this.frontShiny = frontShiny;
    }

    /**
     * The URL of the shiny female Pokémon Showdown front image, or null if unavailable.
     * @return frontShinyFemale
     */
    public String getFrontShinyFemale() {
        return frontShinyFemale;
    }

    public void setFrontShinyFemale(String frontShinyFemale) {
        this.frontShinyFemale = frontShinyFemale;
    }

    /**
     * The URL of the default Pokémon Showdown back image, or null if unavailable.
     * @return backDefault
     */
    public String getBackDefault() {
        return backDefault;
    }

    public void setBackDefault(String backDefault) {
        this.backDefault = backDefault;
    }

    /**
     * The URL of the female Pokémon Showdown back image, or null if unavailable.
     * @return backFemale
     */
    public String getBackFemale() {
        return backFemale;
    }

    public void setBackFemale(String backFemale) {
        this.backFemale = backFemale;
    }

    /**
     * The URL of the shiny Pokémon Showdown back image, or null if unavailable.
     * @return backShiny
     */
    public String getBackShiny() {
        return backShiny;
    }

    public void setBackShiny(String backShiny) {
        this.backShiny = backShiny;
    }

    /**
     * The URL of the shiny female Pokémon Showdown back image, or null if unavailable.
     * @return backShinyFemale
     */
    public String getBackShinyFemale() {
        return backShinyFemale;
    }

    public void setBackShinyFemale(String backShinyFemale) {
        this.backShinyFemale = backShinyFemale;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonSpritesOtherShowdown {\n");
        
        sb.append("    frontDefault: ").append(toIndentedString(frontDefault)).append("\n");
        sb.append("    frontFemale: ").append(toIndentedString(frontFemale)).append("\n");
        sb.append("    frontShiny: ").append(toIndentedString(frontShiny)).append("\n");
        sb.append("    frontShinyFemale: ").append(toIndentedString(frontShinyFemale)).append("\n");
        sb.append("    backDefault: ").append(toIndentedString(backDefault)).append("\n");
        sb.append("    backFemale: ").append(toIndentedString(backFemale)).append("\n");
        sb.append("    backShiny: ").append(toIndentedString(backShiny)).append("\n");
        sb.append("    backShinyFemale: ").append(toIndentedString(backShinyFemale)).append("\n");
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

