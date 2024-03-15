/**
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 20220523
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.swagger.client.api

import akka.{Done, NotUsed}
import com.lightbend.lagom.scaladsl.api.transport.Method
import com.lightbend.lagom.scaladsl.api.{Service, ServiceCall}
import play.api.libs.json._
import com.lightbend.lagom.scaladsl.api.deser.PathParamSerializer


trait RegionApi extends Service {


  final override def descriptor = {
    import Service._
    named("RegionApi").withCalls(
      restCall(Method.GET, "/api/v2/region/?limit&offset", regionList _),
      restCall(Method.GET, "/api/v2/region/:id/", regionRead _)
    ).withAutoAcl(true)
  }


  /**
    *
    *
    *
    * @param limit  (optional)
    * @param offset  (optional)
    * @return String
    */
  def regionList(limit:           Option[Int] = None,offset:           Option[Int] = None): ServiceCall[NotUsed ,String]

  /**
    *
    *
    *
    * @param id
    * @return String
    */
  def regionRead(id: Int): ServiceCall[NotUsed ,String]


  }
