package org.openapitools.model;

import java.net.URI;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonDetailCries  {
  
  @ApiModelProperty(required = true, value = "")

  private URI latest;

  @ApiModelProperty(required = true, value = "")

  private URI legacy;
 /**
   * Get latest
   * @return latest
  **/
  @JsonProperty("latest")
  public URI getLatest() {
    return latest;
  }

  public void setLatest(URI latest) {
    this.latest = latest;
  }

  public PokemonDetailCries latest(URI latest) {
    this.latest = latest;
    return this;
  }

 /**
   * Get legacy
   * @return legacy
  **/
  @JsonProperty("legacy")
  public URI getLegacy() {
    return legacy;
  }

  public void setLegacy(URI legacy) {
    this.legacy = legacy;
  }

  public PokemonDetailCries legacy(URI legacy) {
    this.legacy = legacy;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

