package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("MoveDetail_contest_combos_normal")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T04:17:57.915073257Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MoveDetailContestCombosNormal   {
  private @Valid List<@Valid AbilityDetailPokemonInnerPokemon> useBefore = new ArrayList<>();
  private @Valid List<@Valid AbilityDetailPokemonInnerPokemon> useAfter = new ArrayList<>();

  public MoveDetailContestCombosNormal() {
  }

  @JsonCreator
  public MoveDetailContestCombosNormal(
    @JsonProperty(required = true, value = "use_before") List<@Valid AbilityDetailPokemonInnerPokemon> useBefore,
    @JsonProperty(required = true, value = "use_after") List<@Valid AbilityDetailPokemonInnerPokemon> useAfter
  ) {
    this.useBefore = useBefore;
    this.useAfter = useAfter;
  }

  /**
   **/
  public MoveDetailContestCombosNormal useBefore(List<@Valid AbilityDetailPokemonInnerPokemon> useBefore) {
    this.useBefore = useBefore;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "use_before")
  @NotNull @Valid public List<@Valid AbilityDetailPokemonInnerPokemon> getUseBefore() {
    return useBefore;
  }

  @JsonProperty(required = true, value = "use_before")
  public void setUseBefore(List<@Valid AbilityDetailPokemonInnerPokemon> useBefore) {
    this.useBefore = useBefore;
  }

  public MoveDetailContestCombosNormal addUseBeforeItem(AbilityDetailPokemonInnerPokemon useBeforeItem) {
    if (this.useBefore == null) {
      this.useBefore = new ArrayList<>();
    }

    this.useBefore.add(useBeforeItem);
    return this;
  }

  public MoveDetailContestCombosNormal removeUseBeforeItem(AbilityDetailPokemonInnerPokemon useBeforeItem) {
    if (useBeforeItem != null && this.useBefore != null) {
      this.useBefore.remove(useBeforeItem);
    }

    return this;
  }
  /**
   **/
  public MoveDetailContestCombosNormal useAfter(List<@Valid AbilityDetailPokemonInnerPokemon> useAfter) {
    this.useAfter = useAfter;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "use_after")
  @NotNull @Valid public List<@Valid AbilityDetailPokemonInnerPokemon> getUseAfter() {
    return useAfter;
  }

  @JsonProperty(required = true, value = "use_after")
  public void setUseAfter(List<@Valid AbilityDetailPokemonInnerPokemon> useAfter) {
    this.useAfter = useAfter;
  }

  public MoveDetailContestCombosNormal addUseAfterItem(AbilityDetailPokemonInnerPokemon useAfterItem) {
    if (this.useAfter == null) {
      this.useAfter = new ArrayList<>();
    }

    this.useAfter.add(useAfterItem);
    return this;
  }

  public MoveDetailContestCombosNormal removeUseAfterItem(AbilityDetailPokemonInnerPokemon useAfterItem) {
    if (useAfterItem != null && this.useAfter != null) {
      this.useAfter.remove(useAfterItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

