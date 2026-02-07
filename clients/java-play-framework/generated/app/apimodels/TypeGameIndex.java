package apimodels;

import apimodels.GenerationSummary;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * TypeGameIndex
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-07T04:17:12.303882205Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TypeGameIndex   {
  @JsonProperty("game_index")
  @NotNull

  private Integer gameIndex;

  @JsonProperty("generation")
  @NotNull
@Valid

  private GenerationSummary generation;

  public TypeGameIndex gameIndex(Integer gameIndex) {
    this.gameIndex = gameIndex;
    return this;
  }

   /**
   * Get gameIndex
   * @return gameIndex
  **/
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
    return Objects.equals(gameIndex, typeGameIndex.gameIndex) &&
        Objects.equals(generation, typeGameIndex.generation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameIndex, generation);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

