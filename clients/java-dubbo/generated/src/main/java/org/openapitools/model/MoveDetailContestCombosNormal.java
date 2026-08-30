package org.openapitools.model;

import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class MoveDetailContestCombosNormal implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("use_before")
  private List<AbilityDetailPokemonInnerPokemon> useBefore = new ArrayList<>();

  @JsonProperty("use_after")
  private List<AbilityDetailPokemonInnerPokemon> useAfter = new ArrayList<>();

  /**
   * 
   * @return useBefore
   */
  public List<AbilityDetailPokemonInnerPokemon> getUseBefore() {
    return useBefore;
  }

  public void setUseBefore(List<AbilityDetailPokemonInnerPokemon> useBefore) {
    this.useBefore = useBefore;
  }

  /**
   * 
   * @return useAfter
   */
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
    return Objects.equals(this.useBefore, moveDetailContestCombosNormal.useBefore) &&
        Objects.equals(this.useAfter, moveDetailContestCombosNormal.useAfter);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
