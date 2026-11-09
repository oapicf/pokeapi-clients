package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonSpritesOtherDreamWorld  {
  
 /**
  * The URL of the default Pokémon Dream World front image, or null if unavailable.
  */
  @ApiModelProperty(required = true, value = "The URL of the default Pokémon Dream World front image, or null if unavailable.")

  private String frontDefault;

 /**
  * The URL of the female Pokémon Dream World front image, or null if unavailable.
  */
  @ApiModelProperty(required = true, value = "The URL of the female Pokémon Dream World front image, or null if unavailable.")

  private String frontFemale;
 /**
   * The URL of the default Pokémon Dream World front image, or null if unavailable.
   * @return frontDefault
  **/
  @JsonProperty("front_default")
  @NotNull
  public String getFrontDefault() {
    return frontDefault;
  }

  public void setFrontDefault(String frontDefault) {
    this.frontDefault = frontDefault;
  }

  public PokemonSpritesOtherDreamWorld frontDefault(String frontDefault) {
    this.frontDefault = frontDefault;
    return this;
  }

 /**
   * The URL of the female Pokémon Dream World front image, or null if unavailable.
   * @return frontFemale
  **/
  @JsonProperty("front_female")
  @NotNull
  public String getFrontFemale() {
    return frontFemale;
  }

  public void setFrontFemale(String frontFemale) {
    this.frontFemale = frontFemale;
  }

  public PokemonSpritesOtherDreamWorld frontFemale(String frontFemale) {
    this.frontFemale = frontFemale;
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
    PokemonSpritesOtherDreamWorld pokemonSpritesOtherDreamWorld = (PokemonSpritesOtherDreamWorld) o;
    return Objects.equals(this.frontDefault, pokemonSpritesOtherDreamWorld.frontDefault) &&
        Objects.equals(this.frontFemale, pokemonSpritesOtherDreamWorld.frontFemale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frontDefault, frontFemale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonSpritesOtherDreamWorld {\n");
    
    sb.append("    frontDefault: ").append(toIndentedString(frontDefault)).append("\n");
    sb.append("    frontFemale: ").append(toIndentedString(frontFemale)).append("\n");
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

