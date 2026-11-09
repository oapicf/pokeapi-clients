package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class PokemonSpritesOtherHome implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The URL of the default Pokémon HOME front image, or null if unavailable.
   */
  @JsonProperty("front_default")
  private String frontDefault;

  /**
   * The URL of the female Pokémon HOME front image, or null if unavailable.
   */
  @JsonProperty("front_female")
  private String frontFemale;

  /**
   * The URL of the shiny Pokémon HOME front image, or null if unavailable.
   */
  @JsonProperty("front_shiny")
  private String frontShiny;

  /**
   * The URL of the shiny female Pokémon HOME front image, or null if unavailable.
   */
  @JsonProperty("front_shiny_female")
  private String frontShinyFemale;

  /**
   * The URL of the default Pokémon HOME front image, or null if unavailable.
   * @return frontDefault
   */
  public String getFrontDefault() {
    return frontDefault;
  }

  public void setFrontDefault(String frontDefault) {
    this.frontDefault = frontDefault;
  }

  /**
   * The URL of the female Pokémon HOME front image, or null if unavailable.
   * @return frontFemale
   */
  public String getFrontFemale() {
    return frontFemale;
  }

  public void setFrontFemale(String frontFemale) {
    this.frontFemale = frontFemale;
  }

  /**
   * The URL of the shiny Pokémon HOME front image, or null if unavailable.
   * @return frontShiny
   */
  public String getFrontShiny() {
    return frontShiny;
  }

  public void setFrontShiny(String frontShiny) {
    this.frontShiny = frontShiny;
  }

  /**
   * The URL of the shiny female Pokémon HOME front image, or null if unavailable.
   * @return frontShinyFemale
   */
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
