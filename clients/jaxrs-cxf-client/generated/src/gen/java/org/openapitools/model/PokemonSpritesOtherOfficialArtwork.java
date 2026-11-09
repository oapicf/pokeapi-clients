package org.openapitools.model;

import java.util.HashMap;
import java.util.Map;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonSpritesOtherOfficialArtwork  {
  
 /**
  * The URL of the default front official artwork, or null if unavailable.
  */
  @ApiModelProperty(required = true, value = "The URL of the default front official artwork, or null if unavailable.")

  private String frontDefault;

 /**
  * The URL of the shiny front official artwork, or null if unavailable.
  */
  @ApiModelProperty(required = true, value = "The URL of the shiny front official artwork, or null if unavailable.")

  private String frontShiny;

 /**
  * Additional official artwork grouped by version. Available keys vary by resource.
  */
  @ApiModelProperty(value = "Additional official artwork grouped by version. Available keys vary by resource.")

  private Map<String, Map<String, Object>> versions = new HashMap<>();
 /**
   * The URL of the default front official artwork, or null if unavailable.
   * @return frontDefault
  **/
  @JsonProperty("front_default")
  public String getFrontDefault() {
    return frontDefault;
  }

  public void setFrontDefault(String frontDefault) {
    this.frontDefault = frontDefault;
  }

  public PokemonSpritesOtherOfficialArtwork frontDefault(String frontDefault) {
    this.frontDefault = frontDefault;
    return this;
  }

 /**
   * The URL of the shiny front official artwork, or null if unavailable.
   * @return frontShiny
  **/
  @JsonProperty("front_shiny")
  public String getFrontShiny() {
    return frontShiny;
  }

  public void setFrontShiny(String frontShiny) {
    this.frontShiny = frontShiny;
  }

  public PokemonSpritesOtherOfficialArtwork frontShiny(String frontShiny) {
    this.frontShiny = frontShiny;
    return this;
  }

 /**
   * Additional official artwork grouped by version. Available keys vary by resource.
   * @return versions
  **/
  @JsonProperty("versions")
  public Map<String, Map<String, Object>> getVersions() {
    return versions;
  }

  public void setVersions(Map<String, Map<String, Object>> versions) {
    this.versions = versions;
  }

  public PokemonSpritesOtherOfficialArtwork versions(Map<String, Map<String, Object>> versions) {
    this.versions = versions;
    return this;
  }

  public PokemonSpritesOtherOfficialArtwork putVersionsItem(String key, Map<String, Object> versionsItem) {
    this.versions.put(key, versionsItem);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

