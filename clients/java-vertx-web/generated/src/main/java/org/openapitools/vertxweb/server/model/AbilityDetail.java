package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.AbilityChange;
import org.openapitools.vertxweb.server.model.AbilityDetailPokemonInner;
import org.openapitools.vertxweb.server.model.AbilityEffectText;
import org.openapitools.vertxweb.server.model.AbilityFlavorText;
import org.openapitools.vertxweb.server.model.AbilityName;
import org.openapitools.vertxweb.server.model.GenerationSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AbilityDetail   {
  
  private Integer id;
  private String name;
  private Boolean isMainSeries;
  private GenerationSummary generation;
  private List<AbilityName> names = new ArrayList<>();
  private List<AbilityEffectText> effectEntries = new ArrayList<>();
  private List<AbilityChange> effectChanges = new ArrayList<>();
  private List<AbilityFlavorText> flavorTextEntries = new ArrayList<>();
  private List<AbilityDetailPokemonInner> pokemon = new ArrayList<>();

  public AbilityDetail () {

  }

  public AbilityDetail (Integer id, String name, Boolean isMainSeries, GenerationSummary generation, List<AbilityName> names, List<AbilityEffectText> effectEntries, List<AbilityChange> effectChanges, List<AbilityFlavorText> flavorTextEntries, List<AbilityDetailPokemonInner> pokemon) {
    this.id = id;
    this.name = name;
    this.isMainSeries = isMainSeries;
    this.generation = generation;
    this.names = names;
    this.effectEntries = effectEntries;
    this.effectChanges = effectChanges;
    this.flavorTextEntries = flavorTextEntries;
    this.pokemon = pokemon;
  }

    
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("is_main_series")
  public Boolean getIsMainSeries() {
    return isMainSeries;
  }
  public void setIsMainSeries(Boolean isMainSeries) {
    this.isMainSeries = isMainSeries;
  }

    
  @JsonProperty("generation")
  public GenerationSummary getGeneration() {
    return generation;
  }
  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

    
  @JsonProperty("names")
  public List<AbilityName> getNames() {
    return names;
  }
  public void setNames(List<AbilityName> names) {
    this.names = names;
  }

    
  @JsonProperty("effect_entries")
  public List<AbilityEffectText> getEffectEntries() {
    return effectEntries;
  }
  public void setEffectEntries(List<AbilityEffectText> effectEntries) {
    this.effectEntries = effectEntries;
  }

    
  @JsonProperty("effect_changes")
  public List<AbilityChange> getEffectChanges() {
    return effectChanges;
  }
  public void setEffectChanges(List<AbilityChange> effectChanges) {
    this.effectChanges = effectChanges;
  }

    
  @JsonProperty("flavor_text_entries")
  public List<AbilityFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }
  public void setFlavorTextEntries(List<AbilityFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
  }

    
  @JsonProperty("pokemon")
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
    return Objects.equals(id, abilityDetail.id) &&
        Objects.equals(name, abilityDetail.name) &&
        Objects.equals(isMainSeries, abilityDetail.isMainSeries) &&
        Objects.equals(generation, abilityDetail.generation) &&
        Objects.equals(names, abilityDetail.names) &&
        Objects.equals(effectEntries, abilityDetail.effectEntries) &&
        Objects.equals(effectChanges, abilityDetail.effectChanges) &&
        Objects.equals(flavorTextEntries, abilityDetail.flavorTextEntries) &&
        Objects.equals(pokemon, abilityDetail.pokemon);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
