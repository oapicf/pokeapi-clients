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
import org.openapitools.model.ItemSummary;
import org.openapitools.model.MoveDamageClassSummary;
import org.openapitools.model.StatAffectingMoves;
import org.openapitools.model.StatAffectingNatures;
import org.openapitools.model.StatName;

/**
 * StatDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-11-09T13:49:25.341948748Z[Etc/UTC]", comments = "Generator version: 7.26.0")
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
  private StatAffectingMoves affectingMoves;

  @JsonProperty("affecting_natures")
  private StatAffectingNatures affectingNatures;

  @JsonProperty("affecting_items")
  private List<@Valid ItemSummary> affectingItems = new ArrayList<>();

  @JsonProperty("characteristics")
  private List<@Valid CharacteristicSummary> characteristics = new ArrayList<>();

  @JsonProperty("move_damage_class")
  private MoveDamageClassSummary moveDamageClass;

  @JsonProperty("names")
  private List<@Valid StatName> names = new ArrayList<>();

   /**
   * The identifier for this resource.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The identifier for this resource.")
  public Integer getId() {
    return id;
  }

  public StatDetail name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name for this resource.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name for this resource.")
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
   * ID the games use for this stat.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return gameIndex
  **/
  @ApiModelProperty(required = true, value = "ID the games use for this stat.")
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
   * Whether this stat only exists within a battle.
   * @return isBattleOnly
  **/
  @ApiModelProperty(value = "Whether this stat only exists within a battle.")
  public Boolean getIsBattleOnly() {
    return isBattleOnly;
  }

  public void setIsBattleOnly(Boolean isBattleOnly) {
    this.isBattleOnly = isBattleOnly;
  }

   /**
   * A detail of moves which affect this stat positively or negatively.
   * @return affectingMoves
  **/
  @ApiModelProperty(required = true, value = "A detail of moves which affect this stat positively or negatively.")
  public StatAffectingMoves getAffectingMoves() {
    return affectingMoves;
  }

   /**
   * A detail of natures which affect this stat positively or negatively.
   * @return affectingNatures
  **/
  @ApiModelProperty(required = true, value = "A detail of natures which affect this stat positively or negatively.")
  public StatAffectingNatures getAffectingNatures() {
    return affectingNatures;
  }

   /**
   * Items that affect this stat, such as vitamins and battle items.
   * @return affectingItems
  **/
  @ApiModelProperty(required = true, value = "Items that affect this stat, such as vitamins and battle items.")
  public List<@Valid ItemSummary> getAffectingItems() {
    return affectingItems;
  }

   /**
   * A list of characteristics that are set on a Pokémon when its highest base stat is this stat.
   * @return characteristics
  **/
  @ApiModelProperty(required = true, value = "A list of characteristics that are set on a Pokémon when its highest base stat is this stat.")
  public List<@Valid CharacteristicSummary> getCharacteristics() {
    return characteristics;
  }

  public StatDetail moveDamageClass(MoveDamageClassSummary moveDamageClass) {
    this.moveDamageClass = moveDamageClass;
    return this;
  }

   /**
   * The class of damage this stat is directly related to.
   * @return moveDamageClass
  **/
  @ApiModelProperty(required = true, value = "The class of damage this stat is directly related to.")
  public MoveDamageClassSummary getMoveDamageClass() {
    return moveDamageClass;
  }

  public void setMoveDamageClass(MoveDamageClassSummary moveDamageClass) {
    this.moveDamageClass = moveDamageClass;
  }

   /**
   * The name of this resource listed in different languages.
   * @return names
  **/
  @ApiModelProperty(required = true, value = "The name of this resource listed in different languages.")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

