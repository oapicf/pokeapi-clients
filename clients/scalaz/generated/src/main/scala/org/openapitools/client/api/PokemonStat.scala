package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonStat._

case class PokemonStat (
  baseStat: Integer,
effort: Integer,
stat: StatSummary)

object PokemonStat {
  import DateTimeCodecs._

  implicit val PokemonStatCodecJson: CodecJson[PokemonStat] = CodecJson.derive[PokemonStat]
  implicit val PokemonStatDecoder: EntityDecoder[PokemonStat] = jsonOf[PokemonStat]
  implicit val PokemonStatEncoder: EntityEncoder[PokemonStat] = jsonEncoderOf[PokemonStat]
}
