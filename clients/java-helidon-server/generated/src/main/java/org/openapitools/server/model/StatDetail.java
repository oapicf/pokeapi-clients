package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.CharacteristicSummary;
import org.openapitools.server.model.ItemSummary;
import org.openapitools.server.model.MoveDamageClassSummary;
import org.openapitools.server.model.StatAffectingMoves;
import org.openapitools.server.model.StatAffectingNatures;
import org.openapitools.server.model.StatName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class StatDetail   {

    private Integer id;
    private String name;
    private Integer gameIndex;
    private Boolean isBattleOnly;
    private StatAffectingMoves affectingMoves;
    private StatAffectingNatures affectingNatures;
    private List<@Valid ItemSummary> affectingItems = new ArrayList<>();
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
     * @param id The identifier for this resource.
     * @param name The name for this resource.
     * @param gameIndex ID the games use for this stat.
     * @param isBattleOnly Whether this stat only exists within a battle.
     * @param affectingMoves A detail of moves which affect this stat positively or negatively.
     * @param affectingNatures A detail of natures which affect this stat positively or negatively.
     * @param affectingItems Items that affect this stat, such as vitamins and battle items.
     * @param characteristics A list of characteristics that are set on a Pokémon when its highest base stat is this stat.
     * @param moveDamageClass The class of damage this stat is directly related to.
     * @param names The name of this resource listed in different languages.
     */
    public StatDetail(
        Integer id, 
        String name, 
        Integer gameIndex, 
        Boolean isBattleOnly, 
        StatAffectingMoves affectingMoves, 
        StatAffectingNatures affectingNatures, 
        List<@Valid ItemSummary> affectingItems, 
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
        this.affectingItems = affectingItems;
        this.characteristics = characteristics;
        this.moveDamageClass = moveDamageClass;
        this.names = names;
    }



    /**
     * The identifier for this resource.
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * The name for this resource.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * ID the games use for this stat.
     * minimum: -2147483648
     * maximum: 2147483647
     * @return gameIndex
     */
    public Integer getGameIndex() {
        return gameIndex;
    }

    public void setGameIndex(Integer gameIndex) {
        this.gameIndex = gameIndex;
    }

    /**
     * Whether this stat only exists within a battle.
     * @return isBattleOnly
     */
    public Boolean getIsBattleOnly() {
        return isBattleOnly;
    }

    public void setIsBattleOnly(Boolean isBattleOnly) {
        this.isBattleOnly = isBattleOnly;
    }

    /**
     * A detail of moves which affect this stat positively or negatively.
     * @return affectingMoves
     */
    public StatAffectingMoves getAffectingMoves() {
        return affectingMoves;
    }

    public void setAffectingMoves(StatAffectingMoves affectingMoves) {
        this.affectingMoves = affectingMoves;
    }

    /**
     * A detail of natures which affect this stat positively or negatively.
     * @return affectingNatures
     */
    public StatAffectingNatures getAffectingNatures() {
        return affectingNatures;
    }

    public void setAffectingNatures(StatAffectingNatures affectingNatures) {
        this.affectingNatures = affectingNatures;
    }

    /**
     * Items that affect this stat, such as vitamins and battle items.
     * @return affectingItems
     */
    public List<@Valid ItemSummary> getAffectingItems() {
        return affectingItems;
    }

    public void setAffectingItems(List<@Valid ItemSummary> affectingItems) {
        this.affectingItems = affectingItems;
    }

    /**
     * A list of characteristics that are set on a Pokémon when its highest base stat is this stat.
     * @return characteristics
     */
    public List<@Valid CharacteristicSummary> getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(List<@Valid CharacteristicSummary> characteristics) {
        this.characteristics = characteristics;
    }

    /**
     * The class of damage this stat is directly related to.
     * @return moveDamageClass
     */
    public MoveDamageClassSummary getMoveDamageClass() {
        return moveDamageClass;
    }

    public void setMoveDamageClass(MoveDamageClassSummary moveDamageClass) {
        this.moveDamageClass = moveDamageClass;
    }

    /**
     * The name of this resource listed in different languages.
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
        sb.append("    affectingItems: ").append(toIndentedString(affectingItems)).append("\n");
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

