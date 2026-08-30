package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MoveSummary;
import org.openapitools.model.MoveTargetDescription;
import org.openapitools.model.MoveTargetName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * MoveTargetDetail
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T02:00:43.960184425Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class MoveTargetDetail {

  private Integer id;

  private String name;

  private List<@Valid MoveTargetDescription> descriptions = new ArrayList<>();

  private List<@Valid MoveSummary> moves = new ArrayList<>();

  private List<@Valid MoveTargetName> names = new ArrayList<>();

  public MoveTargetDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MoveTargetDetail(Integer id, String name, List<@Valid MoveTargetDescription> descriptions, List<@Valid MoveSummary> moves, List<@Valid MoveTargetName> names) {
    this.id = id;
    this.name = name;
    this.descriptions = descriptions;
    this.moves = moves;
    this.names = names;
  }

  public MoveTargetDetail id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  @JsonProperty("id")
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
   */
  @NotNull @Size(max = 100) 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
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
   */
  @Valid 
  @Schema(name = "descriptions", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("descriptions")
  public List<@Valid MoveTargetDescription> getDescriptions() {
    return descriptions;
  }

  @JsonProperty("descriptions")
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
   */
  @Valid 
  @Schema(name = "moves", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("moves")
  public List<@Valid MoveSummary> getMoves() {
    return moves;
  }

  @JsonProperty("moves")
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
   */
  @Valid 
  @Schema(name = "names", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("names")
  public List<@Valid MoveTargetName> getNames() {
    return names;
  }

  @JsonProperty("names")
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
    return Objects.equals(this.id, moveTargetDetail.id) &&
        Objects.equals(this.name, moveTargetDetail.name) &&
        Objects.equals(this.descriptions, moveTargetDetail.descriptions) &&
        Objects.equals(this.moves, moveTargetDetail.moves) &&
        Objects.equals(this.names, moveTargetDetail.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, descriptions, moves, names);
  }

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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

