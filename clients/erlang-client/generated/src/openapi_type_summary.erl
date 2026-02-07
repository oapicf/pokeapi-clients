-module(openapi_type_summary).

-export([encode/1]).

-export_type([openapi_type_summary/0]).

-type openapi_type_summary() ::
    #{ 'name' := binary(),
       'url' := openapi_u_ri:openapi_u_ri()
     }.

encode(#{ 'name' := Name,
          'url' := Url
        }) ->
    #{ 'name' => Name,
       'url' => Url
     }.
