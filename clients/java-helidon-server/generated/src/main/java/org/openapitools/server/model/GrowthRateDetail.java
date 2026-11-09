package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.Experience;
import org.openapitools.server.model.GrowthRateDescription;
import org.openapitools.server.model.PokemonSpeciesSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class GrowthRateDetail   {

    private Integer id;
    private String name;
    private String formula;
    private List<@Valid GrowthRateDescription> descriptions = new ArrayList<>();
    private List<@Valid Experience> levels = new ArrayList<>();
    private List<@Valid PokemonSpeciesSummary> pokemonSpecies = new ArrayList<>();

    /**
     * Default constructor.
     */
    public GrowthRateDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create GrowthRateDetail.
     *
     * @param id The identifier for this resource.
     * @param name The name for this resource.
     * @param formula The formula used to calculate the rate at which the Pokémon species gains level.
     * @param descriptions The descriptions of this characteristic listed in different languages.
     * @param levels A list of levels and the amount of experienced needed to atain them based on this growth rate.
     * @param pokemonSpecies A list of Pokémon species that gain levels at this growth rate.
     */
    public GrowthRateDetail(
        Integer id, 
        String name, 
        String formula, 
        List<@Valid GrowthRateDescription> descriptions, 
        List<@Valid Experience> levels, 
        List<@Valid PokemonSpeciesSummary> pokemonSpecies
    ) {
        this.id = id;
        this.name = name;
        this.formula = formula;
        this.descriptions = descriptions;
        this.levels = levels;
        this.pokemonSpecies = pokemonSpecies;
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
     * The formula used to calculate the rate at which the Pokémon species gains level.
     * @return formula
     */
    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    /**
     * The descriptions of this characteristic listed in different languages.
     * @return descriptions
     */
    public List<@Valid GrowthRateDescription> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<@Valid GrowthRateDescription> descriptions) {
        this.descriptions = descriptions;
    }

    /**
     * A list of levels and the amount of experienced needed to atain them based on this growth rate.
     * @return levels
     */
    public List<@Valid Experience> getLevels() {
        return levels;
    }

    public void setLevels(List<@Valid Experience> levels) {
        this.levels = levels;
    }

    /**
     * A list of Pokémon species that gain levels at this growth rate.
     * @return pokemonSpecies
     */
    public List<@Valid PokemonSpeciesSummary> getPokemonSpecies() {
        return pokemonSpecies;
    }

    public void setPokemonSpecies(List<@Valid PokemonSpeciesSummary> pokemonSpecies) {
        this.pokemonSpecies = pokemonSpecies;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GrowthRateDetail {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    formula: ").append(toIndentedString(formula)).append("\n");
        sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
        sb.append("    levels: ").append(toIndentedString(levels)).append("\n");
        sb.append("    pokemonSpecies: ").append(toIndentedString(pokemonSpecies)).append("\n");
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

