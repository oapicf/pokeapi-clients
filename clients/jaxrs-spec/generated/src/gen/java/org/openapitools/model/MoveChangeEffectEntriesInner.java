package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("MoveChange_effect_entries_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T04:17:57.915073257Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MoveChangeEffectEntriesInner   {
  private String effect;
  private String shortEffect;
  private AbilityDetailPokemonInnerPokemon language;

  public MoveChangeEffectEntriesInner() {
  }

  @JsonCreator
  public MoveChangeEffectEntriesInner(
    @JsonProperty(required = true, value = "effect") String effect,
    @JsonProperty(required = true, value = "short_effect") String shortEffect,
    @JsonProperty(required = true, value = "language") AbilityDetailPokemonInnerPokemon language
  ) {
    this.effect = effect;
    this.shortEffect = shortEffect;
    this.language = language;
  }

  /**
   **/
  public MoveChangeEffectEntriesInner effect(String effect) {
    this.effect = effect;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "effect")
  @NotNull public String getEffect() {
    return effect;
  }

  @JsonProperty(required = true, value = "effect")
  public void setEffect(String effect) {
    this.effect = effect;
  }

  /**
   **/
  public MoveChangeEffectEntriesInner shortEffect(String shortEffect) {
    this.shortEffect = shortEffect;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "short_effect")
  @NotNull public String getShortEffect() {
    return shortEffect;
  }

  @JsonProperty(required = true, value = "short_effect")
  public void setShortEffect(String shortEffect) {
    this.shortEffect = shortEffect;
  }

  /**
   **/
  public MoveChangeEffectEntriesInner language(AbilityDetailPokemonInnerPokemon language) {
    this.language = language;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "language")
  @NotNull @Valid public AbilityDetailPokemonInnerPokemon getLanguage() {
    return language;
  }

  @JsonProperty(required = true, value = "language")
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

