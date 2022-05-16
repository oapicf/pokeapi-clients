namespace OpenAPI

open System.Collections.Generic
open System

module GrowthRateApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type GrowthRateListQueryParams = {
      limit : int option;


      offset : int option;

    }
    //#endregion


    type GrowthRateListDefaultStatusCodeResponse = {
      content:string;
      
    }
    type GrowthRateListResult = GrowthRateListDefaultStatusCode of GrowthRateListDefaultStatusCodeResponse

    type GrowthRateListArgs = {
      queryParams:Result<GrowthRateListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GrowthRateReadPathParams = {
      id : int ;
    }
    //#endregion


    type GrowthRateReadDefaultStatusCodeResponse = {
      content:string;
      
    }
    type GrowthRateReadResult = GrowthRateReadDefaultStatusCode of GrowthRateReadDefaultStatusCodeResponse

    type GrowthRateReadArgs = {
      pathParams:GrowthRateReadPathParams;
    }
