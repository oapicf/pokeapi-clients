package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonSpritesOtherHome  {
  
 /**
  * The URL of the default Pokémon HOME front image, or null if unavailable.
  */
  @ApiModelProperty(required = true, value = "The URL of the default Pokémon HOME front image, or null if unavailable.")

  private String frontDefault;

 /**
  * The URL of the female Pokémon HOME front image, or null if unavailable.
  */
  @ApiModelProperty(required = true, value = "The URL of the female Pokémon HOME front image, or null if unavailable.")

  private String frontFemale;

 /**
  * The URL of the shiny Pokémon HOME front image, or null if unavailable.
  */
  @ApiModelProperty(required = true, value = "The URL of the shiny Pokémon HOME front image, or null if unavailable.")

  private String frontShiny;

 /**
  * The URL of the shiny female Pokémon HOME front image, or null if unavailable.
  */
  @ApiModelProperty(required = true, value = "The URL of the shiny female Pokémon HOME front image, or null if unavailable.")

  private String frontShinyFemale;
 /**
   * The URL of the default Pokémon HOME front image, or null if unavailable.
   * @return frontDefault
  **/
  @JsonProperty("front_default")
  public String getFrontDefault() {
    return frontDefault;
  }

  public void setFrontDefault(String frontDefault) {
    this.frontDefault = frontDefault;
  }

  public PokemonSpritesOtherHome frontDefault(String frontDefault) {
    this.frontDefault = frontDefault;
    return this;
  }

 /**
   * The URL of the female Pokémon HOME front image, or null if unavailable.
   * @return frontFemale
  **/
  @JsonProperty("front_female")
  public String getFrontFemale() {
    return frontFemale;
  }

  public void setFrontFemale(String frontFemale) {
    this.frontFemale = frontFemale;
  }

  public PokemonSpritesOtherHome frontFemale(String frontFemale) {
    this.frontFemale = frontFemale;
    return this;
  }

 /**
   * The URL of the shiny Pokémon HOME front image, or null if unavailable.
   * @return frontShiny
  **/
  @JsonProperty("front_shiny")
  public String getFrontShiny() {
    return frontShiny;
  }

  public void setFrontShiny(String frontShiny) {
    this.frontShiny = frontShiny;
  }

  public PokemonSpritesOtherHome frontShiny(String frontShiny) {
    this.frontShiny = frontShiny;
    return this;
  }

 /**
   * The URL of the shiny female Pokémon HOME front image, or null if unavailable.
   * @return frontShinyFemale
  **/
  @JsonProperty("front_shiny_female")
  public String getFrontShinyFemale() {
    return frontShinyFemale;
  }

  public void setFrontShinyFemale(String frontShinyFemale) {
    this.frontShinyFemale = frontShinyFemale;
  }

  public PokemonSpritesOtherHome frontShinyFemale(String frontShinyFemale) {
    this.frontShinyFemale = frontShinyFemale;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

