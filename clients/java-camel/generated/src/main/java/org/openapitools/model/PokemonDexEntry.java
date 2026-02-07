package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.PokedexSummary;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PokemonDexEntry
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-02-07T04:17:25.266083787Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokemonDexEntry {

  private Integer entryNumber;

  private PokedexSummary pokedex;

  public PokemonDexEntry() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PokemonDexEntry(Integer entryNumber, PokedexSummary pokedex) {
    this.entryNumber = entryNumber;
    this.pokedex = pokedex;
  }

  public PokemonDexEntry entryNumber(Integer entryNumber) {
    this.entryNumber = entryNumber;
    return this;
  }

  /**
   * Get entryNumber
   * @return entryNumber
   */
  @NotNull 
  @Schema(name = "entry_number", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("entry_number")
  public Integer getEntryNumber() {
    return entryNumber;
  }

  public void setEntryNumber(Integer entryNumber) {
    this.entryNumber = entryNumber;
  }

  public PokemonDexEntry pokedex(PokedexSummary pokedex) {
    this.pokedex = pokedex;
    return this;
  }

  /**
   * Get pokedex
   * @return pokedex
   */
  @NotNull @Valid 
  @Schema(name = "pokedex", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pokedex")
  public PokedexSummary getPokedex() {
    return pokedex;
  }

  public void setPokedex(PokedexSummary pokedex) {
    this.pokedex = pokedex;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonDexEntry pokemonDexEntry = (PokemonDexEntry) o;
    return Objects.equals(this.entryNumber, pokemonDexEntry.entryNumber) &&
        Objects.equals(this.pokedex, pokemonDexEntry.pokedex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryNumber, pokedex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonDexEntry {\n");
    sb.append("    entryNumber: ").append(toIndentedString(entryNumber)).append("\n");
    sb.append("    pokedex: ").append(toIndentedString(pokedex)).append("\n");
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

