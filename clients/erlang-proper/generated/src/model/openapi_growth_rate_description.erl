-module(openapi_growth_rate_description).

-include("openapi.hrl").

-export([openapi_growth_rate_description/0]).

-export([openapi_growth_rate_description/1]).

-export_type([openapi_growth_rate_description/0]).

-type openapi_growth_rate_description() ::
  [ {'description', binary() }
  | {'language', openapi_language_summary:openapi_language_summary() }
  ].


openapi_growth_rate_description() ->
    openapi_growth_rate_description([]).

openapi_growth_rate_description(Fields) ->
  Default = [ {'description', binary() }
            , {'language', openapi_language_summary:openapi_language_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

