-module(openapi_egg_group_detail_pokemon_species_inner).

-include("openapi.hrl").

-export([openapi_egg_group_detail_pokemon_species_inner/0]).

-export([openapi_egg_group_detail_pokemon_species_inner/1]).

-export_type([openapi_egg_group_detail_pokemon_species_inner/0]).

-type openapi_egg_group_detail_pokemon_species_inner() ::
  [ {'name', binary() }
  | {'url', openapi_u_ri:openapi_u_ri() }
  ].


openapi_egg_group_detail_pokemon_species_inner() ->
    openapi_egg_group_detail_pokemon_species_inner([]).

openapi_egg_group_detail_pokemon_species_inner(Fields) ->
  Default = [ {'name', binary() }
            , {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

