package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.CharacteristicSummary;
import org.openapitools.model.ItemSummary;
import org.openapitools.model.MoveDamageClassSummary;
import org.openapitools.model.StatAffectingMoves;
import org.openapitools.model.StatAffectingNatures;
import org.openapitools.model.StatName;

@Canonical
class StatDetail {
    /* The identifier for this resource. */
    Integer id
    /* The name for this resource. */
    String name
    /* ID the games use for this stat. */
    Integer gameIndex
    /* Whether this stat only exists within a battle. */
    Boolean isBattleOnly
    /* A detail of moves which affect this stat positively or negatively. */
    StatAffectingMoves affectingMoves
    /* A detail of natures which affect this stat positively or negatively. */
    StatAffectingNatures affectingNatures
    /* Items that affect this stat, such as vitamins and battle items. */
    List<ItemSummary> affectingItems = new ArrayList<>()
    /* A list of characteristics that are set on a Pokémon when its highest base stat is this stat. */
    List<CharacteristicSummary> characteristics = new ArrayList<>()
    /* The class of damage this stat is directly related to. */
    MoveDamageClassSummary moveDamageClass
    /* The name of this resource listed in different languages. */
    List<StatName> names = new ArrayList<>()
}
