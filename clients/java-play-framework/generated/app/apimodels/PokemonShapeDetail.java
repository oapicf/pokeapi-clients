package apimodels;

import apimodels.PokemonShapeDetailAwesomeNamesInner;
import apimodels.PokemonShapeDetailNamesInner;
import apimodels.PokemonSpeciesSummary;
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
 * PokemonShapeDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-07T04:17:12.303882205Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PokemonShapeDetail   {
  @JsonProperty("id")
  @NotNull

  private Integer id;

  @JsonProperty("name")
  @NotNull
@Size(max=100)

  private String name;

  @JsonProperty("awesome_names")
  @NotNull
@Valid

  private List<@Valid PokemonShapeDetailAwesomeNamesInner> awesomeNames = new ArrayList<>();

  @JsonProperty("names")
  @NotNull
@Valid

  private List<@Valid PokemonShapeDetailNamesInner> names = new ArrayList<>();

  @JsonProperty("pokemon_species")
  @NotNull
@Valid

  private List<@Valid PokemonSpeciesSummary> pokemonSpecies = new ArrayList<>();

  public PokemonShapeDetail id(Integer id) {
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

  public PokemonShapeDetail name(String name) {
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

  public PokemonShapeDetail awesomeNames(List<@Valid PokemonShapeDetailAwesomeNamesInner> awesomeNames) {
    this.awesomeNames = awesomeNames;
    return this;
  }

  public PokemonShapeDetail addAwesomeNamesItem(PokemonShapeDetailAwesomeNamesInner awesomeNamesItem) {
    if (this.awesomeNames == null) {
      this.awesomeNames = new ArrayList<>();
    }
    this.awesomeNames.add(awesomeNamesItem);
    return this;
  }

   /**
   * Get awesomeNames
   * @return awesomeNames
  **/
  public List<@Valid PokemonShapeDetailAwesomeNamesInner> getAwesomeNames() {
    return awesomeNames;
  }

  public void setAwesomeNames(List<@Valid PokemonShapeDetailAwesomeNamesInner> awesomeNames) {
    this.awesomeNames = awesomeNames;
  }

  public PokemonShapeDetail names(List<@Valid PokemonShapeDetailNamesInner> names) {
    this.names = names;
    return this;
  }

  public PokemonShapeDetail addNamesItem(PokemonShapeDetailNamesInner namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }

   /**
   * Get names
   * @return names
  **/
  public List<@Valid PokemonShapeDetailNamesInner> getNames() {
    return names;
  }

  public void setNames(List<@Valid PokemonShapeDetailNamesInner> names) {
    this.names = names;
  }

  public PokemonShapeDetail pokemonSpecies(List<@Valid PokemonSpeciesSummary> pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
    return this;
  }

  public PokemonShapeDetail addPokemonSpeciesItem(PokemonSpeciesSummary pokemonSpeciesItem) {
    if (this.pokemonSpecies == null) {
      this.pokemonSpecies = new ArrayList<>();
    }
    this.pokemonSpecies.add(pokemonSpeciesItem);
    return this;
  }

   /**
   * Get pokemonSpecies
   * @return pokemonSpecies
  **/
  public List<@Valid PokemonSpeciesSummary> getPokemonSpecies() {
    return pokemonSpecies;
  }

  public void setPokemonSpecies(List<@Valid PokemonSpeciesSummary> pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonShapeDetail pokemonShapeDetail = (PokemonShapeDetail) o;
    return Objects.equals(id, pokemonShapeDetail.id) &&
        Objects.equals(name, pokemonShapeDetail.name) &&
        Objects.equals(awesomeNames, pokemonShapeDetail.awesomeNames) &&
        Objects.equals(names, pokemonShapeDetail.names) &&
        Objects.equals(pokemonSpecies, pokemonShapeDetail.pokemonSpecies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, awesomeNames, names, pokemonSpecies);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonShapeDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    awesomeNames: ").append(toIndentedString(awesomeNames)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    pokemonSpecies: ").append(toIndentedString(pokemonSpecies)).append("\n");
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

