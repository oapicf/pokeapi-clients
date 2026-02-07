package apimodels;

import apimodels.AbilityDetailPokemonInnerPokemon;
import apimodels.GenderDetailPokemonSpeciesDetailsInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * GenderDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-07T04:17:12.303882205Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GenderDetail   {
  @JsonProperty("id")
  @NotNull

  private Integer id;

  @JsonProperty("name")
  @NotNull
@Size(max=100)

  private String name;

  @JsonProperty("pokemon_species_details")
  @NotNull
@Valid

  private List<@Valid GenderDetailPokemonSpeciesDetailsInner> pokemonSpeciesDetails = new ArrayList<>();

  @JsonProperty("required_for_evolution")
  @NotNull
@Valid

  private List<@Valid AbilityDetailPokemonInnerPokemon> requiredForEvolution = new ArrayList<>();

  public GenderDetail id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public GenderDetail name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GenderDetail pokemonSpeciesDetails(List<@Valid GenderDetailPokemonSpeciesDetailsInner> pokemonSpeciesDetails) {
    this.pokemonSpeciesDetails = pokemonSpeciesDetails;
    return this;
  }

  public GenderDetail addPokemonSpeciesDetailsItem(GenderDetailPokemonSpeciesDetailsInner pokemonSpeciesDetailsItem) {
    if (this.pokemonSpeciesDetails == null) {
      this.pokemonSpeciesDetails = new ArrayList<>();
    }
    this.pokemonSpeciesDetails.add(pokemonSpeciesDetailsItem);
    return this;
  }

   /**
   * Get pokemonSpeciesDetails
   * @return pokemonSpeciesDetails
  **/
  public List<@Valid GenderDetailPokemonSpeciesDetailsInner> getPokemonSpeciesDetails() {
    return pokemonSpeciesDetails;
  }

  public void setPokemonSpeciesDetails(List<@Valid GenderDetailPokemonSpeciesDetailsInner> pokemonSpeciesDetails) {
    this.pokemonSpeciesDetails = pokemonSpeciesDetails;
  }

  public GenderDetail requiredForEvolution(List<@Valid AbilityDetailPokemonInnerPokemon> requiredForEvolution) {
    this.requiredForEvolution = requiredForEvolution;
    return this;
  }

  public GenderDetail addRequiredForEvolutionItem(AbilityDetailPokemonInnerPokemon requiredForEvolutionItem) {
    if (this.requiredForEvolution == null) {
      this.requiredForEvolution = new ArrayList<>();
    }
    this.requiredForEvolution.add(requiredForEvolutionItem);
    return this;
  }

   /**
   * Get requiredForEvolution
   * @return requiredForEvolution
  **/
  public List<@Valid AbilityDetailPokemonInnerPokemon> getRequiredForEvolution() {
    return requiredForEvolution;
  }

  public void setRequiredForEvolution(List<@Valid AbilityDetailPokemonInnerPokemon> requiredForEvolution) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

