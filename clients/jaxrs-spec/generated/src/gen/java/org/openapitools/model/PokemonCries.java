package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("PokemonCries")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-11-09T13:50:06.168269698Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonCries   {
  private String latest;
  private String legacy;

  public PokemonCries() {
  }

  @JsonCreator
  public PokemonCries(
    @JsonProperty(required = true, value = "latest") String latest,
    @JsonProperty(required = true, value = "legacy") String legacy
  ) {
    this.latest = latest;
    this.legacy = legacy;
  }

  /**
   * The latest depiction of this Pokémon&#39;s cry.
   **/
  public PokemonCries latest(String latest) {
    this.latest = latest;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The latest depiction of this Pokémon's cry.")
  @JsonProperty(required = true, value = "latest")
  @NotNull public String getLatest() {
    return latest;
  }

  @JsonProperty(required = true, value = "latest")
  public void setLatest(String latest) {
    this.latest = latest;
  }

  /**
   * The legacy depiction of this Pokémon&#39;s cry.
   **/
  public PokemonCries legacy(String legacy) {
    this.legacy = legacy;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The legacy depiction of this Pokémon's cry.")
  @JsonProperty(required = true, value = "legacy")
  @NotNull public String getLegacy() {
    return legacy;
  }

  @JsonProperty(required = true, value = "legacy")
  public void setLegacy(String legacy) {
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
    PokemonCries pokemonCries = (PokemonCries) o;
    return Objects.equals(this.latest, pokemonCries.latest) &&
        Objects.equals(this.legacy, pokemonCries.legacy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latest, legacy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonCries {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
