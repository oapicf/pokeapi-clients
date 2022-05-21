-module(openapi_api).

-export([ version_group_list/0
        , version_group_read/1
        ]).

-define(BASE_URL, "").

%% @doc 
%% 
-spec version_group_list() ->
  openapi_utils:response().
version_group_list() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/api/v2/version-group/"],
  QueryString = [<<"limit=">>, Limit, <<"&">>, <<"offset=">>, Offset, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString]).

%% @doc 
%% 
-spec version_group_read(integer()) ->
  openapi_utils:response().
version_group_read(Id) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/api/v2/version-group/", Id, "/"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

