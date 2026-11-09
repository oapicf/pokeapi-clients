package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.BerryFlavorSummary;
import org.openapitools.server.model.NatureBattleStylePreference;
import org.openapitools.server.model.NatureName;
import org.openapitools.server.model.NaturePokeathlonStat;
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
    private List<@Valid NaturePokeathlonStat> pokeathlonStatChanges = new ArrayList<>();
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
     * @param id The identifier for this resource.
     * @param name The name for this resource.
     * @param decreasedStat The stat decreased by 10% in Pokémon with this nature.
     * @param increasedStat The stat increased by 10% in Pokémon with this nature.
     * @param likesFlavor The flavor liked by Pokémon with this nature.
     * @param hatesFlavor The flavor hated by Pokémon with this nature.
     * @param pokeathlonStatChanges A list of Pokéathlon stats this nature effects and how much it effects them.
     * @param moveBattleStylePreferences A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent.
     * @param names The name of this resource listed in different languages.
     */
    public NatureDetail(
        Integer id, 
        String name, 
        StatSummary decreasedStat, 
        StatSummary increasedStat, 
        BerryFlavorSummary likesFlavor, 
        BerryFlavorSummary hatesFlavor, 
        List<@Valid NaturePokeathlonStat> pokeathlonStatChanges, 
        List<@Valid NatureBattleStylePreference> moveBattleStylePreferences, 
        List<@Valid NatureName> names
    ) {
        this.id = id;
        this.name = name;
        this.decreasedStat = decreasedStat;
        this.increasedStat = increasedStat;
        this.likesFlavor = likesFlavor;
        this.hatesFlavor = hatesFlavor;
        this.pokeathlonStatChanges = pokeathlonStatChanges;
        this.moveBattleStylePreferences = moveBattleStylePreferences;
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
     * The stat decreased by 10% in Pokémon with this nature.
     * @return decreasedStat
     */
    public StatSummary getDecreasedStat() {
        return decreasedStat;
    }

    public void setDecreasedStat(StatSummary decreasedStat) {
        this.decreasedStat = decreasedStat;
    }

    /**
     * The stat increased by 10% in Pokémon with this nature.
     * @return increasedStat
     */
    public StatSummary getIncreasedStat() {
        return increasedStat;
    }

    public void setIncreasedStat(StatSummary increasedStat) {
        this.increasedStat = increasedStat;
    }

    /**
     * The flavor liked by Pokémon with this nature.
     * @return likesFlavor
     */
    public BerryFlavorSummary getLikesFlavor() {
        return likesFlavor;
    }

    public void setLikesFlavor(BerryFlavorSummary likesFlavor) {
        this.likesFlavor = likesFlavor;
    }

    /**
     * The flavor hated by Pokémon with this nature.
     * @return hatesFlavor
     */
    public BerryFlavorSummary getHatesFlavor() {
        return hatesFlavor;
    }

    public void setHatesFlavor(BerryFlavorSummary hatesFlavor) {
        this.hatesFlavor = hatesFlavor;
    }

    /**
     * A list of Pokéathlon stats this nature effects and how much it effects them.
     * @return pokeathlonStatChanges
     */
    public List<@Valid NaturePokeathlonStat> getPokeathlonStatChanges() {
        return pokeathlonStatChanges;
    }

    public void setPokeathlonStatChanges(List<@Valid NaturePokeathlonStat> pokeathlonStatChanges) {
        this.pokeathlonStatChanges = pokeathlonStatChanges;
    }

    /**
     * A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent.
     * @return moveBattleStylePreferences
     */
    public List<@Valid NatureBattleStylePreference> getMoveBattleStylePreferences() {
        return moveBattleStylePreferences;
    }

    public void setMoveBattleStylePreferences(List<@Valid NatureBattleStylePreference> moveBattleStylePreferences) {
        this.moveBattleStylePreferences = moveBattleStylePreferences;
    }

    /**
     * The name of this resource listed in different languages.
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

