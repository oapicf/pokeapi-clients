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
 * PokemonDetailAbilitiesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-07T04:17:12.303882205Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PokemonDetailAbilitiesInner   {
  @JsonProperty("ability")
  @NotNull
@Valid

  private AbilityDetailPokemonInnerPokemon ability;

  @JsonProperty("is_hidden")
  @NotNull

  private Boolean isHidden;

  @JsonProperty("slot")
  @NotNull

  private Integer slot;

  public PokemonDetailAbilitiesInner ability(AbilityDetailPokemonInnerPokemon ability) {
    this.ability = ability;
    return this;
  }

   /**
   * Get ability
   * @return ability
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

