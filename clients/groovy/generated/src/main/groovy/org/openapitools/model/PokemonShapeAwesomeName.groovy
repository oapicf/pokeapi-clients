package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.LanguageSummary;

@Canonical
class PokemonShapeAwesomeName {
    /* The localized \"scientific\" name for an API resource in a specific language. */
    String awesomeName
    /* The language this \"scientific\" name is in. */
    LanguageSummary language
}
