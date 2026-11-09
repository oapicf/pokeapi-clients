package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param deployDate The deployment time as a Unix timestamp string.
 * @param hash The source commit hash used for this deployment.
 * @param tag The deployment tag, or null if the deployment has no tag.
 */
data class PokeapiMetaResponse(

    @Schema(required = true, description = "The deployment time as a Unix timestamp string.")
    @param:JsonProperty("deploy_date", required = true)
    @get:JsonProperty("deploy_date", required = true) val deployDate: kotlin.String?,

    @Schema(required = true, description = "The source commit hash used for this deployment.")
    @param:JsonProperty("hash", required = true)
    @get:JsonProperty("hash", required = true) val hash: kotlin.String?,

    @Schema(required = true, description = "The deployment tag, or null if the deployment has no tag.")
    @param:JsonProperty("tag", required = true)
    @get:JsonProperty("tag", required = true) val tag: kotlin.String?
) {

}

