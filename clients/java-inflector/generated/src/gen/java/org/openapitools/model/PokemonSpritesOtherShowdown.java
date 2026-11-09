package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-11-09T13:49:15.621225368Z[Etc/UTC]", comments = "Generator version: 7.26.0")
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

  /**
   * The URL of the default Pokémon Showdown front image, or null if unavailable.
   **/
  public PokemonSpritesOtherShowdown frontDefault(String frontDefault) {
    this.frontDefault = frontDefault;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The URL of the default Pokémon Showdown front image, or null if unavailable.")
  @JsonProperty("front_default")
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
    return Objects.equals(frontDefault, pokemonSpritesOtherShowdown.frontDefault) &&
        Objects.equals(frontFemale, pokemonSpritesOtherShowdown.frontFemale) &&
        Objects.equals(frontShiny, pokemonSpritesOtherShowdown.frontShiny) &&
        Objects.equals(frontShinyFemale, pokemonSpritesOtherShowdown.frontShinyFemale) &&
        Objects.equals(backDefault, pokemonSpritesOtherShowdown.backDefault) &&
        Objects.equals(backFemale, pokemonSpritesOtherShowdown.backFemale) &&
        Objects.equals(backShiny, pokemonSpritesOtherShowdown.backShiny) &&
        Objects.equals(backShinyFemale, pokemonSpritesOtherShowdown.backShinyFemale);
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

