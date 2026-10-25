package org.openapitools

import api._
import play.api.inject.{Binding, Module => PlayModule}
import play.api.{Configuration, Environment}

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-25T05:53:17.467323765Z[Etc/UTC]", comments = "Generator version: 7.26.0")
class Module extends PlayModule {
  override def bindings(environment: Environment, configuration: Configuration): Seq[Binding[_]] = Seq(
    bind[BerriesApi].to[BerriesApiImpl],
    bind[ContestsApi].to[ContestsApiImpl],
    bind[EncountersApi].to[EncountersApiImpl],
    bind[EvolutionApi].to[EvolutionApiImpl],
    bind[GamesApi].to[GamesApiImpl],
    bind[ItemsApi].to[ItemsApiImpl],
    bind[LocationApi].to[LocationApiImpl],
    bind[MachinesApi].to[MachinesApiImpl],
    bind[MovesApi].to[MovesApiImpl],
    bind[PokemonApi].to[PokemonApiImpl],
    bind[UtilityApi].to[UtilityApiImpl]
  )
}
