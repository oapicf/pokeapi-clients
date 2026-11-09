package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.EggGroupSummary;
import org.openapitools.model.EvolutionChainSummary;
import org.openapitools.model.GenerationSummary;
import org.openapitools.model.GrowthRateSummary;
import org.openapitools.model.PokemonColorSummary;
import org.openapitools.model.PokemonDexEntry;
import org.openapitools.model.PokemonHabitatSummary;
import org.openapitools.model.PokemonShapeSummary;
import org.openapitools.model.PokemonSpeciesDescription;
import org.openapitools.model.PokemonSpeciesFlavorText;
import org.openapitools.model.PokemonSpeciesGenus;
import org.openapitools.model.PokemonSpeciesName;
import org.openapitools.model.PokemonSpeciesPalParkEncounter;
import org.openapitools.model.PokemonSpeciesSummary;
import org.openapitools.model.PokemonSpeciesVariety;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PokemonSpeciesDetail
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-09T13:53:47.069318184Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonSpeciesDetail {

  private Integer id;

  private String name;

  private JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> order = JsonNullable.<Integer>undefined();

  private JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> genderRate = JsonNullable.<Integer>undefined();

  private JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> captureRate = JsonNullable.<Integer>undefined();

  private JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> baseHappiness = JsonNullable.<Integer>undefined();

  private @Nullable Boolean isBaby;

  private @Nullable Boolean isLegendary;

  private @Nullable Boolean isMythical;

  private JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> hatchCounter = JsonNullable.<Integer>undefined();

  private @Nullable Boolean hasGenderDifferences;

  private @Nullable Boolean formsSwitchable;

  private GrowthRateSummary growthRate;

  private List<@Valid PokemonDexEntry> pokedexNumbers = new ArrayList<>();

  private List<@Valid EggGroupSummary> eggGroups = new ArrayList<>();

  private PokemonColorSummary color;

  private PokemonShapeSummary shape;

  private JsonNullable<PokemonSpeciesSummary> evolvesFromSpecies = JsonNullable.<PokemonSpeciesSummary>undefined();

  private EvolutionChainSummary evolutionChain;

  private JsonNullable<PokemonHabitatSummary> habitat = JsonNullable.<PokemonHabitatSummary>undefined();

  private GenerationSummary generation;

  private List<@Valid PokemonSpeciesName> names = new ArrayList<>();

  private List<@Valid PokemonSpeciesPalParkEncounter> palParkEncounters = new ArrayList<>();

  private List<@Valid PokemonSpeciesDescription> formDescriptions = new ArrayList<>();

  private List<@Valid PokemonSpeciesFlavorText> flavorTextEntries = new ArrayList<>();

  private List<@Valid PokemonSpeciesGenus> genera = new ArrayList<>();

  private List<@Valid PokemonSpeciesVariety> varieties = new ArrayList<>();

  public PokemonSpeciesDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PokemonSpeciesDetail(Integer id, String name, GrowthRateSummary growthRate, List<@Valid PokemonDexEntry> pokedexNumbers, List<@Valid EggGroupSummary> eggGroups, PokemonColorSummary color, PokemonShapeSummary shape, PokemonSpeciesSummary evolvesFromSpecies, EvolutionChainSummary evolutionChain, PokemonHabitatSummary habitat, GenerationSummary generation, List<@Valid PokemonSpeciesName> names, List<@Valid PokemonSpeciesPalParkEncounter> palParkEncounters, List<@Valid PokemonSpeciesDescription> formDescriptions, List<@Valid PokemonSpeciesFlavorText> flavorTextEntries, List<@Valid PokemonSpeciesGenus> genera, List<@Valid PokemonSpeciesVariety> varieties) {
    this.id = id;
    this.name = name;
    this.growthRate = growthRate;
    this.pokedexNumbers = pokedexNumbers;
    this.eggGroups = eggGroups;
    this.color = color;
    this.shape = shape;
    this.evolvesFromSpecies = JsonNullable.of(evolvesFromSpecies);
    this.evolutionChain = evolutionChain;
    this.habitat = JsonNullable.of(habitat);
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
   * The identifier for this resource.
   * @return id
   */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The identifier for this resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(Integer id) {
    this.id = id;
  }

  public PokemonSpeciesDetail name(String name) {
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

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  public PokemonSpeciesDetail order(Integer order) {
    this.order = JsonNullable.of(order);
    return this;
  }

  /**
   * The order in which species should be sorted. Based on National Dex order, except families are grouped together and sorted by stage.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return order
   */
  @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "order", description = "The order in which species should be sorted. Based on National Dex order, except families are grouped together and sorted by stage.", requiredMode = Schema.RequiredMode.NOT_REQUIRED, nullable = true)
  @JsonProperty("order")
  public JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> getOrder() {
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
   * The chance of this Pokémon being female, in eighths; or -1 for genderless.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return genderRate
   */
  @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "gender_rate", description = "The chance of this Pokémon being female, in eighths; or -1 for genderless.", requiredMode = Schema.RequiredMode.NOT_REQUIRED, nullable = true)
  @JsonProperty("gender_rate")
  public JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> getGenderRate() {
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
   * The base capture rate; up to 255. The higher the number, the easier the catch.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return captureRate
   */
  @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "capture_rate", description = "The base capture rate; up to 255. The higher the number, the easier the catch.", requiredMode = Schema.RequiredMode.NOT_REQUIRED, nullable = true)
  @JsonProperty("capture_rate")
  public JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> getCaptureRate() {
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
   * The happiness when caught by a normal Pokéball; up to 255. The higher the number, the happier the Pokémon.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return baseHappiness
   */
  @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "base_happiness", description = "The happiness when caught by a normal Pokéball; up to 255. The higher the number, the happier the Pokémon.", requiredMode = Schema.RequiredMode.NOT_REQUIRED, nullable = true)
  @JsonProperty("base_happiness")
  public JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> getBaseHappiness() {
    return baseHappiness;
  }

  public void setBaseHappiness(JsonNullable<Integer> baseHappiness) {
    this.baseHappiness = baseHappiness;
  }

  public PokemonSpeciesDetail isBaby(@Nullable Boolean isBaby) {
    this.isBaby = isBaby;
    return this;
  }

  /**
   * Whether or not this is a baby Pokémon.
   * @return isBaby
   */
  
  @Schema(name = "is_baby", description = "Whether or not this is a baby Pokémon.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_baby")
  public @Nullable Boolean getIsBaby() {
    return isBaby;
  }

  @JsonProperty("is_baby")
  public void setIsBaby(@Nullable Boolean isBaby) {
    this.isBaby = isBaby;
  }

  public PokemonSpeciesDetail isLegendary(@Nullable Boolean isLegendary) {
    this.isLegendary = isLegendary;
    return this;
  }

  /**
   * Whether or not this is a legendary Pokémon.
   * @return isLegendary
   */
  
  @Schema(name = "is_legendary", description = "Whether or not this is a legendary Pokémon.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_legendary")
  public @Nullable Boolean getIsLegendary() {
    return isLegendary;
  }

  @JsonProperty("is_legendary")
  public void setIsLegendary(@Nullable Boolean isLegendary) {
    this.isLegendary = isLegendary;
  }

  public PokemonSpeciesDetail isMythical(@Nullable Boolean isMythical) {
    this.isMythical = isMythical;
    return this;
  }

  /**
   * Whether or not this is a mythical Pokémon.
   * @return isMythical
   */
  
  @Schema(name = "is_mythical", description = "Whether or not this is a mythical Pokémon.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_mythical")
  public @Nullable Boolean getIsMythical() {
    return isMythical;
  }

  @JsonProperty("is_mythical")
  public void setIsMythical(@Nullable Boolean isMythical) {
    this.isMythical = isMythical;
  }

  public PokemonSpeciesDetail hatchCounter(Integer hatchCounter) {
    this.hatchCounter = JsonNullable.of(hatchCounter);
    return this;
  }

  /**
   * Initial hatch counter: one must walk Y × (hatch_counter + 1) steps before this Pokémon's egg hatches, unless utilizing bonuses like Flame Body's. Y varies per generation. In Generations II, III, and VII, Egg cycles are 256 steps long. In Generation IV, Egg cycles are 255 steps long. In Pokémon Brilliant Diamond and Shining Pearl, Egg cycles are also 255 steps long, but are shorter on special dates. In Generations V and VI, Egg cycles are 257 steps long. In Pokémon Sword and Shield, and in Pokémon Scarlet and Violet, Egg cycles are 128 steps long.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return hatchCounter
   */
  @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "hatch_counter", description = "Initial hatch counter: one must walk Y × (hatch_counter + 1) steps before this Pokémon's egg hatches, unless utilizing bonuses like Flame Body's. Y varies per generation. In Generations II, III, and VII, Egg cycles are 256 steps long. In Generation IV, Egg cycles are 255 steps long. In Pokémon Brilliant Diamond and Shining Pearl, Egg cycles are also 255 steps long, but are shorter on special dates. In Generations V and VI, Egg cycles are 257 steps long. In Pokémon Sword and Shield, and in Pokémon Scarlet and Violet, Egg cycles are 128 steps long.", requiredMode = Schema.RequiredMode.NOT_REQUIRED, nullable = true)
  @JsonProperty("hatch_counter")
  public JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> getHatchCounter() {
    return hatchCounter;
  }

  public void setHatchCounter(JsonNullable<Integer> hatchCounter) {
    this.hatchCounter = hatchCounter;
  }

  public PokemonSpeciesDetail hasGenderDifferences(@Nullable Boolean hasGenderDifferences) {
    this.hasGenderDifferences = hasGenderDifferences;
    return this;
  }

  /**
   * Whether or not this Pokémon has visual gender differences.
   * @return hasGenderDifferences
   */
  
  @Schema(name = "has_gender_differences", description = "Whether or not this Pokémon has visual gender differences.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("has_gender_differences")
  public @Nullable Boolean getHasGenderDifferences() {
    return hasGenderDifferences;
  }

  @JsonProperty("has_gender_differences")
  public void setHasGenderDifferences(@Nullable Boolean hasGenderDifferences) {
    this.hasGenderDifferences = hasGenderDifferences;
  }

  public PokemonSpeciesDetail formsSwitchable(@Nullable Boolean formsSwitchable) {
    this.formsSwitchable = formsSwitchable;
    return this;
  }

  /**
   * Whether or not this Pokémon has multiple forms and can switch between them.
   * @return formsSwitchable
   */
  
  @Schema(name = "forms_switchable", description = "Whether or not this Pokémon has multiple forms and can switch between them.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("forms_switchable")
  public @Nullable Boolean getFormsSwitchable() {
    return formsSwitchable;
  }

  @JsonProperty("forms_switchable")
  public void setFormsSwitchable(@Nullable Boolean formsSwitchable) {
    this.formsSwitchable = formsSwitchable;
  }

  public PokemonSpeciesDetail growthRate(GrowthRateSummary growthRate) {
    this.growthRate = growthRate;
    return this;
  }

  /**
   * The rate at which this Pokémon species gains levels.
   * @return growthRate
   */
  @NotNull @Valid 
  @Schema(name = "growth_rate", description = "The rate at which this Pokémon species gains levels.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("growth_rate")
  public GrowthRateSummary getGrowthRate() {
    return growthRate;
  }

  @JsonProperty("growth_rate")
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
   * A list of Pokedexes and the indexes reserved within them for this Pokémon species.
   * @return pokedexNumbers
   */
  
  @Schema(name = "pokedex_numbers", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of Pokedexes and the indexes reserved within them for this Pokémon species.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pokedex_numbers")
  public List<@Valid PokemonDexEntry> getPokedexNumbers() {
    return pokedexNumbers;
  }

  @JsonProperty("pokedex_numbers")
  public void setPokedexNumbers(List<@Valid PokemonDexEntry> pokedexNumbers) {
    this.pokedexNumbers = pokedexNumbers;
  }

  public PokemonSpeciesDetail eggGroups(List<@Valid EggGroupSummary> eggGroups) {
    this.eggGroups = eggGroups;
    return this;
  }

  public PokemonSpeciesDetail addEggGroupsItem(EggGroupSummary eggGroupsItem) {
    if (this.eggGroups == null) {
      this.eggGroups = new ArrayList<>();
    }
    this.eggGroups.add(eggGroupsItem);
    return this;
  }

  /**
   * A list of egg groups this Pokémon species is a member of.
   * @return eggGroups
   */
  
  @Schema(name = "egg_groups", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of egg groups this Pokémon species is a member of.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("egg_groups")
  public List<@Valid EggGroupSummary> getEggGroups() {
    return eggGroups;
  }

  @JsonProperty("egg_groups")
  public void setEggGroups(List<@Valid EggGroupSummary> eggGroups) {
    this.eggGroups = eggGroups;
  }

  public PokemonSpeciesDetail color(PokemonColorSummary color) {
    this.color = color;
    return this;
  }

  /**
   * The color of this Pokémon for Pokédex search.
   * @return color
   */
  @NotNull @Valid 
  @Schema(name = "color", description = "The color of this Pokémon for Pokédex search.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("color")
  public PokemonColorSummary getColor() {
    return color;
  }

  @JsonProperty("color")
  public void setColor(PokemonColorSummary color) {
    this.color = color;
  }

  public PokemonSpeciesDetail shape(PokemonShapeSummary shape) {
    this.shape = shape;
    return this;
  }

  /**
   * The shape of this Pokémon for Pokédex search.
   * @return shape
   */
  @NotNull @Valid 
  @Schema(name = "shape", description = "The shape of this Pokémon for Pokédex search.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("shape")
  public PokemonShapeSummary getShape() {
    return shape;
  }

  @JsonProperty("shape")
  public void setShape(PokemonShapeSummary shape) {
    this.shape = shape;
  }

  public PokemonSpeciesDetail evolvesFromSpecies(PokemonSpeciesSummary evolvesFromSpecies) {
    this.evolvesFromSpecies = JsonNullable.of(evolvesFromSpecies);
    return this;
  }

  /**
   * The Pokémon species that evolves into this Pokemon_species.
   * @return evolvesFromSpecies
   */
  /* @Present */ @Valid 
  @Schema(name = "evolves_from_species", description = "The Pokémon species that evolves into this Pokemon_species.", requiredMode = Schema.RequiredMode.REQUIRED, nullable = true)
  @JsonProperty("evolves_from_species")
  public JsonNullable<PokemonSpeciesSummary> getEvolvesFromSpecies() {
    return evolvesFromSpecies;
  }

  @JsonProperty("evolves_from_species")
  public void setEvolvesFromSpecies(JsonNullable<PokemonSpeciesSummary> evolvesFromSpecies) {
    this.evolvesFromSpecies = evolvesFromSpecies;
  }

  public PokemonSpeciesDetail evolutionChain(EvolutionChainSummary evolutionChain) {
    this.evolutionChain = evolutionChain;
    return this;
  }

  /**
   * The evolution chain this Pokémon species is a member of.
   * @return evolutionChain
   */
  @NotNull @Valid 
  @Schema(name = "evolution_chain", description = "The evolution chain this Pokémon species is a member of.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("evolution_chain")
  public EvolutionChainSummary getEvolutionChain() {
    return evolutionChain;
  }

  @JsonProperty("evolution_chain")
  public void setEvolutionChain(EvolutionChainSummary evolutionChain) {
    this.evolutionChain = evolutionChain;
  }

  public PokemonSpeciesDetail habitat(PokemonHabitatSummary habitat) {
    this.habitat = JsonNullable.of(habitat);
    return this;
  }

  /**
   * The habitat this Pokémon species can be encountered in.
   * @return habitat
   */
  /* @Present */ @Valid 
  @Schema(name = "habitat", description = "The habitat this Pokémon species can be encountered in.", requiredMode = Schema.RequiredMode.REQUIRED, nullable = true)
  @JsonProperty("habitat")
  public JsonNullable<PokemonHabitatSummary> getHabitat() {
    return habitat;
  }

  @JsonProperty("habitat")
  public void setHabitat(JsonNullable<PokemonHabitatSummary> habitat) {
    this.habitat = habitat;
  }

  public PokemonSpeciesDetail generation(GenerationSummary generation) {
    this.generation = generation;
    return this;
  }

  /**
   * The generation this Pokémon species was introduced in.
   * @return generation
   */
  @NotNull @Valid 
  @Schema(name = "generation", description = "The generation this Pokémon species was introduced in.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("generation")
  public GenerationSummary getGeneration() {
    return generation;
  }

  @JsonProperty("generation")
  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

  public PokemonSpeciesDetail names(List<@Valid PokemonSpeciesName> names) {
    this.names = names;
    return this;
  }

  public PokemonSpeciesDetail addNamesItem(PokemonSpeciesName namesItem) {
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
  public List<@Valid PokemonSpeciesName> getNames() {
    return names;
  }

  @JsonProperty("names")
  public void setNames(List<@Valid PokemonSpeciesName> names) {
    this.names = names;
  }

  public PokemonSpeciesDetail palParkEncounters(List<@Valid PokemonSpeciesPalParkEncounter> palParkEncounters) {
    this.palParkEncounters = palParkEncounters;
    return this;
  }

  public PokemonSpeciesDetail addPalParkEncountersItem(PokemonSpeciesPalParkEncounter palParkEncountersItem) {
    if (this.palParkEncounters == null) {
      this.palParkEncounters = new ArrayList<>();
    }
    this.palParkEncounters.add(palParkEncountersItem);
    return this;
  }

  /**
   * A list of encounters that can be had with this Pokémon species in pal park.
   * @return palParkEncounters
   */
  
  @Schema(name = "pal_park_encounters", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of encounters that can be had with this Pokémon species in pal park.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pal_park_encounters")
  public List<@Valid PokemonSpeciesPalParkEncounter> getPalParkEncounters() {
    return palParkEncounters;
  }

  @JsonProperty("pal_park_encounters")
  public void setPalParkEncounters(List<@Valid PokemonSpeciesPalParkEncounter> palParkEncounters) {
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
   * Descriptions of different forms Pokémon take on within the Pokémon species.
   * @return formDescriptions
   */
  
  @Schema(name = "form_descriptions", accessMode = Schema.AccessMode.READ_ONLY, description = "Descriptions of different forms Pokémon take on within the Pokémon species.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("form_descriptions")
  public List<@Valid PokemonSpeciesDescription> getFormDescriptions() {
    return formDescriptions;
  }

  @JsonProperty("form_descriptions")
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
   * A list of flavor text entries for this Pokémon species.
   * @return flavorTextEntries
   */
  
  @Schema(name = "flavor_text_entries", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of flavor text entries for this Pokémon species.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("flavor_text_entries")
  public List<@Valid PokemonSpeciesFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }

  @JsonProperty("flavor_text_entries")
  public void setFlavorTextEntries(List<@Valid PokemonSpeciesFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
  }

  public PokemonSpeciesDetail genera(List<@Valid PokemonSpeciesGenus> genera) {
    this.genera = genera;
    return this;
  }

  public PokemonSpeciesDetail addGeneraItem(PokemonSpeciesGenus generaItem) {
    if (this.genera == null) {
      this.genera = new ArrayList<>();
    }
    this.genera.add(generaItem);
    return this;
  }

  /**
   * The genus of this Pokémon species listed in multiple languages.
   * @return genera
   */
  
  @Schema(name = "genera", accessMode = Schema.AccessMode.READ_ONLY, description = "The genus of this Pokémon species listed in multiple languages.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("genera")
  public List<@Valid PokemonSpeciesGenus> getGenera() {
    return genera;
  }

  @JsonProperty("genera")
  public void setGenera(List<@Valid PokemonSpeciesGenus> genera) {
    this.genera = genera;
  }

  public PokemonSpeciesDetail varieties(List<@Valid PokemonSpeciesVariety> varieties) {
    this.varieties = varieties;
    return this;
  }

  public PokemonSpeciesDetail addVarietiesItem(PokemonSpeciesVariety varietiesItem) {
    if (this.varieties == null) {
      this.varieties = new ArrayList<>();
    }
    this.varieties.add(varietiesItem);
    return this;
  }

  /**
   * A list of the Pokémon that exist within this Pokémon species.
   * @return varieties
   */
  
  @Schema(name = "varieties", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of the Pokémon that exist within this Pokémon species.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("varieties")
  public List<@Valid PokemonSpeciesVariety> getVarieties() {
    return varieties;
  }

  @JsonProperty("varieties")
  public void setVarieties(List<@Valid PokemonSpeciesVariety> varieties) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

