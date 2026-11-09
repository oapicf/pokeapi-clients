package org.openapitools.model;

import org.openapitools.model.AbilitySummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonAbilityPast  {
  
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
  */
  @JsonProperty("is_hidden")
  public Boolean getIsHidden() {
    return isHidden;
  }

  /**
   * Sets the <code>isHidden</code> property.
   */
 public void setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
  }

  /**
   * Sets the <code>isHidden</code> property.
   */
  public PokemonAbilityPast isHidden(Boolean isHidden) {
    this.isHidden = isHidden;
    return this;
  }

 /**
  * The slot this ability occupies in this Pokémon species.
  * minimum: -2147483648
  * maximum: 2147483647
  * @return slot
  */
  @JsonProperty("slot")
  @NotNull
 @Min(-2147483648) @Max(2147483647)  public Integer getSlot() {
    return slot;
  }

  /**
   * Sets the <code>slot</code> property.
   */
 public void setSlot(Integer slot) {
    this.slot = slot;
  }

  /**
   * Sets the <code>slot</code> property.
   */
  public PokemonAbilityPast slot(Integer slot) {
    this.slot = slot;
    return this;
  }

 /**
  * The ability the Pokémon may have.
  * @return ability
  */
  @JsonProperty("ability")
  @NotNull
  public AbilitySummary getAbility() {
    return ability;
  }

  /**
   * Sets the <code>ability</code> property.
   */
 public void setAbility(AbilitySummary ability) {
    this.ability = ability;
  }

  /**
   * Sets the <code>ability</code> property.
   */
  public PokemonAbilityPast ability(AbilitySummary ability) {
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
    PokemonAbilityPast pokemonAbilityPast = (PokemonAbilityPast) o;
    return Objects.equals(this.isHidden, pokemonAbilityPast.isHidden) &&
        Objects.equals(this.slot, pokemonAbilityPast.slot) &&
        Objects.equals(this.ability, pokemonAbilityPast.ability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isHidden, slot, ability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonAbilityPast {\n");
    
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

