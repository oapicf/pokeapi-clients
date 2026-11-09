package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class PokeapiMetaResponse {
    /* The deployment time as a Unix timestamp string. */
    String deployDate
    /* The source commit hash used for this deployment. */
    String hash
    /* The deployment tag, or null if the deployment has no tag. */
    String tag
}
