package org.openapitools.model;

import java.net.URI;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class EggGroupDetailPokemonSpeciesInner  {
  
 /**
  * Pokemon species name.
  */
  @ApiModelProperty(value = "Pokemon species name.")

  private String name;

 /**
  * The URL to get more information about the species
  */
  @ApiModelProperty(value = "The URL to get more information about the species")

  private URI url;
 /**
   * Pokemon species name.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EggGroupDetailPokemonSpeciesInner name(String name) {
    this.name = name;
    return this;
  }

 /**
   * The URL to get more information about the species
   * @return url
  **/
  @JsonProperty("url")
  public URI getUrl() {
    return url;
  }

  public void setUrl(URI url) {
    this.url = url;
  }

  public EggGroupDetailPokemonSpeciesInner url(URI url) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

