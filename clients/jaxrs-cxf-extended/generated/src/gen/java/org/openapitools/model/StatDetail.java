package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CharacteristicSummary;
import org.openapitools.model.MoveDamageClassSummary;
import org.openapitools.model.StatDetailAffectingMoves;
import org.openapitools.model.StatDetailAffectingNatures;
import org.openapitools.model.StatName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class StatDetail  {
  
  @ApiModelProperty(required = true, value = "")
  private Integer id;

  @ApiModelProperty(required = true, value = "")
  private String name;

  @ApiModelProperty(required = true, value = "")
  private Integer gameIndex;

  @ApiModelProperty(value = "")
  private Boolean isBattleOnly;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private StatDetailAffectingMoves affectingMoves;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private StatDetailAffectingNatures affectingNatures;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid CharacteristicSummary> characteristics = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private MoveDamageClassSummary moveDamageClass;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid StatName> names = new ArrayList<>();
 /**
  * Get id
  * @return id
  */
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public StatDetail id(Integer id) {
    this.id = id;
    return this;
  }

 /**
  * Get name
  * @return name
  */
  @JsonProperty("name")
  @NotNull
 @Size(max=100)  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public StatDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Get gameIndex
  * @return gameIndex
  */
  @JsonProperty("game_index")
  @NotNull
  public Integer getGameIndex() {
    return gameIndex;
  }

  /**
   * Sets the <code>gameIndex</code> property.
   */
 public void setGameIndex(Integer gameIndex) {
    this.gameIndex = gameIndex;
  }

  /**
   * Sets the <code>gameIndex</code> property.
   */
  public StatDetail gameIndex(Integer gameIndex) {
    this.gameIndex = gameIndex;
    return this;
  }

 /**
  * Get isBattleOnly
  * @return isBattleOnly
  */
  @JsonProperty("is_battle_only")
  public Boolean getIsBattleOnly() {
    return isBattleOnly;
  }

  /**
   * Sets the <code>isBattleOnly</code> property.
   */
 public void setIsBattleOnly(Boolean isBattleOnly) {
    this.isBattleOnly = isBattleOnly;
  }

  /**
   * Sets the <code>isBattleOnly</code> property.
   */
  public StatDetail isBattleOnly(Boolean isBattleOnly) {
    this.isBattleOnly = isBattleOnly;
    return this;
  }

 /**
  * Get affectingMoves
  * @return affectingMoves
  */
  @JsonProperty("affecting_moves")
  @NotNull
  public StatDetailAffectingMoves getAffectingMoves() {
    return affectingMoves;
  }

  /**
   * Sets the <code>affectingMoves</code> property.
   */
 public void setAffectingMoves(StatDetailAffectingMoves affectingMoves) {
    this.affectingMoves = affectingMoves;
  }

  /**
   * Sets the <code>affectingMoves</code> property.
   */
  public StatDetail affectingMoves(StatDetailAffectingMoves affectingMoves) {
    this.affectingMoves = affectingMoves;
    return this;
  }

 /**
  * Get affectingNatures
  * @return affectingNatures
  */
  @JsonProperty("affecting_natures")
  @NotNull
  public StatDetailAffectingNatures getAffectingNatures() {
    return affectingNatures;
  }

  /**
   * Sets the <code>affectingNatures</code> property.
   */
 public void setAffectingNatures(StatDetailAffectingNatures affectingNatures) {
    this.affectingNatures = affectingNatures;
  }

  /**
   * Sets the <code>affectingNatures</code> property.
   */
  public StatDetail affectingNatures(StatDetailAffectingNatures affectingNatures) {
    this.affectingNatures = affectingNatures;
    return this;
  }

 /**
  * Get characteristics
  * @return characteristics
  */
  @JsonProperty("characteristics")
  @NotNull
  public List<@Valid CharacteristicSummary> getCharacteristics() {
    return characteristics;
  }

  /**
   * Sets the <code>characteristics</code> property.
   */
 public void setCharacteristics(List<@Valid CharacteristicSummary> characteristics) {
    this.characteristics = characteristics;
  }

  /**
   * Sets the <code>characteristics</code> property.
   */
  public StatDetail characteristics(List<@Valid CharacteristicSummary> characteristics) {
    this.characteristics = characteristics;
    return this;
  }

  /**
   * Adds a new item to the <code>characteristics</code> list.
   */
  public StatDetail addCharacteristicsItem(CharacteristicSummary characteristicsItem) {
    this.characteristics.add(characteristicsItem);
    return this;
  }

 /**
  * Get moveDamageClass
  * @return moveDamageClass
  */
  @JsonProperty("move_damage_class")
  @NotNull
  public MoveDamageClassSummary getMoveDamageClass() {
    return moveDamageClass;
  }

  /**
   * Sets the <code>moveDamageClass</code> property.
   */
 public void setMoveDamageClass(MoveDamageClassSummary moveDamageClass) {
    this.moveDamageClass = moveDamageClass;
  }

  /**
   * Sets the <code>moveDamageClass</code> property.
   */
  public StatDetail moveDamageClass(MoveDamageClassSummary moveDamageClass) {
    this.moveDamageClass = moveDamageClass;
    return this;
  }

 /**
  * Get names
  * @return names
  */
  @JsonProperty("names")
  @NotNull
  public List<@Valid StatName> getNames() {
    return names;
  }

  /**
   * Sets the <code>names</code> property.
   */
 public void setNames(List<@Valid StatName> names) {
    this.names = names;
  }

  /**
   * Sets the <code>names</code> property.
   */
  public StatDetail names(List<@Valid StatName> names) {
    this.names = names;
    return this;
  }

  /**
   * Adds a new item to the <code>names</code> list.
   */
  public StatDetail addNamesItem(StatName namesItem) {
    this.names.add(namesItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

