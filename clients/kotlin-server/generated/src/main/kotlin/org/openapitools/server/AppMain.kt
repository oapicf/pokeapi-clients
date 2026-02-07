package org.openapitools.server

import io.ktor.server.application.*
import io.ktor.http.*
import io.ktor.server.resources.*
import io.ktor.server.plugins.autohead.*
import io.ktor.server.plugins.compression.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.plugins.defaultheaders.*
import io.ktor.server.plugins.hsts.*
import com.codahale.metrics.Slf4jReporter
import io.ktor.server.metrics.dropwizard.*
import java.util.concurrent.TimeUnit
import io.ktor.server.routing.*
import io.ktor.serialization.kotlinx.json.json
import com.typesafe.config.ConfigFactory
import io.ktor.client.HttpClient
import io.ktor.client.engine.apache.Apache
import io.ktor.server.config.HoconApplicationConfig
import io.ktor.server.auth.*
import org.openapitools.server.infrastructure.*
import org.openapitools.server.apis.BerriesApi
import org.openapitools.server.apis.ContestsApi
import org.openapitools.server.apis.EncountersApi
import org.openapitools.server.apis.EvolutionApi
import org.openapitools.server.apis.GamesApi
import org.openapitools.server.apis.ItemsApi
import org.openapitools.server.apis.LocationApi
import org.openapitools.server.apis.MachinesApi
import org.openapitools.server.apis.MovesApi
import org.openapitools.server.apis.PokemonApi
import org.openapitools.server.apis.UtilityApi


fun Application.main() {
    install(DefaultHeaders)
    install(DropwizardMetrics) {
        val reporter = Slf4jReporter.forRegistry(registry)
            .outputTo(this@main.log)
            .convertRatesTo(TimeUnit.SECONDS)
            .convertDurationsTo(TimeUnit.MILLISECONDS)
            .build()
        reporter.start(10, TimeUnit.SECONDS)
    }
    install(ContentNegotiation) {
        json()
    }
    install(AutoHeadResponse) // see https://ktor.io/docs/autoheadresponse.html
    install(Compression, ApplicationCompressionConfiguration()) // see https://ktor.io/docs/compression.html
    install(HSTS, ApplicationHstsConfiguration()) // see https://ktor.io/docs/hsts.html
    install(Resources)
    install(Authentication) {
        basic("basicAuth") {
        validate { credentials ->
            // TODO: "Apply your basic authentication functionality."
            // Accessible in-method via call.principal<UserIdPrincipal>()
            if (credentials.name == "Swagger" && "Codegen" == credentials.password) {
                UserIdPrincipal(credentials.name)
            } else {
                null
            }
        }
        // "Implement API key auth (cookieAuth) for parameter name 'sessionid'."
        apiKeyAuth("cookieAuth") {
            validate { apikeyCredential: ApiKeyCredential ->
                when {
                    apikeyCredential.value == "keyboardcat" -> ApiPrincipal(apikeyCredential)
                    else -> null
                }
            }
        }
    }
    routing {
        BerriesApi()
        ContestsApi()
        EncountersApi()
        EvolutionApi()
        GamesApi()
        ItemsApi()
        LocationApi()
        MachinesApi()
        MovesApi()
        PokemonApi()
        UtilityApi()
    }
}
