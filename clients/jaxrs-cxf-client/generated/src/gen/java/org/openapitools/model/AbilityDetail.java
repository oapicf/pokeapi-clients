package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityChange;
import org.openapitools.model.AbilityDetailPokemonInner;
import org.openapitools.model.AbilityEffectText;
import org.openapitools.model.AbilityFlavorText;
import org.openapitools.model.AbilityName;
import org.openapitools.model.GenerationSummary;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AbilityDetail  {
  
  @ApiModelProperty(required = true, value = "")

  private Integer id;

  @ApiModelProperty(required = true, value = "")

  private String name;

  @ApiModelProperty(value = "")

  private Boolean isMainSeries;

  @ApiModelProperty(required = true, value = "")

  private GenerationSummary generation;

  @ApiModelProperty(required = true, value = "")

  private List<AbilityName> names = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<AbilityEffectText> effectEntries = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<AbilityChange> effectChanges = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<AbilityFlavorText> flavorTextEntries = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<AbilityDetailPokemonInner> pokemon = new ArrayList<>();
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }


 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AbilityDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get isMainSeries
   * @return isMainSeries
  **/
  @JsonProperty("is_main_series")
  public Boolean getIsMainSeries() {
    return isMainSeries;
  }

  public void setIsMainSeries(Boolean isMainSeries) {
    this.isMainSeries = isMainSeries;
  }

  public AbilityDetail isMainSeries(Boolean isMainSeries) {
    this.isMainSeries = isMainSeries;
    return this;
  }

 /**
   * Get generation
   * @return generation
  **/
  @JsonProperty("generation")
  public GenerationSummary getGeneration() {
    return generation;
  }

  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

  public AbilityDetail generation(GenerationSummary generation) {
    this.generation = generation;
    return this;
  }

 /**
   * Get names
   * @return names
  **/
  @JsonProperty("names")
  public List<AbilityName> getNames() {
    return names;
  }

  public void setNames(List<AbilityName> names) {
    this.names = names;
  }

  public AbilityDetail names(List<AbilityName> names) {
    this.names = names;
    return this;
  }

  public AbilityDetail addNamesItem(AbilityName namesItem) {
    this.names.add(namesItem);
    return this;
  }

 /**
   * Get effectEntries
   * @return effectEntries
  **/
  @JsonProperty("effect_entries")
  public List<AbilityEffectText> getEffectEntries() {
    return effectEntries;
  }

  public void setEffectEntries(List<AbilityEffectText> effectEntries) {
    this.effectEntries = effectEntries;
  }

  public AbilityDetail effectEntries(List<AbilityEffectText> effectEntries) {
    this.effectEntries = effectEntries;
    return this;
  }

  public AbilityDetail addEffectEntriesItem(AbilityEffectText effectEntriesItem) {
    this.effectEntries.add(effectEntriesItem);
    return this;
  }

 /**
   * Get effectChanges
   * @return effectChanges
  **/
  @JsonProperty("effect_changes")
  public List<AbilityChange> getEffectChanges() {
    return effectChanges;
  }

  public void setEffectChanges(List<AbilityChange> effectChanges) {
    this.effectChanges = effectChanges;
  }

  public AbilityDetail effectChanges(List<AbilityChange> effectChanges) {
    this.effectChanges = effectChanges;
    return this;
  }

  public AbilityDetail addEffectChangesItem(AbilityChange effectChangesItem) {
    this.effectChanges.add(effectChangesItem);
    return this;
  }

 /**
   * Get flavorTextEntries
   * @return flavorTextEntries
  **/
  @JsonProperty("flavor_text_entries")
  public List<AbilityFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }

  public void setFlavorTextEntries(List<AbilityFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
  }

  public AbilityDetail flavorTextEntries(List<AbilityFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
    return this;
  }

  public AbilityDetail addFlavorTextEntriesItem(AbilityFlavorText flavorTextEntriesItem) {
    this.flavorTextEntries.add(flavorTextEntriesItem);
    return this;
  }

 /**
   * Get pokemon
   * @return pokemon
  **/
  @JsonProperty("pokemon")
  public List<AbilityDetailPokemonInner> getPokemon() {
    return pokemon;
  }

  public void setPokemon(List<AbilityDetailPokemonInner> pokemon) {
    this.pokemon = pokemon;
  }

  public AbilityDetail pokemon(List<AbilityDetailPokemonInner> pokemon) {
    this.pokemon = pokemon;
    return this;
  }

  public AbilityDetail addPokemonItem(AbilityDetailPokemonInner pokemonItem) {
    this.pokemon.add(pokemonItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

