-module(openapi_pokemon_shape_detail_awesome_names_inner).

-export([encode/1]).

-export_type([openapi_pokemon_shape_detail_awesome_names_inner/0]).

-type openapi_pokemon_shape_detail_awesome_names_inner() ::
    #{ 'awesome_name' := binary(),
       'language' := openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()
     }.

encode(#{ 'awesome_name' := AwesomeName,
          'language' := Language
        }) ->
    #{ 'awesome_name' => AwesomeName,
       'language' => Language
     }.
