-module(openapi_generation_summary).

-export([encode/1]).

-export_type([openapi_generation_summary/0]).

-type openapi_generation_summary() ::
    #{ 'name' := binary(),
       'url' := openapi_u_ri:openapi_u_ri()
     }.

encode(#{ 'name' := Name,
          'url' := Url
        }) ->
    #{ 'name' => Name,
       'url' => Url
     }.
