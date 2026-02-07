namespace OpenAPI
open OpenAPI.Model.ContestEffectDetail
open OpenAPI.Model.ContestTypeDetail
open OpenAPI.Model.PaginatedContestEffectSummaryList
open OpenAPI.Model.PaginatedContestTypeSummaryList
open OpenAPI.Model.PaginatedSuperContestEffectSummaryList
open OpenAPI.Model.SuperContestEffectDetail
open ContestsApiHandlerParams
open ContestsApiServiceInterface
open System.Collections.Generic
open System

module ContestsApiServiceImplementation =

    //#region Service implementation
    type ContestsApiServiceImpl() =
      interface IContestsApiService with

        member this.ContestEffectList () =
            let content = "" :> obj :?> PaginatedContestEffectSummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ContestEffectListStatusCode200 { content = content }

        member this.ContestEffectRetrieve () =
            let content = "" :> obj :?> ContestEffectDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ContestEffectRetrieveStatusCode200 { content = content }

        member this.ContestTypeList () =
            let content = "" :> obj :?> PaginatedContestTypeSummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ContestTypeListStatusCode200 { content = content }

        member this.ContestTypeRetrieve () =
            let content = "" :> obj :?> ContestTypeDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ContestTypeRetrieveStatusCode200 { content = content }

        member this.SuperContestEffectList () =
            let content = "" :> obj :?> PaginatedSuperContestEffectSummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SuperContestEffectListStatusCode200 { content = content }

        member this.SuperContestEffectRetrieve () =
            let content = "" :> obj :?> SuperContestEffectDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SuperContestEffectRetrieveStatusCode200 { content = content }

      //#endregion

    let ContestsApiService = ContestsApiServiceImpl() :> IContestsApiService