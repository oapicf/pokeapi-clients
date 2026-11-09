package org.openapitools.server.model;

import org.openapitools.jackson.nullable.JsonNullable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class EncounterPokemonDetail   {

    private Integer minPerfectIvs;
    private Boolean alwaysShiny;
    private Boolean neverShiny;
    private Boolean isAlpha;

    /**
     * Default constructor.
     */
    public EncounterPokemonDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create EncounterPokemonDetail.
     *
     * @param minPerfectIvs The minimum number of perfect IVs, or null if unspecified.
     * @param alwaysShiny Whether the encountered Pokémon is always shiny.
     * @param neverShiny Whether the encountered Pokémon can never be shiny.
     * @param isAlpha Whether the encountered Pokémon is an alpha Pokémon.
     */
    public EncounterPokemonDetail(
        Integer minPerfectIvs, 
        Boolean alwaysShiny, 
        Boolean neverShiny, 
        Boolean isAlpha
    ) {
        this.minPerfectIvs = minPerfectIvs;
        this.alwaysShiny = alwaysShiny;
        this.neverShiny = neverShiny;
        this.isAlpha = isAlpha;
    }



    /**
     * The minimum number of perfect IVs, or null if unspecified.
     * minimum: -2147483648
     * maximum: 2147483647
     * @return minPerfectIvs
     */
    public Integer getMinPerfectIvs() {
        return minPerfectIvs;
    }

    public void setMinPerfectIvs(Integer minPerfectIvs) {
        this.minPerfectIvs = minPerfectIvs;
    }

    /**
     * Whether the encountered Pokémon is always shiny.
     * @return alwaysShiny
     */
    public Boolean getAlwaysShiny() {
        return alwaysShiny;
    }

    public void setAlwaysShiny(Boolean alwaysShiny) {
        this.alwaysShiny = alwaysShiny;
    }

    /**
     * Whether the encountered Pokémon can never be shiny.
     * @return neverShiny
     */
    public Boolean getNeverShiny() {
        return neverShiny;
    }

    public void setNeverShiny(Boolean neverShiny) {
        this.neverShiny = neverShiny;
    }

    /**
     * Whether the encountered Pokémon is an alpha Pokémon.
     * @return isAlpha
     */
    public Boolean getIsAlpha() {
        return isAlpha;
    }

    public void setIsAlpha(Boolean isAlpha) {
        this.isAlpha = isAlpha;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EncounterPokemonDetail {\n");
        
        sb.append("    minPerfectIvs: ").append(toIndentedString(minPerfectIvs)).append("\n");
        sb.append("    alwaysShiny: ").append(toIndentedString(alwaysShiny)).append("\n");
        sb.append("    neverShiny: ").append(toIndentedString(neverShiny)).append("\n");
        sb.append("    isAlpha: ").append(toIndentedString(isAlpha)).append("\n");
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

