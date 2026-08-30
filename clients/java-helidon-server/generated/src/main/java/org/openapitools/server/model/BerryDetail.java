package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.BerryDetailFlavorsInner;
import org.openapitools.server.model.BerryFirmnessSummary;
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
    private List<@Valid BerryDetailFlavorsInner> flavors = new ArrayList<>();
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
     * @param id id
     * @param name name
     * @param growthTime growthTime
     * @param maxHarvest maxHarvest
     * @param naturalGiftPower naturalGiftPower
     * @param size size
     * @param smoothness smoothness
     * @param soilDryness soilDryness
     * @param firmness firmness
     * @param flavors flavors
     * @param item item
     * @param naturalGiftType naturalGiftType
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
        List<@Valid BerryDetailFlavorsInner> flavors, 
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
     * Get growthTime
     * @return growthTime
     */
    public Integer getGrowthTime() {
        return growthTime;
    }

    public void setGrowthTime(Integer growthTime) {
        this.growthTime = growthTime;
    }

    /**
     * Get maxHarvest
     * @return maxHarvest
     */
    public Integer getMaxHarvest() {
        return maxHarvest;
    }

    public void setMaxHarvest(Integer maxHarvest) {
        this.maxHarvest = maxHarvest;
    }

    /**
     * Get naturalGiftPower
     * @return naturalGiftPower
     */
    public Integer getNaturalGiftPower() {
        return naturalGiftPower;
    }

    public void setNaturalGiftPower(Integer naturalGiftPower) {
        this.naturalGiftPower = naturalGiftPower;
    }

    /**
     * Get size
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * Get smoothness
     * @return smoothness
     */
    public Integer getSmoothness() {
        return smoothness;
    }

    public void setSmoothness(Integer smoothness) {
        this.smoothness = smoothness;
    }

    /**
     * Get soilDryness
     * @return soilDryness
     */
    public Integer getSoilDryness() {
        return soilDryness;
    }

    public void setSoilDryness(Integer soilDryness) {
        this.soilDryness = soilDryness;
    }

    /**
     * Get firmness
     * @return firmness
     */
    public BerryFirmnessSummary getFirmness() {
        return firmness;
    }

    public void setFirmness(BerryFirmnessSummary firmness) {
        this.firmness = firmness;
    }

    /**
     * Get flavors
     * @return flavors
     */
    public List<@Valid BerryDetailFlavorsInner> getFlavors() {
        return flavors;
    }

    public void setFlavors(List<@Valid BerryDetailFlavorsInner> flavors) {
        this.flavors = flavors;
    }

    /**
     * Get item
     * @return item
     */
    public ItemSummary getItem() {
        return item;
    }

    public void setItem(ItemSummary item) {
        this.item = item;
    }

    /**
     * Get naturalGiftType
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

