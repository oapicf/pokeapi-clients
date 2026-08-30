package org.openapitools.model;

import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class MoveDetailStatChangesInner implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("change")
  private Integer change;

  @JsonProperty("stat")
  private AbilityDetailPokemonInnerPokemon stat;

  /**
   * 
   * @return change
   */
  public Integer getChange() {
    return change;
  }

  public void setChange(Integer change) {
    this.change = change;
  }

  /**
   * 
   * @return stat
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
