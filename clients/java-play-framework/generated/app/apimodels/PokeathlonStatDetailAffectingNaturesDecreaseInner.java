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
 * PokeathlonStatDetailAffectingNaturesDecreaseInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-07T04:17:12.303882205Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PokeathlonStatDetailAffectingNaturesDecreaseInner   {
  @JsonProperty("max_change")
  @NotNull
@Max(-1)

  private Integer maxChange;

  @JsonProperty("nature")
  @NotNull
@Valid

  private AbilityDetailPokemonInnerPokemon nature;

  public PokeathlonStatDetailAffectingNaturesDecreaseInner maxChange(Integer maxChange) {
    this.maxChange = maxChange;
    return this;
  }

   /**
   * Get maxChange
   * maximum: -1
   * @return maxChange
  **/
  public Integer getMaxChange() {
    return maxChange;
  }

  public void setMaxChange(Integer maxChange) {
    this.maxChange = maxChange;
  }

  public PokeathlonStatDetailAffectingNaturesDecreaseInner nature(AbilityDetailPokemonInnerPokemon nature) {
    this.nature = nature;
    return this;
  }

   /**
   * Get nature
   * @return nature
  **/
  public AbilityDetailPokemonInnerPokemon getNature() {
    return nature;
  }

  public void setNature(AbilityDetailPokemonInnerPokemon nature) {
    this.nature = nature;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokeathlonStatDetailAffectingNaturesDecreaseInner pokeathlonStatDetailAffectingNaturesDecreaseInner = (PokeathlonStatDetailAffectingNaturesDecreaseInner) o;
    return Objects.equals(maxChange, pokeathlonStatDetailAffectingNaturesDecreaseInner.maxChange) &&
        Objects.equals(nature, pokeathlonStatDetailAffectingNaturesDecreaseInner.nature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxChange, nature);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokeathlonStatDetailAffectingNaturesDecreaseInner {\n");
    
    sb.append("    maxChange: ").append(toIndentedString(maxChange)).append("\n");
    sb.append("    nature: ").append(toIndentedString(nature)).append("\n");
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

