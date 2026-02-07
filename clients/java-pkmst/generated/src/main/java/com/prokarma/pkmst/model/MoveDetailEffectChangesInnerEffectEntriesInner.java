package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.AbilityDetailPokemonInnerPokemon;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * MoveDetailEffectChangesInnerEffectEntriesInner
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-02-07T04:17:07.396624034Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MoveDetailEffectChangesInnerEffectEntriesInner   {
  @JsonProperty("effect")
  private String effect;

  @JsonProperty("language")
  private AbilityDetailPokemonInnerPokemon language;

  public MoveDetailEffectChangesInnerEffectEntriesInner effect(String effect) {
    this.effect = effect;
    return this;
  }

  /**
   * Get effect
   * @return effect
   */
  @ApiModelProperty(required = true, value = "")
  public String getEffect() {
    return effect;
  }

  public void setEffect(String effect) {
    this.effect = effect;
  }

  public MoveDetailEffectChangesInnerEffectEntriesInner language(AbilityDetailPokemonInnerPokemon language) {
    this.language = language;
    return this;
  }

  /**
   * Get language
   * @return language
   */
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
    MoveDetailEffectChangesInnerEffectEntriesInner moveDetailEffectChangesInnerEffectEntriesInner = (MoveDetailEffectChangesInnerEffectEntriesInner) o;
    return Objects.equals(this.effect, moveDetailEffectChangesInnerEffectEntriesInner.effect) &&
        Objects.equals(this.language, moveDetailEffectChangesInnerEffectEntriesInner.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effect, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveDetailEffectChangesInnerEffectEntriesInner {\n");
    
    sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
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

