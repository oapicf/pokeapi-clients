package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * PokemonSpritesOtherShowdown
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-11-09T13:49:28.343088631Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonSpritesOtherShowdown   {
  @JsonProperty("front_default")
  private String frontDefault;

  @JsonProperty("front_female")
  private String frontFemale;

  @JsonProperty("front_shiny")
  private String frontShiny;

  @JsonProperty("front_shiny_female")
  private String frontShinyFemale;

  @JsonProperty("back_default")
  private String backDefault;

  @JsonProperty("back_female")
  private String backFemale;

  @JsonProperty("back_shiny")
  private String backShiny;

  @JsonProperty("back_shiny_female")
  private String backShinyFemale;

  public PokemonSpritesOtherShowdown frontDefault(String frontDefault) {
    this.frontDefault = frontDefault;
    return this;
  }

  /**
   * The URL of the default Pokémon Showdown front image, or null if unavailable.
   * @return frontDefault
   */
  @ApiModelProperty(required = true, value = "The URL of the default Pokémon Showdown front image, or null if unavailable.")
  public String getFrontDefault() {
    return frontDefault;
  }

  public void setFrontDefault(String frontDefault) {
    this.frontDefault = frontDefault;
  }

  public PokemonSpritesOtherShowdown frontFemale(String frontFemale) {
    this.frontFemale = frontFemale;
    return this;
  }

  /**
   * The URL of the female Pokémon Showdown front image, or null if unavailable.
   * @return frontFemale
   */
  @ApiModelProperty(required = true, value = "The URL of the female Pokémon Showdown front image, or null if unavailable.")
  public String getFrontFemale() {
    return frontFemale;
  }

  public void setFrontFemale(String frontFemale) {
    this.frontFemale = frontFemale;
  }

  public PokemonSpritesOtherShowdown frontShiny(String frontShiny) {
    this.frontShiny = frontShiny;
    return this;
  }

  /**
   * The URL of the shiny Pokémon Showdown front image, or null if unavailable.
   * @return frontShiny
   */
  @ApiModelProperty(required = true, value = "The URL of the shiny Pokémon Showdown front image, or null if unavailable.")
  public String getFrontShiny() {
    return frontShiny;
  }

  public void setFrontShiny(String frontShiny) {
    this.frontShiny = frontShiny;
  }

  public PokemonSpritesOtherShowdown frontShinyFemale(String frontShinyFemale) {
    this.frontShinyFemale = frontShinyFemale;
    return this;
  }

  /**
   * The URL of the shiny female Pokémon Showdown front image, or null if unavailable.
   * @return frontShinyFemale
   */
  @ApiModelProperty(required = true, value = "The URL of the shiny female Pokémon Showdown front image, or null if unavailable.")
  public String getFrontShinyFemale() {
    return frontShinyFemale;
  }

  public void setFrontShinyFemale(String frontShinyFemale) {
    this.frontShinyFemale = frontShinyFemale;
  }

  public PokemonSpritesOtherShowdown backDefault(String backDefault) {
    this.backDefault = backDefault;
    return this;
  }

  /**
   * The URL of the default Pokémon Showdown back image, or null if unavailable.
   * @return backDefault
   */
  @ApiModelProperty(required = true, value = "The URL of the default Pokémon Showdown back image, or null if unavailable.")
  public String getBackDefault() {
    return backDefault;
  }

  public void setBackDefault(String backDefault) {
    this.backDefault = backDefault;
  }

  public PokemonSpritesOtherShowdown backFemale(String backFemale) {
    this.backFemale = backFemale;
    return this;
  }

  /**
   * The URL of the female Pokémon Showdown back image, or null if unavailable.
   * @return backFemale
   */
  @ApiModelProperty(required = true, value = "The URL of the female Pokémon Showdown back image, or null if unavailable.")
  public String getBackFemale() {
    return backFemale;
  }

  public void setBackFemale(String backFemale) {
    this.backFemale = backFemale;
  }

  public PokemonSpritesOtherShowdown backShiny(String backShiny) {
    this.backShiny = backShiny;
    return this;
  }

  /**
   * The URL of the shiny Pokémon Showdown back image, or null if unavailable.
   * @return backShiny
   */
  @ApiModelProperty(required = true, value = "The URL of the shiny Pokémon Showdown back image, or null if unavailable.")
  public String getBackShiny() {
    return backShiny;
  }

  public void setBackShiny(String backShiny) {
    this.backShiny = backShiny;
  }

  public PokemonSpritesOtherShowdown backShinyFemale(String backShinyFemale) {
    this.backShinyFemale = backShinyFemale;
    return this;
  }

  /**
   * The URL of the shiny female Pokémon Showdown back image, or null if unavailable.
   * @return backShinyFemale
   */
  @ApiModelProperty(required = true, value = "The URL of the shiny female Pokémon Showdown back image, or null if unavailable.")
  public String getBackShinyFemale() {
    return backShinyFemale;
  }

  public void setBackShinyFemale(String backShinyFemale) {
    this.backShinyFemale = backShinyFemale;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonSpritesOtherShowdown pokemonSpritesOtherShowdown = (PokemonSpritesOtherShowdown) o;
    return Objects.equals(this.frontDefault, pokemonSpritesOtherShowdown.frontDefault) &&
        Objects.equals(this.frontFemale, pokemonSpritesOtherShowdown.frontFemale) &&
        Objects.equals(this.frontShiny, pokemonSpritesOtherShowdown.frontShiny) &&
        Objects.equals(this.frontShinyFemale, pokemonSpritesOtherShowdown.frontShinyFemale) &&
        Objects.equals(this.backDefault, pokemonSpritesOtherShowdown.backDefault) &&
        Objects.equals(this.backFemale, pokemonSpritesOtherShowdown.backFemale) &&
        Objects.equals(this.backShiny, pokemonSpritesOtherShowdown.backShiny) &&
        Objects.equals(this.backShinyFemale, pokemonSpritesOtherShowdown.backShinyFemale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frontDefault, frontFemale, frontShiny, frontShinyFemale, backDefault, backFemale, backShiny, backShinyFemale);
  }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

