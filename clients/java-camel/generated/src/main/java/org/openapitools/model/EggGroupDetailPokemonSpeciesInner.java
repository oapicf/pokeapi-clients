package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * EggGroupDetailPokemonSpeciesInner
 */

@JsonTypeName("EggGroupDetail_pokemon_species_inner")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-02-07T04:17:25.266083787Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class EggGroupDetailPokemonSpeciesInner {

  private String name;

  private URI url;

  public EggGroupDetailPokemonSpeciesInner name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Pokemon species name.
   * @return name
   */
  
  @Schema(name = "name", description = "Pokemon species name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EggGroupDetailPokemonSpeciesInner url(URI url) {
    this.url = url;
    return this;
  }

  /**
   * The URL to get more information about the species
   * @return url
   */
  @Valid 
  @Schema(name = "url", description = "The URL to get more information about the species", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url")
  public URI getUrl() {
    return url;
  }

  public void setUrl(URI url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EggGroupDetailPokemonSpeciesInner eggGroupDetailPokemonSpeciesInner = (EggGroupDetailPokemonSpeciesInner) o;
    return Objects.equals(this.name, eggGroupDetailPokemonSpeciesInner.name) &&
        Objects.equals(this.url, eggGroupDetailPokemonSpeciesInner.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EggGroupDetailPokemonSpeciesInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

