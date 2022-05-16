namespace OpenAPI

open System.Collections.Generic
open System

module CharacteristicApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type CharacteristicListQueryParams = {
      limit : int option;


      offset : int option;

    }
    //#endregion


    type CharacteristicListDefaultStatusCodeResponse = {
      content:string;
      
    }
    type CharacteristicListResult = CharacteristicListDefaultStatusCode of CharacteristicListDefaultStatusCodeResponse

    type CharacteristicListArgs = {
      queryParams:Result<CharacteristicListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type CharacteristicReadPathParams = {
      id : int ;
    }
    //#endregion


    type CharacteristicReadDefaultStatusCodeResponse = {
      content:string;
      
    }
    type CharacteristicReadResult = CharacteristicReadDefaultStatusCode of CharacteristicReadDefaultStatusCodeResponse

    type CharacteristicReadArgs = {
      pathParams:CharacteristicReadPathParams;
    }
