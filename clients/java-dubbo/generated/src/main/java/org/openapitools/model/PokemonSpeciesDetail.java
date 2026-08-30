package org.openapitools.model;

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
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class PokemonSpeciesDetail implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("order")
  private Integer order;

  @JsonProperty("gender_rate")
  private Integer genderRate;

  @JsonProperty("capture_rate")
  private Integer captureRate;

  @JsonProperty("base_happiness")
  private Integer baseHappiness;

  @JsonProperty("is_baby")
  private Boolean isBaby;

  @JsonProperty("is_legendary")
  private Boolean isLegendary;

  @JsonProperty("is_mythical")
  private Boolean isMythical;

  @JsonProperty("hatch_counter")
  private Integer hatchCounter;

  @JsonProperty("has_gender_differences")
  private Boolean hasGenderDifferences;

  @JsonProperty("forms_switchable")
  private Boolean formsSwitchable;

  @JsonProperty("growth_rate")
  private GrowthRateSummary growthRate;

  @JsonProperty("pokedex_numbers")
  private List<PokemonDexEntry> pokedexNumbers = new ArrayList<>();

  @JsonProperty("egg_groups")
  private List<AbilityDetailPokemonInnerPokemon> eggGroups = new ArrayList<>();

  @JsonProperty("color")
  private PokemonColorSummary color;

  @JsonProperty("shape")
  private PokemonShapeSummary shape;

  @JsonProperty("evolves_from_species")
  private PokemonSpeciesSummary evolvesFromSpecies;

  @JsonProperty("evolution_chain")
  private EvolutionChainSummary evolutionChain;

  @JsonProperty("habitat")
  private PokemonHabitatSummary habitat;

  @JsonProperty("generation")
  private GenerationSummary generation;

  @JsonProperty("names")
  private List<PokemonFormDetailFormNamesInner> names = new ArrayList<>();

  @JsonProperty("pal_park_encounters")
  private List<PokemonSpeciesDetailPalParkEncountersInner> palParkEncounters = new ArrayList<>();

  @JsonProperty("form_descriptions")
  private List<PokemonSpeciesDescription> formDescriptions = new ArrayList<>();

  @JsonProperty("flavor_text_entries")
  private List<PokemonSpeciesFlavorText> flavorTextEntries = new ArrayList<>();

  @JsonProperty("genera")
  private List<PokemonSpeciesDetailGeneraInner> genera = new ArrayList<>();

  @JsonProperty("varieties")
  private List<PokemonSpeciesDetailVarietiesInner> varieties = new ArrayList<>();

  /**
   * 
   * @return id
   */
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * 
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * 
   * @return order
   */
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  /**
   * 
   * @return genderRate
   */
  public Integer getGenderRate() {
    return genderRate;
  }

  public void setGenderRate(Integer genderRate) {
    this.genderRate = genderRate;
  }

  /**
   * 
   * @return captureRate
   */
  public Integer getCaptureRate() {
    return captureRate;
  }

  public void setCaptureRate(Integer captureRate) {
    this.captureRate = captureRate;
  }

  /**
   * 
   * @return baseHappiness
   */
  public Integer getBaseHappiness() {
    return baseHappiness;
  }

  public void setBaseHappiness(Integer baseHappiness) {
    this.baseHappiness = baseHappiness;
  }

  /**
   * 
   * @return isBaby
   */
  public Boolean getIsBaby() {
    return isBaby;
  }

  public void setIsBaby(Boolean isBaby) {
    this.isBaby = isBaby;
  }

  /**
   * 
   * @return isLegendary
   */
  public Boolean getIsLegendary() {
    return isLegendary;
  }

  public void setIsLegendary(Boolean isLegendary) {
    this.isLegendary = isLegendary;
  }

  /**
   * 
   * @return isMythical
   */
  public Boolean getIsMythical() {
    return isMythical;
  }

  public void setIsMythical(Boolean isMythical) {
    this.isMythical = isMythical;
  }

  /**
   * 
   * @return hatchCounter
   */
  public Integer getHatchCounter() {
    return hatchCounter;
  }

  public void setHatchCounter(Integer hatchCounter) {
    this.hatchCounter = hatchCounter;
  }

  /**
   * 
   * @return hasGenderDifferences
   */
  public Boolean getHasGenderDifferences() {
    return hasGenderDifferences;
  }

  public void setHasGenderDifferences(Boolean hasGenderDifferences) {
    this.hasGenderDifferences = hasGenderDifferences;
  }

  /**
   * 
   * @return formsSwitchable
   */
  public Boolean getFormsSwitchable() {
    return formsSwitchable;
  }

  public void setFormsSwitchable(Boolean formsSwitchable) {
    this.formsSwitchable = formsSwitchable;
  }

  /**
   * 
   * @return growthRate
   */
  public GrowthRateSummary getGrowthRate() {
    return growthRate;
  }

  public void setGrowthRate(GrowthRateSummary growthRate) {
    this.growthRate = growthRate;
  }

  /**
   * 
   * @return pokedexNumbers
   */
  public List<PokemonDexEntry> getPokedexNumbers() {
    return pokedexNumbers;
  }

  public void setPokedexNumbers(List<PokemonDexEntry> pokedexNumbers) {
    this.pokedexNumbers = pokedexNumbers;
  }

  /**
   * 
   * @return eggGroups
   */
  public List<AbilityDetailPokemonInnerPokemon> getEggGroups() {
    return eggGroups;
  }

  public void setEggGroups(List<AbilityDetailPokemonInnerPokemon> eggGroups) {
    this.eggGroups = eggGroups;
  }

  /**
   * 
   * @return color
   */
  public PokemonColorSummary getColor() {
    return color;
  }

  public void setColor(PokemonColorSummary color) {
    this.color = color;
  }

  /**
   * 
   * @return shape
   */
  public PokemonShapeSummary getShape() {
    return shape;
  }

  public void setShape(PokemonShapeSummary shape) {
    this.shape = shape;
  }

  /**
   * 
   * @return evolvesFromSpecies
   */
  public PokemonSpeciesSummary getEvolvesFromSpecies() {
    return evolvesFromSpecies;
  }

  public void setEvolvesFromSpecies(PokemonSpeciesSummary evolvesFromSpecies) {
    this.evolvesFromSpecies = evolvesFromSpecies;
  }

  /**
   * 
   * @return evolutionChain
   */
  public EvolutionChainSummary getEvolutionChain() {
    return evolutionChain;
  }

  public void setEvolutionChain(EvolutionChainSummary evolutionChain) {
    this.evolutionChain = evolutionChain;
  }

  /**
   * 
   * @return habitat
   */
  public PokemonHabitatSummary getHabitat() {
    return habitat;
  }

  public void setHabitat(PokemonHabitatSummary habitat) {
    this.habitat = habitat;
  }

  /**
   * 
   * @return generation
   */
  public GenerationSummary getGeneration() {
    return generation;
  }

  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

  /**
   * 
   * @return names
   */
  public List<PokemonFormDetailFormNamesInner> getNames() {
    return names;
  }

  public void setNames(List<PokemonFormDetailFormNamesInner> names) {
    this.names = names;
  }

  /**
   * 
   * @return palParkEncounters
   */
  public List<PokemonSpeciesDetailPalParkEncountersInner> getPalParkEncounters() {
    return palParkEncounters;
  }

  public void setPalParkEncounters(List<PokemonSpeciesDetailPalParkEncountersInner> palParkEncounters) {
    this.palParkEncounters = palParkEncounters;
  }

  /**
   * 
   * @return formDescriptions
   */
  public List<PokemonSpeciesDescription> getFormDescriptions() {
    return formDescriptions;
  }

  public void setFormDescriptions(List<PokemonSpeciesDescription> formDescriptions) {
    this.formDescriptions = formDescriptions;
  }

  /**
   * 
   * @return flavorTextEntries
   */
  public List<PokemonSpeciesFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }

  public void setFlavorTextEntries(List<PokemonSpeciesFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
  }

  /**
   * 
   * @return genera
   */
  public List<PokemonSpeciesDetailGeneraInner> getGenera() {
    return genera;
  }

  public void setGenera(List<PokemonSpeciesDetailGeneraInner> genera) {
    this.genera = genera;
  }

  /**
   * 
   * @return varieties
   */
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
