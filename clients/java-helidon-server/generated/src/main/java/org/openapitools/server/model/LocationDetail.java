package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.LocationAreaSummary;
import org.openapitools.server.model.LocationGameIndex;
import org.openapitools.server.model.LocationName;
import org.openapitools.server.model.RegionSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class LocationDetail   {

    private Integer id;
    private String name;
    private RegionSummary region;
    private List<@Valid LocationName> names = new ArrayList<>();
    private List<@Valid LocationGameIndex> gameIndices = new ArrayList<>();
    private List<@Valid LocationAreaSummary> areas = new ArrayList<>();

    /**
     * Default constructor.
     */
    public LocationDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create LocationDetail.
     *
     * @param id The identifier for this resource.
     * @param name The name for this resource.
     * @param region The region this location can be found in.
     * @param names The name of this resource listed in different languages.
     * @param gameIndices A list of game indices relevent to this location by generation.
     * @param areas Areas that can be found within this location.
     */
    public LocationDetail(
        Integer id, 
        String name, 
        RegionSummary region, 
        List<@Valid LocationName> names, 
        List<@Valid LocationGameIndex> gameIndices, 
        List<@Valid LocationAreaSummary> areas
    ) {
        this.id = id;
        this.name = name;
        this.region = region;
        this.names = names;
        this.gameIndices = gameIndices;
        this.areas = areas;
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
     * The region this location can be found in.
     * @return region
     */
    public RegionSummary getRegion() {
        return region;
    }

    public void setRegion(RegionSummary region) {
        this.region = region;
    }

    /**
     * The name of this resource listed in different languages.
     * @return names
     */
    public List<@Valid LocationName> getNames() {
        return names;
    }

    public void setNames(List<@Valid LocationName> names) {
        this.names = names;
    }

    /**
     * A list of game indices relevent to this location by generation.
     * @return gameIndices
     */
    public List<@Valid LocationGameIndex> getGameIndices() {
        return gameIndices;
    }

    public void setGameIndices(List<@Valid LocationGameIndex> gameIndices) {
        this.gameIndices = gameIndices;
    }

    /**
     * Areas that can be found within this location.
     * @return areas
     */
    public List<@Valid LocationAreaSummary> getAreas() {
        return areas;
    }

    public void setAreas(List<@Valid LocationAreaSummary> areas) {
        this.areas = areas;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LocationDetail {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    names: ").append(toIndentedString(names)).append("\n");
        sb.append("    gameIndices: ").append(toIndentedString(gameIndices)).append("\n");
        sb.append("    areas: ").append(toIndentedString(areas)).append("\n");
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

