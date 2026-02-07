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
 * TypeDetailPokemonInnerPokemon
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-02-07T04:17:07.396624034Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class TypeDetailPokemonInnerPokemon   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("url")
  private URI url;

  public TypeDetailPokemonInnerPokemon name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the pokemon
   * @return name
   */
  @ApiModelProperty(value = "The name of the pokemon")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TypeDetailPokemonInnerPokemon url(URI url) {
    this.url = url;
    return this;
  }

  /**
   * The URL to get more information about the pokemon
   * @return url
   */
  @ApiModelProperty(value = "The URL to get more information about the pokemon")
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

