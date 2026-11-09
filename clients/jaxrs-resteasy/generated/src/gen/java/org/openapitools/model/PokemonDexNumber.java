package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PokemonSpeciesSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-11-09T13:50:00.159999817Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonDexNumber   {
  
  private Integer entryNumber;
  private PokemonSpeciesSummary pokemonSpecies;

  /**
   * The index of this Pokémon species entry within the Pokédex.
   **/
  
  @ApiModelProperty(required = true, value = "The index of this Pokémon species entry within the Pokédex.")
  @JsonProperty("entry_number")
  @NotNull
  public Integer getEntryNumber() {
    return entryNumber;
  }
  public void setEntryNumber(Integer entryNumber) {
    this.entryNumber = entryNumber;
  }

  /**
   * The Pokémon species being encountered.
   **/
  
  @ApiModelProperty(required = true, value = "The Pokémon species being encountered.")
  @JsonProperty("pokemon_species")
  @NotNull
  @Valid
  public PokemonSpeciesSummary getPokemonSpecies() {
    return pokemonSpecies;
  }
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

