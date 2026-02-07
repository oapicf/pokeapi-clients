package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.AbilityDetailPokemonInnerPokemon;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PokeathlonStatDetailAffectingNaturesDecreaseInner   {
  
  private Integer maxChange;
  private AbilityDetailPokemonInnerPokemon nature;

  public PokeathlonStatDetailAffectingNaturesDecreaseInner () {

  }

  public PokeathlonStatDetailAffectingNaturesDecreaseInner (Integer maxChange, AbilityDetailPokemonInnerPokemon nature) {
    this.maxChange = maxChange;
    this.nature = nature;
  }

    
  @JsonProperty("max_change")
  public Integer getMaxChange() {
    return maxChange;
  }
  public void setMaxChange(Integer maxChange) {
    this.maxChange = maxChange;
  }

    
  @JsonProperty("nature")
  public AbilityDetailPokemonInnerPokemon getNature() {
    return nature;
  }
  public void setNature(AbilityDetailPokemonInnerPokemon nature) {
    this.nature = nature;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokeathlonStatDetailAffectingNaturesDecreaseInner pokeathlonStatDetailAffectingNaturesDecreaseInner = (PokeathlonStatDetailAffectingNaturesDecreaseInner) o;
    return Objects.equals(maxChange, pokeathlonStatDetailAffectingNaturesDecreaseInner.maxChange) &&
        Objects.equals(nature, pokeathlonStatDetailAffectingNaturesDecreaseInner.nature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxChange, nature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokeathlonStatDetailAffectingNaturesDecreaseInner {\n");
    
    sb.append("    maxChange: ").append(toIndentedString(maxChange)).append("\n");
    sb.append("    nature: ").append(toIndentedString(nature)).append("\n");
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
