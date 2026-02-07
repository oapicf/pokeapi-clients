namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MoveSummary
open OpenAPI.Model.SuperContestEffectFlavorText

module SuperContestEffectDetail =

  //#region SuperContestEffectDetail


  type SuperContestEffectDetail = {
    Id : int;
    Appeal : int;
    FlavorTextEntries : SuperContestEffectFlavorText[];
    Moves : MoveSummary[];
  }
  //#endregion
