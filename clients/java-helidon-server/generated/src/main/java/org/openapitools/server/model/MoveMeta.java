package org.openapitools.server.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.MoveMetaAilmentSummary;
import org.openapitools.server.model.MoveMetaCategorySummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class MoveMeta   {

    private MoveMetaAilmentSummary ailment;
    private MoveMetaCategorySummary category;
    private Integer minHits;
    private Integer maxHits;
    private Integer minTurns;
    private Integer maxTurns;
    private Integer drain;
    private Integer healing;
    private Integer critRate;
    private Integer ailmentChance;
    private Integer flinchChance;
    private Integer statChance;

    /**
     * Default constructor.
     */
    public MoveMeta() {
    // JSON-B / Jackson
    }

    /**
     * Create MoveMeta.
     *
     * @param ailment ailment
     * @param category category
     * @param minHits minHits
     * @param maxHits maxHits
     * @param minTurns minTurns
     * @param maxTurns maxTurns
     * @param drain drain
     * @param healing healing
     * @param critRate critRate
     * @param ailmentChance ailmentChance
     * @param flinchChance flinchChance
     * @param statChance statChance
     */
    public MoveMeta(
        MoveMetaAilmentSummary ailment, 
        MoveMetaCategorySummary category, 
        Integer minHits, 
        Integer maxHits, 
        Integer minTurns, 
        Integer maxTurns, 
        Integer drain, 
        Integer healing, 
        Integer critRate, 
        Integer ailmentChance, 
        Integer flinchChance, 
        Integer statChance
    ) {
        this.ailment = ailment;
        this.category = category;
        this.minHits = minHits;
        this.maxHits = maxHits;
        this.minTurns = minTurns;
        this.maxTurns = maxTurns;
        this.drain = drain;
        this.healing = healing;
        this.critRate = critRate;
        this.ailmentChance = ailmentChance;
        this.flinchChance = flinchChance;
        this.statChance = statChance;
    }



    /**
     * Get ailment
     * @return ailment
     */
    public MoveMetaAilmentSummary getAilment() {
        return ailment;
    }

    public void setAilment(MoveMetaAilmentSummary ailment) {
        this.ailment = ailment;
    }

    /**
     * Get category
     * @return category
     */
    public MoveMetaCategorySummary getCategory() {
        return category;
    }

    public void setCategory(MoveMetaCategorySummary category) {
        this.category = category;
    }

    /**
     * Get minHits
     * @return minHits
     */
    public Integer getMinHits() {
        return minHits;
    }

    public void setMinHits(Integer minHits) {
        this.minHits = minHits;
    }

    /**
     * Get maxHits
     * @return maxHits
     */
    public Integer getMaxHits() {
        return maxHits;
    }

    public void setMaxHits(Integer maxHits) {
        this.maxHits = maxHits;
    }

    /**
     * Get minTurns
     * @return minTurns
     */
    public Integer getMinTurns() {
        return minTurns;
    }

    public void setMinTurns(Integer minTurns) {
        this.minTurns = minTurns;
    }

    /**
     * Get maxTurns
     * @return maxTurns
     */
    public Integer getMaxTurns() {
        return maxTurns;
    }

    public void setMaxTurns(Integer maxTurns) {
        this.maxTurns = maxTurns;
    }

    /**
     * Get drain
     * @return drain
     */
    public Integer getDrain() {
        return drain;
    }

    public void setDrain(Integer drain) {
        this.drain = drain;
    }

    /**
     * Get healing
     * @return healing
     */
    public Integer getHealing() {
        return healing;
    }

    public void setHealing(Integer healing) {
        this.healing = healing;
    }

    /**
     * Get critRate
     * @return critRate
     */
    public Integer getCritRate() {
        return critRate;
    }

    public void setCritRate(Integer critRate) {
        this.critRate = critRate;
    }

    /**
     * Get ailmentChance
     * @return ailmentChance
     */
    public Integer getAilmentChance() {
        return ailmentChance;
    }

    public void setAilmentChance(Integer ailmentChance) {
        this.ailmentChance = ailmentChance;
    }

    /**
     * Get flinchChance
     * @return flinchChance
     */
    public Integer getFlinchChance() {
        return flinchChance;
    }

    public void setFlinchChance(Integer flinchChance) {
        this.flinchChance = flinchChance;
    }

    /**
     * Get statChance
     * @return statChance
     */
    public Integer getStatChance() {
        return statChance;
    }

    public void setStatChance(Integer statChance) {
        this.statChance = statChance;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MoveMeta {\n");
        
        sb.append("    ailment: ").append(toIndentedString(ailment)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    minHits: ").append(toIndentedString(minHits)).append("\n");
        sb.append("    maxHits: ").append(toIndentedString(maxHits)).append("\n");
        sb.append("    minTurns: ").append(toIndentedString(minTurns)).append("\n");
        sb.append("    maxTurns: ").append(toIndentedString(maxTurns)).append("\n");
        sb.append("    drain: ").append(toIndentedString(drain)).append("\n");
        sb.append("    healing: ").append(toIndentedString(healing)).append("\n");
        sb.append("    critRate: ").append(toIndentedString(critRate)).append("\n");
        sb.append("    ailmentChance: ").append(toIndentedString(ailmentChance)).append("\n");
        sb.append("    flinchChance: ").append(toIndentedString(flinchChance)).append("\n");
        sb.append("    statChance: ").append(toIndentedString(statChance)).append("\n");
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

