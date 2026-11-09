package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.ItemAttributeDescription;
import org.openapitools.server.model.ItemAttributeName;
import org.openapitools.server.model.ItemSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ItemAttributeDetail   {

    private Integer id;
    private String name;
    private List<@Valid ItemAttributeDescription> descriptions = new ArrayList<>();
    private List<@Valid ItemSummary> items = new ArrayList<>();
    private List<@Valid ItemAttributeName> names = new ArrayList<>();

    /**
     * Default constructor.
     */
    public ItemAttributeDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create ItemAttributeDetail.
     *
     * @param id The identifier for this resource.
     * @param name The name for this resource.
     * @param descriptions The description of this item attribute listed in different languages.
     * @param items A list of items that have this attribute.
     * @param names The name of this item attribute listed in different languages.
     */
    public ItemAttributeDetail(
        Integer id, 
        String name, 
        List<@Valid ItemAttributeDescription> descriptions, 
        List<@Valid ItemSummary> items, 
        List<@Valid ItemAttributeName> names
    ) {
        this.id = id;
        this.name = name;
        this.descriptions = descriptions;
        this.items = items;
        this.names = names;
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
     * The description of this item attribute listed in different languages.
     * @return descriptions
     */
    public List<@Valid ItemAttributeDescription> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<@Valid ItemAttributeDescription> descriptions) {
        this.descriptions = descriptions;
    }

    /**
     * A list of items that have this attribute.
     * @return items
     */
    public List<@Valid ItemSummary> getItems() {
        return items;
    }

    public void setItems(List<@Valid ItemSummary> items) {
        this.items = items;
    }

    /**
     * The name of this item attribute listed in different languages.
     * @return names
     */
    public List<@Valid ItemAttributeName> getNames() {
        return names;
    }

    public void setNames(List<@Valid ItemAttributeName> names) {
        this.names = names;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemAttributeDetail {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    names: ").append(toIndentedString(names)).append("\n");
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

