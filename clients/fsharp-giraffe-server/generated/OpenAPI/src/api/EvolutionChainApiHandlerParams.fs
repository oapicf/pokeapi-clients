namespace OpenAPI

open System.Collections.Generic
open System

module EvolutionChainApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type EvolutionChainListQueryParams = {
      limit : int option;


      offset : int option;

    }
    //#endregion


    type EvolutionChainListDefaultStatusCodeResponse = {
      content:string;
      
    }
    type EvolutionChainListResult = EvolutionChainListDefaultStatusCode of EvolutionChainListDefaultStatusCodeResponse

    type EvolutionChainListArgs = {
      queryParams:Result<EvolutionChainListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type EvolutionChainReadPathParams = {
      id : int ;
    }
    //#endregion


    type EvolutionChainReadDefaultStatusCodeResponse = {
      content:string;
      
    }
    type EvolutionChainReadResult = EvolutionChainReadDefaultStatusCode of EvolutionChainReadDefaultStatusCodeResponse

    type EvolutionChainReadArgs = {
      pathParams:EvolutionChainReadPathParams;
    }
