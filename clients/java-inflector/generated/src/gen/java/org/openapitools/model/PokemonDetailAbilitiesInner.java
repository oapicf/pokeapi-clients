package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-02-07T04:16:44.910526458Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokemonDetailAbilitiesInner   {
  @JsonProperty("ability")
  private AbilityDetailPokemonInnerPokemon ability;

  @JsonProperty("is_hidden")
  private Boolean isHidden;

  @JsonProperty("slot")
  private Integer slot;

  /**
   **/
  public PokemonDetailAbilitiesInner ability(AbilityDetailPokemonInnerPokemon ability) {
    this.ability = ability;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("ability")
  public AbilityDetailPokemonInnerPokemon getAbility() {
    return ability;
  }
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
  @JsonProperty("is_hidden")
  public Boolean getIsHidden() {
    return isHidden;
  }
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
  @JsonProperty("slot")
  public Integer getSlot() {
    return slot;
  }
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
    return Objects.equals(ability, pokemonDetailAbilitiesInner.ability) &&
        Objects.equals(isHidden, pokemonDetailAbilitiesInner.isHidden) &&
        Objects.equals(slot, pokemonDetailAbilitiesInner.slot);
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

