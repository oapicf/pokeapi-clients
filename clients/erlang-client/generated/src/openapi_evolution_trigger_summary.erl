-module(openapi_evolution_trigger_summary).

-export([encode/1]).

-export_type([openapi_evolution_trigger_summary/0]).

-type openapi_evolution_trigger_summary() ::
    #{ 'name' := binary(),
       'url' := openapi_u_ri:openapi_u_ri()
     }.

encode(#{ 'name' := Name,
          'url' := Url
        }) ->
    #{ 'name' => Name,
       'url' => Url
     }.
