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



public class PokemonGameIndex   {
  
  private Integer gameIndex;

  private VersionSummary version;

  /**
   **/
  public PokemonGameIndex gameIndex(Integer gameIndex) {
    this.gameIndex = gameIndex;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("game_index")
  @NotNull
  public Integer getGameIndex() {
    return gameIndex;
  }
  public void setGameIndex(Integer gameIndex) {
    this.gameIndex = gameIndex;
  }


  /**
   **/
  public PokemonGameIndex version(VersionSummary version) {
    this.version = version;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
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

