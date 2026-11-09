package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PokemonHeldItemVersion;
import org.openapitools.model.PokemonSummary;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PokemonHeldItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-09T13:53:47.069318184Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonHeldItem {

  private PokemonSummary pokemon;

  private List<@Valid PokemonHeldItemVersion> versionDetails = new ArrayList<>();

  public PokemonHeldItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PokemonHeldItem(PokemonSummary pokemon, List<@Valid PokemonHeldItemVersion> versionDetails) {
    this.pokemon = pokemon;
    this.versionDetails = versionDetails;
  }

  public PokemonHeldItem pokemon(PokemonSummary pokemon) {
    this.pokemon = pokemon;
    return this;
  }

  /**
   * The Pokémon that holds this item.
   * @return pokemon
   */
  @NotNull @Valid 
  @Schema(name = "pokemon", description = "The Pokémon that holds this item.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pokemon")
  public PokemonSummary getPokemon() {
    return pokemon;
  }

  @JsonProperty("pokemon")
  public void setPokemon(PokemonSummary pokemon) {
    this.pokemon = pokemon;
  }

  public PokemonHeldItem versionDetails(List<@Valid PokemonHeldItemVersion> versionDetails) {
    this.versionDetails = versionDetails;
    return this;
  }

  public PokemonHeldItem addVersionDetailsItem(PokemonHeldItemVersion versionDetailsItem) {
    if (this.versionDetails == null) {
      this.versionDetails = new ArrayList<>();
    }
    this.versionDetails.add(versionDetailsItem);
    return this;
  }

  /**
   * The details for the version that this item is held in by the Pokémon.
   * @return versionDetails
   */
  @NotNull 
  @Schema(name = "version_details", description = "The details for the version that this item is held in by the Pokémon.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("version_details")
  public List<@Valid PokemonHeldItemVersion> getVersionDetails() {
    return versionDetails;
  }

  @JsonProperty("version_details")
  public void setVersionDetails(List<@Valid PokemonHeldItemVersion> versionDetails) {
    this.versionDetails = versionDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonHeldItem pokemonHeldItem = (PokemonHeldItem) o;
    return Objects.equals(this.pokemon, pokemonHeldItem.pokemon) &&
        Objects.equals(this.versionDetails, pokemonHeldItem.versionDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pokemon, versionDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonHeldItem {\n");
    sb.append("    pokemon: ").append(toIndentedString(pokemon)).append("\n");
    sb.append("    versionDetails: ").append(toIndentedString(versionDetails)).append("\n");
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

