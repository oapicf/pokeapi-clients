package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.vertxweb.server.model.EvolutionChainSummary;
import org.openapitools.vertxweb.server.model.GenerationSummary;
import org.openapitools.vertxweb.server.model.GrowthRateSummary;
import org.openapitools.vertxweb.server.model.PokemonColorSummary;
import org.openapitools.vertxweb.server.model.PokemonDexEntry;
import org.openapitools.vertxweb.server.model.PokemonFormDetailFormNamesInner;
import org.openapitools.vertxweb.server.model.PokemonHabitatSummary;
import org.openapitools.vertxweb.server.model.PokemonShapeSummary;
import org.openapitools.vertxweb.server.model.PokemonSpeciesDescription;
import org.openapitools.vertxweb.server.model.PokemonSpeciesDetailGeneraInner;
import org.openapitools.vertxweb.server.model.PokemonSpeciesDetailPalParkEncountersInner;
import org.openapitools.vertxweb.server.model.PokemonSpeciesDetailVarietiesInner;
import org.openapitools.vertxweb.server.model.PokemonSpeciesFlavorText;
import org.openapitools.vertxweb.server.model.PokemonSpeciesSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
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

  public PokemonSpeciesDetail () {

  }

  public PokemonSpeciesDetail (Integer id, String name, Integer order, Integer genderRate, Integer captureRate, Integer baseHappiness, Boolean isBaby, Boolean isLegendary, Boolean isMythical, Integer hatchCounter, Boolean hasGenderDifferences, Boolean formsSwitchable, GrowthRateSummary growthRate, List<PokemonDexEntry> pokedexNumbers, List<AbilityDetailPokemonInnerPokemon> eggGroups, PokemonColorSummary color, PokemonShapeSummary shape, PokemonSpeciesSummary evolvesFromSpecies, EvolutionChainSummary evolutionChain, PokemonHabitatSummary habitat, GenerationSummary generation, List<PokemonFormDetailFormNamesInner> names, List<PokemonSpeciesDetailPalParkEncountersInner> palParkEncounters, List<PokemonSpeciesDescription> formDescriptions, List<PokemonSpeciesFlavorText> flavorTextEntries, List<PokemonSpeciesDetailGeneraInner> genera, List<PokemonSpeciesDetailVarietiesInner> varieties) {
    this.id = id;
    this.name = name;
    this.order = order;
    this.genderRate = genderRate;
    this.captureRate = captureRate;
    this.baseHappiness = baseHappiness;
    this.isBaby = isBaby;
    this.isLegendary = isLegendary;
    this.isMythical = isMythical;
    this.hatchCounter = hatchCounter;
    this.hasGenderDifferences = hasGenderDifferences;
    this.formsSwitchable = formsSwitchable;
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

    
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("order")
  public Integer getOrder() {
    return order;
  }
  public void setOrder(Integer order) {
    this.order = order;
  }

    
  @JsonProperty("gender_rate")
  public Integer getGenderRate() {
    return genderRate;
  }
  public void setGenderRate(Integer genderRate) {
    this.genderRate = genderRate;
  }

    
  @JsonProperty("capture_rate")
  public Integer getCaptureRate() {
    return captureRate;
  }
  public void setCaptureRate(Integer captureRate) {
    this.captureRate = captureRate;
  }

    
  @JsonProperty("base_happiness")
  public Integer getBaseHappiness() {
    return baseHappiness;
  }
  public void setBaseHappiness(Integer baseHappiness) {
    this.baseHappiness = baseHappiness;
  }

    
  @JsonProperty("is_baby")
  public Boolean getIsBaby() {
    return isBaby;
  }
  public void setIsBaby(Boolean isBaby) {
    this.isBaby = isBaby;
  }

    
  @JsonProperty("is_legendary")
  public Boolean getIsLegendary() {
    return isLegendary;
  }
  public void setIsLegendary(Boolean isLegendary) {
    this.isLegendary = isLegendary;
  }

    
  @JsonProperty("is_mythical")
  public Boolean getIsMythical() {
    return isMythical;
  }
  public void setIsMythical(Boolean isMythical) {
    this.isMythical = isMythical;
  }

    
  @JsonProperty("hatch_counter")
  public Integer getHatchCounter() {
    return hatchCounter;
  }
  public void setHatchCounter(Integer hatchCounter) {
    this.hatchCounter = hatchCounter;
  }

    
  @JsonProperty("has_gender_differences")
  public Boolean getHasGenderDifferences() {
    return hasGenderDifferences;
  }
  public void setHasGenderDifferences(Boolean hasGenderDifferences) {
    this.hasGenderDifferences = hasGenderDifferences;
  }

    
  @JsonProperty("forms_switchable")
  public Boolean getFormsSwitchable() {
    return formsSwitchable;
  }
  public void setFormsSwitchable(Boolean formsSwitchable) {
    this.formsSwitchable = formsSwitchable;
  }

    
  @JsonProperty("growth_rate")
  public GrowthRateSummary getGrowthRate() {
    return growthRate;
  }
  public void setGrowthRate(GrowthRateSummary growthRate) {
    this.growthRate = growthRate;
  }

    
  @JsonProperty("pokedex_numbers")
  public List<PokemonDexEntry> getPokedexNumbers() {
    return pokedexNumbers;
  }
  public void setPokedexNumbers(List<PokemonDexEntry> pokedexNumbers) {
    this.pokedexNumbers = pokedexNumbers;
  }

    
  @JsonProperty("egg_groups")
  public List<AbilityDetailPokemonInnerPokemon> getEggGroups() {
    return eggGroups;
  }
  public void setEggGroups(List<AbilityDetailPokemonInnerPokemon> eggGroups) {
    this.eggGroups = eggGroups;
  }

    
  @JsonProperty("color")
  public PokemonColorSummary getColor() {
    return color;
  }
  public void setColor(PokemonColorSummary color) {
    this.color = color;
  }

    
  @JsonProperty("shape")
  public PokemonShapeSummary getShape() {
    return shape;
  }
  public void setShape(PokemonShapeSummary shape) {
    this.shape = shape;
  }

    
  @JsonProperty("evolves_from_species")
  public PokemonSpeciesSummary getEvolvesFromSpecies() {
    return evolvesFromSpecies;
  }
  public void setEvolvesFromSpecies(PokemonSpeciesSummary evolvesFromSpecies) {
    this.evolvesFromSpecies = evolvesFromSpecies;
  }

    
  @JsonProperty("evolution_chain")
  public EvolutionChainSummary getEvolutionChain() {
    return evolutionChain;
  }
  public void setEvolutionChain(EvolutionChainSummary evolutionChain) {
    this.evolutionChain = evolutionChain;
  }

    
  @JsonProperty("habitat")
  public PokemonHabitatSummary getHabitat() {
    return habitat;
  }
  public void setHabitat(PokemonHabitatSummary habitat) {
    this.habitat = habitat;
  }

    
  @JsonProperty("generation")
  public GenerationSummary getGeneration() {
    return generation;
  }
  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

    
  @JsonProperty("names")
  public List<PokemonFormDetailFormNamesInner> getNames() {
    return names;
  }
  public void setNames(List<PokemonFormDetailFormNamesInner> names) {
    this.names = names;
  }

    
  @JsonProperty("pal_park_encounters")
  public List<PokemonSpeciesDetailPalParkEncountersInner> getPalParkEncounters() {
    return palParkEncounters;
  }
  public void setPalParkEncounters(List<PokemonSpeciesDetailPalParkEncountersInner> palParkEncounters) {
    this.palParkEncounters = palParkEncounters;
  }

    
  @JsonProperty("form_descriptions")
  public List<PokemonSpeciesDescription> getFormDescriptions() {
    return formDescriptions;
  }
  public void setFormDescriptions(List<PokemonSpeciesDescription> formDescriptions) {
    this.formDescriptions = formDescriptions;
  }

    
  @JsonProperty("flavor_text_entries")
  public List<PokemonSpeciesFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }
  public void setFlavorTextEntries(List<PokemonSpeciesFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
  }

    
  @JsonProperty("genera")
  public List<PokemonSpeciesDetailGeneraInner> getGenera() {
    return genera;
  }
  public void setGenera(List<PokemonSpeciesDetailGeneraInner> genera) {
    this.genera = genera;
  }

    
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
