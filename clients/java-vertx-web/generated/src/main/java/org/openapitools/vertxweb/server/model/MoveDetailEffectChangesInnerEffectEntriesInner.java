package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.AbilityDetailPokemonInnerPokemon;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MoveDetailEffectChangesInnerEffectEntriesInner   {
  
  private String effect;
  private AbilityDetailPokemonInnerPokemon language;

  public MoveDetailEffectChangesInnerEffectEntriesInner () {

  }

  public MoveDetailEffectChangesInnerEffectEntriesInner (String effect, AbilityDetailPokemonInnerPokemon language) {
    this.effect = effect;
    this.language = language;
  }

    
  @JsonProperty("effect")
  public String getEffect() {
    return effect;
  }
  public void setEffect(String effect) {
    this.effect = effect;
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
    MoveDetailEffectChangesInnerEffectEntriesInner moveDetailEffectChangesInnerEffectEntriesInner = (MoveDetailEffectChangesInnerEffectEntriesInner) o;
    return Objects.equals(effect, moveDetailEffectChangesInnerEffectEntriesInner.effect) &&
        Objects.equals(language, moveDetailEffectChangesInnerEffectEntriesInner.language);
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
