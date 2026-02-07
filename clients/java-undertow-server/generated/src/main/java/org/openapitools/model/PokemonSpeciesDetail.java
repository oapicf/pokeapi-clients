/*
 * PokéAPI
 *
 * All the Pokémon data you'll ever need in one place, easily accessible through a modern free open-source RESTful API.  ## What is this?  This is a full RESTful API linked to an extensive database detailing everything about the Pokémon main game series.  We've covered everything from Pokémon to Berry Flavors.  ## Where do I start?  We have awesome [documentation](https://pokeapi.co/docs/v2) on how to use this API. It takes minutes to get started.  This API will always be publicly available and will never require any extensive setup process to consume.  Created by [**Paul Hallett**(]https://github.com/phalt) and other [**PokéAPI contributors***](https://github.com/PokeAPI/pokeapi#contributing) around the world. Pokémon and Pokémon character names are trademarks of Nintendo.     
 *
 * OpenAPI document version: 2.7.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.EvolutionChainSummary;
import org.openapitools.model.GenerationSummary;
import org.openapitools.model.GrowthRateSummary;
import org.openapitools.model.PokemonColorSummary;
import org.openapitools.model.PokemonDexEntry;
import org.openapitools.model.PokemonFormDetailFormNamesInner;
import org.openapitools.model.PokemonHabitatSummary;
import org.openapitools.model.PokemonShapeSummary;
import org.openapitools.model.PokemonSpeciesDescription;
import org.openapitools.model.PokemonSpeciesDetailGeneraInner;
import org.openapitools.model.PokemonSpeciesDetailPalParkEncountersInner;
import org.openapitools.model.PokemonSpeciesDetailVarietiesInner;
import org.openapitools.model.PokemonSpeciesFlavorText;
import org.openapitools.model.PokemonSpeciesSummary;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-02-07T04:17:17.108399996Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokemonSpeciesDetail   {
  
  private Integer id;
  private String name;
  private Integer order;
  private Integer genderRate;
  private Integer captureRate;
  private Integer baseHappiness;
  private Boolean isBaby;
  private Boolean isLegendary;
  private Boolean isMythical;
  private Integer hatchCounter;
  private Boolean hasGenderDifferences;
  private Boolean formsSwitchable;
  private GrowthRateSummary growthRate;
  private List<PokemonDexEntry> pokedexNumbers = new ArrayList<>();
  private List<AbilityDetailPokemonInnerPokemon> eggGroups = new ArrayList<>();
  private PokemonColorSummary color;
  private PokemonShapeSummary shape;
  private PokemonSpeciesSummary evolvesFromSpecies;
  private EvolutionChainSummary evolutionChain;
  private PokemonHabitatSummary habitat;
  private GenerationSummary generation;
  private List<PokemonFormDetailFormNamesInner> names = new ArrayList<>();
  private List<PokemonSpeciesDetailPalParkEncountersInner> palParkEncounters = new ArrayList<>();
  private List<PokemonSpeciesDescription> formDescriptions = new ArrayList<>();
  private List<PokemonSpeciesFlavorText> flavorTextEntries = new ArrayList<>();
  private List<PokemonSpeciesDetailGeneraInner> genera = new ArrayList<>();
  private List<PokemonSpeciesDetailVarietiesInner> varieties = new ArrayList<>();

  /**
   */
  public PokemonSpeciesDetail id(Integer id) {
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
   */
  public PokemonSpeciesDetail name(String name) {
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
   */
  public PokemonSpeciesDetail order(Integer order) {
    this.order = order;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("order")
  public Integer getOrder() {
    return order;
  }
  public void setOrder(Integer order) {
    this.order = order;
  }

  /**
   */
  public PokemonSpeciesDetail genderRate(Integer genderRate) {
    this.genderRate = genderRate;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("gender_rate")
  public Integer getGenderRate() {
    return genderRate;
  }
  public void setGenderRate(Integer genderRate) {
    this.genderRate = genderRate;
  }

  /**
   */
  public PokemonSpeciesDetail captureRate(Integer captureRate) {
    this.captureRate = captureRate;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("capture_rate")
  public Integer getCaptureRate() {
    return captureRate;
  }
  public void setCaptureRate(Integer captureRate) {
    this.captureRate = captureRate;
  }

  /**
   */
  public PokemonSpeciesDetail baseHappiness(Integer baseHappiness) {
    this.baseHappiness = baseHappiness;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("base_happiness")
  public Integer getBaseHappiness() {
    return baseHappiness;
  }
  public void setBaseHappiness(Integer baseHappiness) {
    this.baseHappiness = baseHappiness;
  }

  /**
   */
  public PokemonSpeciesDetail isBaby(Boolean isBaby) {
    this.isBaby = isBaby;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("is_baby")
  public Boolean getIsBaby() {
    return isBaby;
  }
  public void setIsBaby(Boolean isBaby) {
    this.isBaby = isBaby;
  }

  /**
   */
  public PokemonSpeciesDetail isLegendary(Boolean isLegendary) {
    this.isLegendary = isLegendary;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("is_legendary")
  public Boolean getIsLegendary() {
    return isLegendary;
  }
  public void setIsLegendary(Boolean isLegendary) {
    this.isLegendary = isLegendary;
  }

  /**
   */
  public PokemonSpeciesDetail isMythical(Boolean isMythical) {
    this.isMythical = isMythical;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("is_mythical")
  public Boolean getIsMythical() {
    return isMythical;
  }
  public void setIsMythical(Boolean isMythical) {
    this.isMythical = isMythical;
  }

  /**
   */
  public PokemonSpeciesDetail hatchCounter(Integer hatchCounter) {
    this.hatchCounter = hatchCounter;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("hatch_counter")
  public Integer getHatchCounter() {
    return hatchCounter;
  }
  public void setHatchCounter(Integer hatchCounter) {
    this.hatchCounter = hatchCounter;
  }

  /**
   */
  public PokemonSpeciesDetail hasGenderDifferences(Boolean hasGenderDifferences) {
    this.hasGenderDifferences = hasGenderDifferences;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("has_gender_differences")
  public Boolean getHasGenderDifferences() {
    return hasGenderDifferences;
  }
  public void setHasGenderDifferences(Boolean hasGenderDifferences) {
    this.hasGenderDifferences = hasGenderDifferences;
  }

  /**
   */
  public PokemonSpeciesDetail formsSwitchable(Boolean formsSwitchable) {
    this.formsSwitchable = formsSwitchable;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("forms_switchable")
  public Boolean getFormsSwitchable() {
    return formsSwitchable;
  }
  public void setFormsSwitchable(Boolean formsSwitchable) {
    this.formsSwitchable = formsSwitchable;
  }

  /**
   */
  public PokemonSpeciesDetail growthRate(GrowthRateSummary growthRate) {
    this.growthRate = growthRate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("growth_rate")
  public GrowthRateSummary getGrowthRate() {
    return growthRate;
  }
  public void setGrowthRate(GrowthRateSummary growthRate) {
    this.growthRate = growthRate;
  }

  /**
   */
  public PokemonSpeciesDetail pokedexNumbers(List<PokemonDexEntry> pokedexNumbers) {
    this.pokedexNumbers = pokedexNumbers;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("pokedex_numbers")
  public List<PokemonDexEntry> getPokedexNumbers() {
    return pokedexNumbers;
  }
  public void setPokedexNumbers(List<PokemonDexEntry> pokedexNumbers) {
    this.pokedexNumbers = pokedexNumbers;
  }

  /**
   */
  public PokemonSpeciesDetail eggGroups(List<AbilityDetailPokemonInnerPokemon> eggGroups) {
    this.eggGroups = eggGroups;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("egg_groups")
  public List<AbilityDetailPokemonInnerPokemon> getEggGroups() {
    return eggGroups;
  }
  public void setEggGroups(List<AbilityDetailPokemonInnerPokemon> eggGroups) {
    this.eggGroups = eggGroups;
  }

  /**
   */
  public PokemonSpeciesDetail color(PokemonColorSummary color) {
    this.color = color;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("color")
  public PokemonColorSummary getColor() {
    return color;
  }
  public void setColor(PokemonColorSummary color) {
    this.color = color;
  }

  /**
   */
  public PokemonSpeciesDetail shape(PokemonShapeSummary shape) {
    this.shape = shape;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("shape")
  public PokemonShapeSummary getShape() {
    return shape;
  }
  public void setShape(PokemonShapeSummary shape) {
    this.shape = shape;
  }

  /**
   */
  public PokemonSpeciesDetail evolvesFromSpecies(PokemonSpeciesSummary evolvesFromSpecies) {
    this.evolvesFromSpecies = evolvesFromSpecies;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("evolves_from_species")
  public PokemonSpeciesSummary getEvolvesFromSpecies() {
    return evolvesFromSpecies;
  }
  public void setEvolvesFromSpecies(PokemonSpeciesSummary evolvesFromSpecies) {
    this.evolvesFromSpecies = evolvesFromSpecies;
  }

  /**
   */
  public PokemonSpeciesDetail evolutionChain(EvolutionChainSummary evolutionChain) {
    this.evolutionChain = evolutionChain;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("evolution_chain")
  public EvolutionChainSummary getEvolutionChain() {
    return evolutionChain;
  }
  public void setEvolutionChain(EvolutionChainSummary evolutionChain) {
    this.evolutionChain = evolutionChain;
  }

  /**
   */
  public PokemonSpeciesDetail habitat(PokemonHabitatSummary habitat) {
    this.habitat = habitat;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("habitat")
  public PokemonHabitatSummary getHabitat() {
    return habitat;
  }
  public void setHabitat(PokemonHabitatSummary habitat) {
    this.habitat = habitat;
  }

  /**
   */
  public PokemonSpeciesDetail generation(GenerationSummary generation) {
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
   */
  public PokemonSpeciesDetail names(List<PokemonFormDetailFormNamesInner> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("names")
  public List<PokemonFormDetailFormNamesInner> getNames() {
    return names;
  }
  public void setNames(List<PokemonFormDetailFormNamesInner> names) {
    this.names = names;
  }

  /**
   */
  public PokemonSpeciesDetail palParkEncounters(List<PokemonSpeciesDetailPalParkEncountersInner> palParkEncounters) {
    this.palParkEncounters = palParkEncounters;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("pal_park_encounters")
  public List<PokemonSpeciesDetailPalParkEncountersInner> getPalParkEncounters() {
    return palParkEncounters;
  }
  public void setPalParkEncounters(List<PokemonSpeciesDetailPalParkEncountersInner> palParkEncounters) {
    this.palParkEncounters = palParkEncounters;
  }

  /**
   */
  public PokemonSpeciesDetail formDescriptions(List<PokemonSpeciesDescription> formDescriptions) {
    this.formDescriptions = formDescriptions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("form_descriptions")
  public List<PokemonSpeciesDescription> getFormDescriptions() {
    return formDescriptions;
  }
  public void setFormDescriptions(List<PokemonSpeciesDescription> formDescriptions) {
    this.formDescriptions = formDescriptions;
  }

  /**
   */
  public PokemonSpeciesDetail flavorTextEntries(List<PokemonSpeciesFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("flavor_text_entries")
  public List<PokemonSpeciesFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }
  public void setFlavorTextEntries(List<PokemonSpeciesFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
  }

  /**
   */
  public PokemonSpeciesDetail genera(List<PokemonSpeciesDetailGeneraInner> genera) {
    this.genera = genera;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("genera")
  public List<PokemonSpeciesDetailGeneraInner> getGenera() {
    return genera;
  }
  public void setGenera(List<PokemonSpeciesDetailGeneraInner> genera) {
    this.genera = genera;
  }

  /**
   */
  public PokemonSpeciesDetail varieties(List<PokemonSpeciesDetailVarietiesInner> varieties) {
    this.varieties = varieties;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("varieties")
  public List<PokemonSpeciesDetailVarietiesInner> getVarieties() {
    return varieties;
  }
  public void setVarieties(List<PokemonSpeciesDetailVarietiesInner> varieties) {
    this.varieties = varieties;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonSpeciesDetail pokemonSpeciesDetail = (PokemonSpeciesDetail) o;
    return Objects.equals(id, pokemonSpeciesDetail.id) &&
        Objects.equals(name, pokemonSpeciesDetail.name) &&
        Objects.equals(order, pokemonSpeciesDetail.order) &&
        Objects.equals(genderRate, pokemonSpeciesDetail.genderRate) &&
        Objects.equals(captureRate, pokemonSpeciesDetail.captureRate) &&
        Objects.equals(baseHappiness, pokemonSpeciesDetail.baseHappiness) &&
        Objects.equals(isBaby, pokemonSpeciesDetail.isBaby) &&
        Objects.equals(isLegendary, pokemonSpeciesDetail.isLegendary) &&
        Objects.equals(isMythical, pokemonSpeciesDetail.isMythical) &&
        Objects.equals(hatchCounter, pokemonSpeciesDetail.hatchCounter) &&
        Objects.equals(hasGenderDifferences, pokemonSpeciesDetail.hasGenderDifferences) &&
        Objects.equals(formsSwitchable, pokemonSpeciesDetail.formsSwitchable) &&
        Objects.equals(growthRate, pokemonSpeciesDetail.growthRate) &&
        Objects.equals(pokedexNumbers, pokemonSpeciesDetail.pokedexNumbers) &&
        Objects.equals(eggGroups, pokemonSpeciesDetail.eggGroups) &&
        Objects.equals(color, pokemonSpeciesDetail.color) &&
        Objects.equals(shape, pokemonSpeciesDetail.shape) &&
        Objects.equals(evolvesFromSpecies, pokemonSpeciesDetail.evolvesFromSpecies) &&
        Objects.equals(evolutionChain, pokemonSpeciesDetail.evolutionChain) &&
        Objects.equals(habitat, pokemonSpeciesDetail.habitat) &&
        Objects.equals(generation, pokemonSpeciesDetail.generation) &&
        Objects.equals(names, pokemonSpeciesDetail.names) &&
        Objects.equals(palParkEncounters, pokemonSpeciesDetail.palParkEncounters) &&
        Objects.equals(formDescriptions, pokemonSpeciesDetail.formDescriptions) &&
        Objects.equals(flavorTextEntries, pokemonSpeciesDetail.flavorTextEntries) &&
        Objects.equals(genera, pokemonSpeciesDetail.genera) &&
        Objects.equals(varieties, pokemonSpeciesDetail.varieties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, order, genderRate, captureRate, baseHappiness, isBaby, isLegendary, isMythical, hatchCounter, hasGenderDifferences, formsSwitchable, growthRate, pokedexNumbers, eggGroups, color, shape, evolvesFromSpecies, evolutionChain, habitat, generation, names, palParkEncounters, formDescriptions, flavorTextEntries, genera, varieties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonSpeciesDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    genderRate: ").append(toIndentedString(genderRate)).append("\n");
    sb.append("    captureRate: ").append(toIndentedString(captureRate)).append("\n");
    sb.append("    baseHappiness: ").append(toIndentedString(baseHappiness)).append("\n");
    sb.append("    isBaby: ").append(toIndentedString(isBaby)).append("\n");
    sb.append("    isLegendary: ").append(toIndentedString(isLegendary)).append("\n");
    sb.append("    isMythical: ").append(toIndentedString(isMythical)).append("\n");
    sb.append("    hatchCounter: ").append(toIndentedString(hatchCounter)).append("\n");
    sb.append("    hasGenderDifferences: ").append(toIndentedString(hasGenderDifferences)).append("\n");
    sb.append("    formsSwitchable: ").append(toIndentedString(formsSwitchable)).append("\n");
    sb.append("    growthRate: ").append(toIndentedString(growthRate)).append("\n");
    sb.append("    pokedexNumbers: ").append(toIndentedString(pokedexNumbers)).append("\n");
    sb.append("    eggGroups: ").append(toIndentedString(eggGroups)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    shape: ").append(toIndentedString(shape)).append("\n");
    sb.append("    evolvesFromSpecies: ").append(toIndentedString(evolvesFromSpecies)).append("\n");
    sb.append("    evolutionChain: ").append(toIndentedString(evolutionChain)).append("\n");
    sb.append("    habitat: ").append(toIndentedString(habitat)).append("\n");
    sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    palParkEncounters: ").append(toIndentedString(palParkEncounters)).append("\n");
    sb.append("    formDescriptions: ").append(toIndentedString(formDescriptions)).append("\n");
    sb.append("    flavorTextEntries: ").append(toIndentedString(flavorTextEntries)).append("\n");
    sb.append("    genera: ").append(toIndentedString(genera)).append("\n");
    sb.append("    varieties: ").append(toIndentedString(varieties)).append("\n");
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

