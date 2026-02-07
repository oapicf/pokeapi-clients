-module(openapi_encounter_condition_summary).

-include("openapi.hrl").

-export([openapi_encounter_condition_summary/0]).

-export([openapi_encounter_condition_summary/1]).

-export_type([openapi_encounter_condition_summary/0]).

-type openapi_encounter_condition_summary() ::
  [ {'name', binary() }
  | {'url', openapi_u_ri:openapi_u_ri() }
  ].


openapi_encounter_condition_summary() ->
    openapi_encounter_condition_summary([]).

openapi_encounter_condition_summary(Fields) ->
  Default = [ {'name', binary() }
            , {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

