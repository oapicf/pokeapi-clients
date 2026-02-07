package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PokemonSpeciesDetail
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-02-07T04:17:25.266083787Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokemonSpeciesDetail {

  private Integer id;

  private String name;

  private JsonNullable<Integer> order = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> genderRate = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> captureRate = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> baseHappiness = JsonNullable.<Integer>undefined();

  private Boolean isBaby;

  private Boolean isLegendary;

  private Boolean isMythical;

  private JsonNullable<Integer> hatchCounter = JsonNullable.<Integer>undefined();

  private Boolean hasGenderDifferences;

  private Boolean formsSwitchable;

  private GrowthRateSummary growthRate;

  @Valid
  private List<@Valid PokemonDexEntry> pokedexNumbers = new ArrayList<>();

  @Valid
  private List<@Valid AbilityDetailPokemonInnerPokemon> eggGroups = new ArrayList<>();

  private PokemonColorSummary color;

  private PokemonShapeSummary shape;

  private PokemonSpeciesSummary evolvesFromSpecies;

  private EvolutionChainSummary evolutionChain;

  private PokemonHabitatSummary habitat;

  private GenerationSummary generation;

  @Valid
  private List<@Valid PokemonFormDetailFormNamesInner> names = new ArrayList<>();

  @Valid
  private List<@Valid PokemonSpeciesDetailPalParkEncountersInner> palParkEncounters = new ArrayList<>();

  @Valid
  private List<@Valid PokemonSpeciesDescription> formDescriptions = new ArrayList<>();

  @Valid
  private List<@Valid PokemonSpeciesFlavorText> flavorTextEntries = new ArrayList<>();

  @Valid
  private List<@Valid PokemonSpeciesDetailGeneraInner> genera = new ArrayList<>();

  @Valid
  private List<@Valid PokemonSpeciesDetailVarietiesInner> varieties = new ArrayList<>();

  public PokemonSpeciesDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PokemonSpeciesDetail(Integer id, String name, GrowthRateSummary growthRate, List<@Valid PokemonDexEntry> pokedexNumbers, List<@Valid AbilityDetailPokemonInnerPokemon> eggGroups, PokemonColorSummary color, PokemonShapeSummary shape, PokemonSpeciesSummary evolvesFromSpecies, EvolutionChainSummary evolutionChain, PokemonHabitatSummary habitat, GenerationSummary generation, List<@Valid PokemonFormDetailFormNamesInner> names, List<@Valid PokemonSpeciesDetailPalParkEncountersInner> palParkEncounters, List<@Valid PokemonSpeciesDescription> formDescriptions, List<@Valid PokemonSpeciesFlavorText> flavorTextEntries, List<@Valid PokemonSpeciesDetailGeneraInner> genera, List<@Valid PokemonSpeciesDetailVarietiesInner> varieties) {
    this.id = id;
    this.name = name;
    this.growthRate = growthRate;
    this.pokedexNumbers = pokedexNumbers;
    this.eggGroups = eggGroups;
    this.color = color;
    this.shape = shape;
    this.evolvesFromSpecies = evolvesFromSpecies;
    this.evolutionChain = evolutionChain;
    this.habitat = habitat;
    this.generation = generation;
    this.names = names;
    this.palParkEncounters = palParkEncounters;
    this.formDescriptions = formDescriptions;
    this.flavorTextEntries = flavorTextEntries;
    this.genera = genera;
    this.varieties = varieties;
  }

  public PokemonSpeciesDetail id(Integer id) {
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

  public PokemonSpeciesDetail name(String name) {
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

  public PokemonSpeciesDetail order(Integer order) {
    this.order = JsonNullable.of(order);
    return this;
  }

  /**
   * Get order
   * @return order
   */
  
  @Schema(name = "order", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("order")
  public JsonNullable<Integer> getOrder() {
    return order;
  }

  public void setOrder(JsonNullable<Integer> order) {
    this.order = order;
  }

  public PokemonSpeciesDetail genderRate(Integer genderRate) {
    this.genderRate = JsonNullable.of(genderRate);
    return this;
  }

  /**
   * Get genderRate
   * @return genderRate
   */
  
  @Schema(name = "gender_rate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gender_rate")
  public JsonNullable<Integer> getGenderRate() {
    return genderRate;
  }

  public void setGenderRate(JsonNullable<Integer> genderRate) {
    this.genderRate = genderRate;
  }

  public PokemonSpeciesDetail captureRate(Integer captureRate) {
    this.captureRate = JsonNullable.of(captureRate);
    return this;
  }

  /**
   * Get captureRate
   * @return captureRate
   */
  
  @Schema(name = "capture_rate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("capture_rate")
  public JsonNullable<Integer> getCaptureRate() {
    return captureRate;
  }

  public void setCaptureRate(JsonNullable<Integer> captureRate) {
    this.captureRate = captureRate;
  }

  public PokemonSpeciesDetail baseHappiness(Integer baseHappiness) {
    this.baseHappiness = JsonNullable.of(baseHappiness);
    return this;
  }

  /**
   * Get baseHappiness
   * @return baseHappiness
   */
  
  @Schema(name = "base_happiness", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("base_happiness")
  public JsonNullable<Integer> getBaseHappiness() {
    return baseHappiness;
  }

  public void setBaseHappiness(JsonNullable<Integer> baseHappiness) {
    this.baseHappiness = baseHappiness;
  }

  public PokemonSpeciesDetail isBaby(Boolean isBaby) {
    this.isBaby = isBaby;
    return this;
  }

  /**
   * Get isBaby
   * @return isBaby
   */
  
  @Schema(name = "is_baby", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_baby")
  public Boolean getIsBaby() {
    return isBaby;
  }

  public void setIsBaby(Boolean isBaby) {
    this.isBaby = isBaby;
  }

  public PokemonSpeciesDetail isLegendary(Boolean isLegendary) {
    this.isLegendary = isLegendary;
    return this;
  }

  /**
   * Get isLegendary
   * @return isLegendary
   */
  
  @Schema(name = "is_legendary", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_legendary")
  public Boolean getIsLegendary() {
    return isLegendary;
  }

  public void setIsLegendary(Boolean isLegendary) {
    this.isLegendary = isLegendary;
  }

  public PokemonSpeciesDetail isMythical(Boolean isMythical) {
    this.isMythical = isMythical;
    return this;
  }

  /**
   * Get isMythical
   * @return isMythical
   */
  
  @Schema(name = "is_mythical", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_mythical")
  public Boolean getIsMythical() {
    return isMythical;
  }

  public void setIsMythical(Boolean isMythical) {
    this.isMythical = isMythical;
  }

  public PokemonSpeciesDetail hatchCounter(Integer hatchCounter) {
    this.hatchCounter = JsonNullable.of(hatchCounter);
    return this;
  }

  /**
   * Get hatchCounter
   * @return hatchCounter
   */
  
  @Schema(name = "hatch_counter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hatch_counter")
  public JsonNullable<Integer> getHatchCounter() {
    return hatchCounter;
  }

  public void setHatchCounter(JsonNullable<Integer> hatchCounter) {
    this.hatchCounter = hatchCounter;
  }

  public PokemonSpeciesDetail hasGenderDifferences(Boolean hasGenderDifferences) {
    this.hasGenderDifferences = hasGenderDifferences;
    return this;
  }

  /**
   * Get hasGenderDifferences
   * @return hasGenderDifferences
   */
  
  @Schema(name = "has_gender_differences", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("has_gender_differences")
  public Boolean getHasGenderDifferences() {
    return hasGenderDifferences;
  }

  public void setHasGenderDifferences(Boolean hasGenderDifferences) {
    this.hasGenderDifferences = hasGenderDifferences;
  }

  public PokemonSpeciesDetail formsSwitchable(Boolean formsSwitchable) {
    this.formsSwitchable = formsSwitchable;
    return this;
  }

  /**
   * Get formsSwitchable
   * @return formsSwitchable
   */
  
  @Schema(name = "forms_switchable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("forms_switchable")
  public Boolean getFormsSwitchable() {
    return formsSwitchable;
  }

  public void setFormsSwitchable(Boolean formsSwitchable) {
    this.formsSwitchable = formsSwitchable;
  }

  public PokemonSpeciesDetail growthRate(GrowthRateSummary growthRate) {
    this.growthRate = growthRate;
    return this;
  }

  /**
   * Get growthRate
   * @return growthRate
   */
  @NotNull @Valid 
  @Schema(name = "growth_rate", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("growth_rate")
  public GrowthRateSummary getGrowthRate() {
    return growthRate;
  }

  public void setGrowthRate(GrowthRateSummary growthRate) {
    this.growthRate = growthRate;
  }

  public PokemonSpeciesDetail pokedexNumbers(List<@Valid PokemonDexEntry> pokedexNumbers) {
    this.pokedexNumbers = pokedexNumbers;
    return this;
  }

  public PokemonSpeciesDetail addPokedexNumbersItem(PokemonDexEntry pokedexNumbersItem) {
    if (this.pokedexNumbers == null) {
      this.pokedexNumbers = new ArrayList<>();
    }
    this.pokedexNumbers.add(pokedexNumbersItem);
    return this;
  }

  /**
   * Get pokedexNumbers
   * @return pokedexNumbers
   */
  @NotNull @Valid 
  @Schema(name = "pokedex_numbers", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pokedex_numbers")
  public List<@Valid PokemonDexEntry> getPokedexNumbers() {
    return pokedexNumbers;
  }

  public void setPokedexNumbers(List<@Valid PokemonDexEntry> pokedexNumbers) {
    this.pokedexNumbers = pokedexNumbers;
  }

  public PokemonSpeciesDetail eggGroups(List<@Valid AbilityDetailPokemonInnerPokemon> eggGroups) {
    this.eggGroups = eggGroups;
    return this;
  }

  public PokemonSpeciesDetail addEggGroupsItem(AbilityDetailPokemonInnerPokemon eggGroupsItem) {
    if (this.eggGroups == null) {
      this.eggGroups = new ArrayList<>();
    }
    this.eggGroups.add(eggGroupsItem);
    return this;
  }

  /**
   * Get eggGroups
   * @return eggGroups
   */
  @NotNull @Valid 
  @Schema(name = "egg_groups", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("egg_groups")
  public List<@Valid AbilityDetailPokemonInnerPokemon> getEggGroups() {
    return eggGroups;
  }

  public void setEggGroups(List<@Valid AbilityDetailPokemonInnerPokemon> eggGroups) {
    this.eggGroups = eggGroups;
  }

  public PokemonSpeciesDetail color(PokemonColorSummary color) {
    this.color = color;
    return this;
  }

  /**
   * Get color
   * @return color
   */
  @NotNull @Valid 
  @Schema(name = "color", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("color")
  public PokemonColorSummary getColor() {
    return color;
  }

  public void setColor(PokemonColorSummary color) {
    this.color = color;
  }

  public PokemonSpeciesDetail shape(PokemonShapeSummary shape) {
    this.shape = shape;
    return this;
  }

  /**
   * Get shape
   * @return shape
   */
  @NotNull @Valid 
  @Schema(name = "shape", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("shape")
  public PokemonShapeSummary getShape() {
    return shape;
  }

  public void setShape(PokemonShapeSummary shape) {
    this.shape = shape;
  }

  public PokemonSpeciesDetail evolvesFromSpecies(PokemonSpeciesSummary evolvesFromSpecies) {
    this.evolvesFromSpecies = evolvesFromSpecies;
    return this;
  }

  /**
   * Get evolvesFromSpecies
   * @return evolvesFromSpecies
   */
  @NotNull @Valid 
  @Schema(name = "evolves_from_species", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("evolves_from_species")
  public PokemonSpeciesSummary getEvolvesFromSpecies() {
    return evolvesFromSpecies;
  }

  public void setEvolvesFromSpecies(PokemonSpeciesSummary evolvesFromSpecies) {
    this.evolvesFromSpecies = evolvesFromSpecies;
  }

  public PokemonSpeciesDetail evolutionChain(EvolutionChainSummary evolutionChain) {
    this.evolutionChain = evolutionChain;
    return this;
  }

  /**
   * Get evolutionChain
   * @return evolutionChain
   */
  @NotNull @Valid 
  @Schema(name = "evolution_chain", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("evolution_chain")
  public EvolutionChainSummary getEvolutionChain() {
    return evolutionChain;
  }

  public void setEvolutionChain(EvolutionChainSummary evolutionChain) {
    this.evolutionChain = evolutionChain;
  }

  public PokemonSpeciesDetail habitat(PokemonHabitatSummary habitat) {
    this.habitat = habitat;
    return this;
  }

  /**
   * Get habitat
   * @return habitat
   */
  @NotNull @Valid 
  @Schema(name = "habitat", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("habitat")
  public PokemonHabitatSummary getHabitat() {
    return habitat;
  }

  public void setHabitat(PokemonHabitatSummary habitat) {
    this.habitat = habitat;
  }

  public PokemonSpeciesDetail generation(GenerationSummary generation) {
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

  public PokemonSpeciesDetail names(List<@Valid PokemonFormDetailFormNamesInner> names) {
    this.names = names;
    return this;
  }

  public PokemonSpeciesDetail addNamesItem(PokemonFormDetailFormNamesInner namesItem) {
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
  public List<@Valid PokemonFormDetailFormNamesInner> getNames() {
    return names;
  }

  public void setNames(List<@Valid PokemonFormDetailFormNamesInner> names) {
    this.names = names;
  }

  public PokemonSpeciesDetail palParkEncounters(List<@Valid PokemonSpeciesDetailPalParkEncountersInner> palParkEncounters) {
    this.palParkEncounters = palParkEncounters;
    return this;
  }

  public PokemonSpeciesDetail addPalParkEncountersItem(PokemonSpeciesDetailPalParkEncountersInner palParkEncountersItem) {
    if (this.palParkEncounters == null) {
      this.palParkEncounters = new ArrayList<>();
    }
    this.palParkEncounters.add(palParkEncountersItem);
    return this;
  }

  /**
   * Get palParkEncounters
   * @return palParkEncounters
   */
  @NotNull @Valid 
  @Schema(name = "pal_park_encounters", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pal_park_encounters")
  public List<@Valid PokemonSpeciesDetailPalParkEncountersInner> getPalParkEncounters() {
    return palParkEncounters;
  }

  public void setPalParkEncounters(List<@Valid PokemonSpeciesDetailPalParkEncountersInner> palParkEncounters) {
    this.palParkEncounters = palParkEncounters;
  }

  public PokemonSpeciesDetail formDescriptions(List<@Valid PokemonSpeciesDescription> formDescriptions) {
    this.formDescriptions = formDescriptions;
    return this;
  }

  public PokemonSpeciesDetail addFormDescriptionsItem(PokemonSpeciesDescription formDescriptionsItem) {
    if (this.formDescriptions == null) {
      this.formDescriptions = new ArrayList<>();
    }
    this.formDescriptions.add(formDescriptionsItem);
    return this;
  }

  /**
   * Get formDescriptions
   * @return formDescriptions
   */
  @NotNull @Valid 
  @Schema(name = "form_descriptions", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("form_descriptions")
  public List<@Valid PokemonSpeciesDescription> getFormDescriptions() {
    return formDescriptions;
  }

  public void setFormDescriptions(List<@Valid PokemonSpeciesDescription> formDescriptions) {
    this.formDescriptions = formDescriptions;
  }

  public PokemonSpeciesDetail flavorTextEntries(List<@Valid PokemonSpeciesFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
    return this;
  }

  public PokemonSpeciesDetail addFlavorTextEntriesItem(PokemonSpeciesFlavorText flavorTextEntriesItem) {
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
  public List<@Valid PokemonSpeciesFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }

  public void setFlavorTextEntries(List<@Valid PokemonSpeciesFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
  }

  public PokemonSpeciesDetail genera(List<@Valid PokemonSpeciesDetailGeneraInner> genera) {
    this.genera = genera;
    return this;
  }

  public PokemonSpeciesDetail addGeneraItem(PokemonSpeciesDetailGeneraInner generaItem) {
    if (this.genera == null) {
      this.genera = new ArrayList<>();
    }
    this.genera.add(generaItem);
    return this;
  }

  /**
   * Get genera
   * @return genera
   */
  @NotNull @Valid 
  @Schema(name = "genera", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("genera")
  public List<@Valid PokemonSpeciesDetailGeneraInner> getGenera() {
    return genera;
  }

  public void setGenera(List<@Valid PokemonSpeciesDetailGeneraInner> genera) {
    this.genera = genera;
  }

  public PokemonSpeciesDetail varieties(List<@Valid PokemonSpeciesDetailVarietiesInner> varieties) {
    this.varieties = varieties;
    return this;
  }

  public PokemonSpeciesDetail addVarietiesItem(PokemonSpeciesDetailVarietiesInner varietiesItem) {
    if (this.varieties == null) {
      this.varieties = new ArrayList<>();
    }
    this.varieties.add(varietiesItem);
    return this;
  }

  /**
   * Get varieties
   * @return varieties
   */
  @NotNull @Valid 
  @Schema(name = "varieties", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("varieties")
  public List<@Valid PokemonSpeciesDetailVarietiesInner> getVarieties() {
    return varieties;
  }

  public void setVarieties(List<@Valid PokemonSpeciesDetailVarietiesInner> varieties) {
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
    return Objects.equals(this.id, pokemonSpeciesDetail.id) &&
        Objects.equals(this.name, pokemonSpeciesDetail.name) &&
        equalsNullable(this.order, pokemonSpeciesDetail.order) &&
        equalsNullable(this.genderRate, pokemonSpeciesDetail.genderRate) &&
        equalsNullable(this.captureRate, pokemonSpeciesDetail.captureRate) &&
        equalsNullable(this.baseHappiness, pokemonSpeciesDetail.baseHappiness) &&
        Objects.equals(this.isBaby, pokemonSpeciesDetail.isBaby) &&
        Objects.equals(this.isLegendary, pokemonSpeciesDetail.isLegendary) &&
        Objects.equals(this.isMythical, pokemonSpeciesDetail.isMythical) &&
        equalsNullable(this.hatchCounter, pokemonSpeciesDetail.hatchCounter) &&
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

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, hashCodeNullable(order), hashCodeNullable(genderRate), hashCodeNullable(captureRate), hashCodeNullable(baseHappiness), isBaby, isLegendary, isMythical, hashCodeNullable(hatchCounter), hasGenderDifferences, formsSwitchable, growthRate, pokedexNumbers, eggGroups, color, shape, evolvesFromSpecies, evolutionChain, habitat, generation, names, palParkEncounters, formDescriptions, flavorTextEntries, genera, varieties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

