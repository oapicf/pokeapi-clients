package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.AbilityChange;
import com.prokarma.pkmst.model.AbilityDetailPokemonInner;
import com.prokarma.pkmst.model.AbilityEffectText;
import com.prokarma.pkmst.model.AbilityFlavorText;
import com.prokarma.pkmst.model.AbilityName;
import com.prokarma.pkmst.model.GenerationSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * AbilityDetail
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-02-07T04:17:07.396624034Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AbilityDetail   {
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

  public AbilityDetail id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @ApiModelProperty(required = true, readOnly = true, value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public AbilityDetail name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AbilityDetail isMainSeries(Boolean isMainSeries) {
    this.isMainSeries = isMainSeries;
    return this;
  }

  /**
   * Get isMainSeries
   * @return isMainSeries
   */
  @ApiModelProperty(value = "")
  public Boolean getIsMainSeries() {
    return isMainSeries;
  }

  public void setIsMainSeries(Boolean isMainSeries) {
    this.isMainSeries = isMainSeries;
  }

  public AbilityDetail generation(GenerationSummary generation) {
    this.generation = generation;
    return this;
  }

  /**
   * Get generation
   * @return generation
   */
  @ApiModelProperty(required = true, value = "")
  public GenerationSummary getGeneration() {
    return generation;
  }

  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

  public AbilityDetail names(List<AbilityName> names) {
    this.names = names;
    return this;
  }

  public AbilityDetail addNamesItem(AbilityName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }

  /**
   * Get names
   * @return names
   */
  @ApiModelProperty(required = true, value = "")
  public List<AbilityName> getNames() {
    return names;
  }

  public void setNames(List<AbilityName> names) {
    this.names = names;
  }

  public AbilityDetail effectEntries(List<AbilityEffectText> effectEntries) {
    this.effectEntries = effectEntries;
    return this;
  }

  public AbilityDetail addEffectEntriesItem(AbilityEffectText effectEntriesItem) {
    if (this.effectEntries == null) {
      this.effectEntries = new ArrayList<>();
    }
    this.effectEntries.add(effectEntriesItem);
    return this;
  }

  /**
   * Get effectEntries
   * @return effectEntries
   */
  @ApiModelProperty(required = true, value = "")
  public List<AbilityEffectText> getEffectEntries() {
    return effectEntries;
  }

  public void setEffectEntries(List<AbilityEffectText> effectEntries) {
    this.effectEntries = effectEntries;
  }

  public AbilityDetail effectChanges(List<AbilityChange> effectChanges) {
    this.effectChanges = effectChanges;
    return this;
  }

  public AbilityDetail addEffectChangesItem(AbilityChange effectChangesItem) {
    if (this.effectChanges == null) {
      this.effectChanges = new ArrayList<>();
    }
    this.effectChanges.add(effectChangesItem);
    return this;
  }

  /**
   * Get effectChanges
   * @return effectChanges
   */
  @ApiModelProperty(required = true, value = "")
  public List<AbilityChange> getEffectChanges() {
    return effectChanges;
  }

  public void setEffectChanges(List<AbilityChange> effectChanges) {
    this.effectChanges = effectChanges;
  }

  public AbilityDetail flavorTextEntries(List<AbilityFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
    return this;
  }

  public AbilityDetail addFlavorTextEntriesItem(AbilityFlavorText flavorTextEntriesItem) {
    if (this.flavorTextEntries == null) {
      this.flavorTextEntries = new ArrayList<>();
    }
    this.flavorTextEntries.add(flavorTextEntriesItem);
    return this;
  }

  /**
   * Get flavorTextEntries
   * @return flavorTextEntries
   */
  @ApiModelProperty(required = true, value = "")
  public List<AbilityFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }

  public void setFlavorTextEntries(List<AbilityFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
  }

  public AbilityDetail pokemon(List<AbilityDetailPokemonInner> pokemon) {
    this.pokemon = pokemon;
    return this;
  }

  public AbilityDetail addPokemonItem(AbilityDetailPokemonInner pokemonItem) {
    if (this.pokemon == null) {
      this.pokemon = new ArrayList<>();
    }
    this.pokemon.add(pokemonItem);
    return this;
  }

  /**
   * Get pokemon
   * @return pokemon
   */
  @ApiModelProperty(required = true, value = "")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

