package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.net.URI

/**
 * 
 * @param url 
 */
case class MoveDetailMachinesInnerMachine(url: URI
                )

object MoveDetailMachinesInnerMachine {
    /**
     * Creates the codec for converting MoveDetailMachinesInnerMachine from and to JSON.
     */
    implicit val decoder: Decoder[MoveDetailMachinesInnerMachine] = deriveDecoder
    implicit val encoder: ObjectEncoder[MoveDetailMachinesInnerMachine] = deriveEncoder
}
