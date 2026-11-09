package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonCries  {
  
 /**
  * The latest depiction of this Pokémon's cry.
  */
  @ApiModelProperty(required = true, value = "The latest depiction of this Pokémon's cry.")

  private String latest;

 /**
  * The legacy depiction of this Pokémon's cry.
  */
  @ApiModelProperty(required = true, value = "The legacy depiction of this Pokémon's cry.")

  private String legacy;
 /**
   * The latest depiction of this Pokémon&#39;s cry.
   * @return latest
  **/
  @JsonProperty("latest")
  public String getLatest() {
    return latest;
  }

  public void setLatest(String latest) {
    this.latest = latest;
  }

  public PokemonCries latest(String latest) {
    this.latest = latest;
    return this;
  }

 /**
   * The legacy depiction of this Pokémon&#39;s cry.
   * @return legacy
  **/
  @JsonProperty("legacy")
  public String getLegacy() {
    return legacy;
  }

  public void setLegacy(String legacy) {
    this.legacy = legacy;
  }

  public PokemonCries legacy(String legacy) {
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

