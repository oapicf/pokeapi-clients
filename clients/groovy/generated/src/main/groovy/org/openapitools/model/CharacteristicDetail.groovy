package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.CharacteristicDescription;
import org.openapitools.model.StatSummary;

@Canonical
class CharacteristicDetail {
    /* The identifier for this resource. */
    Integer id
    /* The remainder of the highest stat/IV divided by 5. */
    Integer geneModulo
    /* The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5. */
    List<Integer> possibleValues = new ArrayList<>()
    /* The stat which results in this characteristic. */
    StatSummary highestStat
    /* The descriptions of this characteristic listed in different languages. */
    List<CharacteristicDescription> descriptions = new ArrayList<>()
}
