package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PokemonSpeciesDetailGeneraInner
 */

@JsonTypeName("PokemonSpeciesDetail_genera_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-07T15:29:13.146999890Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokemonSpeciesDetailGeneraInner {

  private String genus;

  private AbilityDetailPokemonInnerPokemon language;

  public PokemonSpeciesDetailGeneraInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PokemonSpeciesDetailGeneraInner(String genus, AbilityDetailPokemonInnerPokemon language) {
    this.genus = genus;
    this.language = language;
  }

  public PokemonSpeciesDetailGeneraInner genus(String genus) {
    this.genus = genus;
    return this;
  }

  /**
   * Get genus
   * @return genus
   */
  @NotNull 
  @Schema(name = "genus", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("genus")
  public String getGenus() {
    return genus;
  }

  public void setGenus(String genus) {
    this.genus = genus;
  }

  public PokemonSpeciesDetailGeneraInner language(AbilityDetailPokemonInnerPokemon language) {
    this.language = language;
    return this;
  }

  /**
   * Get language
   * @return language
   */
  @NotNull @Valid 
  @Schema(name = "language", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("language")
  public AbilityDetailPokemonInnerPokemon getLanguage() {
    return language;
  }

  public void setLanguage(AbilityDetailPokemonInnerPokemon language) {
    this.language = language;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonSpeciesDetailGeneraInner pokemonSpeciesDetailGeneraInner = (PokemonSpeciesDetailGeneraInner) o;
    return Objects.equals(this.genus, pokemonSpeciesDetailGeneraInner.genus) &&
        Objects.equals(this.language, pokemonSpeciesDetailGeneraInner.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(genus, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonSpeciesDetailGeneraInner {\n");
    sb.append("    genus: ").append(toIndentedString(genus)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

