-module(openapi_items_api).

-export([item_attribute_list/1, item_attribute_list/2,
         item_attribute_retrieve/2, item_attribute_retrieve/3,
         item_category_list/1, item_category_list/2,
         item_category_retrieve/2, item_category_retrieve/3,
         item_fling_effect_list/1, item_fling_effect_list/2,
         item_fling_effect_retrieve/2, item_fling_effect_retrieve/3,
         item_list/1, item_list/2,
         item_pocket_list/1, item_pocket_list/2,
         item_pocket_retrieve/2, item_pocket_retrieve/3,
         item_retrieve/2, item_retrieve/3]).

-define(BASE_URL, <<"">>).

%% @doc List item attributes
%% Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\".
-spec item_attribute_list(ctx:ctx()) -> {ok, openapi_paginated_item_attribute_summary_list:openapi_paginated_item_attribute_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
item_attribute_list(Ctx) ->
    item_attribute_list(Ctx, #{}).

-spec item_attribute_list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated_item_attribute_summary_list:openapi_paginated_item_attribute_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
item_attribute_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/item-attribute/"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset', 'q'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get item attribute
%% Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\".
-spec item_attribute_retrieve(ctx:ctx(), binary()) -> {ok, openapi_item_attribute_detail:openapi_item_attribute_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
item_attribute_retrieve(Ctx, Id) ->
    item_attribute_retrieve(Ctx, Id, #{}).

-spec item_attribute_retrieve(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_item_attribute_detail:openapi_item_attribute_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
item_attribute_retrieve(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/item-attribute/", Id, "/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List item categories
%% Item categories determine where items will be placed in the players bag.
-spec item_category_list(ctx:ctx()) -> {ok, openapi_paginated_item_category_summary_list:openapi_paginated_item_category_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
item_category_list(Ctx) ->
    item_category_list(Ctx, #{}).

-spec item_category_list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated_item_category_summary_list:openapi_paginated_item_category_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
item_category_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/item-category/"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset', 'q'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get item category
%% Item categories determine where items will be placed in the players bag.
-spec item_category_retrieve(ctx:ctx(), binary()) -> {ok, openapi_item_category_detail:openapi_item_category_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
item_category_retrieve(Ctx, Id) ->
    item_category_retrieve(Ctx, Id, #{}).

-spec item_category_retrieve(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_item_category_detail:openapi_item_category_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
item_category_retrieve(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/item-category/", Id, "/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List item fling effects
%% The various effects of the move\"Fling\" when used with different items.
-spec item_fling_effect_list(ctx:ctx()) -> {ok, openapi_paginated_item_fling_effect_summary_list:openapi_paginated_item_fling_effect_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
item_fling_effect_list(Ctx) ->
    item_fling_effect_list(Ctx, #{}).

-spec item_fling_effect_list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated_item_fling_effect_summary_list:openapi_paginated_item_fling_effect_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
item_fling_effect_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/item-fling-effect/"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset', 'q'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get item fling effect
%% The various effects of the move\"Fling\" when used with different items.
-spec item_fling_effect_retrieve(ctx:ctx(), binary()) -> {ok, openapi_item_fling_effect_detail:openapi_item_fling_effect_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
item_fling_effect_retrieve(Ctx, Id) ->
    item_fling_effect_retrieve(Ctx, Id, #{}).

-spec item_fling_effect_retrieve(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_item_fling_effect_detail:openapi_item_fling_effect_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
item_fling_effect_retrieve(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/item-fling-effect/", Id, "/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List items
%% An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.
-spec item_list(ctx:ctx()) -> {ok, openapi_paginated_item_summary_list:openapi_paginated_item_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
item_list(Ctx) ->
    item_list(Ctx, #{}).

-spec item_list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated_item_summary_list:openapi_paginated_item_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
item_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/item/"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset', 'q'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List item pockets
%% Pockets within the players bag used for storing items by category.
-spec item_pocket_list(ctx:ctx()) -> {ok, openapi_paginated_item_pocket_summary_list:openapi_paginated_item_pocket_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
item_pocket_list(Ctx) ->
    item_pocket_list(Ctx, #{}).

-spec item_pocket_list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated_item_pocket_summary_list:openapi_paginated_item_pocket_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
item_pocket_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/item-pocket/"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset', 'q'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get item pocket
%% Pockets within the players bag used for storing items by category.
-spec item_pocket_retrieve(ctx:ctx(), binary()) -> {ok, openapi_item_pocket_detail:openapi_item_pocket_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
item_pocket_retrieve(Ctx, Id) ->
    item_pocket_retrieve(Ctx, Id, #{}).

-spec item_pocket_retrieve(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_item_pocket_detail:openapi_item_pocket_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
item_pocket_retrieve(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/item-pocket/", Id, "/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get item
%% An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.
-spec item_retrieve(ctx:ctx(), binary()) -> {ok, openapi_item_detail:openapi_item_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
item_retrieve(Ctx, Id) ->
    item_retrieve(Ctx, Id, #{}).

-spec item_retrieve(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_item_detail:openapi_item_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
item_retrieve(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/item/", Id, "/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


