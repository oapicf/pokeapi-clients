package apimodels;

import apimodels.MoveDamageClassDescription;
import apimodels.MoveDamageClassName;
import apimodels.MoveSummary;
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
 * MoveDamageClassDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class MoveDamageClassDetail   {
  @JsonProperty("id")
  @NotNull

  private Integer id;

  @JsonProperty("name")
  @NotNull
@Size(max=200)

  private String name;

  @JsonProperty("descriptions")
  @NotNull
@Valid

  private List<@Valid MoveDamageClassDescription> descriptions = new ArrayList<>();

  @JsonProperty("moves")
  @NotNull
@Valid

  private List<@Valid MoveSummary> moves = new ArrayList<>();

  @JsonProperty("names")
  @NotNull
@Valid

  private List<@Valid MoveDamageClassName> names = new ArrayList<>();

  public MoveDamageClassDetail id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The identifier for this resource.
   * @return id
  **/
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public MoveDamageClassDetail name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name for this resource.
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MoveDamageClassDetail descriptions(List<@Valid MoveDamageClassDescription> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  public MoveDamageClassDetail addDescriptionsItem(MoveDamageClassDescription descriptionsItem) {
    if (this.descriptions == null) {
      this.descriptions = new ArrayList<>();
    }
    this.descriptions.add(descriptionsItem);
    return this;
  }

   /**
   * The description of this resource listed in different languages.
   * @return descriptions
  **/
  public List<@Valid MoveDamageClassDescription> getDescriptions() {
    return descriptions;
  }

  public void setDescriptions(List<@Valid MoveDamageClassDescription> descriptions) {
    this.descriptions = descriptions;
  }

  public MoveDamageClassDetail moves(List<@Valid MoveSummary> moves) {
    this.moves = moves;
    return this;
  }

  public MoveDamageClassDetail addMovesItem(MoveSummary movesItem) {
    if (this.moves == null) {
      this.moves = new ArrayList<>();
    }
    this.moves.add(movesItem);
    return this;
  }

   /**
   * A list of moves that fall into this damage class.
   * @return moves
  **/
  public List<@Valid MoveSummary> getMoves() {
    return moves;
  }

  public void setMoves(List<@Valid MoveSummary> moves) {
    this.moves = moves;
  }

  public MoveDamageClassDetail names(List<@Valid MoveDamageClassName> names) {
    this.names = names;
    return this;
  }

  public MoveDamageClassDetail addNamesItem(MoveDamageClassName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }

   /**
   * The name of this resource listed in different languages.
   * @return names
  **/
  public List<@Valid MoveDamageClassName> getNames() {
    return names;
  }

  public void setNames(List<@Valid MoveDamageClassName> names) {
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
    MoveDamageClassDetail moveDamageClassDetail = (MoveDamageClassDetail) o;
    return Objects.equals(id, moveDamageClassDetail.id) &&
        Objects.equals(name, moveDamageClassDetail.name) &&
        Objects.equals(descriptions, moveDamageClassDetail.descriptions) &&
        Objects.equals(moves, moveDamageClassDetail.moves) &&
        Objects.equals(names, moveDamageClassDetail.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, descriptions, moves, names);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveDamageClassDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

