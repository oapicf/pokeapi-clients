package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.openapitools.model.GenerationSummary;
import org.openapitools.model.MoveDamageClassSummary;
import org.openapitools.model.MoveSummary;
import org.openapitools.model.TypeGameIndex;
import org.openapitools.model.TypeGameSprite;
import org.openapitools.model.TypeName;
import org.openapitools.model.TypePastRelationships;
import org.openapitools.model.TypePokemon;
import org.openapitools.model.TypeRelationships;

@Canonical
class TypeDetail {
    /* The identifier for this resource. */
    Integer id
    /* The name for this resource. */
    String name
    /* A detail of how effective this type is toward others and vice versa. */
    TypeRelationships damageRelations
    /* A list of details of how effective this type was toward others and vice versa in previous generations */
    List<TypePastRelationships> pastDamageRelations = new ArrayList<>()
    /* A list of game indices relevent to this item by generation. */
    List<TypeGameIndex> gameIndices = new ArrayList<>()
    /* The generation this type was introduced in. */
    GenerationSummary generation
    /* The class of damage inflicted by this type. */
    MoveDamageClassSummary moveDamageClass
    /* The name of this resource listed in different languages. */
    List<TypeName> names = new ArrayList<>()
    /* A list of details of Pokémon that have this type. */
    List<TypePokemon> pokemon = new ArrayList<>()
    /* A list of moves that have this type. */
    List<MoveSummary> moves = new ArrayList<>()
    /* Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null. */
    Map<String, Map<String, TypeGameSprite>> sprites = new HashMap<>()
}
