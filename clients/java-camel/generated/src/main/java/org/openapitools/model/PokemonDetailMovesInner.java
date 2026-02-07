package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.PokemonDetailMovesInnerVersionGroupDetailsInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PokemonDetailMovesInner
 */

@JsonTypeName("PokemonDetail_moves_inner")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-02-07T04:17:25.266083787Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokemonDetailMovesInner {

  private AbilityDetailPokemonInnerPokemon move;

  @Valid
  private List<@Valid PokemonDetailMovesInnerVersionGroupDetailsInner> versionGroupDetails = new ArrayList<>();

  public PokemonDetailMovesInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PokemonDetailMovesInner(AbilityDetailPokemonInnerPokemon move, List<@Valid PokemonDetailMovesInnerVersionGroupDetailsInner> versionGroupDetails) {
    this.move = move;
    this.versionGroupDetails = versionGroupDetails;
  }

  public PokemonDetailMovesInner move(AbilityDetailPokemonInnerPokemon move) {
    this.move = move;
    return this;
  }

  /**
   * Get move
   * @return move
   */
  @NotNull @Valid 
  @Schema(name = "move", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("move")
  public AbilityDetailPokemonInnerPokemon getMove() {
    return move;
  }

  public void setMove(AbilityDetailPokemonInnerPokemon move) {
    this.move = move;
  }

  public PokemonDetailMovesInner versionGroupDetails(List<@Valid PokemonDetailMovesInnerVersionGroupDetailsInner> versionGroupDetails) {
    this.versionGroupDetails = versionGroupDetails;
    return this;
  }

  public PokemonDetailMovesInner addVersionGroupDetailsItem(PokemonDetailMovesInnerVersionGroupDetailsInner versionGroupDetailsItem) {
    if (this.versionGroupDetails == null) {
      this.versionGroupDetails = new ArrayList<>();
    }
    this.versionGroupDetails.add(versionGroupDetailsItem);
    return this;
  }

  /**
   * Get versionGroupDetails
   * @return versionGroupDetails
   */
  @NotNull @Valid 
  @Schema(name = "version_group_details", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("version_group_details")
  public List<@Valid PokemonDetailMovesInnerVersionGroupDetailsInner> getVersionGroupDetails() {
    return versionGroupDetails;
  }

  public void setVersionGroupDetails(List<@Valid PokemonDetailMovesInnerVersionGroupDetailsInner> versionGroupDetails) {
    this.versionGroupDetails = versionGroupDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonDetailMovesInner pokemonDetailMovesInner = (PokemonDetailMovesInner) o;
    return Objects.equals(this.move, pokemonDetailMovesInner.move) &&
        Objects.equals(this.versionGroupDetails, pokemonDetailMovesInner.versionGroupDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(move, versionGroupDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonDetailMovesInner {\n");
    sb.append("    move: ").append(toIndentedString(move)).append("\n");
    sb.append("    versionGroupDetails: ").append(toIndentedString(versionGroupDetails)).append("\n");
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

