@file:Suppress(
    "RemoveRedundantQualifierName",
    "UnusedImport",
    "unused",
)

package org.openapitools.apis

import com.fasterxml.jackson.databind.ObjectMapper
import com.github.tomakehurst.wiremock.client.MappingBuilder
import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder
import com.github.tomakehurst.wiremock.client.WireMock.*
import com.github.tomakehurst.wiremock.matching.StringValuePattern
import org.openapitools.models.*

/**
 * WireMock stub request builder.
 */
open class PokemonApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation abilityList.
     *
     * @param limit query parameter limit pattern.
     * @param offset query parameter offset pattern.
     * @param q query parameter q pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AbilityListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun abilityList(limit: StringValuePattern? = null, offset: StringValuePattern? = null, q: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): AbilityListStubBuilder =
        AbilityListStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/ability/"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { offset?.let { withQueryParam("offset", it) } }
            .apply { q?.let { withQueryParam("q", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation abilityRetrieve.
     *
     * @param id path parameter id pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AbilityRetrieveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun abilityRetrieve(id: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): AbilityRetrieveStubBuilder =
        AbilityRetrieveStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/ability/{id}/"))
            .withPathParam("id", id)
            .configurer()
        )

    /**
     * Construct a stub for the operation characteristicList.
     *
     * @param limit query parameter limit pattern.
     * @param offset query parameter offset pattern.
     * @param q query parameter q pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CharacteristicListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun characteristicList(limit: StringValuePattern? = null, offset: StringValuePattern? = null, q: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): CharacteristicListStubBuilder =
        CharacteristicListStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/characteristic/"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { offset?.let { withQueryParam("offset", it) } }
            .apply { q?.let { withQueryParam("q", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation characteristicRetrieve.
     *
     * @param id path parameter id pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CharacteristicRetrieveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun characteristicRetrieve(id: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): CharacteristicRetrieveStubBuilder =
        CharacteristicRetrieveStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/characteristic/{id}/"))
            .withPathParam("id", id)
            .configurer()
        )

    /**
     * Construct a stub for the operation eggGroupList.
     *
     * @param limit query parameter limit pattern.
     * @param offset query parameter offset pattern.
     * @param q query parameter q pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [EggGroupListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun eggGroupList(limit: StringValuePattern? = null, offset: StringValuePattern? = null, q: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): EggGroupListStubBuilder =
        EggGroupListStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/egg-group/"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { offset?.let { withQueryParam("offset", it) } }
            .apply { q?.let { withQueryParam("q", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation eggGroupRetrieve.
     *
     * @param id path parameter id pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [EggGroupRetrieveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun eggGroupRetrieve(id: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): EggGroupRetrieveStubBuilder =
        EggGroupRetrieveStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/egg-group/{id}/"))
            .withPathParam("id", id)
            .configurer()
        )

    /**
     * Construct a stub for the operation genderList.
     *
     * @param limit query parameter limit pattern.
     * @param offset query parameter offset pattern.
     * @param q query parameter q pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GenderListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun genderList(limit: StringValuePattern? = null, offset: StringValuePattern? = null, q: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GenderListStubBuilder =
        GenderListStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/gender/"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { offset?.let { withQueryParam("offset", it) } }
            .apply { q?.let { withQueryParam("q", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation genderRetrieve.
     *
     * @param id path parameter id pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GenderRetrieveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun genderRetrieve(id: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GenderRetrieveStubBuilder =
        GenderRetrieveStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/gender/{id}/"))
            .withPathParam("id", id)
            .configurer()
        )

    /**
     * Construct a stub for the operation growthRateList.
     *
     * @param limit query parameter limit pattern.
     * @param offset query parameter offset pattern.
     * @param q query parameter q pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GrowthRateListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun growthRateList(limit: StringValuePattern? = null, offset: StringValuePattern? = null, q: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GrowthRateListStubBuilder =
        GrowthRateListStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/growth-rate/"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { offset?.let { withQueryParam("offset", it) } }
            .apply { q?.let { withQueryParam("q", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation growthRateRetrieve.
     *
     * @param id path parameter id pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GrowthRateRetrieveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun growthRateRetrieve(id: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GrowthRateRetrieveStubBuilder =
        GrowthRateRetrieveStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/growth-rate/{id}/"))
            .withPathParam("id", id)
            .configurer()
        )

    /**
     * Construct a stub for the operation moveDamageClassList.
     *
     * @param limit query parameter limit pattern.
     * @param offset query parameter offset pattern.
     * @param q query parameter q pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [MoveDamageClassListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun moveDamageClassList(limit: StringValuePattern? = null, offset: StringValuePattern? = null, q: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): MoveDamageClassListStubBuilder =
        MoveDamageClassListStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/move-damage-class/"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { offset?.let { withQueryParam("offset", it) } }
            .apply { q?.let { withQueryParam("q", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation moveDamageClassRetrieve.
     *
     * @param id path parameter id pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [MoveDamageClassRetrieveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun moveDamageClassRetrieve(id: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): MoveDamageClassRetrieveStubBuilder =
        MoveDamageClassRetrieveStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/move-damage-class/{id}/"))
            .withPathParam("id", id)
            .configurer()
        )

    /**
     * Construct a stub for the operation natureList.
     *
     * @param limit query parameter limit pattern.
     * @param offset query parameter offset pattern.
     * @param q query parameter q pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [NatureListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun natureList(limit: StringValuePattern? = null, offset: StringValuePattern? = null, q: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): NatureListStubBuilder =
        NatureListStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/nature/"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { offset?.let { withQueryParam("offset", it) } }
            .apply { q?.let { withQueryParam("q", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation natureRetrieve.
     *
     * @param id path parameter id pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [NatureRetrieveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun natureRetrieve(id: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): NatureRetrieveStubBuilder =
        NatureRetrieveStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/nature/{id}/"))
            .withPathParam("id", id)
            .configurer()
        )

    /**
     * Construct a stub for the operation pokeathlonStatList.
     *
     * @param limit query parameter limit pattern.
     * @param offset query parameter offset pattern.
     * @param q query parameter q pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PokeathlonStatListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun pokeathlonStatList(limit: StringValuePattern? = null, offset: StringValuePattern? = null, q: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): PokeathlonStatListStubBuilder =
        PokeathlonStatListStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/pokeathlon-stat/"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { offset?.let { withQueryParam("offset", it) } }
            .apply { q?.let { withQueryParam("q", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation pokeathlonStatRetrieve.
     *
     * @param id path parameter id pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PokeathlonStatRetrieveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun pokeathlonStatRetrieve(id: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): PokeathlonStatRetrieveStubBuilder =
        PokeathlonStatRetrieveStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/pokeathlon-stat/{id}/"))
            .withPathParam("id", id)
            .configurer()
        )

    /**
     * Construct a stub for the operation pokemonColorList.
     *
     * @param limit query parameter limit pattern.
     * @param offset query parameter offset pattern.
     * @param q query parameter q pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PokemonColorListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun pokemonColorList(limit: StringValuePattern? = null, offset: StringValuePattern? = null, q: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): PokemonColorListStubBuilder =
        PokemonColorListStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/pokemon-color/"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { offset?.let { withQueryParam("offset", it) } }
            .apply { q?.let { withQueryParam("q", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation pokemonColorRetrieve.
     *
     * @param id path parameter id pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PokemonColorRetrieveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun pokemonColorRetrieve(id: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): PokemonColorRetrieveStubBuilder =
        PokemonColorRetrieveStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/pokemon-color/{id}/"))
            .withPathParam("id", id)
            .configurer()
        )

    /**
     * Construct a stub for the operation pokemonFormList.
     *
     * @param limit query parameter limit pattern.
     * @param offset query parameter offset pattern.
     * @param q query parameter q pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PokemonFormListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun pokemonFormList(limit: StringValuePattern? = null, offset: StringValuePattern? = null, q: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): PokemonFormListStubBuilder =
        PokemonFormListStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/pokemon-form/"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { offset?.let { withQueryParam("offset", it) } }
            .apply { q?.let { withQueryParam("q", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation pokemonFormRetrieve.
     *
     * @param id path parameter id pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PokemonFormRetrieveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun pokemonFormRetrieve(id: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): PokemonFormRetrieveStubBuilder =
        PokemonFormRetrieveStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/pokemon-form/{id}/"))
            .withPathParam("id", id)
            .configurer()
        )

    /**
     * Construct a stub for the operation pokemonHabitatList.
     *
     * @param limit query parameter limit pattern.
     * @param offset query parameter offset pattern.
     * @param q query parameter q pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PokemonHabitatListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun pokemonHabitatList(limit: StringValuePattern? = null, offset: StringValuePattern? = null, q: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): PokemonHabitatListStubBuilder =
        PokemonHabitatListStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/pokemon-habitat/"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { offset?.let { withQueryParam("offset", it) } }
            .apply { q?.let { withQueryParam("q", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation pokemonHabitatRetrieve.
     *
     * @param id path parameter id pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PokemonHabitatRetrieveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun pokemonHabitatRetrieve(id: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): PokemonHabitatRetrieveStubBuilder =
        PokemonHabitatRetrieveStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/pokemon-habitat/{id}/"))
            .withPathParam("id", id)
            .configurer()
        )

    /**
     * Construct a stub for the operation pokemonList.
     *
     * @param limit query parameter limit pattern.
     * @param offset query parameter offset pattern.
     * @param q query parameter q pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PokemonListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun pokemonList(limit: StringValuePattern? = null, offset: StringValuePattern? = null, q: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): PokemonListStubBuilder =
        PokemonListStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/pokemon/"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { offset?.let { withQueryParam("offset", it) } }
            .apply { q?.let { withQueryParam("q", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation pokemonRetrieve.
     *
     * @param id path parameter id pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PokemonRetrieveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun pokemonRetrieve(id: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): PokemonRetrieveStubBuilder =
        PokemonRetrieveStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/pokemon/{id}/"))
            .withPathParam("id", id)
            .configurer()
        )

    /**
     * Construct a stub for the operation pokemonShapeList.
     *
     * @param limit query parameter limit pattern.
     * @param offset query parameter offset pattern.
     * @param q query parameter q pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PokemonShapeListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun pokemonShapeList(limit: StringValuePattern? = null, offset: StringValuePattern? = null, q: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): PokemonShapeListStubBuilder =
        PokemonShapeListStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/pokemon-shape/"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { offset?.let { withQueryParam("offset", it) } }
            .apply { q?.let { withQueryParam("q", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation pokemonShapeRetrieve.
     *
     * @param id path parameter id pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PokemonShapeRetrieveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun pokemonShapeRetrieve(id: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): PokemonShapeRetrieveStubBuilder =
        PokemonShapeRetrieveStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/pokemon-shape/{id}/"))
            .withPathParam("id", id)
            .configurer()
        )

    /**
     * Construct a stub for the operation pokemonSpeciesList.
     *
     * @param limit query parameter limit pattern.
     * @param offset query parameter offset pattern.
     * @param q query parameter q pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PokemonSpeciesListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun pokemonSpeciesList(limit: StringValuePattern? = null, offset: StringValuePattern? = null, q: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): PokemonSpeciesListStubBuilder =
        PokemonSpeciesListStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/pokemon-species/"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { offset?.let { withQueryParam("offset", it) } }
            .apply { q?.let { withQueryParam("q", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation pokemonSpeciesRetrieve.
     *
     * @param id path parameter id pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PokemonSpeciesRetrieveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun pokemonSpeciesRetrieve(id: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): PokemonSpeciesRetrieveStubBuilder =
        PokemonSpeciesRetrieveStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/pokemon-species/{id}/"))
            .withPathParam("id", id)
            .configurer()
        )

    /**
     * Construct a stub for the operation statList.
     *
     * @param limit query parameter limit pattern.
     * @param offset query parameter offset pattern.
     * @param q query parameter q pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [StatListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun statList(limit: StringValuePattern? = null, offset: StringValuePattern? = null, q: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): StatListStubBuilder =
        StatListStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/stat/"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { offset?.let { withQueryParam("offset", it) } }
            .apply { q?.let { withQueryParam("q", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation statRetrieve.
     *
     * @param id path parameter id pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [StatRetrieveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun statRetrieve(id: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): StatRetrieveStubBuilder =
        StatRetrieveStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/stat/{id}/"))
            .withPathParam("id", id)
            .configurer()
        )

    /**
     * Construct a stub for the operation typeList.
     *
     * @param limit query parameter limit pattern.
     * @param offset query parameter offset pattern.
     * @param q query parameter q pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [TypeListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun typeList(limit: StringValuePattern? = null, offset: StringValuePattern? = null, q: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): TypeListStubBuilder =
        TypeListStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/type/"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { offset?.let { withQueryParam("offset", it) } }
            .apply { q?.let { withQueryParam("q", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation typeRetrieve.
     *
     * @param id path parameter id pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [TypeRetrieveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun typeRetrieve(id: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): TypeRetrieveStubBuilder =
        TypeRetrieveStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/type/{id}/"))
            .withPathParam("id", id)
            .configurer()
        )
}
