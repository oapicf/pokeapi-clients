package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MoveSummary;
import org.openapitools.model.SuperContestEffectFlavorText;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-02-07T04:16:44.910526458Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class SuperContestEffectDetail   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("appeal")
  private Integer appeal;

  @JsonProperty("flavor_text_entries")
  private List<SuperContestEffectFlavorText> flavorTextEntries = new ArrayList<>();

  @JsonProperty("moves")
  private List<MoveSummary> moves = new ArrayList<>();

  /**
   **/
  public SuperContestEffectDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  public SuperContestEffectDetail appeal(Integer appeal) {
    this.appeal = appeal;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("appeal")
  public Integer getAppeal() {
    return appeal;
  }
  public void setAppeal(Integer appeal) {
    this.appeal = appeal;
  }

  /**
   **/
  public SuperContestEffectDetail flavorTextEntries(List<SuperContestEffectFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("flavor_text_entries")
  public List<SuperContestEffectFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }
  public void setFlavorTextEntries(List<SuperContestEffectFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
  }

  /**
   **/
  public SuperContestEffectDetail moves(List<MoveSummary> moves) {
    this.moves = moves;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("moves")
  public List<MoveSummary> getMoves() {
    return moves;
  }
  public void setMoves(List<MoveSummary> moves) {
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
    SuperContestEffectDetail superContestEffectDetail = (SuperContestEffectDetail) o;
    return Objects.equals(id, superContestEffectDetail.id) &&
        Objects.equals(appeal, superContestEffectDetail.appeal) &&
        Objects.equals(flavorTextEntries, superContestEffectDetail.flavorTextEntries) &&
        Objects.equals(moves, superContestEffectDetail.moves);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

