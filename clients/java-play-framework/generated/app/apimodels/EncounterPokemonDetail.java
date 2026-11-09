package apimodels;

import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * EncounterPokemonDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class EncounterPokemonDetail   {
  @JsonProperty("min_perfect_ivs")
  @Min(-2147483648)
@Max(2147483647)

  private Integer minPerfectIvs;

  @JsonProperty("always_shiny")
  
  private Boolean alwaysShiny;

  @JsonProperty("never_shiny")
  
  private Boolean neverShiny;

  @JsonProperty("is_alpha")
  
  private Boolean isAlpha;

  public EncounterPokemonDetail minPerfectIvs(Integer minPerfectIvs) {
    this.minPerfectIvs = minPerfectIvs;
    return this;
  }

   /**
   * The minimum number of perfect IVs, or null if unspecified.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return minPerfectIvs
  **/
  public Integer getMinPerfectIvs() {
    return minPerfectIvs;
  }

  public void setMinPerfectIvs(Integer minPerfectIvs) {
    this.minPerfectIvs = minPerfectIvs;
  }

  public EncounterPokemonDetail alwaysShiny(Boolean alwaysShiny) {
    this.alwaysShiny = alwaysShiny;
    return this;
  }

   /**
   * Whether the encountered Pokémon is always shiny.
   * @return alwaysShiny
  **/
  public Boolean getAlwaysShiny() {
    return alwaysShiny;
  }

  public void setAlwaysShiny(Boolean alwaysShiny) {
    this.alwaysShiny = alwaysShiny;
  }

  public EncounterPokemonDetail neverShiny(Boolean neverShiny) {
    this.neverShiny = neverShiny;
    return this;
  }

   /**
   * Whether the encountered Pokémon can never be shiny.
   * @return neverShiny
  **/
  public Boolean getNeverShiny() {
    return neverShiny;
  }

  public void setNeverShiny(Boolean neverShiny) {
    this.neverShiny = neverShiny;
  }

  public EncounterPokemonDetail isAlpha(Boolean isAlpha) {
    this.isAlpha = isAlpha;
    return this;
  }

   /**
   * Whether the encountered Pokémon is an alpha Pokémon.
   * @return isAlpha
  **/
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
    return Objects.equals(minPerfectIvs, encounterPokemonDetail.minPerfectIvs) &&
        Objects.equals(alwaysShiny, encounterPokemonDetail.alwaysShiny) &&
        Objects.equals(neverShiny, encounterPokemonDetail.neverShiny) &&
        Objects.equals(isAlpha, encounterPokemonDetail.isAlpha);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minPerfectIvs, alwaysShiny, neverShiny, isAlpha);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

