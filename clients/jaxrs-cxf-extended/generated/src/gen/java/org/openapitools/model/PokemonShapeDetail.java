package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PokemonShapeAwesomeName;
import org.openapitools.model.PokemonShapeName;
import org.openapitools.model.PokemonSpeciesSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonShapeDetail  {
  
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
  * The \"scientific\" name of this Pokémon shape listed in different languages.
  */
  @ApiModelProperty(required = true, value = "The \"scientific\" name of this Pokémon shape listed in different languages.")
  private List<@Valid PokemonShapeAwesomeName> awesomeNames = new ArrayList<>();

 /**
  * The name of this resource listed in different languages.
  */
  @ApiModelProperty(required = true, value = "The name of this resource listed in different languages.")
  private List<@Valid PokemonShapeName> names = new ArrayList<>();

 /**
  * A list of the Pokémon species that have this shape.
  */
  @ApiModelProperty(required = true, value = "A list of the Pokémon species that have this shape.")
  private List<@Valid PokemonSpeciesSummary> pokemonSpecies = new ArrayList<>();
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
  public PokemonShapeDetail id(Integer id) {
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
  public PokemonShapeDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
  * The \&quot;scientific\&quot; name of this Pokémon shape listed in different languages.
  * @return awesomeNames
  */
  @JsonProperty("awesome_names")
  @NotNull
  public List<@Valid PokemonShapeAwesomeName> getAwesomeNames() {
    return awesomeNames;
  }

  /**
   * Sets the <code>awesomeNames</code> property.
   * <br><em>N.B. <code>awesomeNames</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setAwesomeNames(List<@Valid PokemonShapeAwesomeName> awesomeNames) {
    this.awesomeNames = awesomeNames;
  }

  /**
   * Sets the <code>awesomeNames</code> property.
   * <br><em>N.B. <code>awesomeNames</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokemonShapeDetail awesomeNames(List<@Valid PokemonShapeAwesomeName> awesomeNames) {
    this.awesomeNames = awesomeNames;
    return this;
  }

  /**
   * Adds a new item to the <code>awesomeNames</code> list.
   * <br><em>N.B. <code>awesomeNames</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokemonShapeDetail addAwesomeNamesItem(PokemonShapeAwesomeName awesomeNamesItem) {
    this.awesomeNames.add(awesomeNamesItem);
    return this;
  }

 /**
  * The name of this resource listed in different languages.
  * @return names
  */
  @JsonProperty("names")
  @NotNull
  public List<@Valid PokemonShapeName> getNames() {
    return names;
  }

  /**
   * Sets the <code>names</code> property.
   * <br><em>N.B. <code>names</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setNames(List<@Valid PokemonShapeName> names) {
    this.names = names;
  }

  /**
   * Sets the <code>names</code> property.
   * <br><em>N.B. <code>names</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokemonShapeDetail names(List<@Valid PokemonShapeName> names) {
    this.names = names;
    return this;
  }

  /**
   * Adds a new item to the <code>names</code> list.
   * <br><em>N.B. <code>names</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokemonShapeDetail addNamesItem(PokemonShapeName namesItem) {
    this.names.add(namesItem);
    return this;
  }

 /**
  * A list of the Pokémon species that have this shape.
  * @return pokemonSpecies
  */
  @JsonProperty("pokemon_species")
  @NotNull
  public List<@Valid PokemonSpeciesSummary> getPokemonSpecies() {
    return pokemonSpecies;
  }

  /**
   * Sets the <code>pokemonSpecies</code> property.
   * <br><em>N.B. <code>pokemonSpecies</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setPokemonSpecies(List<@Valid PokemonSpeciesSummary> pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
  }

  /**
   * Sets the <code>pokemonSpecies</code> property.
   * <br><em>N.B. <code>pokemonSpecies</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokemonShapeDetail pokemonSpecies(List<@Valid PokemonSpeciesSummary> pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
    return this;
  }

  /**
   * Adds a new item to the <code>pokemonSpecies</code> list.
   * <br><em>N.B. <code>pokemonSpecies</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokemonShapeDetail addPokemonSpeciesItem(PokemonSpeciesSummary pokemonSpeciesItem) {
    this.pokemonSpecies.add(pokemonSpeciesItem);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

