-module(openapi_item_pocket_name).

-include("openapi.hrl").

-export([openapi_item_pocket_name/0]).

-export([openapi_item_pocket_name/1]).

-export_type([openapi_item_pocket_name/0]).

-type openapi_item_pocket_name() ::
  [ {'name', binary() }
  | {'language', openapi_language_summary:openapi_language_summary() }
  ].


openapi_item_pocket_name() ->
    openapi_item_pocket_name([]).

openapi_item_pocket_name(Fields) ->
  Default = [ {'name', binary() }
            , {'language', openapi_language_summary:openapi_language_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

