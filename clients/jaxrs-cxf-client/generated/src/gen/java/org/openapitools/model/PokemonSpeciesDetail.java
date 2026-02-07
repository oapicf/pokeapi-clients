package org.openapitools.model;

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

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonSpeciesDetail  {
  
  @ApiModelProperty(required = true, value = "")

  private Integer id;

  @ApiModelProperty(required = true, value = "")

  private String name;

  @ApiModelProperty(value = "")

  private Integer order;

  @ApiModelProperty(value = "")

  private Integer genderRate;

  @ApiModelProperty(value = "")

  private Integer captureRate;

  @ApiModelProperty(value = "")

  private Integer baseHappiness;

  @ApiModelProperty(value = "")

  private Boolean isBaby;

  @ApiModelProperty(value = "")

  private Boolean isLegendary;

  @ApiModelProperty(value = "")

  private Boolean isMythical;

  @ApiModelProperty(value = "")

  private Integer hatchCounter;

  @ApiModelProperty(value = "")

  private Boolean hasGenderDifferences;

  @ApiModelProperty(value = "")

  private Boolean formsSwitchable;

  @ApiModelProperty(required = true, value = "")

  private GrowthRateSummary growthRate;

  @ApiModelProperty(required = true, value = "")

  private List<PokemonDexEntry> pokedexNumbers = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<AbilityDetailPokemonInnerPokemon> eggGroups = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private PokemonColorSummary color;

  @ApiModelProperty(required = true, value = "")

  private PokemonShapeSummary shape;

  @ApiModelProperty(required = true, value = "")

  private PokemonSpeciesSummary evolvesFromSpecies;

  @ApiModelProperty(required = true, value = "")

  private EvolutionChainSummary evolutionChain;

  @ApiModelProperty(required = true, value = "")

  private PokemonHabitatSummary habitat;

  @ApiModelProperty(required = true, value = "")

  private GenerationSummary generation;

  @ApiModelProperty(required = true, value = "")

  private List<PokemonFormDetailFormNamesInner> names = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<PokemonSpeciesDetailPalParkEncountersInner> palParkEncounters = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<PokemonSpeciesDescription> formDescriptions = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<PokemonSpeciesFlavorText> flavorTextEntries = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<PokemonSpeciesDetailGeneraInner> genera = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<PokemonSpeciesDetailVarietiesInner> varieties = new ArrayList<>();
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

  public PokemonSpeciesDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get order
   * @return order
  **/
  @JsonProperty("order")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public PokemonSpeciesDetail order(Integer order) {
    this.order = order;
    return this;
  }

 /**
   * Get genderRate
   * @return genderRate
  **/
  @JsonProperty("gender_rate")
  public Integer getGenderRate() {
    return genderRate;
  }

  public void setGenderRate(Integer genderRate) {
    this.genderRate = genderRate;
  }

  public PokemonSpeciesDetail genderRate(Integer genderRate) {
    this.genderRate = genderRate;
    return this;
  }

 /**
   * Get captureRate
   * @return captureRate
  **/
  @JsonProperty("capture_rate")
  public Integer getCaptureRate() {
    return captureRate;
  }

  public void setCaptureRate(Integer captureRate) {
    this.captureRate = captureRate;
  }

  public PokemonSpeciesDetail captureRate(Integer captureRate) {
    this.captureRate = captureRate;
    return this;
  }

 /**
   * Get baseHappiness
   * @return baseHappiness
  **/
  @JsonProperty("base_happiness")
  public Integer getBaseHappiness() {
    return baseHappiness;
  }

  public void setBaseHappiness(Integer baseHappiness) {
    this.baseHappiness = baseHappiness;
  }

  public PokemonSpeciesDetail baseHappiness(Integer baseHappiness) {
    this.baseHappiness = baseHappiness;
    return this;
  }

 /**
   * Get isBaby
   * @return isBaby
  **/
  @JsonProperty("is_baby")
  public Boolean getIsBaby() {
    return isBaby;
  }

  public void setIsBaby(Boolean isBaby) {
    this.isBaby = isBaby;
  }

  public PokemonSpeciesDetail isBaby(Boolean isBaby) {
    this.isBaby = isBaby;
    return this;
  }

 /**
   * Get isLegendary
   * @return isLegendary
  **/
  @JsonProperty("is_legendary")
  public Boolean getIsLegendary() {
    return isLegendary;
  }

  public void setIsLegendary(Boolean isLegendary) {
    this.isLegendary = isLegendary;
  }

  public PokemonSpeciesDetail isLegendary(Boolean isLegendary) {
    this.isLegendary = isLegendary;
    return this;
  }

 /**
   * Get isMythical
   * @return isMythical
  **/
  @JsonProperty("is_mythical")
  public Boolean getIsMythical() {
    return isMythical;
  }

  public void setIsMythical(Boolean isMythical) {
    this.isMythical = isMythical;
  }

  public PokemonSpeciesDetail isMythical(Boolean isMythical) {
    this.isMythical = isMythical;
    return this;
  }

 /**
   * Get hatchCounter
   * @return hatchCounter
  **/
  @JsonProperty("hatch_counter")
  public Integer getHatchCounter() {
    return hatchCounter;
  }

  public void setHatchCounter(Integer hatchCounter) {
    this.hatchCounter = hatchCounter;
  }

  public PokemonSpeciesDetail hatchCounter(Integer hatchCounter) {
    this.hatchCounter = hatchCounter;
    return this;
  }

 /**
   * Get hasGenderDifferences
   * @return hasGenderDifferences
  **/
  @JsonProperty("has_gender_differences")
  public Boolean getHasGenderDifferences() {
    return hasGenderDifferences;
  }

  public void setHasGenderDifferences(Boolean hasGenderDifferences) {
    this.hasGenderDifferences = hasGenderDifferences;
  }

  public PokemonSpeciesDetail hasGenderDifferences(Boolean hasGenderDifferences) {
    this.hasGenderDifferences = hasGenderDifferences;
    return this;
  }

 /**
   * Get formsSwitchable
   * @return formsSwitchable
  **/
  @JsonProperty("forms_switchable")
  public Boolean getFormsSwitchable() {
    return formsSwitchable;
  }

  public void setFormsSwitchable(Boolean formsSwitchable) {
    this.formsSwitchable = formsSwitchable;
  }

  public PokemonSpeciesDetail formsSwitchable(Boolean formsSwitchable) {
    this.formsSwitchable = formsSwitchable;
    return this;
  }

 /**
   * Get growthRate
   * @return growthRate
  **/
  @JsonProperty("growth_rate")
  public GrowthRateSummary getGrowthRate() {
    return growthRate;
  }

  public void setGrowthRate(GrowthRateSummary growthRate) {
    this.growthRate = growthRate;
  }

  public PokemonSpeciesDetail growthRate(GrowthRateSummary growthRate) {
    this.growthRate = growthRate;
    return this;
  }

 /**
   * Get pokedexNumbers
   * @return pokedexNumbers
  **/
  @JsonProperty("pokedex_numbers")
  public List<PokemonDexEntry> getPokedexNumbers() {
    return pokedexNumbers;
  }

  public void setPokedexNumbers(List<PokemonDexEntry> pokedexNumbers) {
    this.pokedexNumbers = pokedexNumbers;
  }

  public PokemonSpeciesDetail pokedexNumbers(List<PokemonDexEntry> pokedexNumbers) {
    this.pokedexNumbers = pokedexNumbers;
    return this;
  }

  public PokemonSpeciesDetail addPokedexNumbersItem(PokemonDexEntry pokedexNumbersItem) {
    this.pokedexNumbers.add(pokedexNumbersItem);
    return this;
  }

 /**
   * Get eggGroups
   * @return eggGroups
  **/
  @JsonProperty("egg_groups")
  public List<AbilityDetailPokemonInnerPokemon> getEggGroups() {
    return eggGroups;
  }

  public void setEggGroups(List<AbilityDetailPokemonInnerPokemon> eggGroups) {
    this.eggGroups = eggGroups;
  }

  public PokemonSpeciesDetail eggGroups(List<AbilityDetailPokemonInnerPokemon> eggGroups) {
    this.eggGroups = eggGroups;
    return this;
  }

  public PokemonSpeciesDetail addEggGroupsItem(AbilityDetailPokemonInnerPokemon eggGroupsItem) {
    this.eggGroups.add(eggGroupsItem);
    return this;
  }

 /**
   * Get color
   * @return color
  **/
  @JsonProperty("color")
  public PokemonColorSummary getColor() {
    return color;
  }

  public void setColor(PokemonColorSummary color) {
    this.color = color;
  }

  public PokemonSpeciesDetail color(PokemonColorSummary color) {
    this.color = color;
    return this;
  }

 /**
   * Get shape
   * @return shape
  **/
  @JsonProperty("shape")
  public PokemonShapeSummary getShape() {
    return shape;
  }

  public void setShape(PokemonShapeSummary shape) {
    this.shape = shape;
  }

  public PokemonSpeciesDetail shape(PokemonShapeSummary shape) {
    this.shape = shape;
    return this;
  }

 /**
   * Get evolvesFromSpecies
   * @return evolvesFromSpecies
  **/
  @JsonProperty("evolves_from_species")
  public PokemonSpeciesSummary getEvolvesFromSpecies() {
    return evolvesFromSpecies;
  }

  public void setEvolvesFromSpecies(PokemonSpeciesSummary evolvesFromSpecies) {
    this.evolvesFromSpecies = evolvesFromSpecies;
  }

  public PokemonSpeciesDetail evolvesFromSpecies(PokemonSpeciesSummary evolvesFromSpecies) {
    this.evolvesFromSpecies = evolvesFromSpecies;
    return this;
  }

 /**
   * Get evolutionChain
   * @return evolutionChain
  **/
  @JsonProperty("evolution_chain")
  public EvolutionChainSummary getEvolutionChain() {
    return evolutionChain;
  }

  public void setEvolutionChain(EvolutionChainSummary evolutionChain) {
    this.evolutionChain = evolutionChain;
  }

  public PokemonSpeciesDetail evolutionChain(EvolutionChainSummary evolutionChain) {
    this.evolutionChain = evolutionChain;
    return this;
  }

 /**
   * Get habitat
   * @return habitat
  **/
  @JsonProperty("habitat")
  public PokemonHabitatSummary getHabitat() {
    return habitat;
  }

  public void setHabitat(PokemonHabitatSummary habitat) {
    this.habitat = habitat;
  }

  public PokemonSpeciesDetail habitat(PokemonHabitatSummary habitat) {
    this.habitat = habitat;
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

  public PokemonSpeciesDetail generation(GenerationSummary generation) {
    this.generation = generation;
    return this;
  }

 /**
   * Get names
   * @return names
  **/
  @JsonProperty("names")
  public List<PokemonFormDetailFormNamesInner> getNames() {
    return names;
  }

  public void setNames(List<PokemonFormDetailFormNamesInner> names) {
    this.names = names;
  }

  public PokemonSpeciesDetail names(List<PokemonFormDetailFormNamesInner> names) {
    this.names = names;
    return this;
  }

  public PokemonSpeciesDetail addNamesItem(PokemonFormDetailFormNamesInner namesItem) {
    this.names.add(namesItem);
    return this;
  }

 /**
   * Get palParkEncounters
   * @return palParkEncounters
  **/
  @JsonProperty("pal_park_encounters")
  public List<PokemonSpeciesDetailPalParkEncountersInner> getPalParkEncounters() {
    return palParkEncounters;
  }

  public void setPalParkEncounters(List<PokemonSpeciesDetailPalParkEncountersInner> palParkEncounters) {
    this.palParkEncounters = palParkEncounters;
  }

  public PokemonSpeciesDetail palParkEncounters(List<PokemonSpeciesDetailPalParkEncountersInner> palParkEncounters) {
    this.palParkEncounters = palParkEncounters;
    return this;
  }

  public PokemonSpeciesDetail addPalParkEncountersItem(PokemonSpeciesDetailPalParkEncountersInner palParkEncountersItem) {
    this.palParkEncounters.add(palParkEncountersItem);
    return this;
  }

 /**
   * Get formDescriptions
   * @return formDescriptions
  **/
  @JsonProperty("form_descriptions")
  public List<PokemonSpeciesDescription> getFormDescriptions() {
    return formDescriptions;
  }

  public void setFormDescriptions(List<PokemonSpeciesDescription> formDescriptions) {
    this.formDescriptions = formDescriptions;
  }

  public PokemonSpeciesDetail formDescriptions(List<PokemonSpeciesDescription> formDescriptions) {
    this.formDescriptions = formDescriptions;
    return this;
  }

  public PokemonSpeciesDetail addFormDescriptionsItem(PokemonSpeciesDescription formDescriptionsItem) {
    this.formDescriptions.add(formDescriptionsItem);
    return this;
  }

 /**
   * Get flavorTextEntries
   * @return flavorTextEntries
  **/
  @JsonProperty("flavor_text_entries")
  public List<PokemonSpeciesFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }

  public void setFlavorTextEntries(List<PokemonSpeciesFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
  }

  public PokemonSpeciesDetail flavorTextEntries(List<PokemonSpeciesFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
    return this;
  }

  public PokemonSpeciesDetail addFlavorTextEntriesItem(PokemonSpeciesFlavorText flavorTextEntriesItem) {
    this.flavorTextEntries.add(flavorTextEntriesItem);
    return this;
  }

 /**
   * Get genera
   * @return genera
  **/
  @JsonProperty("genera")
  public List<PokemonSpeciesDetailGeneraInner> getGenera() {
    return genera;
  }

  public void setGenera(List<PokemonSpeciesDetailGeneraInner> genera) {
    this.genera = genera;
  }

  public PokemonSpeciesDetail genera(List<PokemonSpeciesDetailGeneraInner> genera) {
    this.genera = genera;
    return this;
  }

  public PokemonSpeciesDetail addGeneraItem(PokemonSpeciesDetailGeneraInner generaItem) {
    this.genera.add(generaItem);
    return this;
  }

 /**
   * Get varieties
   * @return varieties
  **/
  @JsonProperty("varieties")
  public List<PokemonSpeciesDetailVarietiesInner> getVarieties() {
    return varieties;
  }

  public void setVarieties(List<PokemonSpeciesDetailVarietiesInner> varieties) {
    this.varieties = varieties;
  }

  public PokemonSpeciesDetail varieties(List<PokemonSpeciesDetailVarietiesInner> varieties) {
    this.varieties = varieties;
    return this;
  }

  public PokemonSpeciesDetail addVarietiesItem(PokemonSpeciesDetailVarietiesInner varietiesItem) {
    this.varieties.add(varietiesItem);
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
    PokemonSpeciesDetail pokemonSpeciesDetail = (PokemonSpeciesDetail) o;
    return Objects.equals(this.id, pokemonSpeciesDetail.id) &&
        Objects.equals(this.name, pokemonSpeciesDetail.name) &&
        Objects.equals(this.order, pokemonSpeciesDetail.order) &&
        Objects.equals(this.genderRate, pokemonSpeciesDetail.genderRate) &&
        Objects.equals(this.captureRate, pokemonSpeciesDetail.captureRate) &&
        Objects.equals(this.baseHappiness, pokemonSpeciesDetail.baseHappiness) &&
        Objects.equals(this.isBaby, pokemonSpeciesDetail.isBaby) &&
        Objects.equals(this.isLegendary, pokemonSpeciesDetail.isLegendary) &&
        Objects.equals(this.isMythical, pokemonSpeciesDetail.isMythical) &&
        Objects.equals(this.hatchCounter, pokemonSpeciesDetail.hatchCounter) &&
        Objects.equals(this.hasGenderDifferences, pokemonSpeciesDetail.hasGenderDifferences) &&
        Objects.equals(this.formsSwitchable, pokemonSpeciesDetail.formsSwitchable) &&
        Objects.equals(this.growthRate, pokemonSpeciesDetail.growthRate) &&
        Objects.equals(this.pokedexNumbers, pokemonSpeciesDetail.pokedexNumbers) &&
        Objects.equals(this.eggGroups, pokemonSpeciesDetail.eggGroups) &&
        Objects.equals(this.color, pokemonSpeciesDetail.color) &&
        Objects.equals(this.shape, pokemonSpeciesDetail.shape) &&
        Objects.equals(this.evolvesFromSpecies, pokemonSpeciesDetail.evolvesFromSpecies) &&
        Objects.equals(this.evolutionChain, pokemonSpeciesDetail.evolutionChain) &&
        Objects.equals(this.habitat, pokemonSpeciesDetail.habitat) &&
        Objects.equals(this.generation, pokemonSpeciesDetail.generation) &&
        Objects.equals(this.names, pokemonSpeciesDetail.names) &&
        Objects.equals(this.palParkEncounters, pokemonSpeciesDetail.palParkEncounters) &&
        Objects.equals(this.formDescriptions, pokemonSpeciesDetail.formDescriptions) &&
        Objects.equals(this.flavorTextEntries, pokemonSpeciesDetail.flavorTextEntries) &&
        Objects.equals(this.genera, pokemonSpeciesDetail.genera) &&
        Objects.equals(this.varieties, pokemonSpeciesDetail.varieties);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

