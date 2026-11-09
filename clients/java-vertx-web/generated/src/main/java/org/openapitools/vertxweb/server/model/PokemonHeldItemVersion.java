package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.VersionSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PokemonHeldItemVersion   {
  
  private Integer rarity;
  private VersionSummary version;

  public PokemonHeldItemVersion () {

  }

  public PokemonHeldItemVersion (Integer rarity, VersionSummary version) {
    this.rarity = rarity;
    this.version = version;
  }

    
  @JsonProperty("rarity")
  public Integer getRarity() {
    return rarity;
  }
  public void setRarity(Integer rarity) {
    this.rarity = rarity;
  }

    
  @JsonProperty("version")
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
    return Objects.equals(rarity, pokemonHeldItemVersion.rarity) &&
        Objects.equals(version, pokemonHeldItemVersion.version);
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
