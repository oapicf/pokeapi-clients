package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.BerryFirmnessSummary;
import org.openapitools.server.model.BerryFlavorMap;
import org.openapitools.server.model.ItemSummary;
import org.openapitools.server.model.TypeSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class BerryDetail   {

    private Integer id;
    private String name;
    private Integer growthTime;
    private Integer maxHarvest;
    private Integer naturalGiftPower;
    private Integer size;
    private Integer smoothness;
    private Integer soilDryness;
    private BerryFirmnessSummary firmness;
    private List<@Valid BerryFlavorMap> flavors = new ArrayList<>();
    private ItemSummary item;
    private TypeSummary naturalGiftType;

    /**
     * Default constructor.
     */
    public BerryDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create BerryDetail.
     *
     * @param id The identifier for this resource.
     * @param name The name for this resource.
     * @param growthTime Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked.
     * @param maxHarvest The maximum number of these berries that can grow on one tree in Generation IV.
     * @param naturalGiftPower The power of the move \&quot;Natural Gift\&quot; when used with this Berry.
     * @param size The size of this Berry, in millimeters.
     * @param smoothness The smoothness of this Berry, used in making Pokéblocks or Poffins.
     * @param soilDryness The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly.
     * @param firmness The firmness of this berry, used in making Pokéblocks or Poffins.
     * @param flavors A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry.
     * @param item Berries are actually items. This is a reference to the item specific data for this berry.
     * @param naturalGiftType The type inherited by \&quot;Natural Gift\&quot; when used with this Berry.
     */
    public BerryDetail(
        Integer id, 
        String name, 
        Integer growthTime, 
        Integer maxHarvest, 
        Integer naturalGiftPower, 
        Integer size, 
        Integer smoothness, 
        Integer soilDryness, 
        BerryFirmnessSummary firmness, 
        List<@Valid BerryFlavorMap> flavors, 
        ItemSummary item, 
        TypeSummary naturalGiftType
    ) {
        this.id = id;
        this.name = name;
        this.growthTime = growthTime;
        this.maxHarvest = maxHarvest;
        this.naturalGiftPower = naturalGiftPower;
        this.size = size;
        this.smoothness = smoothness;
        this.soilDryness = soilDryness;
        this.firmness = firmness;
        this.flavors = flavors;
        this.item = item;
        this.naturalGiftType = naturalGiftType;
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
     * Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked.
     * minimum: -2147483648
     * maximum: 2147483647
     * @return growthTime
     */
    public Integer getGrowthTime() {
        return growthTime;
    }

    public void setGrowthTime(Integer growthTime) {
        this.growthTime = growthTime;
    }

    /**
     * The maximum number of these berries that can grow on one tree in Generation IV.
     * minimum: -2147483648
     * maximum: 2147483647
     * @return maxHarvest
     */
    public Integer getMaxHarvest() {
        return maxHarvest;
    }

    public void setMaxHarvest(Integer maxHarvest) {
        this.maxHarvest = maxHarvest;
    }

    /**
     * The power of the move \"Natural Gift\" when used with this Berry.
     * minimum: -2147483648
     * maximum: 2147483647
     * @return naturalGiftPower
     */
    public Integer getNaturalGiftPower() {
        return naturalGiftPower;
    }

    public void setNaturalGiftPower(Integer naturalGiftPower) {
        this.naturalGiftPower = naturalGiftPower;
    }

    /**
     * The size of this Berry, in millimeters.
     * minimum: -2147483648
     * maximum: 2147483647
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * The smoothness of this Berry, used in making Pokéblocks or Poffins.
     * minimum: -2147483648
     * maximum: 2147483647
     * @return smoothness
     */
    public Integer getSmoothness() {
        return smoothness;
    }

    public void setSmoothness(Integer smoothness) {
        this.smoothness = smoothness;
    }

    /**
     * The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly.
     * minimum: -2147483648
     * maximum: 2147483647
     * @return soilDryness
     */
    public Integer getSoilDryness() {
        return soilDryness;
    }

    public void setSoilDryness(Integer soilDryness) {
        this.soilDryness = soilDryness;
    }

    /**
     * The firmness of this berry, used in making Pokéblocks or Poffins.
     * @return firmness
     */
    public BerryFirmnessSummary getFirmness() {
        return firmness;
    }

    public void setFirmness(BerryFirmnessSummary firmness) {
        this.firmness = firmness;
    }

    /**
     * A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry.
     * @return flavors
     */
    public List<@Valid BerryFlavorMap> getFlavors() {
        return flavors;
    }

    public void setFlavors(List<@Valid BerryFlavorMap> flavors) {
        this.flavors = flavors;
    }

    /**
     * Berries are actually items. This is a reference to the item specific data for this berry.
     * @return item
     */
    public ItemSummary getItem() {
        return item;
    }

    public void setItem(ItemSummary item) {
        this.item = item;
    }

    /**
     * The type inherited by \"Natural Gift\" when used with this Berry.
     * @return naturalGiftType
     */
    public TypeSummary getNaturalGiftType() {
        return naturalGiftType;
    }

    public void setNaturalGiftType(TypeSummary naturalGiftType) {
        this.naturalGiftType = naturalGiftType;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BerryDetail {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    growthTime: ").append(toIndentedString(growthTime)).append("\n");
        sb.append("    maxHarvest: ").append(toIndentedString(maxHarvest)).append("\n");
        sb.append("    naturalGiftPower: ").append(toIndentedString(naturalGiftPower)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    smoothness: ").append(toIndentedString(smoothness)).append("\n");
        sb.append("    soilDryness: ").append(toIndentedString(soilDryness)).append("\n");
        sb.append("    firmness: ").append(toIndentedString(firmness)).append("\n");
        sb.append("    flavors: ").append(toIndentedString(flavors)).append("\n");
        sb.append("    item: ").append(toIndentedString(item)).append("\n");
        sb.append("    naturalGiftType: ").append(toIndentedString(naturalGiftType)).append("\n");
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

