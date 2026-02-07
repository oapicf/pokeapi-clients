package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PokemonSpeciesDetailVarietiesInner
 */

@JsonTypeName("PokemonSpeciesDetail_varieties_inner")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-02-07T15:23:32.871052804Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokemonSpeciesDetailVarietiesInner {

  private Boolean isDefault;

  private AbilityDetailPokemonInnerPokemon pokemon;

  public PokemonSpeciesDetailVarietiesInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PokemonSpeciesDetailVarietiesInner(Boolean isDefault, AbilityDetailPokemonInnerPokemon pokemon) {
    this.isDefault = isDefault;
    this.pokemon = pokemon;
  }

  public PokemonSpeciesDetailVarietiesInner isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * Get isDefault
   * @return isDefault
   */
  @NotNull 
  @Schema(name = "is_default", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("is_default")
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public PokemonSpeciesDetailVarietiesInner pokemon(AbilityDetailPokemonInnerPokemon pokemon) {
    this.pokemon = pokemon;
    return this;
  }

  /**
   * Get pokemon
   * @return pokemon
   */
  @NotNull @Valid 
  @Schema(name = "pokemon", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pokemon")
  public AbilityDetailPokemonInnerPokemon getPokemon() {
    return pokemon;
  }

  public void setPokemon(AbilityDetailPokemonInnerPokemon pokemon) {
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
    PokemonSpeciesDetailVarietiesInner pokemonSpeciesDetailVarietiesInner = (PokemonSpeciesDetailVarietiesInner) o;
    return Objects.equals(this.isDefault, pokemonSpeciesDetailVarietiesInner.isDefault) &&
        Objects.equals(this.pokemon, pokemonSpeciesDetailVarietiesInner.pokemon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isDefault, pokemon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonSpeciesDetailVarietiesInner {\n");
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

