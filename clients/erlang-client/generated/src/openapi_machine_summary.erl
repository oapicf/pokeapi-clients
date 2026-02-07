-module(openapi_machine_summary).

-export([encode/1]).

-export_type([openapi_machine_summary/0]).

-type openapi_machine_summary() ::
    #{ 'url' := openapi_u_ri:openapi_u_ri()
     }.

encode(#{ 'url' := Url
        }) ->
    #{ 'url' => Url
     }.
