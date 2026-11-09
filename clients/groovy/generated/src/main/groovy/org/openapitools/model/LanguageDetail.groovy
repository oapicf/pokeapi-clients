package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.LanguageName;

@Canonical
class LanguageDetail {
    /* The identifier for this resource. */
    Integer id
    /* The name for this resource. */
    String name
    /* Whether or not the games are published in this language. */
    Boolean official
    /* The two-letter ISO 639-1 language code. Multiple PokéAPI language records may share this code. */
    String iso639
    /* The two-letter ISO 3166-1 alpha-2 code of the country or region associated with this language record. Multiple PokéAPI language records may share this code. */
    String iso3166
    /* The name of this resource listed in different languages. */
    List<LanguageName> names = new ArrayList<>()
}
