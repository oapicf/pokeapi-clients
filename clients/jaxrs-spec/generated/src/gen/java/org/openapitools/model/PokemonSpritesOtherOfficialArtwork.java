package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("PokemonSpritesOtherOfficialArtwork")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-11-09T13:50:06.168269698Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonSpritesOtherOfficialArtwork   {
  private String frontDefault;
  private String frontShiny;
  private Map<String, Map<String, Object>> versions = new HashMap<>();

  public PokemonSpritesOtherOfficialArtwork() {
  }

  @JsonCreator
  public PokemonSpritesOtherOfficialArtwork(
    @JsonProperty(required = true, value = "front_default") String frontDefault,
    @JsonProperty(required = true, value = "front_shiny") String frontShiny
  ) {
    this.frontDefault = frontDefault;
    this.frontShiny = frontShiny;
  }

  /**
   * The URL of the default front official artwork, or null if unavailable.
   **/
  public PokemonSpritesOtherOfficialArtwork frontDefault(String frontDefault) {
    this.frontDefault = frontDefault;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The URL of the default front official artwork, or null if unavailable.")
  @JsonProperty(required = true, value = "front_default")
  @NotNull public String getFrontDefault() {
    return frontDefault;
  }

  @JsonProperty(required = true, value = "front_default")
  public void setFrontDefault(String frontDefault) {
    this.frontDefault = frontDefault;
  }

  /**
   * The URL of the shiny front official artwork, or null if unavailable.
   **/
  public PokemonSpritesOtherOfficialArtwork frontShiny(String frontShiny) {
    this.frontShiny = frontShiny;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The URL of the shiny front official artwork, or null if unavailable.")
  @JsonProperty(required = true, value = "front_shiny")
  @NotNull public String getFrontShiny() {
    return frontShiny;
  }

  @JsonProperty(required = true, value = "front_shiny")
  public void setFrontShiny(String frontShiny) {
    this.frontShiny = frontShiny;
  }

  /**
   * Additional official artwork grouped by version. Available keys vary by resource.
   **/
  public PokemonSpritesOtherOfficialArtwork versions(Map<String, Map<String, Object>> versions) {
    this.versions = versions;
    return this;
  }

  
  @ApiModelProperty(value = "Additional official artwork grouped by version. Available keys vary by resource.")
  @JsonProperty("versions")
  public Map<String, Map<String, Object>> getVersions() {
    return versions;
  }

  @JsonProperty("versions")
  public void setVersions(Map<String, Map<String, Object>> versions) {
    this.versions = versions;
  }

  public PokemonSpritesOtherOfficialArtwork putVersionsItem(String key, Map<String, Object> versionsItem) {
    if (this.versions == null) {
      this.versions = new HashMap<>();
    }

    this.versions.put(key, versionsItem);
    return this;
  }

  public PokemonSpritesOtherOfficialArtwork removeVersionsItem(String key) {
    if (this.versions != null) {
      this.versions.remove(key);
    }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
