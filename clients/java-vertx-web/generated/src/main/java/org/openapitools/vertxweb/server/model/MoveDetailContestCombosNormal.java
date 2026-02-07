package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.AbilityDetailPokemonInnerPokemon;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MoveDetailContestCombosNormal   {
  
  private List<AbilityDetailPokemonInnerPokemon> useBefore = new ArrayList<>();
  private List<AbilityDetailPokemonInnerPokemon> useAfter = new ArrayList<>();

  public MoveDetailContestCombosNormal () {

  }

  public MoveDetailContestCombosNormal (List<AbilityDetailPokemonInnerPokemon> useBefore, List<AbilityDetailPokemonInnerPokemon> useAfter) {
    this.useBefore = useBefore;
    this.useAfter = useAfter;
  }

    
  @JsonProperty("use_before")
  public List<AbilityDetailPokemonInnerPokemon> getUseBefore() {
    return useBefore;
  }
  public void setUseBefore(List<AbilityDetailPokemonInnerPokemon> useBefore) {
    this.useBefore = useBefore;
  }

    
  @JsonProperty("use_after")
  public List<AbilityDetailPokemonInnerPokemon> getUseAfter() {
    return useAfter;
  }
  public void setUseAfter(List<AbilityDetailPokemonInnerPokemon> useAfter) {
    this.useAfter = useAfter;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoveDetailContestCombosNormal moveDetailContestCombosNormal = (MoveDetailContestCombosNormal) o;
    return Objects.equals(useBefore, moveDetailContestCombosNormal.useBefore) &&
        Objects.equals(useAfter, moveDetailContestCombosNormal.useAfter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(useBefore, useAfter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveDetailContestCombosNormal {\n");
    
    sb.append("    useBefore: ").append(toIndentedString(useBefore)).append("\n");
    sb.append("    useAfter: ").append(toIndentedString(useAfter)).append("\n");
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
