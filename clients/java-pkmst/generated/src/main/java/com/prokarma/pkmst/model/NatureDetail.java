package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.BerryFlavorSummary;
import com.prokarma.pkmst.model.NatureBattleStylePreference;
import com.prokarma.pkmst.model.NatureName;
import com.prokarma.pkmst.model.NaturePokeathlonStat;
import com.prokarma.pkmst.model.StatSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * NatureDetail
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-11-09T13:49:28.343088631Z[Etc/UTC]", comments = "Generator version: 7.26.0")
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

  @JsonProperty("pokeathlon_stat_changes")
  
  private List<NaturePokeathlonStat> pokeathlonStatChanges = new ArrayList<>();

  @JsonProperty("move_battle_style_preferences")
  
  private List<NatureBattleStylePreference> moveBattleStylePreferences = new ArrayList<>();

  @JsonProperty("names")
  
  private List<NatureName> names = new ArrayList<>();

  public NatureDetail id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The identifier for this resource.
   * @return id
   */
  @ApiModelProperty(required = true, readOnly = true, value = "The identifier for this resource.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public NatureDetail name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name for this resource.
   * @return name
   */
  @ApiModelProperty(required = true, value = "The name for this resource.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NatureDetail decreasedStat(StatSummary decreasedStat) {
    this.decreasedStat = decreasedStat;
    return this;
  }

  /**
   * The stat decreased by 10% in Pokémon with this nature.
   * @return decreasedStat
   */
  @ApiModelProperty(required = true, value = "The stat decreased by 10% in Pokémon with this nature.")
  public StatSummary getDecreasedStat() {
    return decreasedStat;
  }

  public void setDecreasedStat(StatSummary decreasedStat) {
    this.decreasedStat = decreasedStat;
  }

  public NatureDetail increasedStat(StatSummary increasedStat) {
    this.increasedStat = increasedStat;
    return this;
  }

  /**
   * The stat increased by 10% in Pokémon with this nature.
   * @return increasedStat
   */
  @ApiModelProperty(required = true, value = "The stat increased by 10% in Pokémon with this nature.")
  public StatSummary getIncreasedStat() {
    return increasedStat;
  }

  public void setIncreasedStat(StatSummary increasedStat) {
    this.increasedStat = increasedStat;
  }

  public NatureDetail likesFlavor(BerryFlavorSummary likesFlavor) {
    this.likesFlavor = likesFlavor;
    return this;
  }

  /**
   * The flavor liked by Pokémon with this nature.
   * @return likesFlavor
   */
  @ApiModelProperty(required = true, value = "The flavor liked by Pokémon with this nature.")
  public BerryFlavorSummary getLikesFlavor() {
    return likesFlavor;
  }

  public void setLikesFlavor(BerryFlavorSummary likesFlavor) {
    this.likesFlavor = likesFlavor;
  }

  public NatureDetail hatesFlavor(BerryFlavorSummary hatesFlavor) {
    this.hatesFlavor = hatesFlavor;
    return this;
  }

  /**
   * The flavor hated by Pokémon with this nature.
   * @return hatesFlavor
   */
  @ApiModelProperty(required = true, value = "The flavor hated by Pokémon with this nature.")
  public BerryFlavorSummary getHatesFlavor() {
    return hatesFlavor;
  }

  public void setHatesFlavor(BerryFlavorSummary hatesFlavor) {
    this.hatesFlavor = hatesFlavor;
  }

  public NatureDetail pokeathlonStatChanges(List<NaturePokeathlonStat> pokeathlonStatChanges) {
    this.pokeathlonStatChanges = pokeathlonStatChanges;
    return this;
  }

  public NatureDetail addPokeathlonStatChangesItem(NaturePokeathlonStat pokeathlonStatChangesItem) {
    if (this.pokeathlonStatChanges == null) {
      this.pokeathlonStatChanges = new ArrayList<>();
    }
    this.pokeathlonStatChanges.add(pokeathlonStatChangesItem);
    return this;
  }

  /**
   * A list of Pokéathlon stats this nature effects and how much it effects them.
   * @return pokeathlonStatChanges
   */
  @ApiModelProperty(required = true, readOnly = true, value = "A list of Pokéathlon stats this nature effects and how much it effects them.")
  public List<NaturePokeathlonStat> getPokeathlonStatChanges() {
    return pokeathlonStatChanges;
  }

  public void setPokeathlonStatChanges(List<NaturePokeathlonStat> pokeathlonStatChanges) {
    this.pokeathlonStatChanges = pokeathlonStatChanges;
  }

  public NatureDetail moveBattleStylePreferences(List<NatureBattleStylePreference> moveBattleStylePreferences) {
    this.moveBattleStylePreferences = moveBattleStylePreferences;
    return this;
  }

  public NatureDetail addMoveBattleStylePreferencesItem(NatureBattleStylePreference moveBattleStylePreferencesItem) {
    if (this.moveBattleStylePreferences == null) {
      this.moveBattleStylePreferences = new ArrayList<>();
    }
    this.moveBattleStylePreferences.add(moveBattleStylePreferencesItem);
    return this;
  }

  /**
   * A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent.
   * @return moveBattleStylePreferences
   */
  @ApiModelProperty(required = true, readOnly = true, value = "A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent.")
  public List<NatureBattleStylePreference> getMoveBattleStylePreferences() {
    return moveBattleStylePreferences;
  }

  public void setMoveBattleStylePreferences(List<NatureBattleStylePreference> moveBattleStylePreferences) {
    this.moveBattleStylePreferences = moveBattleStylePreferences;
  }

  public NatureDetail names(List<NatureName> names) {
    this.names = names;
    return this;
  }

  public NatureDetail addNamesItem(NatureName namesItem) {
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
  @ApiModelProperty(required = true, readOnly = true, value = "The name of this resource listed in different languages.")
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
    return Objects.equals(this.id, natureDetail.id) &&
        Objects.equals(this.name, natureDetail.name) &&
        Objects.equals(this.decreasedStat, natureDetail.decreasedStat) &&
        Objects.equals(this.increasedStat, natureDetail.increasedStat) &&
        Objects.equals(this.likesFlavor, natureDetail.likesFlavor) &&
        Objects.equals(this.hatesFlavor, natureDetail.hatesFlavor) &&
        Objects.equals(this.pokeathlonStatChanges, natureDetail.pokeathlonStatChanges) &&
        Objects.equals(this.moveBattleStylePreferences, natureDetail.moveBattleStylePreferences) &&
        Objects.equals(this.names, natureDetail.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, decreasedStat, increasedStat, likesFlavor, hatesFlavor, pokeathlonStatChanges, moveBattleStylePreferences, names);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

