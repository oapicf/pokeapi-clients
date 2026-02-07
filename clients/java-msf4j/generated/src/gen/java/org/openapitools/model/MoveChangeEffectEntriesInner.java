package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;

/**
 * MoveChangeEffectEntriesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-02-07T04:17:01.559585484Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MoveChangeEffectEntriesInner   {
  @JsonProperty("effect")
  private String effect;

  @JsonProperty("short_effect")
  private String shortEffect;

  @JsonProperty("language")
  private AbilityDetailPokemonInnerPokemon language;

  public MoveChangeEffectEntriesInner effect(String effect) {
    this.effect = effect;
    return this;
  }

   /**
   * Get effect
   * @return effect
  **/
  @ApiModelProperty(required = true, value = "")
  public String getEffect() {
    return effect;
  }

  public void setEffect(String effect) {
    this.effect = effect;
  }

  public MoveChangeEffectEntriesInner shortEffect(String shortEffect) {
    this.shortEffect = shortEffect;
    return this;
  }

   /**
   * Get shortEffect
   * @return shortEffect
  **/
  @ApiModelProperty(required = true, value = "")
  public String getShortEffect() {
    return shortEffect;
  }

  public void setShortEffect(String shortEffect) {
    this.shortEffect = shortEffect;
  }

  public MoveChangeEffectEntriesInner language(AbilityDetailPokemonInnerPokemon language) {
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @ApiModelProperty(required = true, value = "")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

