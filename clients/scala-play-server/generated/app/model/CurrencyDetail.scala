package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CurrencyDetail.
  * @param id The identifier for this resource.
  * @param name The name for this resource.
  * @param names The name of this resource listed in different languages.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CurrencyDetail(
  id: Int,
  name: String,
  names: List[CurrencyName]
)

object CurrencyDetail {
  implicit lazy val currencyDetailJsonFormat: Format[CurrencyDetail] = Json.format[CurrencyDetail]
}

