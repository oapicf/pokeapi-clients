package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.GenderDetailPokemonSpeciesDetailsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class GenderDetail   {
  
  private Integer id;

  private String name;

  private List<@Valid GenderDetailPokemonSpeciesDetailsInner> pokemonSpeciesDetails = new ArrayList<>();

  private List<@Valid AbilityDetailPokemonInnerPokemon> requiredForEvolution = new ArrayList<>();

  /**
   **/
  public GenderDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }


  /**
   **/
  public GenderDetail name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  @NotNull
 @Size(max=100)  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   **/
  public GenderDetail pokemonSpeciesDetails(List<@Valid GenderDetailPokemonSpeciesDetailsInner> pokemonSpeciesDetails) {
    this.pokemonSpeciesDetails = pokemonSpeciesDetails;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("pokemon_species_details")
  @NotNull
  public List<@Valid GenderDetailPokemonSpeciesDetailsInner> getPokemonSpeciesDetails() {
    return pokemonSpeciesDetails;
  }
  public void setPokemonSpeciesDetails(List<@Valid GenderDetailPokemonSpeciesDetailsInner> pokemonSpeciesDetails) {
    this.pokemonSpeciesDetails = pokemonSpeciesDetails;
  }

  public GenderDetail addPokemonSpeciesDetailsItem(GenderDetailPokemonSpeciesDetailsInner pokemonSpeciesDetailsItem) {
    if (this.pokemonSpeciesDetails == null) {
      this.pokemonSpeciesDetails = new ArrayList<>();
    }
    this.pokemonSpeciesDetails.add(pokemonSpeciesDetailsItem);
    return this;
  }


  /**
   **/
  public GenderDetail requiredForEvolution(List<@Valid AbilityDetailPokemonInnerPokemon> requiredForEvolution) {
    this.requiredForEvolution = requiredForEvolution;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("required_for_evolution")
  @NotNull
  public List<@Valid AbilityDetailPokemonInnerPokemon> getRequiredForEvolution() {
    return requiredForEvolution;
  }
  public void setRequiredForEvolution(List<@Valid AbilityDetailPokemonInnerPokemon> requiredForEvolution) {
    this.requiredForEvolution = requiredForEvolution;
  }

  public GenderDetail addRequiredForEvolutionItem(AbilityDetailPokemonInnerPokemon requiredForEvolutionItem) {
    if (this.requiredForEvolution == null) {
      this.requiredForEvolution = new ArrayList<>();
    }
    this.requiredForEvolution.add(requiredForEvolutionItem);
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
    GenderDetail genderDetail = (GenderDetail) o;
    return Objects.equals(this.id, genderDetail.id) &&
        Objects.equals(this.name, genderDetail.name) &&
        Objects.equals(this.pokemonSpeciesDetails, genderDetail.pokemonSpeciesDetails) &&
        Objects.equals(this.requiredForEvolution, genderDetail.requiredForEvolution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, pokemonSpeciesDetails, requiredForEvolution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenderDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pokemonSpeciesDetails: ").append(toIndentedString(pokemonSpeciesDetails)).append("\n");
    sb.append("    requiredForEvolution: ").append(toIndentedString(requiredForEvolution)).append("\n");
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

