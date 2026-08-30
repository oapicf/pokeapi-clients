<a name="__pageTop"></a>
# ItemsApi   { #ItemsApi }


All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**item_attribute_list**](#item_attribute_list) | **GET** `/api/v2/item-attribute/` | List item attributes
[**item_attribute_retrieve**](#item_attribute_retrieve) | **GET** `/api/v2/item-attribute/{id}/` | Get item attribute
[**item_category_list**](#item_category_list) | **GET** `/api/v2/item-category/` | List item categories
[**item_category_retrieve**](#item_category_retrieve) | **GET** `/api/v2/item-category/{id}/` | Get item category
[**item_fling_effect_list**](#item_fling_effect_list) | **GET** `/api/v2/item-fling-effect/` | List item fling effects
[**item_fling_effect_retrieve**](#item_fling_effect_retrieve) | **GET** `/api/v2/item-fling-effect/{id}/` | Get item fling effect
[**item_list**](#item_list) | **GET** `/api/v2/item/` | List items
[**item_pocket_list**](#item_pocket_list) | **GET** `/api/v2/item-pocket/` | List item pockets
[**item_pocket_retrieve**](#item_pocket_retrieve) | **GET** `/api/v2/item-pocket/{id}/` | Get item pocket
[**item_retrieve**](#item_retrieve) | **GET** `/api/v2/item/{id}/` | Get item

# **item_attribute_list**   { #item_attribute_list }
<a name="item_attribute_list"></a>

> `item_attribute_list(limit = null,offset = null,q = null, on_success: Callable, on_failure: Callable)`

List item attributes

Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\".

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
var api = ItemsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ItemsApi.new(config, client)


# Invoke an endpoint
api.item_attribute_list(
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
		prints("Success!", "item_attribute_list", response)
		assert(response.data is PaginatedItemAttributeSummaryList)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **item_attribute_retrieve**   { #item_attribute_retrieve }
<a name="item_attribute_retrieve"></a>

> `item_attribute_retrieve(id: String, on_success: Callable, on_failure: Callable)`

Get item attribute

Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\".

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
var api = ItemsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ItemsApi.new(config, client)


# Invoke an endpoint
api.item_attribute_retrieve(
	# id: String   Eg: id_example
	# This parameter can be a string or an integer.
	id,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "item_attribute_retrieve", response)
		assert(response.data is ItemAttributeDetail)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **item_category_list**   { #item_category_list }
<a name="item_category_list"></a>

> `item_category_list(limit = null,offset = null,q = null, on_success: Callable, on_failure: Callable)`

List item categories

Item categories determine where items will be placed in the players bag.

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
var api = ItemsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ItemsApi.new(config, client)


# Invoke an endpoint
api.item_category_list(
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
		prints("Success!", "item_category_list", response)
		assert(response.data is PaginatedItemCategorySummaryList)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **item_category_retrieve**   { #item_category_retrieve }
<a name="item_category_retrieve"></a>

> `item_category_retrieve(id: String, on_success: Callable, on_failure: Callable)`

Get item category

Item categories determine where items will be placed in the players bag.

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
var api = ItemsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ItemsApi.new(config, client)


# Invoke an endpoint
api.item_category_retrieve(
	# id: String   Eg: id_example
	# This parameter can be a string or an integer.
	id,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "item_category_retrieve", response)
		assert(response.data is ItemCategoryDetail)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **item_fling_effect_list**   { #item_fling_effect_list }
<a name="item_fling_effect_list"></a>

> `item_fling_effect_list(limit = null,offset = null,q = null, on_success: Callable, on_failure: Callable)`

List item fling effects

The various effects of the move\"Fling\" when used with different items.

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
var api = ItemsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ItemsApi.new(config, client)


# Invoke an endpoint
api.item_fling_effect_list(
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
		prints("Success!", "item_fling_effect_list", response)
		assert(response.data is PaginatedItemFlingEffectSummaryList)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **item_fling_effect_retrieve**   { #item_fling_effect_retrieve }
<a name="item_fling_effect_retrieve"></a>

> `item_fling_effect_retrieve(id: String, on_success: Callable, on_failure: Callable)`

Get item fling effect

The various effects of the move\"Fling\" when used with different items.

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
var api = ItemsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ItemsApi.new(config, client)


# Invoke an endpoint
api.item_fling_effect_retrieve(
	# id: String   Eg: id_example
	# This parameter can be a string or an integer.
	id,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "item_fling_effect_retrieve", response)
		assert(response.data is ItemFlingEffectDetail)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **item_list**   { #item_list }
<a name="item_list"></a>

> `item_list(limit = null,offset = null,q = null, on_success: Callable, on_failure: Callable)`

List items

An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.

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
var api = ItemsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ItemsApi.new(config, client)


# Invoke an endpoint
api.item_list(
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
		prints("Success!", "item_list", response)
		assert(response.data is PaginatedItemSummaryList)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **item_pocket_list**   { #item_pocket_list }
<a name="item_pocket_list"></a>

> `item_pocket_list(limit = null,offset = null,q = null, on_success: Callable, on_failure: Callable)`

List item pockets

Pockets within the players bag used for storing items by category.

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
var api = ItemsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ItemsApi.new(config, client)


# Invoke an endpoint
api.item_pocket_list(
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
		prints("Success!", "item_pocket_list", response)
		assert(response.data is PaginatedItemPocketSummaryList)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **item_pocket_retrieve**   { #item_pocket_retrieve }
<a name="item_pocket_retrieve"></a>

> `item_pocket_retrieve(id: String, on_success: Callable, on_failure: Callable)`

Get item pocket

Pockets within the players bag used for storing items by category.

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
var api = ItemsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ItemsApi.new(config, client)


# Invoke an endpoint
api.item_pocket_retrieve(
	# id: String   Eg: id_example
	# This parameter can be a string or an integer.
	id,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "item_pocket_retrieve", response)
		assert(response.data is ItemPocketDetail)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **item_retrieve**   { #item_retrieve }
<a name="item_retrieve"></a>

> `item_retrieve(id: String, on_success: Callable, on_failure: Callable)`

Get item

An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.

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
var api = ItemsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ItemsApi.new(config, client)


# Invoke an endpoint
api.item_retrieve(
	# id: String   Eg: id_example
	# This parameter can be a string or an integer.
	id,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "item_retrieve", response)
		assert(response.data is ItemDetail)
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

