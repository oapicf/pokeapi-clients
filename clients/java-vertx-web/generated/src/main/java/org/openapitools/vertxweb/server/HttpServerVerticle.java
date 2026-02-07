package org.openapitools.vertxweb.server;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import io.vertx.core.http.HttpServerOptions;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.openapi.RouterBuilder;
import io.vertx.ext.web.openapi.RouterBuilderOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.openapitools.vertxweb.server.api.BerriesApiHandler;
import org.openapitools.vertxweb.server.api.BerriesApiImpl;
import org.openapitools.vertxweb.server.api.ContestsApiHandler;
import org.openapitools.vertxweb.server.api.ContestsApiImpl;
import org.openapitools.vertxweb.server.api.EncountersApiHandler;
import org.openapitools.vertxweb.server.api.EncountersApiImpl;
import org.openapitools.vertxweb.server.api.EvolutionApiHandler;
import org.openapitools.vertxweb.server.api.EvolutionApiImpl;
import org.openapitools.vertxweb.server.api.GamesApiHandler;
import org.openapitools.vertxweb.server.api.GamesApiImpl;
import org.openapitools.vertxweb.server.api.ItemsApiHandler;
import org.openapitools.vertxweb.server.api.ItemsApiImpl;
import org.openapitools.vertxweb.server.api.LocationApiHandler;
import org.openapitools.vertxweb.server.api.LocationApiImpl;
import org.openapitools.vertxweb.server.api.MachinesApiHandler;
import org.openapitools.vertxweb.server.api.MachinesApiImpl;
import org.openapitools.vertxweb.server.api.MovesApiHandler;
import org.openapitools.vertxweb.server.api.MovesApiImpl;
import org.openapitools.vertxweb.server.api.PokemonApiHandler;
import org.openapitools.vertxweb.server.api.PokemonApiImpl;
import org.openapitools.vertxweb.server.api.UtilityApiHandler;
import org.openapitools.vertxweb.server.api.UtilityApiImpl;

public class HttpServerVerticle extends AbstractVerticle {

    private static final Logger logger = LoggerFactory.getLogger(HttpServerVerticle.class);
    private static final String specFile = "src/main/resources/openapi.yaml";

    
    private final BerriesApiHandler berriesHandler = new BerriesApiHandler(new BerriesApiImpl());
    private final ContestsApiHandler contestsHandler = new ContestsApiHandler(new ContestsApiImpl());
    private final EncountersApiHandler encountersHandler = new EncountersApiHandler(new EncountersApiImpl());
    private final EvolutionApiHandler evolutionHandler = new EvolutionApiHandler(new EvolutionApiImpl());
    private final GamesApiHandler gamesHandler = new GamesApiHandler(new GamesApiImpl());
    private final ItemsApiHandler itemsHandler = new ItemsApiHandler(new ItemsApiImpl());
    private final LocationApiHandler locationHandler = new LocationApiHandler(new LocationApiImpl());
    private final MachinesApiHandler machinesHandler = new MachinesApiHandler(new MachinesApiImpl());
    private final MovesApiHandler movesHandler = new MovesApiHandler(new MovesApiImpl());
    private final PokemonApiHandler pokemonHandler = new PokemonApiHandler(new PokemonApiImpl());
    private final UtilityApiHandler utilityHandler = new UtilityApiHandler(new UtilityApiImpl());

    @Override
    public void start(Promise<Void> startPromise) {
        RouterBuilder.create(vertx, specFile)
            .map(builder -> {
              builder.setOptions(new RouterBuilderOptions()
                  // For production use case, you need to enable this flag and provide the proper security handler
                  .setRequireSecurityHandlers(false)
              );
              
              berriesHandler.mount(builder);
              contestsHandler.mount(builder);
              encountersHandler.mount(builder);
              evolutionHandler.mount(builder);
              gamesHandler.mount(builder);
              itemsHandler.mount(builder);
              locationHandler.mount(builder);
              machinesHandler.mount(builder);
              movesHandler.mount(builder);
              pokemonHandler.mount(builder);
              utilityHandler.mount(builder);

              Router router = builder.createRouter();
              router.errorHandler(400, this::validationFailureHandler);

              return router;
            })
            .compose(router ->
                vertx.createHttpServer()
                    .requestHandler(router)
                    .listen(8080)
            )
            .onSuccess(server -> logger.info("Http verticle deploy successful"))
            .onFailure(t -> logger.error("Http verticle failed to deploy", t))
            // Complete the start promise
            .<Void>mapEmpty().onComplete(startPromise);
    }

    private void validationFailureHandler(RoutingContext rc) {
         rc.response().setStatusCode(400)
                 .end("Bad Request : " + rc.failure().getMessage());
    }
}
