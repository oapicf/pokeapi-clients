package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.AbilityDetailPokemonInnerPokemon;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MoveDetailStatChangesInner   {
  
  private Integer change;
  private AbilityDetailPokemonInnerPokemon stat;

  public MoveDetailStatChangesInner () {

  }

  public MoveDetailStatChangesInner (Integer change, AbilityDetailPokemonInnerPokemon stat) {
    this.change = change;
    this.stat = stat;
  }

    
  @JsonProperty("change")
  public Integer getChange() {
    return change;
  }
  public void setChange(Integer change) {
    this.change = change;
  }

    
  @JsonProperty("stat")
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
    return Objects.equals(change, moveDetailStatChangesInner.change) &&
        Objects.equals(stat, moveDetailStatChangesInner.stat);
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
