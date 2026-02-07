package org.openapitools.model;

import org.openapitools.model.AbilityDetailPokemonInnerPokemon;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MoveChangeEffectEntriesInner  {
  
  @ApiModelProperty(required = true, value = "")

  private String effect;

  @ApiModelProperty(required = true, value = "")

  private String shortEffect;

  @ApiModelProperty(required = true, value = "")

  private AbilityDetailPokemonInnerPokemon language;
 /**
   * Get effect
   * @return effect
  **/
  @JsonProperty("effect")
  public String getEffect() {
    return effect;
  }

  public void setEffect(String effect) {
    this.effect = effect;
  }

  public MoveChangeEffectEntriesInner effect(String effect) {
    this.effect = effect;
    return this;
  }

 /**
   * Get shortEffect
   * @return shortEffect
  **/
  @JsonProperty("short_effect")
  public String getShortEffect() {
    return shortEffect;
  }

  public void setShortEffect(String shortEffect) {
    this.shortEffect = shortEffect;
  }

  public MoveChangeEffectEntriesInner shortEffect(String shortEffect) {
    this.shortEffect = shortEffect;
    return this;
  }

 /**
   * Get language
   * @return language
  **/
  @JsonProperty("language")
  public AbilityDetailPokemonInnerPokemon getLanguage() {
    return language;
  }

  public void setLanguage(AbilityDetailPokemonInnerPokemon language) {
    this.language = language;
  }

  public MoveChangeEffectEntriesInner language(AbilityDetailPokemonInnerPokemon language) {
    this.language = language;
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
    MoveChangeEffectEntriesInner moveChangeEffectEntriesInner = (MoveChangeEffectEntriesInner) o;
    return Objects.equals(this.effect, moveChangeEffectEntriesInner.effect) &&
        Objects.equals(this.shortEffect, moveChangeEffectEntriesInner.shortEffect) &&
        Objects.equals(this.language, moveChangeEffectEntriesInner.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effect, shortEffect, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveChangeEffectEntriesInner {\n");
    
    sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
    sb.append("    shortEffect: ").append(toIndentedString(shortEffect)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

