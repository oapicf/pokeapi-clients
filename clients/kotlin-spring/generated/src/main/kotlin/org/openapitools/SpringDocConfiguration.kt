package org.openapitools

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.info.Contact
import io.swagger.v3.oas.models.info.License
import io.swagger.v3.oas.models.Components
import io.swagger.v3.oas.models.security.SecurityScheme

@Configuration
class SpringDocConfiguration {

    @Bean
    fun apiInfo(): OpenAPI {
        return OpenAPI()
            .info(
                Info()
                    .title("PokéAPI")
                    .description("All the Pokémon data you'll ever need in one place, easily accessible through a modern free open-source RESTful API.  ## What is this?  This is a full RESTful API linked to an extensive database detailing everything about the Pokémon main game series.  We've covered everything from Pokémon to Berry Flavors.  ## Where do I start?  We have awesome [documentation](https://pokeapi.co/docs/v2) on how to use this API. It takes minutes to get started.  This API will always be publicly available and will never require any extensive setup process to consume.  Created by [**Paul Hallett**(]https://github.com/phalt) and other [**PokéAPI contributors***](https://github.com/PokeAPI/pokeapi#contributing) around the world. Pokémon and Pokémon character names are trademarks of Nintendo.     ")
                    .contact(
                        Contact()
                            .name("OpenAPI Clients Factory")
                            .url("https://github.com/oapicf/pokeapi-clients")
                            .email("blah+oapicf@cliffano.com")
                    )
                    .version("2.7.0")
            )
            .components(
                Components()
                    .addSecuritySchemes("basicAuth", SecurityScheme()
                        .type(SecurityScheme.Type.HTTP)
                        .scheme("basic")
                    )
                    .addSecuritySchemes("cookieAuth", SecurityScheme()
                        .type(SecurityScheme.Type.APIKEY)
                        .`in`(SecurityScheme.In.COOKIE)
                        .name("sessionid")
                    )
            )
    }
}
