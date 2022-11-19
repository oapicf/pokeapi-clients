/**
 * 
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 20220523
 * Contact: blah@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.api

import org.openapitools.client.core.JsonSupport._
import sttp.client3._
import sttp.model.Method

object PokemonFormApi {

def apply(baseUrl: String = "https://pokeapi.co") = new PokemonFormApi(baseUrl)
}

class PokemonFormApi(baseUrl: String) {

  /**
   * Expected answers:
   *   code 0 : String (Default response)
   * 
   * @param limit 
   * @param offset 
   */
  def pokemonFormList(limit: Option[Int] = None, offset: Option[Int] = None
): Request[Either[Either[String, String], Unit], Any] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/api/v2/pokemon-form/?limit=${ limit }&offset=${ offset }")
      .contentType("application/json")
      .response(asEither(asString, ignore))

  /**
   * Expected answers:
   *   code 0 : String (Default response)
   * 
   * @param id 
   */
  def pokemonFormRead(id: Int
): Request[Either[Either[String, String], Unit], Any] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/api/v2/pokemon-form/${id}/")
      .contentType("application/json")
      .response(asEither(asString, ignore))

}