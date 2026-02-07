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
 * PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion
 */

@JsonTypeName("pokemon_encounters_retrieve_200_response_inner_version_details_inner_version")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-02-07T04:17:25.266083787Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion {

  private String name;

  private URI url;

  public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion(String name, URI url) {
    this.name = name;
    this.url = url;
  }

  public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @NotNull 
  @Schema(name = "name", example = "red", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion url(URI url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
   */
  @NotNull @Valid 
  @Schema(name = "url", example = "https://pokeapi.co/api/v2/version/1/", requiredMode = Schema.RequiredMode.REQUIRED)
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
    PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion = (PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion) o;
    return Objects.equals(this.name, pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion.name) &&
        Objects.equals(this.url, pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion {\n");
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

