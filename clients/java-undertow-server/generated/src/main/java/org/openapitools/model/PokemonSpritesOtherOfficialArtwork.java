/*
 * PokéAPI
 *
 * All the Pokémon data you'll ever need in one place, easily accessible through a modern free open-source RESTful API.  ## What is this?  This is a full RESTful API linked to an extensive database detailing everything about the Pokémon main game series.  We've covered everything from Pokémon to Berry Flavors.  ## Where do I start?  We have awesome [documentation](https://pokeapi.co/docs/v2) on how to use this API. It takes minutes to get started.  This API will always be publicly available and will never require any extensive setup process to consume.  Created by [**Paul Hallett**](https://github.com/phalt) and other [**PokéAPI contributors**](https://github.com/PokeAPI/pokeapi#contributing) around the world. Pokémon and Pokémon character names are trademarks of Nintendo.
 *
 * OpenAPI document version: 2.10.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-11-09T13:49:34.675912514Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonSpritesOtherOfficialArtwork   {
  
  private String frontDefault;
  private String frontShiny;
  private Map<String, Map<String, Object>> versions = new HashMap<>();

  /**
   * The URL of the default front official artwork, or null if unavailable.
   */
  public PokemonSpritesOtherOfficialArtwork frontDefault(String frontDefault) {
    this.frontDefault = frontDefault;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The URL of the default front official artwork, or null if unavailable.")
  @JsonProperty("front_default")
  public String getFrontDefault() {
    return frontDefault;
  }
  public void setFrontDefault(String frontDefault) {
    this.frontDefault = frontDefault;
  }

  /**
   * The URL of the shiny front official artwork, or null if unavailable.
   */
  public PokemonSpritesOtherOfficialArtwork frontShiny(String frontShiny) {
    this.frontShiny = frontShiny;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The URL of the shiny front official artwork, or null if unavailable.")
  @JsonProperty("front_shiny")
  public String getFrontShiny() {
    return frontShiny;
  }
  public void setFrontShiny(String frontShiny) {
    this.frontShiny = frontShiny;
  }

  /**
   * Additional official artwork grouped by version. Available keys vary by resource.
   */
  public PokemonSpritesOtherOfficialArtwork versions(Map<String, Map<String, Object>> versions) {
    this.versions = versions;
    return this;
  }

  
  @ApiModelProperty(value = "Additional official artwork grouped by version. Available keys vary by resource.")
  @JsonProperty("versions")
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
    return Objects.equals(frontDefault, pokemonSpritesOtherOfficialArtwork.frontDefault) &&
        Objects.equals(frontShiny, pokemonSpritesOtherOfficialArtwork.frontShiny) &&
        Objects.equals(versions, pokemonSpritesOtherOfficialArtwork.versions);
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

