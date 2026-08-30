package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.ItemCategorySummary;
import org.openapitools.server.model.ItemPocketName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ItemPocketDetail   {

    private Integer id;
    private String name;
    private List<@Valid ItemCategorySummary> categories = new ArrayList<>();
    private List<@Valid ItemPocketName> names = new ArrayList<>();

    /**
     * Default constructor.
     */
    public ItemPocketDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create ItemPocketDetail.
     *
     * @param id id
     * @param name name
     * @param categories categories
     * @param names names
     */
    public ItemPocketDetail(
        Integer id, 
        String name, 
        List<@Valid ItemCategorySummary> categories, 
        List<@Valid ItemPocketName> names
    ) {
        this.id = id;
        this.name = name;
        this.categories = categories;
        this.names = names;
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
     * Get categories
     * @return categories
     */
    public List<@Valid ItemCategorySummary> getCategories() {
        return categories;
    }

    public void setCategories(List<@Valid ItemCategorySummary> categories) {
        this.categories = categories;
    }

    /**
     * Get names
     * @return names
     */
    public List<@Valid ItemPocketName> getNames() {
        return names;
    }

    public void setNames(List<@Valid ItemPocketName> names) {
        this.names = names;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemPocketDetail {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
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

