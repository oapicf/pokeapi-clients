namespace OpenAPI
open LocationApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module LocationApiServiceInterface =

    //#region Service interface
    type ILocationApiService =
      abstract member LocationAreaList : unit -> LocationAreaListResult
      abstract member LocationAreaRetrieve : unit -> LocationAreaRetrieveResult
      abstract member LocationList : unit -> LocationListResult
      abstract member LocationRetrieve : unit -> LocationRetrieveResult
      abstract member PalParkAreaList : unit -> PalParkAreaListResult
      abstract member PalParkAreaRetrieve : unit -> PalParkAreaRetrieveResult
      abstract member RegionList : unit -> RegionListResult
      abstract member RegionRetrieve : unit -> RegionRetrieveResult
    //#endregion