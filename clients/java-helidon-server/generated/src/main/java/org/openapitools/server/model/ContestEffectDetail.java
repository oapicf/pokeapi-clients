package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.ContestEffectEffectText;
import org.openapitools.server.model.ContestEffectFlavorText;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ContestEffectDetail   {

    private Integer id;
    private Integer appeal;
    private Integer jam;
    private List<@Valid ContestEffectEffectText> effectEntries = new ArrayList<>();
    private List<@Valid ContestEffectFlavorText> flavorTextEntries = new ArrayList<>();

    /**
     * Default constructor.
     */
    public ContestEffectDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create ContestEffectDetail.
     *
     * @param id id
     * @param appeal appeal
     * @param jam jam
     * @param effectEntries effectEntries
     * @param flavorTextEntries flavorTextEntries
     */
    public ContestEffectDetail(
        Integer id, 
        Integer appeal, 
        Integer jam, 
        List<@Valid ContestEffectEffectText> effectEntries, 
        List<@Valid ContestEffectFlavorText> flavorTextEntries
    ) {
        this.id = id;
        this.appeal = appeal;
        this.jam = jam;
        this.effectEntries = effectEntries;
        this.flavorTextEntries = flavorTextEntries;
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
     * Get appeal
     * @return appeal
     */
    public Integer getAppeal() {
        return appeal;
    }

    public void setAppeal(Integer appeal) {
        this.appeal = appeal;
    }

    /**
     * Get jam
     * @return jam
     */
    public Integer getJam() {
        return jam;
    }

    public void setJam(Integer jam) {
        this.jam = jam;
    }

    /**
     * Get effectEntries
     * @return effectEntries
     */
    public List<@Valid ContestEffectEffectText> getEffectEntries() {
        return effectEntries;
    }

    public void setEffectEntries(List<@Valid ContestEffectEffectText> effectEntries) {
        this.effectEntries = effectEntries;
    }

    /**
     * Get flavorTextEntries
     * @return flavorTextEntries
     */
    public List<@Valid ContestEffectFlavorText> getFlavorTextEntries() {
        return flavorTextEntries;
    }

    public void setFlavorTextEntries(List<@Valid ContestEffectFlavorText> flavorTextEntries) {
        this.flavorTextEntries = flavorTextEntries;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContestEffectDetail {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    appeal: ").append(toIndentedString(appeal)).append("\n");
        sb.append("    jam: ").append(toIndentedString(jam)).append("\n");
        sb.append("    effectEntries: ").append(toIndentedString(effectEntries)).append("\n");
        sb.append("    flavorTextEntries: ").append(toIndentedString(flavorTextEntries)).append("\n");
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

