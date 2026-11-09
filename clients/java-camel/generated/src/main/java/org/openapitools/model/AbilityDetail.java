package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityChange;
import org.openapitools.model.AbilityEffectText;
import org.openapitools.model.AbilityFlavorText;
import org.openapitools.model.AbilityName;
import org.openapitools.model.AbilityPokemonDetail;
import org.openapitools.model.GenerationSummary;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AbilityDetail
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-11-09T13:49:41.168612095Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class AbilityDetail {

  private Integer id;

  private String name;

  private Boolean isMainSeries;

  private GenerationSummary generation;

  private List<@Valid AbilityName> names = new ArrayList<>();

  private List<@Valid AbilityEffectText> effectEntries = new ArrayList<>();

  private List<@Valid AbilityChange> effectChanges = new ArrayList<>();

  private List<@Valid AbilityFlavorText> flavorTextEntries = new ArrayList<>();

  private List<@Valid AbilityPokemonDetail> pokemon = new ArrayList<>();

  public AbilityDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AbilityDetail(Integer id, String name, GenerationSummary generation, List<@Valid AbilityName> names, List<@Valid AbilityEffectText> effectEntries, List<@Valid AbilityChange> effectChanges, List<@Valid AbilityFlavorText> flavorTextEntries, List<@Valid AbilityPokemonDetail> pokemon) {
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
   * The identifier for this resource.
   * @return id
   */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The identifier for this resource.", requiredMode = Schema.RequiredMode.REQUIRED)
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
   * The name for this resource.
   * @return name
   */
  @NotNull @Size(max = 200) 
  @Schema(name = "name", description = "The name for this resource.", requiredMode = Schema.RequiredMode.REQUIRED)
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
   * Whether or not this ability originated in the main series of the video games.
   * @return isMainSeries
   */
  
  @Schema(name = "is_main_series", description = "Whether or not this ability originated in the main series of the video games.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
   * The generation this ability originated in.
   * @return generation
   */
  @NotNull @Valid 
  @Schema(name = "generation", description = "The generation this ability originated in.", requiredMode = Schema.RequiredMode.REQUIRED)
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
   * The name of this resource listed in different languages.
   * @return names
   */
  
  @Schema(name = "names", accessMode = Schema.AccessMode.READ_ONLY, description = "The name of this resource listed in different languages.", requiredMode = Schema.RequiredMode.REQUIRED)
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
   * The effect of this ability listed in different languages.
   * @return effectEntries
   */
  
  @Schema(name = "effect_entries", accessMode = Schema.AccessMode.READ_ONLY, description = "The effect of this ability listed in different languages.", requiredMode = Schema.RequiredMode.REQUIRED)
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
   * The list of previous effects this ability has had across version groups.
   * @return effectChanges
   */
  
  @Schema(name = "effect_changes", accessMode = Schema.AccessMode.READ_ONLY, description = "The list of previous effects this ability has had across version groups.", requiredMode = Schema.RequiredMode.REQUIRED)
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
   * The flavor text of this ability listed in different languages.
   * @return flavorTextEntries
   */
  
  @Schema(name = "flavor_text_entries", accessMode = Schema.AccessMode.READ_ONLY, description = "The flavor text of this ability listed in different languages.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("flavor_text_entries")
  public List<@Valid AbilityFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }

  public void setFlavorTextEntries(List<@Valid AbilityFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
  }

  public AbilityDetail pokemon(List<@Valid AbilityPokemonDetail> pokemon) {
    this.pokemon = pokemon;
    return this;
  }

  public AbilityDetail addPokemonItem(AbilityPokemonDetail pokemonItem) {
    if (this.pokemon == null) {
      this.pokemon = new ArrayList<>();
    }
    this.pokemon.add(pokemonItem);
    return this;
  }

  /**
   * A list of Pokémon that could potentially have this ability.
   * @return pokemon
   */
  
  @Schema(name = "pokemon", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of Pokémon that could potentially have this ability.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pokemon")
  public List<@Valid AbilityPokemonDetail> getPokemon() {
    return pokemon;
  }

  public void setPokemon(List<@Valid AbilityPokemonDetail> pokemon) {
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

