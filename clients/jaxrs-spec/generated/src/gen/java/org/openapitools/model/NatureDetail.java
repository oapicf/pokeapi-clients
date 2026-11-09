package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BerryFlavorSummary;
import org.openapitools.model.NatureBattleStylePreference;
import org.openapitools.model.NatureName;
import org.openapitools.model.NaturePokeathlonStat;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-11-09T13:50:06.168269698Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class NatureDetail   {
  private Integer id;
  private String name;
  private StatSummary decreasedStat;
  private StatSummary increasedStat;
  private BerryFlavorSummary likesFlavor;
  private BerryFlavorSummary hatesFlavor;
  private List<@Valid NaturePokeathlonStat> pokeathlonStatChanges = new ArrayList<>();
  private List<@Valid NatureBattleStylePreference> moveBattleStylePreferences = new ArrayList<>();
  private List<@Valid NatureName> names = new ArrayList<>();

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
    @JsonProperty(required = true, value = "pokeathlon_stat_changes") List<@Valid NaturePokeathlonStat> pokeathlonStatChanges,
    @JsonProperty(required = true, value = "move_battle_style_preferences") List<@Valid NatureBattleStylePreference> moveBattleStylePreferences,
    @JsonProperty(required = true, value = "names") List<@Valid NatureName> names
  ) {
    this.id = id;
    this.name = name;
    this.decreasedStat = decreasedStat;
    this.increasedStat = increasedStat;
    this.likesFlavor = likesFlavor;
    this.hatesFlavor = hatesFlavor;
    this.pokeathlonStatChanges = pokeathlonStatChanges;
    this.moveBattleStylePreferences = moveBattleStylePreferences;
    this.names = names;
  }

  /**
   * The identifier for this resource.
   **/
  public NatureDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The identifier for this resource.")
  @JsonProperty(required = true, value = "id")
  public Integer getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The name for this resource.
   **/
  public NatureDetail name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name for this resource.")
  @JsonProperty(required = true, value = "name")
  @NotNull  @Size(max=200)public String getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The stat decreased by 10% in Pokémon with this nature.
   **/
  public NatureDetail decreasedStat(StatSummary decreasedStat) {
    this.decreasedStat = decreasedStat;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The stat decreased by 10% in Pokémon with this nature.")
  @JsonProperty(required = true, value = "decreased_stat")
  @NotNull @Valid public StatSummary getDecreasedStat() {
    return decreasedStat;
  }

  @JsonProperty(required = true, value = "decreased_stat")
  public void setDecreasedStat(StatSummary decreasedStat) {
    this.decreasedStat = decreasedStat;
  }

  /**
   * The stat increased by 10% in Pokémon with this nature.
   **/
  public NatureDetail increasedStat(StatSummary increasedStat) {
    this.increasedStat = increasedStat;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The stat increased by 10% in Pokémon with this nature.")
  @JsonProperty(required = true, value = "increased_stat")
  @NotNull @Valid public StatSummary getIncreasedStat() {
    return increasedStat;
  }

  @JsonProperty(required = true, value = "increased_stat")
  public void setIncreasedStat(StatSummary increasedStat) {
    this.increasedStat = increasedStat;
  }

  /**
   * The flavor liked by Pokémon with this nature.
   **/
  public NatureDetail likesFlavor(BerryFlavorSummary likesFlavor) {
    this.likesFlavor = likesFlavor;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The flavor liked by Pokémon with this nature.")
  @JsonProperty(required = true, value = "likes_flavor")
  @NotNull @Valid public BerryFlavorSummary getLikesFlavor() {
    return likesFlavor;
  }

  @JsonProperty(required = true, value = "likes_flavor")
  public void setLikesFlavor(BerryFlavorSummary likesFlavor) {
    this.likesFlavor = likesFlavor;
  }

  /**
   * The flavor hated by Pokémon with this nature.
   **/
  public NatureDetail hatesFlavor(BerryFlavorSummary hatesFlavor) {
    this.hatesFlavor = hatesFlavor;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The flavor hated by Pokémon with this nature.")
  @JsonProperty(required = true, value = "hates_flavor")
  @NotNull @Valid public BerryFlavorSummary getHatesFlavor() {
    return hatesFlavor;
  }

  @JsonProperty(required = true, value = "hates_flavor")
  public void setHatesFlavor(BerryFlavorSummary hatesFlavor) {
    this.hatesFlavor = hatesFlavor;
  }

  /**
   * A list of Pokéathlon stats this nature effects and how much it effects them.
   **/
  public NatureDetail pokeathlonStatChanges(List<@Valid NaturePokeathlonStat> pokeathlonStatChanges) {
    this.pokeathlonStatChanges = pokeathlonStatChanges;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of Pokéathlon stats this nature effects and how much it effects them.")
  @JsonProperty(required = true, value = "pokeathlon_stat_changes")
  public List<@Valid NaturePokeathlonStat> getPokeathlonStatChanges() {
    return pokeathlonStatChanges;
  }

  @JsonProperty(required = true, value = "pokeathlon_stat_changes")
  public void setPokeathlonStatChanges(List<@Valid NaturePokeathlonStat> pokeathlonStatChanges) {
    this.pokeathlonStatChanges = pokeathlonStatChanges;
  }

  public NatureDetail addPokeathlonStatChangesItem(NaturePokeathlonStat pokeathlonStatChangesItem) {
    if (this.pokeathlonStatChanges == null) {
      this.pokeathlonStatChanges = new ArrayList<>();
    }

    this.pokeathlonStatChanges.add(pokeathlonStatChangesItem);
    return this;
  }

  public NatureDetail removePokeathlonStatChangesItem(NaturePokeathlonStat pokeathlonStatChangesItem) {
    if (pokeathlonStatChangesItem != null && this.pokeathlonStatChanges != null) {
      this.pokeathlonStatChanges.remove(pokeathlonStatChangesItem);
    }

    return this;
  }
  /**
   * A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent.
   **/
  public NatureDetail moveBattleStylePreferences(List<@Valid NatureBattleStylePreference> moveBattleStylePreferences) {
    this.moveBattleStylePreferences = moveBattleStylePreferences;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent.")
  @JsonProperty(required = true, value = "move_battle_style_preferences")
  public List<@Valid NatureBattleStylePreference> getMoveBattleStylePreferences() {
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
   * The name of this resource listed in different languages.
   **/
  public NatureDetail names(List<@Valid NatureName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name of this resource listed in different languages.")
  @JsonProperty(required = true, value = "names")
  public List<@Valid NatureName> getNames() {
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
