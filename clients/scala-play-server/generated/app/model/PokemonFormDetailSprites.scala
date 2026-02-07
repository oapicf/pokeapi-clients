package model

import play.api.libs.json._
import java.net.URI

/**
  * Represents the Swagger definition for PokemonFormDetail_sprites.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PokemonFormDetailSprites(
  default: Option[URI]
  additionalProperties: Map[String, URI]
)

object PokemonFormDetailSprites {
  implicit lazy val pokemonFormDetailSpritesJsonFormat: Format[PokemonFormDetailSprites] = {
    val realJsonFormat = Json.format[PokemonFormDetailSprites]
    val declaredPropNames = Set("default")
    
    Format(
      Reads {
        case JsObject(xs) =>
          val declaredProps = xs.filterKeys(declaredPropNames)
          val additionalProps = JsObject(xs -- declaredPropNames)
          val restructuredProps = declaredProps + ("additionalProperties" -> additionalProps)
          val newObj = JsObject(restructuredProps)
          realJsonFormat.reads(newObj)
        case _ =>
          JsError("error.expected.jsobject")
      },
      Writes { pokemonFormDetailSprites =>
        val jsObj = realJsonFormat.writes(pokemonFormDetailSprites)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

