package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AbilityDetailPokemonInnerPokemon
import org.openapitools.models.ItemCategorySummary
import org.openapitools.models.ItemDetailBabyTriggerFor
import org.openapitools.models.ItemDetailHeldByPokemonInner
import org.openapitools.models.ItemDetailMachinesInner
import org.openapitools.models.ItemDetailSprites
import org.openapitools.models.ItemEffectText
import org.openapitools.models.ItemFlavorText
import org.openapitools.models.ItemFlingEffectSummary
import org.openapitools.models.ItemGameIndex
import org.openapitools.models.ItemName
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param name 
 * @param cost 
 * @param flingUnderscorepower 
 * @param flingUnderscoreeffect 
 * @param attributes 
 * @param category 
 * @param effectUnderscoreentries 
 * @param flavorUnderscoretextUnderscoreentries 
 * @param gameUnderscoreindices 
 * @param names 
 * @param heldUnderscorebyUnderscorepokemon 
 * @param sprites 
 * @param babyUnderscoretriggerUnderscorefor 
 * @param machines 
 */
case class ItemDetail(id: Int,
                name: String,
                cost: Option[Int],
                flingUnderscorepower: Option[Int],
                flingUnderscoreeffect: ItemFlingEffectSummary,
                attributes: Seq[AbilityDetailPokemonInnerPokemon],
                category: ItemCategorySummary,
                effectUnderscoreentries: Seq[ItemEffectText],
                flavorUnderscoretextUnderscoreentries: Seq[ItemFlavorText],
                gameUnderscoreindices: Seq[ItemGameIndex],
                names: Seq[ItemName],
                heldUnderscorebyUnderscorepokemon: Seq[ItemDetailHeldByPokemonInner],
                sprites: ItemDetailSprites,
                babyUnderscoretriggerUnderscorefor: ItemDetailBabyTriggerFor,
                machines: Seq[ItemDetailMachinesInner]
                )

object ItemDetail {
    /**
     * Creates the codec for converting ItemDetail from and to JSON.
     */
    implicit val decoder: Decoder[ItemDetail] = deriveDecoder
    implicit val encoder: ObjectEncoder[ItemDetail] = deriveEncoder
}
