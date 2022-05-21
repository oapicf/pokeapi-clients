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

open AbilityApiHandlerParams
open BerryApiHandlerParams
open BerryFirmnessApiHandlerParams
open BerryFlavorApiHandlerParams
open CharacteristicApiHandlerParams
open ContestEffectApiHandlerParams
open ContestTypeApiHandlerParams
open EggGroupApiHandlerParams
open EncounterConditionApiHandlerParams
open EncounterConditionValueApiHandlerParams
open EncounterMethodApiHandlerParams
open EvolutionChainApiHandlerParams
open EvolutionTriggerApiHandlerParams
open GenderApiHandlerParams
open GenerationApiHandlerParams
open GrowthRateApiHandlerParams
open ItemApiHandlerParams
open ItemAttributeApiHandlerParams
open ItemCategoryApiHandlerParams
open ItemFlingEffectApiHandlerParams
open ItemPocketApiHandlerParams
open LanguageApiHandlerParams
open LocationApiHandlerParams
open LocationAreaApiHandlerParams
open MachineApiHandlerParams
open MoveApiHandlerParams
open MoveAilmentApiHandlerParams
open MoveBattleStyleApiHandlerParams
open MoveCategoryApiHandlerParams
open MoveDamageClassApiHandlerParams
open MoveLearnMethodApiHandlerParams
open MoveTargetApiHandlerParams
open NatureApiHandlerParams
open PalParkAreaApiHandlerParams
open PokeathlonStatApiHandlerParams
open PokedexApiHandlerParams
open PokemonApiHandlerParams
open PokemonColorApiHandlerParams
open PokemonFormApiHandlerParams
open PokemonHabitatApiHandlerParams
open PokemonShapeApiHandlerParams
open PokemonSpeciesApiHandlerParams
open RegionApiHandlerParams
open StatApiHandlerParams
open SuperContestEffectApiHandlerParams
open TypeApiHandlerParams
open VersionApiHandlerParams
open VersionGroupApiHandlerParams
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
      HttpGet >=> route "/api/v2/ability/" >=>  AbilityApiHandler.AbilityList;
      HttpGet >=> routeBind<AbilityReadPathParams> "/api/v2/ability/{id}/"  (fun x ->  AbilityApiHandler.AbilityRead x);
      HttpGet >=> route "/api/v2/berry/" >=>  BerryApiHandler.BerryList;
      HttpGet >=> routeBind<BerryReadPathParams> "/api/v2/berry/{id}/"  (fun x ->  BerryApiHandler.BerryRead x);
      HttpGet >=> route "/api/v2/berry-firmness/" >=>  BerryFirmnessApiHandler.BerryFirmnessList;
      HttpGet >=> routeBind<BerryFirmnessReadPathParams> "/api/v2/berry-firmness/{id}/"  (fun x ->  BerryFirmnessApiHandler.BerryFirmnessRead x);
      HttpGet >=> route "/api/v2/berry-flavor/" >=>  BerryFlavorApiHandler.BerryFlavorList;
      HttpGet >=> routeBind<BerryFlavorReadPathParams> "/api/v2/berry-flavor/{id}/"  (fun x ->  BerryFlavorApiHandler.BerryFlavorRead x);
      HttpGet >=> route "/api/v2/characteristic/" >=>  CharacteristicApiHandler.CharacteristicList;
      HttpGet >=> routeBind<CharacteristicReadPathParams> "/api/v2/characteristic/{id}/"  (fun x ->  CharacteristicApiHandler.CharacteristicRead x);
      HttpGet >=> route "/api/v2/contest-effect/" >=>  ContestEffectApiHandler.ContestEffectList;
      HttpGet >=> routeBind<ContestEffectReadPathParams> "/api/v2/contest-effect/{id}/"  (fun x ->  ContestEffectApiHandler.ContestEffectRead x);
      HttpGet >=> route "/api/v2/contest-type/" >=>  ContestTypeApiHandler.ContestTypeList;
      HttpGet >=> routeBind<ContestTypeReadPathParams> "/api/v2/contest-type/{id}/"  (fun x ->  ContestTypeApiHandler.ContestTypeRead x);
      HttpGet >=> route "/api/v2/egg-group/" >=>  EggGroupApiHandler.EggGroupList;
      HttpGet >=> routeBind<EggGroupReadPathParams> "/api/v2/egg-group/{id}/"  (fun x ->  EggGroupApiHandler.EggGroupRead x);
      HttpGet >=> route "/api/v2/encounter-condition/" >=>  EncounterConditionApiHandler.EncounterConditionList;
      HttpGet >=> routeBind<EncounterConditionReadPathParams> "/api/v2/encounter-condition/{id}/"  (fun x ->  EncounterConditionApiHandler.EncounterConditionRead x);
      HttpGet >=> route "/api/v2/encounter-condition-value/" >=>  EncounterConditionValueApiHandler.EncounterConditionValueList;
      HttpGet >=> routeBind<EncounterConditionValueReadPathParams> "/api/v2/encounter-condition-value/{id}/"  (fun x ->  EncounterConditionValueApiHandler.EncounterConditionValueRead x);
      HttpGet >=> route "/api/v2/encounter-method/" >=>  EncounterMethodApiHandler.EncounterMethodList;
      HttpGet >=> routeBind<EncounterMethodReadPathParams> "/api/v2/encounter-method/{id}/"  (fun x ->  EncounterMethodApiHandler.EncounterMethodRead x);
      HttpGet >=> route "/api/v2/evolution-chain/" >=>  EvolutionChainApiHandler.EvolutionChainList;
      HttpGet >=> routeBind<EvolutionChainReadPathParams> "/api/v2/evolution-chain/{id}/"  (fun x ->  EvolutionChainApiHandler.EvolutionChainRead x);
      HttpGet >=> route "/api/v2/evolution-trigger/" >=>  EvolutionTriggerApiHandler.EvolutionTriggerList;
      HttpGet >=> routeBind<EvolutionTriggerReadPathParams> "/api/v2/evolution-trigger/{id}/"  (fun x ->  EvolutionTriggerApiHandler.EvolutionTriggerRead x);
      HttpGet >=> route "/api/v2/gender/" >=>  GenderApiHandler.GenderList;
      HttpGet >=> routeBind<GenderReadPathParams> "/api/v2/gender/{id}/"  (fun x ->  GenderApiHandler.GenderRead x);
      HttpGet >=> route "/api/v2/generation/" >=>  GenerationApiHandler.GenerationList;
      HttpGet >=> routeBind<GenerationReadPathParams> "/api/v2/generation/{id}/"  (fun x ->  GenerationApiHandler.GenerationRead x);
      HttpGet >=> route "/api/v2/growth-rate/" >=>  GrowthRateApiHandler.GrowthRateList;
      HttpGet >=> routeBind<GrowthRateReadPathParams> "/api/v2/growth-rate/{id}/"  (fun x ->  GrowthRateApiHandler.GrowthRateRead x);
      HttpGet >=> route "/api/v2/item/" >=>  ItemApiHandler.ItemList;
      HttpGet >=> routeBind<ItemReadPathParams> "/api/v2/item/{id}/"  (fun x ->  ItemApiHandler.ItemRead x);
      HttpGet >=> route "/api/v2/item-attribute/" >=>  ItemAttributeApiHandler.ItemAttributeList;
      HttpGet >=> routeBind<ItemAttributeReadPathParams> "/api/v2/item-attribute/{id}/"  (fun x ->  ItemAttributeApiHandler.ItemAttributeRead x);
      HttpGet >=> route "/api/v2/item-category/" >=>  ItemCategoryApiHandler.ItemCategoryList;
      HttpGet >=> routeBind<ItemCategoryReadPathParams> "/api/v2/item-category/{id}/"  (fun x ->  ItemCategoryApiHandler.ItemCategoryRead x);
      HttpGet >=> route "/api/v2/item-fling-effect/" >=>  ItemFlingEffectApiHandler.ItemFlingEffectList;
      HttpGet >=> routeBind<ItemFlingEffectReadPathParams> "/api/v2/item-fling-effect/{id}/"  (fun x ->  ItemFlingEffectApiHandler.ItemFlingEffectRead x);
      HttpGet >=> route "/api/v2/item-pocket/" >=>  ItemPocketApiHandler.ItemPocketList;
      HttpGet >=> routeBind<ItemPocketReadPathParams> "/api/v2/item-pocket/{id}/"  (fun x ->  ItemPocketApiHandler.ItemPocketRead x);
      HttpGet >=> route "/api/v2/language/" >=>  LanguageApiHandler.LanguageList;
      HttpGet >=> routeBind<LanguageReadPathParams> "/api/v2/language/{id}/"  (fun x ->  LanguageApiHandler.LanguageRead x);
      HttpGet >=> route "/api/v2/location/" >=>  LocationApiHandler.LocationList;
      HttpGet >=> routeBind<LocationReadPathParams> "/api/v2/location/{id}/"  (fun x ->  LocationApiHandler.LocationRead x);
      HttpGet >=> route "/api/v2/location-area/" >=>  LocationAreaApiHandler.LocationAreaList;
      HttpGet >=> routeBind<LocationAreaReadPathParams> "/api/v2/location-area/{id}/"  (fun x ->  LocationAreaApiHandler.LocationAreaRead x);
      HttpGet >=> route "/api/v2/machine/" >=>  MachineApiHandler.MachineList;
      HttpGet >=> routeBind<MachineReadPathParams> "/api/v2/machine/{id}/"  (fun x ->  MachineApiHandler.MachineRead x);
      HttpGet >=> route "/api/v2/move/" >=>  MoveApiHandler.MoveList;
      HttpGet >=> routeBind<MoveReadPathParams> "/api/v2/move/{id}/"  (fun x ->  MoveApiHandler.MoveRead x);
      HttpGet >=> route "/api/v2/move-ailment/" >=>  MoveAilmentApiHandler.MoveAilmentList;
      HttpGet >=> routeBind<MoveAilmentReadPathParams> "/api/v2/move-ailment/{id}/"  (fun x ->  MoveAilmentApiHandler.MoveAilmentRead x);
      HttpGet >=> route "/api/v2/move-battle-style/" >=>  MoveBattleStyleApiHandler.MoveBattleStyleList;
      HttpGet >=> routeBind<MoveBattleStyleReadPathParams> "/api/v2/move-battle-style/{id}/"  (fun x ->  MoveBattleStyleApiHandler.MoveBattleStyleRead x);
      HttpGet >=> route "/api/v2/move-category/" >=>  MoveCategoryApiHandler.MoveCategoryList;
      HttpGet >=> routeBind<MoveCategoryReadPathParams> "/api/v2/move-category/{id}/"  (fun x ->  MoveCategoryApiHandler.MoveCategoryRead x);
      HttpGet >=> route "/api/v2/move-damage-class/" >=>  MoveDamageClassApiHandler.MoveDamageClassList;
      HttpGet >=> routeBind<MoveDamageClassReadPathParams> "/api/v2/move-damage-class/{id}/"  (fun x ->  MoveDamageClassApiHandler.MoveDamageClassRead x);
      HttpGet >=> route "/api/v2/move-learn-method/" >=>  MoveLearnMethodApiHandler.MoveLearnMethodList;
      HttpGet >=> routeBind<MoveLearnMethodReadPathParams> "/api/v2/move-learn-method/{id}/"  (fun x ->  MoveLearnMethodApiHandler.MoveLearnMethodRead x);
      HttpGet >=> route "/api/v2/move-target/" >=>  MoveTargetApiHandler.MoveTargetList;
      HttpGet >=> routeBind<MoveTargetReadPathParams> "/api/v2/move-target/{id}/"  (fun x ->  MoveTargetApiHandler.MoveTargetRead x);
      HttpGet >=> route "/api/v2/nature/" >=>  NatureApiHandler.NatureList;
      HttpGet >=> routeBind<NatureReadPathParams> "/api/v2/nature/{id}/"  (fun x ->  NatureApiHandler.NatureRead x);
      HttpGet >=> route "/api/v2/pal-park-area/" >=>  PalParkAreaApiHandler.PalParkAreaList;
      HttpGet >=> routeBind<PalParkAreaReadPathParams> "/api/v2/pal-park-area/{id}/"  (fun x ->  PalParkAreaApiHandler.PalParkAreaRead x);
      HttpGet >=> route "/api/v2/pokeathlon-stat/" >=>  PokeathlonStatApiHandler.PokeathlonStatList;
      HttpGet >=> routeBind<PokeathlonStatReadPathParams> "/api/v2/pokeathlon-stat/{id}/"  (fun x ->  PokeathlonStatApiHandler.PokeathlonStatRead x);
      HttpGet >=> route "/api/v2/pokedex/" >=>  PokedexApiHandler.PokedexList;
      HttpGet >=> routeBind<PokedexReadPathParams> "/api/v2/pokedex/{id}/"  (fun x ->  PokedexApiHandler.PokedexRead x);
      HttpGet >=> route "/api/v2/pokemon/" >=>  PokemonApiHandler.PokemonList;
      HttpGet >=> routeBind<PokemonReadPathParams> "/api/v2/pokemon/{id}/"  (fun x ->  PokemonApiHandler.PokemonRead x);
      HttpGet >=> route "/api/v2/pokemon-color/" >=>  PokemonColorApiHandler.PokemonColorList;
      HttpGet >=> routeBind<PokemonColorReadPathParams> "/api/v2/pokemon-color/{id}/"  (fun x ->  PokemonColorApiHandler.PokemonColorRead x);
      HttpGet >=> route "/api/v2/pokemon-form/" >=>  PokemonFormApiHandler.PokemonFormList;
      HttpGet >=> routeBind<PokemonFormReadPathParams> "/api/v2/pokemon-form/{id}/"  (fun x ->  PokemonFormApiHandler.PokemonFormRead x);
      HttpGet >=> route "/api/v2/pokemon-habitat/" >=>  PokemonHabitatApiHandler.PokemonHabitatList;
      HttpGet >=> routeBind<PokemonHabitatReadPathParams> "/api/v2/pokemon-habitat/{id}/"  (fun x ->  PokemonHabitatApiHandler.PokemonHabitatRead x);
      HttpGet >=> route "/api/v2/pokemon-shape/" >=>  PokemonShapeApiHandler.PokemonShapeList;
      HttpGet >=> routeBind<PokemonShapeReadPathParams> "/api/v2/pokemon-shape/{id}/"  (fun x ->  PokemonShapeApiHandler.PokemonShapeRead x);
      HttpGet >=> route "/api/v2/pokemon-species/" >=>  PokemonSpeciesApiHandler.PokemonSpeciesList;
      HttpGet >=> routeBind<PokemonSpeciesReadPathParams> "/api/v2/pokemon-species/{id}/"  (fun x ->  PokemonSpeciesApiHandler.PokemonSpeciesRead x);
      HttpGet >=> route "/api/v2/region/" >=>  RegionApiHandler.RegionList;
      HttpGet >=> routeBind<RegionReadPathParams> "/api/v2/region/{id}/"  (fun x ->  RegionApiHandler.RegionRead x);
      HttpGet >=> route "/api/v2/stat/" >=>  StatApiHandler.StatList;
      HttpGet >=> routeBind<StatReadPathParams> "/api/v2/stat/{id}/"  (fun x ->  StatApiHandler.StatRead x);
      HttpGet >=> route "/api/v2/super-contest-effect/" >=>  SuperContestEffectApiHandler.SuperContestEffectList;
      HttpGet >=> routeBind<SuperContestEffectReadPathParams> "/api/v2/super-contest-effect/{id}/"  (fun x ->  SuperContestEffectApiHandler.SuperContestEffectRead x);
      HttpGet >=> route "/api/v2/type/" >=>  TypeApiHandler.TypeList;
      HttpGet >=> routeBind<TypeReadPathParams> "/api/v2/type/{id}/"  (fun x ->  TypeApiHandler.TypeRead x);
      HttpGet >=> route "/api/v2/version/" >=>  VersionApiHandler.VersionList;
      HttpGet >=> routeBind<VersionReadPathParams> "/api/v2/version/{id}/"  (fun x ->  VersionApiHandler.VersionRead x);
      HttpGet >=> route "/api/v2/version-group/" >=>  VersionGroupApiHandler.VersionGroupList;
      HttpGet >=> routeBind<VersionGroupReadPathParams> "/api/v2/version-group/{id}/"  (fun x ->  VersionGroupApiHandler.VersionGroupRead x);
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