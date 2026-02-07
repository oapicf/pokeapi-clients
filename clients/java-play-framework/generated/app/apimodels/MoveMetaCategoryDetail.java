package apimodels;

import apimodels.AbilityDetailPokemonInnerPokemon;
import apimodels.MoveMetaCategoryDescription;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * MoveMetaCategoryDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-07T04:17:12.303882205Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class MoveMetaCategoryDetail   {
  @JsonProperty("id")
  @NotNull

  private Integer id;

  @JsonProperty("name")
  @NotNull
@Size(max=100)

  private String name;

  @JsonProperty("descriptions")
  @NotNull
@Valid

  private List<@Valid MoveMetaCategoryDescription> descriptions = new ArrayList<>();

  @JsonProperty("moves")
  @NotNull
@Valid

  private List<@Valid AbilityDetailPokemonInnerPokemon> moves = new ArrayList<>();

  public MoveMetaCategoryDetail id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public MoveMetaCategoryDetail name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MoveMetaCategoryDetail descriptions(List<@Valid MoveMetaCategoryDescription> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  public MoveMetaCategoryDetail addDescriptionsItem(MoveMetaCategoryDescription descriptionsItem) {
    if (this.descriptions == null) {
      this.descriptions = new ArrayList<>();
    }
    this.descriptions.add(descriptionsItem);
    return this;
  }

   /**
   * Get descriptions
   * @return descriptions
  **/
  public List<@Valid MoveMetaCategoryDescription> getDescriptions() {
    return descriptions;
  }

  public void setDescriptions(List<@Valid MoveMetaCategoryDescription> descriptions) {
    this.descriptions = descriptions;
  }

  public MoveMetaCategoryDetail moves(List<@Valid AbilityDetailPokemonInnerPokemon> moves) {
    this.moves = moves;
    return this;
  }

  public MoveMetaCategoryDetail addMovesItem(AbilityDetailPokemonInnerPokemon movesItem) {
    if (this.moves == null) {
      this.moves = new ArrayList<>();
    }
    this.moves.add(movesItem);
    return this;
  }

   /**
   * Get moves
   * @return moves
  **/
  public List<@Valid AbilityDetailPokemonInnerPokemon> getMoves() {
    return moves;
  }

  public void setMoves(List<@Valid AbilityDetailPokemonInnerPokemon> moves) {
    this.moves = moves;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoveMetaCategoryDetail moveMetaCategoryDetail = (MoveMetaCategoryDetail) o;
    return Objects.equals(id, moveMetaCategoryDetail.id) &&
        Objects.equals(name, moveMetaCategoryDetail.name) &&
        Objects.equals(descriptions, moveMetaCategoryDetail.descriptions) &&
        Objects.equals(moves, moveMetaCategoryDetail.moves);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, descriptions, moves);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveMetaCategoryDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
    sb.append("    moves: ").append(toIndentedString(moves)).append("\n");
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

