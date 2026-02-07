-module(openapi_pokemon_form_detail_form_names_inner).

-export([encode/1]).

-export_type([openapi_pokemon_form_detail_form_names_inner/0]).

-type openapi_pokemon_form_detail_form_names_inner() ::
    #{ 'language' := openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon(),
       'name' := binary()
     }.

encode(#{ 'language' := Language,
          'name' := Name
        }) ->
    #{ 'language' => Language,
       'name' => Name
     }.
