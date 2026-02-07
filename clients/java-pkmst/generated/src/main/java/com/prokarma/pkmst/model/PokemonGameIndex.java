package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.VersionSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * PokemonGameIndex
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-02-07T04:17:07.396624034Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokemonGameIndex   {
  @JsonProperty("game_index")
  private Integer gameIndex;

  @JsonProperty("version")
  private VersionSummary version;

  public PokemonGameIndex gameIndex(Integer gameIndex) {
    this.gameIndex = gameIndex;
    return this;
  }

  /**
   * Get gameIndex
   * @return gameIndex
   */
  @ApiModelProperty(required = true, value = "")
  public Integer getGameIndex() {
    return gameIndex;
  }

  public void setGameIndex(Integer gameIndex) {
    this.gameIndex = gameIndex;
  }

  public PokemonGameIndex version(VersionSummary version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  @ApiModelProperty(required = true, value = "")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

