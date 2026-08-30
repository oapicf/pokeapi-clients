//> using scala "3.4.1"
//> using lib "org.openapitools::caskgen:0.0.1"
//> using repositories https://maven.pkg.github.com/null/null


/**
* This single file can contain the business logic for a REST service.
* ====================================
* == zero-install build with docker ==
* ====================================
*
*
* ```
* docker build . -t caskgen:latest
* ```
* ======================
* == Building Locally ==
* ======================
* This project can be built using [[scala-cli][https://scala-cli.virtuslab.org]]
*
* To simply run the project
* ```
* scala-cli Server.scala
* ```
*
* To create a runnable jar, run:
* ```
* scala-cli --power package Server.scala -o app-assembly --assembly
* ```
*
* To produce a docker image (no need for the Dockerfile), run:
* ```
* scala-cli --power package --docker Server.scala --docker-image-repository app-docker
* ```
*
* To generate an IDE project:
* ```
* scala-cli setup-ide . --scala 3.3
* ```
*/
package app

import org.openapitools.server.BaseApp
import org.openapitools.server.api.*
import org.openapitools.server.model.*

import java.io.File

// TODO - write your business logic for your services here (the defaults all return 'not implemented'):
val myBerriesService : BerriesService = BerriesService() // <-- replace this with your implementation
val myContestsService : ContestsService = ContestsService() // <-- replace this with your implementation
val myEncountersService : EncountersService = EncountersService() // <-- replace this with your implementation
val myEvolutionService : EvolutionService = EvolutionService() // <-- replace this with your implementation
val myGamesService : GamesService = GamesService() // <-- replace this with your implementation
val myItemsService : ItemsService = ItemsService() // <-- replace this with your implementation
val myLocationService : LocationService = LocationService() // <-- replace this with your implementation
val myMachinesService : MachinesService = MachinesService() // <-- replace this with your implementation
val myMovesService : MovesService = MovesService() // <-- replace this with your implementation
val myPokemonService : PokemonService = PokemonService() // <-- replace this with your implementation
val myUtilityService : UtilityService = UtilityService() // <-- replace this with your implementation

/** This is your main entry point for your REST service
 *  It extends BaseApp which defines the business logic for your services
 */
object Server extends BaseApp(appBerriesService = myBerriesService,
appContestsService = myContestsService,
appEncountersService = myEncountersService,
appEvolutionService = myEvolutionService,
appGamesService = myGamesService,
appItemsService = myItemsService,
appLocationService = myLocationService,
appMachinesService = myMachinesService,
appMovesService = myMovesService,
appPokemonService = myPokemonService,
appUtilityService = myUtilityService):
  start()

