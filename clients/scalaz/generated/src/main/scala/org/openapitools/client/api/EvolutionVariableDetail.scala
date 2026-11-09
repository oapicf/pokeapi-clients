package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EvolutionVariableDetail._

case class EvolutionVariableDetail (
  /* The identifier for this resource. */
  id: Integer,
/* The name for this resource. */
  name: String,
/* The symbol used for this variable in evolution condition expressions. */
  symbol: String,
/* The data type of this variable. */
  dataType: Option[String],
/* The source of the variable value. */
  source: Option[String],
/* The version group in which this variable was introduced. */
  versionGroup: VersionGroupSummary,
/* The name of this resource listed in different languages. */
  names: List[EvolutionVariableName],
/* The description of this resource listed in different languages. */
  descriptions: List[EvolutionVariableDescription])

object EvolutionVariableDetail {
  import DateTimeCodecs._

  implicit val EvolutionVariableDetailCodecJson: CodecJson[EvolutionVariableDetail] = CodecJson.derive[EvolutionVariableDetail]
  implicit val EvolutionVariableDetailDecoder: EntityDecoder[EvolutionVariableDetail] = jsonOf[EvolutionVariableDetail]
  implicit val EvolutionVariableDetailEncoder: EntityEncoder[EvolutionVariableDetail] = jsonEncoderOf[EvolutionVariableDetail]
}
