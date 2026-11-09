package org.openapitools.model;

import org.openapitools.model.CharacteristicSummary;
import org.openapitools.model.ItemSummary;
import org.openapitools.model.MoveDamageClassSummary;
import org.openapitools.model.StatAffectingMoves;
import org.openapitools.model.StatAffectingNatures;
import org.openapitools.model.StatName;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class StatDetail implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The identifier for this resource.
   */
  @JsonProperty("id")
  private Integer id;

  /**
   * The name for this resource.
   */
  @JsonProperty("name")
  private String name;

  /**
   * ID the games use for this stat.
   */
  @JsonProperty("game_index")
  private Integer gameIndex;

  /**
   * Whether this stat only exists within a battle.
   */
  @JsonProperty("is_battle_only")
  private Boolean isBattleOnly;

  /**
   * A detail of moves which affect this stat positively or negatively.
   */
  @JsonProperty("affecting_moves")
  private StatAffectingMoves affectingMoves;

  /**
   * A detail of natures which affect this stat positively or negatively.
   */
  @JsonProperty("affecting_natures")
  private StatAffectingNatures affectingNatures;

  /**
   * Items that affect this stat, such as vitamins and battle items.
   */
  @JsonProperty("affecting_items")
  private List<ItemSummary> affectingItems = new ArrayList<>();

  /**
   * A list of characteristics that are set on a Pokémon when its highest base stat is this stat.
   */
  @JsonProperty("characteristics")
  private List<CharacteristicSummary> characteristics = new ArrayList<>();

  /**
   * The class of damage this stat is directly related to.
   */
  @JsonProperty("move_damage_class")
  private MoveDamageClassSummary moveDamageClass;

  /**
   * The name of this resource listed in different languages.
   */
  @JsonProperty("names")
  private List<StatName> names = new ArrayList<>();

  /**
   * The identifier for this resource.
   * @return id
   */
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The name for this resource.
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * ID the games use for this stat.
   * @return gameIndex
   */
  public Integer getGameIndex() {
    return gameIndex;
  }

  public void setGameIndex(Integer gameIndex) {
    this.gameIndex = gameIndex;
  }

  /**
   * Whether this stat only exists within a battle.
   * @return isBattleOnly
   */
  public Boolean getIsBattleOnly() {
    return isBattleOnly;
  }

  public void setIsBattleOnly(Boolean isBattleOnly) {
    this.isBattleOnly = isBattleOnly;
  }

  /**
   * A detail of moves which affect this stat positively or negatively.
   * @return affectingMoves
   */
  public StatAffectingMoves getAffectingMoves() {
    return affectingMoves;
  }

  public void setAffectingMoves(StatAffectingMoves affectingMoves) {
    this.affectingMoves = affectingMoves;
  }

  /**
   * A detail of natures which affect this stat positively or negatively.
   * @return affectingNatures
   */
  public StatAffectingNatures getAffectingNatures() {
    return affectingNatures;
  }

  public void setAffectingNatures(StatAffectingNatures affectingNatures) {
    this.affectingNatures = affectingNatures;
  }

  /**
   * Items that affect this stat, such as vitamins and battle items.
   * @return affectingItems
   */
  public List<ItemSummary> getAffectingItems() {
    return affectingItems;
  }

  public void setAffectingItems(List<ItemSummary> affectingItems) {
    this.affectingItems = affectingItems;
  }

  /**
   * A list of characteristics that are set on a Pokémon when its highest base stat is this stat.
   * @return characteristics
   */
  public List<CharacteristicSummary> getCharacteristics() {
    return characteristics;
  }

  public void setCharacteristics(List<CharacteristicSummary> characteristics) {
    this.characteristics = characteristics;
  }

  /**
   * The class of damage this stat is directly related to.
   * @return moveDamageClass
   */
  public MoveDamageClassSummary getMoveDamageClass() {
    return moveDamageClass;
  }

  public void setMoveDamageClass(MoveDamageClassSummary moveDamageClass) {
    this.moveDamageClass = moveDamageClass;
  }

  /**
   * The name of this resource listed in different languages.
   * @return names
   */
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
