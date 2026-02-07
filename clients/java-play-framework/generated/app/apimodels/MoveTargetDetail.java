package apimodels;

import apimodels.MoveSummary;
import apimodels.MoveTargetDescription;
import apimodels.MoveTargetName;
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
 * MoveTargetDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-07T04:17:12.303882205Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class MoveTargetDetail   {
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

  private List<@Valid MoveTargetDescription> descriptions = new ArrayList<>();

  @JsonProperty("moves")
  @NotNull
@Valid

  private List<@Valid MoveSummary> moves = new ArrayList<>();

  @JsonProperty("names")
  @NotNull
@Valid

  private List<@Valid MoveTargetName> names = new ArrayList<>();

  public MoveTargetDetail id(Integer id) {
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

  public MoveTargetDetail name(String name) {
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

  public MoveTargetDetail descriptions(List<@Valid MoveTargetDescription> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  public MoveTargetDetail addDescriptionsItem(MoveTargetDescription descriptionsItem) {
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
  public List<@Valid MoveTargetDescription> getDescriptions() {
    return descriptions;
  }

  public void setDescriptions(List<@Valid MoveTargetDescription> descriptions) {
    this.descriptions = descriptions;
  }

  public MoveTargetDetail moves(List<@Valid MoveSummary> moves) {
    this.moves = moves;
    return this;
  }

  public MoveTargetDetail addMovesItem(MoveSummary movesItem) {
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
  public List<@Valid MoveSummary> getMoves() {
    return moves;
  }

  public void setMoves(List<@Valid MoveSummary> moves) {
    this.moves = moves;
  }

  public MoveTargetDetail names(List<@Valid MoveTargetName> names) {
    this.names = names;
    return this;
  }

  public MoveTargetDetail addNamesItem(MoveTargetName namesItem) {
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
  public List<@Valid MoveTargetName> getNames() {
    return names;
  }

  public void setNames(List<@Valid MoveTargetName> names) {
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
    MoveTargetDetail moveTargetDetail = (MoveTargetDetail) o;
    return Objects.equals(id, moveTargetDetail.id) &&
        Objects.equals(name, moveTargetDetail.name) &&
        Objects.equals(descriptions, moveTargetDetail.descriptions) &&
        Objects.equals(moves, moveTargetDetail.moves) &&
        Objects.equals(names, moveTargetDetail.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, descriptions, moves, names);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveTargetDetail {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

