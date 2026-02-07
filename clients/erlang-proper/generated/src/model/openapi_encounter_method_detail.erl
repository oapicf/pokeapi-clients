-module(openapi_encounter_method_detail).

-include("openapi.hrl").

-export([openapi_encounter_method_detail/0]).

-export([openapi_encounter_method_detail/1]).

-export_type([openapi_encounter_method_detail/0]).

-type openapi_encounter_method_detail() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'order', integer() }
  | {'names', list(openapi_encounter_method_name:openapi_encounter_method_name()) }
  ].


openapi_encounter_method_detail() ->
    openapi_encounter_method_detail([]).

openapi_encounter_method_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'order', integer() }
            , {'names', list(openapi_encounter_method_name:openapi_encounter_method_name()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

