package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BerryFlavorSummary;
import org.openapitools.model.BerrySummary;
import org.openapitools.model.NatureBattleStylePreference;
import org.openapitools.model.NatureDetailPokeathlonStatChangesInner;
import org.openapitools.model.NatureName;
import org.openapitools.model.StatSummary;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-02-07T04:16:44.910526458Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class NatureDetail   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("decreased_stat")
  private StatSummary decreasedStat;

  @JsonProperty("increased_stat")
  private StatSummary increasedStat;

  @JsonProperty("likes_flavor")
  private BerryFlavorSummary likesFlavor;

  @JsonProperty("hates_flavor")
  private BerryFlavorSummary hatesFlavor;

  @JsonProperty("berries")
  private List<BerrySummary> berries = new ArrayList<>();

  @JsonProperty("pokeathlon_stat_changes")
  private List<NatureDetailPokeathlonStatChangesInner> pokeathlonStatChanges = new ArrayList<>();

  @JsonProperty("move_battle_style_preferences")
  private List<NatureBattleStylePreference> moveBattleStylePreferences = new ArrayList<>();

  @JsonProperty("names")
  private List<NatureName> names = new ArrayList<>();

  /**
   **/
  public NatureDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  public NatureDetail name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public NatureDetail decreasedStat(StatSummary decreasedStat) {
    this.decreasedStat = decreasedStat;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("decreased_stat")
  public StatSummary getDecreasedStat() {
    return decreasedStat;
  }
  public void setDecreasedStat(StatSummary decreasedStat) {
    this.decreasedStat = decreasedStat;
  }

  /**
   **/
  public NatureDetail increasedStat(StatSummary increasedStat) {
    this.increasedStat = increasedStat;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("increased_stat")
  public StatSummary getIncreasedStat() {
    return increasedStat;
  }
  public void setIncreasedStat(StatSummary increasedStat) {
    this.increasedStat = increasedStat;
  }

  /**
   **/
  public NatureDetail likesFlavor(BerryFlavorSummary likesFlavor) {
    this.likesFlavor = likesFlavor;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("likes_flavor")
  public BerryFlavorSummary getLikesFlavor() {
    return likesFlavor;
  }
  public void setLikesFlavor(BerryFlavorSummary likesFlavor) {
    this.likesFlavor = likesFlavor;
  }

  /**
   **/
  public NatureDetail hatesFlavor(BerryFlavorSummary hatesFlavor) {
    this.hatesFlavor = hatesFlavor;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("hates_flavor")
  public BerryFlavorSummary getHatesFlavor() {
    return hatesFlavor;
  }
  public void setHatesFlavor(BerryFlavorSummary hatesFlavor) {
    this.hatesFlavor = hatesFlavor;
  }

  /**
   **/
  public NatureDetail berries(List<BerrySummary> berries) {
    this.berries = berries;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("berries")
  public List<BerrySummary> getBerries() {
    return berries;
  }
  public void setBerries(List<BerrySummary> berries) {
    this.berries = berries;
  }

  /**
   **/
  public NatureDetail pokeathlonStatChanges(List<NatureDetailPokeathlonStatChangesInner> pokeathlonStatChanges) {
    this.pokeathlonStatChanges = pokeathlonStatChanges;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("pokeathlon_stat_changes")
  public List<NatureDetailPokeathlonStatChangesInner> getPokeathlonStatChanges() {
    return pokeathlonStatChanges;
  }
  public void setPokeathlonStatChanges(List<NatureDetailPokeathlonStatChangesInner> pokeathlonStatChanges) {
    this.pokeathlonStatChanges = pokeathlonStatChanges;
  }

  /**
   **/
  public NatureDetail moveBattleStylePreferences(List<NatureBattleStylePreference> moveBattleStylePreferences) {
    this.moveBattleStylePreferences = moveBattleStylePreferences;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("move_battle_style_preferences")
  public List<NatureBattleStylePreference> getMoveBattleStylePreferences() {
    return moveBattleStylePreferences;
  }
  public void setMoveBattleStylePreferences(List<NatureBattleStylePreference> moveBattleStylePreferences) {
    this.moveBattleStylePreferences = moveBattleStylePreferences;
  }

  /**
   **/
  public NatureDetail names(List<NatureName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
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

