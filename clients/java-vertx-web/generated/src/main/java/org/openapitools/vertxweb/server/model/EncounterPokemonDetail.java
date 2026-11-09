package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EncounterPokemonDetail   {
  
  private Integer minPerfectIvs;
  private Boolean alwaysShiny;
  private Boolean neverShiny;
  private Boolean isAlpha;

  public EncounterPokemonDetail () {

  }

  public EncounterPokemonDetail (Integer minPerfectIvs, Boolean alwaysShiny, Boolean neverShiny, Boolean isAlpha) {
    this.minPerfectIvs = minPerfectIvs;
    this.alwaysShiny = alwaysShiny;
    this.neverShiny = neverShiny;
    this.isAlpha = isAlpha;
  }

    
  @JsonProperty("min_perfect_ivs")
  public Integer getMinPerfectIvs() {
    return minPerfectIvs;
  }
  public void setMinPerfectIvs(Integer minPerfectIvs) {
    this.minPerfectIvs = minPerfectIvs;
  }

    
  @JsonProperty("always_shiny")
  public Boolean getAlwaysShiny() {
    return alwaysShiny;
  }
  public void setAlwaysShiny(Boolean alwaysShiny) {
    this.alwaysShiny = alwaysShiny;
  }

    
  @JsonProperty("never_shiny")
  public Boolean getNeverShiny() {
    return neverShiny;
  }
  public void setNeverShiny(Boolean neverShiny) {
    this.neverShiny = neverShiny;
  }

    
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
