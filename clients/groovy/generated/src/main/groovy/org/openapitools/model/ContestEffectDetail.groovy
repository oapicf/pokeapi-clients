package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ContestEffectEffectText;
import org.openapitools.model.ContestEffectFlavorText;

@Canonical
class ContestEffectDetail {
    /* The identifier for this resource. */
    Integer id
    /* The base number of hearts the user of this move gets. */
    Integer appeal
    /* The base number of hearts the user's opponent loses. */
    Integer jam
    /* The result of this contest effect listed in different languages. */
    List<ContestEffectEffectText> effectEntries = new ArrayList<>()
    /* The flavor text of this contest effect listed in different languages. */
    List<ContestEffectFlavorText> flavorTextEntries = new ArrayList<>()
}
