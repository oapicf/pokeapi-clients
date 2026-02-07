package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-07T04:17:47.675703185Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokedexDetailPokemonEntriesInner   {
  
  private Integer entryNumber;
  private AbilityDetailPokemonInnerPokemon pokemonSpecies;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("entry_number")
  @NotNull
  public Integer getEntryNumber() {
    return entryNumber;
  }
  public void setEntryNumber(Integer entryNumber) {
    this.entryNumber = entryNumber;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("pokemon_species")
  @NotNull
  @Valid
  public AbilityDetailPokemonInnerPokemon getPokemonSpecies() {
    return pokemonSpecies;
  }
  public void setPokemonSpecies(AbilityDetailPokemonInnerPokemon pokemonSpecies) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

