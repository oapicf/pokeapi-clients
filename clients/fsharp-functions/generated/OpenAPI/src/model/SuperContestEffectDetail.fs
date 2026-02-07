namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MoveSummary
open OpenAPI.Model.SuperContestEffectFlavorText

module SuperContestEffectDetail =

  //#region SuperContestEffectDetail

  [<CLIMutable>]
  type SuperContestEffectDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "appeal")>]
    Appeal : int;
    [<JsonProperty(PropertyName = "flavor_text_entries")>]
    FlavorTextEntries : SuperContestEffectFlavorText[];
    [<JsonProperty(PropertyName = "moves")>]
    Moves : MoveSummary[];
  }

  //#endregion
