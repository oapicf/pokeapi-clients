package apimodels;

import apimodels.AbilityDetailPokemonInnerPokemon;
import apimodels.MoveMetaAilmentName;
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
 * MoveMetaAilmentDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-07T04:17:12.303882205Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class MoveMetaAilmentDetail   {
  @JsonProperty("id")
  @NotNull

  private Integer id;

  @JsonProperty("name")
  @NotNull
@Size(max=100)

  private String name;

  @JsonProperty("moves")
  @NotNull
@Valid

  private List<@Valid AbilityDetailPokemonInnerPokemon> moves = new ArrayList<>();

  @JsonProperty("names")
  @NotNull
@Valid

  private List<@Valid MoveMetaAilmentName> names = new ArrayList<>();

  public MoveMetaAilmentDetail id(Integer id) {
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

  public MoveMetaAilmentDetail name(String name) {
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

  public MoveMetaAilmentDetail moves(List<@Valid AbilityDetailPokemonInnerPokemon> moves) {
    this.moves = moves;
    return this;
  }

  public MoveMetaAilmentDetail addMovesItem(AbilityDetailPokemonInnerPokemon movesItem) {
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

  public MoveMetaAilmentDetail names(List<@Valid MoveMetaAilmentName> names) {
    this.names = names;
    return this;
  }

  public MoveMetaAilmentDetail addNamesItem(MoveMetaAilmentName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }

   /**
   * Get names
   * @return names
  **/
  public List<@Valid MoveMetaAilmentName> getNames() {
    return names;
  }

  public void setNames(List<@Valid MoveMetaAilmentName> names) {
    this.names = names;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoveMetaAilmentDetail moveMetaAilmentDetail = (MoveMetaAilmentDetail) o;
    return Objects.equals(id, moveMetaAilmentDetail.id) &&
        Objects.equals(name, moveMetaAilmentDetail.name) &&
        Objects.equals(moves, moveMetaAilmentDetail.moves) &&
        Objects.equals(names, moveMetaAilmentDetail.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, moves, names);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveMetaAilmentDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    moves: ").append(toIndentedString(moves)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
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

