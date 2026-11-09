package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.PokemonEvolution;
import org.openapitools.server.model.PokemonSpeciesSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class EvolutionChainLink   {

    private Boolean isBaby;
    private PokemonSpeciesSummary species;
    private List<@Valid PokemonEvolution> evolutionDetails = new ArrayList<>();
    private List<@Valid EvolutionChainLink> evolvesTo = new ArrayList<>();

    /**
     * Default constructor.
     */
    public EvolutionChainLink() {
    // JSON-B / Jackson
    }

    /**
     * Create EvolutionChainLink.
     *
     * @param isBaby Whether or not this link is for a baby Pokémon. This would only ever be true on the base link.
     * @param species The Pokémon species at this point in the evolution chain.
     * @param evolutionDetails All details regarding the specific details of the referenced Pokémon species evolution.
     * @param evolvesTo A List of chain objects.
     */
    public EvolutionChainLink(
        Boolean isBaby, 
        PokemonSpeciesSummary species, 
        List<@Valid PokemonEvolution> evolutionDetails, 
        List<@Valid EvolutionChainLink> evolvesTo
    ) {
        this.isBaby = isBaby;
        this.species = species;
        this.evolutionDetails = evolutionDetails;
        this.evolvesTo = evolvesTo;
    }



    /**
     * Whether or not this link is for a baby Pokémon. This would only ever be true on the base link.
     * @return isBaby
     */
    public Boolean getIsBaby() {
        return isBaby;
    }

    public void setIsBaby(Boolean isBaby) {
        this.isBaby = isBaby;
    }

    /**
     * The Pokémon species at this point in the evolution chain.
     * @return species
     */
    public PokemonSpeciesSummary getSpecies() {
        return species;
    }

    public void setSpecies(PokemonSpeciesSummary species) {
        this.species = species;
    }

    /**
     * All details regarding the specific details of the referenced Pokémon species evolution.
     * @return evolutionDetails
     */
    public List<@Valid PokemonEvolution> getEvolutionDetails() {
        return evolutionDetails;
    }

    public void setEvolutionDetails(List<@Valid PokemonEvolution> evolutionDetails) {
        this.evolutionDetails = evolutionDetails;
    }

    /**
     * A List of chain objects.
     * @return evolvesTo
     */
    public List<@Valid EvolutionChainLink> getEvolvesTo() {
        return evolvesTo;
    }

    public void setEvolvesTo(List<@Valid EvolutionChainLink> evolvesTo) {
        this.evolvesTo = evolvesTo;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EvolutionChainLink {\n");
        
        sb.append("    isBaby: ").append(toIndentedString(isBaby)).append("\n");
        sb.append("    species: ").append(toIndentedString(species)).append("\n");
        sb.append("    evolutionDetails: ").append(toIndentedString(evolutionDetails)).append("\n");
        sb.append("    evolvesTo: ").append(toIndentedString(evolvesTo)).append("\n");
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

