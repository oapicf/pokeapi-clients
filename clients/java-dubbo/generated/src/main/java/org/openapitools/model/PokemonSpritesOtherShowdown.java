package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class PokemonSpritesOtherShowdown implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The URL of the default Pokémon Showdown front image, or null if unavailable.
   */
  @JsonProperty("front_default")
  private String frontDefault;

  /**
   * The URL of the female Pokémon Showdown front image, or null if unavailable.
   */
  @JsonProperty("front_female")
  private String frontFemale;

  /**
   * The URL of the shiny Pokémon Showdown front image, or null if unavailable.
   */
  @JsonProperty("front_shiny")
  private String frontShiny;

  /**
   * The URL of the shiny female Pokémon Showdown front image, or null if unavailable.
   */
  @JsonProperty("front_shiny_female")
  private String frontShinyFemale;

  /**
   * The URL of the default Pokémon Showdown back image, or null if unavailable.
   */
  @JsonProperty("back_default")
  private String backDefault;

  /**
   * The URL of the female Pokémon Showdown back image, or null if unavailable.
   */
  @JsonProperty("back_female")
  private String backFemale;

  /**
   * The URL of the shiny Pokémon Showdown back image, or null if unavailable.
   */
  @JsonProperty("back_shiny")
  private String backShiny;

  /**
   * The URL of the shiny female Pokémon Showdown back image, or null if unavailable.
   */
  @JsonProperty("back_shiny_female")
  private String backShinyFemale;

  /**
   * The URL of the default Pokémon Showdown front image, or null if unavailable.
   * @return frontDefault
   */
  public String getFrontDefault() {
    return frontDefault;
  }

  public void setFrontDefault(String frontDefault) {
    this.frontDefault = frontDefault;
  }

  /**
   * The URL of the female Pokémon Showdown front image, or null if unavailable.
   * @return frontFemale
   */
  public String getFrontFemale() {
    return frontFemale;
  }

  public void setFrontFemale(String frontFemale) {
    this.frontFemale = frontFemale;
  }

  /**
   * The URL of the shiny Pokémon Showdown front image, or null if unavailable.
   * @return frontShiny
   */
  public String getFrontShiny() {
    return frontShiny;
  }

  public void setFrontShiny(String frontShiny) {
    this.frontShiny = frontShiny;
  }

  /**
   * The URL of the shiny female Pokémon Showdown front image, or null if unavailable.
   * @return frontShinyFemale
   */
  public String getFrontShinyFemale() {
    return frontShinyFemale;
  }

  public void setFrontShinyFemale(String frontShinyFemale) {
    this.frontShinyFemale = frontShinyFemale;
  }

  /**
   * The URL of the default Pokémon Showdown back image, or null if unavailable.
   * @return backDefault
   */
  public String getBackDefault() {
    return backDefault;
  }

  public void setBackDefault(String backDefault) {
    this.backDefault = backDefault;
  }

  /**
   * The URL of the female Pokémon Showdown back image, or null if unavailable.
   * @return backFemale
   */
  public String getBackFemale() {
    return backFemale;
  }

  public void setBackFemale(String backFemale) {
    this.backFemale = backFemale;
  }

  /**
   * The URL of the shiny Pokémon Showdown back image, or null if unavailable.
   * @return backShiny
   */
  public String getBackShiny() {
    return backShiny;
  }

  public void setBackShiny(String backShiny) {
    this.backShiny = backShiny;
  }

  /**
   * The URL of the shiny female Pokémon Showdown back image, or null if unavailable.
   * @return backShinyFemale
   */
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
