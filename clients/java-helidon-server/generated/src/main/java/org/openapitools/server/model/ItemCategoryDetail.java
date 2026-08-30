package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.ItemCategoryName;
import org.openapitools.server.model.ItemPocketSummary;
import org.openapitools.server.model.ItemSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ItemCategoryDetail   {

    private Integer id;
    private String name;
    private List<@Valid ItemSummary> items = new ArrayList<>();
    private List<@Valid ItemCategoryName> names = new ArrayList<>();
    private ItemPocketSummary pocket;

    /**
     * Default constructor.
     */
    public ItemCategoryDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create ItemCategoryDetail.
     *
     * @param id id
     * @param name name
     * @param items items
     * @param names names
     * @param pocket pocket
     */
    public ItemCategoryDetail(
        Integer id, 
        String name, 
        List<@Valid ItemSummary> items, 
        List<@Valid ItemCategoryName> names, 
        ItemPocketSummary pocket
    ) {
        this.id = id;
        this.name = name;
        this.items = items;
        this.names = names;
        this.pocket = pocket;
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
     * Get items
     * @return items
     */
    public List<@Valid ItemSummary> getItems() {
        return items;
    }

    public void setItems(List<@Valid ItemSummary> items) {
        this.items = items;
    }

    /**
     * Get names
     * @return names
     */
    public List<@Valid ItemCategoryName> getNames() {
        return names;
    }

    public void setNames(List<@Valid ItemCategoryName> names) {
        this.names = names;
    }

    /**
     * Get pocket
     * @return pocket
     */
    public ItemPocketSummary getPocket() {
        return pocket;
    }

    public void setPocket(ItemPocketSummary pocket) {
        this.pocket = pocket;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemCategoryDetail {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    names: ").append(toIndentedString(names)).append("\n");
        sb.append("    pocket: ").append(toIndentedString(pocket)).append("\n");
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

