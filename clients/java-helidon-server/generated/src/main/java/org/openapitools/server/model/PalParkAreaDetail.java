package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.PalParkAreaName;
import org.openapitools.server.model.PalParkEncounter;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PalParkAreaDetail   {

    private Integer id;
    private String name;
    private List<@Valid PalParkAreaName> names = new ArrayList<>();
    private List<@Valid PalParkEncounter> pokemonEncounters = new ArrayList<>();

    /**
     * Default constructor.
     */
    public PalParkAreaDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create PalParkAreaDetail.
     *
     * @param id The identifier for this resource.
     * @param name The name for this resource.
     * @param names The name of this resource listed in different languages.
     * @param pokemonEncounters A list of Pokémon encountered in thi pal park area along with details.
     */
    public PalParkAreaDetail(
        Integer id, 
        String name, 
        List<@Valid PalParkAreaName> names, 
        List<@Valid PalParkEncounter> pokemonEncounters
    ) {
        this.id = id;
        this.name = name;
        this.names = names;
        this.pokemonEncounters = pokemonEncounters;
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
     * The name of this resource listed in different languages.
     * @return names
     */
    public List<@Valid PalParkAreaName> getNames() {
        return names;
    }

    public void setNames(List<@Valid PalParkAreaName> names) {
        this.names = names;
    }

    /**
     * A list of Pokémon encountered in thi pal park area along with details.
     * @return pokemonEncounters
     */
    public List<@Valid PalParkEncounter> getPokemonEncounters() {
        return pokemonEncounters;
    }

    public void setPokemonEncounters(List<@Valid PalParkEncounter> pokemonEncounters) {
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

