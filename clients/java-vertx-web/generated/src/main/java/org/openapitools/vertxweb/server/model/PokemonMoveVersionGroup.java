package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.MoveLearnMethodSummary;
import org.openapitools.vertxweb.server.model.VersionGroupSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PokemonMoveVersionGroup   {
  
  private Integer levelLearnedAt;
  private MoveLearnMethodSummary moveLearnMethod;
  private VersionGroupSummary versionGroup;
  private Integer order;

  public PokemonMoveVersionGroup () {

  }

  public PokemonMoveVersionGroup (Integer levelLearnedAt, MoveLearnMethodSummary moveLearnMethod, VersionGroupSummary versionGroup, Integer order) {
    this.levelLearnedAt = levelLearnedAt;
    this.moveLearnMethod = moveLearnMethod;
    this.versionGroup = versionGroup;
    this.order = order;
  }

    
  @JsonProperty("level_learned_at")
  public Integer getLevelLearnedAt() {
    return levelLearnedAt;
  }
  public void setLevelLearnedAt(Integer levelLearnedAt) {
    this.levelLearnedAt = levelLearnedAt;
  }

    
  @JsonProperty("move_learn_method")
  public MoveLearnMethodSummary getMoveLearnMethod() {
    return moveLearnMethod;
  }
  public void setMoveLearnMethod(MoveLearnMethodSummary moveLearnMethod) {
    this.moveLearnMethod = moveLearnMethod;
  }

    
  @JsonProperty("version_group")
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }
  public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

    
  @JsonProperty("order")
  public Integer getOrder() {
    return order;
  }
  public void setOrder(Integer order) {
    this.order = order;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonMoveVersionGroup pokemonMoveVersionGroup = (PokemonMoveVersionGroup) o;
    return Objects.equals(levelLearnedAt, pokemonMoveVersionGroup.levelLearnedAt) &&
        Objects.equals(moveLearnMethod, pokemonMoveVersionGroup.moveLearnMethod) &&
        Objects.equals(versionGroup, pokemonMoveVersionGroup.versionGroup) &&
        Objects.equals(order, pokemonMoveVersionGroup.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(levelLearnedAt, moveLearnMethod, versionGroup, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonMoveVersionGroup {\n");
    
    sb.append("    levelLearnedAt: ").append(toIndentedString(levelLearnedAt)).append("\n");
    sb.append("    moveLearnMethod: ").append(toIndentedString(moveLearnMethod)).append("\n");
    sb.append("    versionGroup: ").append(toIndentedString(versionGroup)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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
