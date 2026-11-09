package org.openapitools.server.api.model

import org.openapitools.server.api.model.EvolutionVariableDescription
import org.openapitools.server.api.model.EvolutionVariableName
import org.openapitools.server.api.model.VersionGroupSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class EvolutionVariableDetail(
    /** The identifier for this resource. */
    val id: kotlin.Int,
    /** The name for this resource. */
    val name: kotlin.String,
    /** The symbol used for this variable in evolution condition expressions. */
    val symbol: kotlin.String,
    /** The version group in which this variable was introduced. */
    val versionGroup: VersionGroupSummary,
    /** The name of this resource listed in different languages. */
    val names: kotlin.collections.List<EvolutionVariableName>,
    /** The description of this resource listed in different languages. */
    val descriptions: kotlin.collections.List<EvolutionVariableDescription>,
    /** The data type of this variable. */
    val dataType: kotlin.String? = null,
    /** The source of the variable value. */
    val source: kotlin.String? = null
)
