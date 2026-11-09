package org.openapitools.model;

import org.openapitools.model.AnyType;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class PokemonSpritesOtherOfficialArtwork implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The URL of the default front official artwork, or null if unavailable.
   */
  @JsonProperty("front_default")
  private String frontDefault;

  /**
   * The URL of the shiny front official artwork, or null if unavailable.
   */
  @JsonProperty("front_shiny")
  private String frontShiny;

  /**
   * Additional official artwork grouped by version. Available keys vary by resource.
   */
  @JsonProperty("versions")
  private Map<String, Map<String, AnyType>> versions = new HashMap<>();

  /**
   * The URL of the default front official artwork, or null if unavailable.
   * @return frontDefault
   */
  public String getFrontDefault() {
    return frontDefault;
  }

  public void setFrontDefault(String frontDefault) {
    this.frontDefault = frontDefault;
  }

  /**
   * The URL of the shiny front official artwork, or null if unavailable.
   * @return frontShiny
   */
  public String getFrontShiny() {
    return frontShiny;
  }

  public void setFrontShiny(String frontShiny) {
    this.frontShiny = frontShiny;
  }

  /**
   * Additional official artwork grouped by version. Available keys vary by resource.
   * @return versions
   */
  public Map<String, Map<String, AnyType>> getVersions() {
    return versions;
  }

  public void setVersions(Map<String, Map<String, AnyType>> versions) {
    this.versions = versions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonSpritesOtherOfficialArtwork pokemonSpritesOtherOfficialArtwork = (PokemonSpritesOtherOfficialArtwork) o;
    return Objects.equals(this.frontDefault, pokemonSpritesOtherOfficialArtwork.frontDefault) &&
        Objects.equals(this.frontShiny, pokemonSpritesOtherOfficialArtwork.frontShiny) &&
        Objects.equals(this.versions, pokemonSpritesOtherOfficialArtwork.versions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frontDefault, frontShiny, versions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonSpritesOtherOfficialArtwork {\n");
    
    sb.append("    frontDefault: ").append(toIndentedString(frontDefault)).append("\n");
    sb.append("    frontShiny: ").append(toIndentedString(frontShiny)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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
