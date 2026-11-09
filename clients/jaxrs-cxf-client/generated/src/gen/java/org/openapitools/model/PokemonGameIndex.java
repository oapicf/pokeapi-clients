package org.openapitools.model;

import org.openapitools.model.VersionSummary;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonGameIndex  {
  
 /**
  * The internal id of an API resource within game data.
  */
  @ApiModelProperty(required = true, value = "The internal id of an API resource within game data.")

  private Integer gameIndex;

 /**
  * The version relevent to this game index.
  */
  @ApiModelProperty(required = true, value = "The version relevent to this game index.")

  private VersionSummary version;
 /**
   * The internal id of an API resource within game data.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return gameIndex
  **/
  @JsonProperty("game_index")
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
   * The version relevent to this game index.
   * @return version
  **/
  @JsonProperty("version")
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

