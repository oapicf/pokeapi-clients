package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-11-09T13:50:03.149615362Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonSpritesOtherHome   {
  
  private String frontDefault;
  private String frontFemale;
  private String frontShiny;
  private String frontShinyFemale;

  /**
   * The URL of the default Pokémon HOME front image, or null if unavailable.
   **/
  
  @ApiModelProperty(required = true, value = "The URL of the default Pokémon HOME front image, or null if unavailable.")
  @JsonProperty("front_default")
  @NotNull
  public String getFrontDefault() {
    return frontDefault;
  }
  public void setFrontDefault(String frontDefault) {
    this.frontDefault = frontDefault;
  }

  /**
   * The URL of the female Pokémon HOME front image, or null if unavailable.
   **/
  
  @ApiModelProperty(required = true, value = "The URL of the female Pokémon HOME front image, or null if unavailable.")
  @JsonProperty("front_female")
  @NotNull
  public String getFrontFemale() {
    return frontFemale;
  }
  public void setFrontFemale(String frontFemale) {
    this.frontFemale = frontFemale;
  }

  /**
   * The URL of the shiny Pokémon HOME front image, or null if unavailable.
   **/
  
  @ApiModelProperty(required = true, value = "The URL of the shiny Pokémon HOME front image, or null if unavailable.")
  @JsonProperty("front_shiny")
  @NotNull
  public String getFrontShiny() {
    return frontShiny;
  }
  public void setFrontShiny(String frontShiny) {
    this.frontShiny = frontShiny;
  }

  /**
   * The URL of the shiny female Pokémon HOME front image, or null if unavailable.
   **/
  
  @ApiModelProperty(required = true, value = "The URL of the shiny female Pokémon HOME front image, or null if unavailable.")
  @JsonProperty("front_shiny_female")
  @NotNull
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

