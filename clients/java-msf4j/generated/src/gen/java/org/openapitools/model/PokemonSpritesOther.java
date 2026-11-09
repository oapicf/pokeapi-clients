package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PokemonSpritesOtherDreamWorld;
import org.openapitools.model.PokemonSpritesOtherHome;
import org.openapitools.model.PokemonSpritesOtherOfficialArtwork;
import org.openapitools.model.PokemonSpritesOtherShowdown;

/**
 * PokemonSpritesOther
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-11-09T13:49:25.341948748Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonSpritesOther   {
  @JsonProperty("dream_world")
  private PokemonSpritesOtherDreamWorld dreamWorld;

  @JsonProperty("home")
  private PokemonSpritesOtherHome home;

  @JsonProperty("showdown")
  private PokemonSpritesOtherShowdown showdown;

  @JsonProperty("official-artwork")
  private PokemonSpritesOtherOfficialArtwork officialArtwork;

  public PokemonSpritesOther dreamWorld(PokemonSpritesOtherDreamWorld dreamWorld) {
    this.dreamWorld = dreamWorld;
    return this;
  }

   /**
   * Pokémon Dream World artwork URLs.
   * @return dreamWorld
  **/
  @ApiModelProperty(value = "Pokémon Dream World artwork URLs.")
  public PokemonSpritesOtherDreamWorld getDreamWorld() {
    return dreamWorld;
  }

  public void setDreamWorld(PokemonSpritesOtherDreamWorld dreamWorld) {
    this.dreamWorld = dreamWorld;
  }

  public PokemonSpritesOther home(PokemonSpritesOtherHome home) {
    this.home = home;
    return this;
  }

   /**
   * Pokémon HOME sprite URLs.
   * @return home
  **/
  @ApiModelProperty(value = "Pokémon HOME sprite URLs.")
  public PokemonSpritesOtherHome getHome() {
    return home;
  }

  public void setHome(PokemonSpritesOtherHome home) {
    this.home = home;
  }

  public PokemonSpritesOther showdown(PokemonSpritesOtherShowdown showdown) {
    this.showdown = showdown;
    return this;
  }

   /**
   * Pokémon Showdown sprite URLs.
   * @return showdown
  **/
  @ApiModelProperty(value = "Pokémon Showdown sprite URLs.")
  public PokemonSpritesOtherShowdown getShowdown() {
    return showdown;
  }

  public void setShowdown(PokemonSpritesOtherShowdown showdown) {
    this.showdown = showdown;
  }

  public PokemonSpritesOther officialArtwork(PokemonSpritesOtherOfficialArtwork officialArtwork) {
    this.officialArtwork = officialArtwork;
    return this;
  }

   /**
   * Official Pokémon artwork URLs, including shiny artwork and version-specific variants.
   * @return officialArtwork
  **/
  @ApiModelProperty(value = "Official Pokémon artwork URLs, including shiny artwork and version-specific variants.")
  public PokemonSpritesOtherOfficialArtwork getOfficialArtwork() {
    return officialArtwork;
  }

  public void setOfficialArtwork(PokemonSpritesOtherOfficialArtwork officialArtwork) {
    this.officialArtwork = officialArtwork;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

