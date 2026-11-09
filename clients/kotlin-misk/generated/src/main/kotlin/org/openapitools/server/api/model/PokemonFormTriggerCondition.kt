package org.openapitools.server.api.model

import org.openapitools.server.api.model.PokemonFormSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonFormTriggerCondition(
    /** The trigger for this form change. */
    val trigger: kotlin.String,
    /** The name of the required item, ability, or move. Only present for a resource-based trigger. */
    val name: kotlin.String? = null,
    /** The URL of the required item, ability, or move. Only present for a resource-based trigger. */
    val url: java.net.URI? = null,
    /** The required base form. Only present when the trigger specifies one. */
    val baseForm: PokemonFormSummary? = null
)
