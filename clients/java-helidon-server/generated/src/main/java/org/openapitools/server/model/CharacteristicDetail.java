package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.CharacteristicDescription;
import org.openapitools.server.model.StatSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CharacteristicDetail   {

    private Integer id;
    private Integer geneModulo;
    private List<Integer> possibleValues = new ArrayList<>();
    private StatSummary highestStat;
    private List<@Valid CharacteristicDescription> descriptions = new ArrayList<>();

    /**
     * Default constructor.
     */
    public CharacteristicDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create CharacteristicDetail.
     *
     * @param id id
     * @param geneModulo geneModulo
     * @param possibleValues possibleValues
     * @param highestStat highestStat
     * @param descriptions descriptions
     */
    public CharacteristicDetail(
        Integer id, 
        Integer geneModulo, 
        List<Integer> possibleValues, 
        StatSummary highestStat, 
        List<@Valid CharacteristicDescription> descriptions
    ) {
        this.id = id;
        this.geneModulo = geneModulo;
        this.possibleValues = possibleValues;
        this.highestStat = highestStat;
        this.descriptions = descriptions;
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
     * Get geneModulo
     * @return geneModulo
     */
    public Integer getGeneModulo() {
        return geneModulo;
    }

    public void setGeneModulo(Integer geneModulo) {
        this.geneModulo = geneModulo;
    }

    /**
     * Get possibleValues
     * @return possibleValues
     */
    public List<Integer> getPossibleValues() {
        return possibleValues;
    }

    public void setPossibleValues(List<Integer> possibleValues) {
        this.possibleValues = possibleValues;
    }

    /**
     * Get highestStat
     * @return highestStat
     */
    public StatSummary getHighestStat() {
        return highestStat;
    }

    public void setHighestStat(StatSummary highestStat) {
        this.highestStat = highestStat;
    }

    /**
     * Get descriptions
     * @return descriptions
     */
    public List<@Valid CharacteristicDescription> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<@Valid CharacteristicDescription> descriptions) {
        this.descriptions = descriptions;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacteristicDetail {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    geneModulo: ").append(toIndentedString(geneModulo)).append("\n");
        sb.append("    possibleValues: ").append(toIndentedString(possibleValues)).append("\n");
        sb.append("    highestStat: ").append(toIndentedString(highestStat)).append("\n");
        sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
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

