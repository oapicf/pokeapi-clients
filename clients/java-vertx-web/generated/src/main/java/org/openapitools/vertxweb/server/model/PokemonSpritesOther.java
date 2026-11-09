package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.PokemonSpritesOtherDreamWorld;
import org.openapitools.vertxweb.server.model.PokemonSpritesOtherHome;
import org.openapitools.vertxweb.server.model.PokemonSpritesOtherOfficialArtwork;
import org.openapitools.vertxweb.server.model.PokemonSpritesOtherShowdown;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PokemonSpritesOther   {
  
  private PokemonSpritesOtherDreamWorld dreamWorld;
  private PokemonSpritesOtherHome home;
  private PokemonSpritesOtherShowdown showdown;
  private PokemonSpritesOtherOfficialArtwork officialArtwork;

  public PokemonSpritesOther () {

  }

  public PokemonSpritesOther (PokemonSpritesOtherDreamWorld dreamWorld, PokemonSpritesOtherHome home, PokemonSpritesOtherShowdown showdown, PokemonSpritesOtherOfficialArtwork officialArtwork) {
    this.dreamWorld = dreamWorld;
    this.home = home;
    this.showdown = showdown;
    this.officialArtwork = officialArtwork;
  }

    
  @JsonProperty("dream_world")
  public PokemonSpritesOtherDreamWorld getDreamWorld() {
    return dreamWorld;
  }
  public void setDreamWorld(PokemonSpritesOtherDreamWorld dreamWorld) {
    this.dreamWorld = dreamWorld;
  }

    
  @JsonProperty("home")
  public PokemonSpritesOtherHome getHome() {
    return home;
  }
  public void setHome(PokemonSpritesOtherHome home) {
    this.home = home;
  }

    
  @JsonProperty("showdown")
  public PokemonSpritesOtherShowdown getShowdown() {
    return showdown;
  }
  public void setShowdown(PokemonSpritesOtherShowdown showdown) {
    this.showdown = showdown;
  }

    
  @JsonProperty("official-artwork")
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
