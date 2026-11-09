package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.PokemonShapeAwesomeName;
import com.prokarma.pkmst.model.PokemonShapeName;
import com.prokarma.pkmst.model.PokemonSpeciesSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * PokemonShapeDetail
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-11-09T13:49:28.343088631Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonShapeDetail   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("awesome_names")
  
  private List<PokemonShapeAwesomeName> awesomeNames = new ArrayList<>();

  @JsonProperty("names")
  
  private List<PokemonShapeName> names = new ArrayList<>();

  @JsonProperty("pokemon_species")
  
  private List<PokemonSpeciesSummary> pokemonSpecies = new ArrayList<>();

  public PokemonShapeDetail id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The identifier for this resource.
   * @return id
   */
  @ApiModelProperty(required = true, readOnly = true, value = "The identifier for this resource.")
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
   */
  @ApiModelProperty(required = true, value = "The name for this resource.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PokemonShapeDetail awesomeNames(List<PokemonShapeAwesomeName> awesomeNames) {
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
   */
  @ApiModelProperty(required = true, readOnly = true, value = "The \"scientific\" name of this Pokémon shape listed in different languages.")
  public List<PokemonShapeAwesomeName> getAwesomeNames() {
    return awesomeNames;
  }

  public void setAwesomeNames(List<PokemonShapeAwesomeName> awesomeNames) {
    this.awesomeNames = awesomeNames;
  }

  public PokemonShapeDetail names(List<PokemonShapeName> names) {
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
   */
  @ApiModelProperty(required = true, readOnly = true, value = "The name of this resource listed in different languages.")
  public List<PokemonShapeName> getNames() {
    return names;
  }

  public void setNames(List<PokemonShapeName> names) {
    this.names = names;
  }

  public PokemonShapeDetail pokemonSpecies(List<PokemonSpeciesSummary> pokemonSpecies) {
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
   */
  @ApiModelProperty(required = true, readOnly = true, value = "A list of the Pokémon species that have this shape.")
  public List<PokemonSpeciesSummary> getPokemonSpecies() {
    return pokemonSpecies;
  }

  public void setPokemonSpecies(List<PokemonSpeciesSummary> pokemonSpecies) {
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
    return Objects.equals(this.id, pokemonShapeDetail.id) &&
        Objects.equals(this.name, pokemonShapeDetail.name) &&
        Objects.equals(this.awesomeNames, pokemonShapeDetail.awesomeNames) &&
        Objects.equals(this.names, pokemonShapeDetail.names) &&
        Objects.equals(this.pokemonSpecies, pokemonShapeDetail.pokemonSpecies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, awesomeNames, names, pokemonSpecies);
  }

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

