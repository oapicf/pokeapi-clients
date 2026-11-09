/*
 * PokéAPI
 *
 * All the Pokémon data you'll ever need in one place, easily accessible through a modern free open-source RESTful API.  ## What is this?  This is a full RESTful API linked to an extensive database detailing everything about the Pokémon main game series.  We've covered everything from Pokémon to Berry Flavors.  ## Where do I start?  We have awesome [documentation](https://pokeapi.co/docs/v2) on how to use this API. It takes minutes to get started.  This API will always be publicly available and will never require any extensive setup process to consume.  Created by [**Paul Hallett**](https://github.com/phalt) and other [**PokéAPI contributors**](https://github.com/PokeAPI/pokeapi#contributing) around the world. Pokémon and Pokémon character names are trademarks of Nintendo.
 *
 * OpenAPI document version: 2.10.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-11-09T13:49:34.675912514Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class EncounterPokemonDetail   {
  
  private Integer minPerfectIvs;
  private Boolean alwaysShiny;
  private Boolean neverShiny;
  private Boolean isAlpha;

  /**
   * The minimum number of perfect IVs, or null if unspecified.
   * minimum: -2147483648
   * maximum: 2147483647
   */
  public EncounterPokemonDetail minPerfectIvs(Integer minPerfectIvs) {
    this.minPerfectIvs = minPerfectIvs;
    return this;
  }

  
  @ApiModelProperty(value = "The minimum number of perfect IVs, or null if unspecified.")
  @JsonProperty("min_perfect_ivs")
  public Integer getMinPerfectIvs() {
    return minPerfectIvs;
  }
  public void setMinPerfectIvs(Integer minPerfectIvs) {
    this.minPerfectIvs = minPerfectIvs;
  }

  /**
   * Whether the encountered Pokémon is always shiny.
   */
  public EncounterPokemonDetail alwaysShiny(Boolean alwaysShiny) {
    this.alwaysShiny = alwaysShiny;
    return this;
  }

  
  @ApiModelProperty(value = "Whether the encountered Pokémon is always shiny.")
  @JsonProperty("always_shiny")
  public Boolean getAlwaysShiny() {
    return alwaysShiny;
  }
  public void setAlwaysShiny(Boolean alwaysShiny) {
    this.alwaysShiny = alwaysShiny;
  }

  /**
   * Whether the encountered Pokémon can never be shiny.
   */
  public EncounterPokemonDetail neverShiny(Boolean neverShiny) {
    this.neverShiny = neverShiny;
    return this;
  }

  
  @ApiModelProperty(value = "Whether the encountered Pokémon can never be shiny.")
  @JsonProperty("never_shiny")
  public Boolean getNeverShiny() {
    return neverShiny;
  }
  public void setNeverShiny(Boolean neverShiny) {
    this.neverShiny = neverShiny;
  }

  /**
   * Whether the encountered Pokémon is an alpha Pokémon.
   */
  public EncounterPokemonDetail isAlpha(Boolean isAlpha) {
    this.isAlpha = isAlpha;
    return this;
  }

  
  @ApiModelProperty(value = "Whether the encountered Pokémon is an alpha Pokémon.")
  @JsonProperty("is_alpha")
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

