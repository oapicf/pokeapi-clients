package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.MoveSummary;
import org.openapitools.server.model.SuperContestEffectFlavorText;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class SuperContestEffectDetail   {

    private Integer id;
    private Integer appeal;
    private List<@Valid SuperContestEffectFlavorText> flavorTextEntries = new ArrayList<>();
    private List<@Valid MoveSummary> moves = new ArrayList<>();

    /**
     * Default constructor.
     */
    public SuperContestEffectDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create SuperContestEffectDetail.
     *
     * @param id id
     * @param appeal appeal
     * @param flavorTextEntries flavorTextEntries
     * @param moves moves
     */
    public SuperContestEffectDetail(
        Integer id, 
        Integer appeal, 
        List<@Valid SuperContestEffectFlavorText> flavorTextEntries, 
        List<@Valid MoveSummary> moves
    ) {
        this.id = id;
        this.appeal = appeal;
        this.flavorTextEntries = flavorTextEntries;
        this.moves = moves;
    }



    /**
     * Get id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Get appeal
     * @return appeal
     */
    public Integer getAppeal() {
        return appeal;
    }

    public void setAppeal(Integer appeal) {
        this.appeal = appeal;
    }

    /**
     * Get flavorTextEntries
     * @return flavorTextEntries
     */
    public List<@Valid SuperContestEffectFlavorText> getFlavorTextEntries() {
        return flavorTextEntries;
    }

    public void setFlavorTextEntries(List<@Valid SuperContestEffectFlavorText> flavorTextEntries) {
        this.flavorTextEntries = flavorTextEntries;
    }

    /**
     * Get moves
     * @return moves
     */
    public List<@Valid MoveSummary> getMoves() {
        return moves;
    }

    public void setMoves(List<@Valid MoveSummary> moves) {
        this.moves = moves;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SuperContestEffectDetail {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    appeal: ").append(toIndentedString(appeal)).append("\n");
        sb.append("    flavorTextEntries: ").append(toIndentedString(flavorTextEntries)).append("\n");
        sb.append("    moves: ").append(toIndentedString(moves)).append("\n");
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

