package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.AbilityDetailPokemonInnerPokemon;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StatDetailAffectingNatures   {
  
  private List<AbilityDetailPokemonInnerPokemon> increase = new ArrayList<>();
  private List<AbilityDetailPokemonInnerPokemon> decrease = new ArrayList<>();

  public StatDetailAffectingNatures () {

  }

  public StatDetailAffectingNatures (List<AbilityDetailPokemonInnerPokemon> increase, List<AbilityDetailPokemonInnerPokemon> decrease) {
    this.increase = increase;
    this.decrease = decrease;
  }

    
  @JsonProperty("increase")
  public List<AbilityDetailPokemonInnerPokemon> getIncrease() {
    return increase;
  }
  public void setIncrease(List<AbilityDetailPokemonInnerPokemon> increase) {
    this.increase = increase;
  }

    
  @JsonProperty("decrease")
  public List<AbilityDetailPokemonInnerPokemon> getDecrease() {
    return decrease;
  }
  public void setDecrease(List<AbilityDetailPokemonInnerPokemon> decrease) {
    this.decrease = decrease;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatDetailAffectingNatures statDetailAffectingNatures = (StatDetailAffectingNatures) o;
    return Objects.equals(increase, statDetailAffectingNatures.increase) &&
        Objects.equals(decrease, statDetailAffectingNatures.decrease);
  }

  @Override
  public int hashCode() {
    return Objects.hash(increase, decrease);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatDetailAffectingNatures {\n");
    
    sb.append("    increase: ").append(toIndentedString(increase)).append("\n");
    sb.append("    decrease: ").append(toIndentedString(decrease)).append("\n");
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
