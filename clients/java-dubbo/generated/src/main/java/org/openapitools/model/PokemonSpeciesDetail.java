package org.openapitools.model;

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
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class PokemonSpeciesDetail implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The identifier for this resource.
   */
  @JsonProperty("id")
  private Integer id;

  /**
   * The name for this resource.
   */
  @JsonProperty("name")
  private String name;

  /**
   * The order in which species should be sorted. Based on National Dex order, except families are grouped together and sorted by stage.
   */
  @JsonProperty("order")
  private Integer order;

  /**
   * The chance of this Pokémon being female, in eighths; or -1 for genderless.
   */
  @JsonProperty("gender_rate")
  private Integer genderRate;

  /**
   * The base capture rate; up to 255. The higher the number, the easier the catch.
   */
  @JsonProperty("capture_rate")
  private Integer captureRate;

  /**
   * The happiness when caught by a normal Pokéball; up to 255. The higher the number, the happier the Pokémon.
   */
  @JsonProperty("base_happiness")
  private Integer baseHappiness;

  /**
   * Whether or not this is a baby Pokémon.
   */
  @JsonProperty("is_baby")
  private Boolean isBaby;

  /**
   * Whether or not this is a legendary Pokémon.
   */
  @JsonProperty("is_legendary")
  private Boolean isLegendary;

  /**
   * Whether or not this is a mythical Pokémon.
   */
  @JsonProperty("is_mythical")
  private Boolean isMythical;

  /**
   * Initial hatch counter: one must walk Y × (hatch_counter + 1) steps before this Pokémon&#39;s egg hatches, unless utilizing bonuses like Flame Body&#39;s. Y varies per generation. In Generations II, III, and VII, Egg cycles are 256 steps long. In Generation IV, Egg cycles are 255 steps long. In Pokémon Brilliant Diamond and Shining Pearl, Egg cycles are also 255 steps long, but are shorter on special dates. In Generations V and VI, Egg cycles are 257 steps long. In Pokémon Sword and Shield, and in Pokémon Scarlet and Violet, Egg cycles are 128 steps long.
   */
  @JsonProperty("hatch_counter")
  private Integer hatchCounter;

  /**
   * Whether or not this Pokémon has visual gender differences.
   */
  @JsonProperty("has_gender_differences")
  private Boolean hasGenderDifferences;

  /**
   * Whether or not this Pokémon has multiple forms and can switch between them.
   */
  @JsonProperty("forms_switchable")
  private Boolean formsSwitchable;

  /**
   * The rate at which this Pokémon species gains levels.
   */
  @JsonProperty("growth_rate")
  private GrowthRateSummary growthRate;

  /**
   * A list of Pokedexes and the indexes reserved within them for this Pokémon species.
   */
  @JsonProperty("pokedex_numbers")
  private List<PokemonDexEntry> pokedexNumbers = new ArrayList<>();

  /**
   * A list of egg groups this Pokémon species is a member of.
   */
  @JsonProperty("egg_groups")
  private List<EggGroupSummary> eggGroups = new ArrayList<>();

  /**
   * The color of this Pokémon for Pokédex search.
   */
  @JsonProperty("color")
  private PokemonColorSummary color;

  /**
   * The shape of this Pokémon for Pokédex search.
   */
  @JsonProperty("shape")
  private PokemonShapeSummary shape;

  /**
   * The Pokémon species that evolves into this Pokemon_species.
   */
  @JsonProperty("evolves_from_species")
  private PokemonSpeciesSummary evolvesFromSpecies;

  /**
   * The evolution chain this Pokémon species is a member of.
   */
  @JsonProperty("evolution_chain")
  private EvolutionChainSummary evolutionChain;

  /**
   * The habitat this Pokémon species can be encountered in.
   */
  @JsonProperty("habitat")
  private PokemonHabitatSummary habitat;

  /**
   * The generation this Pokémon species was introduced in.
   */
  @JsonProperty("generation")
  private GenerationSummary generation;

  /**
   * The name of this resource listed in different languages.
   */
  @JsonProperty("names")
  private List<PokemonSpeciesName> names = new ArrayList<>();

  /**
   * A list of encounters that can be had with this Pokémon species in pal park.
   */
  @JsonProperty("pal_park_encounters")
  private List<PokemonSpeciesPalParkEncounter> palParkEncounters = new ArrayList<>();

  /**
   * Descriptions of different forms Pokémon take on within the Pokémon species.
   */
  @JsonProperty("form_descriptions")
  private List<PokemonSpeciesDescription> formDescriptions = new ArrayList<>();

  /**
   * A list of flavor text entries for this Pokémon species.
   */
  @JsonProperty("flavor_text_entries")
  private List<PokemonSpeciesFlavorText> flavorTextEntries = new ArrayList<>();

  /**
   * The genus of this Pokémon species listed in multiple languages.
   */
  @JsonProperty("genera")
  private List<PokemonSpeciesGenus> genera = new ArrayList<>();

  /**
   * A list of the Pokémon that exist within this Pokémon species.
   */
  @JsonProperty("varieties")
  private List<PokemonSpeciesVariety> varieties = new ArrayList<>();

  /**
   * The identifier for this resource.
   * @return id
   */
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The name for this resource.
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The order in which species should be sorted. Based on National Dex order, except families are grouped together and sorted by stage.
   * @return order
   */
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  /**
   * The chance of this Pokémon being female, in eighths; or -1 for genderless.
   * @return genderRate
   */
  public Integer getGenderRate() {
    return genderRate;
  }

  public void setGenderRate(Integer genderRate) {
    this.genderRate = genderRate;
  }

  /**
   * The base capture rate; up to 255. The higher the number, the easier the catch.
   * @return captureRate
   */
  public Integer getCaptureRate() {
    return captureRate;
  }

  public void setCaptureRate(Integer captureRate) {
    this.captureRate = captureRate;
  }

  /**
   * The happiness when caught by a normal Pokéball; up to 255. The higher the number, the happier the Pokémon.
   * @return baseHappiness
   */
  public Integer getBaseHappiness() {
    return baseHappiness;
  }

  public void setBaseHappiness(Integer baseHappiness) {
    this.baseHappiness = baseHappiness;
  }

  /**
   * Whether or not this is a baby Pokémon.
   * @return isBaby
   */
  public Boolean getIsBaby() {
    return isBaby;
  }

  public void setIsBaby(Boolean isBaby) {
    this.isBaby = isBaby;
  }

  /**
   * Whether or not this is a legendary Pokémon.
   * @return isLegendary
   */
  public Boolean getIsLegendary() {
    return isLegendary;
  }

  public void setIsLegendary(Boolean isLegendary) {
    this.isLegendary = isLegendary;
  }

  /**
   * Whether or not this is a mythical Pokémon.
   * @return isMythical
   */
  public Boolean getIsMythical() {
    return isMythical;
  }

  public void setIsMythical(Boolean isMythical) {
    this.isMythical = isMythical;
  }

  /**
   * Initial hatch counter: one must walk Y × (hatch_counter + 1) steps before this Pokémon&#39;s egg hatches, unless utilizing bonuses like Flame Body&#39;s. Y varies per generation. In Generations II, III, and VII, Egg cycles are 256 steps long. In Generation IV, Egg cycles are 255 steps long. In Pokémon Brilliant Diamond and Shining Pearl, Egg cycles are also 255 steps long, but are shorter on special dates. In Generations V and VI, Egg cycles are 257 steps long. In Pokémon Sword and Shield, and in Pokémon Scarlet and Violet, Egg cycles are 128 steps long.
   * @return hatchCounter
   */
  public Integer getHatchCounter() {
    return hatchCounter;
  }

  public void setHatchCounter(Integer hatchCounter) {
    this.hatchCounter = hatchCounter;
  }

  /**
   * Whether or not this Pokémon has visual gender differences.
   * @return hasGenderDifferences
   */
  public Boolean getHasGenderDifferences() {
    return hasGenderDifferences;
  }

  public void setHasGenderDifferences(Boolean hasGenderDifferences) {
    this.hasGenderDifferences = hasGenderDifferences;
  }

  /**
   * Whether or not this Pokémon has multiple forms and can switch between them.
   * @return formsSwitchable
   */
  public Boolean getFormsSwitchable() {
    return formsSwitchable;
  }

  public void setFormsSwitchable(Boolean formsSwitchable) {
    this.formsSwitchable = formsSwitchable;
  }

  /**
   * The rate at which this Pokémon species gains levels.
   * @return growthRate
   */
  public GrowthRateSummary getGrowthRate() {
    return growthRate;
  }

  public void setGrowthRate(GrowthRateSummary growthRate) {
    this.growthRate = growthRate;
  }

  /**
   * A list of Pokedexes and the indexes reserved within them for this Pokémon species.
   * @return pokedexNumbers
   */
  public List<PokemonDexEntry> getPokedexNumbers() {
    return pokedexNumbers;
  }

  public void setPokedexNumbers(List<PokemonDexEntry> pokedexNumbers) {
    this.pokedexNumbers = pokedexNumbers;
  }

  /**
   * A list of egg groups this Pokémon species is a member of.
   * @return eggGroups
   */
  public List<EggGroupSummary> getEggGroups() {
    return eggGroups;
  }

  public void setEggGroups(List<EggGroupSummary> eggGroups) {
    this.eggGroups = eggGroups;
  }

  /**
   * The color of this Pokémon for Pokédex search.
   * @return color
   */
  public PokemonColorSummary getColor() {
    return color;
  }

  public void setColor(PokemonColorSummary color) {
    this.color = color;
  }

  /**
   * The shape of this Pokémon for Pokédex search.
   * @return shape
   */
  public PokemonShapeSummary getShape() {
    return shape;
  }

  public void setShape(PokemonShapeSummary shape) {
    this.shape = shape;
  }

  /**
   * The Pokémon species that evolves into this Pokemon_species.
   * @return evolvesFromSpecies
   */
  public PokemonSpeciesSummary getEvolvesFromSpecies() {
    return evolvesFromSpecies;
  }

  public void setEvolvesFromSpecies(PokemonSpeciesSummary evolvesFromSpecies) {
    this.evolvesFromSpecies = evolvesFromSpecies;
  }

  /**
   * The evolution chain this Pokémon species is a member of.
   * @return evolutionChain
   */
  public EvolutionChainSummary getEvolutionChain() {
    return evolutionChain;
  }

  public void setEvolutionChain(EvolutionChainSummary evolutionChain) {
    this.evolutionChain = evolutionChain;
  }

  /**
   * The habitat this Pokémon species can be encountered in.
   * @return habitat
   */
  public PokemonHabitatSummary getHabitat() {
    return habitat;
  }

  public void setHabitat(PokemonHabitatSummary habitat) {
    this.habitat = habitat;
  }

  /**
   * The generation this Pokémon species was introduced in.
   * @return generation
   */
  public GenerationSummary getGeneration() {
    return generation;
  }

  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

  /**
   * The name of this resource listed in different languages.
   * @return names
   */
  public List<PokemonSpeciesName> getNames() {
    return names;
  }

  public void setNames(List<PokemonSpeciesName> names) {
    this.names = names;
  }

  /**
   * A list of encounters that can be had with this Pokémon species in pal park.
   * @return palParkEncounters
   */
  public List<PokemonSpeciesPalParkEncounter> getPalParkEncounters() {
    return palParkEncounters;
  }

  public void setPalParkEncounters(List<PokemonSpeciesPalParkEncounter> palParkEncounters) {
    this.palParkEncounters = palParkEncounters;
  }

  /**
   * Descriptions of different forms Pokémon take on within the Pokémon species.
   * @return formDescriptions
   */
  public List<PokemonSpeciesDescription> getFormDescriptions() {
    return formDescriptions;
  }

  public void setFormDescriptions(List<PokemonSpeciesDescription> formDescriptions) {
    this.formDescriptions = formDescriptions;
  }

  /**
   * A list of flavor text entries for this Pokémon species.
   * @return flavorTextEntries
   */
  public List<PokemonSpeciesFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }

  public void setFlavorTextEntries(List<PokemonSpeciesFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
  }

  /**
   * The genus of this Pokémon species listed in multiple languages.
   * @return genera
   */
  public List<PokemonSpeciesGenus> getGenera() {
    return genera;
  }

  public void setGenera(List<PokemonSpeciesGenus> genera) {
    this.genera = genera;
  }

  /**
   * A list of the Pokémon that exist within this Pokémon species.
   * @return varieties
   */
  public List<PokemonSpeciesVariety> getVarieties() {
    return varieties;
  }

  public void setVarieties(List<PokemonSpeciesVariety> varieties) {
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
