package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.AbilityDetailPokemonInnerPokemon;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * MoveDetailContestCombosNormal
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-02-07T04:17:07.396624034Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MoveDetailContestCombosNormal   {
  @JsonProperty("use_before")
  
  private List<AbilityDetailPokemonInnerPokemon> useBefore = new ArrayList<>();

  @JsonProperty("use_after")
  
  private List<AbilityDetailPokemonInnerPokemon> useAfter = new ArrayList<>();

  public MoveDetailContestCombosNormal useBefore(List<AbilityDetailPokemonInnerPokemon> useBefore) {
    this.useBefore = useBefore;
    return this;
  }

  public MoveDetailContestCombosNormal addUseBeforeItem(AbilityDetailPokemonInnerPokemon useBeforeItem) {
    if (this.useBefore == null) {
      this.useBefore = new ArrayList<>();
    }
    this.useBefore.add(useBeforeItem);
    return this;
  }

  /**
   * Get useBefore
   * @return useBefore
   */
  @ApiModelProperty(required = true, value = "")
  public List<AbilityDetailPokemonInnerPokemon> getUseBefore() {
    return useBefore;
  }

  public void setUseBefore(List<AbilityDetailPokemonInnerPokemon> useBefore) {
    this.useBefore = useBefore;
  }

  public MoveDetailContestCombosNormal useAfter(List<AbilityDetailPokemonInnerPokemon> useAfter) {
    this.useAfter = useAfter;
    return this;
  }

  public MoveDetailContestCombosNormal addUseAfterItem(AbilityDetailPokemonInnerPokemon useAfterItem) {
    if (this.useAfter == null) {
      this.useAfter = new ArrayList<>();
    }
    this.useAfter.add(useAfterItem);
    return this;
  }

  /**
   * Get useAfter
   * @return useAfter
   */
  @ApiModelProperty(required = true, value = "")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

