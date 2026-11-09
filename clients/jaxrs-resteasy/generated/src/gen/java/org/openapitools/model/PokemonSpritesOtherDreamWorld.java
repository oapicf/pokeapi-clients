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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-11-09T13:50:00.159999817Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonSpritesOtherDreamWorld   {
  
  private String frontDefault;
  private String frontFemale;

  /**
   * The URL of the default Pokémon Dream World front image, or null if unavailable.
   **/
  
  @ApiModelProperty(required = true, value = "The URL of the default Pokémon Dream World front image, or null if unavailable.")
  @JsonProperty("front_default")
  @NotNull
  public String getFrontDefault() {
    return frontDefault;
  }
  public void setFrontDefault(String frontDefault) {
    this.frontDefault = frontDefault;
  }

  /**
   * The URL of the female Pokémon Dream World front image, or null if unavailable.
   **/
  
  @ApiModelProperty(required = true, value = "The URL of the female Pokémon Dream World front image, or null if unavailable.")
  @JsonProperty("front_female")
  @NotNull
  public String getFrontFemale() {
    return frontFemale;
  }
  public void setFrontFemale(String frontFemale) {
    this.frontFemale = frontFemale;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

