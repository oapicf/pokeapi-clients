package org.openapitools.model;

import org.openapitools.model.AbilityDetailPokemonInnerPokemon;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AbilityDetailPokemonInner  {
  
  @ApiModelProperty(required = true, value = "")

  private Boolean isHidden;

  @ApiModelProperty(required = true, value = "")

  private Integer slot;

  @ApiModelProperty(required = true, value = "")

  private AbilityDetailPokemonInnerPokemon pokemon;
 /**
   * Get isHidden
   * @return isHidden
  **/
  @JsonProperty("is_hidden")
  public Boolean getIsHidden() {
    return isHidden;
  }

  public void setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
  }

  public AbilityDetailPokemonInner isHidden(Boolean isHidden) {
    this.isHidden = isHidden;
    return this;
  }

 /**
   * Get slot
   * @return slot
  **/
  @JsonProperty("slot")
  public Integer getSlot() {
    return slot;
  }

  public void setSlot(Integer slot) {
    this.slot = slot;
  }

  public AbilityDetailPokemonInner slot(Integer slot) {
    this.slot = slot;
    return this;
  }

 /**
   * Get pokemon
   * @return pokemon
  **/
  @JsonProperty("pokemon")
  public AbilityDetailPokemonInnerPokemon getPokemon() {
    return pokemon;
  }

  public void setPokemon(AbilityDetailPokemonInnerPokemon pokemon) {
    this.pokemon = pokemon;
  }

  public AbilityDetailPokemonInner pokemon(AbilityDetailPokemonInnerPokemon pokemon) {
    this.pokemon = pokemon;
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
    AbilityDetailPokemonInner abilityDetailPokemonInner = (AbilityDetailPokemonInner) o;
    return Objects.equals(this.isHidden, abilityDetailPokemonInner.isHidden) &&
        Objects.equals(this.slot, abilityDetailPokemonInner.slot) &&
        Objects.equals(this.pokemon, abilityDetailPokemonInner.pokemon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isHidden, slot, pokemon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbilityDetailPokemonInner {\n");
    
    sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
    sb.append("    slot: ").append(toIndentedString(slot)).append("\n");
    sb.append("    pokemon: ").append(toIndentedString(pokemon)).append("\n");
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

