package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CharacteristicSummary;
import org.openapitools.model.ItemSummary;
import org.openapitools.model.MoveDamageClassSummary;
import org.openapitools.model.StatAffectingMoves;
import org.openapitools.model.StatAffectingNatures;
import org.openapitools.model.StatName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * StatDetail
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-09T13:53:47.069318184Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class StatDetail {

  private Integer id;

  private String name;

  private Integer gameIndex;

  private @Nullable Boolean isBattleOnly;

  private StatAffectingMoves affectingMoves;

  private StatAffectingNatures affectingNatures;

  private List<@Valid ItemSummary> affectingItems = new ArrayList<>();

  private List<@Valid CharacteristicSummary> characteristics = new ArrayList<>();

  private JsonNullable<MoveDamageClassSummary> moveDamageClass = JsonNullable.<MoveDamageClassSummary>undefined();

  private List<@Valid StatName> names = new ArrayList<>();

  public StatDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public StatDetail(Integer id, String name, Integer gameIndex, StatAffectingMoves affectingMoves, StatAffectingNatures affectingNatures, List<@Valid ItemSummary> affectingItems, List<@Valid CharacteristicSummary> characteristics, MoveDamageClassSummary moveDamageClass, List<@Valid StatName> names) {
    this.id = id;
    this.name = name;
    this.gameIndex = gameIndex;
    this.affectingMoves = affectingMoves;
    this.affectingNatures = affectingNatures;
    this.affectingItems = affectingItems;
    this.characteristics = characteristics;
    this.moveDamageClass = JsonNullable.of(moveDamageClass);
    this.names = names;
  }

  public StatDetail id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The identifier for this resource.
   * @return id
   */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The identifier for this resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  @JsonProperty("id")
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
  @NotNull @Size(max = 200) 
  @Schema(name = "name", description = "The name for this resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
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
  @NotNull @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "game_index", description = "ID the games use for this stat.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("game_index")
  public Integer getGameIndex() {
    return gameIndex;
  }

  @JsonProperty("game_index")
  public void setGameIndex(Integer gameIndex) {
    this.gameIndex = gameIndex;
  }

  public StatDetail isBattleOnly(@Nullable Boolean isBattleOnly) {
    this.isBattleOnly = isBattleOnly;
    return this;
  }

  /**
   * Whether this stat only exists within a battle.
   * @return isBattleOnly
   */
  
  @Schema(name = "is_battle_only", description = "Whether this stat only exists within a battle.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_battle_only")
  public @Nullable Boolean getIsBattleOnly() {
    return isBattleOnly;
  }

  @JsonProperty("is_battle_only")
  public void setIsBattleOnly(@Nullable Boolean isBattleOnly) {
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
  @Valid 
  @Schema(name = "affecting_moves", accessMode = Schema.AccessMode.READ_ONLY, description = "A detail of moves which affect this stat positively or negatively.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("affecting_moves")
  public StatAffectingMoves getAffectingMoves() {
    return affectingMoves;
  }

  @JsonProperty("affecting_moves")
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
  @Valid 
  @Schema(name = "affecting_natures", accessMode = Schema.AccessMode.READ_ONLY, description = "A detail of natures which affect this stat positively or negatively.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("affecting_natures")
  public StatAffectingNatures getAffectingNatures() {
    return affectingNatures;
  }

  @JsonProperty("affecting_natures")
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
   */
  
  @Schema(name = "affecting_items", accessMode = Schema.AccessMode.READ_ONLY, description = "Items that affect this stat, such as vitamins and battle items.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("affecting_items")
  public List<@Valid ItemSummary> getAffectingItems() {
    return affectingItems;
  }

  @JsonProperty("affecting_items")
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
   */
  
  @Schema(name = "characteristics", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of characteristics that are set on a Pokémon when its highest base stat is this stat.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("characteristics")
  public List<@Valid CharacteristicSummary> getCharacteristics() {
    return characteristics;
  }

  @JsonProperty("characteristics")
  public void setCharacteristics(List<@Valid CharacteristicSummary> characteristics) {
    this.characteristics = characteristics;
  }

  public StatDetail moveDamageClass(MoveDamageClassSummary moveDamageClass) {
    this.moveDamageClass = JsonNullable.of(moveDamageClass);
    return this;
  }

  /**
   * The class of damage this stat is directly related to.
   * @return moveDamageClass
   */
  /* @Present */ @Valid 
  @Schema(name = "move_damage_class", description = "The class of damage this stat is directly related to.", requiredMode = Schema.RequiredMode.REQUIRED, nullable = true)
  @JsonProperty("move_damage_class")
  public JsonNullable<MoveDamageClassSummary> getMoveDamageClass() {
    return moveDamageClass;
  }

  @JsonProperty("move_damage_class")
  public void setMoveDamageClass(JsonNullable<MoveDamageClassSummary> moveDamageClass) {
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
   */
  
  @Schema(name = "names", accessMode = Schema.AccessMode.READ_ONLY, description = "The name of this resource listed in different languages.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("names")
  public List<@Valid StatName> getNames() {
    return names;
  }

  @JsonProperty("names")
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

