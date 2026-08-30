package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.BerryFlavorSummary;
import org.openapitools.server.model.BerrySummary;
import org.openapitools.server.model.NatureBattleStylePreference;
import org.openapitools.server.model.NatureDetailPokeathlonStatChangesInner;
import org.openapitools.server.model.NatureName;
import org.openapitools.server.model.StatSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class NatureDetail   {

    private Integer id;
    private String name;
    private StatSummary decreasedStat;
    private StatSummary increasedStat;
    private BerryFlavorSummary likesFlavor;
    private BerryFlavorSummary hatesFlavor;
    private List<@Valid BerrySummary> berries = new ArrayList<>();
    private List<@Valid NatureDetailPokeathlonStatChangesInner> pokeathlonStatChanges = new ArrayList<>();
    private List<@Valid NatureBattleStylePreference> moveBattleStylePreferences = new ArrayList<>();
    private List<@Valid NatureName> names = new ArrayList<>();

    /**
     * Default constructor.
     */
    public NatureDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create NatureDetail.
     *
     * @param id id
     * @param name name
     * @param decreasedStat decreasedStat
     * @param increasedStat increasedStat
     * @param likesFlavor likesFlavor
     * @param hatesFlavor hatesFlavor
     * @param berries berries
     * @param pokeathlonStatChanges pokeathlonStatChanges
     * @param moveBattleStylePreferences moveBattleStylePreferences
     * @param names names
     */
    public NatureDetail(
        Integer id, 
        String name, 
        StatSummary decreasedStat, 
        StatSummary increasedStat, 
        BerryFlavorSummary likesFlavor, 
        BerryFlavorSummary hatesFlavor, 
        List<@Valid BerrySummary> berries, 
        List<@Valid NatureDetailPokeathlonStatChangesInner> pokeathlonStatChanges, 
        List<@Valid NatureBattleStylePreference> moveBattleStylePreferences, 
        List<@Valid NatureName> names
    ) {
        this.id = id;
        this.name = name;
        this.decreasedStat = decreasedStat;
        this.increasedStat = increasedStat;
        this.likesFlavor = likesFlavor;
        this.hatesFlavor = hatesFlavor;
        this.berries = berries;
        this.pokeathlonStatChanges = pokeathlonStatChanges;
        this.moveBattleStylePreferences = moveBattleStylePreferences;
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
     * Get decreasedStat
     * @return decreasedStat
     */
    public StatSummary getDecreasedStat() {
        return decreasedStat;
    }

    public void setDecreasedStat(StatSummary decreasedStat) {
        this.decreasedStat = decreasedStat;
    }

    /**
     * Get increasedStat
     * @return increasedStat
     */
    public StatSummary getIncreasedStat() {
        return increasedStat;
    }

    public void setIncreasedStat(StatSummary increasedStat) {
        this.increasedStat = increasedStat;
    }

    /**
     * Get likesFlavor
     * @return likesFlavor
     */
    public BerryFlavorSummary getLikesFlavor() {
        return likesFlavor;
    }

    public void setLikesFlavor(BerryFlavorSummary likesFlavor) {
        this.likesFlavor = likesFlavor;
    }

    /**
     * Get hatesFlavor
     * @return hatesFlavor
     */
    public BerryFlavorSummary getHatesFlavor() {
        return hatesFlavor;
    }

    public void setHatesFlavor(BerryFlavorSummary hatesFlavor) {
        this.hatesFlavor = hatesFlavor;
    }

    /**
     * Get berries
     * @return berries
     */
    public List<@Valid BerrySummary> getBerries() {
        return berries;
    }

    public void setBerries(List<@Valid BerrySummary> berries) {
        this.berries = berries;
    }

    /**
     * Get pokeathlonStatChanges
     * @return pokeathlonStatChanges
     */
    public List<@Valid NatureDetailPokeathlonStatChangesInner> getPokeathlonStatChanges() {
        return pokeathlonStatChanges;
    }

    public void setPokeathlonStatChanges(List<@Valid NatureDetailPokeathlonStatChangesInner> pokeathlonStatChanges) {
        this.pokeathlonStatChanges = pokeathlonStatChanges;
    }

    /**
     * Get moveBattleStylePreferences
     * @return moveBattleStylePreferences
     */
    public List<@Valid NatureBattleStylePreference> getMoveBattleStylePreferences() {
        return moveBattleStylePreferences;
    }

    public void setMoveBattleStylePreferences(List<@Valid NatureBattleStylePreference> moveBattleStylePreferences) {
        this.moveBattleStylePreferences = moveBattleStylePreferences;
    }

    /**
     * Get names
     * @return names
     */
    public List<@Valid NatureName> getNames() {
        return names;
    }

    public void setNames(List<@Valid NatureName> names) {
        this.names = names;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NatureDetail {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    decreasedStat: ").append(toIndentedString(decreasedStat)).append("\n");
        sb.append("    increasedStat: ").append(toIndentedString(increasedStat)).append("\n");
        sb.append("    likesFlavor: ").append(toIndentedString(likesFlavor)).append("\n");
        sb.append("    hatesFlavor: ").append(toIndentedString(hatesFlavor)).append("\n");
        sb.append("    berries: ").append(toIndentedString(berries)).append("\n");
        sb.append("    pokeathlonStatChanges: ").append(toIndentedString(pokeathlonStatChanges)).append("\n");
        sb.append("    moveBattleStylePreferences: ").append(toIndentedString(moveBattleStylePreferences)).append("\n");
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

