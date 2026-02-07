-module(openapi_item_name).

-include("openapi.hrl").

-export([openapi_item_name/0]).

-export([openapi_item_name/1]).

-export_type([openapi_item_name/0]).

-type openapi_item_name() ::
  [ {'name', binary() }
  | {'language', openapi_language_summary:openapi_language_summary() }
  ].


openapi_item_name() ->
    openapi_item_name([]).

openapi_item_name(Fields) ->
  Default = [ {'name', binary() }
            , {'language', openapi_language_summary:openapi_language_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

