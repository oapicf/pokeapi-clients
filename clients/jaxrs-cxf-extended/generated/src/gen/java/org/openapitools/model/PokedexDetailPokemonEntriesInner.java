package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokedexDetailPokemonEntriesInner  {
  
  @ApiModelProperty(required = true, value = "")
  private Integer entryNumber;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private AbilityDetailPokemonInnerPokemon pokemonSpecies;
 /**
  * Get entryNumber
  * @return entryNumber
  */
  @JsonProperty("entry_number")
  @NotNull
  public Integer getEntryNumber() {
    return entryNumber;
  }

  /**
   * Sets the <code>entryNumber</code> property.
   */
 public void setEntryNumber(Integer entryNumber) {
    this.entryNumber = entryNumber;
  }

  /**
   * Sets the <code>entryNumber</code> property.
   */
  public PokedexDetailPokemonEntriesInner entryNumber(Integer entryNumber) {
    this.entryNumber = entryNumber;
    return this;
  }

 /**
  * Get pokemonSpecies
  * @return pokemonSpecies
  */
  @JsonProperty("pokemon_species")
  @NotNull
  public AbilityDetailPokemonInnerPokemon getPokemonSpecies() {
    return pokemonSpecies;
  }

  /**
   * Sets the <code>pokemonSpecies</code> property.
   */
 public void setPokemonSpecies(AbilityDetailPokemonInnerPokemon pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
  }

  /**
   * Sets the <code>pokemonSpecies</code> property.
   */
  public PokedexDetailPokemonEntriesInner pokemonSpecies(AbilityDetailPokemonInnerPokemon pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
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
    PokedexDetailPokemonEntriesInner pokedexDetailPokemonEntriesInner = (PokedexDetailPokemonEntriesInner) o;
    return Objects.equals(this.entryNumber, pokedexDetailPokemonEntriesInner.entryNumber) &&
        Objects.equals(this.pokemonSpecies, pokedexDetailPokemonEntriesInner.pokemonSpecies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryNumber, pokemonSpecies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokedexDetailPokemonEntriesInner {\n");
    
    sb.append("    entryNumber: ").append(toIndentedString(entryNumber)).append("\n");
    sb.append("    pokemonSpecies: ").append(toIndentedString(pokemonSpecies)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

