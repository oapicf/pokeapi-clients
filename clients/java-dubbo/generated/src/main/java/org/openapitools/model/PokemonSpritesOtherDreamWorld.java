package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class PokemonSpritesOtherDreamWorld implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The URL of the default Pokémon Dream World front image, or null if unavailable.
   */
  @JsonProperty("front_default")
  private String frontDefault;

  /**
   * The URL of the female Pokémon Dream World front image, or null if unavailable.
   */
  @JsonProperty("front_female")
  private String frontFemale;

  /**
   * The URL of the default Pokémon Dream World front image, or null if unavailable.
   * @return frontDefault
   */
  public String getFrontDefault() {
    return frontDefault;
  }

  public void setFrontDefault(String frontDefault) {
    this.frontDefault = frontDefault;
  }

  /**
   * The URL of the female Pokémon Dream World front image, or null if unavailable.
   * @return frontFemale
   */
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
