package org.openapitools.model;

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
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



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

  private List<@Valid PokemonDexEntry> pokedexNumbers = new ArrayList<>();

  private List<@Valid AbilityDetailPokemonInnerPokemon> eggGroups = new ArrayList<>();

  private PokemonColorSummary color;

  private PokemonShapeSummary shape;

  private PokemonSpeciesSummary evolvesFromSpecies;

  private EvolutionChainSummary evolutionChain;

  private PokemonHabitatSummary habitat;

  private GenerationSummary generation;

  private List<@Valid PokemonFormDetailFormNamesInner> names = new ArrayList<>();

  private List<@Valid PokemonSpeciesDetailPalParkEncountersInner> palParkEncounters = new ArrayList<>();

  private List<@Valid PokemonSpeciesDescription> formDescriptions = new ArrayList<>();

  private List<@Valid PokemonSpeciesFlavorText> flavorTextEntries = new ArrayList<>();

  private List<@Valid PokemonSpeciesDetailGeneraInner> genera = new ArrayList<>();

  private List<@Valid PokemonSpeciesDetailVarietiesInner> varieties = new ArrayList<>();

  /**
   **/
  public PokemonSpeciesDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }


  /**
   **/
  public PokemonSpeciesDetail name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  @NotNull
 @Size(max=100)  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   **/
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
   **/
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
   **/
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
   **/
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
   **/
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
   **/
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
   **/
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
   **/
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
   **/
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
   **/
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
   **/
  public PokemonSpeciesDetail growthRate(GrowthRateSummary growthRate) {
    this.growthRate = growthRate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("growth_rate")
  @NotNull
  public GrowthRateSummary getGrowthRate() {
    return growthRate;
  }
  public void setGrowthRate(GrowthRateSummary growthRate) {
    this.growthRate = growthRate;
  }


  /**
   **/
  public PokemonSpeciesDetail pokedexNumbers(List<@Valid PokemonDexEntry> pokedexNumbers) {
    this.pokedexNumbers = pokedexNumbers;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("pokedex_numbers")
  @NotNull
  public List<@Valid PokemonDexEntry> getPokedexNumbers() {
    return pokedexNumbers;
  }
  public void setPokedexNumbers(List<@Valid PokemonDexEntry> pokedexNumbers) {
    this.pokedexNumbers = pokedexNumbers;
  }

  public PokemonSpeciesDetail addPokedexNumbersItem(PokemonDexEntry pokedexNumbersItem) {
    if (this.pokedexNumbers == null) {
      this.pokedexNumbers = new ArrayList<>();
    }
    this.pokedexNumbers.add(pokedexNumbersItem);
    return this;
  }


  /**
   **/
  public PokemonSpeciesDetail eggGroups(List<@Valid AbilityDetailPokemonInnerPokemon> eggGroups) {
    this.eggGroups = eggGroups;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("egg_groups")
  @NotNull
  public List<@Valid AbilityDetailPokemonInnerPokemon> getEggGroups() {
    return eggGroups;
  }
  public void setEggGroups(List<@Valid AbilityDetailPokemonInnerPokemon> eggGroups) {
    this.eggGroups = eggGroups;
  }

  public PokemonSpeciesDetail addEggGroupsItem(AbilityDetailPokemonInnerPokemon eggGroupsItem) {
    if (this.eggGroups == null) {
      this.eggGroups = new ArrayList<>();
    }
    this.eggGroups.add(eggGroupsItem);
    return this;
  }


  /**
   **/
  public PokemonSpeciesDetail color(PokemonColorSummary color) {
    this.color = color;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("color")
  @NotNull
  public PokemonColorSummary getColor() {
    return color;
  }
  public void setColor(PokemonColorSummary color) {
    this.color = color;
  }


  /**
   **/
  public PokemonSpeciesDetail shape(PokemonShapeSummary shape) {
    this.shape = shape;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("shape")
  @NotNull
  public PokemonShapeSummary getShape() {
    return shape;
  }
  public void setShape(PokemonShapeSummary shape) {
    this.shape = shape;
  }


  /**
   **/
  public PokemonSpeciesDetail evolvesFromSpecies(PokemonSpeciesSummary evolvesFromSpecies) {
    this.evolvesFromSpecies = evolvesFromSpecies;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("evolves_from_species")
  @NotNull
  public PokemonSpeciesSummary getEvolvesFromSpecies() {
    return evolvesFromSpecies;
  }
  public void setEvolvesFromSpecies(PokemonSpeciesSummary evolvesFromSpecies) {
    this.evolvesFromSpecies = evolvesFromSpecies;
  }


  /**
   **/
  public PokemonSpeciesDetail evolutionChain(EvolutionChainSummary evolutionChain) {
    this.evolutionChain = evolutionChain;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("evolution_chain")
  @NotNull
  public EvolutionChainSummary getEvolutionChain() {
    return evolutionChain;
  }
  public void setEvolutionChain(EvolutionChainSummary evolutionChain) {
    this.evolutionChain = evolutionChain;
  }


  /**
   **/
  public PokemonSpeciesDetail habitat(PokemonHabitatSummary habitat) {
    this.habitat = habitat;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("habitat")
  @NotNull
  public PokemonHabitatSummary getHabitat() {
    return habitat;
  }
  public void setHabitat(PokemonHabitatSummary habitat) {
    this.habitat = habitat;
  }


  /**
   **/
  public PokemonSpeciesDetail generation(GenerationSummary generation) {
    this.generation = generation;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("generation")
  @NotNull
  public GenerationSummary getGeneration() {
    return generation;
  }
  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }


  /**
   **/
  public PokemonSpeciesDetail names(List<@Valid PokemonFormDetailFormNamesInner> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("names")
  @NotNull
  public List<@Valid PokemonFormDetailFormNamesInner> getNames() {
    return names;
  }
  public void setNames(List<@Valid PokemonFormDetailFormNamesInner> names) {
    this.names = names;
  }

  public PokemonSpeciesDetail addNamesItem(PokemonFormDetailFormNamesInner namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }


  /**
   **/
  public PokemonSpeciesDetail palParkEncounters(List<@Valid PokemonSpeciesDetailPalParkEncountersInner> palParkEncounters) {
    this.palParkEncounters = palParkEncounters;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("pal_park_encounters")
  @NotNull
  public List<@Valid PokemonSpeciesDetailPalParkEncountersInner> getPalParkEncounters() {
    return palParkEncounters;
  }
  public void setPalParkEncounters(List<@Valid PokemonSpeciesDetailPalParkEncountersInner> palParkEncounters) {
    this.palParkEncounters = palParkEncounters;
  }

  public PokemonSpeciesDetail addPalParkEncountersItem(PokemonSpeciesDetailPalParkEncountersInner palParkEncountersItem) {
    if (this.palParkEncounters == null) {
      this.palParkEncounters = new ArrayList<>();
    }
    this.palParkEncounters.add(palParkEncountersItem);
    return this;
  }


  /**
   **/
  public PokemonSpeciesDetail formDescriptions(List<@Valid PokemonSpeciesDescription> formDescriptions) {
    this.formDescriptions = formDescriptions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("form_descriptions")
  @NotNull
  public List<@Valid PokemonSpeciesDescription> getFormDescriptions() {
    return formDescriptions;
  }
  public void setFormDescriptions(List<@Valid PokemonSpeciesDescription> formDescriptions) {
    this.formDescriptions = formDescriptions;
  }

  public PokemonSpeciesDetail addFormDescriptionsItem(PokemonSpeciesDescription formDescriptionsItem) {
    if (this.formDescriptions == null) {
      this.formDescriptions = new ArrayList<>();
    }
    this.formDescriptions.add(formDescriptionsItem);
    return this;
  }


  /**
   **/
  public PokemonSpeciesDetail flavorTextEntries(List<@Valid PokemonSpeciesFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("flavor_text_entries")
  @NotNull
  public List<@Valid PokemonSpeciesFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }
  public void setFlavorTextEntries(List<@Valid PokemonSpeciesFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
  }

  public PokemonSpeciesDetail addFlavorTextEntriesItem(PokemonSpeciesFlavorText flavorTextEntriesItem) {
    if (this.flavorTextEntries == null) {
      this.flavorTextEntries = new ArrayList<>();
    }
    this.flavorTextEntries.add(flavorTextEntriesItem);
    return this;
  }


  /**
   **/
  public PokemonSpeciesDetail genera(List<@Valid PokemonSpeciesDetailGeneraInner> genera) {
    this.genera = genera;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("genera")
  @NotNull
  public List<@Valid PokemonSpeciesDetailGeneraInner> getGenera() {
    return genera;
  }
  public void setGenera(List<@Valid PokemonSpeciesDetailGeneraInner> genera) {
    this.genera = genera;
  }

  public PokemonSpeciesDetail addGeneraItem(PokemonSpeciesDetailGeneraInner generaItem) {
    if (this.genera == null) {
      this.genera = new ArrayList<>();
    }
    this.genera.add(generaItem);
    return this;
  }


  /**
   **/
  public PokemonSpeciesDetail varieties(List<@Valid PokemonSpeciesDetailVarietiesInner> varieties) {
    this.varieties = varieties;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("varieties")
  @NotNull
  public List<@Valid PokemonSpeciesDetailVarietiesInner> getVarieties() {
    return varieties;
  }
  public void setVarieties(List<@Valid PokemonSpeciesDetailVarietiesInner> varieties) {
    this.varieties = varieties;
  }

  public PokemonSpeciesDetail addVarietiesItem(PokemonSpeciesDetailVarietiesInner varietiesItem) {
    if (this.varieties == null) {
      this.varieties = new ArrayList<>();
    }
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

