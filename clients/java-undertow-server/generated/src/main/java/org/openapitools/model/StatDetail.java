/*
 * PokéAPI
 *
 * All the Pokémon data you'll ever need in one place, easily accessible through a modern free open-source RESTful API.  ## What is this?  This is a full RESTful API linked to an extensive database detailing everything about the Pokémon main game series.  We've covered everything from Pokémon to Berry Flavors.  ## Where do I start?  We have awesome [documentation](https://pokeapi.co/docs/v2) on how to use this API. It takes minutes to get started.  This API will always be publicly available and will never require any extensive setup process to consume.  Created by [**Paul Hallett**](https://github.com/phalt) and other [**PokéAPI contributors**](https://github.com/PokeAPI/pokeapi#contributing) around the world. Pokémon and Pokémon character names are trademarks of Nintendo.
 *
 * OpenAPI document version: 2.10.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
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





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-11-09T13:49:34.675912514Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class StatDetail   {
  
  private Integer id;
  private String name;
  private Integer gameIndex;
  private Boolean isBattleOnly;
  private StatAffectingMoves affectingMoves;
  private StatAffectingNatures affectingNatures;
  private List<ItemSummary> affectingItems = new ArrayList<>();
  private List<CharacteristicSummary> characteristics = new ArrayList<>();
  private MoveDamageClassSummary moveDamageClass;
  private List<StatName> names = new ArrayList<>();

  /**
   * The identifier for this resource.
   */
  public StatDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The identifier for this resource.")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The name for this resource.
   */
  public StatDetail name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name for this resource.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * ID the games use for this stat.
   * minimum: -2147483648
   * maximum: 2147483647
   */
  public StatDetail gameIndex(Integer gameIndex) {
    this.gameIndex = gameIndex;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "ID the games use for this stat.")
  @JsonProperty("game_index")
  public Integer getGameIndex() {
    return gameIndex;
  }
  public void setGameIndex(Integer gameIndex) {
    this.gameIndex = gameIndex;
  }

  /**
   * Whether this stat only exists within a battle.
   */
  public StatDetail isBattleOnly(Boolean isBattleOnly) {
    this.isBattleOnly = isBattleOnly;
    return this;
  }

  
  @ApiModelProperty(value = "Whether this stat only exists within a battle.")
  @JsonProperty("is_battle_only")
  public Boolean getIsBattleOnly() {
    return isBattleOnly;
  }
  public void setIsBattleOnly(Boolean isBattleOnly) {
    this.isBattleOnly = isBattleOnly;
  }

  /**
   * A detail of moves which affect this stat positively or negatively.
   */
  public StatDetail affectingMoves(StatAffectingMoves affectingMoves) {
    this.affectingMoves = affectingMoves;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A detail of moves which affect this stat positively or negatively.")
  @JsonProperty("affecting_moves")
  public StatAffectingMoves getAffectingMoves() {
    return affectingMoves;
  }
  public void setAffectingMoves(StatAffectingMoves affectingMoves) {
    this.affectingMoves = affectingMoves;
  }

  /**
   * A detail of natures which affect this stat positively or negatively.
   */
  public StatDetail affectingNatures(StatAffectingNatures affectingNatures) {
    this.affectingNatures = affectingNatures;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A detail of natures which affect this stat positively or negatively.")
  @JsonProperty("affecting_natures")
  public StatAffectingNatures getAffectingNatures() {
    return affectingNatures;
  }
  public void setAffectingNatures(StatAffectingNatures affectingNatures) {
    this.affectingNatures = affectingNatures;
  }

  /**
   * Items that affect this stat, such as vitamins and battle items.
   */
  public StatDetail affectingItems(List<ItemSummary> affectingItems) {
    this.affectingItems = affectingItems;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Items that affect this stat, such as vitamins and battle items.")
  @JsonProperty("affecting_items")
  public List<ItemSummary> getAffectingItems() {
    return affectingItems;
  }
  public void setAffectingItems(List<ItemSummary> affectingItems) {
    this.affectingItems = affectingItems;
  }

  /**
   * A list of characteristics that are set on a Pokémon when its highest base stat is this stat.
   */
  public StatDetail characteristics(List<CharacteristicSummary> characteristics) {
    this.characteristics = characteristics;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of characteristics that are set on a Pokémon when its highest base stat is this stat.")
  @JsonProperty("characteristics")
  public List<CharacteristicSummary> getCharacteristics() {
    return characteristics;
  }
  public void setCharacteristics(List<CharacteristicSummary> characteristics) {
    this.characteristics = characteristics;
  }

  /**
   * The class of damage this stat is directly related to.
   */
  public StatDetail moveDamageClass(MoveDamageClassSummary moveDamageClass) {
    this.moveDamageClass = moveDamageClass;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The class of damage this stat is directly related to.")
  @JsonProperty("move_damage_class")
  public MoveDamageClassSummary getMoveDamageClass() {
    return moveDamageClass;
  }
  public void setMoveDamageClass(MoveDamageClassSummary moveDamageClass) {
    this.moveDamageClass = moveDamageClass;
  }

  /**
   * The name of this resource listed in different languages.
   */
  public StatDetail names(List<StatName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name of this resource listed in different languages.")
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
        Objects.equals(affectingItems, statDetail.affectingItems) &&
        Objects.equals(characteristics, statDetail.characteristics) &&
        Objects.equals(moveDamageClass, statDetail.moveDamageClass) &&
        Objects.equals(names, statDetail.names);
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

