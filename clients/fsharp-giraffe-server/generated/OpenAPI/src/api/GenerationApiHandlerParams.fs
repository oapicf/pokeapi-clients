namespace OpenAPI

open System.Collections.Generic
open System

module GenerationApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type GenerationListQueryParams = {
      limit : int option;


      offset : int option;

    }
    //#endregion


    type GenerationListDefaultStatusCodeResponse = {
      content:string;
      
    }
    type GenerationListResult = GenerationListDefaultStatusCode of GenerationListDefaultStatusCodeResponse

    type GenerationListArgs = {
      queryParams:Result<GenerationListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GenerationReadPathParams = {
      id : int ;
    }
    //#endregion


    type GenerationReadDefaultStatusCodeResponse = {
      content:string;
      
    }
    type GenerationReadResult = GenerationReadDefaultStatusCode of GenerationReadDefaultStatusCodeResponse

    type GenerationReadArgs = {
      pathParams:GenerationReadPathParams;
    }
