package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.TypeSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class TypeRelationships   {

    private List<@Valid TypeSummary> noDamageTo = new ArrayList<>();
    private List<@Valid TypeSummary> halfDamageTo = new ArrayList<>();
    private List<@Valid TypeSummary> doubleDamageTo = new ArrayList<>();
    private List<@Valid TypeSummary> noDamageFrom = new ArrayList<>();
    private List<@Valid TypeSummary> halfDamageFrom = new ArrayList<>();
    private List<@Valid TypeSummary> doubleDamageFrom = new ArrayList<>();

    /**
     * Default constructor.
     */
    public TypeRelationships() {
    // JSON-B / Jackson
    }

    /**
     * Create TypeRelationships.
     *
     * @param noDamageTo A list of types this type has no effect on.
     * @param halfDamageTo A list of types this type is not very effect against.
     * @param doubleDamageTo A list of types this type is very effect against.
     * @param noDamageFrom A list of types that have no effect on this type.
     * @param halfDamageFrom A list of types that are not very effective against this type.
     * @param doubleDamageFrom A list of types that are very effective against this type.
     */
    public TypeRelationships(
        List<@Valid TypeSummary> noDamageTo, 
        List<@Valid TypeSummary> halfDamageTo, 
        List<@Valid TypeSummary> doubleDamageTo, 
        List<@Valid TypeSummary> noDamageFrom, 
        List<@Valid TypeSummary> halfDamageFrom, 
        List<@Valid TypeSummary> doubleDamageFrom
    ) {
        this.noDamageTo = noDamageTo;
        this.halfDamageTo = halfDamageTo;
        this.doubleDamageTo = doubleDamageTo;
        this.noDamageFrom = noDamageFrom;
        this.halfDamageFrom = halfDamageFrom;
        this.doubleDamageFrom = doubleDamageFrom;
    }



    /**
     * A list of types this type has no effect on.
     * @return noDamageTo
     */
    public List<@Valid TypeSummary> getNoDamageTo() {
        return noDamageTo;
    }

    public void setNoDamageTo(List<@Valid TypeSummary> noDamageTo) {
        this.noDamageTo = noDamageTo;
    }

    /**
     * A list of types this type is not very effect against.
     * @return halfDamageTo
     */
    public List<@Valid TypeSummary> getHalfDamageTo() {
        return halfDamageTo;
    }

    public void setHalfDamageTo(List<@Valid TypeSummary> halfDamageTo) {
        this.halfDamageTo = halfDamageTo;
    }

    /**
     * A list of types this type is very effect against.
     * @return doubleDamageTo
     */
    public List<@Valid TypeSummary> getDoubleDamageTo() {
        return doubleDamageTo;
    }

    public void setDoubleDamageTo(List<@Valid TypeSummary> doubleDamageTo) {
        this.doubleDamageTo = doubleDamageTo;
    }

    /**
     * A list of types that have no effect on this type.
     * @return noDamageFrom
     */
    public List<@Valid TypeSummary> getNoDamageFrom() {
        return noDamageFrom;
    }

    public void setNoDamageFrom(List<@Valid TypeSummary> noDamageFrom) {
        this.noDamageFrom = noDamageFrom;
    }

    /**
     * A list of types that are not very effective against this type.
     * @return halfDamageFrom
     */
    public List<@Valid TypeSummary> getHalfDamageFrom() {
        return halfDamageFrom;
    }

    public void setHalfDamageFrom(List<@Valid TypeSummary> halfDamageFrom) {
        this.halfDamageFrom = halfDamageFrom;
    }

    /**
     * A list of types that are very effective against this type.
     * @return doubleDamageFrom
     */
    public List<@Valid TypeSummary> getDoubleDamageFrom() {
        return doubleDamageFrom;
    }

    public void setDoubleDamageFrom(List<@Valid TypeSummary> doubleDamageFrom) {
        this.doubleDamageFrom = doubleDamageFrom;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TypeRelationships {\n");
        
        sb.append("    noDamageTo: ").append(toIndentedString(noDamageTo)).append("\n");
        sb.append("    halfDamageTo: ").append(toIndentedString(halfDamageTo)).append("\n");
        sb.append("    doubleDamageTo: ").append(toIndentedString(doubleDamageTo)).append("\n");
        sb.append("    noDamageFrom: ").append(toIndentedString(noDamageFrom)).append("\n");
        sb.append("    halfDamageFrom: ").append(toIndentedString(halfDamageFrom)).append("\n");
        sb.append("    doubleDamageFrom: ").append(toIndentedString(doubleDamageFrom)).append("\n");
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

