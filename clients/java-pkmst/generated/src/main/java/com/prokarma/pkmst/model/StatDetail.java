package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.CharacteristicSummary;
import com.prokarma.pkmst.model.ItemSummary;
import com.prokarma.pkmst.model.MoveDamageClassSummary;
import com.prokarma.pkmst.model.StatAffectingMoves;
import com.prokarma.pkmst.model.StatAffectingNatures;
import com.prokarma.pkmst.model.StatName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * StatDetail
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-11-09T13:49:28.343088631Z[Etc/UTC]", comments = "Generator version: 7.26.0")
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
  
  private List<ItemSummary> affectingItems = new ArrayList<>();

  @JsonProperty("characteristics")
  
  private List<CharacteristicSummary> characteristics = new ArrayList<>();

  @JsonProperty("move_damage_class")
  private MoveDamageClassSummary moveDamageClass;

  @JsonProperty("names")
  
  private List<StatName> names = new ArrayList<>();

  public StatDetail id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The identifier for this resource.
   * @return id
   */
  @ApiModelProperty(required = true, readOnly = true, value = "The identifier for this resource.")
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
   * The name for this resource.
   * @return name
   */
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
   */
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
   */
  @ApiModelProperty(value = "Whether this stat only exists within a battle.")
  public Boolean getIsBattleOnly() {
    return isBattleOnly;
  }

  public void setIsBattleOnly(Boolean isBattleOnly) {
    this.isBattleOnly = isBattleOnly;
  }

  public StatDetail affectingMoves(StatAffectingMoves affectingMoves) {
    this.affectingMoves = affectingMoves;
    return this;
  }

  /**
   * A detail of moves which affect this stat positively or negatively.
   * @return affectingMoves
   */
  @ApiModelProperty(required = true, readOnly = true, value = "A detail of moves which affect this stat positively or negatively.")
  public StatAffectingMoves getAffectingMoves() {
    return affectingMoves;
  }

  public void setAffectingMoves(StatAffectingMoves affectingMoves) {
    this.affectingMoves = affectingMoves;
  }

  public StatDetail affectingNatures(StatAffectingNatures affectingNatures) {
    this.affectingNatures = affectingNatures;
    return this;
  }

  /**
   * A detail of natures which affect this stat positively or negatively.
   * @return affectingNatures
   */
  @ApiModelProperty(required = true, readOnly = true, value = "A detail of natures which affect this stat positively or negatively.")
  public StatAffectingNatures getAffectingNatures() {
    return affectingNatures;
  }

  public void setAffectingNatures(StatAffectingNatures affectingNatures) {
    this.affectingNatures = affectingNatures;
  }

  public StatDetail affectingItems(List<ItemSummary> affectingItems) {
    this.affectingItems = affectingItems;
    return this;
  }

  public StatDetail addAffectingItemsItem(ItemSummary affectingItemsItem) {
    if (this.affectingItems == null) {
      this.affectingItems = new ArrayList<>();
    }
    this.affectingItems.add(affectingItemsItem);
    return this;
  }

  /**
   * Items that affect this stat, such as vitamins and battle items.
   * @return affectingItems
   */
  @ApiModelProperty(required = true, readOnly = true, value = "Items that affect this stat, such as vitamins and battle items.")
  public List<ItemSummary> getAffectingItems() {
    return affectingItems;
  }

  public void setAffectingItems(List<ItemSummary> affectingItems) {
    this.affectingItems = affectingItems;
  }

  public StatDetail characteristics(List<CharacteristicSummary> characteristics) {
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
   * A list of characteristics that are set on a Pokémon when its highest base stat is this stat.
   * @return characteristics
   */
  @ApiModelProperty(required = true, readOnly = true, value = "A list of characteristics that are set on a Pokémon when its highest base stat is this stat.")
  public List<CharacteristicSummary> getCharacteristics() {
    return characteristics;
  }

  public void setCharacteristics(List<CharacteristicSummary> characteristics) {
    this.characteristics = characteristics;
  }

  public StatDetail moveDamageClass(MoveDamageClassSummary moveDamageClass) {
    this.moveDamageClass = moveDamageClass;
    return this;
  }

  /**
   * The class of damage this stat is directly related to.
   * @return moveDamageClass
   */
  @ApiModelProperty(required = true, value = "The class of damage this stat is directly related to.")
  public MoveDamageClassSummary getMoveDamageClass() {
    return moveDamageClass;
  }

  public void setMoveDamageClass(MoveDamageClassSummary moveDamageClass) {
    this.moveDamageClass = moveDamageClass;
  }

  public StatDetail names(List<StatName> names) {
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
   * The name of this resource listed in different languages.
   * @return names
   */
  @ApiModelProperty(required = true, readOnly = true, value = "The name of this resource listed in different languages.")
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

