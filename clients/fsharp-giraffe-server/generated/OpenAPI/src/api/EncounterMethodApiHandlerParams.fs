namespace OpenAPI

open System.Collections.Generic
open System

module EncounterMethodApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type EncounterMethodListQueryParams = {
      limit : int option;


      offset : int option;

    }
    //#endregion


    type EncounterMethodListDefaultStatusCodeResponse = {
      content:string;
      
    }
    type EncounterMethodListResult = EncounterMethodListDefaultStatusCode of EncounterMethodListDefaultStatusCodeResponse

    type EncounterMethodListArgs = {
      queryParams:Result<EncounterMethodListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type EncounterMethodReadPathParams = {
      id : int ;
    }
    //#endregion


    type EncounterMethodReadDefaultStatusCodeResponse = {
      content:string;
      
    }
    type EncounterMethodReadResult = EncounterMethodReadDefaultStatusCode of EncounterMethodReadDefaultStatusCodeResponse

    type EncounterMethodReadArgs = {
      pathParams:EncounterMethodReadPathParams;
    }
