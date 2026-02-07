package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-07T04:17:47.675703185Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokemonShapeDetailNamesInner   {
  
  private URI url;
  private String name;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("url")
  @NotNull
  public URI getUrl() {
    return url;
  }
  public void setUrl(URI url) {
    this.url = url;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  @NotNull
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

