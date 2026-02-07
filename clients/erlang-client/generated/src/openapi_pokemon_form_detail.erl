-module(openapi_pokemon_form_detail).

-export([encode/1]).

-export_type([openapi_pokemon_form_detail/0]).

-type openapi_pokemon_form_detail() ::
    #{ 'id' := integer(),
       'name' := binary(),
       'order' => integer(),
       'form_order' => integer(),
       'is_default' => boolean(),
       'is_battle_only' => boolean(),
       'is_mega' => boolean(),
       'form_name' := binary(),
       'pokemon' := openapi_pokemon_summary:openapi_pokemon_summary(),
       'sprites' := openapi_pokemon_form_detail_sprites:openapi_pokemon_form_detail_sprites(),
       'version_group' := openapi_version_group_summary:openapi_version_group_summary(),
       'form_names' := list(),
       'names' := list(),
       'types' := list()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'order' := Order,
          'form_order' := FormOrder,
          'is_default' := IsDefault,
          'is_battle_only' := IsBattleOnly,
          'is_mega' := IsMega,
          'form_name' := FormName,
          'pokemon' := Pokemon,
          'sprites' := Sprites,
          'version_group' := VersionGroup,
          'form_names' := FormNames,
          'names' := Names,
          'types' := Types
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'order' => Order,
       'form_order' => FormOrder,
       'is_default' => IsDefault,
       'is_battle_only' => IsBattleOnly,
       'is_mega' => IsMega,
       'form_name' => FormName,
       'pokemon' => Pokemon,
       'sprites' => Sprites,
       'version_group' => VersionGroup,
       'form_names' => FormNames,
       'names' => Names,
       'types' => Types
     }.
