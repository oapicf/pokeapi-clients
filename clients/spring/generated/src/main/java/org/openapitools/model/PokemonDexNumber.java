package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.PokemonSpeciesSummary;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PokemonDexNumber
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-09T13:53:47.069318184Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonDexNumber {

  private Integer entryNumber;

  private PokemonSpeciesSummary pokemonSpecies;

  public PokemonDexNumber() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PokemonDexNumber(Integer entryNumber, PokemonSpeciesSummary pokemonSpecies) {
    this.entryNumber = entryNumber;
    this.pokemonSpecies = pokemonSpecies;
  }

  public PokemonDexNumber entryNumber(Integer entryNumber) {
    this.entryNumber = entryNumber;
    return this;
  }

  /**
   * The index of this Pokémon species entry within the Pokédex.
   * @return entryNumber
   */
  @NotNull 
  @Schema(name = "entry_number", description = "The index of this Pokémon species entry within the Pokédex.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("entry_number")
  public Integer getEntryNumber() {
    return entryNumber;
  }

  @JsonProperty("entry_number")
  public void setEntryNumber(Integer entryNumber) {
    this.entryNumber = entryNumber;
  }

  public PokemonDexNumber pokemonSpecies(PokemonSpeciesSummary pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
    return this;
  }

  /**
   * The Pokémon species being encountered.
   * @return pokemonSpecies
   */
  @NotNull @Valid 
  @Schema(name = "pokemon_species", description = "The Pokémon species being encountered.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pokemon_species")
  public PokemonSpeciesSummary getPokemonSpecies() {
    return pokemonSpecies;
  }

  @JsonProperty("pokemon_species")
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

