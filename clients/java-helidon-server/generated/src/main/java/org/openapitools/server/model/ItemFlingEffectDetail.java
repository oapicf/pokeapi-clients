package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.ItemFlingEffectEffectText;
import org.openapitools.server.model.ItemSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ItemFlingEffectDetail   {

    private Integer id;
    private String name;
    private List<@Valid ItemFlingEffectEffectText> effectEntries = new ArrayList<>();
    private List<@Valid ItemSummary> items = new ArrayList<>();

    /**
     * Default constructor.
     */
    public ItemFlingEffectDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create ItemFlingEffectDetail.
     *
     * @param id The identifier for this resource.
     * @param name The name for this resource.
     * @param effectEntries The result of this fling effect listed in different languages.
     * @param items A list of items that have this fling effect.
     */
    public ItemFlingEffectDetail(
        Integer id, 
        String name, 
        List<@Valid ItemFlingEffectEffectText> effectEntries, 
        List<@Valid ItemSummary> items
    ) {
        this.id = id;
        this.name = name;
        this.effectEntries = effectEntries;
        this.items = items;
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
     * The result of this fling effect listed in different languages.
     * @return effectEntries
     */
    public List<@Valid ItemFlingEffectEffectText> getEffectEntries() {
        return effectEntries;
    }

    public void setEffectEntries(List<@Valid ItemFlingEffectEffectText> effectEntries) {
        this.effectEntries = effectEntries;
    }

    /**
     * A list of items that have this fling effect.
     * @return items
     */
    public List<@Valid ItemSummary> getItems() {
        return items;
    }

    public void setItems(List<@Valid ItemSummary> items) {
        this.items = items;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemFlingEffectDetail {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    effectEntries: ").append(toIndentedString(effectEntries)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

