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
 * @param nameIcon The URL of the icon displaying the type name in this game, or null if unavailable.
 * @param symbolIcon The URL of the type symbol icon in this game, or null if unavailable.
 */
data class TypeGameSprite(

    @Schema(description = "The URL of the icon displaying the type name in this game, or null if unavailable.")
    @param:JsonProperty("name_icon")
    @get:JsonProperty("name_icon") val nameIcon: kotlin.String? = null,

    @Schema(description = "The URL of the type symbol icon in this game, or null if unavailable.")
    @param:JsonProperty("symbol_icon")
    @get:JsonProperty("symbol_icon") val symbolIcon: kotlin.String? = null
) {

}

