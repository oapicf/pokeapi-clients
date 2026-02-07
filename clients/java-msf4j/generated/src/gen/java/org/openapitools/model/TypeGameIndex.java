package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.GenerationSummary;

/**
 * TypeGameIndex
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-02-07T04:17:01.559585484Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class TypeGameIndex   {
  @JsonProperty("game_index")
  private Integer gameIndex;

  @JsonProperty("generation")
  private GenerationSummary generation;

  public TypeGameIndex gameIndex(Integer gameIndex) {
    this.gameIndex = gameIndex;
    return this;
  }

   /**
   * Get gameIndex
   * @return gameIndex
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getGameIndex() {
    return gameIndex;
  }

  public void setGameIndex(Integer gameIndex) {
    this.gameIndex = gameIndex;
  }

  public TypeGameIndex generation(GenerationSummary generation) {
    this.generation = generation;
    return this;
  }

   /**
   * Get generation
   * @return generation
  **/
  @ApiModelProperty(required = true, value = "")
  public GenerationSummary getGeneration() {
    return generation;
  }

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

