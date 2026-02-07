package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityChange;
import org.openapitools.model.AbilityDetailPokemonInner;
import org.openapitools.model.AbilityEffectText;
import org.openapitools.model.AbilityFlavorText;
import org.openapitools.model.AbilityName;
import org.openapitools.model.GenerationSummary;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-02-07T04:16:44.910526458Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

  /**
   **/
  public AbilityDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  public AbilityDetail name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public AbilityDetail isMainSeries(Boolean isMainSeries) {
    this.isMainSeries = isMainSeries;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("is_main_series")
  public Boolean getIsMainSeries() {
    return isMainSeries;
  }
  public void setIsMainSeries(Boolean isMainSeries) {
    this.isMainSeries = isMainSeries;
  }

  /**
   **/
  public AbilityDetail generation(GenerationSummary generation) {
    this.generation = generation;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("generation")
  public GenerationSummary getGeneration() {
    return generation;
  }
  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

  /**
   **/
  public AbilityDetail names(List<AbilityName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("names")
  public List<AbilityName> getNames() {
    return names;
  }
  public void setNames(List<AbilityName> names) {
    this.names = names;
  }

  /**
   **/
  public AbilityDetail effectEntries(List<AbilityEffectText> effectEntries) {
    this.effectEntries = effectEntries;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("effect_entries")
  public List<AbilityEffectText> getEffectEntries() {
    return effectEntries;
  }
  public void setEffectEntries(List<AbilityEffectText> effectEntries) {
    this.effectEntries = effectEntries;
  }

  /**
   **/
  public AbilityDetail effectChanges(List<AbilityChange> effectChanges) {
    this.effectChanges = effectChanges;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("effect_changes")
  public List<AbilityChange> getEffectChanges() {
    return effectChanges;
  }
  public void setEffectChanges(List<AbilityChange> effectChanges) {
    this.effectChanges = effectChanges;
  }

  /**
   **/
  public AbilityDetail flavorTextEntries(List<AbilityFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("flavor_text_entries")
  public List<AbilityFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }
  public void setFlavorTextEntries(List<AbilityFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
  }

  /**
   **/
  public AbilityDetail pokemon(List<AbilityDetailPokemonInner> pokemon) {
    this.pokemon = pokemon;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
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

