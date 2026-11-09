package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * PokemonSpritesOtherOfficialArtwork
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-11-09T13:49:28.343088631Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonSpritesOtherOfficialArtwork   {
  @JsonProperty("front_default")
  private String frontDefault;

  @JsonProperty("front_shiny")
  private String frontShiny;

  @JsonProperty("versions")
  
  private Map<String, Map<String, Object>> versions = null;

  public PokemonSpritesOtherOfficialArtwork frontDefault(String frontDefault) {
    this.frontDefault = frontDefault;
    return this;
  }

  /**
   * The URL of the default front official artwork, or null if unavailable.
   * @return frontDefault
   */
  @ApiModelProperty(required = true, value = "The URL of the default front official artwork, or null if unavailable.")
  public String getFrontDefault() {
    return frontDefault;
  }

  public void setFrontDefault(String frontDefault) {
    this.frontDefault = frontDefault;
  }

  public PokemonSpritesOtherOfficialArtwork frontShiny(String frontShiny) {
    this.frontShiny = frontShiny;
    return this;
  }

  /**
   * The URL of the shiny front official artwork, or null if unavailable.
   * @return frontShiny
   */
  @ApiModelProperty(required = true, value = "The URL of the shiny front official artwork, or null if unavailable.")
  public String getFrontShiny() {
    return frontShiny;
  }

  public void setFrontShiny(String frontShiny) {
    this.frontShiny = frontShiny;
  }

  public PokemonSpritesOtherOfficialArtwork versions(Map<String, Map<String, Object>> versions) {
    this.versions = versions;
    return this;
  }

  public PokemonSpritesOtherOfficialArtwork putVersionsItem(String key, Map<String, Object> versionsItem) {
    if (this.versions == null) {
      this.versions = new HashMap<>();
    }
    this.versions.put(key, versionsItem);
    return this;
  }

  /**
   * Additional official artwork grouped by version. Available keys vary by resource.
   * @return versions
   */
  @ApiModelProperty(value = "Additional official artwork grouped by version. Available keys vary by resource.")
  public Map<String, Map<String, Object>> getVersions() {
    return versions;
  }

  public void setVersions(Map<String, Map<String, Object>> versions) {
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

