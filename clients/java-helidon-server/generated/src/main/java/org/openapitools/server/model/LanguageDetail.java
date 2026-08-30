package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.LanguageName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class LanguageDetail   {

    private Integer id;
    private String name;
    private Boolean official;
    private String iso639;
    private String iso3166;
    private List<@Valid LanguageName> names = new ArrayList<>();

    /**
     * Default constructor.
     */
    public LanguageDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create LanguageDetail.
     *
     * @param id id
     * @param name name
     * @param official official
     * @param iso639 iso639
     * @param iso3166 iso3166
     * @param names names
     */
    public LanguageDetail(
        Integer id, 
        String name, 
        Boolean official, 
        String iso639, 
        String iso3166, 
        List<@Valid LanguageName> names
    ) {
        this.id = id;
        this.name = name;
        this.official = official;
        this.iso639 = iso639;
        this.iso3166 = iso3166;
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
     * Get official
     * @return official
     */
    public Boolean getOfficial() {
        return official;
    }

    public void setOfficial(Boolean official) {
        this.official = official;
    }

    /**
     * Get iso639
     * @return iso639
     */
    public String getIso639() {
        return iso639;
    }

    public void setIso639(String iso639) {
        this.iso639 = iso639;
    }

    /**
     * Get iso3166
     * @return iso3166
     */
    public String getIso3166() {
        return iso3166;
    }

    public void setIso3166(String iso3166) {
        this.iso3166 = iso3166;
    }

    /**
     * Get names
     * @return names
     */
    public List<@Valid LanguageName> getNames() {
        return names;
    }

    public void setNames(List<@Valid LanguageName> names) {
        this.names = names;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LanguageDetail {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    official: ").append(toIndentedString(official)).append("\n");
        sb.append("    iso639: ").append(toIndentedString(iso639)).append("\n");
        sb.append("    iso3166: ").append(toIndentedString(iso3166)).append("\n");
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

