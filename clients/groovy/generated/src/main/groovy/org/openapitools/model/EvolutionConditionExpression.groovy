package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.EvolutionVariableSummary;

@Canonical
class EvolutionConditionExpression {
    /* Evaluatable RPN condition expression using evolution variables (e.g. 'EC 100 % 0 ==') */
    String expression
    /* Percentage chance of evolution under this condition (0-100) */
    Double percentageChance
    /* Evolution variables referenced in the expression */
    List<EvolutionVariableSummary> variables = new ArrayList<>()
}
