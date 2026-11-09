package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CharacteristicSummary;
import org.openapitools.model.ItemSummary;
import org.openapitools.model.MoveDamageClassSummary;
import org.openapitools.model.StatAffectingMoves;
import org.openapitools.model.StatAffectingNatures;
import org.openapitools.model.StatName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class StatDetail  {
  
 /**
  * The identifier for this resource.
  */
  @ApiModelProperty(required = true, value = "The identifier for this resource.")

  private Integer id;

 /**
  * The name for this resource.
  */
  @ApiModelProperty(required = true, value = "The name for this resource.")

  private String name;

 /**
  * ID the games use for this stat.
  */
  @ApiModelProperty(required = true, value = "ID the games use for this stat.")

  private Integer gameIndex;

 /**
  * Whether this stat only exists within a battle.
  */
  @ApiModelProperty(value = "Whether this stat only exists within a battle.")

  private Boolean isBattleOnly;

 /**
  * A detail of moves which affect this stat positively or negatively.
  */
  @ApiModelProperty(required = true, value = "A detail of moves which affect this stat positively or negatively.")

  @Valid

  private StatAffectingMoves affectingMoves;

 /**
  * A detail of natures which affect this stat positively or negatively.
  */
  @ApiModelProperty(required = true, value = "A detail of natures which affect this stat positively or negatively.")

  @Valid

  private StatAffectingNatures affectingNatures;

 /**
  * Items that affect this stat, such as vitamins and battle items.
  */
  @ApiModelProperty(required = true, value = "Items that affect this stat, such as vitamins and battle items.")

  private List<@Valid ItemSummary> affectingItems = new ArrayList<>();

 /**
  * A list of characteristics that are set on a Pokémon when its highest base stat is this stat.
  */
  @ApiModelProperty(required = true, value = "A list of characteristics that are set on a Pokémon when its highest base stat is this stat.")

  private List<@Valid CharacteristicSummary> characteristics = new ArrayList<>();

 /**
  * The class of damage this stat is directly related to.
  */
  @ApiModelProperty(required = true, value = "The class of damage this stat is directly related to.")

  @Valid

  private MoveDamageClassSummary moveDamageClass;

 /**
  * The name of this resource listed in different languages.
  */
  @ApiModelProperty(required = true, value = "The name of this resource listed in different languages.")

  private List<@Valid StatName> names = new ArrayList<>();
 /**
   * The identifier for this resource.
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }


 /**
   * The name for this resource.
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
 @Size(max=200)  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StatDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
   * ID the games use for this stat.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return gameIndex
  **/
  @JsonProperty("game_index")
  @NotNull
 @Min(-2147483648) @Max(2147483647)  public Integer getGameIndex() {
    return gameIndex;
  }

  public void setGameIndex(Integer gameIndex) {
    this.gameIndex = gameIndex;
  }

  public StatDetail gameIndex(Integer gameIndex) {
    this.gameIndex = gameIndex;
    return this;
  }

 /**
   * Whether this stat only exists within a battle.
   * @return isBattleOnly
  **/
  @JsonProperty("is_battle_only")
  public Boolean getIsBattleOnly() {
    return isBattleOnly;
  }

  public void setIsBattleOnly(Boolean isBattleOnly) {
    this.isBattleOnly = isBattleOnly;
  }

  public StatDetail isBattleOnly(Boolean isBattleOnly) {
    this.isBattleOnly = isBattleOnly;
    return this;
  }

 /**
   * A detail of moves which affect this stat positively or negatively.
   * @return affectingMoves
  **/
  @JsonProperty("affecting_moves")
  @NotNull
  public StatAffectingMoves getAffectingMoves() {
    return affectingMoves;
  }


 /**
   * A detail of natures which affect this stat positively or negatively.
   * @return affectingNatures
  **/
  @JsonProperty("affecting_natures")
  @NotNull
  public StatAffectingNatures getAffectingNatures() {
    return affectingNatures;
  }


 /**
   * Items that affect this stat, such as vitamins and battle items.
   * @return affectingItems
  **/
  @JsonProperty("affecting_items")
  @NotNull
  public List<@Valid ItemSummary> getAffectingItems() {
    return affectingItems;
  }


 /**
   * A list of characteristics that are set on a Pokémon when its highest base stat is this stat.
   * @return characteristics
  **/
  @JsonProperty("characteristics")
  @NotNull
  public List<@Valid CharacteristicSummary> getCharacteristics() {
    return characteristics;
  }


 /**
   * The class of damage this stat is directly related to.
   * @return moveDamageClass
  **/
  @JsonProperty("move_damage_class")
  @NotNull
  public MoveDamageClassSummary getMoveDamageClass() {
    return moveDamageClass;
  }

  public void setMoveDamageClass(MoveDamageClassSummary moveDamageClass) {
    this.moveDamageClass = moveDamageClass;
  }

  public StatDetail moveDamageClass(MoveDamageClassSummary moveDamageClass) {
    this.moveDamageClass = moveDamageClass;
    return this;
  }

 /**
   * The name of this resource listed in different languages.
   * @return names
  **/
  @JsonProperty("names")
  @NotNull
  public List<@Valid StatName> getNames() {
    return names;
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
        Objects.equals(this.affectingItems, statDetail.affectingItems) &&
        Objects.equals(this.characteristics, statDetail.characteristics) &&
        Objects.equals(this.moveDamageClass, statDetail.moveDamageClass) &&
        Objects.equals(this.names, statDetail.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, gameIndex, isBattleOnly, affectingMoves, affectingNatures, affectingItems, characteristics, moveDamageClass, names);
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
    sb.append("    affectingItems: ").append(toIndentedString(affectingItems)).append("\n");
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

