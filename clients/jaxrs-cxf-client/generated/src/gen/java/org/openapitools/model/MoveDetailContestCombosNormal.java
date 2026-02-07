package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MoveDetailContestCombosNormal  {
  
  @ApiModelProperty(required = true, value = "")

  private List<AbilityDetailPokemonInnerPokemon> useBefore = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<AbilityDetailPokemonInnerPokemon> useAfter = new ArrayList<>();
 /**
   * Get useBefore
   * @return useBefore
  **/
  @JsonProperty("use_before")
  public List<AbilityDetailPokemonInnerPokemon> getUseBefore() {
    return useBefore;
  }

  public void setUseBefore(List<AbilityDetailPokemonInnerPokemon> useBefore) {
    this.useBefore = useBefore;
  }

  public MoveDetailContestCombosNormal useBefore(List<AbilityDetailPokemonInnerPokemon> useBefore) {
    this.useBefore = useBefore;
    return this;
  }

  public MoveDetailContestCombosNormal addUseBeforeItem(AbilityDetailPokemonInnerPokemon useBeforeItem) {
    this.useBefore.add(useBeforeItem);
    return this;
  }

 /**
   * Get useAfter
   * @return useAfter
  **/
  @JsonProperty("use_after")
  public List<AbilityDetailPokemonInnerPokemon> getUseAfter() {
    return useAfter;
  }

  public void setUseAfter(List<AbilityDetailPokemonInnerPokemon> useAfter) {
    this.useAfter = useAfter;
  }

  public MoveDetailContestCombosNormal useAfter(List<AbilityDetailPokemonInnerPokemon> useAfter) {
    this.useAfter = useAfter;
    return this;
  }

  public MoveDetailContestCombosNormal addUseAfterItem(AbilityDetailPokemonInnerPokemon useAfterItem) {
    this.useAfter.add(useAfterItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

