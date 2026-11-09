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
     * @param id The identifier for this resource.
     * @param geneModulo The remainder of the highest stat/IV divided by 5.
     * @param possibleValues The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5.
     * @param highestStat The stat which results in this characteristic.
     * @param descriptions The descriptions of this characteristic listed in different languages.
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
     * The remainder of the highest stat/IV divided by 5.
     * @return geneModulo
     */
    public Integer getGeneModulo() {
        return geneModulo;
    }

    public void setGeneModulo(Integer geneModulo) {
        this.geneModulo = geneModulo;
    }

    /**
     * The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5.
     * @return possibleValues
     */
    public List<Integer> getPossibleValues() {
        return possibleValues;
    }

    public void setPossibleValues(List<Integer> possibleValues) {
        this.possibleValues = possibleValues;
    }

    /**
     * The stat which results in this characteristic.
     * @return highestStat
     */
    public StatSummary getHighestStat() {
        return highestStat;
    }

    public void setHighestStat(StatSummary highestStat) {
        this.highestStat = highestStat;
    }

    /**
     * The descriptions of this characteristic listed in different languages.
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

