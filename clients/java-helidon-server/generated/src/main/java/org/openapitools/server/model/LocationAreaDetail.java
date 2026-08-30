package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.LocationAreaDetailEncounterMethodRatesInner;
import org.openapitools.server.model.LocationAreaDetailPokemonEncountersInner;
import org.openapitools.server.model.LocationAreaName;
import org.openapitools.server.model.LocationSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class LocationAreaDetail   {

    private Integer id;
    private String name;
    private Integer gameIndex;
    private List<@Valid LocationAreaDetailEncounterMethodRatesInner> encounterMethodRates = new ArrayList<>();
    private LocationSummary location;
    private List<@Valid LocationAreaName> names = new ArrayList<>();
    private List<@Valid LocationAreaDetailPokemonEncountersInner> pokemonEncounters = new ArrayList<>();

    /**
     * Default constructor.
     */
    public LocationAreaDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create LocationAreaDetail.
     *
     * @param id id
     * @param name name
     * @param gameIndex gameIndex
     * @param encounterMethodRates encounterMethodRates
     * @param location location
     * @param names names
     * @param pokemonEncounters pokemonEncounters
     */
    public LocationAreaDetail(
        Integer id, 
        String name, 
        Integer gameIndex, 
        List<@Valid LocationAreaDetailEncounterMethodRatesInner> encounterMethodRates, 
        LocationSummary location, 
        List<@Valid LocationAreaName> names, 
        List<@Valid LocationAreaDetailPokemonEncountersInner> pokemonEncounters
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
     * Get gameIndex
     * @return gameIndex
     */
    public Integer getGameIndex() {
        return gameIndex;
    }

    public void setGameIndex(Integer gameIndex) {
        this.gameIndex = gameIndex;
    }

    /**
     * Get encounterMethodRates
     * @return encounterMethodRates
     */
    public List<@Valid LocationAreaDetailEncounterMethodRatesInner> getEncounterMethodRates() {
        return encounterMethodRates;
    }

    public void setEncounterMethodRates(List<@Valid LocationAreaDetailEncounterMethodRatesInner> encounterMethodRates) {
        this.encounterMethodRates = encounterMethodRates;
    }

    /**
     * Get location
     * @return location
     */
    public LocationSummary getLocation() {
        return location;
    }

    public void setLocation(LocationSummary location) {
        this.location = location;
    }

    /**
     * Get names
     * @return names
     */
    public List<@Valid LocationAreaName> getNames() {
        return names;
    }

    public void setNames(List<@Valid LocationAreaName> names) {
        this.names = names;
    }

    /**
     * Get pokemonEncounters
     * @return pokemonEncounters
     */
    public List<@Valid LocationAreaDetailPokemonEncountersInner> getPokemonEncounters() {
        return pokemonEncounters;
    }

    public void setPokemonEncounters(List<@Valid LocationAreaDetailPokemonEncountersInner> pokemonEncounters) {
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

