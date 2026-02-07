package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;

/**
 * NatureDetailPokeathlonStatChangesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-02-07T04:17:01.559585484Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class NatureDetailPokeathlonStatChangesInner   {
  @JsonProperty("max_change")
  private Integer maxChange;

  @JsonProperty("pokeathlon_stat")
  private AbilityDetailPokemonInnerPokemon pokeathlonStat;

  public NatureDetailPokeathlonStatChangesInner maxChange(Integer maxChange) {
    this.maxChange = maxChange;
    return this;
  }

   /**
   * Get maxChange
   * @return maxChange
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getMaxChange() {
    return maxChange;
  }

  public void setMaxChange(Integer maxChange) {
    this.maxChange = maxChange;
  }

  public NatureDetailPokeathlonStatChangesInner pokeathlonStat(AbilityDetailPokemonInnerPokemon pokeathlonStat) {
    this.pokeathlonStat = pokeathlonStat;
    return this;
  }

   /**
   * Get pokeathlonStat
   * @return pokeathlonStat
  **/
  @ApiModelProperty(required = true, value = "")
  public AbilityDetailPokemonInnerPokemon getPokeathlonStat() {
    return pokeathlonStat;
  }

  public void setPokeathlonStat(AbilityDetailPokemonInnerPokemon pokeathlonStat) {
    this.pokeathlonStat = pokeathlonStat;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

