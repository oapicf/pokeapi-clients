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

package io.swagger.client.api

import akka.{Done, NotUsed}
import com.lightbend.lagom.scaladsl.api.transport.Method
import com.lightbend.lagom.scaladsl.api.{Service, ServiceCall}
import play.api.libs.json._
import com.lightbend.lagom.scaladsl.api.deser.PathParamSerializer


trait LocationAreaApi extends Service {


  final override def descriptor = {
    import Service._
    named("LocationAreaApi").withCalls(
      restCall(Method.GET, "/api/v2/location-area/?limit&offset", locationAreaList _), 
      restCall(Method.GET, "/api/v2/location-area/:id/", locationAreaRead _)
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
  def locationAreaList(limit:           Option[Int] = None,offset:           Option[Int] = None): ServiceCall[NotUsed ,String]
  
  /**
    * 
    * 
    *  
    * @param id  
    * @return String
    */
  def locationAreaRead(id: Int): ServiceCall[NotUsed ,String]
  

  }
