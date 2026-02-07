package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AbilityDetailPokemonInnerPokemon
import org.openapitools.models.ContestEffectSummary
import org.openapitools.models.ContestTypeSummary
import org.openapitools.models.GenerationSummary
import org.openapitools.models.MoveChange
import org.openapitools.models.MoveChangeEffectEntriesInner
import org.openapitools.models.MoveDamageClassSummary
import org.openapitools.models.MoveDetailContestCombos
import org.openapitools.models.MoveDetailEffectChangesInner
import org.openapitools.models.MoveDetailMachinesInner
import org.openapitools.models.MoveDetailStatChangesInner
import org.openapitools.models.MoveFlavorText
import org.openapitools.models.MoveMeta
import org.openapitools.models.MoveName
import org.openapitools.models.MoveTargetSummary
import org.openapitools.models.SuperContestEffectSummary
import org.openapitools.models.TypeSummary
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param name 
 * @param accuracy 
 * @param effectUnderscorechance 
 * @param pp 
 * @param priority 
 * @param power 
 * @param contestUnderscorecombos 
 * @param contestUnderscoretype 
 * @param contestUnderscoreeffect 
 * @param damageUnderscoreclass 
 * @param effectUnderscoreentries 
 * @param effectUnderscorechanges 
 * @param generation 
 * @param meta 
 * @param names 
 * @param pastUnderscorevalues 
 * @param statUnderscorechanges 
 * @param superUnderscorecontestUnderscoreeffect 
 * @param target 
 * @param _type 
 * @param machines 
 * @param flavorUnderscoretextUnderscoreentries 
 * @param learnedUnderscorebyUnderscorepokemon 
 */
case class MoveDetail(id: Int,
                name: String,
                accuracy: Option[Int],
                effectUnderscorechance: Int,
                pp: Option[Int],
                priority: Option[Int],
                power: Option[Int],
                contestUnderscorecombos: MoveDetailContestCombos,
                contestUnderscoretype: ContestTypeSummary,
                contestUnderscoreeffect: ContestEffectSummary,
                damageUnderscoreclass: MoveDamageClassSummary,
                effectUnderscoreentries: Seq[MoveChangeEffectEntriesInner],
                effectUnderscorechanges: Seq[MoveDetailEffectChangesInner],
                generation: GenerationSummary,
                meta: MoveMeta,
                names: Seq[MoveName],
                pastUnderscorevalues: Seq[MoveChange],
                statUnderscorechanges: Seq[MoveDetailStatChangesInner],
                superUnderscorecontestUnderscoreeffect: SuperContestEffectSummary,
                target: MoveTargetSummary,
                _type: TypeSummary,
                machines: Seq[MoveDetailMachinesInner],
                flavorUnderscoretextUnderscoreentries: Seq[MoveFlavorText],
                learnedUnderscorebyUnderscorepokemon: Seq[AbilityDetailPokemonInnerPokemon]
                )

object MoveDetail {
    /**
     * Creates the codec for converting MoveDetail from and to JSON.
     */
    implicit val decoder: Decoder[MoveDetail] = deriveDecoder
    implicit val encoder: ObjectEncoder[MoveDetail] = deriveEncoder
}
