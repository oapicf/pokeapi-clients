package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.server.model.EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class EvolutionChainDetailChainEvolvesToInner   {

    private List<@Valid EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner> evolutionDetails = new ArrayList<>();
    private Boolean isBaby;
    private AbilityDetailPokemonInnerPokemon species;

    /**
     * Default constructor.
     */
    public EvolutionChainDetailChainEvolvesToInner() {
    // JSON-B / Jackson
    }

    /**
     * Create EvolutionChainDetailChainEvolvesToInner.
     *
     * @param evolutionDetails evolutionDetails
     * @param isBaby isBaby
     * @param species species
     */
    public EvolutionChainDetailChainEvolvesToInner(
        List<@Valid EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner> evolutionDetails, 
        Boolean isBaby, 
        AbilityDetailPokemonInnerPokemon species
    ) {
        this.evolutionDetails = evolutionDetails;
        this.isBaby = isBaby;
        this.species = species;
    }



    /**
     * Get evolutionDetails
     * @return evolutionDetails
     */
    public List<@Valid EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner> getEvolutionDetails() {
        return evolutionDetails;
    }

    public void setEvolutionDetails(List<@Valid EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner> evolutionDetails) {
        this.evolutionDetails = evolutionDetails;
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
     * Get species
     * @return species
     */
    public AbilityDetailPokemonInnerPokemon getSpecies() {
        return species;
    }

    public void setSpecies(AbilityDetailPokemonInnerPokemon species) {
        this.species = species;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EvolutionChainDetailChainEvolvesToInner {\n");
        
        sb.append("    evolutionDetails: ").append(toIndentedString(evolutionDetails)).append("\n");
        sb.append("    isBaby: ").append(toIndentedString(isBaby)).append("\n");
        sb.append("    species: ").append(toIndentedString(species)).append("\n");
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

