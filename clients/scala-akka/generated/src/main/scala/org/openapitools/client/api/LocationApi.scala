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

object LocationApi {

  def apply(baseUrl: String = "https://pokeapi.co/api/v2") = new LocationApi(baseUrl)
}

class LocationApi(baseUrl: String) {

  /**
   * Expected answers:
   *   code 0 : String (Default response)
   * 
   * @param limit 
   * @param offset 
   */
  def locationList(limit: Option[Int] = None, offset: Option[Int] = None): ApiRequest[String] =
    ApiRequest[String](ApiMethods.GET, baseUrl, "/api/v2/location/", "application/json")
      .withQueryParam("limit", limit)
      .withQueryParam("offset", offset)
      .withDefaultErrorResponse[String]
      

  /**
   * Expected answers:
   *   code 0 : String (Default response)
   * 
   * @param id 
   */
  def locationRead(id: Int): ApiRequest[String] =
    ApiRequest[String](ApiMethods.GET, baseUrl, "/api/v2/location/{id}/", "application/json")
      .withPathParam("id", id)
      .withDefaultErrorResponse[String]
      



}

