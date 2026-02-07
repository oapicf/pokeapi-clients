package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import ItemDetailMachinesInner._

case class ItemDetailMachinesInner (
  machine: URI,
versionGroup: AbilityDetailPokemonInnerPokemon)

object ItemDetailMachinesInner {
  import DateTimeCodecs._

  implicit val ItemDetailMachinesInnerCodecJson: CodecJson[ItemDetailMachinesInner] = CodecJson.derive[ItemDetailMachinesInner]
  implicit val ItemDetailMachinesInnerDecoder: EntityDecoder[ItemDetailMachinesInner] = jsonOf[ItemDetailMachinesInner]
  implicit val ItemDetailMachinesInnerEncoder: EntityEncoder[ItemDetailMachinesInner] = jsonEncoderOf[ItemDetailMachinesInner]
}
