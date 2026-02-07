package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MoveDetailContestCombosNormal  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid AbilityDetailPokemonInnerPokemon> useBefore = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid AbilityDetailPokemonInnerPokemon> useAfter = new ArrayList<>();
 /**
  * Get useBefore
  * @return useBefore
  */
  @JsonProperty("use_before")
  @NotNull
  public List<@Valid AbilityDetailPokemonInnerPokemon> getUseBefore() {
    return useBefore;
  }

  /**
   * Sets the <code>useBefore</code> property.
   */
 public void setUseBefore(List<@Valid AbilityDetailPokemonInnerPokemon> useBefore) {
    this.useBefore = useBefore;
  }

  /**
   * Sets the <code>useBefore</code> property.
   */
  public MoveDetailContestCombosNormal useBefore(List<@Valid AbilityDetailPokemonInnerPokemon> useBefore) {
    this.useBefore = useBefore;
    return this;
  }

  /**
   * Adds a new item to the <code>useBefore</code> list.
   */
  public MoveDetailContestCombosNormal addUseBeforeItem(AbilityDetailPokemonInnerPokemon useBeforeItem) {
    this.useBefore.add(useBeforeItem);
    return this;
  }

 /**
  * Get useAfter
  * @return useAfter
  */
  @JsonProperty("use_after")
  @NotNull
  public List<@Valid AbilityDetailPokemonInnerPokemon> getUseAfter() {
    return useAfter;
  }

  /**
   * Sets the <code>useAfter</code> property.
   */
 public void setUseAfter(List<@Valid AbilityDetailPokemonInnerPokemon> useAfter) {
    this.useAfter = useAfter;
  }

  /**
   * Sets the <code>useAfter</code> property.
   */
  public MoveDetailContestCombosNormal useAfter(List<@Valid AbilityDetailPokemonInnerPokemon> useAfter) {
    this.useAfter = useAfter;
    return this;
  }

  /**
   * Adds a new item to the <code>useAfter</code> list.
   */
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

