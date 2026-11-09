package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.LanguageSummary;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PokemonSpeciesGenus
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-11-09T13:49:41.168612095Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonSpeciesGenus {

  private String genus;

  private LanguageSummary language;

  public PokemonSpeciesGenus() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PokemonSpeciesGenus(String genus, LanguageSummary language) {
    this.genus = genus;
    this.language = language;
  }

  public PokemonSpeciesGenus genus(String genus) {
    this.genus = genus;
    return this;
  }

  /**
   * The localized genus for the referenced Pokémon species
   * @return genus
   */
  @NotNull @Size(max = 30) 
  @Schema(name = "genus", description = "The localized genus for the referenced Pokémon species", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("genus")
  public String getGenus() {
    return genus;
  }

  public void setGenus(String genus) {
    this.genus = genus;
  }

  public PokemonSpeciesGenus language(LanguageSummary language) {
    this.language = language;
    return this;
  }

  /**
   * The language this genus is in.
   * @return language
   */
  @NotNull @Valid 
  @Schema(name = "language", description = "The language this genus is in.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("language")
  public LanguageSummary getLanguage() {
    return language;
  }

  public void setLanguage(LanguageSummary language) {
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
    PokemonSpeciesGenus pokemonSpeciesGenus = (PokemonSpeciesGenus) o;
    return Objects.equals(this.genus, pokemonSpeciesGenus.genus) &&
        Objects.equals(this.language, pokemonSpeciesGenus.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(genus, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonSpeciesGenus {\n");
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

