package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.server.model.EvolutionChainSummary;
import org.openapitools.server.model.GenerationSummary;
import org.openapitools.server.model.GrowthRateSummary;
import org.openapitools.server.model.PokemonColorSummary;
import org.openapitools.server.model.PokemonDexEntry;
import org.openapitools.server.model.PokemonFormDetailFormNamesInner;
import org.openapitools.server.model.PokemonHabitatSummary;
import org.openapitools.server.model.PokemonShapeSummary;
import org.openapitools.server.model.PokemonSpeciesDescription;
import org.openapitools.server.model.PokemonSpeciesDetailGeneraInner;
import org.openapitools.server.model.PokemonSpeciesDetailPalParkEncountersInner;
import org.openapitools.server.model.PokemonSpeciesDetailVarietiesInner;
import org.openapitools.server.model.PokemonSpeciesFlavorText;
import org.openapitools.server.model.PokemonSpeciesSummary;
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
     * Default constructor.
     */
    public PokemonSpeciesDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonSpeciesDetail.
     *
     * @param id id
     * @param name name
     * @param order order
     * @param genderRate genderRate
     * @param captureRate captureRate
     * @param baseHappiness baseHappiness
     * @param isBaby isBaby
     * @param isLegendary isLegendary
     * @param isMythical isMythical
     * @param hatchCounter hatchCounter
     * @param hasGenderDifferences hasGenderDifferences
     * @param formsSwitchable formsSwitchable
     * @param growthRate growthRate
     * @param pokedexNumbers pokedexNumbers
     * @param eggGroups eggGroups
     * @param color color
     * @param shape shape
     * @param evolvesFromSpecies evolvesFromSpecies
     * @param evolutionChain evolutionChain
     * @param habitat habitat
     * @param generation generation
     * @param names names
     * @param palParkEncounters palParkEncounters
     * @param formDescriptions formDescriptions
     * @param flavorTextEntries flavorTextEntries
     * @param genera genera
     * @param varieties varieties
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
        List<@Valid AbilityDetailPokemonInnerPokemon> eggGroups, 
        PokemonColorSummary color, 
        PokemonShapeSummary shape, 
        PokemonSpeciesSummary evolvesFromSpecies, 
        EvolutionChainSummary evolutionChain, 
        PokemonHabitatSummary habitat, 
        GenerationSummary generation, 
        List<@Valid PokemonFormDetailFormNamesInner> names, 
        List<@Valid PokemonSpeciesDetailPalParkEncountersInner> palParkEncounters, 
        List<@Valid PokemonSpeciesDescription> formDescriptions, 
        List<@Valid PokemonSpeciesFlavorText> flavorTextEntries, 
        List<@Valid PokemonSpeciesDetailGeneraInner> genera, 
        List<@Valid PokemonSpeciesDetailVarietiesInner> varieties
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
     * Get id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get order
     * @return order
     */
    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    /**
     * Get genderRate
     * @return genderRate
     */
    public Integer getGenderRate() {
        return genderRate;
    }

    public void setGenderRate(Integer genderRate) {
        this.genderRate = genderRate;
    }

    /**
     * Get captureRate
     * @return captureRate
     */
    public Integer getCaptureRate() {
        return captureRate;
    }

    public void setCaptureRate(Integer captureRate) {
        this.captureRate = captureRate;
    }

    /**
     * Get baseHappiness
     * @return baseHappiness
     */
    public Integer getBaseHappiness() {
        return baseHappiness;
    }

    public void setBaseHappiness(Integer baseHappiness) {
        this.baseHappiness = baseHappiness;
    }

    /**
     * Get isBaby
     * @return isBaby
     */
    public Boolean getIsBaby() {
        return isBaby;
    }

    public void setIsBaby(Boolean isBaby) {
        this.isBaby = isBaby;
    }

    /**
     * Get isLegendary
     * @return isLegendary
     */
    public Boolean getIsLegendary() {
        return isLegendary;
    }

    public void setIsLegendary(Boolean isLegendary) {
        this.isLegendary = isLegendary;
    }

    /**
     * Get isMythical
     * @return isMythical
     */
    public Boolean getIsMythical() {
        return isMythical;
    }

    public void setIsMythical(Boolean isMythical) {
        this.isMythical = isMythical;
    }

    /**
     * Get hatchCounter
     * @return hatchCounter
     */
    public Integer getHatchCounter() {
        return hatchCounter;
    }

    public void setHatchCounter(Integer hatchCounter) {
        this.hatchCounter = hatchCounter;
    }

    /**
     * Get hasGenderDifferences
     * @return hasGenderDifferences
     */
    public Boolean getHasGenderDifferences() {
        return hasGenderDifferences;
    }

    public void setHasGenderDifferences(Boolean hasGenderDifferences) {
        this.hasGenderDifferences = hasGenderDifferences;
    }

    /**
     * Get formsSwitchable
     * @return formsSwitchable
     */
    public Boolean getFormsSwitchable() {
        return formsSwitchable;
    }

    public void setFormsSwitchable(Boolean formsSwitchable) {
        this.formsSwitchable = formsSwitchable;
    }

    /**
     * Get growthRate
     * @return growthRate
     */
    public GrowthRateSummary getGrowthRate() {
        return growthRate;
    }

    public void setGrowthRate(GrowthRateSummary growthRate) {
        this.growthRate = growthRate;
    }

    /**
     * Get pokedexNumbers
     * @return pokedexNumbers
     */
    public List<@Valid PokemonDexEntry> getPokedexNumbers() {
        return pokedexNumbers;
    }

    public void setPokedexNumbers(List<@Valid PokemonDexEntry> pokedexNumbers) {
        this.pokedexNumbers = pokedexNumbers;
    }

    /**
     * Get eggGroups
     * @return eggGroups
     */
    public List<@Valid AbilityDetailPokemonInnerPokemon> getEggGroups() {
        return eggGroups;
    }

    public void setEggGroups(List<@Valid AbilityDetailPokemonInnerPokemon> eggGroups) {
        this.eggGroups = eggGroups;
    }

    /**
     * Get color
     * @return color
     */
    public PokemonColorSummary getColor() {
        return color;
    }

    public void setColor(PokemonColorSummary color) {
        this.color = color;
    }

    /**
     * Get shape
     * @return shape
     */
    public PokemonShapeSummary getShape() {
        return shape;
    }

    public void setShape(PokemonShapeSummary shape) {
        this.shape = shape;
    }

    /**
     * Get evolvesFromSpecies
     * @return evolvesFromSpecies
     */
    public PokemonSpeciesSummary getEvolvesFromSpecies() {
        return evolvesFromSpecies;
    }

    public void setEvolvesFromSpecies(PokemonSpeciesSummary evolvesFromSpecies) {
        this.evolvesFromSpecies = evolvesFromSpecies;
    }

    /**
     * Get evolutionChain
     * @return evolutionChain
     */
    public EvolutionChainSummary getEvolutionChain() {
        return evolutionChain;
    }

    public void setEvolutionChain(EvolutionChainSummary evolutionChain) {
        this.evolutionChain = evolutionChain;
    }

    /**
     * Get habitat
     * @return habitat
     */
    public PokemonHabitatSummary getHabitat() {
        return habitat;
    }

    public void setHabitat(PokemonHabitatSummary habitat) {
        this.habitat = habitat;
    }

    /**
     * Get generation
     * @return generation
     */
    public GenerationSummary getGeneration() {
        return generation;
    }

    public void setGeneration(GenerationSummary generation) {
        this.generation = generation;
    }

    /**
     * Get names
     * @return names
     */
    public List<@Valid PokemonFormDetailFormNamesInner> getNames() {
        return names;
    }

    public void setNames(List<@Valid PokemonFormDetailFormNamesInner> names) {
        this.names = names;
    }

    /**
     * Get palParkEncounters
     * @return palParkEncounters
     */
    public List<@Valid PokemonSpeciesDetailPalParkEncountersInner> getPalParkEncounters() {
        return palParkEncounters;
    }

    public void setPalParkEncounters(List<@Valid PokemonSpeciesDetailPalParkEncountersInner> palParkEncounters) {
        this.palParkEncounters = palParkEncounters;
    }

    /**
     * Get formDescriptions
     * @return formDescriptions
     */
    public List<@Valid PokemonSpeciesDescription> getFormDescriptions() {
        return formDescriptions;
    }

    public void setFormDescriptions(List<@Valid PokemonSpeciesDescription> formDescriptions) {
        this.formDescriptions = formDescriptions;
    }

    /**
     * Get flavorTextEntries
     * @return flavorTextEntries
     */
    public List<@Valid PokemonSpeciesFlavorText> getFlavorTextEntries() {
        return flavorTextEntries;
    }

    public void setFlavorTextEntries(List<@Valid PokemonSpeciesFlavorText> flavorTextEntries) {
        this.flavorTextEntries = flavorTextEntries;
    }

    /**
     * Get genera
     * @return genera
     */
    public List<@Valid PokemonSpeciesDetailGeneraInner> getGenera() {
        return genera;
    }

    public void setGenera(List<@Valid PokemonSpeciesDetailGeneraInner> genera) {
        this.genera = genera;
    }

    /**
     * Get varieties
     * @return varieties
     */
    public List<@Valid PokemonSpeciesDetailVarietiesInner> getVarieties() {
        return varieties;
    }

    public void setVarieties(List<@Valid PokemonSpeciesDetailVarietiesInner> varieties) {
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

