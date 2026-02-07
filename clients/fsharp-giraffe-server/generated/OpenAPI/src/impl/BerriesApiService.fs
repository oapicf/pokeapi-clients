namespace OpenAPI
open OpenAPI.Model.BerryDetail
open OpenAPI.Model.BerryFirmnessDetail
open OpenAPI.Model.BerryFlavorDetail
open OpenAPI.Model.PaginatedBerryFirmnessSummaryList
open OpenAPI.Model.PaginatedBerryFlavorSummaryList
open OpenAPI.Model.PaginatedBerrySummaryList
open BerriesApiHandlerParams
open BerriesApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module BerriesApiServiceImplementation =

    //#region Service implementation
    type BerriesApiServiceImpl() =
      interface IBerriesApiService with

        member this.BerryFirmnessList ctx args =
            let content = "" :> obj :?> PaginatedBerryFirmnessSummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BerryFirmnessListStatusCode200 { content = content }

        member this.BerryFirmnessRetrieve ctx args =
            let content = "" :> obj :?> BerryFirmnessDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BerryFirmnessRetrieveStatusCode200 { content = content }

        member this.BerryFlavorList ctx args =
            let content = "" :> obj :?> PaginatedBerryFlavorSummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BerryFlavorListStatusCode200 { content = content }

        member this.BerryFlavorRetrieve ctx args =
            let content = "" :> obj :?> BerryFlavorDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BerryFlavorRetrieveStatusCode200 { content = content }

        member this.BerryList ctx args =
            let content = "" :> obj :?> PaginatedBerrySummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BerryListStatusCode200 { content = content }

        member this.BerryRetrieve ctx args =
            let content = "" :> obj :?> BerryDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BerryRetrieveStatusCode200 { content = content }

      //#endregion

    let BerriesApiService = BerriesApiServiceImpl() :> IBerriesApiService