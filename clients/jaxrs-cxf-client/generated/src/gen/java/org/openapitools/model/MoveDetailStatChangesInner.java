package org.openapitools.model;

import org.openapitools.model.AbilityDetailPokemonInnerPokemon;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MoveDetailStatChangesInner  {
  
  @ApiModelProperty(required = true, value = "")

  private Integer change;

  @ApiModelProperty(required = true, value = "")

  private AbilityDetailPokemonInnerPokemon stat;
 /**
   * Get change
   * @return change
  **/
  @JsonProperty("change")
  public Integer getChange() {
    return change;
  }

  public void setChange(Integer change) {
    this.change = change;
  }

  public MoveDetailStatChangesInner change(Integer change) {
    this.change = change;
    return this;
  }

 /**
   * Get stat
   * @return stat
  **/
  @JsonProperty("stat")
  public AbilityDetailPokemonInnerPokemon getStat() {
    return stat;
  }

  public void setStat(AbilityDetailPokemonInnerPokemon stat) {
    this.stat = stat;
  }

  public MoveDetailStatChangesInner stat(AbilityDetailPokemonInnerPokemon stat) {
    this.stat = stat;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

