package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.AbilityDetailPokemonInnerPokemon;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MoveChangeEffectEntriesInner   {
  
  private String effect;
  private String shortEffect;
  private AbilityDetailPokemonInnerPokemon language;

  public MoveChangeEffectEntriesInner () {

  }

  public MoveChangeEffectEntriesInner (String effect, String shortEffect, AbilityDetailPokemonInnerPokemon language) {
    this.effect = effect;
    this.shortEffect = shortEffect;
    this.language = language;
  }

    
  @JsonProperty("effect")
  public String getEffect() {
    return effect;
  }
  public void setEffect(String effect) {
    this.effect = effect;
  }

    
  @JsonProperty("short_effect")
  public String getShortEffect() {
    return shortEffect;
  }
  public void setShortEffect(String shortEffect) {
    this.shortEffect = shortEffect;
  }

    
  @JsonProperty("language")
  public AbilityDetailPokemonInnerPokemon getLanguage() {
    return language;
  }
  public void setLanguage(AbilityDetailPokemonInnerPokemon language) {
    this.language = language;
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
    return Objects.equals(effect, moveChangeEffectEntriesInner.effect) &&
        Objects.equals(shortEffect, moveChangeEffectEntriesInner.shortEffect) &&
        Objects.equals(language, moveChangeEffectEntriesInner.language);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
