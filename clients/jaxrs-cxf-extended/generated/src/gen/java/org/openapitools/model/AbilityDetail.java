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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AbilityDetail  {
  
  @ApiModelProperty(required = true, value = "")
  private Integer id;

  @ApiModelProperty(required = true, value = "")
  private String name;

  @ApiModelProperty(value = "")
  private Boolean isMainSeries;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private GenerationSummary generation;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid AbilityName> names = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid AbilityEffectText> effectEntries = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid AbilityChange> effectChanges = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid AbilityFlavorText> flavorTextEntries = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid AbilityDetailPokemonInner> pokemon = new ArrayList<>();
 /**
  * Get id
  * @return id
  */
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public AbilityDetail id(Integer id) {
    this.id = id;
    return this;
  }

 /**
  * Get name
  * @return name
  */
  @JsonProperty("name")
  @NotNull
 @Size(max=100)  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public AbilityDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Get isMainSeries
  * @return isMainSeries
  */
  @JsonProperty("is_main_series")
  public Boolean getIsMainSeries() {
    return isMainSeries;
  }

  /**
   * Sets the <code>isMainSeries</code> property.
   */
 public void setIsMainSeries(Boolean isMainSeries) {
    this.isMainSeries = isMainSeries;
  }

  /**
   * Sets the <code>isMainSeries</code> property.
   */
  public AbilityDetail isMainSeries(Boolean isMainSeries) {
    this.isMainSeries = isMainSeries;
    return this;
  }

 /**
  * Get generation
  * @return generation
  */
  @JsonProperty("generation")
  @NotNull
  public GenerationSummary getGeneration() {
    return generation;
  }

  /**
   * Sets the <code>generation</code> property.
   */
 public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

  /**
   * Sets the <code>generation</code> property.
   */
  public AbilityDetail generation(GenerationSummary generation) {
    this.generation = generation;
    return this;
  }

 /**
  * Get names
  * @return names
  */
  @JsonProperty("names")
  @NotNull
  public List<@Valid AbilityName> getNames() {
    return names;
  }

  /**
   * Sets the <code>names</code> property.
   */
 public void setNames(List<@Valid AbilityName> names) {
    this.names = names;
  }

  /**
   * Sets the <code>names</code> property.
   */
  public AbilityDetail names(List<@Valid AbilityName> names) {
    this.names = names;
    return this;
  }

  /**
   * Adds a new item to the <code>names</code> list.
   */
  public AbilityDetail addNamesItem(AbilityName namesItem) {
    this.names.add(namesItem);
    return this;
  }

 /**
  * Get effectEntries
  * @return effectEntries
  */
  @JsonProperty("effect_entries")
  @NotNull
  public List<@Valid AbilityEffectText> getEffectEntries() {
    return effectEntries;
  }

  /**
   * Sets the <code>effectEntries</code> property.
   */
 public void setEffectEntries(List<@Valid AbilityEffectText> effectEntries) {
    this.effectEntries = effectEntries;
  }

  /**
   * Sets the <code>effectEntries</code> property.
   */
  public AbilityDetail effectEntries(List<@Valid AbilityEffectText> effectEntries) {
    this.effectEntries = effectEntries;
    return this;
  }

  /**
   * Adds a new item to the <code>effectEntries</code> list.
   */
  public AbilityDetail addEffectEntriesItem(AbilityEffectText effectEntriesItem) {
    this.effectEntries.add(effectEntriesItem);
    return this;
  }

 /**
  * Get effectChanges
  * @return effectChanges
  */
  @JsonProperty("effect_changes")
  @NotNull
  public List<@Valid AbilityChange> getEffectChanges() {
    return effectChanges;
  }

  /**
   * Sets the <code>effectChanges</code> property.
   */
 public void setEffectChanges(List<@Valid AbilityChange> effectChanges) {
    this.effectChanges = effectChanges;
  }

  /**
   * Sets the <code>effectChanges</code> property.
   */
  public AbilityDetail effectChanges(List<@Valid AbilityChange> effectChanges) {
    this.effectChanges = effectChanges;
    return this;
  }

  /**
   * Adds a new item to the <code>effectChanges</code> list.
   */
  public AbilityDetail addEffectChangesItem(AbilityChange effectChangesItem) {
    this.effectChanges.add(effectChangesItem);
    return this;
  }

 /**
  * Get flavorTextEntries
  * @return flavorTextEntries
  */
  @JsonProperty("flavor_text_entries")
  @NotNull
  public List<@Valid AbilityFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }

  /**
   * Sets the <code>flavorTextEntries</code> property.
   */
 public void setFlavorTextEntries(List<@Valid AbilityFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
  }

  /**
   * Sets the <code>flavorTextEntries</code> property.
   */
  public AbilityDetail flavorTextEntries(List<@Valid AbilityFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
    return this;
  }

  /**
   * Adds a new item to the <code>flavorTextEntries</code> list.
   */
  public AbilityDetail addFlavorTextEntriesItem(AbilityFlavorText flavorTextEntriesItem) {
    this.flavorTextEntries.add(flavorTextEntriesItem);
    return this;
  }

 /**
  * Get pokemon
  * @return pokemon
  */
  @JsonProperty("pokemon")
  @NotNull
  public List<@Valid AbilityDetailPokemonInner> getPokemon() {
    return pokemon;
  }

  /**
   * Sets the <code>pokemon</code> property.
   */
 public void setPokemon(List<@Valid AbilityDetailPokemonInner> pokemon) {
    this.pokemon = pokemon;
  }

  /**
   * Sets the <code>pokemon</code> property.
   */
  public AbilityDetail pokemon(List<@Valid AbilityDetailPokemonInner> pokemon) {
    this.pokemon = pokemon;
    return this;
  }

  /**
   * Adds a new item to the <code>pokemon</code> list.
   */
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

