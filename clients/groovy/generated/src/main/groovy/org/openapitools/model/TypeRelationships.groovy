package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.TypeSummary;

@Canonical
class TypeRelationships {
    /* A list of types this type has no effect on. */
    List<TypeSummary> noDamageTo = new ArrayList<>()
    /* A list of types this type is not very effect against. */
    List<TypeSummary> halfDamageTo = new ArrayList<>()
    /* A list of types this type is very effect against. */
    List<TypeSummary> doubleDamageTo = new ArrayList<>()
    /* A list of types that have no effect on this type. */
    List<TypeSummary> noDamageFrom = new ArrayList<>()
    /* A list of types that are not very effective against this type. */
    List<TypeSummary> halfDamageFrom = new ArrayList<>()
    /* A list of types that are very effective against this type. */
    List<TypeSummary> doubleDamageFrom = new ArrayList<>()
}
