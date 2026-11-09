-module(openapi_pokemon_sprites_other).

-include("openapi.hrl").

-export([openapi_pokemon_sprites_other/0]).

-export([openapi_pokemon_sprites_other/1]).

-export_type([openapi_pokemon_sprites_other/0]).

-type openapi_pokemon_sprites_other() ::
  [ {'dream_world', openapi_pokemon_sprites_other_dream_world:openapi_pokemon_sprites_other_dream_world() }
  | {'home', openapi_pokemon_sprites_other_home:openapi_pokemon_sprites_other_home() }
  | {'showdown', openapi_pokemon_sprites_other_showdown:openapi_pokemon_sprites_other_showdown() }
  | {'official_artwork', openapi_pokemon_sprites_other_official_artwork:openapi_pokemon_sprites_other_official_artwork() }
  ].


openapi_pokemon_sprites_other() ->
    openapi_pokemon_sprites_other([]).

openapi_pokemon_sprites_other(Fields) ->
  Default = [ {'dream_world', openapi_pokemon_sprites_other_dream_world:openapi_pokemon_sprites_other_dream_world() }
            , {'home', openapi_pokemon_sprites_other_home:openapi_pokemon_sprites_other_home() }
            , {'showdown', openapi_pokemon_sprites_other_showdown:openapi_pokemon_sprites_other_showdown() }
            , {'official-artwork', openapi_pokemon_sprites_other_official_artwork:openapi_pokemon_sprites_other_official_artwork() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

