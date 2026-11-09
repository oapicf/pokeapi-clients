package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.ItemCategoryName
import org.openapitools.model.ItemPocketSummary
import org.openapitools.model.ItemSummary
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
 * @param id The identifier for this resource.
 * @param name The name for this resource.
 * @param items A list of items that are a part of this category.
 * @param names The name of this item category listed in different languages.
 * @param pocket The pocket items in this category would be put in.
 */
data class ItemCategoryDetail(

    @Schema(required = true, readOnly = true, description = "The identifier for this resource.")
    @param:JsonProperty("id", required = true)
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Size(max=200)
    @Schema(required = true, description = "The name for this resource.")
    @param:JsonProperty("name", required = true)
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of items that are a part of this category.")
    @param:JsonProperty("items", required = true)
    @get:JsonProperty("items", required = true) val items: kotlin.collections.List<ItemSummary>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "The name of this item category listed in different languages.")
    @param:JsonProperty("names", required = true)
    @get:JsonProperty("names", required = true) val names: kotlin.collections.List<ItemCategoryName>,

    @field:Valid
    @Schema(required = true, description = "The pocket items in this category would be put in.")
    @param:JsonProperty("pocket", required = true)
    @get:JsonProperty("pocket", required = true) val pocket: ItemPocketSummary
) {

}

