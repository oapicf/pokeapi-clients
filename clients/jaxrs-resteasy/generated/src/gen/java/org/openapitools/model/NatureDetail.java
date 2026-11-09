package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-11-09T13:50:00.159999817Z[Etc/UTC]", comments = "Generator version: 7.26.0")
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

  /**
   * The identifier for this resource.
   **/
  
  @ApiModelProperty(required = true, value = "The identifier for this resource.")
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The name for this resource.
   **/
  
  @ApiModelProperty(required = true, value = "The name for this resource.")
  @JsonProperty("name")
  @NotNull
 @Size(max=200)  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The stat decreased by 10% in Pokémon with this nature.
   **/
  
  @ApiModelProperty(required = true, value = "The stat decreased by 10% in Pokémon with this nature.")
  @JsonProperty("decreased_stat")
  @NotNull
  @Valid
  public StatSummary getDecreasedStat() {
    return decreasedStat;
  }
  public void setDecreasedStat(StatSummary decreasedStat) {
    this.decreasedStat = decreasedStat;
  }

  /**
   * The stat increased by 10% in Pokémon with this nature.
   **/
  
  @ApiModelProperty(required = true, value = "The stat increased by 10% in Pokémon with this nature.")
  @JsonProperty("increased_stat")
  @NotNull
  @Valid
  public StatSummary getIncreasedStat() {
    return increasedStat;
  }
  public void setIncreasedStat(StatSummary increasedStat) {
    this.increasedStat = increasedStat;
  }

  /**
   * The flavor liked by Pokémon with this nature.
   **/
  
  @ApiModelProperty(required = true, value = "The flavor liked by Pokémon with this nature.")
  @JsonProperty("likes_flavor")
  @NotNull
  @Valid
  public BerryFlavorSummary getLikesFlavor() {
    return likesFlavor;
  }
  public void setLikesFlavor(BerryFlavorSummary likesFlavor) {
    this.likesFlavor = likesFlavor;
  }

  /**
   * The flavor hated by Pokémon with this nature.
   **/
  
  @ApiModelProperty(required = true, value = "The flavor hated by Pokémon with this nature.")
  @JsonProperty("hates_flavor")
  @NotNull
  @Valid
  public BerryFlavorSummary getHatesFlavor() {
    return hatesFlavor;
  }
  public void setHatesFlavor(BerryFlavorSummary hatesFlavor) {
    this.hatesFlavor = hatesFlavor;
  }

  /**
   * A list of Pokéathlon stats this nature effects and how much it effects them.
   **/
  
  @ApiModelProperty(required = true, value = "A list of Pokéathlon stats this nature effects and how much it effects them.")
  @JsonProperty("pokeathlon_stat_changes")
  @NotNull
  public List<@Valid NaturePokeathlonStat> getPokeathlonStatChanges() {
    return pokeathlonStatChanges;
  }
  public void setPokeathlonStatChanges(List<@Valid NaturePokeathlonStat> pokeathlonStatChanges) {
    this.pokeathlonStatChanges = pokeathlonStatChanges;
  }

  /**
   * A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent.
   **/
  
  @ApiModelProperty(required = true, value = "A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent.")
  @JsonProperty("move_battle_style_preferences")
  @NotNull
  public List<@Valid NatureBattleStylePreference> getMoveBattleStylePreferences() {
    return moveBattleStylePreferences;
  }
  public void setMoveBattleStylePreferences(List<@Valid NatureBattleStylePreference> moveBattleStylePreferences) {
    this.moveBattleStylePreferences = moveBattleStylePreferences;
  }

  /**
   * The name of this resource listed in different languages.
   **/
  
  @ApiModelProperty(required = true, value = "The name of this resource listed in different languages.")
  @JsonProperty("names")
  @NotNull
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

