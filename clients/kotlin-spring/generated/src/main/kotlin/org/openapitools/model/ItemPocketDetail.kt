package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.ItemCategorySummary
import org.openapitools.model.ItemPocketName
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
 * @param id 
 * @param name 
 * @param categories 
 * @param names 
 */
data class ItemPocketDetail(

    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("id")
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Size(max=100)
    @Schema(required = true, description = "")
    @param:JsonProperty("name")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("categories")
    @get:JsonProperty("categories", required = true) val categories: kotlin.collections.List<ItemCategorySummary>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("names")
    @get:JsonProperty("names", required = true) val names: kotlin.collections.List<ItemPocketName>
) {

}

