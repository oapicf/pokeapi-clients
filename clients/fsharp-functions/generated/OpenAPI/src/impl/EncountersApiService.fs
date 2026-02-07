namespace OpenAPI
open OpenAPI.Model.EncounterConditionDetail
open OpenAPI.Model.EncounterConditionValueDetail
open OpenAPI.Model.EncounterMethodDetail
open OpenAPI.Model.PaginatedEncounterConditionSummaryList
open OpenAPI.Model.PaginatedEncounterConditionValueSummaryList
open OpenAPI.Model.PaginatedEncounterMethodSummaryList
open OpenAPI.Model.PokemonEncountersRetrieve200ResponseInner
open EncountersApiHandlerParams
open EncountersApiServiceInterface
open System.Collections.Generic
open System

module EncountersApiServiceImplementation =

    //#region Service implementation
    type EncountersApiServiceImpl() =
      interface IEncountersApiService with

        member this.EncounterConditionList () =
            let content = "" :> obj :?> PaginatedEncounterConditionSummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            EncounterConditionListStatusCode200 { content = content }

        member this.EncounterConditionRetrieve () =
            let content = "" :> obj :?> EncounterConditionDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            EncounterConditionRetrieveStatusCode200 { content = content }

        member this.EncounterConditionValueList () =
            let content = "" :> obj :?> PaginatedEncounterConditionValueSummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            EncounterConditionValueListStatusCode200 { content = content }

        member this.EncounterConditionValueRetrieve () =
            let content = "" :> obj :?> EncounterConditionValueDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            EncounterConditionValueRetrieveStatusCode200 { content = content }

        member this.EncounterMethodList () =
            let content = "" :> obj :?> PaginatedEncounterMethodSummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            EncounterMethodListStatusCode200 { content = content }

        member this.EncounterMethodRetrieve () =
            let content = "" :> obj :?> EncounterMethodDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            EncounterMethodRetrieveStatusCode200 { content = content }

        member this.PokemonEncountersRetrieve () =
            let content = "" :> obj :?> PokemonEncountersRetrieve200ResponseInner[] // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PokemonEncountersRetrieveStatusCode200 { content = content }

      //#endregion

    let EncountersApiService = EncountersApiServiceImpl() :> IEncountersApiService