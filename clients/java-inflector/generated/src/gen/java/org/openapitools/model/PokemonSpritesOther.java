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





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-11-09T13:49:15.621225368Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonSpritesOther   {
  @JsonProperty("dream_world")
  private PokemonSpritesOtherDreamWorld dreamWorld;

  @JsonProperty("home")
  private PokemonSpritesOtherHome home;

  @JsonProperty("showdown")
  private PokemonSpritesOtherShowdown showdown;

  @JsonProperty("official-artwork")
  private PokemonSpritesOtherOfficialArtwork officialArtwork;

  /**
   * Pokémon Dream World artwork URLs.
   **/
  public PokemonSpritesOther dreamWorld(PokemonSpritesOtherDreamWorld dreamWorld) {
    this.dreamWorld = dreamWorld;
    return this;
  }

  
  @ApiModelProperty(value = "Pokémon Dream World artwork URLs.")
  @JsonProperty("dream_world")
  public PokemonSpritesOtherDreamWorld getDreamWorld() {
    return dreamWorld;
  }
  public void setDreamWorld(PokemonSpritesOtherDreamWorld dreamWorld) {
    this.dreamWorld = dreamWorld;
  }

  /**
   * Pokémon HOME sprite URLs.
   **/
  public PokemonSpritesOther home(PokemonSpritesOtherHome home) {
    this.home = home;
    return this;
  }

  
  @ApiModelProperty(value = "Pokémon HOME sprite URLs.")
  @JsonProperty("home")
  public PokemonSpritesOtherHome getHome() {
    return home;
  }
  public void setHome(PokemonSpritesOtherHome home) {
    this.home = home;
  }

  /**
   * Pokémon Showdown sprite URLs.
   **/
  public PokemonSpritesOther showdown(PokemonSpritesOtherShowdown showdown) {
    this.showdown = showdown;
    return this;
  }

  
  @ApiModelProperty(value = "Pokémon Showdown sprite URLs.")
  @JsonProperty("showdown")
  public PokemonSpritesOtherShowdown getShowdown() {
    return showdown;
  }
  public void setShowdown(PokemonSpritesOtherShowdown showdown) {
    this.showdown = showdown;
  }

  /**
   * Official Pokémon artwork URLs, including shiny artwork and version-specific variants.
   **/
  public PokemonSpritesOther officialArtwork(PokemonSpritesOtherOfficialArtwork officialArtwork) {
    this.officialArtwork = officialArtwork;
    return this;
  }

  
  @ApiModelProperty(value = "Official Pokémon artwork URLs, including shiny artwork and version-specific variants.")
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

