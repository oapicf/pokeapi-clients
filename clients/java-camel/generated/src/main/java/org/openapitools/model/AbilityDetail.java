package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityChange;
import org.openapitools.model.AbilityDetailPokemonInner;
import org.openapitools.model.AbilityEffectText;
import org.openapitools.model.AbilityFlavorText;
import org.openapitools.model.AbilityName;
import org.openapitools.model.GenerationSummary;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AbilityDetail
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-02-07T04:17:25.266083787Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AbilityDetail {

  private Integer id;

  private String name;

  private Boolean isMainSeries;

  private GenerationSummary generation;

  @Valid
  private List<@Valid AbilityName> names = new ArrayList<>();

  @Valid
  private List<@Valid AbilityEffectText> effectEntries = new ArrayList<>();

  @Valid
  private List<@Valid AbilityChange> effectChanges = new ArrayList<>();

  @Valid
  private List<@Valid AbilityFlavorText> flavorTextEntries = new ArrayList<>();

  @Valid
  private List<@Valid AbilityDetailPokemonInner> pokemon = new ArrayList<>();

  public AbilityDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AbilityDetail(Integer id, String name, GenerationSummary generation, List<@Valid AbilityName> names, List<@Valid AbilityEffectText> effectEntries, List<@Valid AbilityChange> effectChanges, List<@Valid AbilityFlavorText> flavorTextEntries, List<@Valid AbilityDetailPokemonInner> pokemon) {
    this.id = id;
    this.name = name;
    this.generation = generation;
    this.names = names;
    this.effectEntries = effectEntries;
    this.effectChanges = effectChanges;
    this.flavorTextEntries = flavorTextEntries;
    this.pokemon = pokemon;
  }

  public AbilityDetail id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
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
  @NotNull @Size(max = 100) 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
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
  
  @Schema(name = "is_main_series", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_main_series")
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
  @NotNull @Valid 
  @Schema(name = "generation", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("generation")
  public GenerationSummary getGeneration() {
    return generation;
  }

  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

  public AbilityDetail names(List<@Valid AbilityName> names) {
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
  @NotNull @Valid 
  @Schema(name = "names", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("names")
  public List<@Valid AbilityName> getNames() {
    return names;
  }

  public void setNames(List<@Valid AbilityName> names) {
    this.names = names;
  }

  public AbilityDetail effectEntries(List<@Valid AbilityEffectText> effectEntries) {
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
  @NotNull @Valid 
  @Schema(name = "effect_entries", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("effect_entries")
  public List<@Valid AbilityEffectText> getEffectEntries() {
    return effectEntries;
  }

  public void setEffectEntries(List<@Valid AbilityEffectText> effectEntries) {
    this.effectEntries = effectEntries;
  }

  public AbilityDetail effectChanges(List<@Valid AbilityChange> effectChanges) {
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
  @NotNull @Valid 
  @Schema(name = "effect_changes", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("effect_changes")
  public List<@Valid AbilityChange> getEffectChanges() {
    return effectChanges;
  }

  public void setEffectChanges(List<@Valid AbilityChange> effectChanges) {
    this.effectChanges = effectChanges;
  }

  public AbilityDetail flavorTextEntries(List<@Valid AbilityFlavorText> flavorTextEntries) {
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
  @NotNull @Valid 
  @Schema(name = "flavor_text_entries", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("flavor_text_entries")
  public List<@Valid AbilityFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }

  public void setFlavorTextEntries(List<@Valid AbilityFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
  }

  public AbilityDetail pokemon(List<@Valid AbilityDetailPokemonInner> pokemon) {
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
  @NotNull @Valid 
  @Schema(name = "pokemon", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pokemon")
  public List<@Valid AbilityDetailPokemonInner> getPokemon() {
    return pokemon;
  }

  public void setPokemon(List<@Valid AbilityDetailPokemonInner> pokemon) {
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

