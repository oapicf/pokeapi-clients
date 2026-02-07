package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MoveSummary;
import org.openapitools.model.SuperContestEffectFlavorText;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SuperContestEffectDetail  {
  
  @ApiModelProperty(required = true, value = "")

  private Integer id;

  @ApiModelProperty(required = true, value = "")

  private Integer appeal;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private List<@Valid SuperContestEffectFlavorText> flavorTextEntries = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  @Valid

  private List<@Valid MoveSummary> moves = new ArrayList<>();
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }


 /**
   * Get appeal
   * @return appeal
  **/
  @JsonProperty("appeal")
  @NotNull
  public Integer getAppeal() {
    return appeal;
  }

  public void setAppeal(Integer appeal) {
    this.appeal = appeal;
  }

  public SuperContestEffectDetail appeal(Integer appeal) {
    this.appeal = appeal;
    return this;
  }

 /**
   * Get flavorTextEntries
   * @return flavorTextEntries
  **/
  @JsonProperty("flavor_text_entries")
  @NotNull
  public List<@Valid SuperContestEffectFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }

  public void setFlavorTextEntries(List<@Valid SuperContestEffectFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
  }

  public SuperContestEffectDetail flavorTextEntries(List<@Valid SuperContestEffectFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
    return this;
  }

  public SuperContestEffectDetail addFlavorTextEntriesItem(SuperContestEffectFlavorText flavorTextEntriesItem) {
    this.flavorTextEntries.add(flavorTextEntriesItem);
    return this;
  }

 /**
   * Get moves
   * @return moves
  **/
  @JsonProperty("moves")
  @NotNull
  public List<@Valid MoveSummary> getMoves() {
    return moves;
  }

  public void setMoves(List<@Valid MoveSummary> moves) {
    this.moves = moves;
  }

  public SuperContestEffectDetail moves(List<@Valid MoveSummary> moves) {
    this.moves = moves;
    return this;
  }

  public SuperContestEffectDetail addMovesItem(MoveSummary movesItem) {
    this.moves.add(movesItem);
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
    SuperContestEffectDetail superContestEffectDetail = (SuperContestEffectDetail) o;
    return Objects.equals(this.id, superContestEffectDetail.id) &&
        Objects.equals(this.appeal, superContestEffectDetail.appeal) &&
        Objects.equals(this.flavorTextEntries, superContestEffectDetail.flavorTextEntries) &&
        Objects.equals(this.moves, superContestEffectDetail.moves);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, appeal, flavorTextEntries, moves);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuperContestEffectDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    appeal: ").append(toIndentedString(appeal)).append("\n");
    sb.append("    flavorTextEntries: ").append(toIndentedString(flavorTextEntries)).append("\n");
    sb.append("    moves: ").append(toIndentedString(moves)).append("\n");
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

