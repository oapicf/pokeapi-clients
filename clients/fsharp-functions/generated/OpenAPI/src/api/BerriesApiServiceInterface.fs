namespace OpenAPI
open BerriesApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module BerriesApiServiceInterface =

    //#region Service interface
    type IBerriesApiService =
      abstract member BerryFirmnessList : unit -> BerryFirmnessListResult
      abstract member BerryFirmnessRetrieve : unit -> BerryFirmnessRetrieveResult
      abstract member BerryFlavorList : unit -> BerryFlavorListResult
      abstract member BerryFlavorRetrieve : unit -> BerryFlavorRetrieveResult
      abstract member BerryList : unit -> BerryListResult
      abstract member BerryRetrieve : unit -> BerryRetrieveResult
    //#endregion