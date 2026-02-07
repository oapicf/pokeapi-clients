package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class NatureDetailPokeathlonStatChangesInner  {
  
  @ApiModelProperty(required = true, value = "")
  private Integer maxChange;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private AbilityDetailPokemonInnerPokemon pokeathlonStat;
 /**
  * Get maxChange
  * @return maxChange
  */
  @JsonProperty("max_change")
  @NotNull
  public Integer getMaxChange() {
    return maxChange;
  }

  /**
   * Sets the <code>maxChange</code> property.
   */
 public void setMaxChange(Integer maxChange) {
    this.maxChange = maxChange;
  }

  /**
   * Sets the <code>maxChange</code> property.
   */
  public NatureDetailPokeathlonStatChangesInner maxChange(Integer maxChange) {
    this.maxChange = maxChange;
    return this;
  }

 /**
  * Get pokeathlonStat
  * @return pokeathlonStat
  */
  @JsonProperty("pokeathlon_stat")
  @NotNull
  public AbilityDetailPokemonInnerPokemon getPokeathlonStat() {
    return pokeathlonStat;
  }

  /**
   * Sets the <code>pokeathlonStat</code> property.
   */
 public void setPokeathlonStat(AbilityDetailPokemonInnerPokemon pokeathlonStat) {
    this.pokeathlonStat = pokeathlonStat;
  }

  /**
   * Sets the <code>pokeathlonStat</code> property.
   */
  public NatureDetailPokeathlonStatChangesInner pokeathlonStat(AbilityDetailPokemonInnerPokemon pokeathlonStat) {
    this.pokeathlonStat = pokeathlonStat;
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
    NatureDetailPokeathlonStatChangesInner natureDetailPokeathlonStatChangesInner = (NatureDetailPokeathlonStatChangesInner) o;
    return Objects.equals(this.maxChange, natureDetailPokeathlonStatChangesInner.maxChange) &&
        Objects.equals(this.pokeathlonStat, natureDetailPokeathlonStatChangesInner.pokeathlonStat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxChange, pokeathlonStat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NatureDetailPokeathlonStatChangesInner {\n");
    
    sb.append("    maxChange: ").append(toIndentedString(maxChange)).append("\n");
    sb.append("    pokeathlonStat: ").append(toIndentedString(pokeathlonStat)).append("\n");
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

