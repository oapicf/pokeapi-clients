package apimodels;

import apimodels.CharacteristicSummary;
import apimodels.ItemSummary;
import apimodels.MoveDamageClassSummary;
import apimodels.StatAffectingMoves;
import apimodels.StatAffectingNatures;
import apimodels.StatName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * StatDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class StatDetail   {
  @JsonProperty("id")
  @NotNull

  private Integer id;

  @JsonProperty("name")
  @NotNull
@Size(max=200)

  private String name;

  @JsonProperty("game_index")
  @NotNull
@Min(-2147483648)
@Max(2147483647)

  private Integer gameIndex;

  @JsonProperty("is_battle_only")
  
  private Boolean isBattleOnly;

  @JsonProperty("affecting_moves")
  @NotNull
@Valid

  private StatAffectingMoves affectingMoves;

  @JsonProperty("affecting_natures")
  @NotNull
@Valid

  private StatAffectingNatures affectingNatures;

  @JsonProperty("affecting_items")
  @NotNull
@Valid

  private List<@Valid ItemSummary> affectingItems = new ArrayList<>();

  @JsonProperty("characteristics")
  @NotNull
@Valid

  private List<@Valid CharacteristicSummary> characteristics = new ArrayList<>();

  @JsonProperty("move_damage_class")
  @NotNull
@Valid

  private MoveDamageClassSummary moveDamageClass;

  @JsonProperty("names")
  @NotNull
@Valid

  private List<@Valid StatName> names = new ArrayList<>();

  public StatDetail id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The identifier for this resource.
   * @return id
  **/
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
  **/
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
  **/
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
  **/
  public StatAffectingNatures getAffectingNatures() {
    return affectingNatures;
  }

  public void setAffectingNatures(StatAffectingNatures affectingNatures) {
    this.affectingNatures = affectingNatures;
  }

  public StatDetail affectingItems(List<@Valid ItemSummary> affectingItems) {
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
  **/
  public List<@Valid ItemSummary> getAffectingItems() {
    return affectingItems;
  }

  public void setAffectingItems(List<@Valid ItemSummary> affectingItems) {
    this.affectingItems = affectingItems;
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
   * A list of characteristics that are set on a Pokémon when its highest base stat is this stat.
   * @return characteristics
  **/
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
   * The class of damage this stat is directly related to.
   * @return moveDamageClass
  **/
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
   * The name of this resource listed in different languages.
   * @return names
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

