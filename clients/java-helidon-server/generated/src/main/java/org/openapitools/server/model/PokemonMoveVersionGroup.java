package org.openapitools.server.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.MoveLearnMethodSummary;
import org.openapitools.server.model.VersionGroupSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokemonMoveVersionGroup   {

    private Integer levelLearnedAt;
    private MoveLearnMethodSummary moveLearnMethod;
    private VersionGroupSummary versionGroup;
    private Integer order;

    /**
     * Default constructor.
     */
    public PokemonMoveVersionGroup() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonMoveVersionGroup.
     *
     * @param levelLearnedAt The minimum level to learn the move.
     * @param moveLearnMethod The method by which the move is learned.
     * @param versionGroup The version group in which the move is learned.
     * @param order Order by which the pokemon will learn the move. A newly learnt move will replace the move with lowest order.
     */
    public PokemonMoveVersionGroup(
        Integer levelLearnedAt, 
        MoveLearnMethodSummary moveLearnMethod, 
        VersionGroupSummary versionGroup, 
        Integer order
    ) {
        this.levelLearnedAt = levelLearnedAt;
        this.moveLearnMethod = moveLearnMethod;
        this.versionGroup = versionGroup;
        this.order = order;
    }



    /**
     * The minimum level to learn the move.
     * @return levelLearnedAt
     */
    public Integer getLevelLearnedAt() {
        return levelLearnedAt;
    }

    public void setLevelLearnedAt(Integer levelLearnedAt) {
        this.levelLearnedAt = levelLearnedAt;
    }

    /**
     * The method by which the move is learned.
     * @return moveLearnMethod
     */
    public MoveLearnMethodSummary getMoveLearnMethod() {
        return moveLearnMethod;
    }

    public void setMoveLearnMethod(MoveLearnMethodSummary moveLearnMethod) {
        this.moveLearnMethod = moveLearnMethod;
    }

    /**
     * The version group in which the move is learned.
     * @return versionGroup
     */
    public VersionGroupSummary getVersionGroup() {
        return versionGroup;
    }

    public void setVersionGroup(VersionGroupSummary versionGroup) {
        this.versionGroup = versionGroup;
    }

    /**
     * Order by which the pokemon will learn the move. A newly learnt move will replace the move with lowest order.
     * @return order
     */
    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonMoveVersionGroup {\n");
        
        sb.append("    levelLearnedAt: ").append(toIndentedString(levelLearnedAt)).append("\n");
        sb.append("    moveLearnMethod: ").append(toIndentedString(moveLearnMethod)).append("\n");
        sb.append("    versionGroup: ").append(toIndentedString(versionGroup)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
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

