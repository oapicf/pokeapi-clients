package apimodels;

import apimodels.PokemonSpritesOtherDreamWorld;
import apimodels.PokemonSpritesOtherHome;
import apimodels.PokemonSpritesOtherOfficialArtwork;
import apimodels.PokemonSpritesOtherShowdown;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PokemonSpritesOther
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PokemonSpritesOther   {
  @JsonProperty("dream_world")
  @Valid

  private PokemonSpritesOtherDreamWorld dreamWorld;

  @JsonProperty("home")
  @Valid

  private PokemonSpritesOtherHome home;

  @JsonProperty("showdown")
  @Valid

  private PokemonSpritesOtherShowdown showdown;

  @JsonProperty("official-artwork")
  @Valid

  private PokemonSpritesOtherOfficialArtwork officialArtwork;

  public PokemonSpritesOther dreamWorld(PokemonSpritesOtherDreamWorld dreamWorld) {
    this.dreamWorld = dreamWorld;
    return this;
  }

   /**
   * Pokémon Dream World artwork URLs.
   * @return dreamWorld
  **/
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
    return Objects.equals(dreamWorld, pokemonSpritesOther.dreamWorld) &&
        Objects.equals(home, pokemonSpritesOther.home) &&
        Objects.equals(showdown, pokemonSpritesOther.showdown) &&
        Objects.equals(officialArtwork, pokemonSpritesOther.officialArtwork);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dreamWorld, home, showdown, officialArtwork);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

