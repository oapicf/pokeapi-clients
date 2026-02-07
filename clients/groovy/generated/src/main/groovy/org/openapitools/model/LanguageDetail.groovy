package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.LanguageName;

@Canonical
class LanguageDetail {
    
    Integer id
    
    String name
    
    Boolean official
    
    String iso639
    
    String iso3166
    
    List<LanguageName> names = new ArrayList<>()
}
