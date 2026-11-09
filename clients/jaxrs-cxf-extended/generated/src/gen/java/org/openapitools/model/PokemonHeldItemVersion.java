package org.openapitools.model;

import org.openapitools.model.VersionSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonHeldItemVersion  {
  
 /**
  * How often the item is held.
  */
  @ApiModelProperty(required = true, value = "How often the item is held.")
  private Integer rarity;

 /**
  * The version in which the item is held.
  */
  @ApiModelProperty(required = true, value = "The version in which the item is held.")
  @Valid
  private VersionSummary version;
 /**
  * How often the item is held.
  * @return rarity
  */
  @JsonProperty("rarity")
  @NotNull
  public Integer getRarity() {
    return rarity;
  }

  /**
   * Sets the <code>rarity</code> property.
   */
 public void setRarity(Integer rarity) {
    this.rarity = rarity;
  }

  /**
   * Sets the <code>rarity</code> property.
   */
  public PokemonHeldItemVersion rarity(Integer rarity) {
    this.rarity = rarity;
    return this;
  }

 /**
  * The version in which the item is held.
  * @return version
  */
  @JsonProperty("version")
  @NotNull
  public VersionSummary getVersion() {
    return version;
  }

  /**
   * Sets the <code>version</code> property.
   */
 public void setVersion(VersionSummary version) {
    this.version = version;
  }

  /**
   * Sets the <code>version</code> property.
   */
  public PokemonHeldItemVersion version(VersionSummary version) {
    this.version = version;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

