package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("PokemonDetail_cries")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T04:17:57.915073257Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokemonDetailCries   {
  private URI latest;
  private URI legacy;

  public PokemonDetailCries() {
  }

  @JsonCreator
  public PokemonDetailCries(
    @JsonProperty(required = true, value = "latest") URI latest,
    @JsonProperty(required = true, value = "legacy") URI legacy
  ) {
    this.latest = latest;
    this.legacy = legacy;
  }

  /**
   **/
  public PokemonDetailCries latest(URI latest) {
    this.latest = latest;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "latest")
  @NotNull public URI getLatest() {
    return latest;
  }

  @JsonProperty(required = true, value = "latest")
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
  @JsonProperty(required = true, value = "legacy")
  @NotNull public URI getLegacy() {
    return legacy;
  }

  @JsonProperty(required = true, value = "legacy")
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

