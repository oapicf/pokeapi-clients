package org.openapitools.model;

import org.openapitools.model.PokemonSpritesOtherDreamWorld;
import org.openapitools.model.PokemonSpritesOtherHome;
import org.openapitools.model.PokemonSpritesOtherOfficialArtwork;
import org.openapitools.model.PokemonSpritesOtherShowdown;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonSpritesOther  {
  
 /**
  * Pokémon Dream World artwork URLs.
  */
  @ApiModelProperty(value = "Pokémon Dream World artwork URLs.")

  private PokemonSpritesOtherDreamWorld dreamWorld;

 /**
  * Pokémon HOME sprite URLs.
  */
  @ApiModelProperty(value = "Pokémon HOME sprite URLs.")

  private PokemonSpritesOtherHome home;

 /**
  * Pokémon Showdown sprite URLs.
  */
  @ApiModelProperty(value = "Pokémon Showdown sprite URLs.")

  private PokemonSpritesOtherShowdown showdown;

 /**
  * Official Pokémon artwork URLs, including shiny artwork and version-specific variants.
  */
  @ApiModelProperty(value = "Official Pokémon artwork URLs, including shiny artwork and version-specific variants.")

  private PokemonSpritesOtherOfficialArtwork officialArtwork;
 /**
   * Pokémon Dream World artwork URLs.
   * @return dreamWorld
  **/
  @JsonProperty("dream_world")
  public PokemonSpritesOtherDreamWorld getDreamWorld() {
    return dreamWorld;
  }

  public void setDreamWorld(PokemonSpritesOtherDreamWorld dreamWorld) {
    this.dreamWorld = dreamWorld;
  }

  public PokemonSpritesOther dreamWorld(PokemonSpritesOtherDreamWorld dreamWorld) {
    this.dreamWorld = dreamWorld;
    return this;
  }

 /**
   * Pokémon HOME sprite URLs.
   * @return home
  **/
  @JsonProperty("home")
  public PokemonSpritesOtherHome getHome() {
    return home;
  }

  public void setHome(PokemonSpritesOtherHome home) {
    this.home = home;
  }

  public PokemonSpritesOther home(PokemonSpritesOtherHome home) {
    this.home = home;
    return this;
  }

 /**
   * Pokémon Showdown sprite URLs.
   * @return showdown
  **/
  @JsonProperty("showdown")
  public PokemonSpritesOtherShowdown getShowdown() {
    return showdown;
  }

  public void setShowdown(PokemonSpritesOtherShowdown showdown) {
    this.showdown = showdown;
  }

  public PokemonSpritesOther showdown(PokemonSpritesOtherShowdown showdown) {
    this.showdown = showdown;
    return this;
  }

 /**
   * Official Pokémon artwork URLs, including shiny artwork and version-specific variants.
   * @return officialArtwork
  **/
  @JsonProperty("official-artwork")
  public PokemonSpritesOtherOfficialArtwork getOfficialArtwork() {
    return officialArtwork;
  }

  public void setOfficialArtwork(PokemonSpritesOtherOfficialArtwork officialArtwork) {
    this.officialArtwork = officialArtwork;
  }

  public PokemonSpritesOther officialArtwork(PokemonSpritesOtherOfficialArtwork officialArtwork) {
    this.officialArtwork = officialArtwork;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonSpritesOther pokemonSpritesOther = (PokemonSpritesOther) o;
    return Objects.equals(this.dreamWorld, pokemonSpritesOther.dreamWorld) &&
        Objects.equals(this.home, pokemonSpritesOther.home) &&
        Objects.equals(this.showdown, pokemonSpritesOther.showdown) &&
        Objects.equals(this.officialArtwork, pokemonSpritesOther.officialArtwork);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dreamWorld, home, showdown, officialArtwork);
  }

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

