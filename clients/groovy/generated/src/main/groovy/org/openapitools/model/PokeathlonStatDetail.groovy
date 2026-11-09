package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.PokeathlonStatAffectingNatures;
import org.openapitools.model.PokeathlonStatName;

@Canonical
class PokeathlonStatDetail {
    /* The identifier for this resource. */
    Integer id
    /* The name for this resource. */
    String name
    /* A detail of natures which affect this Pokéathlon stat positively or negatively. */
    PokeathlonStatAffectingNatures affectingNatures
    /* The name of this resource listed in different languages. */
    List<PokeathlonStatName> names = new ArrayList<>()
}
