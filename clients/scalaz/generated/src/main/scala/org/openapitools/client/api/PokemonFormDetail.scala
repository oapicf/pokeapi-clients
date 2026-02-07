package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonFormDetail._

case class PokemonFormDetail (
  id: Integer,
name: String,
order: Option[Integer],
formOrder: Option[Integer],
isDefault: Option[Boolean],
isBattleOnly: Option[Boolean],
isMega: Option[Boolean],
formName: String,
pokemon: PokemonSummary,
sprites: PokemonFormDetailSprites,
versionGroup: VersionGroupSummary,
formNames: List[PokemonFormDetailFormNamesInner],
names: List[PokemonFormDetailFormNamesInner],
types: List[PokemonDetailTypesInner])

object PokemonFormDetail {
  import DateTimeCodecs._

  implicit val PokemonFormDetailCodecJson: CodecJson[PokemonFormDetail] = CodecJson.derive[PokemonFormDetail]
  implicit val PokemonFormDetailDecoder: EntityDecoder[PokemonFormDetail] = jsonOf[PokemonFormDetail]
  implicit val PokemonFormDetailEncoder: EntityEncoder[PokemonFormDetail] = jsonEncoderOf[PokemonFormDetail]
}
