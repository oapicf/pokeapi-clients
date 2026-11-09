package org.openapitools.server.model;

import org.openapitools.server.model.PokemonSpritesOtherDreamWorld;
import org.openapitools.server.model.PokemonSpritesOtherHome;
import org.openapitools.server.model.PokemonSpritesOtherOfficialArtwork;
import org.openapitools.server.model.PokemonSpritesOtherShowdown;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokemonSpritesOther   {

    private PokemonSpritesOtherDreamWorld dreamWorld;
    private PokemonSpritesOtherHome home;
    private PokemonSpritesOtherShowdown showdown;
    private PokemonSpritesOtherOfficialArtwork officialArtwork;

    /**
     * Default constructor.
     */
    public PokemonSpritesOther() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonSpritesOther.
     *
     * @param dreamWorld Pokémon Dream World artwork URLs.
     * @param home Pokémon HOME sprite URLs.
     * @param showdown Pokémon Showdown sprite URLs.
     * @param officialArtwork Official Pokémon artwork URLs, including shiny artwork and version-specific variants.
     */
    public PokemonSpritesOther(
        PokemonSpritesOtherDreamWorld dreamWorld, 
        PokemonSpritesOtherHome home, 
        PokemonSpritesOtherShowdown showdown, 
        PokemonSpritesOtherOfficialArtwork officialArtwork
    ) {
        this.dreamWorld = dreamWorld;
        this.home = home;
        this.showdown = showdown;
        this.officialArtwork = officialArtwork;
    }



    /**
     * Pokémon Dream World artwork URLs.
     * @return dreamWorld
     */
    public PokemonSpritesOtherDreamWorld getDreamWorld() {
        return dreamWorld;
    }

    public void setDreamWorld(PokemonSpritesOtherDreamWorld dreamWorld) {
        this.dreamWorld = dreamWorld;
    }

    /**
     * Pokémon HOME sprite URLs.
     * @return home
     */
    public PokemonSpritesOtherHome getHome() {
        return home;
    }

    public void setHome(PokemonSpritesOtherHome home) {
        this.home = home;
    }

    /**
     * Pokémon Showdown sprite URLs.
     * @return showdown
     */
    public PokemonSpritesOtherShowdown getShowdown() {
        return showdown;
    }

    public void setShowdown(PokemonSpritesOtherShowdown showdown) {
        this.showdown = showdown;
    }

    /**
     * Official Pokémon artwork URLs, including shiny artwork and version-specific variants.
     * @return officialArtwork
     */
    public PokemonSpritesOtherOfficialArtwork getOfficialArtwork() {
        return officialArtwork;
    }

    public void setOfficialArtwork(PokemonSpritesOtherOfficialArtwork officialArtwork) {
        this.officialArtwork = officialArtwork;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonSpritesOther {\n");
        
        sb.append("    dreamWorld: ").append(toIndentedString(dreamWorld)).append("\n");
        sb.append("    home: ").append(toIndentedString(home)).append("\n");
        sb.append("    showdown: ").append(toIndentedString(showdown)).append("\n");
        sb.append("    officialArtwork: ").append(toIndentedString(officialArtwork)).append("\n");
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

