package org.openapitools.model;

import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class PokemonDetailAbilitiesInner implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("ability")
  private AbilityDetailPokemonInnerPokemon ability;

  @JsonProperty("is_hidden")
  private Boolean isHidden;

  @JsonProperty("slot")
  private Integer slot;

  /**
   * 
   * @return ability
   */
  public AbilityDetailPokemonInnerPokemon getAbility() {
    return ability;
  }

  public void setAbility(AbilityDetailPokemonInnerPokemon ability) {
    this.ability = ability;
  }

  /**
   * 
   * @return isHidden
   */
  public Boolean getIsHidden() {
    return isHidden;
  }

  public void setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
  }

  /**
   * 
   * @return slot
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
