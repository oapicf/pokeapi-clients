package org.openapitools.server.model;

import org.openapitools.server.model.StatSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokemonStat   {

    private Integer baseStat;
    private Integer effort;
    private StatSummary stat;

    /**
     * Default constructor.
     */
    public PokemonStat() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonStat.
     *
     * @param baseStat baseStat
     * @param effort effort
     * @param stat stat
     */
    public PokemonStat(
        Integer baseStat, 
        Integer effort, 
        StatSummary stat
    ) {
        this.baseStat = baseStat;
        this.effort = effort;
        this.stat = stat;
    }



    /**
     * Get baseStat
     * @return baseStat
     */
    public Integer getBaseStat() {
        return baseStat;
    }

    public void setBaseStat(Integer baseStat) {
        this.baseStat = baseStat;
    }

    /**
     * Get effort
     * @return effort
     */
    public Integer getEffort() {
        return effort;
    }

    public void setEffort(Integer effort) {
        this.effort = effort;
    }

    /**
     * Get stat
     * @return stat
     */
    public StatSummary getStat() {
        return stat;
    }

    public void setStat(StatSummary stat) {
        this.stat = stat;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonStat {\n");
        
        sb.append("    baseStat: ").append(toIndentedString(baseStat)).append("\n");
        sb.append("    effort: ").append(toIndentedString(effort)).append("\n");
        sb.append("    stat: ").append(toIndentedString(stat)).append("\n");
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

