package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-07T15:23:57.425124504Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MoveDetailStatChangesInner   {
  
  private Integer change;
  private AbilityDetailPokemonInnerPokemon stat;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("change")
  @NotNull
  public Integer getChange() {
    return change;
  }
  public void setChange(Integer change) {
    this.change = change;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("stat")
  @NotNull
  @Valid
  public AbilityDetailPokemonInnerPokemon getStat() {
    return stat;
  }
  public void setStat(AbilityDetailPokemonInnerPokemon stat) {
    this.stat = stat;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoveDetailStatChangesInner moveDetailStatChangesInner = (MoveDetailStatChangesInner) o;
    return Objects.equals(this.change, moveDetailStatChangesInner.change) &&
        Objects.equals(this.stat, moveDetailStatChangesInner.stat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(change, stat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveDetailStatChangesInner {\n");
    
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    stat: ").append(toIndentedString(stat)).append("\n");
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

