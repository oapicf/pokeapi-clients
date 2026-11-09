package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.VersionSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class PokemonHeldItemVersion   {
  
  private Integer rarity;

  private VersionSummary version;

  /**
   * How often the item is held.
   **/
  public PokemonHeldItemVersion rarity(Integer rarity) {
    this.rarity = rarity;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "How often the item is held.")
  @JsonProperty("rarity")
  @NotNull
  public Integer getRarity() {
    return rarity;
  }
  public void setRarity(Integer rarity) {
    this.rarity = rarity;
  }


  /**
   * The version in which the item is held.
   **/
  public PokemonHeldItemVersion version(VersionSummary version) {
    this.version = version;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The version in which the item is held.")
  @JsonProperty("version")
  @NotNull
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

