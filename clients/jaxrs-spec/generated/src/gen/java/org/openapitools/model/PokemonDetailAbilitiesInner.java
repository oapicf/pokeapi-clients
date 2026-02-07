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



@JsonTypeName("PokemonDetail_abilities_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T04:17:57.915073257Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokemonDetailAbilitiesInner   {
  private AbilityDetailPokemonInnerPokemon ability;
  private Boolean isHidden;
  private Integer slot;

  public PokemonDetailAbilitiesInner() {
  }

  @JsonCreator
  public PokemonDetailAbilitiesInner(
    @JsonProperty(required = true, value = "ability") AbilityDetailPokemonInnerPokemon ability,
    @JsonProperty(required = true, value = "is_hidden") Boolean isHidden,
    @JsonProperty(required = true, value = "slot") Integer slot
  ) {
    this.ability = ability;
    this.isHidden = isHidden;
    this.slot = slot;
  }

  /**
   **/
  public PokemonDetailAbilitiesInner ability(AbilityDetailPokemonInnerPokemon ability) {
    this.ability = ability;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "ability")
  @NotNull @Valid public AbilityDetailPokemonInnerPokemon getAbility() {
    return ability;
  }

  @JsonProperty(required = true, value = "ability")
  public void setAbility(AbilityDetailPokemonInnerPokemon ability) {
    this.ability = ability;
  }

  /**
   **/
  public PokemonDetailAbilitiesInner isHidden(Boolean isHidden) {
    this.isHidden = isHidden;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "is_hidden")
  @NotNull public Boolean getIsHidden() {
    return isHidden;
  }

  @JsonProperty(required = true, value = "is_hidden")
  public void setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
  }

  /**
   **/
  public PokemonDetailAbilitiesInner slot(Integer slot) {
    this.slot = slot;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "slot")
  @NotNull public Integer getSlot() {
    return slot;
  }

  @JsonProperty(required = true, value = "slot")
  public void setSlot(Integer slot) {
    this.slot = slot;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonDetailAbilitiesInner pokemonDetailAbilitiesInner = (PokemonDetailAbilitiesInner) o;
    return Objects.equals(this.ability, pokemonDetailAbilitiesInner.ability) &&
        Objects.equals(this.isHidden, pokemonDetailAbilitiesInner.isHidden) &&
        Objects.equals(this.slot, pokemonDetailAbilitiesInner.slot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ability, isHidden, slot);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonDetailAbilitiesInner {\n");
    
    sb.append("    ability: ").append(toIndentedString(ability)).append("\n");
    sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
    sb.append("    slot: ").append(toIndentedString(slot)).append("\n");
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

