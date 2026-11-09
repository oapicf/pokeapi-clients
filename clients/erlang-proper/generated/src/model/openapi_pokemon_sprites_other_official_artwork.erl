-module(openapi_pokemon_sprites_other_official_artwork).

-include("openapi.hrl").

-export([openapi_pokemon_sprites_other_official_artwork/0]).

-export([openapi_pokemon_sprites_other_official_artwork/1]).

-export_type([openapi_pokemon_sprites_other_official_artwork/0]).

-type openapi_pokemon_sprites_other_official_artwork() ::
  [ {'front_default', binary() }
  | {'front_shiny', binary() }
  | {'versions', map() }
  ].


openapi_pokemon_sprites_other_official_artwork() ->
    openapi_pokemon_sprites_other_official_artwork([]).

openapi_pokemon_sprites_other_official_artwork(Fields) ->
  Default = [ {'front_default', binary() }
            , {'front_shiny', binary() }
            , {'versions', map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

