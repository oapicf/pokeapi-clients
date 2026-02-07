package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.GenerationSummary;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ItemGameIndex
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-02-07T04:17:25.266083787Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ItemGameIndex {

  private Integer gameIndex;

  private GenerationSummary generation;

  public ItemGameIndex() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ItemGameIndex(Integer gameIndex, GenerationSummary generation) {
    this.gameIndex = gameIndex;
    this.generation = generation;
  }

  public ItemGameIndex gameIndex(Integer gameIndex) {
    this.gameIndex = gameIndex;
    return this;
  }

  /**
   * Get gameIndex
   * @return gameIndex
   */
  @NotNull 
  @Schema(name = "game_index", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("game_index")
  public Integer getGameIndex() {
    return gameIndex;
  }

  public void setGameIndex(Integer gameIndex) {
    this.gameIndex = gameIndex;
  }

  public ItemGameIndex generation(GenerationSummary generation) {
    this.generation = generation;
    return this;
  }

  /**
   * Get generation
   * @return generation
   */
  @NotNull @Valid 
  @Schema(name = "generation", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("generation")
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
    ItemGameIndex itemGameIndex = (ItemGameIndex) o;
    return Objects.equals(this.gameIndex, itemGameIndex.gameIndex) &&
        Objects.equals(this.generation, itemGameIndex.generation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameIndex, generation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemGameIndex {\n");
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

