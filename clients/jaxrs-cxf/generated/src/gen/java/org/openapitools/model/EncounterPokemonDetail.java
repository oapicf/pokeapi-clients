package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class EncounterPokemonDetail  {
  
 /**
  * The minimum number of perfect IVs, or null if unspecified.
  */
  @ApiModelProperty(value = "The minimum number of perfect IVs, or null if unspecified.")

  private Integer minPerfectIvs;

 /**
  * Whether the encountered Pokémon is always shiny.
  */
  @ApiModelProperty(value = "Whether the encountered Pokémon is always shiny.")

  private Boolean alwaysShiny;

 /**
  * Whether the encountered Pokémon can never be shiny.
  */
  @ApiModelProperty(value = "Whether the encountered Pokémon can never be shiny.")

  private Boolean neverShiny;

 /**
  * Whether the encountered Pokémon is an alpha Pokémon.
  */
  @ApiModelProperty(value = "Whether the encountered Pokémon is an alpha Pokémon.")

  private Boolean isAlpha;
 /**
   * The minimum number of perfect IVs, or null if unspecified.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return minPerfectIvs
  **/
  @JsonProperty("min_perfect_ivs")
 @Min(-2147483648) @Max(2147483647)  public Integer getMinPerfectIvs() {
    return minPerfectIvs;
  }

  public void setMinPerfectIvs(Integer minPerfectIvs) {
    this.minPerfectIvs = minPerfectIvs;
  }

  public EncounterPokemonDetail minPerfectIvs(Integer minPerfectIvs) {
    this.minPerfectIvs = minPerfectIvs;
    return this;
  }

 /**
   * Whether the encountered Pokémon is always shiny.
   * @return alwaysShiny
  **/
  @JsonProperty("always_shiny")
  public Boolean getAlwaysShiny() {
    return alwaysShiny;
  }

  public void setAlwaysShiny(Boolean alwaysShiny) {
    this.alwaysShiny = alwaysShiny;
  }

  public EncounterPokemonDetail alwaysShiny(Boolean alwaysShiny) {
    this.alwaysShiny = alwaysShiny;
    return this;
  }

 /**
   * Whether the encountered Pokémon can never be shiny.
   * @return neverShiny
  **/
  @JsonProperty("never_shiny")
  public Boolean getNeverShiny() {
    return neverShiny;
  }

  public void setNeverShiny(Boolean neverShiny) {
    this.neverShiny = neverShiny;
  }

  public EncounterPokemonDetail neverShiny(Boolean neverShiny) {
    this.neverShiny = neverShiny;
    return this;
  }

 /**
   * Whether the encountered Pokémon is an alpha Pokémon.
   * @return isAlpha
  **/
  @JsonProperty("is_alpha")
  public Boolean getIsAlpha() {
    return isAlpha;
  }

  public void setIsAlpha(Boolean isAlpha) {
    this.isAlpha = isAlpha;
  }

  public EncounterPokemonDetail isAlpha(Boolean isAlpha) {
    this.isAlpha = isAlpha;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EncounterPokemonDetail encounterPokemonDetail = (EncounterPokemonDetail) o;
    return Objects.equals(this.minPerfectIvs, encounterPokemonDetail.minPerfectIvs) &&
        Objects.equals(this.alwaysShiny, encounterPokemonDetail.alwaysShiny) &&
        Objects.equals(this.neverShiny, encounterPokemonDetail.neverShiny) &&
        Objects.equals(this.isAlpha, encounterPokemonDetail.isAlpha);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minPerfectIvs, alwaysShiny, neverShiny, isAlpha);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncounterPokemonDetail {\n");
    
    sb.append("    minPerfectIvs: ").append(toIndentedString(minPerfectIvs)).append("\n");
    sb.append("    alwaysShiny: ").append(toIndentedString(alwaysShiny)).append("\n");
    sb.append("    neverShiny: ").append(toIndentedString(neverShiny)).append("\n");
    sb.append("    isAlpha: ").append(toIndentedString(isAlpha)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

