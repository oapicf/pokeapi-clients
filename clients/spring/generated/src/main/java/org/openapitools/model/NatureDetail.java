package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BerryFlavorSummary;
import org.openapitools.model.NatureBattleStylePreference;
import org.openapitools.model.NatureName;
import org.openapitools.model.NaturePokeathlonStat;
import org.openapitools.model.StatSummary;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * NatureDetail
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-09T13:53:47.069318184Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class NatureDetail {

  private Integer id;

  private String name;

  private JsonNullable<StatSummary> decreasedStat = JsonNullable.<StatSummary>undefined();

  private JsonNullable<StatSummary> increasedStat = JsonNullable.<StatSummary>undefined();

  private JsonNullable<BerryFlavorSummary> likesFlavor = JsonNullable.<BerryFlavorSummary>undefined();

  private JsonNullable<BerryFlavorSummary> hatesFlavor = JsonNullable.<BerryFlavorSummary>undefined();

  private List<@Valid NaturePokeathlonStat> pokeathlonStatChanges = new ArrayList<>();

  private List<@Valid NatureBattleStylePreference> moveBattleStylePreferences = new ArrayList<>();

  private List<@Valid NatureName> names = new ArrayList<>();

  public NatureDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NatureDetail(Integer id, String name, StatSummary decreasedStat, StatSummary increasedStat, BerryFlavorSummary likesFlavor, BerryFlavorSummary hatesFlavor, List<@Valid NaturePokeathlonStat> pokeathlonStatChanges, List<@Valid NatureBattleStylePreference> moveBattleStylePreferences, List<@Valid NatureName> names) {
    this.id = id;
    this.name = name;
    this.decreasedStat = JsonNullable.of(decreasedStat);
    this.increasedStat = JsonNullable.of(increasedStat);
    this.likesFlavor = JsonNullable.of(likesFlavor);
    this.hatesFlavor = JsonNullable.of(hatesFlavor);
    this.pokeathlonStatChanges = pokeathlonStatChanges;
    this.moveBattleStylePreferences = moveBattleStylePreferences;
    this.names = names;
  }

  public NatureDetail id(Integer id) {
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

  public NatureDetail name(String name) {
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

  public NatureDetail decreasedStat(StatSummary decreasedStat) {
    this.decreasedStat = JsonNullable.of(decreasedStat);
    return this;
  }

  /**
   * The stat decreased by 10% in Pokémon with this nature.
   * @return decreasedStat
   */
  /* @Present */ @Valid 
  @Schema(name = "decreased_stat", description = "The stat decreased by 10% in Pokémon with this nature.", requiredMode = Schema.RequiredMode.REQUIRED, nullable = true)
  @JsonProperty("decreased_stat")
  public JsonNullable<StatSummary> getDecreasedStat() {
    return decreasedStat;
  }

  @JsonProperty("decreased_stat")
  public void setDecreasedStat(JsonNullable<StatSummary> decreasedStat) {
    this.decreasedStat = decreasedStat;
  }

  public NatureDetail increasedStat(StatSummary increasedStat) {
    this.increasedStat = JsonNullable.of(increasedStat);
    return this;
  }

  /**
   * The stat increased by 10% in Pokémon with this nature.
   * @return increasedStat
   */
  /* @Present */ @Valid 
  @Schema(name = "increased_stat", description = "The stat increased by 10% in Pokémon with this nature.", requiredMode = Schema.RequiredMode.REQUIRED, nullable = true)
  @JsonProperty("increased_stat")
  public JsonNullable<StatSummary> getIncreasedStat() {
    return increasedStat;
  }

  @JsonProperty("increased_stat")
  public void setIncreasedStat(JsonNullable<StatSummary> increasedStat) {
    this.increasedStat = increasedStat;
  }

  public NatureDetail likesFlavor(BerryFlavorSummary likesFlavor) {
    this.likesFlavor = JsonNullable.of(likesFlavor);
    return this;
  }

  /**
   * The flavor liked by Pokémon with this nature.
   * @return likesFlavor
   */
  /* @Present */ @Valid 
  @Schema(name = "likes_flavor", description = "The flavor liked by Pokémon with this nature.", requiredMode = Schema.RequiredMode.REQUIRED, nullable = true)
  @JsonProperty("likes_flavor")
  public JsonNullable<BerryFlavorSummary> getLikesFlavor() {
    return likesFlavor;
  }

  @JsonProperty("likes_flavor")
  public void setLikesFlavor(JsonNullable<BerryFlavorSummary> likesFlavor) {
    this.likesFlavor = likesFlavor;
  }

  public NatureDetail hatesFlavor(BerryFlavorSummary hatesFlavor) {
    this.hatesFlavor = JsonNullable.of(hatesFlavor);
    return this;
  }

  /**
   * The flavor hated by Pokémon with this nature.
   * @return hatesFlavor
   */
  /* @Present */ @Valid 
  @Schema(name = "hates_flavor", description = "The flavor hated by Pokémon with this nature.", requiredMode = Schema.RequiredMode.REQUIRED, nullable = true)
  @JsonProperty("hates_flavor")
  public JsonNullable<BerryFlavorSummary> getHatesFlavor() {
    return hatesFlavor;
  }

  @JsonProperty("hates_flavor")
  public void setHatesFlavor(JsonNullable<BerryFlavorSummary> hatesFlavor) {
    this.hatesFlavor = hatesFlavor;
  }

  public NatureDetail pokeathlonStatChanges(List<@Valid NaturePokeathlonStat> pokeathlonStatChanges) {
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
  
  @Schema(name = "pokeathlon_stat_changes", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of Pokéathlon stats this nature effects and how much it effects them.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pokeathlon_stat_changes")
  public List<@Valid NaturePokeathlonStat> getPokeathlonStatChanges() {
    return pokeathlonStatChanges;
  }

  @JsonProperty("pokeathlon_stat_changes")
  public void setPokeathlonStatChanges(List<@Valid NaturePokeathlonStat> pokeathlonStatChanges) {
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
   * A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent.
   * @return moveBattleStylePreferences
   */
  
  @Schema(name = "move_battle_style_preferences", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("move_battle_style_preferences")
  public List<@Valid NatureBattleStylePreference> getMoveBattleStylePreferences() {
    return moveBattleStylePreferences;
  }

  @JsonProperty("move_battle_style_preferences")
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
   * The name of this resource listed in different languages.
   * @return names
   */
  
  @Schema(name = "names", accessMode = Schema.AccessMode.READ_ONLY, description = "The name of this resource listed in different languages.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("names")
  public List<@Valid NatureName> getNames() {
    return names;
  }

  @JsonProperty("names")
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

