package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class TypeGameSprite {
    /* The URL of the icon displaying the type name in this game, or null if unavailable. */
    String nameIcon
    /* The URL of the type symbol icon in this game, or null if unavailable. */
    String symbolIcon
}
