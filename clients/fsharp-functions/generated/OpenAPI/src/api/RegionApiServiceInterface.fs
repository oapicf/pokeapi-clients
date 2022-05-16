namespace OpenAPI
open RegionApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module RegionApiServiceInterface =

    //#region Service interface
    type IRegionApiService =
      abstract member RegionList : unit -> RegionListResult
      abstract member RegionRead : unit -> RegionReadResult
    //#endregion