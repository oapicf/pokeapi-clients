package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MoveDamageClassDescription;
import org.openapitools.model.MoveDamageClassName;
import org.openapitools.model.MoveSummary;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * MoveDamageClassDetail
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-07T04:22:27.168374474Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MoveDamageClassDetail {

  private Integer id;

  private String name;

  @Valid
  private List<@Valid MoveDamageClassDescription> descriptions = new ArrayList<>();

  @Valid
  private List<@Valid MoveSummary> moves = new ArrayList<>();

  @Valid
  private List<@Valid MoveDamageClassName> names = new ArrayList<>();

  public MoveDamageClassDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MoveDamageClassDetail(Integer id, String name, List<@Valid MoveDamageClassDescription> descriptions, List<@Valid MoveSummary> moves, List<@Valid MoveDamageClassName> names) {
    this.id = id;
    this.name = name;
    this.descriptions = descriptions;
    this.moves = moves;
    this.names = names;
  }

  public MoveDamageClassDetail id(Integer id) {
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

  public void setId(Integer id) {
    this.id = id;
  }

  public MoveDamageClassDetail name(String name) {
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
   * Get descriptions
   * @return descriptions
   */
  @NotNull @Valid 
  @Schema(name = "descriptions", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("descriptions")
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
   * Get moves
   * @return moves
   */
  @NotNull @Valid 
  @Schema(name = "moves", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("moves")
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
   * Get names
   * @return names
   */
  @NotNull @Valid 
  @Schema(name = "names", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("names")
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
    return Objects.equals(this.id, moveDamageClassDetail.id) &&
        Objects.equals(this.name, moveDamageClassDetail.name) &&
        Objects.equals(this.descriptions, moveDamageClassDetail.descriptions) &&
        Objects.equals(this.moves, moveDamageClassDetail.moves) &&
        Objects.equals(this.names, moveDamageClassDetail.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, descriptions, moves, names);
  }

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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

