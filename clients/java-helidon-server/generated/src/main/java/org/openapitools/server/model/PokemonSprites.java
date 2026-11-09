package org.openapitools.server.model;

import java.util.HashMap;
import java.util.Map;
import org.openapitools.server.model.PokemonSpritesOther;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokemonSprites   {

    private String frontDefault;
    private String frontShiny;
    private String frontFemale;
    private String frontShinyFemale;
    private String backDefault;
    private String backShiny;
    private String backFemale;
    private String backShinyFemale;
    private PokemonSpritesOther other;
    private Map<String, Map<String, Object>> versions = new HashMap<>();

    /**
     * Default constructor.
     */
    public PokemonSprites() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonSprites.
     *
     * @param frontDefault The default depiction of this Pokémon from the front in battle.
     * @param frontShiny The shiny depiction of this Pokémon from the front in battle.
     * @param frontFemale The female depiction of this Pokémon from the front in battle.
     * @param frontShinyFemale The shiny female depiction of this Pokémon from the front in battle.
     * @param backDefault The default depiction of this Pokémon from the back in battle.
     * @param backShiny The shiny depiction of this Pokémon from the back in battle.
     * @param backFemale The female depiction of this Pokémon from the back in battle.
     * @param backShinyFemale The shiny female depiction of this Pokémon from the back in battle.
     * @param other Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource.
     * @param versions Sprites grouped by generation and game. Available keys vary by resource.
     */
    public PokemonSprites(
        String frontDefault, 
        String frontShiny, 
        String frontFemale, 
        String frontShinyFemale, 
        String backDefault, 
        String backShiny, 
        String backFemale, 
        String backShinyFemale, 
        PokemonSpritesOther other, 
        Map<String, Map<String, Object>> versions
    ) {
        this.frontDefault = frontDefault;
        this.frontShiny = frontShiny;
        this.frontFemale = frontFemale;
        this.frontShinyFemale = frontShinyFemale;
        this.backDefault = backDefault;
        this.backShiny = backShiny;
        this.backFemale = backFemale;
        this.backShinyFemale = backShinyFemale;
        this.other = other;
        this.versions = versions;
    }



    /**
     * The default depiction of this Pokémon from the front in battle.
     * @return frontDefault
     */
    public String getFrontDefault() {
        return frontDefault;
    }

    public void setFrontDefault(String frontDefault) {
        this.frontDefault = frontDefault;
    }

    /**
     * The shiny depiction of this Pokémon from the front in battle.
     * @return frontShiny
     */
    public String getFrontShiny() {
        return frontShiny;
    }

    public void setFrontShiny(String frontShiny) {
        this.frontShiny = frontShiny;
    }

    /**
     * The female depiction of this Pokémon from the front in battle.
     * @return frontFemale
     */
    public String getFrontFemale() {
        return frontFemale;
    }

    public void setFrontFemale(String frontFemale) {
        this.frontFemale = frontFemale;
    }

    /**
     * The shiny female depiction of this Pokémon from the front in battle.
     * @return frontShinyFemale
     */
    public String getFrontShinyFemale() {
        return frontShinyFemale;
    }

    public void setFrontShinyFemale(String frontShinyFemale) {
        this.frontShinyFemale = frontShinyFemale;
    }

    /**
     * The default depiction of this Pokémon from the back in battle.
     * @return backDefault
     */
    public String getBackDefault() {
        return backDefault;
    }

    public void setBackDefault(String backDefault) {
        this.backDefault = backDefault;
    }

    /**
     * The shiny depiction of this Pokémon from the back in battle.
     * @return backShiny
     */
    public String getBackShiny() {
        return backShiny;
    }

    public void setBackShiny(String backShiny) {
        this.backShiny = backShiny;
    }

    /**
     * The female depiction of this Pokémon from the back in battle.
     * @return backFemale
     */
    public String getBackFemale() {
        return backFemale;
    }

    public void setBackFemale(String backFemale) {
        this.backFemale = backFemale;
    }

    /**
     * The shiny female depiction of this Pokémon from the back in battle.
     * @return backShinyFemale
     */
    public String getBackShinyFemale() {
        return backShinyFemale;
    }

    public void setBackShinyFemale(String backShinyFemale) {
        this.backShinyFemale = backShinyFemale;
    }

    /**
     * Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource.
     * @return other
     */
    public PokemonSpritesOther getOther() {
        return other;
    }

    public void setOther(PokemonSpritesOther other) {
        this.other = other;
    }

    /**
     * Sprites grouped by generation and game. Available keys vary by resource.
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
        sb.append("class PokemonSprites {\n");
        
        sb.append("    frontDefault: ").append(toIndentedString(frontDefault)).append("\n");
        sb.append("    frontShiny: ").append(toIndentedString(frontShiny)).append("\n");
        sb.append("    frontFemale: ").append(toIndentedString(frontFemale)).append("\n");
        sb.append("    frontShinyFemale: ").append(toIndentedString(frontShinyFemale)).append("\n");
        sb.append("    backDefault: ").append(toIndentedString(backDefault)).append("\n");
        sb.append("    backShiny: ").append(toIndentedString(backShiny)).append("\n");
        sb.append("    backFemale: ").append(toIndentedString(backFemale)).append("\n");
        sb.append("    backShinyFemale: ").append(toIndentedString(backShinyFemale)).append("\n");
        sb.append("    other: ").append(toIndentedString(other)).append("\n");
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

