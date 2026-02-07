package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonShapeDetailNamesInner  {
  
  @ApiModelProperty(required = true, value = "")

  private URI url;

  @ApiModelProperty(required = true, value = "")

  private String name;
 /**
   * Get url
   * @return url
  **/
  @JsonProperty("url")
  @NotNull
  public URI getUrl() {
    return url;
  }

  public void setUrl(URI url) {
    this.url = url;
  }

  public PokemonShapeDetailNamesInner url(URI url) {
    this.url = url;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PokemonShapeDetailNamesInner name(String name) {
    this.name = name;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

