package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BerryFlavorSummary;
import org.openapitools.model.BerrySummary;
import org.openapitools.model.NatureBattleStylePreference;
import org.openapitools.model.NatureDetailPokeathlonStatChangesInner;
import org.openapitools.model.NatureName;
import org.openapitools.model.StatSummary;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class NatureDetail  {
  
  @ApiModelProperty(required = true, value = "")

  private Integer id;

  @ApiModelProperty(required = true, value = "")

  private String name;

  @ApiModelProperty(required = true, value = "")

  private StatSummary decreasedStat;

  @ApiModelProperty(required = true, value = "")

  private StatSummary increasedStat;

  @ApiModelProperty(required = true, value = "")

  private BerryFlavorSummary likesFlavor;

  @ApiModelProperty(required = true, value = "")

  private BerryFlavorSummary hatesFlavor;

  @ApiModelProperty(required = true, value = "")

  private List<BerrySummary> berries = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<NatureDetailPokeathlonStatChangesInner> pokeathlonStatChanges = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<NatureBattleStylePreference> moveBattleStylePreferences = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<NatureName> names = new ArrayList<>();
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }


 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NatureDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get decreasedStat
   * @return decreasedStat
  **/
  @JsonProperty("decreased_stat")
  public StatSummary getDecreasedStat() {
    return decreasedStat;
  }

  public void setDecreasedStat(StatSummary decreasedStat) {
    this.decreasedStat = decreasedStat;
  }

  public NatureDetail decreasedStat(StatSummary decreasedStat) {
    this.decreasedStat = decreasedStat;
    return this;
  }

 /**
   * Get increasedStat
   * @return increasedStat
  **/
  @JsonProperty("increased_stat")
  public StatSummary getIncreasedStat() {
    return increasedStat;
  }

  public void setIncreasedStat(StatSummary increasedStat) {
    this.increasedStat = increasedStat;
  }

  public NatureDetail increasedStat(StatSummary increasedStat) {
    this.increasedStat = increasedStat;
    return this;
  }

 /**
   * Get likesFlavor
   * @return likesFlavor
  **/
  @JsonProperty("likes_flavor")
  public BerryFlavorSummary getLikesFlavor() {
    return likesFlavor;
  }

  public void setLikesFlavor(BerryFlavorSummary likesFlavor) {
    this.likesFlavor = likesFlavor;
  }

  public NatureDetail likesFlavor(BerryFlavorSummary likesFlavor) {
    this.likesFlavor = likesFlavor;
    return this;
  }

 /**
   * Get hatesFlavor
   * @return hatesFlavor
  **/
  @JsonProperty("hates_flavor")
  public BerryFlavorSummary getHatesFlavor() {
    return hatesFlavor;
  }

  public void setHatesFlavor(BerryFlavorSummary hatesFlavor) {
    this.hatesFlavor = hatesFlavor;
  }

  public NatureDetail hatesFlavor(BerryFlavorSummary hatesFlavor) {
    this.hatesFlavor = hatesFlavor;
    return this;
  }

 /**
   * Get berries
   * @return berries
  **/
  @JsonProperty("berries")
  public List<BerrySummary> getBerries() {
    return berries;
  }

  public void setBerries(List<BerrySummary> berries) {
    this.berries = berries;
  }

  public NatureDetail berries(List<BerrySummary> berries) {
    this.berries = berries;
    return this;
  }

  public NatureDetail addBerriesItem(BerrySummary berriesItem) {
    this.berries.add(berriesItem);
    return this;
  }

 /**
   * Get pokeathlonStatChanges
   * @return pokeathlonStatChanges
  **/
  @JsonProperty("pokeathlon_stat_changes")
  public List<NatureDetailPokeathlonStatChangesInner> getPokeathlonStatChanges() {
    return pokeathlonStatChanges;
  }

  public void setPokeathlonStatChanges(List<NatureDetailPokeathlonStatChangesInner> pokeathlonStatChanges) {
    this.pokeathlonStatChanges = pokeathlonStatChanges;
  }

  public NatureDetail pokeathlonStatChanges(List<NatureDetailPokeathlonStatChangesInner> pokeathlonStatChanges) {
    this.pokeathlonStatChanges = pokeathlonStatChanges;
    return this;
  }

  public NatureDetail addPokeathlonStatChangesItem(NatureDetailPokeathlonStatChangesInner pokeathlonStatChangesItem) {
    this.pokeathlonStatChanges.add(pokeathlonStatChangesItem);
    return this;
  }

 /**
   * Get moveBattleStylePreferences
   * @return moveBattleStylePreferences
  **/
  @JsonProperty("move_battle_style_preferences")
  public List<NatureBattleStylePreference> getMoveBattleStylePreferences() {
    return moveBattleStylePreferences;
  }

  public void setMoveBattleStylePreferences(List<NatureBattleStylePreference> moveBattleStylePreferences) {
    this.moveBattleStylePreferences = moveBattleStylePreferences;
  }

  public NatureDetail moveBattleStylePreferences(List<NatureBattleStylePreference> moveBattleStylePreferences) {
    this.moveBattleStylePreferences = moveBattleStylePreferences;
    return this;
  }

  public NatureDetail addMoveBattleStylePreferencesItem(NatureBattleStylePreference moveBattleStylePreferencesItem) {
    this.moveBattleStylePreferences.add(moveBattleStylePreferencesItem);
    return this;
  }

 /**
   * Get names
   * @return names
  **/
  @JsonProperty("names")
  public List<NatureName> getNames() {
    return names;
  }

  public void setNames(List<NatureName> names) {
    this.names = names;
  }

  public NatureDetail names(List<NatureName> names) {
    this.names = names;
    return this;
  }

  public NatureDetail addNamesItem(NatureName namesItem) {
    this.names.add(namesItem);
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
    NatureDetail natureDetail = (NatureDetail) o;
    return Objects.equals(this.id, natureDetail.id) &&
        Objects.equals(this.name, natureDetail.name) &&
        Objects.equals(this.decreasedStat, natureDetail.decreasedStat) &&
        Objects.equals(this.increasedStat, natureDetail.increasedStat) &&
        Objects.equals(this.likesFlavor, natureDetail.likesFlavor) &&
        Objects.equals(this.hatesFlavor, natureDetail.hatesFlavor) &&
        Objects.equals(this.berries, natureDetail.berries) &&
        Objects.equals(this.pokeathlonStatChanges, natureDetail.pokeathlonStatChanges) &&
        Objects.equals(this.moveBattleStylePreferences, natureDetail.moveBattleStylePreferences) &&
        Objects.equals(this.names, natureDetail.names);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

