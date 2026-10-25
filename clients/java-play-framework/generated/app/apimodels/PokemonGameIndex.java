package apimodels;

import apimodels.VersionSummary;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PokemonGameIndex
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-25T05:48:13.486809836Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PokemonGameIndex   {
  @JsonProperty("game_index")
  @NotNull

  private Integer gameIndex;

  @JsonProperty("version")
  @NotNull
@Valid

  private VersionSummary version;

  public PokemonGameIndex gameIndex(Integer gameIndex) {
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

  public PokemonGameIndex version(VersionSummary version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
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
    return Objects.equals(gameIndex, pokemonGameIndex.gameIndex) &&
        Objects.equals(version, pokemonGameIndex.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameIndex, version);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

