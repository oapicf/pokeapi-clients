package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-11-09T13:49:15.621225368Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonCries   {
  @JsonProperty("latest")
  private String latest;

  @JsonProperty("legacy")
  private String legacy;

  /**
   * The latest depiction of this Pokémon's cry.
   **/
  public PokemonCries latest(String latest) {
    this.latest = latest;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The latest depiction of this Pokémon's cry.")
  @JsonProperty("latest")
  public String getLatest() {
    return latest;
  }
  public void setLatest(String latest) {
    this.latest = latest;
  }

  /**
   * The legacy depiction of this Pokémon's cry.
   **/
  public PokemonCries legacy(String legacy) {
    this.legacy = legacy;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The legacy depiction of this Pokémon's cry.")
  @JsonProperty("legacy")
  public String getLegacy() {
    return legacy;
  }
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
    return Objects.equals(latest, pokemonCries.latest) &&
        Objects.equals(legacy, pokemonCries.legacy);
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

