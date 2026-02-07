package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BerryFlavorSummary;
import org.openapitools.model.BerrySummary;
import org.openapitools.model.NatureBattleStylePreference;
import org.openapitools.model.NatureDetailPokeathlonStatChangesInner;
import org.openapitools.model.NatureName;
import org.openapitools.model.StatSummary;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * NatureDetail
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-02-07T04:17:25.266083787Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class NatureDetail {

  private Integer id;

  private String name;

  private StatSummary decreasedStat;

  private StatSummary increasedStat;

  private BerryFlavorSummary likesFlavor;

  private BerryFlavorSummary hatesFlavor;

  @Valid
  private List<@Valid BerrySummary> berries = new ArrayList<>();

  @Valid
  private List<@Valid NatureDetailPokeathlonStatChangesInner> pokeathlonStatChanges = new ArrayList<>();

  @Valid
  private List<@Valid NatureBattleStylePreference> moveBattleStylePreferences = new ArrayList<>();

  @Valid
  private List<@Valid NatureName> names = new ArrayList<>();

  public NatureDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NatureDetail(Integer id, String name, StatSummary decreasedStat, StatSummary increasedStat, BerryFlavorSummary likesFlavor, BerryFlavorSummary hatesFlavor, List<@Valid BerrySummary> berries, List<@Valid NatureDetailPokeathlonStatChangesInner> pokeathlonStatChanges, List<@Valid NatureBattleStylePreference> moveBattleStylePreferences, List<@Valid NatureName> names) {
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

  public NatureDetail id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
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
   * Get name
   * @return name
   */
  @NotNull @Size(max = 100) 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
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
   * Get decreasedStat
   * @return decreasedStat
   */
  @NotNull @Valid 
  @Schema(name = "decreased_stat", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("decreased_stat")
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
   * Get increasedStat
   * @return increasedStat
   */
  @NotNull @Valid 
  @Schema(name = "increased_stat", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("increased_stat")
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
   * Get likesFlavor
   * @return likesFlavor
   */
  @NotNull @Valid 
  @Schema(name = "likes_flavor", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("likes_flavor")
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
   * Get hatesFlavor
   * @return hatesFlavor
   */
  @NotNull @Valid 
  @Schema(name = "hates_flavor", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("hates_flavor")
  public BerryFlavorSummary getHatesFlavor() {
    return hatesFlavor;
  }

  public void setHatesFlavor(BerryFlavorSummary hatesFlavor) {
    this.hatesFlavor = hatesFlavor;
  }

  public NatureDetail berries(List<@Valid BerrySummary> berries) {
    this.berries = berries;
    return this;
  }

  public NatureDetail addBerriesItem(BerrySummary berriesItem) {
    if (this.berries == null) {
      this.berries = new ArrayList<>();
    }
    this.berries.add(berriesItem);
    return this;
  }

  /**
   * Get berries
   * @return berries
   */
  @NotNull @Valid 
  @Schema(name = "berries", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("berries")
  public List<@Valid BerrySummary> getBerries() {
    return berries;
  }

  public void setBerries(List<@Valid BerrySummary> berries) {
    this.berries = berries;
  }

  public NatureDetail pokeathlonStatChanges(List<@Valid NatureDetailPokeathlonStatChangesInner> pokeathlonStatChanges) {
    this.pokeathlonStatChanges = pokeathlonStatChanges;
    return this;
  }

  public NatureDetail addPokeathlonStatChangesItem(NatureDetailPokeathlonStatChangesInner pokeathlonStatChangesItem) {
    if (this.pokeathlonStatChanges == null) {
      this.pokeathlonStatChanges = new ArrayList<>();
    }
    this.pokeathlonStatChanges.add(pokeathlonStatChangesItem);
    return this;
  }

  /**
   * Get pokeathlonStatChanges
   * @return pokeathlonStatChanges
   */
  @NotNull @Valid 
  @Schema(name = "pokeathlon_stat_changes", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pokeathlon_stat_changes")
  public List<@Valid NatureDetailPokeathlonStatChangesInner> getPokeathlonStatChanges() {
    return pokeathlonStatChanges;
  }

  public void setPokeathlonStatChanges(List<@Valid NatureDetailPokeathlonStatChangesInner> pokeathlonStatChanges) {
    this.pokeathlonStatChanges = pokeathlonStatChanges;
  }

  public NatureDetail moveBattleStylePreferences(List<@Valid NatureBattleStylePreference> moveBattleStylePreferences) {
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
   * Get moveBattleStylePreferences
   * @return moveBattleStylePreferences
   */
  @NotNull @Valid 
  @Schema(name = "move_battle_style_preferences", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("move_battle_style_preferences")
  public List<@Valid NatureBattleStylePreference> getMoveBattleStylePreferences() {
    return moveBattleStylePreferences;
  }

  public void setMoveBattleStylePreferences(List<@Valid NatureBattleStylePreference> moveBattleStylePreferences) {
    this.moveBattleStylePreferences = moveBattleStylePreferences;
  }

  public NatureDetail names(List<@Valid NatureName> names) {
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
   * Get names
   * @return names
   */
  @NotNull @Valid 
  @Schema(name = "names", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("names")
  public List<@Valid NatureName> getNames() {
    return names;
  }

  public void setNames(List<@Valid NatureName> names) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

