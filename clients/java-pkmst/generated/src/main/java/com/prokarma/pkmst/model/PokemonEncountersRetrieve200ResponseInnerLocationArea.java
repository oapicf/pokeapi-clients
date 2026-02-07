package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * PokemonEncountersRetrieve200ResponseInnerLocationArea
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-02-07T04:17:07.396624034Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokemonEncountersRetrieve200ResponseInnerLocationArea   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("url")
  private URI url;

  public PokemonEncountersRetrieve200ResponseInnerLocationArea name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @ApiModelProperty(example = "cerulean-city-area", required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PokemonEncountersRetrieve200ResponseInnerLocationArea url(URI url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
   */
  @ApiModelProperty(example = "https://pokeapi.co/api/v2/location-area/281/", required = true, value = "")
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
    PokemonEncountersRetrieve200ResponseInnerLocationArea pokemonEncountersRetrieve200ResponseInnerLocationArea = (PokemonEncountersRetrieve200ResponseInnerLocationArea) o;
    return Objects.equals(this.name, pokemonEncountersRetrieve200ResponseInnerLocationArea.name) &&
        Objects.equals(this.url, pokemonEncountersRetrieve200ResponseInnerLocationArea.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonEncountersRetrieve200ResponseInnerLocationArea {\n");
    
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

