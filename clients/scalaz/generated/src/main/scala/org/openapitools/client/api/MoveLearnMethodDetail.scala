package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MoveLearnMethodDetail._

case class MoveLearnMethodDetail (
  /* The identifier for this resource. */
  id: Integer,
/* The name for this resource. */
  name: String,
/* The name of this resource listed in different languages. */
  names: List[MoveLearnMethodName],
/* The description of this resource listed in different languages. */
  descriptions: List[MoveLearnMethodDescription],
/* A list of version groups where moves can be learned through this method. */
  versionGroups: List[VersionGroupSummary])

object MoveLearnMethodDetail {
  import DateTimeCodecs._

  implicit val MoveLearnMethodDetailCodecJson: CodecJson[MoveLearnMethodDetail] = CodecJson.derive[MoveLearnMethodDetail]
  implicit val MoveLearnMethodDetailDecoder: EntityDecoder[MoveLearnMethodDetail] = jsonOf[MoveLearnMethodDetail]
  implicit val MoveLearnMethodDetailEncoder: EntityEncoder[MoveLearnMethodDetail] = jsonEncoderOf[MoveLearnMethodDetail]
}
