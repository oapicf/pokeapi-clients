package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class PokemonDetailCries implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("latest")
  private URI latest;

  @JsonProperty("legacy")
  private URI legacy;

  /**
   * 
   * @return latest
   */
  public URI getLatest() {
    return latest;
  }

  public void setLatest(URI latest) {
    this.latest = latest;
  }

  /**
   * 
   * @return legacy
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
