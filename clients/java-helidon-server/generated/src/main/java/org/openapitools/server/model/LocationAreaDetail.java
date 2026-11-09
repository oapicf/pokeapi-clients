package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.LocationAreaEncounterRate;
import org.openapitools.server.model.LocationAreaName;
import org.openapitools.server.model.LocationAreaPokemonEncounter;
import org.openapitools.server.model.LocationSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class LocationAreaDetail   {

    private Integer id;
    private String name;
    private Integer gameIndex;
    private List<@Valid LocationAreaEncounterRate> encounterMethodRates = new ArrayList<>();
    private LocationSummary location;
    private List<@Valid LocationAreaName> names = new ArrayList<>();
    private List<@Valid LocationAreaPokemonEncounter> pokemonEncounters = new ArrayList<>();

    /**
     * Default constructor.
     */
    public LocationAreaDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create LocationAreaDetail.
     *
     * @param id The identifier for this resource.
     * @param name The name for this resource.
     * @param gameIndex The internal id of an API resource within game data.
     * @param encounterMethodRates A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game.
     * @param location The region this location area can be found in.
     * @param names The name of this resource listed in different languages.
     * @param pokemonEncounters A list of Pokémon that can be encountered in this area along with version specific details about the encounter.
     */
    public LocationAreaDetail(
        Integer id, 
        String name, 
        Integer gameIndex, 
        List<@Valid LocationAreaEncounterRate> encounterMethodRates, 
        LocationSummary location, 
        List<@Valid LocationAreaName> names, 
        List<@Valid LocationAreaPokemonEncounter> pokemonEncounters
    ) {
        this.id = id;
        this.name = name;
        this.gameIndex = gameIndex;
        this.encounterMethodRates = encounterMethodRates;
        this.location = location;
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
     * The internal id of an API resource within game data.
     * minimum: -2147483648
     * maximum: 2147483647
     * @return gameIndex
     */
    public Integer getGameIndex() {
        return gameIndex;
    }

    public void setGameIndex(Integer gameIndex) {
        this.gameIndex = gameIndex;
    }

    /**
     * A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game.
     * @return encounterMethodRates
     */
    public List<@Valid LocationAreaEncounterRate> getEncounterMethodRates() {
        return encounterMethodRates;
    }

    public void setEncounterMethodRates(List<@Valid LocationAreaEncounterRate> encounterMethodRates) {
        this.encounterMethodRates = encounterMethodRates;
    }

    /**
     * The region this location area can be found in.
     * @return location
     */
    public LocationSummary getLocation() {
        return location;
    }

    public void setLocation(LocationSummary location) {
        this.location = location;
    }

    /**
     * The name of this resource listed in different languages.
     * @return names
     */
    public List<@Valid LocationAreaName> getNames() {
        return names;
    }

    public void setNames(List<@Valid LocationAreaName> names) {
        this.names = names;
    }

    /**
     * A list of Pokémon that can be encountered in this area along with version specific details about the encounter.
     * @return pokemonEncounters
     */
    public List<@Valid LocationAreaPokemonEncounter> getPokemonEncounters() {
        return pokemonEncounters;
    }

    public void setPokemonEncounters(List<@Valid LocationAreaPokemonEncounter> pokemonEncounters) {
        this.pokemonEncounters = pokemonEncounters;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LocationAreaDetail {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    gameIndex: ").append(toIndentedString(gameIndex)).append("\n");
        sb.append("    encounterMethodRates: ").append(toIndentedString(encounterMethodRates)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

