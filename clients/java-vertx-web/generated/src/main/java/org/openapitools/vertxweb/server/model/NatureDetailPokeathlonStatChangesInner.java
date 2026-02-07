package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.AbilityDetailPokemonInnerPokemon;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class NatureDetailPokeathlonStatChangesInner   {
  
  private Integer maxChange;
  private AbilityDetailPokemonInnerPokemon pokeathlonStat;

  public NatureDetailPokeathlonStatChangesInner () {

  }

  public NatureDetailPokeathlonStatChangesInner (Integer maxChange, AbilityDetailPokemonInnerPokemon pokeathlonStat) {
    this.maxChange = maxChange;
    this.pokeathlonStat = pokeathlonStat;
  }

    
  @JsonProperty("max_change")
  public Integer getMaxChange() {
    return maxChange;
  }
  public void setMaxChange(Integer maxChange) {
    this.maxChange = maxChange;
  }

    
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
    return Objects.equals(maxChange, natureDetailPokeathlonStatChangesInner.maxChange) &&
        Objects.equals(pokeathlonStat, natureDetailPokeathlonStatChangesInner.pokeathlonStat);
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
