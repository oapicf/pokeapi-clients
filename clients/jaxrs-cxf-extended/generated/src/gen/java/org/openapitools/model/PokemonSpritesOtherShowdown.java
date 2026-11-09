package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonSpritesOtherShowdown  {
  
 /**
  * The URL of the default Pokémon Showdown front image, or null if unavailable.
  */
  @ApiModelProperty(required = true, value = "The URL of the default Pokémon Showdown front image, or null if unavailable.")
  private String frontDefault;

 /**
  * The URL of the female Pokémon Showdown front image, or null if unavailable.
  */
  @ApiModelProperty(required = true, value = "The URL of the female Pokémon Showdown front image, or null if unavailable.")
  private String frontFemale;

 /**
  * The URL of the shiny Pokémon Showdown front image, or null if unavailable.
  */
  @ApiModelProperty(required = true, value = "The URL of the shiny Pokémon Showdown front image, or null if unavailable.")
  private String frontShiny;

 /**
  * The URL of the shiny female Pokémon Showdown front image, or null if unavailable.
  */
  @ApiModelProperty(required = true, value = "The URL of the shiny female Pokémon Showdown front image, or null if unavailable.")
  private String frontShinyFemale;

 /**
  * The URL of the default Pokémon Showdown back image, or null if unavailable.
  */
  @ApiModelProperty(required = true, value = "The URL of the default Pokémon Showdown back image, or null if unavailable.")
  private String backDefault;

 /**
  * The URL of the female Pokémon Showdown back image, or null if unavailable.
  */
  @ApiModelProperty(required = true, value = "The URL of the female Pokémon Showdown back image, or null if unavailable.")
  private String backFemale;

 /**
  * The URL of the shiny Pokémon Showdown back image, or null if unavailable.
  */
  @ApiModelProperty(required = true, value = "The URL of the shiny Pokémon Showdown back image, or null if unavailable.")
  private String backShiny;

 /**
  * The URL of the shiny female Pokémon Showdown back image, or null if unavailable.
  */
  @ApiModelProperty(required = true, value = "The URL of the shiny female Pokémon Showdown back image, or null if unavailable.")
  private String backShinyFemale;
 /**
  * The URL of the default Pokémon Showdown front image, or null if unavailable.
  * @return frontDefault
  */
  @JsonProperty("front_default")
  @NotNull
  public String getFrontDefault() {
    return frontDefault;
  }

  /**
   * Sets the <code>frontDefault</code> property.
   */
 public void setFrontDefault(String frontDefault) {
    this.frontDefault = frontDefault;
  }

  /**
   * Sets the <code>frontDefault</code> property.
   */
  public PokemonSpritesOtherShowdown frontDefault(String frontDefault) {
    this.frontDefault = frontDefault;
    return this;
  }

 /**
  * The URL of the female Pokémon Showdown front image, or null if unavailable.
  * @return frontFemale
  */
  @JsonProperty("front_female")
  @NotNull
  public String getFrontFemale() {
    return frontFemale;
  }

  /**
   * Sets the <code>frontFemale</code> property.
   */
 public void setFrontFemale(String frontFemale) {
    this.frontFemale = frontFemale;
  }

  /**
   * Sets the <code>frontFemale</code> property.
   */
  public PokemonSpritesOtherShowdown frontFemale(String frontFemale) {
    this.frontFemale = frontFemale;
    return this;
  }

 /**
  * The URL of the shiny Pokémon Showdown front image, or null if unavailable.
  * @return frontShiny
  */
  @JsonProperty("front_shiny")
  @NotNull
  public String getFrontShiny() {
    return frontShiny;
  }

  /**
   * Sets the <code>frontShiny</code> property.
   */
 public void setFrontShiny(String frontShiny) {
    this.frontShiny = frontShiny;
  }

  /**
   * Sets the <code>frontShiny</code> property.
   */
  public PokemonSpritesOtherShowdown frontShiny(String frontShiny) {
    this.frontShiny = frontShiny;
    return this;
  }

 /**
  * The URL of the shiny female Pokémon Showdown front image, or null if unavailable.
  * @return frontShinyFemale
  */
  @JsonProperty("front_shiny_female")
  @NotNull
  public String getFrontShinyFemale() {
    return frontShinyFemale;
  }

  /**
   * Sets the <code>frontShinyFemale</code> property.
   */
 public void setFrontShinyFemale(String frontShinyFemale) {
    this.frontShinyFemale = frontShinyFemale;
  }

  /**
   * Sets the <code>frontShinyFemale</code> property.
   */
  public PokemonSpritesOtherShowdown frontShinyFemale(String frontShinyFemale) {
    this.frontShinyFemale = frontShinyFemale;
    return this;
  }

 /**
  * The URL of the default Pokémon Showdown back image, or null if unavailable.
  * @return backDefault
  */
  @JsonProperty("back_default")
  @NotNull
  public String getBackDefault() {
    return backDefault;
  }

  /**
   * Sets the <code>backDefault</code> property.
   */
 public void setBackDefault(String backDefault) {
    this.backDefault = backDefault;
  }

  /**
   * Sets the <code>backDefault</code> property.
   */
  public PokemonSpritesOtherShowdown backDefault(String backDefault) {
    this.backDefault = backDefault;
    return this;
  }

 /**
  * The URL of the female Pokémon Showdown back image, or null if unavailable.
  * @return backFemale
  */
  @JsonProperty("back_female")
  @NotNull
  public String getBackFemale() {
    return backFemale;
  }

  /**
   * Sets the <code>backFemale</code> property.
   */
 public void setBackFemale(String backFemale) {
    this.backFemale = backFemale;
  }

  /**
   * Sets the <code>backFemale</code> property.
   */
  public PokemonSpritesOtherShowdown backFemale(String backFemale) {
    this.backFemale = backFemale;
    return this;
  }

 /**
  * The URL of the shiny Pokémon Showdown back image, or null if unavailable.
  * @return backShiny
  */
  @JsonProperty("back_shiny")
  @NotNull
  public String getBackShiny() {
    return backShiny;
  }

  /**
   * Sets the <code>backShiny</code> property.
   */
 public void setBackShiny(String backShiny) {
    this.backShiny = backShiny;
  }

  /**
   * Sets the <code>backShiny</code> property.
   */
  public PokemonSpritesOtherShowdown backShiny(String backShiny) {
    this.backShiny = backShiny;
    return this;
  }

 /**
  * The URL of the shiny female Pokémon Showdown back image, or null if unavailable.
  * @return backShinyFemale
  */
  @JsonProperty("back_shiny_female")
  @NotNull
  public String getBackShinyFemale() {
    return backShinyFemale;
  }

  /**
   * Sets the <code>backShinyFemale</code> property.
   */
 public void setBackShinyFemale(String backShinyFemale) {
    this.backShinyFemale = backShinyFemale;
  }

  /**
   * Sets the <code>backShinyFemale</code> property.
   */
  public PokemonSpritesOtherShowdown backShinyFemale(String backShinyFemale) {
    this.backShinyFemale = backShinyFemale;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

