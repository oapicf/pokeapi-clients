package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.GenerationSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("TypeGameIndex")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T04:17:57.915073257Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class TypeGameIndex   {
  private Integer gameIndex;
  private GenerationSummary generation;

  public TypeGameIndex() {
  }

  @JsonCreator
  public TypeGameIndex(
    @JsonProperty(required = true, value = "game_index") Integer gameIndex,
    @JsonProperty(required = true, value = "generation") GenerationSummary generation
  ) {
    this.gameIndex = gameIndex;
    this.generation = generation;
  }

  /**
   **/
  public TypeGameIndex gameIndex(Integer gameIndex) {
    this.gameIndex = gameIndex;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "game_index")
  @NotNull public Integer getGameIndex() {
    return gameIndex;
  }

  @JsonProperty(required = true, value = "game_index")
  public void setGameIndex(Integer gameIndex) {
    this.gameIndex = gameIndex;
  }

  /**
   **/
  public TypeGameIndex generation(GenerationSummary generation) {
    this.generation = generation;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "generation")
  @NotNull @Valid public GenerationSummary getGeneration() {
    return generation;
  }

  @JsonProperty(required = true, value = "generation")
  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeGameIndex typeGameIndex = (TypeGameIndex) o;
    return Objects.equals(this.gameIndex, typeGameIndex.gameIndex) &&
        Objects.equals(this.generation, typeGameIndex.generation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameIndex, generation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeGameIndex {\n");
    
    sb.append("    gameIndex: ").append(toIndentedString(gameIndex)).append("\n");
    sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
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

