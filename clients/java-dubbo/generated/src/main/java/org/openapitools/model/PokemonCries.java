package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class PokemonCries implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The latest depiction of this Pokémon&#39;s cry.
   */
  @JsonProperty("latest")
  private String latest;

  /**
   * The legacy depiction of this Pokémon&#39;s cry.
   */
  @JsonProperty("legacy")
  private String legacy;

  /**
   * The latest depiction of this Pokémon&#39;s cry.
   * @return latest
   */
  public String getLatest() {
    return latest;
  }

  public void setLatest(String latest) {
    this.latest = latest;
  }

  /**
   * The legacy depiction of this Pokémon&#39;s cry.
   * @return legacy
   */
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
