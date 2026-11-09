package org.openapitools.model;

import org.openapitools.model.VersionSummary;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class PokemonHeldItemVersion implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * How often the item is held.
   */
  @JsonProperty("rarity")
  private Integer rarity;

  /**
   * The version in which the item is held.
   */
  @JsonProperty("version")
  private VersionSummary version;

  /**
   * How often the item is held.
   * @return rarity
   */
  public Integer getRarity() {
    return rarity;
  }

  public void setRarity(Integer rarity) {
    this.rarity = rarity;
  }

  /**
   * The version in which the item is held.
   * @return version
   */
  public VersionSummary getVersion() {
    return version;
  }

  public void setVersion(VersionSummary version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonHeldItemVersion pokemonHeldItemVersion = (PokemonHeldItemVersion) o;
    return Objects.equals(this.rarity, pokemonHeldItemVersion.rarity) &&
        Objects.equals(this.version, pokemonHeldItemVersion.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rarity, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonHeldItemVersion {\n");
    
    sb.append("    rarity: ").append(toIndentedString(rarity)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
