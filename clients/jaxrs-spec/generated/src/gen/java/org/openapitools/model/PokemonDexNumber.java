package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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



@JsonTypeName("PokemonDexNumber")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-11-09T13:50:06.168269698Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonDexNumber   {
  private Integer entryNumber;
  private PokemonSpeciesSummary pokemonSpecies;

  public PokemonDexNumber() {
  }

  @JsonCreator
  public PokemonDexNumber(
    @JsonProperty(required = true, value = "entry_number") Integer entryNumber,
    @JsonProperty(required = true, value = "pokemon_species") PokemonSpeciesSummary pokemonSpecies
  ) {
    this.entryNumber = entryNumber;
    this.pokemonSpecies = pokemonSpecies;
  }

  /**
   * The index of this Pokémon species entry within the Pokédex.
   **/
  public PokemonDexNumber entryNumber(Integer entryNumber) {
    this.entryNumber = entryNumber;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The index of this Pokémon species entry within the Pokédex.")
  @JsonProperty(required = true, value = "entry_number")
  @NotNull public Integer getEntryNumber() {
    return entryNumber;
  }

  @JsonProperty(required = true, value = "entry_number")
  public void setEntryNumber(Integer entryNumber) {
    this.entryNumber = entryNumber;
  }

  /**
   * The Pokémon species being encountered.
   **/
  public PokemonDexNumber pokemonSpecies(PokemonSpeciesSummary pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Pokémon species being encountered.")
  @JsonProperty(required = true, value = "pokemon_species")
  @NotNull @Valid public PokemonSpeciesSummary getPokemonSpecies() {
    return pokemonSpecies;
  }

  @JsonProperty(required = true, value = "pokemon_species")
  public void setPokemonSpecies(PokemonSpeciesSummary pokemonSpecies) {
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
    PokemonDexNumber pokemonDexNumber = (PokemonDexNumber) o;
    return Objects.equals(this.entryNumber, pokemonDexNumber.entryNumber) &&
        Objects.equals(this.pokemonSpecies, pokemonDexNumber.pokemonSpecies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryNumber, pokemonSpecies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonDexNumber {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
