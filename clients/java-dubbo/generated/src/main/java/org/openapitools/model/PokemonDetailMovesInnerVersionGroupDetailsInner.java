package org.openapitools.model;

import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class PokemonDetailMovesInnerVersionGroupDetailsInner implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("level_learned_at")
  private Integer levelLearnedAt;

  @JsonProperty("move_learn_method")
  private AbilityDetailPokemonInnerPokemon moveLearnMethod;

  @JsonProperty("version_group")
  private AbilityDetailPokemonInnerPokemon versionGroup;

  /**
   * 
   * @return levelLearnedAt
   */
  public Integer getLevelLearnedAt() {
    return levelLearnedAt;
  }

  public void setLevelLearnedAt(Integer levelLearnedAt) {
    this.levelLearnedAt = levelLearnedAt;
  }

  /**
   * 
   * @return moveLearnMethod
   */
  public AbilityDetailPokemonInnerPokemon getMoveLearnMethod() {
    return moveLearnMethod;
  }

  public void setMoveLearnMethod(AbilityDetailPokemonInnerPokemon moveLearnMethod) {
    this.moveLearnMethod = moveLearnMethod;
  }

  /**
   * 
   * @return versionGroup
   */
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
    return Objects.equals(this.levelLearnedAt, pokemonDetailMovesInnerVersionGroupDetailsInner.levelLearnedAt) &&
        Objects.equals(this.moveLearnMethod, pokemonDetailMovesInnerVersionGroupDetailsInner.moveLearnMethod) &&
        Objects.equals(this.versionGroup, pokemonDetailMovesInnerVersionGroupDetailsInner.versionGroup);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
