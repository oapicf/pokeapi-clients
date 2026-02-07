-module(openapi_characteristic_description).

-include("openapi.hrl").

-export([openapi_characteristic_description/0]).

-export([openapi_characteristic_description/1]).

-export_type([openapi_characteristic_description/0]).

-type openapi_characteristic_description() ::
  [ {'description', binary() }
  | {'language', openapi_language_summary:openapi_language_summary() }
  ].


openapi_characteristic_description() ->
    openapi_characteristic_description([]).

openapi_characteristic_description(Fields) ->
  Default = [ {'description', binary() }
            , {'language', openapi_language_summary:openapi_language_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

