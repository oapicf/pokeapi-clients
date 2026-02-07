package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;

/**
 * AbilityDetailPokemonInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-02-07T04:17:01.559585484Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AbilityDetailPokemonInner   {
  @JsonProperty("is_hidden")
  private Boolean isHidden;

  @JsonProperty("slot")
  private Integer slot;

  @JsonProperty("pokemon")
  private AbilityDetailPokemonInnerPokemon pokemon;

  public AbilityDetailPokemonInner isHidden(Boolean isHidden) {
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

  public AbilityDetailPokemonInner slot(Integer slot) {
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

  public AbilityDetailPokemonInner pokemon(AbilityDetailPokemonInnerPokemon pokemon) {
    this.pokemon = pokemon;
    return this;
  }

   /**
   * Get pokemon
   * @return pokemon
  **/
  @ApiModelProperty(required = true, value = "")
  public AbilityDetailPokemonInnerPokemon getPokemon() {
    return pokemon;
  }

  public void setPokemon(AbilityDetailPokemonInnerPokemon pokemon) {
    this.pokemon = pokemon;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

