package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CharacteristicSummary;
import org.openapitools.model.MoveDamageClassSummary;
import org.openapitools.model.StatDetailAffectingMoves;
import org.openapitools.model.StatDetailAffectingNatures;
import org.openapitools.model.StatName;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-02-07T15:22:50.575598517Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class StatDetail   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("game_index")
  private Integer gameIndex;

  @JsonProperty("is_battle_only")
  private Boolean isBattleOnly;

  @JsonProperty("affecting_moves")
  private StatDetailAffectingMoves affectingMoves;

  @JsonProperty("affecting_natures")
  private StatDetailAffectingNatures affectingNatures;

  @JsonProperty("characteristics")
  private List<CharacteristicSummary> characteristics = new ArrayList<>();

  @JsonProperty("move_damage_class")
  private MoveDamageClassSummary moveDamageClass;

  @JsonProperty("names")
  private List<StatName> names = new ArrayList<>();

  /**
   **/
  public StatDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  public StatDetail name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public StatDetail gameIndex(Integer gameIndex) {
    this.gameIndex = gameIndex;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("game_index")
  public Integer getGameIndex() {
    return gameIndex;
  }
  public void setGameIndex(Integer gameIndex) {
    this.gameIndex = gameIndex;
  }

  /**
   **/
  public StatDetail isBattleOnly(Boolean isBattleOnly) {
    this.isBattleOnly = isBattleOnly;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("is_battle_only")
  public Boolean getIsBattleOnly() {
    return isBattleOnly;
  }
  public void setIsBattleOnly(Boolean isBattleOnly) {
    this.isBattleOnly = isBattleOnly;
  }

  /**
   **/
  public StatDetail affectingMoves(StatDetailAffectingMoves affectingMoves) {
    this.affectingMoves = affectingMoves;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("affecting_moves")
  public StatDetailAffectingMoves getAffectingMoves() {
    return affectingMoves;
  }
  public void setAffectingMoves(StatDetailAffectingMoves affectingMoves) {
    this.affectingMoves = affectingMoves;
  }

  /**
   **/
  public StatDetail affectingNatures(StatDetailAffectingNatures affectingNatures) {
    this.affectingNatures = affectingNatures;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("affecting_natures")
  public StatDetailAffectingNatures getAffectingNatures() {
    return affectingNatures;
  }
  public void setAffectingNatures(StatDetailAffectingNatures affectingNatures) {
    this.affectingNatures = affectingNatures;
  }

  /**
   **/
  public StatDetail characteristics(List<CharacteristicSummary> characteristics) {
    this.characteristics = characteristics;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("characteristics")
  public List<CharacteristicSummary> getCharacteristics() {
    return characteristics;
  }
  public void setCharacteristics(List<CharacteristicSummary> characteristics) {
    this.characteristics = characteristics;
  }

  /**
   **/
  public StatDetail moveDamageClass(MoveDamageClassSummary moveDamageClass) {
    this.moveDamageClass = moveDamageClass;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("move_damage_class")
  public MoveDamageClassSummary getMoveDamageClass() {
    return moveDamageClass;
  }
  public void setMoveDamageClass(MoveDamageClassSummary moveDamageClass) {
    this.moveDamageClass = moveDamageClass;
  }

  /**
   **/
  public StatDetail names(List<StatName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("names")
  public List<StatName> getNames() {
    return names;
  }
  public void setNames(List<StatName> names) {
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
    return Objects.equals(id, statDetail.id) &&
        Objects.equals(name, statDetail.name) &&
        Objects.equals(gameIndex, statDetail.gameIndex) &&
        Objects.equals(isBattleOnly, statDetail.isBattleOnly) &&
        Objects.equals(affectingMoves, statDetail.affectingMoves) &&
        Objects.equals(affectingNatures, statDetail.affectingNatures) &&
        Objects.equals(characteristics, statDetail.characteristics) &&
        Objects.equals(moveDamageClass, statDetail.moveDamageClass) &&
        Objects.equals(names, statDetail.names);
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

