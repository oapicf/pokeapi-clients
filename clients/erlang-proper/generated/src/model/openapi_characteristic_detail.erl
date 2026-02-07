-module(openapi_characteristic_detail).

-include("openapi.hrl").

-export([openapi_characteristic_detail/0]).

-export([openapi_characteristic_detail/1]).

-export_type([openapi_characteristic_detail/0]).

-type openapi_characteristic_detail() ::
  [ {'id', integer() }
  | {'gene_modulo', integer() }
  | {'possible_values', list(integer()) }
  | {'highest_stat', openapi_stat_summary:openapi_stat_summary() }
  | {'descriptions', list(openapi_characteristic_description:openapi_characteristic_description()) }
  ].


openapi_characteristic_detail() ->
    openapi_characteristic_detail([]).

openapi_characteristic_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'gene_modulo', integer() }
            , {'possible_values', list(integer()) }
            , {'highest_stat', openapi_stat_summary:openapi_stat_summary() }
            , {'descriptions', list(openapi_characteristic_description:openapi_characteristic_description()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

