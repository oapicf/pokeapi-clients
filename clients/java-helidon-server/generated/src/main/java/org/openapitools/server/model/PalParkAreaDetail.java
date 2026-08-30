package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.PalParkAreaDetailPokemonEncountersInner;
import org.openapitools.server.model.PalParkAreaName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PalParkAreaDetail   {

    private Integer id;
    private String name;
    private List<@Valid PalParkAreaName> names = new ArrayList<>();
    private List<@Valid PalParkAreaDetailPokemonEncountersInner> pokemonEncounters = new ArrayList<>();

    /**
     * Default constructor.
     */
    public PalParkAreaDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create PalParkAreaDetail.
     *
     * @param id id
     * @param name name
     * @param names names
     * @param pokemonEncounters pokemonEncounters
     */
    public PalParkAreaDetail(
        Integer id, 
        String name, 
        List<@Valid PalParkAreaName> names, 
        List<@Valid PalParkAreaDetailPokemonEncountersInner> pokemonEncounters
    ) {
        this.id = id;
        this.name = name;
        this.names = names;
        this.pokemonEncounters = pokemonEncounters;
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
    public List<@Valid PalParkAreaName> getNames() {
        return names;
    }

    public void setNames(List<@Valid PalParkAreaName> names) {
        this.names = names;
    }

    /**
     * Get pokemonEncounters
     * @return pokemonEncounters
     */
    public List<@Valid PalParkAreaDetailPokemonEncountersInner> getPokemonEncounters() {
        return pokemonEncounters;
    }

    public void setPokemonEncounters(List<@Valid PalParkAreaDetailPokemonEncountersInner> pokemonEncounters) {
        this.pokemonEncounters = pokemonEncounters;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PalParkAreaDetail {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    names: ").append(toIndentedString(names)).append("\n");
        sb.append("    pokemonEncounters: ").append(toIndentedString(pokemonEncounters)).append("\n");
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

