package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.AbilityDetailPokemonInnerPokemon;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokemonDetailMovesInnerVersionGroupDetailsInner   {

    private Integer levelLearnedAt;
    private AbilityDetailPokemonInnerPokemon moveLearnMethod;
    private AbilityDetailPokemonInnerPokemon versionGroup;

    /**
     * Default constructor.
     */
    public PokemonDetailMovesInnerVersionGroupDetailsInner() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonDetailMovesInnerVersionGroupDetailsInner.
     *
     * @param levelLearnedAt levelLearnedAt
     * @param moveLearnMethod moveLearnMethod
     * @param versionGroup versionGroup
     */
    public PokemonDetailMovesInnerVersionGroupDetailsInner(
        Integer levelLearnedAt, 
        AbilityDetailPokemonInnerPokemon moveLearnMethod, 
        AbilityDetailPokemonInnerPokemon versionGroup
    ) {
        this.levelLearnedAt = levelLearnedAt;
        this.moveLearnMethod = moveLearnMethod;
        this.versionGroup = versionGroup;
    }



    /**
     * Get levelLearnedAt
     * @return levelLearnedAt
     */
    public Integer getLevelLearnedAt() {
        return levelLearnedAt;
    }

    public void setLevelLearnedAt(Integer levelLearnedAt) {
        this.levelLearnedAt = levelLearnedAt;
    }

    /**
     * Get moveLearnMethod
     * @return moveLearnMethod
     */
    public AbilityDetailPokemonInnerPokemon getMoveLearnMethod() {
        return moveLearnMethod;
    }

    public void setMoveLearnMethod(AbilityDetailPokemonInnerPokemon moveLearnMethod) {
        this.moveLearnMethod = moveLearnMethod;
    }

    /**
     * Get versionGroup
     * @return versionGroup
     */
    public AbilityDetailPokemonInnerPokemon getVersionGroup() {
        return versionGroup;
    }

    public void setVersionGroup(AbilityDetailPokemonInnerPokemon versionGroup) {
        this.versionGroup = versionGroup;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonDetailMovesInnerVersionGroupDetailsInner {\n");
        
        sb.append("    levelLearnedAt: ").append(toIndentedString(levelLearnedAt)).append("\n");
        sb.append("    moveLearnMethod: ").append(toIndentedString(moveLearnMethod)).append("\n");
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

