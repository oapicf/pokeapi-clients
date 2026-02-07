package org.openapitools.model;

import org.openapitools.model.GenerationSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TypeGameIndex  {
  
  @ApiModelProperty(required = true, value = "")
  private Integer gameIndex;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private GenerationSummary generation;
 /**
  * Get gameIndex
  * @return gameIndex
  */
  @JsonProperty("game_index")
  @NotNull
  public Integer getGameIndex() {
    return gameIndex;
  }

  /**
   * Sets the <code>gameIndex</code> property.
   */
 public void setGameIndex(Integer gameIndex) {
    this.gameIndex = gameIndex;
  }

  /**
   * Sets the <code>gameIndex</code> property.
   */
  public TypeGameIndex gameIndex(Integer gameIndex) {
    this.gameIndex = gameIndex;
    return this;
  }

 /**
  * Get generation
  * @return generation
  */
  @JsonProperty("generation")
  @NotNull
  public GenerationSummary getGeneration() {
    return generation;
  }

  /**
   * Sets the <code>generation</code> property.
   */
 public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

  /**
   * Sets the <code>generation</code> property.
   */
  public TypeGameIndex generation(GenerationSummary generation) {
    this.generation = generation;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

