package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MoveSummary;
import org.openapitools.model.SuperContestEffectFlavorText;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-07T04:17:47.675703185Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class SuperContestEffectDetail   {
  
  private Integer id;
  private Integer appeal;
  private List<@Valid SuperContestEffectFlavorText> flavorTextEntries = new ArrayList<>();
  private List<@Valid MoveSummary> moves = new ArrayList<>();

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("appeal")
  @NotNull
  public Integer getAppeal() {
    return appeal;
  }
  public void setAppeal(Integer appeal) {
    this.appeal = appeal;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("flavor_text_entries")
  @NotNull
  @Valid
  public List<@Valid SuperContestEffectFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }
  public void setFlavorTextEntries(List<@Valid SuperContestEffectFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("moves")
  @NotNull
  @Valid
  public List<@Valid MoveSummary> getMoves() {
    return moves;
  }
  public void setMoves(List<@Valid MoveSummary> moves) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

