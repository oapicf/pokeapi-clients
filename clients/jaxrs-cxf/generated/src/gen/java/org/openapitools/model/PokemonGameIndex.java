package org.openapitools.model;

import org.openapitools.model.VersionSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonGameIndex  {
  
  @ApiModelProperty(required = true, value = "")

  private Integer gameIndex;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private VersionSummary version;
 /**
   * Get gameIndex
   * @return gameIndex
  **/
  @JsonProperty("game_index")
  @NotNull
  public Integer getGameIndex() {
    return gameIndex;
  }

  public void setGameIndex(Integer gameIndex) {
    this.gameIndex = gameIndex;
  }

  public PokemonGameIndex gameIndex(Integer gameIndex) {
    this.gameIndex = gameIndex;
    return this;
  }

 /**
   * Get version
   * @return version
  **/
  @JsonProperty("version")
  @NotNull
  public VersionSummary getVersion() {
    return version;
  }

  public void setVersion(VersionSummary version) {
    this.version = version;
  }

  public PokemonGameIndex version(VersionSummary version) {
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
    PokemonGameIndex pokemonGameIndex = (PokemonGameIndex) o;
    return Objects.equals(this.gameIndex, pokemonGameIndex.gameIndex) &&
        Objects.equals(this.version, pokemonGameIndex.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameIndex, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonGameIndex {\n");
    
    sb.append("    gameIndex: ").append(toIndentedString(gameIndex)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

