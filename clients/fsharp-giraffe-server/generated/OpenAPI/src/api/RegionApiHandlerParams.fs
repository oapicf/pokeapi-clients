namespace OpenAPI

open System.Collections.Generic
open System

module RegionApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type RegionListQueryParams = {
      limit : int option;


      offset : int option;

    }
    //#endregion


    type RegionListDefaultStatusCodeResponse = {
      content:string;
      
    }
    type RegionListResult = RegionListDefaultStatusCode of RegionListDefaultStatusCodeResponse

    type RegionListArgs = {
      queryParams:Result<RegionListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type RegionReadPathParams = {
      id : int ;
    }
    //#endregion


    type RegionReadDefaultStatusCodeResponse = {
      content:string;
      
    }
    type RegionReadResult = RegionReadDefaultStatusCode of RegionReadDefaultStatusCodeResponse

    type RegionReadArgs = {
      pathParams:RegionReadPathParams;
    }
