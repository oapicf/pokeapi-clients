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
package org.openapitools.server.apis

import com.google.gson.Gson
import io.ktor.application.call
import io.ktor.auth.UserIdPrincipal
import io.ktor.auth.authentication
import io.ktor.auth.authenticate
import io.ktor.auth.OAuthAccessTokenResponse
import io.ktor.auth.OAuthServerSettings
import io.ktor.http.ContentType
import io.ktor.http.HttpStatusCode
import io.ktor.locations.KtorExperimentalLocationsAPI
import io.ktor.locations.delete
import io.ktor.locations.get
import io.ktor.response.respond
import io.ktor.response.respondText
import io.ktor.routing.Route
import io.ktor.routing.post
import io.ktor.routing.put
import io.ktor.routing.route

import org.openapitools.server.Paths
import org.openapitools.server.infrastructure.ApiPrincipal



@KtorExperimentalLocationsAPI
fun Route.PokemonColorApi() {
    val gson = Gson()
    val empty = mutableMapOf<String, Any?>()

    get<Paths.pokemonColorList> {  _: Paths.pokemonColorList ->
        call.respond(HttpStatusCode.NotImplemented)
    }


    get<Paths.pokemonColorRead> {  _: Paths.pokemonColorRead ->
        call.respond(HttpStatusCode.NotImplemented)
    }

}
