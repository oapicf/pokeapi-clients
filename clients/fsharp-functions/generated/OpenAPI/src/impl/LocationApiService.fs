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

module LocationApiServiceImplementation =

    //#region Service implementation
    type LocationApiServiceImpl() =
      interface ILocationApiService with

        member this.LocationAreaList () =
            let content = "" :> obj :?> PaginatedLocationAreaSummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LocationAreaListStatusCode200 { content = content }

        member this.LocationAreaRetrieve () =
            let content = "" :> obj :?> LocationAreaDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LocationAreaRetrieveStatusCode200 { content = content }

        member this.LocationList () =
            let content = "" :> obj :?> PaginatedLocationSummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LocationListStatusCode200 { content = content }

        member this.LocationRetrieve () =
            let content = "" :> obj :?> LocationDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LocationRetrieveStatusCode200 { content = content }

        member this.PalParkAreaList () =
            let content = "" :> obj :?> PaginatedPalParkAreaSummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PalParkAreaListStatusCode200 { content = content }

        member this.PalParkAreaRetrieve () =
            let content = "" :> obj :?> PalParkAreaDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PalParkAreaRetrieveStatusCode200 { content = content }

        member this.RegionList () =
            let content = "" :> obj :?> PaginatedRegionSummaryList // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RegionListStatusCode200 { content = content }

        member this.RegionRetrieve () =
            let content = "" :> obj :?> RegionDetail // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RegionRetrieveStatusCode200 { content = content }

      //#endregion

    let LocationApiService = LocationApiServiceImpl() :> ILocationApiService