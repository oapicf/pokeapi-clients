package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PokemonDetailMovesInnerVersionGroupDetailsInner
 */

@JsonTypeName("PokemonDetail_moves_inner_version_group_details_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-07T15:29:13.146999890Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokemonDetailMovesInnerVersionGroupDetailsInner {

  private Integer levelLearnedAt;

  private AbilityDetailPokemonInnerPokemon moveLearnMethod;

  private AbilityDetailPokemonInnerPokemon versionGroup;

  public PokemonDetailMovesInnerVersionGroupDetailsInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PokemonDetailMovesInnerVersionGroupDetailsInner(Integer levelLearnedAt, AbilityDetailPokemonInnerPokemon moveLearnMethod, AbilityDetailPokemonInnerPokemon versionGroup) {
    this.levelLearnedAt = levelLearnedAt;
    this.moveLearnMethod = moveLearnMethod;
    this.versionGroup = versionGroup;
  }

  public PokemonDetailMovesInnerVersionGroupDetailsInner levelLearnedAt(Integer levelLearnedAt) {
    this.levelLearnedAt = levelLearnedAt;
    return this;
  }

  /**
   * Get levelLearnedAt
   * @return levelLearnedAt
   */
  @NotNull 
  @Schema(name = "level_learned_at", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("level_learned_at")
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
  @NotNull @Valid 
  @Schema(name = "move_learn_method", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("move_learn_method")
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
  @NotNull @Valid 
  @Schema(name = "version_group", requiredMode = Schema.RequiredMode.REQUIRED)
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

