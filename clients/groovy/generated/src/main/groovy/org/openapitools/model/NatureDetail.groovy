package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.BerryFlavorSummary;
import org.openapitools.model.NatureBattleStylePreference;
import org.openapitools.model.NatureName;
import org.openapitools.model.NaturePokeathlonStat;
import org.openapitools.model.StatSummary;

@Canonical
class NatureDetail {
    /* The identifier for this resource. */
    Integer id
    /* The name for this resource. */
    String name
    /* The stat decreased by 10% in Pokémon with this nature. */
    StatSummary decreasedStat
    /* The stat increased by 10% in Pokémon with this nature. */
    StatSummary increasedStat
    /* The flavor liked by Pokémon with this nature. */
    BerryFlavorSummary likesFlavor
    /* The flavor hated by Pokémon with this nature. */
    BerryFlavorSummary hatesFlavor
    /* A list of Pokéathlon stats this nature effects and how much it effects them. */
    List<NaturePokeathlonStat> pokeathlonStatChanges = new ArrayList<>()
    /* A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent. */
    List<NatureBattleStylePreference> moveBattleStylePreferences = new ArrayList<>()
    /* The name of this resource listed in different languages. */
    List<NatureName> names = new ArrayList<>()
}
