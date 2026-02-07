# items_api

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ItemAttributeList**](items_api.md#ItemAttributeList) | **GET** /api/v2/item-attribute/ | List item attributes
[**ItemAttributeRetrieve**](items_api.md#ItemAttributeRetrieve) | **GET** /api/v2/item-attribute/{id}/ | Get item attribute
[**ItemCategoryList**](items_api.md#ItemCategoryList) | **GET** /api/v2/item-category/ | List item categories
[**ItemCategoryRetrieve**](items_api.md#ItemCategoryRetrieve) | **GET** /api/v2/item-category/{id}/ | Get item category
[**ItemFlingEffectList**](items_api.md#ItemFlingEffectList) | **GET** /api/v2/item-fling-effect/ | List item fling effects
[**ItemFlingEffectRetrieve**](items_api.md#ItemFlingEffectRetrieve) | **GET** /api/v2/item-fling-effect/{id}/ | Get item fling effect
[**ItemList**](items_api.md#ItemList) | **GET** /api/v2/item/ | List items
[**ItemPocketList**](items_api.md#ItemPocketList) | **GET** /api/v2/item-pocket/ | List item pockets
[**ItemPocketRetrieve**](items_api.md#ItemPocketRetrieve) | **GET** /api/v2/item-pocket/{id}/ | Get item pocket
[**ItemRetrieve**](items_api.md#ItemRetrieve) | **GET** /api/v2/item/{id}/ | Get item


<a name="ItemAttributeList"></a>
# **ItemAttributeList**
> PaginatedItemAttributeSummaryList ItemAttributeList(limit, offset, q)

List item attributes

Item attributes define particular aspects of items, e.g.\&quot;usable in battle\&quot; or \&quot;consumable\&quot;.
<a name="ItemAttributeRetrieve"></a>
# **ItemAttributeRetrieve**
> ItemAttributeDetail ItemAttributeRetrieve(Id_)

Get item attribute

Item attributes define particular aspects of items, e.g.\&quot;usable in battle\&quot; or \&quot;consumable\&quot;.
<a name="ItemCategoryList"></a>
# **ItemCategoryList**
> PaginatedItemCategorySummaryList ItemCategoryList(limit, offset, q)

List item categories

Item categories determine where items will be placed in the players bag.
<a name="ItemCategoryRetrieve"></a>
# **ItemCategoryRetrieve**
> ItemCategoryDetail ItemCategoryRetrieve(Id_)

Get item category

Item categories determine where items will be placed in the players bag.
<a name="ItemFlingEffectList"></a>
# **ItemFlingEffectList**
> PaginatedItemFlingEffectSummaryList ItemFlingEffectList(limit, offset, q)

List item fling effects

The various effects of the move\&quot;Fling\&quot; when used with different items.
<a name="ItemFlingEffectRetrieve"></a>
# **ItemFlingEffectRetrieve**
> ItemFlingEffectDetail ItemFlingEffectRetrieve(Id_)

Get item fling effect

The various effects of the move\&quot;Fling\&quot; when used with different items.
<a name="ItemList"></a>
# **ItemList**
> PaginatedItemSummaryList ItemList(limit, offset, q)

List items

An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.
<a name="ItemPocketList"></a>
# **ItemPocketList**
> PaginatedItemPocketSummaryList ItemPocketList(limit, offset, q)

List item pockets

Pockets within the players bag used for storing items by category.
<a name="ItemPocketRetrieve"></a>
# **ItemPocketRetrieve**
> ItemPocketDetail ItemPocketRetrieve(Id_)

Get item pocket

Pockets within the players bag used for storing items by category.
<a name="ItemRetrieve"></a>
# **ItemRetrieve**
> ItemDetail ItemRetrieve(Id_)

Get item

An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.
