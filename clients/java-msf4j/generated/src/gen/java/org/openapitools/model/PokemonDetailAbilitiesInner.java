package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;

/**
 * PokemonDetailAbilitiesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-02-07T04:17:01.559585484Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokemonDetailAbilitiesInner   {
  @JsonProperty("ability")
  private AbilityDetailPokemonInnerPokemon ability;

  @JsonProperty("is_hidden")
  private Boolean isHidden;

  @JsonProperty("slot")
  private Integer slot;

  public PokemonDetailAbilitiesInner ability(AbilityDetailPokemonInnerPokemon ability) {
    this.ability = ability;
    return this;
  }

   /**
   * Get ability
   * @return ability
  **/
  @ApiModelProperty(required = true, value = "")
  public AbilityDetailPokemonInnerPokemon getAbility() {
    return ability;
  }

  public void setAbility(AbilityDetailPokemonInnerPokemon ability) {
    this.ability = ability;
  }

  public PokemonDetailAbilitiesInner isHidden(Boolean isHidden) {
    this.isHidden = isHidden;
    return this;
  }

   /**
   * Get isHidden
   * @return isHidden
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getIsHidden() {
    return isHidden;
  }

  public void setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
  }

  public PokemonDetailAbilitiesInner slot(Integer slot) {
    this.slot = slot;
    return this;
  }

   /**
   * Get slot
   * @return slot
  **/
  @ApiModelProperty(required = true, value = "")
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

