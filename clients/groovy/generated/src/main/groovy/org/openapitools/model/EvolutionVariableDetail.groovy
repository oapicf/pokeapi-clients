package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.EvolutionVariableDescription;
import org.openapitools.model.EvolutionVariableName;
import org.openapitools.model.VersionGroupSummary;

@Canonical
class EvolutionVariableDetail {
    /* The identifier for this resource. */
    Integer id
    /* The name for this resource. */
    String name
    /* The symbol used for this variable in evolution condition expressions. */
    String symbol
    /* The data type of this variable. */
    String dataType
    /* The source of the variable value. */
    String source
    /* The version group in which this variable was introduced. */
    VersionGroupSummary versionGroup
    /* The name of this resource listed in different languages. */
    List<EvolutionVariableName> names = new ArrayList<>()
    /* The description of this resource listed in different languages. */
    List<EvolutionVariableDescription> descriptions = new ArrayList<>()
}
