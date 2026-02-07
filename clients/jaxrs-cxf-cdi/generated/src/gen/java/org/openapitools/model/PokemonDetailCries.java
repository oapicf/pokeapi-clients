package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class PokemonDetailCries   {
  
  private URI latest;

  private URI legacy;

  /**
   **/
  public PokemonDetailCries latest(URI latest) {
    this.latest = latest;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("latest")
  @NotNull
  public URI getLatest() {
    return latest;
  }
  public void setLatest(URI latest) {
    this.latest = latest;
  }


  /**
   **/
  public PokemonDetailCries legacy(URI legacy) {
    this.legacy = legacy;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("legacy")
  @NotNull
  public URI getLegacy() {
    return legacy;
  }
  public void setLegacy(URI legacy) {
    this.legacy = legacy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonDetailCries pokemonDetailCries = (PokemonDetailCries) o;
    return Objects.equals(this.latest, pokemonDetailCries.latest) &&
        Objects.equals(this.legacy, pokemonDetailCries.legacy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latest, legacy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonDetailCries {\n");
    
    sb.append("    latest: ").append(toIndentedString(latest)).append("\n");
    sb.append("    legacy: ").append(toIndentedString(legacy)).append("\n");
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

