package model

import play.api.libs.json._
import java.net.URI

/**
  * Represents the Swagger definition for PokemonDetail_sprites.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PokemonDetailSprites(
  frontDefault: Option[URI]
  additionalProperties: Map[String, URI]
)

object PokemonDetailSprites {
  implicit lazy val pokemonDetailSpritesJsonFormat: Format[PokemonDetailSprites] = {
    val realJsonFormat = Json.format[PokemonDetailSprites]
    val declaredPropNames = Set("frontDefault")
    
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
      Writes { pokemonDetailSprites =>
        val jsObj = realJsonFormat.writes(pokemonDetailSprites)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

