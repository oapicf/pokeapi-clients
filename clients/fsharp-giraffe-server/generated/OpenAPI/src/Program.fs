namespace OpenAPI

open System
open System.Net.Http
open System.Security.Claims
open System.Threading
open Microsoft.AspNetCore
open Microsoft.AspNetCore.Builder
open Microsoft.AspNetCore.Hosting
open Microsoft.AspNetCore.Http
open Microsoft.AspNetCore.Http.Features
open Microsoft.AspNetCore.Authentication
open Microsoft.AspNetCore.Authentication.Cookies
open Microsoft.Extensions.Configuration
open Microsoft.Extensions.Logging
open Microsoft.Extensions.DependencyInjection
open FSharp.Control.Tasks.V2.ContextInsensitive
open System.Diagnostics
open Giraffe.GiraffeViewEngine
open AspNet.Security.ApiKey.Providers

open BerriesApiHandlerParams
open ContestsApiHandlerParams
open EncountersApiHandlerParams
open EvolutionApiHandlerParams
open GamesApiHandlerParams
open ItemsApiHandlerParams
open LocationApiHandlerParams
open MachinesApiHandlerParams
open MovesApiHandlerParams
open PokemonApiHandlerParams
open UtilityApiHandlerParams
open Giraffe

module App =

  // ---------------------------------
  // Error handler
  // ---------------------------------

  let errorHandler (ex : Exception) (logger : ILogger) =
    logger.LogError(EventId(), ex, "An unhandled exception has occurred while executing the request.")
    clearResponse >=> setStatusCode 500 >=> text ex.Message

  // ---------------------------------
  // Web app
  // ---------------------------------

  let HttpGet = GET
  let HttpPost = POST
  let HttpPut = PUT
  let HttpDelete = DELETE

  let authFailure : HttpHandler =
    setStatusCode 401 >=> text "You must be authenticated to access this resource."

  let webApp =
    choose (CustomHandlers.handlers @ [
      HttpGet >=> route "/api/v2/berry-firmness/" >=>  BerriesApiHandler.BerryFirmnessList;
      HttpGet >=> routeBind<BerryFirmnessRetrievePathParams> "/api/v2/berry-firmness/{id}/"  (fun x ->  BerriesApiHandler.BerryFirmnessRetrieve x);
      HttpGet >=> route "/api/v2/berry-flavor/" >=>  BerriesApiHandler.BerryFlavorList;
      HttpGet >=> routeBind<BerryFlavorRetrievePathParams> "/api/v2/berry-flavor/{id}/"  (fun x ->  BerriesApiHandler.BerryFlavorRetrieve x);
      HttpGet >=> route "/api/v2/berry/" >=>  BerriesApiHandler.BerryList;
      HttpGet >=> routeBind<BerryRetrievePathParams> "/api/v2/berry/{id}/"  (fun x ->  BerriesApiHandler.BerryRetrieve x);
      HttpGet >=> route "/api/v2/contest-effect/" >=>  ContestsApiHandler.ContestEffectList;
      HttpGet >=> routeBind<ContestEffectRetrievePathParams> "/api/v2/contest-effect/{id}/"  (fun x ->  ContestsApiHandler.ContestEffectRetrieve x);
      HttpGet >=> route "/api/v2/contest-type/" >=>  ContestsApiHandler.ContestTypeList;
      HttpGet >=> routeBind<ContestTypeRetrievePathParams> "/api/v2/contest-type/{id}/"  (fun x ->  ContestsApiHandler.ContestTypeRetrieve x);
      HttpGet >=> route "/api/v2/super-contest-effect/" >=>  ContestsApiHandler.SuperContestEffectList;
      HttpGet >=> routeBind<SuperContestEffectRetrievePathParams> "/api/v2/super-contest-effect/{id}/"  (fun x ->  ContestsApiHandler.SuperContestEffectRetrieve x);
      HttpGet >=> route "/api/v2/encounter-condition/" >=>  EncountersApiHandler.EncounterConditionList;
      HttpGet >=> routeBind<EncounterConditionRetrievePathParams> "/api/v2/encounter-condition/{id}/"  (fun x ->  EncountersApiHandler.EncounterConditionRetrieve x);
      HttpGet >=> route "/api/v2/encounter-condition-value/" >=>  EncountersApiHandler.EncounterConditionValueList;
      HttpGet >=> routeBind<EncounterConditionValueRetrievePathParams> "/api/v2/encounter-condition-value/{id}/"  (fun x ->  EncountersApiHandler.EncounterConditionValueRetrieve x);
      HttpGet >=> route "/api/v2/encounter-method/" >=>  EncountersApiHandler.EncounterMethodList;
      HttpGet >=> routeBind<EncounterMethodRetrievePathParams> "/api/v2/encounter-method/{id}/"  (fun x ->  EncountersApiHandler.EncounterMethodRetrieve x);
      HttpGet >=> route "/api/v2/evolution-chain/" >=>  EvolutionApiHandler.EvolutionChainList;
      HttpGet >=> routeBind<EvolutionChainRetrievePathParams> "/api/v2/evolution-chain/{id}/"  (fun x ->  EvolutionApiHandler.EvolutionChainRetrieve x);
      HttpGet >=> route "/api/v2/evolution-trigger/" >=>  EvolutionApiHandler.EvolutionTriggerList;
      HttpGet >=> routeBind<EvolutionTriggerRetrievePathParams> "/api/v2/evolution-trigger/{id}/"  (fun x ->  EvolutionApiHandler.EvolutionTriggerRetrieve x);
      HttpGet >=> route "/api/v2/evolution-variable/" >=>  EvolutionApiHandler.EvolutionVariableList;
      HttpGet >=> routeBind<EvolutionVariableRetrievePathParams> "/api/v2/evolution-variable/{id}/"  (fun x ->  EvolutionApiHandler.EvolutionVariableRetrieve x);
      HttpGet >=> route "/api/v2/generation/" >=>  GamesApiHandler.GenerationList;
      HttpGet >=> routeBind<GenerationRetrievePathParams> "/api/v2/generation/{id}/"  (fun x ->  GamesApiHandler.GenerationRetrieve x);
      HttpGet >=> route "/api/v2/pokedex/" >=>  GamesApiHandler.PokedexList;
      HttpGet >=> routeBind<PokedexRetrievePathParams> "/api/v2/pokedex/{id}/"  (fun x ->  GamesApiHandler.PokedexRetrieve x);
      HttpGet >=> route "/api/v2/version-group/" >=>  GamesApiHandler.VersionGroupList;
      HttpGet >=> routeBind<VersionGroupRetrievePathParams> "/api/v2/version-group/{id}/"  (fun x ->  GamesApiHandler.VersionGroupRetrieve x);
      HttpGet >=> route "/api/v2/version/" >=>  GamesApiHandler.VersionList;
      HttpGet >=> routeBind<VersionRetrievePathParams> "/api/v2/version/{id}/"  (fun x ->  GamesApiHandler.VersionRetrieve x);
      HttpGet >=> route "/api/v2/currency/" >=>  ItemsApiHandler.CurrencyList;
      HttpGet >=> routeBind<CurrencyRetrievePathParams> "/api/v2/currency/{id}/"  (fun x ->  ItemsApiHandler.CurrencyRetrieve x);
      HttpGet >=> route "/api/v2/item-attribute/" >=>  ItemsApiHandler.ItemAttributeList;
      HttpGet >=> routeBind<ItemAttributeRetrievePathParams> "/api/v2/item-attribute/{id}/"  (fun x ->  ItemsApiHandler.ItemAttributeRetrieve x);
      HttpGet >=> route "/api/v2/item-category/" >=>  ItemsApiHandler.ItemCategoryList;
      HttpGet >=> routeBind<ItemCategoryRetrievePathParams> "/api/v2/item-category/{id}/"  (fun x ->  ItemsApiHandler.ItemCategoryRetrieve x);
      HttpGet >=> route "/api/v2/item-fling-effect/" >=>  ItemsApiHandler.ItemFlingEffectList;
      HttpGet >=> routeBind<ItemFlingEffectRetrievePathParams> "/api/v2/item-fling-effect/{id}/"  (fun x ->  ItemsApiHandler.ItemFlingEffectRetrieve x);
      HttpGet >=> route "/api/v2/item/" >=>  ItemsApiHandler.ItemList;
      HttpGet >=> route "/api/v2/item-pocket/" >=>  ItemsApiHandler.ItemPocketList;
      HttpGet >=> routeBind<ItemPocketRetrievePathParams> "/api/v2/item-pocket/{id}/"  (fun x ->  ItemsApiHandler.ItemPocketRetrieve x);
      HttpGet >=> routeBind<ItemRetrievePathParams> "/api/v2/item/{id}/"  (fun x ->  ItemsApiHandler.ItemRetrieve x);
      HttpGet >=> route "/api/v2/location-area/" >=>  LocationApiHandler.LocationAreaList;
      HttpGet >=> routeBind<LocationAreaRetrievePathParams> "/api/v2/location-area/{id}/"  (fun x ->  LocationApiHandler.LocationAreaRetrieve x);
      HttpGet >=> route "/api/v2/location/" >=>  LocationApiHandler.LocationList;
      HttpGet >=> routeBind<LocationRetrievePathParams> "/api/v2/location/{id}/"  (fun x ->  LocationApiHandler.LocationRetrieve x);
      HttpGet >=> route "/api/v2/pal-park-area/" >=>  LocationApiHandler.PalParkAreaList;
      HttpGet >=> routeBind<PalParkAreaRetrievePathParams> "/api/v2/pal-park-area/{id}/"  (fun x ->  LocationApiHandler.PalParkAreaRetrieve x);
      HttpGet >=> route "/api/v2/region/" >=>  LocationApiHandler.RegionList;
      HttpGet >=> routeBind<RegionRetrievePathParams> "/api/v2/region/{id}/"  (fun x ->  LocationApiHandler.RegionRetrieve x);
      HttpGet >=> route "/api/v2/machine/" >=>  MachinesApiHandler.MachineList;
      HttpGet >=> routeBind<MachineRetrievePathParams> "/api/v2/machine/{id}/"  (fun x ->  MachinesApiHandler.MachineRetrieve x);
      HttpGet >=> route "/api/v2/move-ailment/" >=>  MovesApiHandler.MoveAilmentList;
      HttpGet >=> routeBind<MoveAilmentRetrievePathParams> "/api/v2/move-ailment/{id}/"  (fun x ->  MovesApiHandler.MoveAilmentRetrieve x);
      HttpGet >=> route "/api/v2/move-battle-style/" >=>  MovesApiHandler.MoveBattleStyleList;
      HttpGet >=> routeBind<MoveBattleStyleRetrievePathParams> "/api/v2/move-battle-style/{id}/"  (fun x ->  MovesApiHandler.MoveBattleStyleRetrieve x);
      HttpGet >=> route "/api/v2/move-category/" >=>  MovesApiHandler.MoveCategoryList;
      HttpGet >=> routeBind<MoveCategoryRetrievePathParams> "/api/v2/move-category/{id}/"  (fun x ->  MovesApiHandler.MoveCategoryRetrieve x);
      HttpGet >=> route "/api/v2/move-learn-method/" >=>  MovesApiHandler.MoveLearnMethodList;
      HttpGet >=> routeBind<MoveLearnMethodRetrievePathParams> "/api/v2/move-learn-method/{id}/"  (fun x ->  MovesApiHandler.MoveLearnMethodRetrieve x);
      HttpGet >=> route "/api/v2/move/" >=>  MovesApiHandler.MoveList;
      HttpGet >=> routeBind<MoveRetrievePathParams> "/api/v2/move/{id}/"  (fun x ->  MovesApiHandler.MoveRetrieve x);
      HttpGet >=> route "/api/v2/move-target/" >=>  MovesApiHandler.MoveTargetList;
      HttpGet >=> routeBind<MoveTargetRetrievePathParams> "/api/v2/move-target/{id}/"  (fun x ->  MovesApiHandler.MoveTargetRetrieve x);
      HttpGet >=> route "/api/v2/ability/" >=>  PokemonApiHandler.AbilityList;
      HttpGet >=> routeBind<AbilityRetrievePathParams> "/api/v2/ability/{id}/"  (fun x ->  PokemonApiHandler.AbilityRetrieve x);
      HttpGet >=> route "/api/v2/characteristic/" >=>  PokemonApiHandler.CharacteristicList;
      HttpGet >=> routeBind<CharacteristicRetrievePathParams> "/api/v2/characteristic/{id}/"  (fun x ->  PokemonApiHandler.CharacteristicRetrieve x);
      HttpGet >=> route "/api/v2/egg-group/" >=>  PokemonApiHandler.EggGroupList;
      HttpGet >=> routeBind<EggGroupRetrievePathParams> "/api/v2/egg-group/{id}/"  (fun x ->  PokemonApiHandler.EggGroupRetrieve x);
      HttpGet >=> route "/api/v2/gender/" >=>  PokemonApiHandler.GenderList;
      HttpGet >=> routeBind<GenderRetrievePathParams> "/api/v2/gender/{id}/"  (fun x ->  PokemonApiHandler.GenderRetrieve x);
      HttpGet >=> route "/api/v2/growth-rate/" >=>  PokemonApiHandler.GrowthRateList;
      HttpGet >=> routeBind<GrowthRateRetrievePathParams> "/api/v2/growth-rate/{id}/"  (fun x ->  PokemonApiHandler.GrowthRateRetrieve x);
      HttpGet >=> route "/api/v2/move-damage-class/" >=>  PokemonApiHandler.MoveDamageClassList;
      HttpGet >=> routeBind<MoveDamageClassRetrievePathParams> "/api/v2/move-damage-class/{id}/"  (fun x ->  PokemonApiHandler.MoveDamageClassRetrieve x);
      HttpGet >=> route "/api/v2/nature/" >=>  PokemonApiHandler.NatureList;
      HttpGet >=> routeBind<NatureRetrievePathParams> "/api/v2/nature/{id}/"  (fun x ->  PokemonApiHandler.NatureRetrieve x);
      HttpGet >=> route "/api/v2/pokeathlon-stat/" >=>  PokemonApiHandler.PokeathlonStatList;
      HttpGet >=> routeBind<PokeathlonStatRetrievePathParams> "/api/v2/pokeathlon-stat/{id}/"  (fun x ->  PokemonApiHandler.PokeathlonStatRetrieve x);
      HttpGet >=> route "/api/v2/pokemon-color/" >=>  PokemonApiHandler.PokemonColorList;
      HttpGet >=> routeBind<PokemonColorRetrievePathParams> "/api/v2/pokemon-color/{id}/"  (fun x ->  PokemonApiHandler.PokemonColorRetrieve x);
      HttpGet >=> route "/api/v2/pokemon-form/" >=>  PokemonApiHandler.PokemonFormList;
      HttpGet >=> routeBind<PokemonFormRetrievePathParams> "/api/v2/pokemon-form/{id}/"  (fun x ->  PokemonApiHandler.PokemonFormRetrieve x);
      HttpGet >=> route "/api/v2/pokemon-habitat/" >=>  PokemonApiHandler.PokemonHabitatList;
      HttpGet >=> routeBind<PokemonHabitatRetrievePathParams> "/api/v2/pokemon-habitat/{id}/"  (fun x ->  PokemonApiHandler.PokemonHabitatRetrieve x);
      HttpGet >=> route "/api/v2/pokemon/" >=>  PokemonApiHandler.PokemonList;
      HttpGet >=> routeBind<PokemonRetrievePathParams> "/api/v2/pokemon/{id}/"  (fun x ->  PokemonApiHandler.PokemonRetrieve x);
      HttpGet >=> route "/api/v2/pokemon-shape/" >=>  PokemonApiHandler.PokemonShapeList;
      HttpGet >=> routeBind<PokemonShapeRetrievePathParams> "/api/v2/pokemon-shape/{id}/"  (fun x ->  PokemonApiHandler.PokemonShapeRetrieve x);
      HttpGet >=> route "/api/v2/pokemon-species/" >=>  PokemonApiHandler.PokemonSpeciesList;
      HttpGet >=> routeBind<PokemonSpeciesRetrievePathParams> "/api/v2/pokemon-species/{id}/"  (fun x ->  PokemonApiHandler.PokemonSpeciesRetrieve x);
      HttpGet >=> route "/api/v2/stat/" >=>  PokemonApiHandler.StatList;
      HttpGet >=> routeBind<StatRetrievePathParams> "/api/v2/stat/{id}/"  (fun x ->  PokemonApiHandler.StatRetrieve x);
      HttpGet >=> route "/api/v2/type/" >=>  PokemonApiHandler.TypeList;
      HttpGet >=> routeBind<TypeRetrievePathParams> "/api/v2/type/{id}/"  (fun x ->  PokemonApiHandler.TypeRetrieve x);
      HttpGet >=> route "/api/v2/language/" >=>  UtilityApiHandler.LanguageList;
      HttpGet >=> routeBind<LanguageRetrievePathParams> "/api/v2/language/{id}/"  (fun x ->  UtilityApiHandler.LanguageRetrieve x);
      HttpGet >=> route "/api/v2/meta/" >=>  UtilityApiHandler.MetaRetrieve;
      RequestErrors.notFound (text "Not Found")
    ])
  // ---------------------------------
  // Main
  // ---------------------------------

  let configureApp (app : IApplicationBuilder) =
    app.UseGiraffeErrorHandler(errorHandler)
      .UseStaticFiles()
      .UseAuthentication()
      .UseResponseCaching() |> ignore
    CustomHandlers.configureApp app |> ignore
    app.UseGiraffe webApp |> ignore


  let configureServices (services : IServiceCollection) =
    services
          .AddResponseCaching()
          .AddGiraffe()
          |> AuthSchemes.configureServices
          |> CustomHandlers.configureServices services
          |> ignore
    services.AddDataProtection() |> ignore

  let configureLogging (loggerBuilder : ILoggingBuilder) =
    loggerBuilder.AddFilter(fun lvl -> lvl.Equals LogLevel.Error)
                  .AddConsole()
                  .AddDebug() |> ignore

  [<EntryPoint>]
  let main _ =
    let builder = WebHost.CreateDefaultBuilder()
                    .Configure(Action<IApplicationBuilder> configureApp)
                    .ConfigureServices(configureServices)
                    .ConfigureLogging(configureLogging)
                    |> CustomHandlers.configureWebHost
    builder.Build()
            .Run()
    0