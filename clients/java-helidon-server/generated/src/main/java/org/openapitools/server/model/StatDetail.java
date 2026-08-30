package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.CharacteristicSummary;
import org.openapitools.server.model.MoveDamageClassSummary;
import org.openapitools.server.model.StatDetailAffectingMoves;
import org.openapitools.server.model.StatDetailAffectingNatures;
import org.openapitools.server.model.StatName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class StatDetail   {

    private Integer id;
    private String name;
    private Integer gameIndex;
    private Boolean isBattleOnly;
    private StatDetailAffectingMoves affectingMoves;
    private StatDetailAffectingNatures affectingNatures;
    private List<@Valid CharacteristicSummary> characteristics = new ArrayList<>();
    private MoveDamageClassSummary moveDamageClass;
    private List<@Valid StatName> names = new ArrayList<>();

    /**
     * Default constructor.
     */
    public StatDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create StatDetail.
     *
     * @param id id
     * @param name name
     * @param gameIndex gameIndex
     * @param isBattleOnly isBattleOnly
     * @param affectingMoves affectingMoves
     * @param affectingNatures affectingNatures
     * @param characteristics characteristics
     * @param moveDamageClass moveDamageClass
     * @param names names
     */
    public StatDetail(
        Integer id, 
        String name, 
        Integer gameIndex, 
        Boolean isBattleOnly, 
        StatDetailAffectingMoves affectingMoves, 
        StatDetailAffectingNatures affectingNatures, 
        List<@Valid CharacteristicSummary> characteristics, 
        MoveDamageClassSummary moveDamageClass, 
        List<@Valid StatName> names
    ) {
        this.id = id;
        this.name = name;
        this.gameIndex = gameIndex;
        this.isBattleOnly = isBattleOnly;
        this.affectingMoves = affectingMoves;
        this.affectingNatures = affectingNatures;
        this.characteristics = characteristics;
        this.moveDamageClass = moveDamageClass;
        this.names = names;
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
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get gameIndex
     * @return gameIndex
     */
    public Integer getGameIndex() {
        return gameIndex;
    }

    public void setGameIndex(Integer gameIndex) {
        this.gameIndex = gameIndex;
    }

    /**
     * Get isBattleOnly
     * @return isBattleOnly
     */
    public Boolean getIsBattleOnly() {
        return isBattleOnly;
    }

    public void setIsBattleOnly(Boolean isBattleOnly) {
        this.isBattleOnly = isBattleOnly;
    }

    /**
     * Get affectingMoves
     * @return affectingMoves
     */
    public StatDetailAffectingMoves getAffectingMoves() {
        return affectingMoves;
    }

    public void setAffectingMoves(StatDetailAffectingMoves affectingMoves) {
        this.affectingMoves = affectingMoves;
    }

    /**
     * Get affectingNatures
     * @return affectingNatures
     */
    public StatDetailAffectingNatures getAffectingNatures() {
        return affectingNatures;
    }

    public void setAffectingNatures(StatDetailAffectingNatures affectingNatures) {
        this.affectingNatures = affectingNatures;
    }

    /**
     * Get characteristics
     * @return characteristics
     */
    public List<@Valid CharacteristicSummary> getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(List<@Valid CharacteristicSummary> characteristics) {
        this.characteristics = characteristics;
    }

    /**
     * Get moveDamageClass
     * @return moveDamageClass
     */
    public MoveDamageClassSummary getMoveDamageClass() {
        return moveDamageClass;
    }

    public void setMoveDamageClass(MoveDamageClassSummary moveDamageClass) {
        this.moveDamageClass = moveDamageClass;
    }

    /**
     * Get names
     * @return names
     */
    public List<@Valid StatName> getNames() {
        return names;
    }

    public void setNames(List<@Valid StatName> names) {
        this.names = names;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatDetail {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    gameIndex: ").append(toIndentedString(gameIndex)).append("\n");
        sb.append("    isBattleOnly: ").append(toIndentedString(isBattleOnly)).append("\n");
        sb.append("    affectingMoves: ").append(toIndentedString(affectingMoves)).append("\n");
        sb.append("    affectingNatures: ").append(toIndentedString(affectingNatures)).append("\n");
        sb.append("    characteristics: ").append(toIndentedString(characteristics)).append("\n");
        sb.append("    moveDamageClass: ").append(toIndentedString(moveDamageClass)).append("\n");
        sb.append("    names: ").append(toIndentedString(names)).append("\n");
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

