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
     * @param ailment The status ailment this move inflicts on its target.
     * @param category The category of move this move falls under, e.g. damage or ailment.
     * @param minHits The minimum number of times this move hits. Null if it always only hits once.
     * @param maxHits The maximum number of times this move hits. Null if it always only hits once.
     * @param minTurns The minimum number of turns this move continues to take effect. Null if it always only lasts one turn.
     * @param maxTurns The maximum number of turns this move continues to take effect. Null if it always only lasts one turn.
     * @param drain HP drain (if positive) or Recoil damage (if negative), in percent of damage done.
     * @param healing The amount of hp gained by the attacking Pokemon, in percent of it&#39;s maximum HP.
     * @param critRate Critical hit rate bonus.
     * @param ailmentChance The likelihood this attack will cause an ailment.
     * @param flinchChance The likelihood this attack will cause the target Pokémon to flinch.
     * @param statChance The likelihood this attack will cause a stat change in the target Pokémon.
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
     * The status ailment this move inflicts on its target.
     * @return ailment
     */
    public MoveMetaAilmentSummary getAilment() {
        return ailment;
    }

    public void setAilment(MoveMetaAilmentSummary ailment) {
        this.ailment = ailment;
    }

    /**
     * The category of move this move falls under, e.g. damage or ailment.
     * @return category
     */
    public MoveMetaCategorySummary getCategory() {
        return category;
    }

    public void setCategory(MoveMetaCategorySummary category) {
        this.category = category;
    }

    /**
     * The minimum number of times this move hits. Null if it always only hits once.
     * minimum: -2147483648
     * maximum: 2147483647
     * @return minHits
     */
    public Integer getMinHits() {
        return minHits;
    }

    public void setMinHits(Integer minHits) {
        this.minHits = minHits;
    }

    /**
     * The maximum number of times this move hits. Null if it always only hits once.
     * minimum: -2147483648
     * maximum: 2147483647
     * @return maxHits
     */
    public Integer getMaxHits() {
        return maxHits;
    }

    public void setMaxHits(Integer maxHits) {
        this.maxHits = maxHits;
    }

    /**
     * The minimum number of turns this move continues to take effect. Null if it always only lasts one turn.
     * minimum: -2147483648
     * maximum: 2147483647
     * @return minTurns
     */
    public Integer getMinTurns() {
        return minTurns;
    }

    public void setMinTurns(Integer minTurns) {
        this.minTurns = minTurns;
    }

    /**
     * The maximum number of turns this move continues to take effect. Null if it always only lasts one turn.
     * minimum: -2147483648
     * maximum: 2147483647
     * @return maxTurns
     */
    public Integer getMaxTurns() {
        return maxTurns;
    }

    public void setMaxTurns(Integer maxTurns) {
        this.maxTurns = maxTurns;
    }

    /**
     * HP drain (if positive) or Recoil damage (if negative), in percent of damage done.
     * minimum: -2147483648
     * maximum: 2147483647
     * @return drain
     */
    public Integer getDrain() {
        return drain;
    }

    public void setDrain(Integer drain) {
        this.drain = drain;
    }

    /**
     * The amount of hp gained by the attacking Pokemon, in percent of it's maximum HP.
     * minimum: -2147483648
     * maximum: 2147483647
     * @return healing
     */
    public Integer getHealing() {
        return healing;
    }

    public void setHealing(Integer healing) {
        this.healing = healing;
    }

    /**
     * Critical hit rate bonus.
     * minimum: -2147483648
     * maximum: 2147483647
     * @return critRate
     */
    public Integer getCritRate() {
        return critRate;
    }

    public void setCritRate(Integer critRate) {
        this.critRate = critRate;
    }

    /**
     * The likelihood this attack will cause an ailment.
     * minimum: -2147483648
     * maximum: 2147483647
     * @return ailmentChance
     */
    public Integer getAilmentChance() {
        return ailmentChance;
    }

    public void setAilmentChance(Integer ailmentChance) {
        this.ailmentChance = ailmentChance;
    }

    /**
     * The likelihood this attack will cause the target Pokémon to flinch.
     * minimum: -2147483648
     * maximum: 2147483647
     * @return flinchChance
     */
    public Integer getFlinchChance() {
        return flinchChance;
    }

    public void setFlinchChance(Integer flinchChance) {
        this.flinchChance = flinchChance;
    }

    /**
     * The likelihood this attack will cause a stat change in the target Pokémon.
     * minimum: -2147483648
     * maximum: 2147483647
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

