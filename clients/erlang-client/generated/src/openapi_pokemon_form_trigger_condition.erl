-module(openapi_pokemon_form_trigger_condition).

-export([encode/1]).

-export_type([openapi_pokemon_form_trigger_condition/0]).

-type openapi_pokemon_form_trigger_condition() ::
    #{ 'trigger' := binary(),
       'name' => binary(),
       'url' => openapi_u_ri:openapi_u_ri(),
       'base_form' => openapi_pokemon_form_summary:openapi_pokemon_form_summary()
     }.

encode(#{ 'trigger' := Trigger,
          'name' := Name,
          'url' := Url,
          'base_form' := BaseForm
        }) ->
    #{ 'trigger' => Trigger,
       'name' => Name,
       'url' => Url,
       'base_form' => BaseForm
     }.
