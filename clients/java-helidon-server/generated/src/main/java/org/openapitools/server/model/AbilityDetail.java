package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.AbilityChange;
import org.openapitools.server.model.AbilityDetailPokemonInner;
import org.openapitools.server.model.AbilityEffectText;
import org.openapitools.server.model.AbilityFlavorText;
import org.openapitools.server.model.AbilityName;
import org.openapitools.server.model.GenerationSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AbilityDetail   {

    private Integer id;
    private String name;
    private Boolean isMainSeries;
    private GenerationSummary generation;
    private List<@Valid AbilityName> names = new ArrayList<>();
    private List<@Valid AbilityEffectText> effectEntries = new ArrayList<>();
    private List<@Valid AbilityChange> effectChanges = new ArrayList<>();
    private List<@Valid AbilityFlavorText> flavorTextEntries = new ArrayList<>();
    private List<@Valid AbilityDetailPokemonInner> pokemon = new ArrayList<>();

    /**
     * Default constructor.
     */
    public AbilityDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create AbilityDetail.
     *
     * @param id id
     * @param name name
     * @param isMainSeries isMainSeries
     * @param generation generation
     * @param names names
     * @param effectEntries effectEntries
     * @param effectChanges effectChanges
     * @param flavorTextEntries flavorTextEntries
     * @param pokemon pokemon
     */
    public AbilityDetail(
        Integer id, 
        String name, 
        Boolean isMainSeries, 
        GenerationSummary generation, 
        List<@Valid AbilityName> names, 
        List<@Valid AbilityEffectText> effectEntries, 
        List<@Valid AbilityChange> effectChanges, 
        List<@Valid AbilityFlavorText> flavorTextEntries, 
        List<@Valid AbilityDetailPokemonInner> pokemon
    ) {
        this.id = id;
        this.name = name;
        this.isMainSeries = isMainSeries;
        this.generation = generation;
        this.names = names;
        this.effectEntries = effectEntries;
        this.effectChanges = effectChanges;
        this.flavorTextEntries = flavorTextEntries;
        this.pokemon = pokemon;
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
     * Get isMainSeries
     * @return isMainSeries
     */
    public Boolean getIsMainSeries() {
        return isMainSeries;
    }

    public void setIsMainSeries(Boolean isMainSeries) {
        this.isMainSeries = isMainSeries;
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
    public List<@Valid AbilityName> getNames() {
        return names;
    }

    public void setNames(List<@Valid AbilityName> names) {
        this.names = names;
    }

    /**
     * Get effectEntries
     * @return effectEntries
     */
    public List<@Valid AbilityEffectText> getEffectEntries() {
        return effectEntries;
    }

    public void setEffectEntries(List<@Valid AbilityEffectText> effectEntries) {
        this.effectEntries = effectEntries;
    }

    /**
     * Get effectChanges
     * @return effectChanges
     */
    public List<@Valid AbilityChange> getEffectChanges() {
        return effectChanges;
    }

    public void setEffectChanges(List<@Valid AbilityChange> effectChanges) {
        this.effectChanges = effectChanges;
    }

    /**
     * Get flavorTextEntries
     * @return flavorTextEntries
     */
    public List<@Valid AbilityFlavorText> getFlavorTextEntries() {
        return flavorTextEntries;
    }

    public void setFlavorTextEntries(List<@Valid AbilityFlavorText> flavorTextEntries) {
        this.flavorTextEntries = flavorTextEntries;
    }

    /**
     * Get pokemon
     * @return pokemon
     */
    public List<@Valid AbilityDetailPokemonInner> getPokemon() {
        return pokemon;
    }

    public void setPokemon(List<@Valid AbilityDetailPokemonInner> pokemon) {
        this.pokemon = pokemon;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AbilityDetail {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    isMainSeries: ").append(toIndentedString(isMainSeries)).append("\n");
        sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
        sb.append("    names: ").append(toIndentedString(names)).append("\n");
        sb.append("    effectEntries: ").append(toIndentedString(effectEntries)).append("\n");
        sb.append("    effectChanges: ").append(toIndentedString(effectChanges)).append("\n");
        sb.append("    flavorTextEntries: ").append(toIndentedString(flavorTextEntries)).append("\n");
        sb.append("    pokemon: ").append(toIndentedString(pokemon)).append("\n");
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

