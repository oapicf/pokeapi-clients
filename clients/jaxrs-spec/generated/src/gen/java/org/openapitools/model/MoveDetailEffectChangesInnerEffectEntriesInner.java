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



@JsonTypeName("MoveDetail_effect_changes_inner_effect_entries_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T15:24:06.001755207Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MoveDetailEffectChangesInnerEffectEntriesInner   {
  private String effect;
  private AbilityDetailPokemonInnerPokemon language;

  public MoveDetailEffectChangesInnerEffectEntriesInner() {
  }

  @JsonCreator
  public MoveDetailEffectChangesInnerEffectEntriesInner(
    @JsonProperty(required = true, value = "effect") String effect,
    @JsonProperty(required = true, value = "language") AbilityDetailPokemonInnerPokemon language
  ) {
    this.effect = effect;
    this.language = language;
  }

  /**
   **/
  public MoveDetailEffectChangesInnerEffectEntriesInner effect(String effect) {
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
  public MoveDetailEffectChangesInnerEffectEntriesInner language(AbilityDetailPokemonInnerPokemon language) {
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

