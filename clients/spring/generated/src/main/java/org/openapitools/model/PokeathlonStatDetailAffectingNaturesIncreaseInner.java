package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PokeathlonStatDetailAffectingNaturesIncreaseInner
 */

@JsonTypeName("PokeathlonStatDetail_affecting_natures_increase_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-07T04:22:27.168374474Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokeathlonStatDetailAffectingNaturesIncreaseInner {

  private Integer maxChange;

  private AbilityDetailPokemonInnerPokemon nature;

  public PokeathlonStatDetailAffectingNaturesIncreaseInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PokeathlonStatDetailAffectingNaturesIncreaseInner(Integer maxChange, AbilityDetailPokemonInnerPokemon nature) {
    this.maxChange = maxChange;
    this.nature = nature;
  }

  public PokeathlonStatDetailAffectingNaturesIncreaseInner maxChange(Integer maxChange) {
    this.maxChange = maxChange;
    return this;
  }

  /**
   * Get maxChange
   * minimum: 1
   * @return maxChange
   */
  @NotNull @Min(value = 1) 
  @Schema(name = "max_change", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("max_change")
  public Integer getMaxChange() {
    return maxChange;
  }

  public void setMaxChange(Integer maxChange) {
    this.maxChange = maxChange;
  }

  public PokeathlonStatDetailAffectingNaturesIncreaseInner nature(AbilityDetailPokemonInnerPokemon nature) {
    this.nature = nature;
    return this;
  }

  /**
   * Get nature
   * @return nature
   */
  @NotNull @Valid 
  @Schema(name = "nature", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("nature")
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
    PokeathlonStatDetailAffectingNaturesIncreaseInner pokeathlonStatDetailAffectingNaturesIncreaseInner = (PokeathlonStatDetailAffectingNaturesIncreaseInner) o;
    return Objects.equals(this.maxChange, pokeathlonStatDetailAffectingNaturesIncreaseInner.maxChange) &&
        Objects.equals(this.nature, pokeathlonStatDetailAffectingNaturesIncreaseInner.nature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxChange, nature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokeathlonStatDetailAffectingNaturesIncreaseInner {\n");
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

