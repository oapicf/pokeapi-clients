/**
* 
* No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
*
* The version of the OpenAPI document: 20220523
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.server.apis

import com.google.gson.Gson
import io.ktor.application.*
import io.ktor.auth.*
import io.ktor.http.*
import io.ktor.response.*
import org.openapitools.server.Paths
import io.ktor.locations.*
import io.ktor.routing.*
import org.openapitools.server.infrastructure.ApiPrincipal

@KtorExperimentalLocationsAPI
fun Route.PokemonShapeApi() {
    val gson = Gson()
    val empty = mutableMapOf<String, Any?>()

    get<Paths.pokemonShapeList> {
        call.respond(HttpStatusCode.NotImplemented)
    }

    get<Paths.pokemonShapeRead> {
        call.respond(HttpStatusCode.NotImplemented)
    }

}
