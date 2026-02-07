namespace OpenAPI
open OpenAPI.Model.MoveBattleStyleDetail
open OpenAPI.Model.MoveDetail
open OpenAPI.Model.MoveLearnMethodDetail
open OpenAPI.Model.MoveMetaAilmentDetail
open OpenAPI.Model.MoveMetaCategoryDetail
open OpenAPI.Model.MoveTargetDetail
open OpenAPI.Model.PaginatedMoveBattleStyleSummaryList
open OpenAPI.Model.PaginatedMoveLearnMethodSummaryList
open OpenAPI.Model.PaginatedMoveMetaAilmentSummaryList
open OpenAPI.Model.PaginatedMoveMetaCategorySummaryList
open OpenAPI.Model.PaginatedMoveSummaryList
open OpenAPI.Model.PaginatedMoveTargetSummaryList
open MovesApiHandlerParams
open MovesApiServiceInterface
open System.Collections.Generic
open System

module MovesApiServiceImplementation =

    //#region Service implementation
    type MovesApiServiceImpl() =
      interface IMovesApiService with

        member this.MoveAilmentList () =
            let content = "" :> obj :?> PaginatedMoveMetaAilmentSummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MoveAilmentListStatusCode200 { content = content }

        member this.MoveAilmentRetrieve () =
            let content = "" :> obj :?> MoveMetaAilmentDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MoveAilmentRetrieveStatusCode200 { content = content }

        member this.MoveBattleStyleList () =
            let content = "" :> obj :?> PaginatedMoveBattleStyleSummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MoveBattleStyleListStatusCode200 { content = content }

        member this.MoveBattleStyleRetrieve () =
            let content = "" :> obj :?> MoveBattleStyleDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MoveBattleStyleRetrieveStatusCode200 { content = content }

        member this.MoveCategoryList () =
            let content = "" :> obj :?> PaginatedMoveMetaCategorySummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MoveCategoryListStatusCode200 { content = content }

        member this.MoveCategoryRetrieve () =
            let content = "" :> obj :?> MoveMetaCategoryDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MoveCategoryRetrieveStatusCode200 { content = content }

        member this.MoveLearnMethodList () =
            let content = "" :> obj :?> PaginatedMoveLearnMethodSummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MoveLearnMethodListStatusCode200 { content = content }

        member this.MoveLearnMethodRetrieve () =
            let content = "" :> obj :?> MoveLearnMethodDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MoveLearnMethodRetrieveStatusCode200 { content = content }

        member this.MoveList () =
            let content = "" :> obj :?> PaginatedMoveSummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MoveListStatusCode200 { content = content }

        member this.MoveRetrieve () =
            let content = "" :> obj :?> MoveDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MoveRetrieveStatusCode200 { content = content }

        member this.MoveTargetList () =
            let content = "" :> obj :?> PaginatedMoveTargetSummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MoveTargetListStatusCode200 { content = content }

        member this.MoveTargetRetrieve () =
            let content = "" :> obj :?> MoveTargetDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MoveTargetRetrieveStatusCode200 { content = content }

      //#endregion

    let MovesApiService = MovesApiServiceImpl() :> IMovesApiService