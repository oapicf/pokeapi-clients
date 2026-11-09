package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.PokemonSummary;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PokemonSpeciesVariety
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-11-09T13:49:41.168612095Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonSpeciesVariety {

  private Boolean isDefault;

  private PokemonSummary pokemon;

  public PokemonSpeciesVariety() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PokemonSpeciesVariety(Boolean isDefault, PokemonSummary pokemon) {
    this.isDefault = isDefault;
    this.pokemon = pokemon;
  }

  public PokemonSpeciesVariety isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * Whether this variety is the default variety.
   * @return isDefault
   */
  @NotNull 
  @Schema(name = "is_default", description = "Whether this variety is the default variety.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("is_default")
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public PokemonSpeciesVariety pokemon(PokemonSummary pokemon) {
    this.pokemon = pokemon;
    return this;
  }

  /**
   * The Pokémon variety.
   * @return pokemon
   */
  @NotNull @Valid 
  @Schema(name = "pokemon", description = "The Pokémon variety.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pokemon")
  public PokemonSummary getPokemon() {
    return pokemon;
  }

  public void setPokemon(PokemonSummary pokemon) {
    this.pokemon = pokemon;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonSpeciesVariety pokemonSpeciesVariety = (PokemonSpeciesVariety) o;
    return Objects.equals(this.isDefault, pokemonSpeciesVariety.isDefault) &&
        Objects.equals(this.pokemon, pokemonSpeciesVariety.pokemon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isDefault, pokemon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonSpeciesVariety {\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    pokemon: ").append(toIndentedString(pokemon)).append("\n");
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

