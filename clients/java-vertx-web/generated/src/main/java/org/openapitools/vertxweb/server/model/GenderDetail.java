package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.vertxweb.server.model.GenderDetailPokemonSpeciesDetailsInner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GenderDetail   {
  
  private Integer id;
  private String name;
  private List<GenderDetailPokemonSpeciesDetailsInner> pokemonSpeciesDetails = new ArrayList<>();
  private List<AbilityDetailPokemonInnerPokemon> requiredForEvolution = new ArrayList<>();

  public GenderDetail () {

  }

  public GenderDetail (Integer id, String name, List<GenderDetailPokemonSpeciesDetailsInner> pokemonSpeciesDetails, List<AbilityDetailPokemonInnerPokemon> requiredForEvolution) {
    this.id = id;
    this.name = name;
    this.pokemonSpeciesDetails = pokemonSpeciesDetails;
    this.requiredForEvolution = requiredForEvolution;
  }

    
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("pokemon_species_details")
  public List<GenderDetailPokemonSpeciesDetailsInner> getPokemonSpeciesDetails() {
    return pokemonSpeciesDetails;
  }
  public void setPokemonSpeciesDetails(List<GenderDetailPokemonSpeciesDetailsInner> pokemonSpeciesDetails) {
    this.pokemonSpeciesDetails = pokemonSpeciesDetails;
  }

    
  @JsonProperty("required_for_evolution")
  public List<AbilityDetailPokemonInnerPokemon> getRequiredForEvolution() {
    return requiredForEvolution;
  }
  public void setRequiredForEvolution(List<AbilityDetailPokemonInnerPokemon> requiredForEvolution) {
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
    return Objects.equals(id, genderDetail.id) &&
        Objects.equals(name, genderDetail.name) &&
        Objects.equals(pokemonSpeciesDetails, genderDetail.pokemonSpeciesDetails) &&
        Objects.equals(requiredForEvolution, genderDetail.requiredForEvolution);
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
