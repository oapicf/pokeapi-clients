namespace OpenAPI
open GrowthRateApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module GrowthRateApiServiceInterface =

    //#region Service interface
    type IGrowthRateApiService =
      abstract member GrowthRateList : unit -> GrowthRateListResult
      abstract member GrowthRateRead : unit -> GrowthRateReadResult
    //#endregion