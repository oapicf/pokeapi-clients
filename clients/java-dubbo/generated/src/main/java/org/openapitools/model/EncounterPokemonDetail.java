package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class EncounterPokemonDetail implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The minimum number of perfect IVs, or null if unspecified.
   */
  @JsonProperty("min_perfect_ivs")
  private Integer minPerfectIvs;

  /**
   * Whether the encountered Pokémon is always shiny.
   */
  @JsonProperty("always_shiny")
  private Boolean alwaysShiny;

  /**
   * Whether the encountered Pokémon can never be shiny.
   */
  @JsonProperty("never_shiny")
  private Boolean neverShiny;

  /**
   * Whether the encountered Pokémon is an alpha Pokémon.
   */
  @JsonProperty("is_alpha")
  private Boolean isAlpha;

  /**
   * The minimum number of perfect IVs, or null if unspecified.
   * @return minPerfectIvs
   */
  public Integer getMinPerfectIvs() {
    return minPerfectIvs;
  }

  public void setMinPerfectIvs(Integer minPerfectIvs) {
    this.minPerfectIvs = minPerfectIvs;
  }

  /**
   * Whether the encountered Pokémon is always shiny.
   * @return alwaysShiny
   */
  public Boolean getAlwaysShiny() {
    return alwaysShiny;
  }

  public void setAlwaysShiny(Boolean alwaysShiny) {
    this.alwaysShiny = alwaysShiny;
  }

  /**
   * Whether the encountered Pokémon can never be shiny.
   * @return neverShiny
   */
  public Boolean getNeverShiny() {
    return neverShiny;
  }

  public void setNeverShiny(Boolean neverShiny) {
    this.neverShiny = neverShiny;
  }

  /**
   * Whether the encountered Pokémon is an alpha Pokémon.
   * @return isAlpha
   */
  public Boolean getIsAlpha() {
    return isAlpha;
  }

  public void setIsAlpha(Boolean isAlpha) {
    this.isAlpha = isAlpha;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
