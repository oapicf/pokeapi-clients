package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.GenderPokemonSpecies;
import org.openapitools.model.PokemonSpeciesSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("GenderDetail")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-11-09T13:50:06.168269698Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class GenderDetail   {
  private Integer id;
  private String name;
  private List<@Valid GenderPokemonSpecies> pokemonSpeciesDetails = new ArrayList<>();
  private List<@Valid PokemonSpeciesSummary> requiredForEvolution = new ArrayList<>();

  public GenderDetail() {
  }

  @JsonCreator
  public GenderDetail(
    @JsonProperty(required = true, value = "id") Integer id,
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "pokemon_species_details") List<@Valid GenderPokemonSpecies> pokemonSpeciesDetails,
    @JsonProperty(required = true, value = "required_for_evolution") List<@Valid PokemonSpeciesSummary> requiredForEvolution
  ) {
    this.id = id;
    this.name = name;
    this.pokemonSpeciesDetails = pokemonSpeciesDetails;
    this.requiredForEvolution = requiredForEvolution;
  }

  /**
   * The identifier for this resource.
   **/
  public GenderDetail id(Integer id) {
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
  public GenderDetail name(String name) {
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
   * A list of Pokémon species that can be this gender and how likely it is that they will be.
   **/
  public GenderDetail pokemonSpeciesDetails(List<@Valid GenderPokemonSpecies> pokemonSpeciesDetails) {
    this.pokemonSpeciesDetails = pokemonSpeciesDetails;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of Pokémon species that can be this gender and how likely it is that they will be.")
  @JsonProperty(required = true, value = "pokemon_species_details")
  public List<@Valid GenderPokemonSpecies> getPokemonSpeciesDetails() {
    return pokemonSpeciesDetails;
  }

  @JsonProperty(required = true, value = "pokemon_species_details")
  public void setPokemonSpeciesDetails(List<@Valid GenderPokemonSpecies> pokemonSpeciesDetails) {
    this.pokemonSpeciesDetails = pokemonSpeciesDetails;
  }

  public GenderDetail addPokemonSpeciesDetailsItem(GenderPokemonSpecies pokemonSpeciesDetailsItem) {
    if (this.pokemonSpeciesDetails == null) {
      this.pokemonSpeciesDetails = new ArrayList<>();
    }

    this.pokemonSpeciesDetails.add(pokemonSpeciesDetailsItem);
    return this;
  }

  public GenderDetail removePokemonSpeciesDetailsItem(GenderPokemonSpecies pokemonSpeciesDetailsItem) {
    if (pokemonSpeciesDetailsItem != null && this.pokemonSpeciesDetails != null) {
      this.pokemonSpeciesDetails.remove(pokemonSpeciesDetailsItem);
    }

    return this;
  }
  /**
   * A list of Pokémon species that required this gender in order for a Pokémon to evolve into them.
   **/
  public GenderDetail requiredForEvolution(List<@Valid PokemonSpeciesSummary> requiredForEvolution) {
    this.requiredForEvolution = requiredForEvolution;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of Pokémon species that required this gender in order for a Pokémon to evolve into them.")
  @JsonProperty(required = true, value = "required_for_evolution")
  public List<@Valid PokemonSpeciesSummary> getRequiredForEvolution() {
    return requiredForEvolution;
  }

  @JsonProperty(required = true, value = "required_for_evolution")
  public void setRequiredForEvolution(List<@Valid PokemonSpeciesSummary> requiredForEvolution) {
    this.requiredForEvolution = requiredForEvolution;
  }

  public GenderDetail addRequiredForEvolutionItem(PokemonSpeciesSummary requiredForEvolutionItem) {
    if (this.requiredForEvolution == null) {
      this.requiredForEvolution = new ArrayList<>();
    }

    this.requiredForEvolution.add(requiredForEvolutionItem);
    return this;
  }

  public GenderDetail removeRequiredForEvolutionItem(PokemonSpeciesSummary requiredForEvolutionItem) {
    if (requiredForEvolutionItem != null && this.requiredForEvolution != null) {
      this.requiredForEvolution.remove(requiredForEvolutionItem);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
