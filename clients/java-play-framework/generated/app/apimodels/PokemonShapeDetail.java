package apimodels;

import apimodels.PokemonShapeAwesomeName;
import apimodels.PokemonShapeName;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PokemonShapeDetail   {
  @JsonProperty("id")
  @NotNull

  private Integer id;

  @JsonProperty("name")
  @NotNull
@Size(max=200)

  private String name;

  @JsonProperty("awesome_names")
  @NotNull
@Valid

  private List<@Valid PokemonShapeAwesomeName> awesomeNames = new ArrayList<>();

  @JsonProperty("names")
  @NotNull
@Valid

  private List<@Valid PokemonShapeName> names = new ArrayList<>();

  @JsonProperty("pokemon_species")
  @NotNull
@Valid

  private List<@Valid PokemonSpeciesSummary> pokemonSpecies = new ArrayList<>();

  public PokemonShapeDetail id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The identifier for this resource.
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
   * The name for this resource.
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PokemonShapeDetail awesomeNames(List<@Valid PokemonShapeAwesomeName> awesomeNames) {
    this.awesomeNames = awesomeNames;
    return this;
  }

  public PokemonShapeDetail addAwesomeNamesItem(PokemonShapeAwesomeName awesomeNamesItem) {
    if (this.awesomeNames == null) {
      this.awesomeNames = new ArrayList<>();
    }
    this.awesomeNames.add(awesomeNamesItem);
    return this;
  }

   /**
   * The \"scientific\" name of this Pokémon shape listed in different languages.
   * @return awesomeNames
  **/
  public List<@Valid PokemonShapeAwesomeName> getAwesomeNames() {
    return awesomeNames;
  }

  public void setAwesomeNames(List<@Valid PokemonShapeAwesomeName> awesomeNames) {
    this.awesomeNames = awesomeNames;
  }

  public PokemonShapeDetail names(List<@Valid PokemonShapeName> names) {
    this.names = names;
    return this;
  }

  public PokemonShapeDetail addNamesItem(PokemonShapeName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }

   /**
   * The name of this resource listed in different languages.
   * @return names
  **/
  public List<@Valid PokemonShapeName> getNames() {
    return names;
  }

  public void setNames(List<@Valid PokemonShapeName> names) {
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
   * A list of the Pokémon species that have this shape.
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

