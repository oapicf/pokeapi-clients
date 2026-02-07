package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CharacteristicSummary;
import org.openapitools.model.MoveDamageClassSummary;
import org.openapitools.model.StatDetailAffectingMoves;
import org.openapitools.model.StatDetailAffectingNatures;
import org.openapitools.model.StatName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * StatDetail
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-02-07T15:23:32.871052804Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class StatDetail {

  private Integer id;

  private String name;

  private Integer gameIndex;

  private Boolean isBattleOnly;

  private StatDetailAffectingMoves affectingMoves;

  private StatDetailAffectingNatures affectingNatures;

  @Valid
  private List<@Valid CharacteristicSummary> characteristics = new ArrayList<>();

  private MoveDamageClassSummary moveDamageClass;

  @Valid
  private List<@Valid StatName> names = new ArrayList<>();

  public StatDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public StatDetail(Integer id, String name, Integer gameIndex, StatDetailAffectingMoves affectingMoves, StatDetailAffectingNatures affectingNatures, List<@Valid CharacteristicSummary> characteristics, MoveDamageClassSummary moveDamageClass, List<@Valid StatName> names) {
    this.id = id;
    this.name = name;
    this.gameIndex = gameIndex;
    this.affectingMoves = affectingMoves;
    this.affectingNatures = affectingNatures;
    this.characteristics = characteristics;
    this.moveDamageClass = moveDamageClass;
    this.names = names;
  }

  public StatDetail id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public StatDetail name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @NotNull @Size(max = 100) 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StatDetail gameIndex(Integer gameIndex) {
    this.gameIndex = gameIndex;
    return this;
  }

  /**
   * Get gameIndex
   * @return gameIndex
   */
  @NotNull 
  @Schema(name = "game_index", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("game_index")
  public Integer getGameIndex() {
    return gameIndex;
  }

  public void setGameIndex(Integer gameIndex) {
    this.gameIndex = gameIndex;
  }

  public StatDetail isBattleOnly(Boolean isBattleOnly) {
    this.isBattleOnly = isBattleOnly;
    return this;
  }

  /**
   * Get isBattleOnly
   * @return isBattleOnly
   */
  
  @Schema(name = "is_battle_only", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_battle_only")
  public Boolean getIsBattleOnly() {
    return isBattleOnly;
  }

  public void setIsBattleOnly(Boolean isBattleOnly) {
    this.isBattleOnly = isBattleOnly;
  }

  public StatDetail affectingMoves(StatDetailAffectingMoves affectingMoves) {
    this.affectingMoves = affectingMoves;
    return this;
  }

  /**
   * Get affectingMoves
   * @return affectingMoves
   */
  @NotNull @Valid 
  @Schema(name = "affecting_moves", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("affecting_moves")
  public StatDetailAffectingMoves getAffectingMoves() {
    return affectingMoves;
  }

  public void setAffectingMoves(StatDetailAffectingMoves affectingMoves) {
    this.affectingMoves = affectingMoves;
  }

  public StatDetail affectingNatures(StatDetailAffectingNatures affectingNatures) {
    this.affectingNatures = affectingNatures;
    return this;
  }

  /**
   * Get affectingNatures
   * @return affectingNatures
   */
  @NotNull @Valid 
  @Schema(name = "affecting_natures", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("affecting_natures")
  public StatDetailAffectingNatures getAffectingNatures() {
    return affectingNatures;
  }

  public void setAffectingNatures(StatDetailAffectingNatures affectingNatures) {
    this.affectingNatures = affectingNatures;
  }

  public StatDetail characteristics(List<@Valid CharacteristicSummary> characteristics) {
    this.characteristics = characteristics;
    return this;
  }

  public StatDetail addCharacteristicsItem(CharacteristicSummary characteristicsItem) {
    if (this.characteristics == null) {
      this.characteristics = new ArrayList<>();
    }
    this.characteristics.add(characteristicsItem);
    return this;
  }

  /**
   * Get characteristics
   * @return characteristics
   */
  @NotNull @Valid 
  @Schema(name = "characteristics", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("characteristics")
  public List<@Valid CharacteristicSummary> getCharacteristics() {
    return characteristics;
  }

  public void setCharacteristics(List<@Valid CharacteristicSummary> characteristics) {
    this.characteristics = characteristics;
  }

  public StatDetail moveDamageClass(MoveDamageClassSummary moveDamageClass) {
    this.moveDamageClass = moveDamageClass;
    return this;
  }

  /**
   * Get moveDamageClass
   * @return moveDamageClass
   */
  @NotNull @Valid 
  @Schema(name = "move_damage_class", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("move_damage_class")
  public MoveDamageClassSummary getMoveDamageClass() {
    return moveDamageClass;
  }

  public void setMoveDamageClass(MoveDamageClassSummary moveDamageClass) {
    this.moveDamageClass = moveDamageClass;
  }

  public StatDetail names(List<@Valid StatName> names) {
    this.names = names;
    return this;
  }

  public StatDetail addNamesItem(StatName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }

  /**
   * Get names
   * @return names
   */
  @NotNull @Valid 
  @Schema(name = "names", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("names")
  public List<@Valid StatName> getNames() {
    return names;
  }

  public void setNames(List<@Valid StatName> names) {
    this.names = names;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatDetail statDetail = (StatDetail) o;
    return Objects.equals(this.id, statDetail.id) &&
        Objects.equals(this.name, statDetail.name) &&
        Objects.equals(this.gameIndex, statDetail.gameIndex) &&
        Objects.equals(this.isBattleOnly, statDetail.isBattleOnly) &&
        Objects.equals(this.affectingMoves, statDetail.affectingMoves) &&
        Objects.equals(this.affectingNatures, statDetail.affectingNatures) &&
        Objects.equals(this.characteristics, statDetail.characteristics) &&
        Objects.equals(this.moveDamageClass, statDetail.moveDamageClass) &&
        Objects.equals(this.names, statDetail.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, gameIndex, isBattleOnly, affectingMoves, affectingNatures, characteristics, moveDamageClass, names);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatDetail {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    gameIndex: ").append(toIndentedString(gameIndex)).append("\n");
    sb.append("    isBattleOnly: ").append(toIndentedString(isBattleOnly)).append("\n");
    sb.append("    affectingMoves: ").append(toIndentedString(affectingMoves)).append("\n");
    sb.append("    affectingNatures: ").append(toIndentedString(affectingNatures)).append("\n");
    sb.append("    characteristics: ").append(toIndentedString(characteristics)).append("\n");
    sb.append("    moveDamageClass: ").append(toIndentedString(moveDamageClass)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
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

