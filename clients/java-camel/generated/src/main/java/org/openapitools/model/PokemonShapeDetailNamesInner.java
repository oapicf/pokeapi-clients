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
 * PokemonShapeDetailNamesInner
 */

@JsonTypeName("PokemonShapeDetail_names_inner")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-02-07T04:17:25.266083787Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokemonShapeDetailNamesInner {

  private URI url;

  private String name;

  public PokemonShapeDetailNamesInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PokemonShapeDetailNamesInner(URI url, String name) {
    this.url = url;
    this.name = name;
  }

  public PokemonShapeDetailNamesInner url(URI url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
   */
  @NotNull @Valid 
  @Schema(name = "url", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("url")
  public URI getUrl() {
    return url;
  }

  public void setUrl(URI url) {
    this.url = url;
  }

  public PokemonShapeDetailNamesInner name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @NotNull 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonShapeDetailNamesInner pokemonShapeDetailNamesInner = (PokemonShapeDetailNamesInner) o;
    return Objects.equals(this.url, pokemonShapeDetailNamesInner.url) &&
        Objects.equals(this.name, pokemonShapeDetailNamesInner.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonShapeDetailNamesInner {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

