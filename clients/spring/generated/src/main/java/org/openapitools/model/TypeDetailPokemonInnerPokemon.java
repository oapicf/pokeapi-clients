package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TypeDetailPokemonInnerPokemon
 */

@JsonTypeName("TypeDetail_pokemon_inner_pokemon")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-07T04:22:27.168374474Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class TypeDetailPokemonInnerPokemon {

  private @Nullable String name;

  private @Nullable URI url;

  public TypeDetailPokemonInnerPokemon name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the pokemon
   * @return name
   */
  
  @Schema(name = "name", description = "The name of the pokemon", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public TypeDetailPokemonInnerPokemon url(@Nullable URI url) {
    this.url = url;
    return this;
  }

  /**
   * The URL to get more information about the pokemon
   * @return url
   */
  @Valid 
  @Schema(name = "url", description = "The URL to get more information about the pokemon", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url")
  public @Nullable URI getUrl() {
    return url;
  }

  public void setUrl(@Nullable URI url) {
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
    TypeDetailPokemonInnerPokemon typeDetailPokemonInnerPokemon = (TypeDetailPokemonInnerPokemon) o;
    return Objects.equals(this.name, typeDetailPokemonInnerPokemon.name) &&
        Objects.equals(this.url, typeDetailPokemonInnerPokemon.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeDetailPokemonInnerPokemon {\n");
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

