package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.GenderDetailPokemonSpeciesDetailsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GenderDetail  {
  
  @ApiModelProperty(required = true, value = "")
  private Integer id;

  @ApiModelProperty(required = true, value = "")
  private String name;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid GenderDetailPokemonSpeciesDetailsInner> pokemonSpeciesDetails = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid AbilityDetailPokemonInnerPokemon> requiredForEvolution = new ArrayList<>();
 /**
  * Get id
  * @return id
  */
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public GenderDetail id(Integer id) {
    this.id = id;
    return this;
  }

 /**
  * Get name
  * @return name
  */
  @JsonProperty("name")
  @NotNull
 @Size(max=100)  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public GenderDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Get pokemonSpeciesDetails
  * @return pokemonSpeciesDetails
  */
  @JsonProperty("pokemon_species_details")
  @NotNull
  public List<@Valid GenderDetailPokemonSpeciesDetailsInner> getPokemonSpeciesDetails() {
    return pokemonSpeciesDetails;
  }

  /**
   * Sets the <code>pokemonSpeciesDetails</code> property.
   */
 public void setPokemonSpeciesDetails(List<@Valid GenderDetailPokemonSpeciesDetailsInner> pokemonSpeciesDetails) {
    this.pokemonSpeciesDetails = pokemonSpeciesDetails;
  }

  /**
   * Sets the <code>pokemonSpeciesDetails</code> property.
   */
  public GenderDetail pokemonSpeciesDetails(List<@Valid GenderDetailPokemonSpeciesDetailsInner> pokemonSpeciesDetails) {
    this.pokemonSpeciesDetails = pokemonSpeciesDetails;
    return this;
  }

  /**
   * Adds a new item to the <code>pokemonSpeciesDetails</code> list.
   */
  public GenderDetail addPokemonSpeciesDetailsItem(GenderDetailPokemonSpeciesDetailsInner pokemonSpeciesDetailsItem) {
    this.pokemonSpeciesDetails.add(pokemonSpeciesDetailsItem);
    return this;
  }

 /**
  * Get requiredForEvolution
  * @return requiredForEvolution
  */
  @JsonProperty("required_for_evolution")
  @NotNull
  public List<@Valid AbilityDetailPokemonInnerPokemon> getRequiredForEvolution() {
    return requiredForEvolution;
  }

  /**
   * Sets the <code>requiredForEvolution</code> property.
   */
 public void setRequiredForEvolution(List<@Valid AbilityDetailPokemonInnerPokemon> requiredForEvolution) {
    this.requiredForEvolution = requiredForEvolution;
  }

  /**
   * Sets the <code>requiredForEvolution</code> property.
   */
  public GenderDetail requiredForEvolution(List<@Valid AbilityDetailPokemonInnerPokemon> requiredForEvolution) {
    this.requiredForEvolution = requiredForEvolution;
    return this;
  }

  /**
   * Adds a new item to the <code>requiredForEvolution</code> list.
   */
  public GenderDetail addRequiredForEvolutionItem(AbilityDetailPokemonInnerPokemon requiredForEvolutionItem) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

