package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonDetailMovesInnerVersionGroupDetailsInner  {
  
  @ApiModelProperty(required = true, value = "")
  private Integer levelLearnedAt;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private AbilityDetailPokemonInnerPokemon moveLearnMethod;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private AbilityDetailPokemonInnerPokemon versionGroup;
 /**
  * Get levelLearnedAt
  * @return levelLearnedAt
  */
  @JsonProperty("level_learned_at")
  @NotNull
  public Integer getLevelLearnedAt() {
    return levelLearnedAt;
  }

  /**
   * Sets the <code>levelLearnedAt</code> property.
   */
 public void setLevelLearnedAt(Integer levelLearnedAt) {
    this.levelLearnedAt = levelLearnedAt;
  }

  /**
   * Sets the <code>levelLearnedAt</code> property.
   */
  public PokemonDetailMovesInnerVersionGroupDetailsInner levelLearnedAt(Integer levelLearnedAt) {
    this.levelLearnedAt = levelLearnedAt;
    return this;
  }

 /**
  * Get moveLearnMethod
  * @return moveLearnMethod
  */
  @JsonProperty("move_learn_method")
  @NotNull
  public AbilityDetailPokemonInnerPokemon getMoveLearnMethod() {
    return moveLearnMethod;
  }

  /**
   * Sets the <code>moveLearnMethod</code> property.
   */
 public void setMoveLearnMethod(AbilityDetailPokemonInnerPokemon moveLearnMethod) {
    this.moveLearnMethod = moveLearnMethod;
  }

  /**
   * Sets the <code>moveLearnMethod</code> property.
   */
  public PokemonDetailMovesInnerVersionGroupDetailsInner moveLearnMethod(AbilityDetailPokemonInnerPokemon moveLearnMethod) {
    this.moveLearnMethod = moveLearnMethod;
    return this;
  }

 /**
  * Get versionGroup
  * @return versionGroup
  */
  @JsonProperty("version_group")
  @NotNull
  public AbilityDetailPokemonInnerPokemon getVersionGroup() {
    return versionGroup;
  }

  /**
   * Sets the <code>versionGroup</code> property.
   */
 public void setVersionGroup(AbilityDetailPokemonInnerPokemon versionGroup) {
    this.versionGroup = versionGroup;
  }

  /**
   * Sets the <code>versionGroup</code> property.
   */
  public PokemonDetailMovesInnerVersionGroupDetailsInner versionGroup(AbilityDetailPokemonInnerPokemon versionGroup) {
    this.versionGroup = versionGroup;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

