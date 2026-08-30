package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.AbilityDetailPokemonInnerPokemon;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class TypeDetailPastDamageRelationsInnerDamageRelations   {

    private List<@Valid AbilityDetailPokemonInnerPokemon> noDamageTo = new ArrayList<>();
    private List<@Valid AbilityDetailPokemonInnerPokemon> halfDamageTo = new ArrayList<>();
    private List<@Valid AbilityDetailPokemonInnerPokemon> doubleDamageTo = new ArrayList<>();
    private List<@Valid AbilityDetailPokemonInnerPokemon> noDamageFrom = new ArrayList<>();
    private List<@Valid AbilityDetailPokemonInnerPokemon> halfDamageFrom = new ArrayList<>();
    private List<@Valid AbilityDetailPokemonInnerPokemon> doubleDamageFrom = new ArrayList<>();

    /**
     * Default constructor.
     */
    public TypeDetailPastDamageRelationsInnerDamageRelations() {
    // JSON-B / Jackson
    }

    /**
     * Create TypeDetailPastDamageRelationsInnerDamageRelations.
     *
     * @param noDamageTo noDamageTo
     * @param halfDamageTo halfDamageTo
     * @param doubleDamageTo doubleDamageTo
     * @param noDamageFrom noDamageFrom
     * @param halfDamageFrom halfDamageFrom
     * @param doubleDamageFrom doubleDamageFrom
     */
    public TypeDetailPastDamageRelationsInnerDamageRelations(
        List<@Valid AbilityDetailPokemonInnerPokemon> noDamageTo, 
        List<@Valid AbilityDetailPokemonInnerPokemon> halfDamageTo, 
        List<@Valid AbilityDetailPokemonInnerPokemon> doubleDamageTo, 
        List<@Valid AbilityDetailPokemonInnerPokemon> noDamageFrom, 
        List<@Valid AbilityDetailPokemonInnerPokemon> halfDamageFrom, 
        List<@Valid AbilityDetailPokemonInnerPokemon> doubleDamageFrom
    ) {
        this.noDamageTo = noDamageTo;
        this.halfDamageTo = halfDamageTo;
        this.doubleDamageTo = doubleDamageTo;
        this.noDamageFrom = noDamageFrom;
        this.halfDamageFrom = halfDamageFrom;
        this.doubleDamageFrom = doubleDamageFrom;
    }



    /**
     * Get noDamageTo
     * @return noDamageTo
     */
    public List<@Valid AbilityDetailPokemonInnerPokemon> getNoDamageTo() {
        return noDamageTo;
    }

    public void setNoDamageTo(List<@Valid AbilityDetailPokemonInnerPokemon> noDamageTo) {
        this.noDamageTo = noDamageTo;
    }

    /**
     * Get halfDamageTo
     * @return halfDamageTo
     */
    public List<@Valid AbilityDetailPokemonInnerPokemon> getHalfDamageTo() {
        return halfDamageTo;
    }

    public void setHalfDamageTo(List<@Valid AbilityDetailPokemonInnerPokemon> halfDamageTo) {
        this.halfDamageTo = halfDamageTo;
    }

    /**
     * Get doubleDamageTo
     * @return doubleDamageTo
     */
    public List<@Valid AbilityDetailPokemonInnerPokemon> getDoubleDamageTo() {
        return doubleDamageTo;
    }

    public void setDoubleDamageTo(List<@Valid AbilityDetailPokemonInnerPokemon> doubleDamageTo) {
        this.doubleDamageTo = doubleDamageTo;
    }

    /**
     * Get noDamageFrom
     * @return noDamageFrom
     */
    public List<@Valid AbilityDetailPokemonInnerPokemon> getNoDamageFrom() {
        return noDamageFrom;
    }

    public void setNoDamageFrom(List<@Valid AbilityDetailPokemonInnerPokemon> noDamageFrom) {
        this.noDamageFrom = noDamageFrom;
    }

    /**
     * Get halfDamageFrom
     * @return halfDamageFrom
     */
    public List<@Valid AbilityDetailPokemonInnerPokemon> getHalfDamageFrom() {
        return halfDamageFrom;
    }

    public void setHalfDamageFrom(List<@Valid AbilityDetailPokemonInnerPokemon> halfDamageFrom) {
        this.halfDamageFrom = halfDamageFrom;
    }

    /**
     * Get doubleDamageFrom
     * @return doubleDamageFrom
     */
    public List<@Valid AbilityDetailPokemonInnerPokemon> getDoubleDamageFrom() {
        return doubleDamageFrom;
    }

    public void setDoubleDamageFrom(List<@Valid AbilityDetailPokemonInnerPokemon> doubleDamageFrom) {
        this.doubleDamageFrom = doubleDamageFrom;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TypeDetailPastDamageRelationsInnerDamageRelations {\n");
        
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

