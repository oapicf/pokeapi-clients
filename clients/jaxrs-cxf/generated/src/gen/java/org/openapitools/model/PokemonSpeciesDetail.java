package org.openapitools.model;

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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonSpeciesDetail  {
  
 /**
  * The identifier for this resource.
  */
  @ApiModelProperty(required = true, value = "The identifier for this resource.")

  private Integer id;

 /**
  * The name for this resource.
  */
  @ApiModelProperty(required = true, value = "The name for this resource.")

  private String name;

 /**
  * The order in which species should be sorted. Based on National Dex order, except families are grouped together and sorted by stage.
  */
  @ApiModelProperty(value = "The order in which species should be sorted. Based on National Dex order, except families are grouped together and sorted by stage.")

  private Integer order;

 /**
  * The chance of this Pokémon being female, in eighths; or -1 for genderless.
  */
  @ApiModelProperty(value = "The chance of this Pokémon being female, in eighths; or -1 for genderless.")

  private Integer genderRate;

 /**
  * The base capture rate; up to 255. The higher the number, the easier the catch.
  */
  @ApiModelProperty(value = "The base capture rate; up to 255. The higher the number, the easier the catch.")

  private Integer captureRate;

 /**
  * The happiness when caught by a normal Pokéball; up to 255. The higher the number, the happier the Pokémon.
  */
  @ApiModelProperty(value = "The happiness when caught by a normal Pokéball; up to 255. The higher the number, the happier the Pokémon.")

  private Integer baseHappiness;

 /**
  * Whether or not this is a baby Pokémon.
  */
  @ApiModelProperty(value = "Whether or not this is a baby Pokémon.")

  private Boolean isBaby;

 /**
  * Whether or not this is a legendary Pokémon.
  */
  @ApiModelProperty(value = "Whether or not this is a legendary Pokémon.")

  private Boolean isLegendary;

 /**
  * Whether or not this is a mythical Pokémon.
  */
  @ApiModelProperty(value = "Whether or not this is a mythical Pokémon.")

  private Boolean isMythical;

 /**
  * Initial hatch counter: one must walk Y × (hatch_counter + 1) steps before this Pokémon's egg hatches, unless utilizing bonuses like Flame Body's. Y varies per generation. In Generations II, III, and VII, Egg cycles are 256 steps long. In Generation IV, Egg cycles are 255 steps long. In Pokémon Brilliant Diamond and Shining Pearl, Egg cycles are also 255 steps long, but are shorter on special dates. In Generations V and VI, Egg cycles are 257 steps long. In Pokémon Sword and Shield, and in Pokémon Scarlet and Violet, Egg cycles are 128 steps long.
  */
  @ApiModelProperty(value = "Initial hatch counter: one must walk Y × (hatch_counter + 1) steps before this Pokémon's egg hatches, unless utilizing bonuses like Flame Body's. Y varies per generation. In Generations II, III, and VII, Egg cycles are 256 steps long. In Generation IV, Egg cycles are 255 steps long. In Pokémon Brilliant Diamond and Shining Pearl, Egg cycles are also 255 steps long, but are shorter on special dates. In Generations V and VI, Egg cycles are 257 steps long. In Pokémon Sword and Shield, and in Pokémon Scarlet and Violet, Egg cycles are 128 steps long.")

  private Integer hatchCounter;

 /**
  * Whether or not this Pokémon has visual gender differences.
  */
  @ApiModelProperty(value = "Whether or not this Pokémon has visual gender differences.")

  private Boolean hasGenderDifferences;

 /**
  * Whether or not this Pokémon has multiple forms and can switch between them.
  */
  @ApiModelProperty(value = "Whether or not this Pokémon has multiple forms and can switch between them.")

  private Boolean formsSwitchable;

 /**
  * The rate at which this Pokémon species gains levels.
  */
  @ApiModelProperty(required = true, value = "The rate at which this Pokémon species gains levels.")

  @Valid

  private GrowthRateSummary growthRate;

 /**
  * A list of Pokedexes and the indexes reserved within them for this Pokémon species.
  */
  @ApiModelProperty(required = true, value = "A list of Pokedexes and the indexes reserved within them for this Pokémon species.")

  private List<@Valid PokemonDexEntry> pokedexNumbers = new ArrayList<>();

 /**
  * A list of egg groups this Pokémon species is a member of.
  */
  @ApiModelProperty(required = true, value = "A list of egg groups this Pokémon species is a member of.")

  private List<@Valid EggGroupSummary> eggGroups = new ArrayList<>();

 /**
  * The color of this Pokémon for Pokédex search.
  */
  @ApiModelProperty(required = true, value = "The color of this Pokémon for Pokédex search.")

  @Valid

  private PokemonColorSummary color;

 /**
  * The shape of this Pokémon for Pokédex search.
  */
  @ApiModelProperty(required = true, value = "The shape of this Pokémon for Pokédex search.")

  @Valid

  private PokemonShapeSummary shape;

 /**
  * The Pokémon species that evolves into this Pokemon_species.
  */
  @ApiModelProperty(required = true, value = "The Pokémon species that evolves into this Pokemon_species.")

  @Valid

  private PokemonSpeciesSummary evolvesFromSpecies;

 /**
  * The evolution chain this Pokémon species is a member of.
  */
  @ApiModelProperty(required = true, value = "The evolution chain this Pokémon species is a member of.")

  @Valid

  private EvolutionChainSummary evolutionChain;

 /**
  * The habitat this Pokémon species can be encountered in.
  */
  @ApiModelProperty(required = true, value = "The habitat this Pokémon species can be encountered in.")

  @Valid

  private PokemonHabitatSummary habitat;

 /**
  * The generation this Pokémon species was introduced in.
  */
  @ApiModelProperty(required = true, value = "The generation this Pokémon species was introduced in.")

  @Valid

  private GenerationSummary generation;

 /**
  * The name of this resource listed in different languages.
  */
  @ApiModelProperty(required = true, value = "The name of this resource listed in different languages.")

  private List<@Valid PokemonSpeciesName> names = new ArrayList<>();

 /**
  * A list of encounters that can be had with this Pokémon species in pal park.
  */
  @ApiModelProperty(required = true, value = "A list of encounters that can be had with this Pokémon species in pal park.")

  private List<@Valid PokemonSpeciesPalParkEncounter> palParkEncounters = new ArrayList<>();

 /**
  * Descriptions of different forms Pokémon take on within the Pokémon species.
  */
  @ApiModelProperty(required = true, value = "Descriptions of different forms Pokémon take on within the Pokémon species.")

  private List<@Valid PokemonSpeciesDescription> formDescriptions = new ArrayList<>();

 /**
  * A list of flavor text entries for this Pokémon species.
  */
  @ApiModelProperty(required = true, value = "A list of flavor text entries for this Pokémon species.")

  private List<@Valid PokemonSpeciesFlavorText> flavorTextEntries = new ArrayList<>();

 /**
  * The genus of this Pokémon species listed in multiple languages.
  */
  @ApiModelProperty(required = true, value = "The genus of this Pokémon species listed in multiple languages.")

  private List<@Valid PokemonSpeciesGenus> genera = new ArrayList<>();

 /**
  * A list of the Pokémon that exist within this Pokémon species.
  */
  @ApiModelProperty(required = true, value = "A list of the Pokémon that exist within this Pokémon species.")

  private List<@Valid PokemonSpeciesVariety> varieties = new ArrayList<>();
 /**
   * The identifier for this resource.
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }


 /**
   * The name for this resource.
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
 @Size(max=200)  public String getName() {
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
   * The order in which species should be sorted. Based on National Dex order, except families are grouped together and sorted by stage.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return order
  **/
  @JsonProperty("order")
 @Min(-2147483648) @Max(2147483647)  public Integer getOrder() {
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
   * The chance of this Pokémon being female, in eighths; or -1 for genderless.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return genderRate
  **/
  @JsonProperty("gender_rate")
 @Min(-2147483648) @Max(2147483647)  public Integer getGenderRate() {
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
   * The base capture rate; up to 255. The higher the number, the easier the catch.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return captureRate
  **/
  @JsonProperty("capture_rate")
 @Min(-2147483648) @Max(2147483647)  public Integer getCaptureRate() {
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
   * The happiness when caught by a normal Pokéball; up to 255. The higher the number, the happier the Pokémon.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return baseHappiness
  **/
  @JsonProperty("base_happiness")
 @Min(-2147483648) @Max(2147483647)  public Integer getBaseHappiness() {
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
   * Whether or not this is a baby Pokémon.
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
   * Whether or not this is a legendary Pokémon.
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
   * Whether or not this is a mythical Pokémon.
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
   * Initial hatch counter: one must walk Y × (hatch_counter + 1) steps before this Pokémon&#39;s egg hatches, unless utilizing bonuses like Flame Body&#39;s. Y varies per generation. In Generations II, III, and VII, Egg cycles are 256 steps long. In Generation IV, Egg cycles are 255 steps long. In Pokémon Brilliant Diamond and Shining Pearl, Egg cycles are also 255 steps long, but are shorter on special dates. In Generations V and VI, Egg cycles are 257 steps long. In Pokémon Sword and Shield, and in Pokémon Scarlet and Violet, Egg cycles are 128 steps long.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return hatchCounter
  **/
  @JsonProperty("hatch_counter")
 @Min(-2147483648) @Max(2147483647)  public Integer getHatchCounter() {
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
   * Whether or not this Pokémon has visual gender differences.
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
   * Whether or not this Pokémon has multiple forms and can switch between them.
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
   * The rate at which this Pokémon species gains levels.
   * @return growthRate
  **/
  @JsonProperty("growth_rate")
  @NotNull
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
   * A list of Pokedexes and the indexes reserved within them for this Pokémon species.
   * @return pokedexNumbers
  **/
  @JsonProperty("pokedex_numbers")
  @NotNull
  public List<@Valid PokemonDexEntry> getPokedexNumbers() {
    return pokedexNumbers;
  }


 /**
   * A list of egg groups this Pokémon species is a member of.
   * @return eggGroups
  **/
  @JsonProperty("egg_groups")
  @NotNull
  public List<@Valid EggGroupSummary> getEggGroups() {
    return eggGroups;
  }


 /**
   * The color of this Pokémon for Pokédex search.
   * @return color
  **/
  @JsonProperty("color")
  @NotNull
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
   * The shape of this Pokémon for Pokédex search.
   * @return shape
  **/
  @JsonProperty("shape")
  @NotNull
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
   * The Pokémon species that evolves into this Pokemon_species.
   * @return evolvesFromSpecies
  **/
  @JsonProperty("evolves_from_species")
  @NotNull
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
   * The evolution chain this Pokémon species is a member of.
   * @return evolutionChain
  **/
  @JsonProperty("evolution_chain")
  @NotNull
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
   * The habitat this Pokémon species can be encountered in.
   * @return habitat
  **/
  @JsonProperty("habitat")
  @NotNull
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
   * The generation this Pokémon species was introduced in.
   * @return generation
  **/
  @JsonProperty("generation")
  @NotNull
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
   * The name of this resource listed in different languages.
   * @return names
  **/
  @JsonProperty("names")
  @NotNull
  public List<@Valid PokemonSpeciesName> getNames() {
    return names;
  }


 /**
   * A list of encounters that can be had with this Pokémon species in pal park.
   * @return palParkEncounters
  **/
  @JsonProperty("pal_park_encounters")
  @NotNull
  public List<@Valid PokemonSpeciesPalParkEncounter> getPalParkEncounters() {
    return palParkEncounters;
  }


 /**
   * Descriptions of different forms Pokémon take on within the Pokémon species.
   * @return formDescriptions
  **/
  @JsonProperty("form_descriptions")
  @NotNull
  public List<@Valid PokemonSpeciesDescription> getFormDescriptions() {
    return formDescriptions;
  }


 /**
   * A list of flavor text entries for this Pokémon species.
   * @return flavorTextEntries
  **/
  @JsonProperty("flavor_text_entries")
  @NotNull
  public List<@Valid PokemonSpeciesFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }


 /**
   * The genus of this Pokémon species listed in multiple languages.
   * @return genera
  **/
  @JsonProperty("genera")
  @NotNull
  public List<@Valid PokemonSpeciesGenus> getGenera() {
    return genera;
  }


 /**
   * A list of the Pokémon that exist within this Pokémon species.
   * @return varieties
  **/
  @JsonProperty("varieties")
  @NotNull
  public List<@Valid PokemonSpeciesVariety> getVarieties() {
    return varieties;
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

