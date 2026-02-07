package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.AbilityDetailPokemonInnerPokemon;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PokemonDetailMovesInnerVersionGroupDetailsInner   {
  
  private Integer levelLearnedAt;
  private AbilityDetailPokemonInnerPokemon moveLearnMethod;
  private AbilityDetailPokemonInnerPokemon versionGroup;

  public PokemonDetailMovesInnerVersionGroupDetailsInner () {

  }

  public PokemonDetailMovesInnerVersionGroupDetailsInner (Integer levelLearnedAt, AbilityDetailPokemonInnerPokemon moveLearnMethod, AbilityDetailPokemonInnerPokemon versionGroup) {
    this.levelLearnedAt = levelLearnedAt;
    this.moveLearnMethod = moveLearnMethod;
    this.versionGroup = versionGroup;
  }

    
  @JsonProperty("level_learned_at")
  public Integer getLevelLearnedAt() {
    return levelLearnedAt;
  }
  public void setLevelLearnedAt(Integer levelLearnedAt) {
    this.levelLearnedAt = levelLearnedAt;
  }

    
  @JsonProperty("move_learn_method")
  public AbilityDetailPokemonInnerPokemon getMoveLearnMethod() {
    return moveLearnMethod;
  }
  public void setMoveLearnMethod(AbilityDetailPokemonInnerPokemon moveLearnMethod) {
    this.moveLearnMethod = moveLearnMethod;
  }

    
  @JsonProperty("version_group")
  public AbilityDetailPokemonInnerPokemon getVersionGroup() {
    return versionGroup;
  }
  public void setVersionGroup(AbilityDetailPokemonInnerPokemon versionGroup) {
    this.versionGroup = versionGroup;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonDetailMovesInnerVersionGroupDetailsInner pokemonDetailMovesInnerVersionGroupDetailsInner = (PokemonDetailMovesInnerVersionGroupDetailsInner) o;
    return Objects.equals(levelLearnedAt, pokemonDetailMovesInnerVersionGroupDetailsInner.levelLearnedAt) &&
        Objects.equals(moveLearnMethod, pokemonDetailMovesInnerVersionGroupDetailsInner.moveLearnMethod) &&
        Objects.equals(versionGroup, pokemonDetailMovesInnerVersionGroupDetailsInner.versionGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(levelLearnedAt, moveLearnMethod, versionGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonDetailMovesInnerVersionGroupDetailsInner {\n");
    
    sb.append("    levelLearnedAt: ").append(toIndentedString(levelLearnedAt)).append("\n");
    sb.append("    moveLearnMethod: ").append(toIndentedString(moveLearnMethod)).append("\n");
    sb.append("    versionGroup: ").append(toIndentedString(versionGroup)).append("\n");
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
