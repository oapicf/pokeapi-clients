package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("PokeathlonStatDetail_affecting_natures_increase_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T04:17:57.915073257Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokeathlonStatDetailAffectingNaturesIncreaseInner   {
  private Integer maxChange;
  private AbilityDetailPokemonInnerPokemon nature;

  public PokeathlonStatDetailAffectingNaturesIncreaseInner() {
  }

  @JsonCreator
  public PokeathlonStatDetailAffectingNaturesIncreaseInner(
    @JsonProperty(required = true, value = "max_change") Integer maxChange,
    @JsonProperty(required = true, value = "nature") AbilityDetailPokemonInnerPokemon nature
  ) {
    this.maxChange = maxChange;
    this.nature = nature;
  }

  /**
   * minimum: 1
   **/
  public PokeathlonStatDetailAffectingNaturesIncreaseInner maxChange(Integer maxChange) {
    this.maxChange = maxChange;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "max_change")
  @NotNull  @Min(1)public Integer getMaxChange() {
    return maxChange;
  }

  @JsonProperty(required = true, value = "max_change")
  public void setMaxChange(Integer maxChange) {
    this.maxChange = maxChange;
  }

  /**
   **/
  public PokeathlonStatDetailAffectingNaturesIncreaseInner nature(AbilityDetailPokemonInnerPokemon nature) {
    this.nature = nature;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "nature")
  @NotNull @Valid public AbilityDetailPokemonInnerPokemon getNature() {
    return nature;
  }

  @JsonProperty(required = true, value = "nature")
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

