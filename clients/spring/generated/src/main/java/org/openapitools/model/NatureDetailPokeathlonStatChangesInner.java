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
 * NatureDetailPokeathlonStatChangesInner
 */

@JsonTypeName("NatureDetail_pokeathlon_stat_changes_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-07T15:29:13.146999890Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class NatureDetailPokeathlonStatChangesInner {

  private Integer maxChange;

  private AbilityDetailPokemonInnerPokemon pokeathlonStat;

  public NatureDetailPokeathlonStatChangesInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NatureDetailPokeathlonStatChangesInner(Integer maxChange, AbilityDetailPokemonInnerPokemon pokeathlonStat) {
    this.maxChange = maxChange;
    this.pokeathlonStat = pokeathlonStat;
  }

  public NatureDetailPokeathlonStatChangesInner maxChange(Integer maxChange) {
    this.maxChange = maxChange;
    return this;
  }

  /**
   * Get maxChange
   * @return maxChange
   */
  @NotNull 
  @Schema(name = "max_change", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("max_change")
  public Integer getMaxChange() {
    return maxChange;
  }

  public void setMaxChange(Integer maxChange) {
    this.maxChange = maxChange;
  }

  public NatureDetailPokeathlonStatChangesInner pokeathlonStat(AbilityDetailPokemonInnerPokemon pokeathlonStat) {
    this.pokeathlonStat = pokeathlonStat;
    return this;
  }

  /**
   * Get pokeathlonStat
   * @return pokeathlonStat
   */
  @NotNull @Valid 
  @Schema(name = "pokeathlon_stat", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pokeathlon_stat")
  public AbilityDetailPokemonInnerPokemon getPokeathlonStat() {
    return pokeathlonStat;
  }

  public void setPokeathlonStat(AbilityDetailPokemonInnerPokemon pokeathlonStat) {
    this.pokeathlonStat = pokeathlonStat;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NatureDetailPokeathlonStatChangesInner natureDetailPokeathlonStatChangesInner = (NatureDetailPokeathlonStatChangesInner) o;
    return Objects.equals(this.maxChange, natureDetailPokeathlonStatChangesInner.maxChange) &&
        Objects.equals(this.pokeathlonStat, natureDetailPokeathlonStatChangesInner.pokeathlonStat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxChange, pokeathlonStat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NatureDetailPokeathlonStatChangesInner {\n");
    sb.append("    maxChange: ").append(toIndentedString(maxChange)).append("\n");
    sb.append("    pokeathlonStat: ").append(toIndentedString(pokeathlonStat)).append("\n");
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

