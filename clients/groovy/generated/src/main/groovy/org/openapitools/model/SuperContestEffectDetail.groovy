package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.MoveSummary;
import org.openapitools.model.SuperContestEffectFlavorText;

@Canonical
class SuperContestEffectDetail {
    /* The identifier for this resource. */
    Integer id
    /* The level of appeal this super contest effect has. */
    Integer appeal
    /* The flavor text of this super contest effect listed in different languages. */
    List<SuperContestEffectFlavorText> flavorTextEntries = new ArrayList<>()
    /* A list of moves that have the effect when used in super contests. */
    List<MoveSummary> moves = new ArrayList<>()
}
