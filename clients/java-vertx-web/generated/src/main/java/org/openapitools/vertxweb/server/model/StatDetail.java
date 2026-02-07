package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.CharacteristicSummary;
import org.openapitools.vertxweb.server.model.MoveDamageClassSummary;
import org.openapitools.vertxweb.server.model.StatDetailAffectingMoves;
import org.openapitools.vertxweb.server.model.StatDetailAffectingNatures;
import org.openapitools.vertxweb.server.model.StatName;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StatDetail   {
  
  private Integer id;
  private String name;
  private Integer gameIndex;
  private Boolean isBattleOnly;
  private StatDetailAffectingMoves affectingMoves;
  private StatDetailAffectingNatures affectingNatures;
  private List<CharacteristicSummary> characteristics = new ArrayList<>();
  private MoveDamageClassSummary moveDamageClass;
  private List<StatName> names = new ArrayList<>();

  public StatDetail () {

  }

  public StatDetail (Integer id, String name, Integer gameIndex, Boolean isBattleOnly, StatDetailAffectingMoves affectingMoves, StatDetailAffectingNatures affectingNatures, List<CharacteristicSummary> characteristics, MoveDamageClassSummary moveDamageClass, List<StatName> names) {
    this.id = id;
    this.name = name;
    this.gameIndex = gameIndex;
    this.isBattleOnly = isBattleOnly;
    this.affectingMoves = affectingMoves;
    this.affectingNatures = affectingNatures;
    this.characteristics = characteristics;
    this.moveDamageClass = moveDamageClass;
    this.names = names;
  }

    
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("game_index")
  public Integer getGameIndex() {
    return gameIndex;
  }
  public void setGameIndex(Integer gameIndex) {
    this.gameIndex = gameIndex;
  }

    
  @JsonProperty("is_battle_only")
  public Boolean getIsBattleOnly() {
    return isBattleOnly;
  }
  public void setIsBattleOnly(Boolean isBattleOnly) {
    this.isBattleOnly = isBattleOnly;
  }

    
  @JsonProperty("affecting_moves")
  public StatDetailAffectingMoves getAffectingMoves() {
    return affectingMoves;
  }
  public void setAffectingMoves(StatDetailAffectingMoves affectingMoves) {
    this.affectingMoves = affectingMoves;
  }

    
  @JsonProperty("affecting_natures")
  public StatDetailAffectingNatures getAffectingNatures() {
    return affectingNatures;
  }
  public void setAffectingNatures(StatDetailAffectingNatures affectingNatures) {
    this.affectingNatures = affectingNatures;
  }

    
  @JsonProperty("characteristics")
  public List<CharacteristicSummary> getCharacteristics() {
    return characteristics;
  }
  public void setCharacteristics(List<CharacteristicSummary> characteristics) {
    this.characteristics = characteristics;
  }

    
  @JsonProperty("move_damage_class")
  public MoveDamageClassSummary getMoveDamageClass() {
    return moveDamageClass;
  }
  public void setMoveDamageClass(MoveDamageClassSummary moveDamageClass) {
    this.moveDamageClass = moveDamageClass;
  }

    
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
        Objects.equals(characteristics, statDetail.characteristics) &&
        Objects.equals(moveDamageClass, statDetail.moveDamageClass) &&
        Objects.equals(names, statDetail.names);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
