namespace OpenAPI
open OpenAPI.Model.LocationAreaDetail
open OpenAPI.Model.LocationDetail
open OpenAPI.Model.PaginatedLocationAreaSummaryList
open OpenAPI.Model.PaginatedLocationSummaryList
open OpenAPI.Model.PaginatedPalParkAreaSummaryList
open OpenAPI.Model.PaginatedRegionSummaryList
open OpenAPI.Model.PalParkAreaDetail
open OpenAPI.Model.RegionDetail
open LocationApiHandlerParams
open LocationApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module LocationApiServiceImplementation =

    //#region Service implementation
    type LocationApiServiceImpl() =
      interface ILocationApiService with

        member this.LocationAreaList ctx args =
            let content = "" :> obj :?> PaginatedLocationAreaSummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LocationAreaListStatusCode200 { content = content }

        member this.LocationAreaRetrieve ctx args =
            let content = "" :> obj :?> LocationAreaDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LocationAreaRetrieveStatusCode200 { content = content }

        member this.LocationList ctx args =
            let content = "" :> obj :?> PaginatedLocationSummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LocationListStatusCode200 { content = content }

        member this.LocationRetrieve ctx args =
            let content = "" :> obj :?> LocationDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LocationRetrieveStatusCode200 { content = content }

        member this.PalParkAreaList ctx args =
            let content = "" :> obj :?> PaginatedPalParkAreaSummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PalParkAreaListStatusCode200 { content = content }

        member this.PalParkAreaRetrieve ctx args =
            let content = "" :> obj :?> PalParkAreaDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PalParkAreaRetrieveStatusCode200 { content = content }

        member this.RegionList ctx args =
            let content = "" :> obj :?> PaginatedRegionSummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RegionListStatusCode200 { content = content }

        member this.RegionRetrieve ctx args =
            let content = "" :> obj :?> RegionDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RegionRetrieveStatusCode200 { content = content }

      //#endregion

    let LocationApiService = LocationApiServiceImpl() :> ILocationApiService