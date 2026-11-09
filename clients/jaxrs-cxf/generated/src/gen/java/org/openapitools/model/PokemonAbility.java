package org.openapitools.model;

import org.openapitools.model.AbilitySummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonAbility  {
  
 /**
  * Whether or not this is a hidden ability.
  */
  @ApiModelProperty(value = "Whether or not this is a hidden ability.")

  private Boolean isHidden;

 /**
  * The slot this ability occupies in this Pokémon species.
  */
  @ApiModelProperty(required = true, value = "The slot this ability occupies in this Pokémon species.")

  private Integer slot;

 /**
  * The ability the Pokémon may have.
  */
  @ApiModelProperty(required = true, value = "The ability the Pokémon may have.")

  @Valid

  private AbilitySummary ability;
 /**
   * Whether or not this is a hidden ability.
   * @return isHidden
  **/
  @JsonProperty("is_hidden")
  public Boolean getIsHidden() {
    return isHidden;
  }

  public void setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
  }

  public PokemonAbility isHidden(Boolean isHidden) {
    this.isHidden = isHidden;
    return this;
  }

 /**
   * The slot this ability occupies in this Pokémon species.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return slot
  **/
  @JsonProperty("slot")
  @NotNull
 @Min(-2147483648) @Max(2147483647)  public Integer getSlot() {
    return slot;
  }

  public void setSlot(Integer slot) {
    this.slot = slot;
  }

  public PokemonAbility slot(Integer slot) {
    this.slot = slot;
    return this;
  }

 /**
   * The ability the Pokémon may have.
   * @return ability
  **/
  @JsonProperty("ability")
  @NotNull
  public AbilitySummary getAbility() {
    return ability;
  }

  public void setAbility(AbilitySummary ability) {
    this.ability = ability;
  }

  public PokemonAbility ability(AbilitySummary ability) {
    this.ability = ability;
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
    PokemonAbility pokemonAbility = (PokemonAbility) o;
    return Objects.equals(this.isHidden, pokemonAbility.isHidden) &&
        Objects.equals(this.slot, pokemonAbility.slot) &&
        Objects.equals(this.ability, pokemonAbility.ability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isHidden, slot, ability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonAbility {\n");
    
    sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
    sb.append("    slot: ").append(toIndentedString(slot)).append("\n");
    sb.append("    ability: ").append(toIndentedString(ability)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

