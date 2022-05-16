/**
 * 
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.api

import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

object AbilityApi {

  def apply(baseUrl: String = "https://pokeapi.co/api/v2") = new AbilityApi(baseUrl)
}

class AbilityApi(baseUrl: String) {

  /**
   * Expected answers:
   *   code 0 : String (Default response)
   * 
   * @param limit 
   * @param offset 
   */
  def abilityList(limit: Option[Int] = None, offset: Option[Int] = None): ApiRequest[String] =
    ApiRequest[String](ApiMethods.GET, baseUrl, "/api/v2/ability/", "application/json")
      .withQueryParam("limit", limit)
      .withQueryParam("offset", offset)
      .withDefaultErrorResponse[String]
      

  /**
   * Expected answers:
   *   code 0 : String (Default response)
   * 
   * @param id 
   */
  def abilityRead(id: Int): ApiRequest[String] =
    ApiRequest[String](ApiMethods.GET, baseUrl, "/api/v2/ability/{id}/", "application/json")
      .withPathParam("id", id)
      .withDefaultErrorResponse[String]
      



}

