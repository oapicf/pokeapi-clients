package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.AbilityDetailPokemonInnerPokemon;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * PokemonDetailMovesInnerVersionGroupDetailsInner
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-02-07T15:23:15.032724200Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokemonDetailMovesInnerVersionGroupDetailsInner   {
  @JsonProperty("level_learned_at")
  private Integer levelLearnedAt;

  @JsonProperty("move_learn_method")
  private AbilityDetailPokemonInnerPokemon moveLearnMethod;

  @JsonProperty("version_group")
  private AbilityDetailPokemonInnerPokemon versionGroup;

  public PokemonDetailMovesInnerVersionGroupDetailsInner levelLearnedAt(Integer levelLearnedAt) {
    this.levelLearnedAt = levelLearnedAt;
    return this;
  }

  /**
   * Get levelLearnedAt
   * @return levelLearnedAt
   */
  @ApiModelProperty(required = true, value = "")
  public Integer getLevelLearnedAt() {
    return levelLearnedAt;
  }

  public void setLevelLearnedAt(Integer levelLearnedAt) {
    this.levelLearnedAt = levelLearnedAt;
  }

  public PokemonDetailMovesInnerVersionGroupDetailsInner moveLearnMethod(AbilityDetailPokemonInnerPokemon moveLearnMethod) {
    this.moveLearnMethod = moveLearnMethod;
    return this;
  }

  /**
   * Get moveLearnMethod
   * @return moveLearnMethod
   */
  @ApiModelProperty(required = true, value = "")
  public AbilityDetailPokemonInnerPokemon getMoveLearnMethod() {
    return moveLearnMethod;
  }

  public void setMoveLearnMethod(AbilityDetailPokemonInnerPokemon moveLearnMethod) {
    this.moveLearnMethod = moveLearnMethod;
  }

  public PokemonDetailMovesInnerVersionGroupDetailsInner versionGroup(AbilityDetailPokemonInnerPokemon versionGroup) {
    this.versionGroup = versionGroup;
    return this;
  }

  /**
   * Get versionGroup
   * @return versionGroup
   */
  @ApiModelProperty(required = true, value = "")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

