package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AbilityDetail._

case class AbilityDetail (
  /* The identifier for this resource. */
  id: Integer,
/* The name for this resource. */
  name: String,
/* Whether or not this ability originated in the main series of the video games. */
  isMainSeries: Option[Boolean],
/* The generation this ability originated in. */
  generation: GenerationSummary,
/* The name of this resource listed in different languages. */
  names: List[AbilityName],
/* The effect of this ability listed in different languages. */
  effectEntries: List[AbilityEffectText],
/* The list of previous effects this ability has had across version groups. */
  effectChanges: List[AbilityChange],
/* The flavor text of this ability listed in different languages. */
  flavorTextEntries: List[AbilityFlavorText],
/* A list of Pokémon that could potentially have this ability. */
  pokemon: List[AbilityPokemonDetail])

object AbilityDetail {
  import DateTimeCodecs._

  implicit val AbilityDetailCodecJson: CodecJson[AbilityDetail] = CodecJson.derive[AbilityDetail]
  implicit val AbilityDetailDecoder: EntityDecoder[AbilityDetail] = jsonOf[AbilityDetail]
  implicit val AbilityDetailEncoder: EntityEncoder[AbilityDetail] = jsonEncoderOf[AbilityDetail]
}
