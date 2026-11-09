package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AbilitySummary;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class PokemonAbility   {
  
  private Boolean isHidden;

  private Integer slot;

  private AbilitySummary ability;

  /**
   * Whether or not this is a hidden ability.
   **/
  public PokemonAbility isHidden(Boolean isHidden) {
    this.isHidden = isHidden;
    return this;
  }

  
  @ApiModelProperty(value = "Whether or not this is a hidden ability.")
  @JsonProperty("is_hidden")
  public Boolean getIsHidden() {
    return isHidden;
  }
  public void setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
  }


  /**
   * The slot this ability occupies in this Pokémon species.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public PokemonAbility slot(Integer slot) {
    this.slot = slot;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The slot this ability occupies in this Pokémon species.")
  @JsonProperty("slot")
  @NotNull
 @Min(-2147483648) @Max(2147483647)  public Integer getSlot() {
    return slot;
  }
  public void setSlot(Integer slot) {
    this.slot = slot;
  }


  /**
   * The ability the Pokémon may have.
   **/
  public PokemonAbility ability(AbilitySummary ability) {
    this.ability = ability;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The ability the Pokémon may have.")
  @JsonProperty("ability")
  @NotNull
  public AbilitySummary getAbility() {
    return ability;
  }
  public void setAbility(AbilitySummary ability) {
    this.ability = ability;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

