package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PokemonShapeAwesomeName;
import org.openapitools.model.PokemonShapeName;
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



@JsonTypeName("PokemonShapeDetail")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-11-09T13:50:06.168269698Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonShapeDetail   {
  private Integer id;
  private String name;
  private List<@Valid PokemonShapeAwesomeName> awesomeNames = new ArrayList<>();
  private List<@Valid PokemonShapeName> names = new ArrayList<>();
  private List<@Valid PokemonSpeciesSummary> pokemonSpecies = new ArrayList<>();

  public PokemonShapeDetail() {
  }

  @JsonCreator
  public PokemonShapeDetail(
    @JsonProperty(required = true, value = "id") Integer id,
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "awesome_names") List<@Valid PokemonShapeAwesomeName> awesomeNames,
    @JsonProperty(required = true, value = "names") List<@Valid PokemonShapeName> names,
    @JsonProperty(required = true, value = "pokemon_species") List<@Valid PokemonSpeciesSummary> pokemonSpecies
  ) {
    this.id = id;
    this.name = name;
    this.awesomeNames = awesomeNames;
    this.names = names;
    this.pokemonSpecies = pokemonSpecies;
  }

  /**
   * The identifier for this resource.
   **/
  public PokemonShapeDetail id(Integer id) {
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
  public PokemonShapeDetail name(String name) {
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
   * The \&quot;scientific\&quot; name of this Pokémon shape listed in different languages.
   **/
  public PokemonShapeDetail awesomeNames(List<@Valid PokemonShapeAwesomeName> awesomeNames) {
    this.awesomeNames = awesomeNames;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The \"scientific\" name of this Pokémon shape listed in different languages.")
  @JsonProperty(required = true, value = "awesome_names")
  public List<@Valid PokemonShapeAwesomeName> getAwesomeNames() {
    return awesomeNames;
  }

  @JsonProperty(required = true, value = "awesome_names")
  public void setAwesomeNames(List<@Valid PokemonShapeAwesomeName> awesomeNames) {
    this.awesomeNames = awesomeNames;
  }

  public PokemonShapeDetail addAwesomeNamesItem(PokemonShapeAwesomeName awesomeNamesItem) {
    if (this.awesomeNames == null) {
      this.awesomeNames = new ArrayList<>();
    }

    this.awesomeNames.add(awesomeNamesItem);
    return this;
  }

  public PokemonShapeDetail removeAwesomeNamesItem(PokemonShapeAwesomeName awesomeNamesItem) {
    if (awesomeNamesItem != null && this.awesomeNames != null) {
      this.awesomeNames.remove(awesomeNamesItem);
    }

    return this;
  }
  /**
   * The name of this resource listed in different languages.
   **/
  public PokemonShapeDetail names(List<@Valid PokemonShapeName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name of this resource listed in different languages.")
  @JsonProperty(required = true, value = "names")
  public List<@Valid PokemonShapeName> getNames() {
    return names;
  }

  @JsonProperty(required = true, value = "names")
  public void setNames(List<@Valid PokemonShapeName> names) {
    this.names = names;
  }

  public PokemonShapeDetail addNamesItem(PokemonShapeName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }

    this.names.add(namesItem);
    return this;
  }

  public PokemonShapeDetail removeNamesItem(PokemonShapeName namesItem) {
    if (namesItem != null && this.names != null) {
      this.names.remove(namesItem);
    }

    return this;
  }
  /**
   * A list of the Pokémon species that have this shape.
   **/
  public PokemonShapeDetail pokemonSpecies(List<@Valid PokemonSpeciesSummary> pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of the Pokémon species that have this shape.")
  @JsonProperty(required = true, value = "pokemon_species")
  public List<@Valid PokemonSpeciesSummary> getPokemonSpecies() {
    return pokemonSpecies;
  }

  @JsonProperty(required = true, value = "pokemon_species")
  public void setPokemonSpecies(List<@Valid PokemonSpeciesSummary> pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
  }

  public PokemonShapeDetail addPokemonSpeciesItem(PokemonSpeciesSummary pokemonSpeciesItem) {
    if (this.pokemonSpecies == null) {
      this.pokemonSpecies = new ArrayList<>();
    }

    this.pokemonSpecies.add(pokemonSpeciesItem);
    return this;
  }

  public PokemonShapeDetail removePokemonSpeciesItem(PokemonSpeciesSummary pokemonSpeciesItem) {
    if (pokemonSpeciesItem != null && this.pokemonSpecies != null) {
      this.pokemonSpecies.remove(pokemonSpeciesItem);
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
