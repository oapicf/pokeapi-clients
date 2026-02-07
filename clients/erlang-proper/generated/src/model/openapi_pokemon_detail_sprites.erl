-module(openapi_pokemon_detail_sprites).

-include("openapi.hrl").

-export([openapi_pokemon_detail_sprites/0]).

-export([openapi_pokemon_detail_sprites/1]).

-export_type([openapi_pokemon_detail_sprites/0]).

-type openapi_pokemon_detail_sprites() ::
  [ {'front_default', openapi_u_ri:openapi_u_ri() }
  ].


openapi_pokemon_detail_sprites() ->
    openapi_pokemon_detail_sprites([]).

openapi_pokemon_detail_sprites(Fields) ->
  Default = [ {'front_default', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

