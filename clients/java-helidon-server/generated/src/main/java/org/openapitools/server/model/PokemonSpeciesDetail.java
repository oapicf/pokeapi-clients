package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.EggGroupSummary;
import org.openapitools.server.model.EvolutionChainSummary;
import org.openapitools.server.model.GenerationSummary;
import org.openapitools.server.model.GrowthRateSummary;
import org.openapitools.server.model.PokemonColorSummary;
import org.openapitools.server.model.PokemonDexEntry;
import org.openapitools.server.model.PokemonHabitatSummary;
import org.openapitools.server.model.PokemonShapeSummary;
import org.openapitools.server.model.PokemonSpeciesDescription;
import org.openapitools.server.model.PokemonSpeciesFlavorText;
import org.openapitools.server.model.PokemonSpeciesGenus;
import org.openapitools.server.model.PokemonSpeciesName;
import org.openapitools.server.model.PokemonSpeciesPalParkEncounter;
import org.openapitools.server.model.PokemonSpeciesSummary;
import org.openapitools.server.model.PokemonSpeciesVariety;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



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
    private List<@Valid EggGroupSummary> eggGroups = new ArrayList<>();
    private PokemonColorSummary color;
    private PokemonShapeSummary shape;
    private PokemonSpeciesSummary evolvesFromSpecies;
    private EvolutionChainSummary evolutionChain;
    private PokemonHabitatSummary habitat;
    private GenerationSummary generation;
    private List<@Valid PokemonSpeciesName> names = new ArrayList<>();
    private List<@Valid PokemonSpeciesPalParkEncounter> palParkEncounters = new ArrayList<>();
    private List<@Valid PokemonSpeciesDescription> formDescriptions = new ArrayList<>();
    private List<@Valid PokemonSpeciesFlavorText> flavorTextEntries = new ArrayList<>();
    private List<@Valid PokemonSpeciesGenus> genera = new ArrayList<>();
    private List<@Valid PokemonSpeciesVariety> varieties = new ArrayList<>();

    /**
     * Default constructor.
     */
    public PokemonSpeciesDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonSpeciesDetail.
     *
     * @param id The identifier for this resource.
     * @param name The name for this resource.
     * @param order The order in which species should be sorted. Based on National Dex order, except families are grouped together and sorted by stage.
     * @param genderRate The chance of this Pokémon being female, in eighths; or -1 for genderless.
     * @param captureRate The base capture rate; up to 255. The higher the number, the easier the catch.
     * @param baseHappiness The happiness when caught by a normal Pokéball; up to 255. The higher the number, the happier the Pokémon.
     * @param isBaby Whether or not this is a baby Pokémon.
     * @param isLegendary Whether or not this is a legendary Pokémon.
     * @param isMythical Whether or not this is a mythical Pokémon.
     * @param hatchCounter Initial hatch counter: one must walk Y × (hatch_counter + 1) steps before this Pokémon&#39;s egg hatches, unless utilizing bonuses like Flame Body&#39;s. Y varies per generation. In Generations II, III, and VII, Egg cycles are 256 steps long. In Generation IV, Egg cycles are 255 steps long. In Pokémon Brilliant Diamond and Shining Pearl, Egg cycles are also 255 steps long, but are shorter on special dates. In Generations V and VI, Egg cycles are 257 steps long. In Pokémon Sword and Shield, and in Pokémon Scarlet and Violet, Egg cycles are 128 steps long.
     * @param hasGenderDifferences Whether or not this Pokémon has visual gender differences.
     * @param formsSwitchable Whether or not this Pokémon has multiple forms and can switch between them.
     * @param growthRate The rate at which this Pokémon species gains levels.
     * @param pokedexNumbers A list of Pokedexes and the indexes reserved within them for this Pokémon species.
     * @param eggGroups A list of egg groups this Pokémon species is a member of.
     * @param color The color of this Pokémon for Pokédex search.
     * @param shape The shape of this Pokémon for Pokédex search.
     * @param evolvesFromSpecies The Pokémon species that evolves into this Pokemon_species.
     * @param evolutionChain The evolution chain this Pokémon species is a member of.
     * @param habitat The habitat this Pokémon species can be encountered in.
     * @param generation The generation this Pokémon species was introduced in.
     * @param names The name of this resource listed in different languages.
     * @param palParkEncounters A list of encounters that can be had with this Pokémon species in pal park.
     * @param formDescriptions Descriptions of different forms Pokémon take on within the Pokémon species.
     * @param flavorTextEntries A list of flavor text entries for this Pokémon species.
     * @param genera The genus of this Pokémon species listed in multiple languages.
     * @param varieties A list of the Pokémon that exist within this Pokémon species.
     */
    public PokemonSpeciesDetail(
        Integer id, 
        String name, 
        Integer order, 
        Integer genderRate, 
        Integer captureRate, 
        Integer baseHappiness, 
        Boolean isBaby, 
        Boolean isLegendary, 
        Boolean isMythical, 
        Integer hatchCounter, 
        Boolean hasGenderDifferences, 
        Boolean formsSwitchable, 
        GrowthRateSummary growthRate, 
        List<@Valid PokemonDexEntry> pokedexNumbers, 
        List<@Valid EggGroupSummary> eggGroups, 
        PokemonColorSummary color, 
        PokemonShapeSummary shape, 
        PokemonSpeciesSummary evolvesFromSpecies, 
        EvolutionChainSummary evolutionChain, 
        PokemonHabitatSummary habitat, 
        GenerationSummary generation, 
        List<@Valid PokemonSpeciesName> names, 
        List<@Valid PokemonSpeciesPalParkEncounter> palParkEncounters, 
        List<@Valid PokemonSpeciesDescription> formDescriptions, 
        List<@Valid PokemonSpeciesFlavorText> flavorTextEntries, 
        List<@Valid PokemonSpeciesGenus> genera, 
        List<@Valid PokemonSpeciesVariety> varieties
    ) {
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
     * minimum: -2147483648
     * maximum: 2147483647
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
     * minimum: -2147483648
     * maximum: 2147483647
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
     * minimum: -2147483648
     * maximum: 2147483647
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
     * minimum: -2147483648
     * maximum: 2147483647
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
     * Initial hatch counter: one must walk Y × (hatch_counter + 1) steps before this Pokémon's egg hatches, unless utilizing bonuses like Flame Body's. Y varies per generation. In Generations II, III, and VII, Egg cycles are 256 steps long. In Generation IV, Egg cycles are 255 steps long. In Pokémon Brilliant Diamond and Shining Pearl, Egg cycles are also 255 steps long, but are shorter on special dates. In Generations V and VI, Egg cycles are 257 steps long. In Pokémon Sword and Shield, and in Pokémon Scarlet and Violet, Egg cycles are 128 steps long.
     * minimum: -2147483648
     * maximum: 2147483647
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
    public List<@Valid PokemonDexEntry> getPokedexNumbers() {
        return pokedexNumbers;
    }

    public void setPokedexNumbers(List<@Valid PokemonDexEntry> pokedexNumbers) {
        this.pokedexNumbers = pokedexNumbers;
    }

    /**
     * A list of egg groups this Pokémon species is a member of.
     * @return eggGroups
     */
    public List<@Valid EggGroupSummary> getEggGroups() {
        return eggGroups;
    }

    public void setEggGroups(List<@Valid EggGroupSummary> eggGroups) {
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
    public List<@Valid PokemonSpeciesName> getNames() {
        return names;
    }

    public void setNames(List<@Valid PokemonSpeciesName> names) {
        this.names = names;
    }

    /**
     * A list of encounters that can be had with this Pokémon species in pal park.
     * @return palParkEncounters
     */
    public List<@Valid PokemonSpeciesPalParkEncounter> getPalParkEncounters() {
        return palParkEncounters;
    }

    public void setPalParkEncounters(List<@Valid PokemonSpeciesPalParkEncounter> palParkEncounters) {
        this.palParkEncounters = palParkEncounters;
    }

    /**
     * Descriptions of different forms Pokémon take on within the Pokémon species.
     * @return formDescriptions
     */
    public List<@Valid PokemonSpeciesDescription> getFormDescriptions() {
        return formDescriptions;
    }

    public void setFormDescriptions(List<@Valid PokemonSpeciesDescription> formDescriptions) {
        this.formDescriptions = formDescriptions;
    }

    /**
     * A list of flavor text entries for this Pokémon species.
     * @return flavorTextEntries
     */
    public List<@Valid PokemonSpeciesFlavorText> getFlavorTextEntries() {
        return flavorTextEntries;
    }

    public void setFlavorTextEntries(List<@Valid PokemonSpeciesFlavorText> flavorTextEntries) {
        this.flavorTextEntries = flavorTextEntries;
    }

    /**
     * The genus of this Pokémon species listed in multiple languages.
     * @return genera
     */
    public List<@Valid PokemonSpeciesGenus> getGenera() {
        return genera;
    }

    public void setGenera(List<@Valid PokemonSpeciesGenus> genera) {
        this.genera = genera;
    }

    /**
     * A list of the Pokémon that exist within this Pokémon species.
     * @return varieties
     */
    public List<@Valid PokemonSpeciesVariety> getVarieties() {
        return varieties;
    }

    public void setVarieties(List<@Valid PokemonSpeciesVariety> varieties) {
        this.varieties = varieties;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

