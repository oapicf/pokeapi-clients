-module(openapi_pokemon_encounter_version_detail_response).

-include("openapi.hrl").

-export([openapi_pokemon_encounter_version_detail_response/0]).

-export([openapi_pokemon_encounter_version_detail_response/1]).

-export_type([openapi_pokemon_encounter_version_detail_response/0]).

-type openapi_pokemon_encounter_version_detail_response() ::
  [ {'version', openapi_version_summary:openapi_version_summary() }
  | {'max_chance', integer() }
  | {'encounter_details', list(openapi_pokemon_encounter_detail_response:openapi_pokemon_encounter_detail_response()) }
  ].


openapi_pokemon_encounter_version_detail_response() ->
    openapi_pokemon_encounter_version_detail_response([]).

openapi_pokemon_encounter_version_detail_response(Fields) ->
  Default = [ {'version', openapi_version_summary:openapi_version_summary() }
            , {'max_chance', integer() }
            , {'encounter_details', list(openapi_pokemon_encounter_detail_response:openapi_pokemon_encounter_detail_response()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

