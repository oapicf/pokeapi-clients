-module(openapi_pokemon_shape_detail).

-include("openapi.hrl").

-export([openapi_pokemon_shape_detail/0]).

-export([openapi_pokemon_shape_detail/1]).

-export_type([openapi_pokemon_shape_detail/0]).

-type openapi_pokemon_shape_detail() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'awesome_names', list(openapi_pokemon_shape_detail_awesome_names_inner:openapi_pokemon_shape_detail_awesome_names_inner()) }
  | {'names', list(openapi_pokemon_shape_detail_names_inner:openapi_pokemon_shape_detail_names_inner()) }
  | {'pokemon_species', list(openapi_pokemon_species_summary:openapi_pokemon_species_summary()) }
  ].


openapi_pokemon_shape_detail() ->
    openapi_pokemon_shape_detail([]).

openapi_pokemon_shape_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'awesome_names', list(openapi_pokemon_shape_detail_awesome_names_inner:openapi_pokemon_shape_detail_awesome_names_inner()) }
            , {'names', list(openapi_pokemon_shape_detail_names_inner:openapi_pokemon_shape_detail_names_inner()) }
            , {'pokemon_species', list(openapi_pokemon_species_summary:openapi_pokemon_species_summary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

