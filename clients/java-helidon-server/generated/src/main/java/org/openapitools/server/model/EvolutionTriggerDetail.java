package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.server.model.EvolutionTriggerName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class EvolutionTriggerDetail   {

    private Integer id;
    private String name;
    private List<@Valid EvolutionTriggerName> names = new ArrayList<>();
    private List<@Valid AbilityDetailPokemonInnerPokemon> pokemonSpecies = new ArrayList<>();

    /**
     * Default constructor.
     */
    public EvolutionTriggerDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create EvolutionTriggerDetail.
     *
     * @param id id
     * @param name name
     * @param names names
     * @param pokemonSpecies pokemonSpecies
     */
    public EvolutionTriggerDetail(
        Integer id, 
        String name, 
        List<@Valid EvolutionTriggerName> names, 
        List<@Valid AbilityDetailPokemonInnerPokemon> pokemonSpecies
    ) {
        this.id = id;
        this.name = name;
        this.names = names;
        this.pokemonSpecies = pokemonSpecies;
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
     * Get names
     * @return names
     */
    public List<@Valid EvolutionTriggerName> getNames() {
        return names;
    }

    public void setNames(List<@Valid EvolutionTriggerName> names) {
        this.names = names;
    }

    /**
     * Get pokemonSpecies
     * @return pokemonSpecies
     */
    public List<@Valid AbilityDetailPokemonInnerPokemon> getPokemonSpecies() {
        return pokemonSpecies;
    }

    public void setPokemonSpecies(List<@Valid AbilityDetailPokemonInnerPokemon> pokemonSpecies) {
        this.pokemonSpecies = pokemonSpecies;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EvolutionTriggerDetail {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    names: ").append(toIndentedString(names)).append("\n");
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

