package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
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
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-11-09T13:50:00.159999817Z[Etc/UTC]", comments = "Generator version: 7.26.0")
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

  /**
   * The identifier for this resource.
   **/
  
  @ApiModelProperty(required = true, value = "The identifier for this resource.")
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The name for this resource.
   **/
  
  @ApiModelProperty(required = true, value = "The name for this resource.")
  @JsonProperty("name")
  @NotNull
 @Size(max=200)  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * ID the games use for this stat.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  
  @ApiModelProperty(required = true, value = "ID the games use for this stat.")
  @JsonProperty("game_index")
  @NotNull
 @Min(-2147483648) @Max(2147483647)  public Integer getGameIndex() {
    return gameIndex;
  }
  public void setGameIndex(Integer gameIndex) {
    this.gameIndex = gameIndex;
  }

  /**
   * Whether this stat only exists within a battle.
   **/
  
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
   **/
  
  @ApiModelProperty(required = true, value = "A detail of moves which affect this stat positively or negatively.")
  @JsonProperty("affecting_moves")
  @NotNull
  @Valid
  public StatAffectingMoves getAffectingMoves() {
    return affectingMoves;
  }
  public void setAffectingMoves(StatAffectingMoves affectingMoves) {
    this.affectingMoves = affectingMoves;
  }

  /**
   * A detail of natures which affect this stat positively or negatively.
   **/
  
  @ApiModelProperty(required = true, value = "A detail of natures which affect this stat positively or negatively.")
  @JsonProperty("affecting_natures")
  @NotNull
  @Valid
  public StatAffectingNatures getAffectingNatures() {
    return affectingNatures;
  }
  public void setAffectingNatures(StatAffectingNatures affectingNatures) {
    this.affectingNatures = affectingNatures;
  }

  /**
   * Items that affect this stat, such as vitamins and battle items.
   **/
  
  @ApiModelProperty(required = true, value = "Items that affect this stat, such as vitamins and battle items.")
  @JsonProperty("affecting_items")
  @NotNull
  public List<@Valid ItemSummary> getAffectingItems() {
    return affectingItems;
  }
  public void setAffectingItems(List<@Valid ItemSummary> affectingItems) {
    this.affectingItems = affectingItems;
  }

  /**
   * A list of characteristics that are set on a Pokémon when its highest base stat is this stat.
   **/
  
  @ApiModelProperty(required = true, value = "A list of characteristics that are set on a Pokémon when its highest base stat is this stat.")
  @JsonProperty("characteristics")
  @NotNull
  public List<@Valid CharacteristicSummary> getCharacteristics() {
    return characteristics;
  }
  public void setCharacteristics(List<@Valid CharacteristicSummary> characteristics) {
    this.characteristics = characteristics;
  }

  /**
   * The class of damage this stat is directly related to.
   **/
  
  @ApiModelProperty(required = true, value = "The class of damage this stat is directly related to.")
  @JsonProperty("move_damage_class")
  @NotNull
  @Valid
  public MoveDamageClassSummary getMoveDamageClass() {
    return moveDamageClass;
  }
  public void setMoveDamageClass(MoveDamageClassSummary moveDamageClass) {
    this.moveDamageClass = moveDamageClass;
  }

  /**
   * The name of this resource listed in different languages.
   **/
  
  @ApiModelProperty(required = true, value = "The name of this resource listed in different languages.")
  @JsonProperty("names")
  @NotNull
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

