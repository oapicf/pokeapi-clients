package apimodels;

import apimodels.AbilityDetailPokemonInnerPokemon;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * NatureDetailPokeathlonStatChangesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-07T04:17:12.303882205Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class NatureDetailPokeathlonStatChangesInner   {
  @JsonProperty("max_change")
  @NotNull

  private Integer maxChange;

  @JsonProperty("pokeathlon_stat")
  @NotNull
@Valid

  private AbilityDetailPokemonInnerPokemon pokeathlonStat;

  public NatureDetailPokeathlonStatChangesInner maxChange(Integer maxChange) {
    this.maxChange = maxChange;
    return this;
  }

   /**
   * Get maxChange
   * @return maxChange
  **/
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
    return Objects.equals(maxChange, natureDetailPokeathlonStatChangesInner.maxChange) &&
        Objects.equals(pokeathlonStat, natureDetailPokeathlonStatChangesInner.pokeathlonStat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxChange, pokeathlonStat);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

