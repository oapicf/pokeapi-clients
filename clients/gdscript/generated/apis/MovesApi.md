<a name="__pageTop"></a>
# MovesApi   { #MovesApi }


All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**move_ailment_list**](#move_ailment_list) | **GET** `/api/v2/move-ailment/` | List move meta ailments
[**move_ailment_retrieve**](#move_ailment_retrieve) | **GET** `/api/v2/move-ailment/{id}/` | Get move meta ailment
[**move_battle_style_list**](#move_battle_style_list) | **GET** `/api/v2/move-battle-style/` | List move battle styles
[**move_battle_style_retrieve**](#move_battle_style_retrieve) | **GET** `/api/v2/move-battle-style/{id}/` | Get move battle style
[**move_category_list**](#move_category_list) | **GET** `/api/v2/move-category/` | List move meta categories
[**move_category_retrieve**](#move_category_retrieve) | **GET** `/api/v2/move-category/{id}/` | Get move meta category
[**move_learn_method_list**](#move_learn_method_list) | **GET** `/api/v2/move-learn-method/` | List move learn methods
[**move_learn_method_retrieve**](#move_learn_method_retrieve) | **GET** `/api/v2/move-learn-method/{id}/` | Get move learn method
[**move_list**](#move_list) | **GET** `/api/v2/move/` | List moves
[**move_retrieve**](#move_retrieve) | **GET** `/api/v2/move/{id}/` | Get move
[**move_target_list**](#move_target_list) | **GET** `/api/v2/move-target/` | List move targets
[**move_target_retrieve**](#move_target_retrieve) | **GET** `/api/v2/move-target/{id}/` | Get move target

# **move_ailment_list**   { #move_ailment_list }
<a name="move_ailment_list"></a>

> `move_ailment_list(limit = null,offset = null,q = null, on_success: Callable, on_failure: Callable)`

List move meta ailments

Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.

### Example

* Basic Authentication (`basicAuth`)
* Api Key Authentication (`cookieAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = MovesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = MovesApi.new(config, client)


# Invoke an endpoint
api.move_ailment_list(
	# limit: int   Eg: 56
	# Number of results to return per page.
	limit,
	# offset: int   Eg: 56
	# The initial index from which to return the results.
	offset,
	# q: String   Eg: q_example
	# > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
	q,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "move_ailment_list", response)
		assert(response.data is PaginatedMoveMetaAilmentSummaryList)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **move_ailment_retrieve**   { #move_ailment_retrieve }
<a name="move_ailment_retrieve"></a>

> `move_ailment_retrieve(id: String, on_success: Callable, on_failure: Callable)`

Get move meta ailment

Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.

### Example

* Basic Authentication (`basicAuth`)
* Api Key Authentication (`cookieAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = MovesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = MovesApi.new(config, client)


# Invoke an endpoint
api.move_ailment_retrieve(
	# id: String   Eg: id_example
	# This parameter can be a string or an integer.
	id,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "move_ailment_retrieve", response)
		assert(response.data is MoveMetaAilmentDetail)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **move_battle_style_list**   { #move_battle_style_list }
<a name="move_battle_style_list"></a>

> `move_battle_style_list(limit = null,offset = null,q = null, on_success: Callable, on_failure: Callable)`

List move battle styles

Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.

### Example

* Basic Authentication (`basicAuth`)
* Api Key Authentication (`cookieAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = MovesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = MovesApi.new(config, client)


# Invoke an endpoint
api.move_battle_style_list(
	# limit: int   Eg: 56
	# Number of results to return per page.
	limit,
	# offset: int   Eg: 56
	# The initial index from which to return the results.
	offset,
	# q: String   Eg: q_example
	# > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
	q,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "move_battle_style_list", response)
		assert(response.data is PaginatedMoveBattleStyleSummaryList)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **move_battle_style_retrieve**   { #move_battle_style_retrieve }
<a name="move_battle_style_retrieve"></a>

> `move_battle_style_retrieve(id: String, on_success: Callable, on_failure: Callable)`

Get move battle style

Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.

### Example

* Basic Authentication (`basicAuth`)
* Api Key Authentication (`cookieAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = MovesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = MovesApi.new(config, client)


# Invoke an endpoint
api.move_battle_style_retrieve(
	# id: String   Eg: id_example
	# This parameter can be a string or an integer.
	id,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "move_battle_style_retrieve", response)
		assert(response.data is MoveBattleStyleDetail)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **move_category_list**   { #move_category_list }
<a name="move_category_list"></a>

> `move_category_list(limit = null,offset = null,q = null, on_success: Callable, on_failure: Callable)`

List move meta categories

Very general categories that loosely group move effects.

### Example

* Basic Authentication (`basicAuth`)
* Api Key Authentication (`cookieAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = MovesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = MovesApi.new(config, client)


# Invoke an endpoint
api.move_category_list(
	# limit: int   Eg: 56
	# Number of results to return per page.
	limit,
	# offset: int   Eg: 56
	# The initial index from which to return the results.
	offset,
	# q: String   Eg: q_example
	# > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
	q,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "move_category_list", response)
		assert(response.data is PaginatedMoveMetaCategorySummaryList)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **move_category_retrieve**   { #move_category_retrieve }
<a name="move_category_retrieve"></a>

> `move_category_retrieve(id: String, on_success: Callable, on_failure: Callable)`

Get move meta category

Very general categories that loosely group move effects.

### Example

* Basic Authentication (`basicAuth`)
* Api Key Authentication (`cookieAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = MovesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = MovesApi.new(config, client)


# Invoke an endpoint
api.move_category_retrieve(
	# id: String   Eg: id_example
	# This parameter can be a string or an integer.
	id,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "move_category_retrieve", response)
		assert(response.data is MoveMetaCategoryDetail)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **move_learn_method_list**   { #move_learn_method_list }
<a name="move_learn_method_list"></a>

> `move_learn_method_list(limit = null,offset = null,q = null, on_success: Callable, on_failure: Callable)`

List move learn methods

Methods by which Pokémon can learn moves.

### Example

* Basic Authentication (`basicAuth`)
* Api Key Authentication (`cookieAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = MovesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = MovesApi.new(config, client)


# Invoke an endpoint
api.move_learn_method_list(
	# limit: int   Eg: 56
	# Number of results to return per page.
	limit,
	# offset: int   Eg: 56
	# The initial index from which to return the results.
	offset,
	# q: String   Eg: q_example
	# > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
	q,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "move_learn_method_list", response)
		assert(response.data is PaginatedMoveLearnMethodSummaryList)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **move_learn_method_retrieve**   { #move_learn_method_retrieve }
<a name="move_learn_method_retrieve"></a>

> `move_learn_method_retrieve(id: String, on_success: Callable, on_failure: Callable)`

Get move learn method

Methods by which Pokémon can learn moves.

### Example

* Basic Authentication (`basicAuth`)
* Api Key Authentication (`cookieAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = MovesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = MovesApi.new(config, client)


# Invoke an endpoint
api.move_learn_method_retrieve(
	# id: String   Eg: id_example
	# This parameter can be a string or an integer.
	id,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "move_learn_method_retrieve", response)
		assert(response.data is MoveLearnMethodDetail)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **move_list**   { #move_list }
<a name="move_list"></a>

> `move_list(limit = null,offset = null,q = null, on_success: Callable, on_failure: Callable)`

List moves

Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.

### Example

* Basic Authentication (`basicAuth`)
* Api Key Authentication (`cookieAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = MovesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = MovesApi.new(config, client)


# Invoke an endpoint
api.move_list(
	# limit: int   Eg: 56
	# Number of results to return per page.
	limit,
	# offset: int   Eg: 56
	# The initial index from which to return the results.
	offset,
	# q: String   Eg: q_example
	# > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
	q,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "move_list", response)
		assert(response.data is PaginatedMoveSummaryList)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **move_retrieve**   { #move_retrieve }
<a name="move_retrieve"></a>

> `move_retrieve(id: String, on_success: Callable, on_failure: Callable)`

Get move

Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.

### Example

* Basic Authentication (`basicAuth`)
* Api Key Authentication (`cookieAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = MovesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = MovesApi.new(config, client)


# Invoke an endpoint
api.move_retrieve(
	# id: String   Eg: id_example
	# This parameter can be a string or an integer.
	id,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "move_retrieve", response)
		assert(response.data is MoveDetail)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **move_target_list**   { #move_target_list }
<a name="move_target_list"></a>

> `move_target_list(limit = null,offset = null,q = null, on_success: Callable, on_failure: Callable)`

List move targets

Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.

### Example

* Basic Authentication (`basicAuth`)
* Api Key Authentication (`cookieAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = MovesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = MovesApi.new(config, client)


# Invoke an endpoint
api.move_target_list(
	# limit: int   Eg: 56
	# Number of results to return per page.
	limit,
	# offset: int   Eg: 56
	# The initial index from which to return the results.
	offset,
	# q: String   Eg: q_example
	# > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
	q,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "move_target_list", response)
		assert(response.data is PaginatedMoveTargetSummaryList)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **move_target_retrieve**   { #move_target_retrieve }
<a name="move_target_retrieve"></a>

> `move_target_retrieve(id: String, on_success: Callable, on_failure: Callable)`

Get move target

Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.

### Example

* Basic Authentication (`basicAuth`)
* Api Key Authentication (`cookieAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = MovesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = MovesApi.new(config, client)


# Invoke an endpoint
api.move_target_retrieve(
	# id: String   Eg: id_example
	# This parameter can be a string or an integer.
	id,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "move_target_retrieve", response)
		assert(response.data is MoveTargetDetail)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```


### Authorization

[basicAuth](../README.md#basicAuth), 
[cookieAuth](../README.md#cookieAuth)

[[Back to top]](#__pageTop) \
[[Back to API list]](../README.md#documentation-for-api-endpoints) \
[[Back to Model list]](../README.md#documentation-for-models) \
[[Back to README]](../README.md) \

