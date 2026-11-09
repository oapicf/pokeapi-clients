package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class PokemonSpritesOtherShowdown   {
  
  private String frontDefault;

  private String frontFemale;

  private String frontShiny;

  private String frontShinyFemale;

  private String backDefault;

  private String backFemale;

  private String backShiny;

  private String backShinyFemale;

  /**
   * The URL of the default Pokémon Showdown front image, or null if unavailable.
   **/
  public PokemonSpritesOtherShowdown frontDefault(String frontDefault) {
    this.frontDefault = frontDefault;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The URL of the default Pokémon Showdown front image, or null if unavailable.")
  @JsonProperty("front_default")
  @NotNull
  public String getFrontDefault() {
    return frontDefault;
  }
  public void setFrontDefault(String frontDefault) {
    this.frontDefault = frontDefault;
  }


  /**
   * The URL of the female Pokémon Showdown front image, or null if unavailable.
   **/
  public PokemonSpritesOtherShowdown frontFemale(String frontFemale) {
    this.frontFemale = frontFemale;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The URL of the female Pokémon Showdown front image, or null if unavailable.")
  @JsonProperty("front_female")
  @NotNull
  public String getFrontFemale() {
    return frontFemale;
  }
  public void setFrontFemale(String frontFemale) {
    this.frontFemale = frontFemale;
  }


  /**
   * The URL of the shiny Pokémon Showdown front image, or null if unavailable.
   **/
  public PokemonSpritesOtherShowdown frontShiny(String frontShiny) {
    this.frontShiny = frontShiny;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The URL of the shiny Pokémon Showdown front image, or null if unavailable.")
  @JsonProperty("front_shiny")
  @NotNull
  public String getFrontShiny() {
    return frontShiny;
  }
  public void setFrontShiny(String frontShiny) {
    this.frontShiny = frontShiny;
  }


  /**
   * The URL of the shiny female Pokémon Showdown front image, or null if unavailable.
   **/
  public PokemonSpritesOtherShowdown frontShinyFemale(String frontShinyFemale) {
    this.frontShinyFemale = frontShinyFemale;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The URL of the shiny female Pokémon Showdown front image, or null if unavailable.")
  @JsonProperty("front_shiny_female")
  @NotNull
  public String getFrontShinyFemale() {
    return frontShinyFemale;
  }
  public void setFrontShinyFemale(String frontShinyFemale) {
    this.frontShinyFemale = frontShinyFemale;
  }


  /**
   * The URL of the default Pokémon Showdown back image, or null if unavailable.
   **/
  public PokemonSpritesOtherShowdown backDefault(String backDefault) {
    this.backDefault = backDefault;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The URL of the default Pokémon Showdown back image, or null if unavailable.")
  @JsonProperty("back_default")
  @NotNull
  public String getBackDefault() {
    return backDefault;
  }
  public void setBackDefault(String backDefault) {
    this.backDefault = backDefault;
  }


  /**
   * The URL of the female Pokémon Showdown back image, or null if unavailable.
   **/
  public PokemonSpritesOtherShowdown backFemale(String backFemale) {
    this.backFemale = backFemale;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The URL of the female Pokémon Showdown back image, or null if unavailable.")
  @JsonProperty("back_female")
  @NotNull
  public String getBackFemale() {
    return backFemale;
  }
  public void setBackFemale(String backFemale) {
    this.backFemale = backFemale;
  }


  /**
   * The URL of the shiny Pokémon Showdown back image, or null if unavailable.
   **/
  public PokemonSpritesOtherShowdown backShiny(String backShiny) {
    this.backShiny = backShiny;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The URL of the shiny Pokémon Showdown back image, or null if unavailable.")
  @JsonProperty("back_shiny")
  @NotNull
  public String getBackShiny() {
    return backShiny;
  }
  public void setBackShiny(String backShiny) {
    this.backShiny = backShiny;
  }


  /**
   * The URL of the shiny female Pokémon Showdown back image, or null if unavailable.
   **/
  public PokemonSpritesOtherShowdown backShinyFemale(String backShinyFemale) {
    this.backShinyFemale = backShinyFemale;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The URL of the shiny female Pokémon Showdown back image, or null if unavailable.")
  @JsonProperty("back_shiny_female")
  @NotNull
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

