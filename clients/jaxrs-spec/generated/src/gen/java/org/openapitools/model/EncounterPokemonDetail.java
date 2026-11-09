package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("EncounterPokemonDetail")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-11-09T13:50:06.168269698Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class EncounterPokemonDetail   {
  private Integer minPerfectIvs;
  private Boolean alwaysShiny;
  private Boolean neverShiny;
  private Boolean isAlpha;

  public EncounterPokemonDetail() {
  }

  /**
   * The minimum number of perfect IVs, or null if unspecified.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public EncounterPokemonDetail minPerfectIvs(Integer minPerfectIvs) {
    this.minPerfectIvs = minPerfectIvs;
    return this;
  }

  
  @ApiModelProperty(value = "The minimum number of perfect IVs, or null if unspecified.")
  @JsonProperty("min_perfect_ivs")
   @Min(-2147483648) @Max(2147483647)public Integer getMinPerfectIvs() {
    return minPerfectIvs;
  }

  @JsonProperty("min_perfect_ivs")
  public void setMinPerfectIvs(Integer minPerfectIvs) {
    this.minPerfectIvs = minPerfectIvs;
  }

  /**
   * Whether the encountered Pokémon is always shiny.
   **/
  public EncounterPokemonDetail alwaysShiny(Boolean alwaysShiny) {
    this.alwaysShiny = alwaysShiny;
    return this;
  }

  
  @ApiModelProperty(value = "Whether the encountered Pokémon is always shiny.")
  @JsonProperty("always_shiny")
  public Boolean getAlwaysShiny() {
    return alwaysShiny;
  }

  @JsonProperty("always_shiny")
  public void setAlwaysShiny(Boolean alwaysShiny) {
    this.alwaysShiny = alwaysShiny;
  }

  /**
   * Whether the encountered Pokémon can never be shiny.
   **/
  public EncounterPokemonDetail neverShiny(Boolean neverShiny) {
    this.neverShiny = neverShiny;
    return this;
  }

  
  @ApiModelProperty(value = "Whether the encountered Pokémon can never be shiny.")
  @JsonProperty("never_shiny")
  public Boolean getNeverShiny() {
    return neverShiny;
  }

  @JsonProperty("never_shiny")
  public void setNeverShiny(Boolean neverShiny) {
    this.neverShiny = neverShiny;
  }

  /**
   * Whether the encountered Pokémon is an alpha Pokémon.
   **/
  public EncounterPokemonDetail isAlpha(Boolean isAlpha) {
    this.isAlpha = isAlpha;
    return this;
  }

  
  @ApiModelProperty(value = "Whether the encountered Pokémon is an alpha Pokémon.")
  @JsonProperty("is_alpha")
  public Boolean getIsAlpha() {
    return isAlpha;
  }

  @JsonProperty("is_alpha")
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
