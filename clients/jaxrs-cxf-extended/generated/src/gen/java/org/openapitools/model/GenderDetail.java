package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.GenderPokemonSpecies;
import org.openapitools.model.PokemonSpeciesSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GenderDetail  {
  
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
  * A list of Pokémon species that can be this gender and how likely it is that they will be.
  */
  @ApiModelProperty(required = true, value = "A list of Pokémon species that can be this gender and how likely it is that they will be.")
  private List<@Valid GenderPokemonSpecies> pokemonSpeciesDetails = new ArrayList<>();

 /**
  * A list of Pokémon species that required this gender in order for a Pokémon to evolve into them.
  */
  @ApiModelProperty(required = true, value = "A list of Pokémon species that required this gender in order for a Pokémon to evolve into them.")
  private List<@Valid PokemonSpeciesSummary> requiredForEvolution = new ArrayList<>();
 /**
  * The identifier for this resource.
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
  * The name for this resource.
  * @return name
  */
  @JsonProperty("name")
  @NotNull
 @Size(max=200)  public String getName() {
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
  * A list of Pokémon species that can be this gender and how likely it is that they will be.
  * @return pokemonSpeciesDetails
  */
  @JsonProperty("pokemon_species_details")
  @NotNull
  public List<@Valid GenderPokemonSpecies> getPokemonSpeciesDetails() {
    return pokemonSpeciesDetails;
  }

  /**
   * Sets the <code>pokemonSpeciesDetails</code> property.
   * <br><em>N.B. <code>pokemonSpeciesDetails</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setPokemonSpeciesDetails(List<@Valid GenderPokemonSpecies> pokemonSpeciesDetails) {
    this.pokemonSpeciesDetails = pokemonSpeciesDetails;
  }

  /**
   * Sets the <code>pokemonSpeciesDetails</code> property.
   * <br><em>N.B. <code>pokemonSpeciesDetails</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public GenderDetail pokemonSpeciesDetails(List<@Valid GenderPokemonSpecies> pokemonSpeciesDetails) {
    this.pokemonSpeciesDetails = pokemonSpeciesDetails;
    return this;
  }

  /**
   * Adds a new item to the <code>pokemonSpeciesDetails</code> list.
   * <br><em>N.B. <code>pokemonSpeciesDetails</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public GenderDetail addPokemonSpeciesDetailsItem(GenderPokemonSpecies pokemonSpeciesDetailsItem) {
    this.pokemonSpeciesDetails.add(pokemonSpeciesDetailsItem);
    return this;
  }

 /**
  * A list of Pokémon species that required this gender in order for a Pokémon to evolve into them.
  * @return requiredForEvolution
  */
  @JsonProperty("required_for_evolution")
  @NotNull
  public List<@Valid PokemonSpeciesSummary> getRequiredForEvolution() {
    return requiredForEvolution;
  }

  /**
   * Sets the <code>requiredForEvolution</code> property.
   * <br><em>N.B. <code>requiredForEvolution</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setRequiredForEvolution(List<@Valid PokemonSpeciesSummary> requiredForEvolution) {
    this.requiredForEvolution = requiredForEvolution;
  }

  /**
   * Sets the <code>requiredForEvolution</code> property.
   * <br><em>N.B. <code>requiredForEvolution</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public GenderDetail requiredForEvolution(List<@Valid PokemonSpeciesSummary> requiredForEvolution) {
    this.requiredForEvolution = requiredForEvolution;
    return this;
  }

  /**
   * Adds a new item to the <code>requiredForEvolution</code> list.
   * <br><em>N.B. <code>requiredForEvolution</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public GenderDetail addRequiredForEvolutionItem(PokemonSpeciesSummary requiredForEvolutionItem) {
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

