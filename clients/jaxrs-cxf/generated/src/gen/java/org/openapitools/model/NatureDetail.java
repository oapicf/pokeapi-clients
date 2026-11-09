package org.openapitools.model;

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

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class NatureDetail  {
  
 /**
  * The identifier for this resource.
  */
  @ApiModelProperty(required = true, value = "The identifier for this resource.")

  private Integer id;

 /**
  * The name for this resource.
  */
  @ApiModelProperty(required = true, value = "The name for this resource.")

  private String name;

 /**
  * The stat decreased by 10% in Pokémon with this nature.
  */
  @ApiModelProperty(required = true, value = "The stat decreased by 10% in Pokémon with this nature.")

  @Valid

  private StatSummary decreasedStat;

 /**
  * The stat increased by 10% in Pokémon with this nature.
  */
  @ApiModelProperty(required = true, value = "The stat increased by 10% in Pokémon with this nature.")

  @Valid

  private StatSummary increasedStat;

 /**
  * The flavor liked by Pokémon with this nature.
  */
  @ApiModelProperty(required = true, value = "The flavor liked by Pokémon with this nature.")

  @Valid

  private BerryFlavorSummary likesFlavor;

 /**
  * The flavor hated by Pokémon with this nature.
  */
  @ApiModelProperty(required = true, value = "The flavor hated by Pokémon with this nature.")

  @Valid

  private BerryFlavorSummary hatesFlavor;

 /**
  * A list of Pokéathlon stats this nature effects and how much it effects them.
  */
  @ApiModelProperty(required = true, value = "A list of Pokéathlon stats this nature effects and how much it effects them.")

  private List<@Valid NaturePokeathlonStat> pokeathlonStatChanges = new ArrayList<>();

 /**
  * A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent.
  */
  @ApiModelProperty(required = true, value = "A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent.")

  private List<@Valid NatureBattleStylePreference> moveBattleStylePreferences = new ArrayList<>();

 /**
  * The name of this resource listed in different languages.
  */
  @ApiModelProperty(required = true, value = "The name of this resource listed in different languages.")

  private List<@Valid NatureName> names = new ArrayList<>();
 /**
   * The identifier for this resource.
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }


 /**
   * The name for this resource.
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
 @Size(max=200)  public String getName() {
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
   * The stat decreased by 10% in Pokémon with this nature.
   * @return decreasedStat
  **/
  @JsonProperty("decreased_stat")
  @NotNull
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
   * The stat increased by 10% in Pokémon with this nature.
   * @return increasedStat
  **/
  @JsonProperty("increased_stat")
  @NotNull
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
   * The flavor liked by Pokémon with this nature.
   * @return likesFlavor
  **/
  @JsonProperty("likes_flavor")
  @NotNull
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
   * The flavor hated by Pokémon with this nature.
   * @return hatesFlavor
  **/
  @JsonProperty("hates_flavor")
  @NotNull
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
   * A list of Pokéathlon stats this nature effects and how much it effects them.
   * @return pokeathlonStatChanges
  **/
  @JsonProperty("pokeathlon_stat_changes")
  @NotNull
  public List<@Valid NaturePokeathlonStat> getPokeathlonStatChanges() {
    return pokeathlonStatChanges;
  }


 /**
   * A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent.
   * @return moveBattleStylePreferences
  **/
  @JsonProperty("move_battle_style_preferences")
  @NotNull
  public List<@Valid NatureBattleStylePreference> getMoveBattleStylePreferences() {
    return moveBattleStylePreferences;
  }


 /**
   * The name of this resource listed in different languages.
   * @return names
  **/
  @JsonProperty("names")
  @NotNull
  public List<@Valid NatureName> getNames() {
    return names;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

