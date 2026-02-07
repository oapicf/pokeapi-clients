package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AbilityDetailPokemonInnerPokemon  {
  
  @ApiModelProperty(required = true, value = "")

  private String name;

  @ApiModelProperty(required = true, value = "")

  private URI url;
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

  public AbilityDetailPokemonInnerPokemon name(String name) {
    this.name = name;
    return this;
  }

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

  public AbilityDetailPokemonInnerPokemon url(URI url) {
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
    AbilityDetailPokemonInnerPokemon abilityDetailPokemonInnerPokemon = (AbilityDetailPokemonInnerPokemon) o;
    return Objects.equals(this.name, abilityDetailPokemonInnerPokemon.name) &&
        Objects.equals(this.url, abilityDetailPokemonInnerPokemon.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbilityDetailPokemonInnerPokemon {\n");
    
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

