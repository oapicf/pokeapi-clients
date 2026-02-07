package org.openapitools.model;

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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("NatureDetail")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T04:17:57.915073257Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class NatureDetail   {
  private Integer id;
  private String name;
  private StatSummary decreasedStat;
  private StatSummary increasedStat;
  private BerryFlavorSummary likesFlavor;
  private BerryFlavorSummary hatesFlavor;
  private @Valid List<@Valid BerrySummary> berries = new ArrayList<>();
  private @Valid List<@Valid NatureDetailPokeathlonStatChangesInner> pokeathlonStatChanges = new ArrayList<>();
  private @Valid List<@Valid NatureBattleStylePreference> moveBattleStylePreferences = new ArrayList<>();
  private @Valid List<@Valid NatureName> names = new ArrayList<>();

  public NatureDetail() {
  }

  @JsonCreator
  public NatureDetail(
    @JsonProperty(required = true, value = "id") Integer id,
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "decreased_stat") StatSummary decreasedStat,
    @JsonProperty(required = true, value = "increased_stat") StatSummary increasedStat,
    @JsonProperty(required = true, value = "likes_flavor") BerryFlavorSummary likesFlavor,
    @JsonProperty(required = true, value = "hates_flavor") BerryFlavorSummary hatesFlavor,
    @JsonProperty(required = true, value = "berries") List<@Valid BerrySummary> berries,
    @JsonProperty(required = true, value = "pokeathlon_stat_changes") List<@Valid NatureDetailPokeathlonStatChangesInner> pokeathlonStatChanges,
    @JsonProperty(required = true, value = "move_battle_style_preferences") List<@Valid NatureBattleStylePreference> moveBattleStylePreferences,
    @JsonProperty(required = true, value = "names") List<@Valid NatureName> names
  ) {
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

  /**
   **/
  public NatureDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "id")
  public Integer getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
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
  @JsonProperty(required = true, value = "name")
  @NotNull  @Size(max=100)public String getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
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
  @JsonProperty(required = true, value = "decreased_stat")
  @NotNull @Valid public StatSummary getDecreasedStat() {
    return decreasedStat;
  }

  @JsonProperty(required = true, value = "decreased_stat")
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
  @JsonProperty(required = true, value = "increased_stat")
  @NotNull @Valid public StatSummary getIncreasedStat() {
    return increasedStat;
  }

  @JsonProperty(required = true, value = "increased_stat")
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
  @JsonProperty(required = true, value = "likes_flavor")
  @NotNull @Valid public BerryFlavorSummary getLikesFlavor() {
    return likesFlavor;
  }

  @JsonProperty(required = true, value = "likes_flavor")
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
  @JsonProperty(required = true, value = "hates_flavor")
  @NotNull @Valid public BerryFlavorSummary getHatesFlavor() {
    return hatesFlavor;
  }

  @JsonProperty(required = true, value = "hates_flavor")
  public void setHatesFlavor(BerryFlavorSummary hatesFlavor) {
    this.hatesFlavor = hatesFlavor;
  }

  /**
   **/
  public NatureDetail berries(List<@Valid BerrySummary> berries) {
    this.berries = berries;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "berries")
  @NotNull @Valid public List<@Valid BerrySummary> getBerries() {
    return berries;
  }

  @JsonProperty(required = true, value = "berries")
  public void setBerries(List<@Valid BerrySummary> berries) {
    this.berries = berries;
  }

  public NatureDetail addBerriesItem(BerrySummary berriesItem) {
    if (this.berries == null) {
      this.berries = new ArrayList<>();
    }

    this.berries.add(berriesItem);
    return this;
  }

  public NatureDetail removeBerriesItem(BerrySummary berriesItem) {
    if (berriesItem != null && this.berries != null) {
      this.berries.remove(berriesItem);
    }

    return this;
  }
  /**
   **/
  public NatureDetail pokeathlonStatChanges(List<@Valid NatureDetailPokeathlonStatChangesInner> pokeathlonStatChanges) {
    this.pokeathlonStatChanges = pokeathlonStatChanges;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "pokeathlon_stat_changes")
  @NotNull @Valid public List<@Valid NatureDetailPokeathlonStatChangesInner> getPokeathlonStatChanges() {
    return pokeathlonStatChanges;
  }

  @JsonProperty(required = true, value = "pokeathlon_stat_changes")
  public void setPokeathlonStatChanges(List<@Valid NatureDetailPokeathlonStatChangesInner> pokeathlonStatChanges) {
    this.pokeathlonStatChanges = pokeathlonStatChanges;
  }

  public NatureDetail addPokeathlonStatChangesItem(NatureDetailPokeathlonStatChangesInner pokeathlonStatChangesItem) {
    if (this.pokeathlonStatChanges == null) {
      this.pokeathlonStatChanges = new ArrayList<>();
    }

    this.pokeathlonStatChanges.add(pokeathlonStatChangesItem);
    return this;
  }

  public NatureDetail removePokeathlonStatChangesItem(NatureDetailPokeathlonStatChangesInner pokeathlonStatChangesItem) {
    if (pokeathlonStatChangesItem != null && this.pokeathlonStatChanges != null) {
      this.pokeathlonStatChanges.remove(pokeathlonStatChangesItem);
    }

    return this;
  }
  /**
   **/
  public NatureDetail moveBattleStylePreferences(List<@Valid NatureBattleStylePreference> moveBattleStylePreferences) {
    this.moveBattleStylePreferences = moveBattleStylePreferences;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "move_battle_style_preferences")
  @NotNull @Valid public List<@Valid NatureBattleStylePreference> getMoveBattleStylePreferences() {
    return moveBattleStylePreferences;
  }

  @JsonProperty(required = true, value = "move_battle_style_preferences")
  public void setMoveBattleStylePreferences(List<@Valid NatureBattleStylePreference> moveBattleStylePreferences) {
    this.moveBattleStylePreferences = moveBattleStylePreferences;
  }

  public NatureDetail addMoveBattleStylePreferencesItem(NatureBattleStylePreference moveBattleStylePreferencesItem) {
    if (this.moveBattleStylePreferences == null) {
      this.moveBattleStylePreferences = new ArrayList<>();
    }

    this.moveBattleStylePreferences.add(moveBattleStylePreferencesItem);
    return this;
  }

  public NatureDetail removeMoveBattleStylePreferencesItem(NatureBattleStylePreference moveBattleStylePreferencesItem) {
    if (moveBattleStylePreferencesItem != null && this.moveBattleStylePreferences != null) {
      this.moveBattleStylePreferences.remove(moveBattleStylePreferencesItem);
    }

    return this;
  }
  /**
   **/
  public NatureDetail names(List<@Valid NatureName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "names")
  @NotNull @Valid public List<@Valid NatureName> getNames() {
    return names;
  }

  @JsonProperty(required = true, value = "names")
  public void setNames(List<@Valid NatureName> names) {
    this.names = names;
  }

  public NatureDetail addNamesItem(NatureName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }

    this.names.add(namesItem);
    return this;
  }

  public NatureDetail removeNamesItem(NatureName namesItem) {
    if (namesItem != null && this.names != null) {
      this.names.remove(namesItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

