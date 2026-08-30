package org.openapitools.model;

import org.openapitools.model.AbilityChange;
import org.openapitools.model.AbilityDetailPokemonInner;
import org.openapitools.model.AbilityEffectText;
import org.openapitools.model.AbilityFlavorText;
import org.openapitools.model.AbilityName;
import org.openapitools.model.GenerationSummary;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class AbilityDetail implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("is_main_series")
  private Boolean isMainSeries;

  @JsonProperty("generation")
  private GenerationSummary generation;

  @JsonProperty("names")
  private List<AbilityName> names = new ArrayList<>();

  @JsonProperty("effect_entries")
  private List<AbilityEffectText> effectEntries = new ArrayList<>();

  @JsonProperty("effect_changes")
  private List<AbilityChange> effectChanges = new ArrayList<>();

  @JsonProperty("flavor_text_entries")
  private List<AbilityFlavorText> flavorTextEntries = new ArrayList<>();

  @JsonProperty("pokemon")
  private List<AbilityDetailPokemonInner> pokemon = new ArrayList<>();

  /**
   * 
   * @return id
   */
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * 
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * 
   * @return isMainSeries
   */
  public Boolean getIsMainSeries() {
    return isMainSeries;
  }

  public void setIsMainSeries(Boolean isMainSeries) {
    this.isMainSeries = isMainSeries;
  }

  /**
   * 
   * @return generation
   */
  public GenerationSummary getGeneration() {
    return generation;
  }

  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

  /**
   * 
   * @return names
   */
  public List<AbilityName> getNames() {
    return names;
  }

  public void setNames(List<AbilityName> names) {
    this.names = names;
  }

  /**
   * 
   * @return effectEntries
   */
  public List<AbilityEffectText> getEffectEntries() {
    return effectEntries;
  }

  public void setEffectEntries(List<AbilityEffectText> effectEntries) {
    this.effectEntries = effectEntries;
  }

  /**
   * 
   * @return effectChanges
   */
  public List<AbilityChange> getEffectChanges() {
    return effectChanges;
  }

  public void setEffectChanges(List<AbilityChange> effectChanges) {
    this.effectChanges = effectChanges;
  }

  /**
   * 
   * @return flavorTextEntries
   */
  public List<AbilityFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }

  public void setFlavorTextEntries(List<AbilityFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
  }

  /**
   * 
   * @return pokemon
   */
  public List<AbilityDetailPokemonInner> getPokemon() {
    return pokemon;
  }

  public void setPokemon(List<AbilityDetailPokemonInner> pokemon) {
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
    AbilityDetail abilityDetail = (AbilityDetail) o;
    return Objects.equals(this.id, abilityDetail.id) &&
        Objects.equals(this.name, abilityDetail.name) &&
        Objects.equals(this.isMainSeries, abilityDetail.isMainSeries) &&
        Objects.equals(this.generation, abilityDetail.generation) &&
        Objects.equals(this.names, abilityDetail.names) &&
        Objects.equals(this.effectEntries, abilityDetail.effectEntries) &&
        Objects.equals(this.effectChanges, abilityDetail.effectChanges) &&
        Objects.equals(this.flavorTextEntries, abilityDetail.flavorTextEntries) &&
        Objects.equals(this.pokemon, abilityDetail.pokemon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, isMainSeries, generation, names, effectEntries, effectChanges, flavorTextEntries, pokemon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbilityDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isMainSeries: ").append(toIndentedString(isMainSeries)).append("\n");
    sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    effectEntries: ").append(toIndentedString(effectEntries)).append("\n");
    sb.append("    effectChanges: ").append(toIndentedString(effectChanges)).append("\n");
    sb.append("    flavorTextEntries: ").append(toIndentedString(flavorTextEntries)).append("\n");
    sb.append("    pokemon: ").append(toIndentedString(pokemon)).append("\n");
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
