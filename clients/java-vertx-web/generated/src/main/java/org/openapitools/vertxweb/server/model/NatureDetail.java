package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.BerryFlavorSummary;
import org.openapitools.vertxweb.server.model.BerrySummary;
import org.openapitools.vertxweb.server.model.NatureBattleStylePreference;
import org.openapitools.vertxweb.server.model.NatureDetailPokeathlonStatChangesInner;
import org.openapitools.vertxweb.server.model.NatureName;
import org.openapitools.vertxweb.server.model.StatSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class NatureDetail   {
  
  private Integer id;
  private String name;
  private StatSummary decreasedStat;
  private StatSummary increasedStat;
  private BerryFlavorSummary likesFlavor;
  private BerryFlavorSummary hatesFlavor;
  private List<BerrySummary> berries = new ArrayList<>();
  private List<NatureDetailPokeathlonStatChangesInner> pokeathlonStatChanges = new ArrayList<>();
  private List<NatureBattleStylePreference> moveBattleStylePreferences = new ArrayList<>();
  private List<NatureName> names = new ArrayList<>();

  public NatureDetail () {

  }

  public NatureDetail (Integer id, String name, StatSummary decreasedStat, StatSummary increasedStat, BerryFlavorSummary likesFlavor, BerryFlavorSummary hatesFlavor, List<BerrySummary> berries, List<NatureDetailPokeathlonStatChangesInner> pokeathlonStatChanges, List<NatureBattleStylePreference> moveBattleStylePreferences, List<NatureName> names) {
    this.id = id;
    this.name = name;
    this.decreasedStat = decreasedStat;
    this.increasedStat = increasedStat;
    this.likesFlavor = likesFlavor;
    this.hatesFlavor = hatesFlavor;
    this.berries = berries;
    this.pokeathlonStatChanges = pokeathlonStatChanges;
    this.moveBattleStylePreferences = moveBattleStylePreferences;
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

    
  @JsonProperty("decreased_stat")
  public StatSummary getDecreasedStat() {
    return decreasedStat;
  }
  public void setDecreasedStat(StatSummary decreasedStat) {
    this.decreasedStat = decreasedStat;
  }

    
  @JsonProperty("increased_stat")
  public StatSummary getIncreasedStat() {
    return increasedStat;
  }
  public void setIncreasedStat(StatSummary increasedStat) {
    this.increasedStat = increasedStat;
  }

    
  @JsonProperty("likes_flavor")
  public BerryFlavorSummary getLikesFlavor() {
    return likesFlavor;
  }
  public void setLikesFlavor(BerryFlavorSummary likesFlavor) {
    this.likesFlavor = likesFlavor;
  }

    
  @JsonProperty("hates_flavor")
  public BerryFlavorSummary getHatesFlavor() {
    return hatesFlavor;
  }
  public void setHatesFlavor(BerryFlavorSummary hatesFlavor) {
    this.hatesFlavor = hatesFlavor;
  }

    
  @JsonProperty("berries")
  public List<BerrySummary> getBerries() {
    return berries;
  }
  public void setBerries(List<BerrySummary> berries) {
    this.berries = berries;
  }

    
  @JsonProperty("pokeathlon_stat_changes")
  public List<NatureDetailPokeathlonStatChangesInner> getPokeathlonStatChanges() {
    return pokeathlonStatChanges;
  }
  public void setPokeathlonStatChanges(List<NatureDetailPokeathlonStatChangesInner> pokeathlonStatChanges) {
    this.pokeathlonStatChanges = pokeathlonStatChanges;
  }

    
  @JsonProperty("move_battle_style_preferences")
  public List<NatureBattleStylePreference> getMoveBattleStylePreferences() {
    return moveBattleStylePreferences;
  }
  public void setMoveBattleStylePreferences(List<NatureBattleStylePreference> moveBattleStylePreferences) {
    this.moveBattleStylePreferences = moveBattleStylePreferences;
  }

    
  @JsonProperty("names")
  public List<NatureName> getNames() {
    return names;
  }
  public void setNames(List<NatureName> names) {
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
    NatureDetail natureDetail = (NatureDetail) o;
    return Objects.equals(id, natureDetail.id) &&
        Objects.equals(name, natureDetail.name) &&
        Objects.equals(decreasedStat, natureDetail.decreasedStat) &&
        Objects.equals(increasedStat, natureDetail.increasedStat) &&
        Objects.equals(likesFlavor, natureDetail.likesFlavor) &&
        Objects.equals(hatesFlavor, natureDetail.hatesFlavor) &&
        Objects.equals(berries, natureDetail.berries) &&
        Objects.equals(pokeathlonStatChanges, natureDetail.pokeathlonStatChanges) &&
        Objects.equals(moveBattleStylePreferences, natureDetail.moveBattleStylePreferences) &&
        Objects.equals(names, natureDetail.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, decreasedStat, increasedStat, likesFlavor, hatesFlavor, berries, pokeathlonStatChanges, moveBattleStylePreferences, names);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NatureDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    decreasedStat: ").append(toIndentedString(decreasedStat)).append("\n");
    sb.append("    increasedStat: ").append(toIndentedString(increasedStat)).append("\n");
    sb.append("    likesFlavor: ").append(toIndentedString(likesFlavor)).append("\n");
    sb.append("    hatesFlavor: ").append(toIndentedString(hatesFlavor)).append("\n");
    sb.append("    berries: ").append(toIndentedString(berries)).append("\n");
    sb.append("    pokeathlonStatChanges: ").append(toIndentedString(pokeathlonStatChanges)).append("\n");
    sb.append("    moveBattleStylePreferences: ").append(toIndentedString(moveBattleStylePreferences)).append("\n");
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
