package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("PokemonSpritesOtherHome")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-11-09T13:50:06.168269698Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonSpritesOtherHome   {
  private String frontDefault;
  private String frontFemale;
  private String frontShiny;
  private String frontShinyFemale;

  public PokemonSpritesOtherHome() {
  }

  @JsonCreator
  public PokemonSpritesOtherHome(
    @JsonProperty(required = true, value = "front_default") String frontDefault,
    @JsonProperty(required = true, value = "front_female") String frontFemale,
    @JsonProperty(required = true, value = "front_shiny") String frontShiny,
    @JsonProperty(required = true, value = "front_shiny_female") String frontShinyFemale
  ) {
    this.frontDefault = frontDefault;
    this.frontFemale = frontFemale;
    this.frontShiny = frontShiny;
    this.frontShinyFemale = frontShinyFemale;
  }

  /**
   * The URL of the default Pokémon HOME front image, or null if unavailable.
   **/
  public PokemonSpritesOtherHome frontDefault(String frontDefault) {
    this.frontDefault = frontDefault;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The URL of the default Pokémon HOME front image, or null if unavailable.")
  @JsonProperty(required = true, value = "front_default")
  @NotNull public String getFrontDefault() {
    return frontDefault;
  }

  @JsonProperty(required = true, value = "front_default")
  public void setFrontDefault(String frontDefault) {
    this.frontDefault = frontDefault;
  }

  /**
   * The URL of the female Pokémon HOME front image, or null if unavailable.
   **/
  public PokemonSpritesOtherHome frontFemale(String frontFemale) {
    this.frontFemale = frontFemale;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The URL of the female Pokémon HOME front image, or null if unavailable.")
  @JsonProperty(required = true, value = "front_female")
  @NotNull public String getFrontFemale() {
    return frontFemale;
  }

  @JsonProperty(required = true, value = "front_female")
  public void setFrontFemale(String frontFemale) {
    this.frontFemale = frontFemale;
  }

  /**
   * The URL of the shiny Pokémon HOME front image, or null if unavailable.
   **/
  public PokemonSpritesOtherHome frontShiny(String frontShiny) {
    this.frontShiny = frontShiny;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The URL of the shiny Pokémon HOME front image, or null if unavailable.")
  @JsonProperty(required = true, value = "front_shiny")
  @NotNull public String getFrontShiny() {
    return frontShiny;
  }

  @JsonProperty(required = true, value = "front_shiny")
  public void setFrontShiny(String frontShiny) {
    this.frontShiny = frontShiny;
  }

  /**
   * The URL of the shiny female Pokémon HOME front image, or null if unavailable.
   **/
  public PokemonSpritesOtherHome frontShinyFemale(String frontShinyFemale) {
    this.frontShinyFemale = frontShinyFemale;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The URL of the shiny female Pokémon HOME front image, or null if unavailable.")
  @JsonProperty(required = true, value = "front_shiny_female")
  @NotNull public String getFrontShinyFemale() {
    return frontShinyFemale;
  }

  @JsonProperty(required = true, value = "front_shiny_female")
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
