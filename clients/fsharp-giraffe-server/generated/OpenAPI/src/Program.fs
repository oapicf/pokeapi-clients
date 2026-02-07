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
      HttpGet >=> route "/api/v2/berry-firmness/" >=>  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  BerriesApiHandler.BerryFirmnessList;
      HttpGet >=> routeBind<BerryFirmnessRetrievePathParams> "/api/v2/berry-firmness/{id}/"  (fun x ->  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  BerriesApiHandler.BerryFirmnessRetrieve x);
      HttpGet >=> route "/api/v2/berry-flavor/" >=>  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  BerriesApiHandler.BerryFlavorList;
      HttpGet >=> routeBind<BerryFlavorRetrievePathParams> "/api/v2/berry-flavor/{id}/"  (fun x ->  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  BerriesApiHandler.BerryFlavorRetrieve x);
      HttpGet >=> route "/api/v2/berry/" >=>  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  BerriesApiHandler.BerryList;
      HttpGet >=> routeBind<BerryRetrievePathParams> "/api/v2/berry/{id}/"  (fun x ->  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  BerriesApiHandler.BerryRetrieve x);
      HttpGet >=> route "/api/v2/contest-effect/" >=>  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  ContestsApiHandler.ContestEffectList;
      HttpGet >=> routeBind<ContestEffectRetrievePathParams> "/api/v2/contest-effect/{id}/"  (fun x ->  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  ContestsApiHandler.ContestEffectRetrieve x);
      HttpGet >=> route "/api/v2/contest-type/" >=>  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  ContestsApiHandler.ContestTypeList;
      HttpGet >=> routeBind<ContestTypeRetrievePathParams> "/api/v2/contest-type/{id}/"  (fun x ->  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  ContestsApiHandler.ContestTypeRetrieve x);
      HttpGet >=> route "/api/v2/super-contest-effect/" >=>  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  ContestsApiHandler.SuperContestEffectList;
      HttpGet >=> routeBind<SuperContestEffectRetrievePathParams> "/api/v2/super-contest-effect/{id}/"  (fun x ->  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  ContestsApiHandler.SuperContestEffectRetrieve x);
      HttpGet >=> route "/api/v2/encounter-condition/" >=>  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  EncountersApiHandler.EncounterConditionList;
      HttpGet >=> routeBind<EncounterConditionRetrievePathParams> "/api/v2/encounter-condition/{id}/"  (fun x ->  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  EncountersApiHandler.EncounterConditionRetrieve x);
      HttpGet >=> route "/api/v2/encounter-condition-value/" >=>  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  EncountersApiHandler.EncounterConditionValueList;
      HttpGet >=> routeBind<EncounterConditionValueRetrievePathParams> "/api/v2/encounter-condition-value/{id}/"  (fun x ->  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  EncountersApiHandler.EncounterConditionValueRetrieve x);
      HttpGet >=> route "/api/v2/encounter-method/" >=>  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  EncountersApiHandler.EncounterMethodList;
      HttpGet >=> routeBind<EncounterMethodRetrievePathParams> "/api/v2/encounter-method/{id}/"  (fun x ->  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  EncountersApiHandler.EncounterMethodRetrieve x);
      HttpGet >=> routeBind<PokemonEncountersRetrievePathParams> "/api/v2/pokemon/{pokemon_id}/encounters"  (fun x ->  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  EncountersApiHandler.PokemonEncountersRetrieve x);
      HttpGet >=> route "/api/v2/evolution-chain/" >=>  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  EvolutionApiHandler.EvolutionChainList;
      HttpGet >=> routeBind<EvolutionChainRetrievePathParams> "/api/v2/evolution-chain/{id}/"  (fun x ->  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  EvolutionApiHandler.EvolutionChainRetrieve x);
      HttpGet >=> route "/api/v2/evolution-trigger/" >=>  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  EvolutionApiHandler.EvolutionTriggerList;
      HttpGet >=> routeBind<EvolutionTriggerRetrievePathParams> "/api/v2/evolution-trigger/{id}/"  (fun x ->  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  EvolutionApiHandler.EvolutionTriggerRetrieve x);
      HttpGet >=> route "/api/v2/generation/" >=>  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  GamesApiHandler.GenerationList;
      HttpGet >=> routeBind<GenerationRetrievePathParams> "/api/v2/generation/{id}/"  (fun x ->  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  GamesApiHandler.GenerationRetrieve x);
      HttpGet >=> route "/api/v2/pokedex/" >=>  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  GamesApiHandler.PokedexList;
      HttpGet >=> routeBind<PokedexRetrievePathParams> "/api/v2/pokedex/{id}/"  (fun x ->  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  GamesApiHandler.PokedexRetrieve x);
      HttpGet >=> route "/api/v2/version-group/" >=>  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  GamesApiHandler.VersionGroupList;
      HttpGet >=> routeBind<VersionGroupRetrievePathParams> "/api/v2/version-group/{id}/"  (fun x ->  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  GamesApiHandler.VersionGroupRetrieve x);
      HttpGet >=> route "/api/v2/version/" >=>  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  GamesApiHandler.VersionList;
      HttpGet >=> routeBind<VersionRetrievePathParams> "/api/v2/version/{id}/"  (fun x ->  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  GamesApiHandler.VersionRetrieve x);
      HttpGet >=> route "/api/v2/item-attribute/" >=>  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  ItemsApiHandler.ItemAttributeList;
      HttpGet >=> routeBind<ItemAttributeRetrievePathParams> "/api/v2/item-attribute/{id}/"  (fun x ->  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  ItemsApiHandler.ItemAttributeRetrieve x);
      HttpGet >=> route "/api/v2/item-category/" >=>  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  ItemsApiHandler.ItemCategoryList;
      HttpGet >=> routeBind<ItemCategoryRetrievePathParams> "/api/v2/item-category/{id}/"  (fun x ->  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  ItemsApiHandler.ItemCategoryRetrieve x);
      HttpGet >=> route "/api/v2/item-fling-effect/" >=>  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  ItemsApiHandler.ItemFlingEffectList;
      HttpGet >=> routeBind<ItemFlingEffectRetrievePathParams> "/api/v2/item-fling-effect/{id}/"  (fun x ->  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  ItemsApiHandler.ItemFlingEffectRetrieve x);
      HttpGet >=> route "/api/v2/item/" >=>  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  ItemsApiHandler.ItemList;
      HttpGet >=> route "/api/v2/item-pocket/" >=>  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  ItemsApiHandler.ItemPocketList;
      HttpGet >=> routeBind<ItemPocketRetrievePathParams> "/api/v2/item-pocket/{id}/"  (fun x ->  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  ItemsApiHandler.ItemPocketRetrieve x);
      HttpGet >=> routeBind<ItemRetrievePathParams> "/api/v2/item/{id}/"  (fun x ->  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  ItemsApiHandler.ItemRetrieve x);
      HttpGet >=> route "/api/v2/location-area/" >=>  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  LocationApiHandler.LocationAreaList;
      HttpGet >=> routeBind<LocationAreaRetrievePathParams> "/api/v2/location-area/{id}/"  (fun x ->  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  LocationApiHandler.LocationAreaRetrieve x);
      HttpGet >=> route "/api/v2/location/" >=>  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  LocationApiHandler.LocationList;
      HttpGet >=> routeBind<LocationRetrievePathParams> "/api/v2/location/{id}/"  (fun x ->  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  LocationApiHandler.LocationRetrieve x);
      HttpGet >=> route "/api/v2/pal-park-area/" >=>  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  LocationApiHandler.PalParkAreaList;
      HttpGet >=> routeBind<PalParkAreaRetrievePathParams> "/api/v2/pal-park-area/{id}/"  (fun x ->  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  LocationApiHandler.PalParkAreaRetrieve x);
      HttpGet >=> route "/api/v2/region/" >=>  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  LocationApiHandler.RegionList;
      HttpGet >=> routeBind<RegionRetrievePathParams> "/api/v2/region/{id}/"  (fun x ->  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  LocationApiHandler.RegionRetrieve x);
      HttpGet >=> route "/api/v2/machine/" >=>  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  MachinesApiHandler.MachineList;
      HttpGet >=> routeBind<MachineRetrievePathParams> "/api/v2/machine/{id}/"  (fun x ->  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  MachinesApiHandler.MachineRetrieve x);
      HttpGet >=> route "/api/v2/move-ailment/" >=>  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  MovesApiHandler.MoveAilmentList;
      HttpGet >=> routeBind<MoveAilmentRetrievePathParams> "/api/v2/move-ailment/{id}/"  (fun x ->  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  MovesApiHandler.MoveAilmentRetrieve x);
      HttpGet >=> route "/api/v2/move-battle-style/" >=>  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  MovesApiHandler.MoveBattleStyleList;
      HttpGet >=> routeBind<MoveBattleStyleRetrievePathParams> "/api/v2/move-battle-style/{id}/"  (fun x ->  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  MovesApiHandler.MoveBattleStyleRetrieve x);
      HttpGet >=> route "/api/v2/move-category/" >=>  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  MovesApiHandler.MoveCategoryList;
      HttpGet >=> routeBind<MoveCategoryRetrievePathParams> "/api/v2/move-category/{id}/"  (fun x ->  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  MovesApiHandler.MoveCategoryRetrieve x);
      HttpGet >=> route "/api/v2/move-learn-method/" >=>  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  MovesApiHandler.MoveLearnMethodList;
      HttpGet >=> routeBind<MoveLearnMethodRetrievePathParams> "/api/v2/move-learn-method/{id}/"  (fun x ->  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  MovesApiHandler.MoveLearnMethodRetrieve x);
      HttpGet >=> route "/api/v2/move/" >=>  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  MovesApiHandler.MoveList;
      HttpGet >=> routeBind<MoveRetrievePathParams> "/api/v2/move/{id}/"  (fun x ->  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  MovesApiHandler.MoveRetrieve x);
      HttpGet >=> route "/api/v2/move-target/" >=>  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  MovesApiHandler.MoveTargetList;
      HttpGet >=> routeBind<MoveTargetRetrievePathParams> "/api/v2/move-target/{id}/"  (fun x ->  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  MovesApiHandler.MoveTargetRetrieve x);
      HttpGet >=> route "/api/v2/ability/" >=>  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  PokemonApiHandler.AbilityList;
      HttpGet >=> routeBind<AbilityRetrievePathParams> "/api/v2/ability/{id}/"  (fun x ->  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  PokemonApiHandler.AbilityRetrieve x);
      HttpGet >=> route "/api/v2/characteristic/" >=>  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  PokemonApiHandler.CharacteristicList;
      HttpGet >=> routeBind<CharacteristicRetrievePathParams> "/api/v2/characteristic/{id}/"  (fun x ->  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  PokemonApiHandler.CharacteristicRetrieve x);
      HttpGet >=> route "/api/v2/egg-group/" >=>  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  PokemonApiHandler.EggGroupList;
      HttpGet >=> routeBind<EggGroupRetrievePathParams> "/api/v2/egg-group/{id}/"  (fun x ->  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  PokemonApiHandler.EggGroupRetrieve x);
      HttpGet >=> route "/api/v2/gender/" >=>  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  PokemonApiHandler.GenderList;
      HttpGet >=> routeBind<GenderRetrievePathParams> "/api/v2/gender/{id}/"  (fun x ->  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  PokemonApiHandler.GenderRetrieve x);
      HttpGet >=> route "/api/v2/growth-rate/" >=>  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  PokemonApiHandler.GrowthRateList;
      HttpGet >=> routeBind<GrowthRateRetrievePathParams> "/api/v2/growth-rate/{id}/"  (fun x ->  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  PokemonApiHandler.GrowthRateRetrieve x);
      HttpGet >=> route "/api/v2/move-damage-class/" >=>  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  PokemonApiHandler.MoveDamageClassList;
      HttpGet >=> routeBind<MoveDamageClassRetrievePathParams> "/api/v2/move-damage-class/{id}/"  (fun x ->  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  PokemonApiHandler.MoveDamageClassRetrieve x);
      HttpGet >=> route "/api/v2/nature/" >=>  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  PokemonApiHandler.NatureList;
      HttpGet >=> routeBind<NatureRetrievePathParams> "/api/v2/nature/{id}/"  (fun x ->  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  PokemonApiHandler.NatureRetrieve x);
      HttpGet >=> route "/api/v2/pokeathlon-stat/" >=>  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  PokemonApiHandler.PokeathlonStatList;
      HttpGet >=> routeBind<PokeathlonStatRetrievePathParams> "/api/v2/pokeathlon-stat/{id}/"  (fun x ->  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  PokemonApiHandler.PokeathlonStatRetrieve x);
      HttpGet >=> route "/api/v2/pokemon-color/" >=>  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  PokemonApiHandler.PokemonColorList;
      HttpGet >=> routeBind<PokemonColorRetrievePathParams> "/api/v2/pokemon-color/{id}/"  (fun x ->  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  PokemonApiHandler.PokemonColorRetrieve x);
      HttpGet >=> route "/api/v2/pokemon-form/" >=>  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  PokemonApiHandler.PokemonFormList;
      HttpGet >=> routeBind<PokemonFormRetrievePathParams> "/api/v2/pokemon-form/{id}/"  (fun x ->  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  PokemonApiHandler.PokemonFormRetrieve x);
      HttpGet >=> route "/api/v2/pokemon-habitat/" >=>  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  PokemonApiHandler.PokemonHabitatList;
      HttpGet >=> routeBind<PokemonHabitatRetrievePathParams> "/api/v2/pokemon-habitat/{id}/"  (fun x ->  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  PokemonApiHandler.PokemonHabitatRetrieve x);
      HttpGet >=> route "/api/v2/pokemon/" >=>  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  PokemonApiHandler.PokemonList;
      HttpGet >=> routeBind<PokemonRetrievePathParams> "/api/v2/pokemon/{id}/"  (fun x ->  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  PokemonApiHandler.PokemonRetrieve x);
      HttpGet >=> route "/api/v2/pokemon-shape/" >=>  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  PokemonApiHandler.PokemonShapeList;
      HttpGet >=> routeBind<PokemonShapeRetrievePathParams> "/api/v2/pokemon-shape/{id}/"  (fun x ->  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  PokemonApiHandler.PokemonShapeRetrieve x);
      HttpGet >=> route "/api/v2/pokemon-species/" >=>  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  PokemonApiHandler.PokemonSpeciesList;
      HttpGet >=> routeBind<PokemonSpeciesRetrievePathParams> "/api/v2/pokemon-species/{id}/"  (fun x ->  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  PokemonApiHandler.PokemonSpeciesRetrieve x);
      HttpGet >=> route "/api/v2/stat/" >=>  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  PokemonApiHandler.StatList;
      HttpGet >=> routeBind<StatRetrievePathParams> "/api/v2/stat/{id}/"  (fun x ->  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  PokemonApiHandler.StatRetrieve x);
      HttpGet >=> route "/api/v2/type/" >=>  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  PokemonApiHandler.TypeList;
      HttpGet >=> routeBind<TypeRetrievePathParams> "/api/v2/type/{id}/"  (fun x ->  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  PokemonApiHandler.TypeRetrieve x);
      HttpGet >=> route "/api/v2/language/" >=>  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  UtilityApiHandler.LanguageList;
      HttpGet >=> routeBind<LanguageRetrievePathParams> "/api/v2/language/{id}/"  (fun x ->  >=> challenge ApiKeyDefaults.AuthenticationScheme >=> requiresAuthentication authFailure >=>  UtilityApiHandler.LanguageRetrieve x);
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