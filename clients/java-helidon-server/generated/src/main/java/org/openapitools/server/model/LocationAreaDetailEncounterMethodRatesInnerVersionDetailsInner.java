package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.AbilityDetailPokemonInnerPokemon;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner   {

    private Integer rate;
    private AbilityDetailPokemonInnerPokemon version;

    /**
     * Default constructor.
     */
    public LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner() {
    // JSON-B / Jackson
    }

    /**
     * Create LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner.
     *
     * @param rate rate
     * @param version version
     */
    public LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner(
        Integer rate, 
        AbilityDetailPokemonInnerPokemon version
    ) {
        this.rate = rate;
        this.version = version;
    }



    /**
     * Get rate
     * @return rate
     */
    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    /**
     * Get version
     * @return version
     */
    public AbilityDetailPokemonInnerPokemon getVersion() {
        return version;
    }

    public void setVersion(AbilityDetailPokemonInnerPokemon version) {
        this.version = version;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner {\n");
        
        sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

