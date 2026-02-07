package org.openapitools.model;

import org.openapitools.model.AbilityDetailPokemonInnerPokemon;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokeathlonStatDetailAffectingNaturesIncreaseInner  {
  
  @ApiModelProperty(required = true, value = "")

  private Integer maxChange;

  @ApiModelProperty(required = true, value = "")

  private AbilityDetailPokemonInnerPokemon nature;
 /**
   * Get maxChange
   * minimum: 1
   * @return maxChange
  **/
  @JsonProperty("max_change")
  public Integer getMaxChange() {
    return maxChange;
  }

  public void setMaxChange(Integer maxChange) {
    this.maxChange = maxChange;
  }

  public PokeathlonStatDetailAffectingNaturesIncreaseInner maxChange(Integer maxChange) {
    this.maxChange = maxChange;
    return this;
  }

 /**
   * Get nature
   * @return nature
  **/
  @JsonProperty("nature")
  public AbilityDetailPokemonInnerPokemon getNature() {
    return nature;
  }

  public void setNature(AbilityDetailPokemonInnerPokemon nature) {
    this.nature = nature;
  }

  public PokeathlonStatDetailAffectingNaturesIncreaseInner nature(AbilityDetailPokemonInnerPokemon nature) {
    this.nature = nature;
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
    PokeathlonStatDetailAffectingNaturesIncreaseInner pokeathlonStatDetailAffectingNaturesIncreaseInner = (PokeathlonStatDetailAffectingNaturesIncreaseInner) o;
    return Objects.equals(this.maxChange, pokeathlonStatDetailAffectingNaturesIncreaseInner.maxChange) &&
        Objects.equals(this.nature, pokeathlonStatDetailAffectingNaturesIncreaseInner.nature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxChange, nature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokeathlonStatDetailAffectingNaturesIncreaseInner {\n");
    
    sb.append("    maxChange: ").append(toIndentedString(maxChange)).append("\n");
    sb.append("    nature: ").append(toIndentedString(nature)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

