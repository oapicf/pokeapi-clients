package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.MoveEffectEffectText;
import org.openapitools.server.model.TypeSummary;
import org.openapitools.server.model.VersionGroupSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class MoveChange   {

    private Integer accuracy;
    private Integer power;
    private Integer pp;
    private Integer effectChance;
    private List<@Valid MoveEffectEffectText> effectEntries = new ArrayList<>();
    private TypeSummary type;
    private VersionGroupSummary versionGroup;

    /**
     * Default constructor.
     */
    public MoveChange() {
    // JSON-B / Jackson
    }

    /**
     * Create MoveChange.
     *
     * @param accuracy The percent value of how likely this move is to be successful.
     * @param power The base power before the listed version group, or null if power did not change.
     * @param pp Power points. The number of times this move can be used.
     * @param effectChance The percent value of how likely it is this moves effect will take effect.
     * @param effectEntries The effect of this move listed in different languages.
     * @param type The elemental type of this move.
     * @param versionGroup The version group in which these move stat values were in effect.
     */
    public MoveChange(
        Integer accuracy, 
        Integer power, 
        Integer pp, 
        Integer effectChance, 
        List<@Valid MoveEffectEffectText> effectEntries, 
        TypeSummary type, 
        VersionGroupSummary versionGroup
    ) {
        this.accuracy = accuracy;
        this.power = power;
        this.pp = pp;
        this.effectChance = effectChance;
        this.effectEntries = effectEntries;
        this.type = type;
        this.versionGroup = versionGroup;
    }



    /**
     * The percent value of how likely this move is to be successful.
     * minimum: -2147483648
     * maximum: 2147483647
     * @return accuracy
     */
    public Integer getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Integer accuracy) {
        this.accuracy = accuracy;
    }

    /**
     * The base power before the listed version group, or null if power did not change.
     * minimum: -2147483648
     * maximum: 2147483647
     * @return power
     */
    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    /**
     * Power points. The number of times this move can be used.
     * minimum: -2147483648
     * maximum: 2147483647
     * @return pp
     */
    public Integer getPp() {
        return pp;
    }

    public void setPp(Integer pp) {
        this.pp = pp;
    }

    /**
     * The percent value of how likely it is this moves effect will take effect.
     * @return effectChance
     */
    public Integer getEffectChance() {
        return effectChance;
    }

    public void setEffectChance(Integer effectChance) {
        this.effectChance = effectChance;
    }

    /**
     * The effect of this move listed in different languages.
     * @return effectEntries
     */
    public List<@Valid MoveEffectEffectText> getEffectEntries() {
        return effectEntries;
    }

    public void setEffectEntries(List<@Valid MoveEffectEffectText> effectEntries) {
        this.effectEntries = effectEntries;
    }

    /**
     * The elemental type of this move.
     * @return type
     */
    public TypeSummary getType() {
        return type;
    }

    public void setType(TypeSummary type) {
        this.type = type;
    }

    /**
     * The version group in which these move stat values were in effect.
     * @return versionGroup
     */
    public VersionGroupSummary getVersionGroup() {
        return versionGroup;
    }

    public void setVersionGroup(VersionGroupSummary versionGroup) {
        this.versionGroup = versionGroup;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MoveChange {\n");
        
        sb.append("    accuracy: ").append(toIndentedString(accuracy)).append("\n");
        sb.append("    power: ").append(toIndentedString(power)).append("\n");
        sb.append("    pp: ").append(toIndentedString(pp)).append("\n");
        sb.append("    effectChance: ").append(toIndentedString(effectChance)).append("\n");
        sb.append("    effectEntries: ").append(toIndentedString(effectEntries)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    versionGroup: ").append(toIndentedString(versionGroup)).append("\n");
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

