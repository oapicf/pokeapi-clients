package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MoveSummary;
import org.openapitools.model.SuperContestEffectFlavorText;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
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
  */
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public SuperContestEffectDetail id(Integer id) {
    this.id = id;
    return this;
  }

 /**
  * Get appeal
  * @return appeal
  */
  @JsonProperty("appeal")
  @NotNull
  public Integer getAppeal() {
    return appeal;
  }

  /**
   * Sets the <code>appeal</code> property.
   */
 public void setAppeal(Integer appeal) {
    this.appeal = appeal;
  }

  /**
   * Sets the <code>appeal</code> property.
   */
  public SuperContestEffectDetail appeal(Integer appeal) {
    this.appeal = appeal;
    return this;
  }

 /**
  * Get flavorTextEntries
  * @return flavorTextEntries
  */
  @JsonProperty("flavor_text_entries")
  @NotNull
  public List<@Valid SuperContestEffectFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }

  /**
   * Sets the <code>flavorTextEntries</code> property.
   */
 public void setFlavorTextEntries(List<@Valid SuperContestEffectFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
  }

  /**
   * Sets the <code>flavorTextEntries</code> property.
   */
  public SuperContestEffectDetail flavorTextEntries(List<@Valid SuperContestEffectFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
    return this;
  }

  /**
   * Adds a new item to the <code>flavorTextEntries</code> list.
   */
  public SuperContestEffectDetail addFlavorTextEntriesItem(SuperContestEffectFlavorText flavorTextEntriesItem) {
    this.flavorTextEntries.add(flavorTextEntriesItem);
    return this;
  }

 /**
  * Get moves
  * @return moves
  */
  @JsonProperty("moves")
  @NotNull
  public List<@Valid MoveSummary> getMoves() {
    return moves;
  }

  /**
   * Sets the <code>moves</code> property.
   */
 public void setMoves(List<@Valid MoveSummary> moves) {
    this.moves = moves;
  }

  /**
   * Sets the <code>moves</code> property.
   */
  public SuperContestEffectDetail moves(List<@Valid MoveSummary> moves) {
    this.moves = moves;
    return this;
  }

  /**
   * Adds a new item to the <code>moves</code> list.
   */
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

