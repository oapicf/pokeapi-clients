package org.openapitools.model;

import org.openapitools.model.GenderPokemonSpecies;
import org.openapitools.model.PokemonSpeciesSummary;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class GenderDetail implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The identifier for this resource.
   */
  @JsonProperty("id")
  private Integer id;

  /**
   * The name for this resource.
   */
  @JsonProperty("name")
  private String name;

  /**
   * A list of Pokémon species that can be this gender and how likely it is that they will be.
   */
  @JsonProperty("pokemon_species_details")
  private List<GenderPokemonSpecies> pokemonSpeciesDetails = new ArrayList<>();

  /**
   * A list of Pokémon species that required this gender in order for a Pokémon to evolve into them.
   */
  @JsonProperty("required_for_evolution")
  private List<PokemonSpeciesSummary> requiredForEvolution = new ArrayList<>();

  /**
   * The identifier for this resource.
   * @return id
   */
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The name for this resource.
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * A list of Pokémon species that can be this gender and how likely it is that they will be.
   * @return pokemonSpeciesDetails
   */
  public List<GenderPokemonSpecies> getPokemonSpeciesDetails() {
    return pokemonSpeciesDetails;
  }

  public void setPokemonSpeciesDetails(List<GenderPokemonSpecies> pokemonSpeciesDetails) {
    this.pokemonSpeciesDetails = pokemonSpeciesDetails;
  }

  /**
   * A list of Pokémon species that required this gender in order for a Pokémon to evolve into them.
   * @return requiredForEvolution
   */
  public List<PokemonSpeciesSummary> getRequiredForEvolution() {
    return requiredForEvolution;
  }

  public void setRequiredForEvolution(List<PokemonSpeciesSummary> requiredForEvolution) {
    this.requiredForEvolution = requiredForEvolution;
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
