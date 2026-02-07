package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.MoveSummary;
import org.openapitools.vertxweb.server.model.SuperContestEffectFlavorText;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SuperContestEffectDetail   {
  
  private Integer id;
  private Integer appeal;
  private List<SuperContestEffectFlavorText> flavorTextEntries = new ArrayList<>();
  private List<MoveSummary> moves = new ArrayList<>();

  public SuperContestEffectDetail () {

  }

  public SuperContestEffectDetail (Integer id, Integer appeal, List<SuperContestEffectFlavorText> flavorTextEntries, List<MoveSummary> moves) {
    this.id = id;
    this.appeal = appeal;
    this.flavorTextEntries = flavorTextEntries;
    this.moves = moves;
  }

    
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

    
  @JsonProperty("appeal")
  public Integer getAppeal() {
    return appeal;
  }
  public void setAppeal(Integer appeal) {
    this.appeal = appeal;
  }

    
  @JsonProperty("flavor_text_entries")
  public List<SuperContestEffectFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }
  public void setFlavorTextEntries(List<SuperContestEffectFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
  }

    
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
