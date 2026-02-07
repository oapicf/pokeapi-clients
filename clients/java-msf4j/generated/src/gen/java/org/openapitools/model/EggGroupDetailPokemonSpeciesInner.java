package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;

/**
 * EggGroupDetailPokemonSpeciesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-02-07T04:17:01.559585484Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class EggGroupDetailPokemonSpeciesInner   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("url")
  private URI url;

  public EggGroupDetailPokemonSpeciesInner name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Pokemon species name.
   * @return name
  **/
  @ApiModelProperty(value = "Pokemon species name.")
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
  **/
  @ApiModelProperty(value = "The URL to get more information about the species")
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

