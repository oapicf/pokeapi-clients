package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Experience;
import org.openapitools.model.GrowthRateDescription;
import org.openapitools.model.PokemonSpeciesSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class GrowthRateDetail   {
  
  private Integer id;

  private String name;

  private String formula;

  private List<@Valid GrowthRateDescription> descriptions = new ArrayList<>();

  private List<@Valid Experience> levels = new ArrayList<>();

  private List<@Valid PokemonSpeciesSummary> pokemonSpecies = new ArrayList<>();

  /**
   * The identifier for this resource.
   **/
  public GrowthRateDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
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
  public GrowthRateDetail name(String name) {
    this.name = name;
    return this;
  }

  
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
   * The formula used to calculate the rate at which the Pokémon species gains level.
   **/
  public GrowthRateDetail formula(String formula) {
    this.formula = formula;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The formula used to calculate the rate at which the Pokémon species gains level.")
  @JsonProperty("formula")
  @NotNull
 @Size(max=500)  public String getFormula() {
    return formula;
  }
  public void setFormula(String formula) {
    this.formula = formula;
  }


  /**
   * The descriptions of this characteristic listed in different languages.
   **/
  public GrowthRateDetail descriptions(List<@Valid GrowthRateDescription> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The descriptions of this characteristic listed in different languages.")
  @JsonProperty("descriptions")
  @NotNull
  public List<@Valid GrowthRateDescription> getDescriptions() {
    return descriptions;
  }
  public void setDescriptions(List<@Valid GrowthRateDescription> descriptions) {
    this.descriptions = descriptions;
  }

  public GrowthRateDetail addDescriptionsItem(GrowthRateDescription descriptionsItem) {
    if (this.descriptions == null) {
      this.descriptions = new ArrayList<>();
    }
    this.descriptions.add(descriptionsItem);
    return this;
  }


  /**
   * A list of levels and the amount of experienced needed to atain them based on this growth rate.
   **/
  public GrowthRateDetail levels(List<@Valid Experience> levels) {
    this.levels = levels;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of levels and the amount of experienced needed to atain them based on this growth rate.")
  @JsonProperty("levels")
  @NotNull
  public List<@Valid Experience> getLevels() {
    return levels;
  }
  public void setLevels(List<@Valid Experience> levels) {
    this.levels = levels;
  }

  public GrowthRateDetail addLevelsItem(Experience levelsItem) {
    if (this.levels == null) {
      this.levels = new ArrayList<>();
    }
    this.levels.add(levelsItem);
    return this;
  }


  /**
   * A list of Pokémon species that gain levels at this growth rate.
   **/
  public GrowthRateDetail pokemonSpecies(List<@Valid PokemonSpeciesSummary> pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of Pokémon species that gain levels at this growth rate.")
  @JsonProperty("pokemon_species")
  @NotNull
  public List<@Valid PokemonSpeciesSummary> getPokemonSpecies() {
    return pokemonSpecies;
  }
  public void setPokemonSpecies(List<@Valid PokemonSpeciesSummary> pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
  }

  public GrowthRateDetail addPokemonSpeciesItem(PokemonSpeciesSummary pokemonSpeciesItem) {
    if (this.pokemonSpecies == null) {
      this.pokemonSpecies = new ArrayList<>();
    }
    this.pokemonSpecies.add(pokemonSpeciesItem);
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
    GrowthRateDetail growthRateDetail = (GrowthRateDetail) o;
    return Objects.equals(this.id, growthRateDetail.id) &&
        Objects.equals(this.name, growthRateDetail.name) &&
        Objects.equals(this.formula, growthRateDetail.formula) &&
        Objects.equals(this.descriptions, growthRateDetail.descriptions) &&
        Objects.equals(this.levels, growthRateDetail.levels) &&
        Objects.equals(this.pokemonSpecies, growthRateDetail.pokemonSpecies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, formula, descriptions, levels, pokemonSpecies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrowthRateDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    formula: ").append(toIndentedString(formula)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
    sb.append("    levels: ").append(toIndentedString(levels)).append("\n");
    sb.append("    pokemonSpecies: ").append(toIndentedString(pokemonSpecies)).append("\n");
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

