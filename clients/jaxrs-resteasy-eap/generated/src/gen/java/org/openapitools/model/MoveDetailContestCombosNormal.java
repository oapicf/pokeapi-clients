package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-02-07T04:17:52.397146649Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MoveDetailContestCombosNormal   {
  
  private List<@Valid AbilityDetailPokemonInnerPokemon> useBefore = new ArrayList<>();
  private List<@Valid AbilityDetailPokemonInnerPokemon> useAfter = new ArrayList<>();

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("use_before")
  @NotNull
  public List<@Valid AbilityDetailPokemonInnerPokemon> getUseBefore() {
    return useBefore;
  }
  public void setUseBefore(List<@Valid AbilityDetailPokemonInnerPokemon> useBefore) {
    this.useBefore = useBefore;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("use_after")
  @NotNull
  public List<@Valid AbilityDetailPokemonInnerPokemon> getUseAfter() {
    return useAfter;
  }
  public void setUseAfter(List<@Valid AbilityDetailPokemonInnerPokemon> useAfter) {
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

