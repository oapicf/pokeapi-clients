package org.openapitools.server.api;

import java.nio.charset.Charset;

import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.github.phiz71.vertx.swagger.router.OperationIdServiceIdResolver;
import com.github.phiz71.vertx.swagger.router.SwaggerRouter;

import io.swagger.models.Swagger;
import io.swagger.parser.SwaggerParser;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.Context;
import io.vertx.core.Future;
import io.vertx.core.file.FileSystem;
import io.vertx.core.json.Json;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;
import io.vertx.core.Vertx;
import io.vertx.ext.web.Router;

public class MainApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(MainApiVerticle.class);

    private int serverPort = 8080;
    protected Router router;

    public int getServerPort() {
        return serverPort;
    }

    public void setServerPort(int serverPort) {
        this.serverPort = serverPort;
    }

    @Override
    public void init(Vertx vertx, Context context) {
        super.init(vertx, context);
        router = Router.router(vertx);
    }

    @Override
    public void start(Future<Void> startFuture) throws Exception {
        Json.mapper.registerModule(new JavaTimeModule());
        FileSystem vertxFileSystem = vertx.fileSystem();
        vertxFileSystem.readFile("openapi.json", readFile -> {
            if (readFile.succeeded()) {
                Swagger swagger = new SwaggerParser().parse(readFile.result().toString(Charset.forName("utf-8")));
                Router swaggerRouter = SwaggerRouter.swaggerRouter(router, swagger, vertx.eventBus(), new OperationIdServiceIdResolver());

                deployVerticals(startFuture);

                vertx.createHttpServer()
                    .requestHandler(swaggerRouter::accept)
                    .listen(serverPort, h -> {
                        if (h.succeeded()) {
                            startFuture.complete();
                        } else {
                            startFuture.fail(h.cause());
                        }
                    });
            } else {
                startFuture.fail(readFile.cause());
            }
        });
    }

    public void deployVerticals(Future<Void> startFuture) {
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.AbilityApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("AbilityApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("AbilityApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.BerryApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("BerryApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("BerryApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.BerryFirmnessApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("BerryFirmnessApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("BerryFirmnessApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.BerryFlavorApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("BerryFlavorApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("BerryFlavorApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.CharacteristicApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("CharacteristicApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("CharacteristicApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.ContestEffectApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("ContestEffectApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("ContestEffectApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.ContestTypeApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("ContestTypeApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("ContestTypeApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.EggGroupApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("EggGroupApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("EggGroupApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.EncounterConditionApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("EncounterConditionApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("EncounterConditionApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.EncounterConditionValueApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("EncounterConditionValueApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("EncounterConditionValueApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.EncounterMethodApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("EncounterMethodApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("EncounterMethodApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.EvolutionChainApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("EvolutionChainApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("EvolutionChainApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.EvolutionTriggerApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("EvolutionTriggerApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("EvolutionTriggerApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.GenderApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("GenderApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("GenderApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.GenerationApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("GenerationApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("GenerationApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.GrowthRateApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("GrowthRateApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("GrowthRateApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.ItemApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("ItemApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("ItemApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.ItemAttributeApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("ItemAttributeApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("ItemAttributeApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.ItemCategoryApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("ItemCategoryApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("ItemCategoryApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.ItemFlingEffectApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("ItemFlingEffectApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("ItemFlingEffectApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.ItemPocketApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("ItemPocketApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("ItemPocketApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.LanguageApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("LanguageApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("LanguageApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.LocationApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("LocationApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("LocationApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.LocationAreaApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("LocationAreaApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("LocationAreaApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.MachineApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("MachineApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("MachineApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.MoveApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("MoveApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("MoveApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.MoveAilmentApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("MoveAilmentApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("MoveAilmentApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.MoveBattleStyleApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("MoveBattleStyleApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("MoveBattleStyleApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.MoveCategoryApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("MoveCategoryApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("MoveCategoryApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.MoveDamageClassApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("MoveDamageClassApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("MoveDamageClassApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.MoveLearnMethodApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("MoveLearnMethodApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("MoveLearnMethodApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.MoveTargetApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("MoveTargetApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("MoveTargetApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.NatureApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("NatureApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("NatureApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.PalParkAreaApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("PalParkAreaApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("PalParkAreaApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.PokeathlonStatApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("PokeathlonStatApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("PokeathlonStatApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.PokedexApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("PokedexApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("PokedexApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.PokemonApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("PokemonApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("PokemonApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.PokemonColorApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("PokemonColorApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("PokemonColorApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.PokemonFormApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("PokemonFormApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("PokemonFormApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.PokemonHabitatApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("PokemonHabitatApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("PokemonHabitatApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.PokemonShapeApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("PokemonShapeApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("PokemonShapeApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.PokemonSpeciesApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("PokemonSpeciesApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("PokemonSpeciesApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.RegionApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("RegionApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("RegionApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.StatApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("StatApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("StatApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.SuperContestEffectApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("SuperContestEffectApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("SuperContestEffectApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.TypeApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("TypeApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("TypeApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.VersionApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("VersionApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("VersionApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.VersionGroupApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("VersionGroupApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("VersionGroupApiVerticle : Deployment failed");
            }
        });
        
    }
}
