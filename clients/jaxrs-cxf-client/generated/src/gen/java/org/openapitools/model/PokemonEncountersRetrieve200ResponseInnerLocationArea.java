package org.openapitools.model;

import java.net.URI;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonEncountersRetrieve200ResponseInnerLocationArea  {
  
  @ApiModelProperty(example = "cerulean-city-area", required = true, value = "")

  private String name;

  @ApiModelProperty(example = "https://pokeapi.co/api/v2/location-area/281/", required = true, value = "")

  private URI url;
 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PokemonEncountersRetrieve200ResponseInnerLocationArea name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get url
   * @return url
  **/
  @JsonProperty("url")
  public URI getUrl() {
    return url;
  }

  public void setUrl(URI url) {
    this.url = url;
  }

  public PokemonEncountersRetrieve200ResponseInnerLocationArea url(URI url) {
    this.url = url;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

