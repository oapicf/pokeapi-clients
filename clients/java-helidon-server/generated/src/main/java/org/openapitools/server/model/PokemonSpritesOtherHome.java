package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokemonSpritesOtherHome   {

    private String frontDefault;
    private String frontFemale;
    private String frontShiny;
    private String frontShinyFemale;

    /**
     * Default constructor.
     */
    public PokemonSpritesOtherHome() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonSpritesOtherHome.
     *
     * @param frontDefault The URL of the default Pokémon HOME front image, or null if unavailable.
     * @param frontFemale The URL of the female Pokémon HOME front image, or null if unavailable.
     * @param frontShiny The URL of the shiny Pokémon HOME front image, or null if unavailable.
     * @param frontShinyFemale The URL of the shiny female Pokémon HOME front image, or null if unavailable.
     */
    public PokemonSpritesOtherHome(
        String frontDefault, 
        String frontFemale, 
        String frontShiny, 
        String frontShinyFemale
    ) {
        this.frontDefault = frontDefault;
        this.frontFemale = frontFemale;
        this.frontShiny = frontShiny;
        this.frontShinyFemale = frontShinyFemale;
    }



    /**
     * The URL of the default Pokémon HOME front image, or null if unavailable.
     * @return frontDefault
     */
    public String getFrontDefault() {
        return frontDefault;
    }

    public void setFrontDefault(String frontDefault) {
        this.frontDefault = frontDefault;
    }

    /**
     * The URL of the female Pokémon HOME front image, or null if unavailable.
     * @return frontFemale
     */
    public String getFrontFemale() {
        return frontFemale;
    }

    public void setFrontFemale(String frontFemale) {
        this.frontFemale = frontFemale;
    }

    /**
     * The URL of the shiny Pokémon HOME front image, or null if unavailable.
     * @return frontShiny
     */
    public String getFrontShiny() {
        return frontShiny;
    }

    public void setFrontShiny(String frontShiny) {
        this.frontShiny = frontShiny;
    }

    /**
     * The URL of the shiny female Pokémon HOME front image, or null if unavailable.
     * @return frontShinyFemale
     */
    public String getFrontShinyFemale() {
        return frontShinyFemale;
    }

    public void setFrontShinyFemale(String frontShinyFemale) {
        this.frontShinyFemale = frontShinyFemale;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonSpritesOtherHome {\n");
        
        sb.append("    frontDefault: ").append(toIndentedString(frontDefault)).append("\n");
        sb.append("    frontFemale: ").append(toIndentedString(frontFemale)).append("\n");
        sb.append("    frontShiny: ").append(toIndentedString(frontShiny)).append("\n");
        sb.append("    frontShinyFemale: ").append(toIndentedString(frontShinyFemale)).append("\n");
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

