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

/**
 * SuperContestEffectDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T01:55:58.248058654Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class SuperContestEffectDetail   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("appeal")
  private Integer appeal;

  @JsonProperty("flavor_text_entries")
  private List<@Valid SuperContestEffectFlavorText> flavorTextEntries = new ArrayList<>();

  @JsonProperty("moves")
  private List<@Valid MoveSummary> moves = new ArrayList<>();

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getId() {
    return id;
  }

  public SuperContestEffectDetail appeal(Integer appeal) {
    this.appeal = appeal;
    return this;
  }

   /**
   * Get appeal
   * @return appeal
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getAppeal() {
    return appeal;
  }

  public void setAppeal(Integer appeal) {
    this.appeal = appeal;
  }

   /**
   * Get flavorTextEntries
   * @return flavorTextEntries
  **/
  @ApiModelProperty(required = true, value = "")
  public List<@Valid SuperContestEffectFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }

   /**
   * Get moves
   * @return moves
  **/
  @ApiModelProperty(required = true, value = "")
  public List<@Valid MoveSummary> getMoves() {
    return moves;
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

