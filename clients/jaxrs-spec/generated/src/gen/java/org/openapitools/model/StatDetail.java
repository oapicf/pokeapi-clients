package org.openapitools.model;

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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("StatDetail")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-11-09T13:50:06.168269698Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class StatDetail   {
  private Integer id;
  private String name;
  private Integer gameIndex;
  private Boolean isBattleOnly;
  private StatAffectingMoves affectingMoves;
  private StatAffectingNatures affectingNatures;
  private List<@Valid ItemSummary> affectingItems = new ArrayList<>();
  private List<@Valid CharacteristicSummary> characteristics = new ArrayList<>();
  private MoveDamageClassSummary moveDamageClass;
  private List<@Valid StatName> names = new ArrayList<>();

  public StatDetail() {
  }

  @JsonCreator
  public StatDetail(
    @JsonProperty(required = true, value = "id") Integer id,
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "game_index") Integer gameIndex,
    @JsonProperty(required = true, value = "affecting_moves") StatAffectingMoves affectingMoves,
    @JsonProperty(required = true, value = "affecting_natures") StatAffectingNatures affectingNatures,
    @JsonProperty(required = true, value = "affecting_items") List<@Valid ItemSummary> affectingItems,
    @JsonProperty(required = true, value = "characteristics") List<@Valid CharacteristicSummary> characteristics,
    @JsonProperty(required = true, value = "move_damage_class") MoveDamageClassSummary moveDamageClass,
    @JsonProperty(required = true, value = "names") List<@Valid StatName> names
  ) {
    this.id = id;
    this.name = name;
    this.gameIndex = gameIndex;
    this.affectingMoves = affectingMoves;
    this.affectingNatures = affectingNatures;
    this.affectingItems = affectingItems;
    this.characteristics = characteristics;
    this.moveDamageClass = moveDamageClass;
    this.names = names;
  }

  /**
   * The identifier for this resource.
   **/
  public StatDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The identifier for this resource.")
  @JsonProperty(required = true, value = "id")
  public Integer getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The name for this resource.
   **/
  public StatDetail name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name for this resource.")
  @JsonProperty(required = true, value = "name")
  @NotNull  @Size(max=200)public String getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * ID the games use for this stat.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public StatDetail gameIndex(Integer gameIndex) {
    this.gameIndex = gameIndex;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "ID the games use for this stat.")
  @JsonProperty(required = true, value = "game_index")
  @NotNull  @Min(-2147483648) @Max(2147483647)public Integer getGameIndex() {
    return gameIndex;
  }

  @JsonProperty(required = true, value = "game_index")
  public void setGameIndex(Integer gameIndex) {
    this.gameIndex = gameIndex;
  }

  /**
   * Whether this stat only exists within a battle.
   **/
  public StatDetail isBattleOnly(Boolean isBattleOnly) {
    this.isBattleOnly = isBattleOnly;
    return this;
  }

  
  @ApiModelProperty(value = "Whether this stat only exists within a battle.")
  @JsonProperty("is_battle_only")
  public Boolean getIsBattleOnly() {
    return isBattleOnly;
  }

  @JsonProperty("is_battle_only")
  public void setIsBattleOnly(Boolean isBattleOnly) {
    this.isBattleOnly = isBattleOnly;
  }

  /**
   * A detail of moves which affect this stat positively or negatively.
   **/
  public StatDetail affectingMoves(StatAffectingMoves affectingMoves) {
    this.affectingMoves = affectingMoves;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A detail of moves which affect this stat positively or negatively.")
  @JsonProperty(required = true, value = "affecting_moves")
  @Valid public StatAffectingMoves getAffectingMoves() {
    return affectingMoves;
  }

  @JsonProperty(required = true, value = "affecting_moves")
  public void setAffectingMoves(StatAffectingMoves affectingMoves) {
    this.affectingMoves = affectingMoves;
  }

  /**
   * A detail of natures which affect this stat positively or negatively.
   **/
  public StatDetail affectingNatures(StatAffectingNatures affectingNatures) {
    this.affectingNatures = affectingNatures;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A detail of natures which affect this stat positively or negatively.")
  @JsonProperty(required = true, value = "affecting_natures")
  @Valid public StatAffectingNatures getAffectingNatures() {
    return affectingNatures;
  }

  @JsonProperty(required = true, value = "affecting_natures")
  public void setAffectingNatures(StatAffectingNatures affectingNatures) {
    this.affectingNatures = affectingNatures;
  }

  /**
   * Items that affect this stat, such as vitamins and battle items.
   **/
  public StatDetail affectingItems(List<@Valid ItemSummary> affectingItems) {
    this.affectingItems = affectingItems;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Items that affect this stat, such as vitamins and battle items.")
  @JsonProperty(required = true, value = "affecting_items")
  public List<@Valid ItemSummary> getAffectingItems() {
    return affectingItems;
  }

  @JsonProperty(required = true, value = "affecting_items")
  public void setAffectingItems(List<@Valid ItemSummary> affectingItems) {
    this.affectingItems = affectingItems;
  }

  public StatDetail addAffectingItemsItem(ItemSummary affectingItemsItem) {
    if (this.affectingItems == null) {
      this.affectingItems = new ArrayList<>();
    }

    this.affectingItems.add(affectingItemsItem);
    return this;
  }

  public StatDetail removeAffectingItemsItem(ItemSummary affectingItemsItem) {
    if (affectingItemsItem != null && this.affectingItems != null) {
      this.affectingItems.remove(affectingItemsItem);
    }

    return this;
  }
  /**
   * A list of characteristics that are set on a Pokémon when its highest base stat is this stat.
   **/
  public StatDetail characteristics(List<@Valid CharacteristicSummary> characteristics) {
    this.characteristics = characteristics;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of characteristics that are set on a Pokémon when its highest base stat is this stat.")
  @JsonProperty(required = true, value = "characteristics")
  public List<@Valid CharacteristicSummary> getCharacteristics() {
    return characteristics;
  }

  @JsonProperty(required = true, value = "characteristics")
  public void setCharacteristics(List<@Valid CharacteristicSummary> characteristics) {
    this.characteristics = characteristics;
  }

  public StatDetail addCharacteristicsItem(CharacteristicSummary characteristicsItem) {
    if (this.characteristics == null) {
      this.characteristics = new ArrayList<>();
    }

    this.characteristics.add(characteristicsItem);
    return this;
  }

  public StatDetail removeCharacteristicsItem(CharacteristicSummary characteristicsItem) {
    if (characteristicsItem != null && this.characteristics != null) {
      this.characteristics.remove(characteristicsItem);
    }

    return this;
  }
  /**
   * The class of damage this stat is directly related to.
   **/
  public StatDetail moveDamageClass(MoveDamageClassSummary moveDamageClass) {
    this.moveDamageClass = moveDamageClass;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The class of damage this stat is directly related to.")
  @JsonProperty(required = true, value = "move_damage_class")
  @NotNull @Valid public MoveDamageClassSummary getMoveDamageClass() {
    return moveDamageClass;
  }

  @JsonProperty(required = true, value = "move_damage_class")
  public void setMoveDamageClass(MoveDamageClassSummary moveDamageClass) {
    this.moveDamageClass = moveDamageClass;
  }

  /**
   * The name of this resource listed in different languages.
   **/
  public StatDetail names(List<@Valid StatName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name of this resource listed in different languages.")
  @JsonProperty(required = true, value = "names")
  public List<@Valid StatName> getNames() {
    return names;
  }

  @JsonProperty(required = true, value = "names")
  public void setNames(List<@Valid StatName> names) {
    this.names = names;
  }

  public StatDetail addNamesItem(StatName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }

    this.names.add(namesItem);
    return this;
  }

  public StatDetail removeNamesItem(StatName namesItem) {
    if (namesItem != null && this.names != null) {
      this.names.remove(namesItem);
    }

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
