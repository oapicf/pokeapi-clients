package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.server.model.EvolutionChainDetailChainEvolvesToInner;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class EvolutionChainDetailChain   {

    private List<Object> evolutionDetails = new ArrayList<>();
    private List<@Valid EvolutionChainDetailChainEvolvesToInner> evolvesTo = new ArrayList<>();
    private Boolean isBaby;
    private AbilityDetailPokemonInnerPokemon species;

    /**
     * Default constructor.
     */
    public EvolutionChainDetailChain() {
    // JSON-B / Jackson
    }

    /**
     * Create EvolutionChainDetailChain.
     *
     * @param evolutionDetails evolutionDetails
     * @param evolvesTo evolvesTo
     * @param isBaby isBaby
     * @param species species
     */
    public EvolutionChainDetailChain(
        List<Object> evolutionDetails, 
        List<@Valid EvolutionChainDetailChainEvolvesToInner> evolvesTo, 
        Boolean isBaby, 
        AbilityDetailPokemonInnerPokemon species
    ) {
        this.evolutionDetails = evolutionDetails;
        this.evolvesTo = evolvesTo;
        this.isBaby = isBaby;
        this.species = species;
    }



    /**
     * Get evolutionDetails
     * @return evolutionDetails
     */
    public List<Object> getEvolutionDetails() {
        return evolutionDetails;
    }

    public void setEvolutionDetails(List<Object> evolutionDetails) {
        this.evolutionDetails = evolutionDetails;
    }

    /**
     * Get evolvesTo
     * @return evolvesTo
     */
    public List<@Valid EvolutionChainDetailChainEvolvesToInner> getEvolvesTo() {
        return evolvesTo;
    }

    public void setEvolvesTo(List<@Valid EvolutionChainDetailChainEvolvesToInner> evolvesTo) {
        this.evolvesTo = evolvesTo;
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
        sb.append("class EvolutionChainDetailChain {\n");
        
        sb.append("    evolutionDetails: ").append(toIndentedString(evolutionDetails)).append("\n");
        sb.append("    evolvesTo: ").append(toIndentedString(evolvesTo)).append("\n");
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

