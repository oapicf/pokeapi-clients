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

import org.openapitools.vertxweb.server.api.AbilityApiHandler;
import org.openapitools.vertxweb.server.api.AbilityApiImpl;
import org.openapitools.vertxweb.server.api.BerryApiHandler;
import org.openapitools.vertxweb.server.api.BerryApiImpl;
import org.openapitools.vertxweb.server.api.BerryFirmnessApiHandler;
import org.openapitools.vertxweb.server.api.BerryFirmnessApiImpl;
import org.openapitools.vertxweb.server.api.BerryFlavorApiHandler;
import org.openapitools.vertxweb.server.api.BerryFlavorApiImpl;
import org.openapitools.vertxweb.server.api.CharacteristicApiHandler;
import org.openapitools.vertxweb.server.api.CharacteristicApiImpl;
import org.openapitools.vertxweb.server.api.ContestEffectApiHandler;
import org.openapitools.vertxweb.server.api.ContestEffectApiImpl;
import org.openapitools.vertxweb.server.api.ContestTypeApiHandler;
import org.openapitools.vertxweb.server.api.ContestTypeApiImpl;
import org.openapitools.vertxweb.server.api.EggGroupApiHandler;
import org.openapitools.vertxweb.server.api.EggGroupApiImpl;
import org.openapitools.vertxweb.server.api.EncounterConditionApiHandler;
import org.openapitools.vertxweb.server.api.EncounterConditionApiImpl;
import org.openapitools.vertxweb.server.api.EncounterConditionValueApiHandler;
import org.openapitools.vertxweb.server.api.EncounterConditionValueApiImpl;
import org.openapitools.vertxweb.server.api.EncounterMethodApiHandler;
import org.openapitools.vertxweb.server.api.EncounterMethodApiImpl;
import org.openapitools.vertxweb.server.api.EvolutionChainApiHandler;
import org.openapitools.vertxweb.server.api.EvolutionChainApiImpl;
import org.openapitools.vertxweb.server.api.EvolutionTriggerApiHandler;
import org.openapitools.vertxweb.server.api.EvolutionTriggerApiImpl;
import org.openapitools.vertxweb.server.api.GenderApiHandler;
import org.openapitools.vertxweb.server.api.GenderApiImpl;
import org.openapitools.vertxweb.server.api.GenerationApiHandler;
import org.openapitools.vertxweb.server.api.GenerationApiImpl;
import org.openapitools.vertxweb.server.api.GrowthRateApiHandler;
import org.openapitools.vertxweb.server.api.GrowthRateApiImpl;
import org.openapitools.vertxweb.server.api.ItemApiHandler;
import org.openapitools.vertxweb.server.api.ItemApiImpl;
import org.openapitools.vertxweb.server.api.ItemAttributeApiHandler;
import org.openapitools.vertxweb.server.api.ItemAttributeApiImpl;
import org.openapitools.vertxweb.server.api.ItemCategoryApiHandler;
import org.openapitools.vertxweb.server.api.ItemCategoryApiImpl;
import org.openapitools.vertxweb.server.api.ItemFlingEffectApiHandler;
import org.openapitools.vertxweb.server.api.ItemFlingEffectApiImpl;
import org.openapitools.vertxweb.server.api.ItemPocketApiHandler;
import org.openapitools.vertxweb.server.api.ItemPocketApiImpl;
import org.openapitools.vertxweb.server.api.LanguageApiHandler;
import org.openapitools.vertxweb.server.api.LanguageApiImpl;
import org.openapitools.vertxweb.server.api.LocationApiHandler;
import org.openapitools.vertxweb.server.api.LocationApiImpl;
import org.openapitools.vertxweb.server.api.LocationAreaApiHandler;
import org.openapitools.vertxweb.server.api.LocationAreaApiImpl;
import org.openapitools.vertxweb.server.api.MachineApiHandler;
import org.openapitools.vertxweb.server.api.MachineApiImpl;
import org.openapitools.vertxweb.server.api.MoveApiHandler;
import org.openapitools.vertxweb.server.api.MoveApiImpl;
import org.openapitools.vertxweb.server.api.MoveAilmentApiHandler;
import org.openapitools.vertxweb.server.api.MoveAilmentApiImpl;
import org.openapitools.vertxweb.server.api.MoveBattleStyleApiHandler;
import org.openapitools.vertxweb.server.api.MoveBattleStyleApiImpl;
import org.openapitools.vertxweb.server.api.MoveCategoryApiHandler;
import org.openapitools.vertxweb.server.api.MoveCategoryApiImpl;
import org.openapitools.vertxweb.server.api.MoveDamageClassApiHandler;
import org.openapitools.vertxweb.server.api.MoveDamageClassApiImpl;
import org.openapitools.vertxweb.server.api.MoveLearnMethodApiHandler;
import org.openapitools.vertxweb.server.api.MoveLearnMethodApiImpl;
import org.openapitools.vertxweb.server.api.MoveTargetApiHandler;
import org.openapitools.vertxweb.server.api.MoveTargetApiImpl;
import org.openapitools.vertxweb.server.api.NatureApiHandler;
import org.openapitools.vertxweb.server.api.NatureApiImpl;
import org.openapitools.vertxweb.server.api.PalParkAreaApiHandler;
import org.openapitools.vertxweb.server.api.PalParkAreaApiImpl;
import org.openapitools.vertxweb.server.api.PokeathlonStatApiHandler;
import org.openapitools.vertxweb.server.api.PokeathlonStatApiImpl;
import org.openapitools.vertxweb.server.api.PokedexApiHandler;
import org.openapitools.vertxweb.server.api.PokedexApiImpl;
import org.openapitools.vertxweb.server.api.PokemonApiHandler;
import org.openapitools.vertxweb.server.api.PokemonApiImpl;
import org.openapitools.vertxweb.server.api.PokemonColorApiHandler;
import org.openapitools.vertxweb.server.api.PokemonColorApiImpl;
import org.openapitools.vertxweb.server.api.PokemonFormApiHandler;
import org.openapitools.vertxweb.server.api.PokemonFormApiImpl;
import org.openapitools.vertxweb.server.api.PokemonHabitatApiHandler;
import org.openapitools.vertxweb.server.api.PokemonHabitatApiImpl;
import org.openapitools.vertxweb.server.api.PokemonShapeApiHandler;
import org.openapitools.vertxweb.server.api.PokemonShapeApiImpl;
import org.openapitools.vertxweb.server.api.PokemonSpeciesApiHandler;
import org.openapitools.vertxweb.server.api.PokemonSpeciesApiImpl;
import org.openapitools.vertxweb.server.api.RegionApiHandler;
import org.openapitools.vertxweb.server.api.RegionApiImpl;
import org.openapitools.vertxweb.server.api.StatApiHandler;
import org.openapitools.vertxweb.server.api.StatApiImpl;
import org.openapitools.vertxweb.server.api.SuperContestEffectApiHandler;
import org.openapitools.vertxweb.server.api.SuperContestEffectApiImpl;
import org.openapitools.vertxweb.server.api.TypeApiHandler;
import org.openapitools.vertxweb.server.api.TypeApiImpl;
import org.openapitools.vertxweb.server.api.VersionApiHandler;
import org.openapitools.vertxweb.server.api.VersionApiImpl;
import org.openapitools.vertxweb.server.api.VersionGroupApiHandler;
import org.openapitools.vertxweb.server.api.VersionGroupApiImpl;

public class HttpServerVerticle extends AbstractVerticle {

    private static final Logger logger = LoggerFactory.getLogger(HttpServerVerticle.class);
    private static final String specFile = "src/main/resources/openapi.yaml";

    
    private final AbilityApiHandler abilityHandler = new AbilityApiHandler(new AbilityApiImpl());
    private final BerryApiHandler berryHandler = new BerryApiHandler(new BerryApiImpl());
    private final BerryFirmnessApiHandler berryFirmnessHandler = new BerryFirmnessApiHandler(new BerryFirmnessApiImpl());
    private final BerryFlavorApiHandler berryFlavorHandler = new BerryFlavorApiHandler(new BerryFlavorApiImpl());
    private final CharacteristicApiHandler characteristicHandler = new CharacteristicApiHandler(new CharacteristicApiImpl());
    private final ContestEffectApiHandler contestEffectHandler = new ContestEffectApiHandler(new ContestEffectApiImpl());
    private final ContestTypeApiHandler contestTypeHandler = new ContestTypeApiHandler(new ContestTypeApiImpl());
    private final EggGroupApiHandler eggGroupHandler = new EggGroupApiHandler(new EggGroupApiImpl());
    private final EncounterConditionApiHandler encounterConditionHandler = new EncounterConditionApiHandler(new EncounterConditionApiImpl());
    private final EncounterConditionValueApiHandler encounterConditionValueHandler = new EncounterConditionValueApiHandler(new EncounterConditionValueApiImpl());
    private final EncounterMethodApiHandler encounterMethodHandler = new EncounterMethodApiHandler(new EncounterMethodApiImpl());
    private final EvolutionChainApiHandler evolutionChainHandler = new EvolutionChainApiHandler(new EvolutionChainApiImpl());
    private final EvolutionTriggerApiHandler evolutionTriggerHandler = new EvolutionTriggerApiHandler(new EvolutionTriggerApiImpl());
    private final GenderApiHandler genderHandler = new GenderApiHandler(new GenderApiImpl());
    private final GenerationApiHandler generationHandler = new GenerationApiHandler(new GenerationApiImpl());
    private final GrowthRateApiHandler growthRateHandler = new GrowthRateApiHandler(new GrowthRateApiImpl());
    private final ItemApiHandler itemHandler = new ItemApiHandler(new ItemApiImpl());
    private final ItemAttributeApiHandler itemAttributeHandler = new ItemAttributeApiHandler(new ItemAttributeApiImpl());
    private final ItemCategoryApiHandler itemCategoryHandler = new ItemCategoryApiHandler(new ItemCategoryApiImpl());
    private final ItemFlingEffectApiHandler itemFlingEffectHandler = new ItemFlingEffectApiHandler(new ItemFlingEffectApiImpl());
    private final ItemPocketApiHandler itemPocketHandler = new ItemPocketApiHandler(new ItemPocketApiImpl());
    private final LanguageApiHandler languageHandler = new LanguageApiHandler(new LanguageApiImpl());
    private final LocationApiHandler locationHandler = new LocationApiHandler(new LocationApiImpl());
    private final LocationAreaApiHandler locationAreaHandler = new LocationAreaApiHandler(new LocationAreaApiImpl());
    private final MachineApiHandler machineHandler = new MachineApiHandler(new MachineApiImpl());
    private final MoveApiHandler moveHandler = new MoveApiHandler(new MoveApiImpl());
    private final MoveAilmentApiHandler moveAilmentHandler = new MoveAilmentApiHandler(new MoveAilmentApiImpl());
    private final MoveBattleStyleApiHandler moveBattleStyleHandler = new MoveBattleStyleApiHandler(new MoveBattleStyleApiImpl());
    private final MoveCategoryApiHandler moveCategoryHandler = new MoveCategoryApiHandler(new MoveCategoryApiImpl());
    private final MoveDamageClassApiHandler moveDamageClassHandler = new MoveDamageClassApiHandler(new MoveDamageClassApiImpl());
    private final MoveLearnMethodApiHandler moveLearnMethodHandler = new MoveLearnMethodApiHandler(new MoveLearnMethodApiImpl());
    private final MoveTargetApiHandler moveTargetHandler = new MoveTargetApiHandler(new MoveTargetApiImpl());
    private final NatureApiHandler natureHandler = new NatureApiHandler(new NatureApiImpl());
    private final PalParkAreaApiHandler palParkAreaHandler = new PalParkAreaApiHandler(new PalParkAreaApiImpl());
    private final PokeathlonStatApiHandler pokeathlonStatHandler = new PokeathlonStatApiHandler(new PokeathlonStatApiImpl());
    private final PokedexApiHandler pokedexHandler = new PokedexApiHandler(new PokedexApiImpl());
    private final PokemonApiHandler pokemonHandler = new PokemonApiHandler(new PokemonApiImpl());
    private final PokemonColorApiHandler pokemonColorHandler = new PokemonColorApiHandler(new PokemonColorApiImpl());
    private final PokemonFormApiHandler pokemonFormHandler = new PokemonFormApiHandler(new PokemonFormApiImpl());
    private final PokemonHabitatApiHandler pokemonHabitatHandler = new PokemonHabitatApiHandler(new PokemonHabitatApiImpl());
    private final PokemonShapeApiHandler pokemonShapeHandler = new PokemonShapeApiHandler(new PokemonShapeApiImpl());
    private final PokemonSpeciesApiHandler pokemonSpeciesHandler = new PokemonSpeciesApiHandler(new PokemonSpeciesApiImpl());
    private final RegionApiHandler regionHandler = new RegionApiHandler(new RegionApiImpl());
    private final StatApiHandler statHandler = new StatApiHandler(new StatApiImpl());
    private final SuperContestEffectApiHandler superContestEffectHandler = new SuperContestEffectApiHandler(new SuperContestEffectApiImpl());
    private final TypeApiHandler typeHandler = new TypeApiHandler(new TypeApiImpl());
    private final VersionApiHandler versionHandler = new VersionApiHandler(new VersionApiImpl());
    private final VersionGroupApiHandler versionGroupHandler = new VersionGroupApiHandler(new VersionGroupApiImpl());

    @Override
    public void start(Promise<Void> startPromise) {
        RouterBuilder.create(vertx, specFile)
            .map(builder -> {
              builder.setOptions(new RouterBuilderOptions()
                  // For production use case, you need to enable this flag and provide the proper security handler
                  .setRequireSecurityHandlers(false)
              );
              
              abilityHandler.mount(builder);
              berryHandler.mount(builder);
              berryFirmnessHandler.mount(builder);
              berryFlavorHandler.mount(builder);
              characteristicHandler.mount(builder);
              contestEffectHandler.mount(builder);
              contestTypeHandler.mount(builder);
              eggGroupHandler.mount(builder);
              encounterConditionHandler.mount(builder);
              encounterConditionValueHandler.mount(builder);
              encounterMethodHandler.mount(builder);
              evolutionChainHandler.mount(builder);
              evolutionTriggerHandler.mount(builder);
              genderHandler.mount(builder);
              generationHandler.mount(builder);
              growthRateHandler.mount(builder);
              itemHandler.mount(builder);
              itemAttributeHandler.mount(builder);
              itemCategoryHandler.mount(builder);
              itemFlingEffectHandler.mount(builder);
              itemPocketHandler.mount(builder);
              languageHandler.mount(builder);
              locationHandler.mount(builder);
              locationAreaHandler.mount(builder);
              machineHandler.mount(builder);
              moveHandler.mount(builder);
              moveAilmentHandler.mount(builder);
              moveBattleStyleHandler.mount(builder);
              moveCategoryHandler.mount(builder);
              moveDamageClassHandler.mount(builder);
              moveLearnMethodHandler.mount(builder);
              moveTargetHandler.mount(builder);
              natureHandler.mount(builder);
              palParkAreaHandler.mount(builder);
              pokeathlonStatHandler.mount(builder);
              pokedexHandler.mount(builder);
              pokemonHandler.mount(builder);
              pokemonColorHandler.mount(builder);
              pokemonFormHandler.mount(builder);
              pokemonHabitatHandler.mount(builder);
              pokemonShapeHandler.mount(builder);
              pokemonSpeciesHandler.mount(builder);
              regionHandler.mount(builder);
              statHandler.mount(builder);
              superContestEffectHandler.mount(builder);
              typeHandler.mount(builder);
              versionHandler.mount(builder);
              versionGroupHandler.mount(builder);

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
