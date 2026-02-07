package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-02-07T15:22:50.575598517Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokemonDetailCries   {
  @JsonProperty("latest")
  private URI latest;

  @JsonProperty("legacy")
  private URI legacy;

  /**
   **/
  public PokemonDetailCries latest(URI latest) {
    this.latest = latest;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("latest")
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
    return Objects.equals(latest, pokemonDetailCries.latest) &&
        Objects.equals(legacy, pokemonDetailCries.legacy);
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

