-module(openapi_growth_rate_detail).

-include("openapi.hrl").

-export([openapi_growth_rate_detail/0]).

-export([openapi_growth_rate_detail/1]).

-export_type([openapi_growth_rate_detail/0]).

-type openapi_growth_rate_detail() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'formula', binary() }
  | {'descriptions', list(openapi_growth_rate_description:openapi_growth_rate_description()) }
  | {'levels', list(openapi_experience:openapi_experience()) }
  | {'pokemon_species', list(openapi_pokemon_species_summary:openapi_pokemon_species_summary()) }
  ].


openapi_growth_rate_detail() ->
    openapi_growth_rate_detail([]).

openapi_growth_rate_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'formula', binary() }
            , {'descriptions', list(openapi_growth_rate_description:openapi_growth_rate_description()) }
            , {'levels', list(openapi_experience:openapi_experience()) }
            , {'pokemon_species', list(openapi_pokemon_species_summary:openapi_pokemon_species_summary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

