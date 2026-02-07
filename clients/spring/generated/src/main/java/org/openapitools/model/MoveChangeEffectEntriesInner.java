package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * MoveChangeEffectEntriesInner
 */

@JsonTypeName("MoveChange_effect_entries_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-07T04:22:27.168374474Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MoveChangeEffectEntriesInner {

  private String effect;

  private String shortEffect;

  private AbilityDetailPokemonInnerPokemon language;

  public MoveChangeEffectEntriesInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MoveChangeEffectEntriesInner(String effect, String shortEffect, AbilityDetailPokemonInnerPokemon language) {
    this.effect = effect;
    this.shortEffect = shortEffect;
    this.language = language;
  }

  public MoveChangeEffectEntriesInner effect(String effect) {
    this.effect = effect;
    return this;
  }

  /**
   * Get effect
   * @return effect
   */
  @NotNull 
  @Schema(name = "effect", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("effect")
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
   */
  @NotNull 
  @Schema(name = "short_effect", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("short_effect")
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
   */
  @NotNull @Valid 
  @Schema(name = "language", requiredMode = Schema.RequiredMode.REQUIRED)
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

