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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
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
  @Valid
  private GrowthRateSummary growthRate;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid PokemonDexEntry> pokedexNumbers = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid AbilityDetailPokemonInnerPokemon> eggGroups = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private PokemonColorSummary color;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private PokemonShapeSummary shape;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private PokemonSpeciesSummary evolvesFromSpecies;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private EvolutionChainSummary evolutionChain;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private PokemonHabitatSummary habitat;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private GenerationSummary generation;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid PokemonFormDetailFormNamesInner> names = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid PokemonSpeciesDetailPalParkEncountersInner> palParkEncounters = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid PokemonSpeciesDescription> formDescriptions = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid PokemonSpeciesFlavorText> flavorTextEntries = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid PokemonSpeciesDetailGeneraInner> genera = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid PokemonSpeciesDetailVarietiesInner> varieties = new ArrayList<>();
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
  public PokemonSpeciesDetail id(Integer id) {
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
  public PokemonSpeciesDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Get order
  * @return order
  */
  @JsonProperty("order")
  public Integer getOrder() {
    return order;
  }

  /**
   * Sets the <code>order</code> property.
   */
 public void setOrder(Integer order) {
    this.order = order;
  }

  /**
   * Sets the <code>order</code> property.
   */
  public PokemonSpeciesDetail order(Integer order) {
    this.order = order;
    return this;
  }

 /**
  * Get genderRate
  * @return genderRate
  */
  @JsonProperty("gender_rate")
  public Integer getGenderRate() {
    return genderRate;
  }

  /**
   * Sets the <code>genderRate</code> property.
   */
 public void setGenderRate(Integer genderRate) {
    this.genderRate = genderRate;
  }

  /**
   * Sets the <code>genderRate</code> property.
   */
  public PokemonSpeciesDetail genderRate(Integer genderRate) {
    this.genderRate = genderRate;
    return this;
  }

 /**
  * Get captureRate
  * @return captureRate
  */
  @JsonProperty("capture_rate")
  public Integer getCaptureRate() {
    return captureRate;
  }

  /**
   * Sets the <code>captureRate</code> property.
   */
 public void setCaptureRate(Integer captureRate) {
    this.captureRate = captureRate;
  }

  /**
   * Sets the <code>captureRate</code> property.
   */
  public PokemonSpeciesDetail captureRate(Integer captureRate) {
    this.captureRate = captureRate;
    return this;
  }

 /**
  * Get baseHappiness
  * @return baseHappiness
  */
  @JsonProperty("base_happiness")
  public Integer getBaseHappiness() {
    return baseHappiness;
  }

  /**
   * Sets the <code>baseHappiness</code> property.
   */
 public void setBaseHappiness(Integer baseHappiness) {
    this.baseHappiness = baseHappiness;
  }

  /**
   * Sets the <code>baseHappiness</code> property.
   */
  public PokemonSpeciesDetail baseHappiness(Integer baseHappiness) {
    this.baseHappiness = baseHappiness;
    return this;
  }

 /**
  * Get isBaby
  * @return isBaby
  */
  @JsonProperty("is_baby")
  public Boolean getIsBaby() {
    return isBaby;
  }

  /**
   * Sets the <code>isBaby</code> property.
   */
 public void setIsBaby(Boolean isBaby) {
    this.isBaby = isBaby;
  }

  /**
   * Sets the <code>isBaby</code> property.
   */
  public PokemonSpeciesDetail isBaby(Boolean isBaby) {
    this.isBaby = isBaby;
    return this;
  }

 /**
  * Get isLegendary
  * @return isLegendary
  */
  @JsonProperty("is_legendary")
  public Boolean getIsLegendary() {
    return isLegendary;
  }

  /**
   * Sets the <code>isLegendary</code> property.
   */
 public void setIsLegendary(Boolean isLegendary) {
    this.isLegendary = isLegendary;
  }

  /**
   * Sets the <code>isLegendary</code> property.
   */
  public PokemonSpeciesDetail isLegendary(Boolean isLegendary) {
    this.isLegendary = isLegendary;
    return this;
  }

 /**
  * Get isMythical
  * @return isMythical
  */
  @JsonProperty("is_mythical")
  public Boolean getIsMythical() {
    return isMythical;
  }

  /**
   * Sets the <code>isMythical</code> property.
   */
 public void setIsMythical(Boolean isMythical) {
    this.isMythical = isMythical;
  }

  /**
   * Sets the <code>isMythical</code> property.
   */
  public PokemonSpeciesDetail isMythical(Boolean isMythical) {
    this.isMythical = isMythical;
    return this;
  }

 /**
  * Get hatchCounter
  * @return hatchCounter
  */
  @JsonProperty("hatch_counter")
  public Integer getHatchCounter() {
    return hatchCounter;
  }

  /**
   * Sets the <code>hatchCounter</code> property.
   */
 public void setHatchCounter(Integer hatchCounter) {
    this.hatchCounter = hatchCounter;
  }

  /**
   * Sets the <code>hatchCounter</code> property.
   */
  public PokemonSpeciesDetail hatchCounter(Integer hatchCounter) {
    this.hatchCounter = hatchCounter;
    return this;
  }

 /**
  * Get hasGenderDifferences
  * @return hasGenderDifferences
  */
  @JsonProperty("has_gender_differences")
  public Boolean getHasGenderDifferences() {
    return hasGenderDifferences;
  }

  /**
   * Sets the <code>hasGenderDifferences</code> property.
   */
 public void setHasGenderDifferences(Boolean hasGenderDifferences) {
    this.hasGenderDifferences = hasGenderDifferences;
  }

  /**
   * Sets the <code>hasGenderDifferences</code> property.
   */
  public PokemonSpeciesDetail hasGenderDifferences(Boolean hasGenderDifferences) {
    this.hasGenderDifferences = hasGenderDifferences;
    return this;
  }

 /**
  * Get formsSwitchable
  * @return formsSwitchable
  */
  @JsonProperty("forms_switchable")
  public Boolean getFormsSwitchable() {
    return formsSwitchable;
  }

  /**
   * Sets the <code>formsSwitchable</code> property.
   */
 public void setFormsSwitchable(Boolean formsSwitchable) {
    this.formsSwitchable = formsSwitchable;
  }

  /**
   * Sets the <code>formsSwitchable</code> property.
   */
  public PokemonSpeciesDetail formsSwitchable(Boolean formsSwitchable) {
    this.formsSwitchable = formsSwitchable;
    return this;
  }

 /**
  * Get growthRate
  * @return growthRate
  */
  @JsonProperty("growth_rate")
  @NotNull
  public GrowthRateSummary getGrowthRate() {
    return growthRate;
  }

  /**
   * Sets the <code>growthRate</code> property.
   */
 public void setGrowthRate(GrowthRateSummary growthRate) {
    this.growthRate = growthRate;
  }

  /**
   * Sets the <code>growthRate</code> property.
   */
  public PokemonSpeciesDetail growthRate(GrowthRateSummary growthRate) {
    this.growthRate = growthRate;
    return this;
  }

 /**
  * Get pokedexNumbers
  * @return pokedexNumbers
  */
  @JsonProperty("pokedex_numbers")
  @NotNull
  public List<@Valid PokemonDexEntry> getPokedexNumbers() {
    return pokedexNumbers;
  }

  /**
   * Sets the <code>pokedexNumbers</code> property.
   */
 public void setPokedexNumbers(List<@Valid PokemonDexEntry> pokedexNumbers) {
    this.pokedexNumbers = pokedexNumbers;
  }

  /**
   * Sets the <code>pokedexNumbers</code> property.
   */
  public PokemonSpeciesDetail pokedexNumbers(List<@Valid PokemonDexEntry> pokedexNumbers) {
    this.pokedexNumbers = pokedexNumbers;
    return this;
  }

  /**
   * Adds a new item to the <code>pokedexNumbers</code> list.
   */
  public PokemonSpeciesDetail addPokedexNumbersItem(PokemonDexEntry pokedexNumbersItem) {
    this.pokedexNumbers.add(pokedexNumbersItem);
    return this;
  }

 /**
  * Get eggGroups
  * @return eggGroups
  */
  @JsonProperty("egg_groups")
  @NotNull
  public List<@Valid AbilityDetailPokemonInnerPokemon> getEggGroups() {
    return eggGroups;
  }

  /**
   * Sets the <code>eggGroups</code> property.
   */
 public void setEggGroups(List<@Valid AbilityDetailPokemonInnerPokemon> eggGroups) {
    this.eggGroups = eggGroups;
  }

  /**
   * Sets the <code>eggGroups</code> property.
   */
  public PokemonSpeciesDetail eggGroups(List<@Valid AbilityDetailPokemonInnerPokemon> eggGroups) {
    this.eggGroups = eggGroups;
    return this;
  }

  /**
   * Adds a new item to the <code>eggGroups</code> list.
   */
  public PokemonSpeciesDetail addEggGroupsItem(AbilityDetailPokemonInnerPokemon eggGroupsItem) {
    this.eggGroups.add(eggGroupsItem);
    return this;
  }

 /**
  * Get color
  * @return color
  */
  @JsonProperty("color")
  @NotNull
  public PokemonColorSummary getColor() {
    return color;
  }

  /**
   * Sets the <code>color</code> property.
   */
 public void setColor(PokemonColorSummary color) {
    this.color = color;
  }

  /**
   * Sets the <code>color</code> property.
   */
  public PokemonSpeciesDetail color(PokemonColorSummary color) {
    this.color = color;
    return this;
  }

 /**
  * Get shape
  * @return shape
  */
  @JsonProperty("shape")
  @NotNull
  public PokemonShapeSummary getShape() {
    return shape;
  }

  /**
   * Sets the <code>shape</code> property.
   */
 public void setShape(PokemonShapeSummary shape) {
    this.shape = shape;
  }

  /**
   * Sets the <code>shape</code> property.
   */
  public PokemonSpeciesDetail shape(PokemonShapeSummary shape) {
    this.shape = shape;
    return this;
  }

 /**
  * Get evolvesFromSpecies
  * @return evolvesFromSpecies
  */
  @JsonProperty("evolves_from_species")
  @NotNull
  public PokemonSpeciesSummary getEvolvesFromSpecies() {
    return evolvesFromSpecies;
  }

  /**
   * Sets the <code>evolvesFromSpecies</code> property.
   */
 public void setEvolvesFromSpecies(PokemonSpeciesSummary evolvesFromSpecies) {
    this.evolvesFromSpecies = evolvesFromSpecies;
  }

  /**
   * Sets the <code>evolvesFromSpecies</code> property.
   */
  public PokemonSpeciesDetail evolvesFromSpecies(PokemonSpeciesSummary evolvesFromSpecies) {
    this.evolvesFromSpecies = evolvesFromSpecies;
    return this;
  }

 /**
  * Get evolutionChain
  * @return evolutionChain
  */
  @JsonProperty("evolution_chain")
  @NotNull
  public EvolutionChainSummary getEvolutionChain() {
    return evolutionChain;
  }

  /**
   * Sets the <code>evolutionChain</code> property.
   */
 public void setEvolutionChain(EvolutionChainSummary evolutionChain) {
    this.evolutionChain = evolutionChain;
  }

  /**
   * Sets the <code>evolutionChain</code> property.
   */
  public PokemonSpeciesDetail evolutionChain(EvolutionChainSummary evolutionChain) {
    this.evolutionChain = evolutionChain;
    return this;
  }

 /**
  * Get habitat
  * @return habitat
  */
  @JsonProperty("habitat")
  @NotNull
  public PokemonHabitatSummary getHabitat() {
    return habitat;
  }

  /**
   * Sets the <code>habitat</code> property.
   */
 public void setHabitat(PokemonHabitatSummary habitat) {
    this.habitat = habitat;
  }

  /**
   * Sets the <code>habitat</code> property.
   */
  public PokemonSpeciesDetail habitat(PokemonHabitatSummary habitat) {
    this.habitat = habitat;
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
  public PokemonSpeciesDetail generation(GenerationSummary generation) {
    this.generation = generation;
    return this;
  }

 /**
  * Get names
  * @return names
  */
  @JsonProperty("names")
  @NotNull
  public List<@Valid PokemonFormDetailFormNamesInner> getNames() {
    return names;
  }

  /**
   * Sets the <code>names</code> property.
   */
 public void setNames(List<@Valid PokemonFormDetailFormNamesInner> names) {
    this.names = names;
  }

  /**
   * Sets the <code>names</code> property.
   */
  public PokemonSpeciesDetail names(List<@Valid PokemonFormDetailFormNamesInner> names) {
    this.names = names;
    return this;
  }

  /**
   * Adds a new item to the <code>names</code> list.
   */
  public PokemonSpeciesDetail addNamesItem(PokemonFormDetailFormNamesInner namesItem) {
    this.names.add(namesItem);
    return this;
  }

 /**
  * Get palParkEncounters
  * @return palParkEncounters
  */
  @JsonProperty("pal_park_encounters")
  @NotNull
  public List<@Valid PokemonSpeciesDetailPalParkEncountersInner> getPalParkEncounters() {
    return palParkEncounters;
  }

  /**
   * Sets the <code>palParkEncounters</code> property.
   */
 public void setPalParkEncounters(List<@Valid PokemonSpeciesDetailPalParkEncountersInner> palParkEncounters) {
    this.palParkEncounters = palParkEncounters;
  }

  /**
   * Sets the <code>palParkEncounters</code> property.
   */
  public PokemonSpeciesDetail palParkEncounters(List<@Valid PokemonSpeciesDetailPalParkEncountersInner> palParkEncounters) {
    this.palParkEncounters = palParkEncounters;
    return this;
  }

  /**
   * Adds a new item to the <code>palParkEncounters</code> list.
   */
  public PokemonSpeciesDetail addPalParkEncountersItem(PokemonSpeciesDetailPalParkEncountersInner palParkEncountersItem) {
    this.palParkEncounters.add(palParkEncountersItem);
    return this;
  }

 /**
  * Get formDescriptions
  * @return formDescriptions
  */
  @JsonProperty("form_descriptions")
  @NotNull
  public List<@Valid PokemonSpeciesDescription> getFormDescriptions() {
    return formDescriptions;
  }

  /**
   * Sets the <code>formDescriptions</code> property.
   */
 public void setFormDescriptions(List<@Valid PokemonSpeciesDescription> formDescriptions) {
    this.formDescriptions = formDescriptions;
  }

  /**
   * Sets the <code>formDescriptions</code> property.
   */
  public PokemonSpeciesDetail formDescriptions(List<@Valid PokemonSpeciesDescription> formDescriptions) {
    this.formDescriptions = formDescriptions;
    return this;
  }

  /**
   * Adds a new item to the <code>formDescriptions</code> list.
   */
  public PokemonSpeciesDetail addFormDescriptionsItem(PokemonSpeciesDescription formDescriptionsItem) {
    this.formDescriptions.add(formDescriptionsItem);
    return this;
  }

 /**
  * Get flavorTextEntries
  * @return flavorTextEntries
  */
  @JsonProperty("flavor_text_entries")
  @NotNull
  public List<@Valid PokemonSpeciesFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }

  /**
   * Sets the <code>flavorTextEntries</code> property.
   */
 public void setFlavorTextEntries(List<@Valid PokemonSpeciesFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
  }

  /**
   * Sets the <code>flavorTextEntries</code> property.
   */
  public PokemonSpeciesDetail flavorTextEntries(List<@Valid PokemonSpeciesFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
    return this;
  }

  /**
   * Adds a new item to the <code>flavorTextEntries</code> list.
   */
  public PokemonSpeciesDetail addFlavorTextEntriesItem(PokemonSpeciesFlavorText flavorTextEntriesItem) {
    this.flavorTextEntries.add(flavorTextEntriesItem);
    return this;
  }

 /**
  * Get genera
  * @return genera
  */
  @JsonProperty("genera")
  @NotNull
  public List<@Valid PokemonSpeciesDetailGeneraInner> getGenera() {
    return genera;
  }

  /**
   * Sets the <code>genera</code> property.
   */
 public void setGenera(List<@Valid PokemonSpeciesDetailGeneraInner> genera) {
    this.genera = genera;
  }

  /**
   * Sets the <code>genera</code> property.
   */
  public PokemonSpeciesDetail genera(List<@Valid PokemonSpeciesDetailGeneraInner> genera) {
    this.genera = genera;
    return this;
  }

  /**
   * Adds a new item to the <code>genera</code> list.
   */
  public PokemonSpeciesDetail addGeneraItem(PokemonSpeciesDetailGeneraInner generaItem) {
    this.genera.add(generaItem);
    return this;
  }

 /**
  * Get varieties
  * @return varieties
  */
  @JsonProperty("varieties")
  @NotNull
  public List<@Valid PokemonSpeciesDetailVarietiesInner> getVarieties() {
    return varieties;
  }

  /**
   * Sets the <code>varieties</code> property.
   */
 public void setVarieties(List<@Valid PokemonSpeciesDetailVarietiesInner> varieties) {
    this.varieties = varieties;
  }

  /**
   * Sets the <code>varieties</code> property.
   */
  public PokemonSpeciesDetail varieties(List<@Valid PokemonSpeciesDetailVarietiesInner> varieties) {
    this.varieties = varieties;
    return this;
  }

  /**
   * Adds a new item to the <code>varieties</code> list.
   */
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

