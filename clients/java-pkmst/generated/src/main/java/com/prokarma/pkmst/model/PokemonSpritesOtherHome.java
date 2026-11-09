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
 * PokemonSpritesOtherHome
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-11-09T13:49:28.343088631Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonSpritesOtherHome   {
  @JsonProperty("front_default")
  private String frontDefault;

  @JsonProperty("front_female")
  private String frontFemale;

  @JsonProperty("front_shiny")
  private String frontShiny;

  @JsonProperty("front_shiny_female")
  private String frontShinyFemale;

  public PokemonSpritesOtherHome frontDefault(String frontDefault) {
    this.frontDefault = frontDefault;
    return this;
  }

  /**
   * The URL of the default Pokémon HOME front image, or null if unavailable.
   * @return frontDefault
   */
  @ApiModelProperty(required = true, value = "The URL of the default Pokémon HOME front image, or null if unavailable.")
  public String getFrontDefault() {
    return frontDefault;
  }

  public void setFrontDefault(String frontDefault) {
    this.frontDefault = frontDefault;
  }

  public PokemonSpritesOtherHome frontFemale(String frontFemale) {
    this.frontFemale = frontFemale;
    return this;
  }

  /**
   * The URL of the female Pokémon HOME front image, or null if unavailable.
   * @return frontFemale
   */
  @ApiModelProperty(required = true, value = "The URL of the female Pokémon HOME front image, or null if unavailable.")
  public String getFrontFemale() {
    return frontFemale;
  }

  public void setFrontFemale(String frontFemale) {
    this.frontFemale = frontFemale;
  }

  public PokemonSpritesOtherHome frontShiny(String frontShiny) {
    this.frontShiny = frontShiny;
    return this;
  }

  /**
   * The URL of the shiny Pokémon HOME front image, or null if unavailable.
   * @return frontShiny
   */
  @ApiModelProperty(required = true, value = "The URL of the shiny Pokémon HOME front image, or null if unavailable.")
  public String getFrontShiny() {
    return frontShiny;
  }

  public void setFrontShiny(String frontShiny) {
    this.frontShiny = frontShiny;
  }

  public PokemonSpritesOtherHome frontShinyFemale(String frontShinyFemale) {
    this.frontShinyFemale = frontShinyFemale;
    return this;
  }

  /**
   * The URL of the shiny female Pokémon HOME front image, or null if unavailable.
   * @return frontShinyFemale
   */
  @ApiModelProperty(required = true, value = "The URL of the shiny female Pokémon HOME front image, or null if unavailable.")
  public String getFrontShinyFemale() {
    return frontShinyFemale;
  }

  public void setFrontShinyFemale(String frontShinyFemale) {
    this.frontShinyFemale = frontShinyFemale;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonSpritesOtherHome pokemonSpritesOtherHome = (PokemonSpritesOtherHome) o;
    return Objects.equals(this.frontDefault, pokemonSpritesOtherHome.frontDefault) &&
        Objects.equals(this.frontFemale, pokemonSpritesOtherHome.frontFemale) &&
        Objects.equals(this.frontShiny, pokemonSpritesOtherHome.frontShiny) &&
        Objects.equals(this.frontShinyFemale, pokemonSpritesOtherHome.frontShinyFemale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frontDefault, frontFemale, frontShiny, frontShinyFemale);
  }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

