#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/item_attribute_detail.h"
#include "../model/item_category_detail.h"
#include "../model/item_detail.h"
#include "../model/item_fling_effect_detail.h"
#include "../model/item_pocket_detail.h"
#include "../model/paginated_item_attribute_summary_list.h"
#include "../model/paginated_item_category_summary_list.h"
#include "../model/paginated_item_fling_effect_summary_list.h"
#include "../model/paginated_item_pocket_summary_list.h"
#include "../model/paginated_item_summary_list.h"


// List item attributes
//
// Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\".
//
paginated_item_attribute_summary_list_t*
ItemsAPI_itemAttributeList(apiClient_t *apiClient, int *limit, int *offset, char *q);


// Get item attribute
//
// Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\".
//
item_attribute_detail_t*
ItemsAPI_itemAttributeRetrieve(apiClient_t *apiClient, char *id);


// List item categories
//
// Item categories determine where items will be placed in the players bag.
//
paginated_item_category_summary_list_t*
ItemsAPI_itemCategoryList(apiClient_t *apiClient, int *limit, int *offset, char *q);


// Get item category
//
// Item categories determine where items will be placed in the players bag.
//
item_category_detail_t*
ItemsAPI_itemCategoryRetrieve(apiClient_t *apiClient, char *id);


// List item fling effects
//
// The various effects of the move\"Fling\" when used with different items.
//
paginated_item_fling_effect_summary_list_t*
ItemsAPI_itemFlingEffectList(apiClient_t *apiClient, int *limit, int *offset, char *q);


// Get item fling effect
//
// The various effects of the move\"Fling\" when used with different items.
//
item_fling_effect_detail_t*
ItemsAPI_itemFlingEffectRetrieve(apiClient_t *apiClient, char *id);


// List items
//
// An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.
//
paginated_item_summary_list_t*
ItemsAPI_itemList(apiClient_t *apiClient, int *limit, int *offset, char *q);


// List item pockets
//
// Pockets within the players bag used for storing items by category.
//
paginated_item_pocket_summary_list_t*
ItemsAPI_itemPocketList(apiClient_t *apiClient, int *limit, int *offset, char *q);


// Get item pocket
//
// Pockets within the players bag used for storing items by category.
//
item_pocket_detail_t*
ItemsAPI_itemPocketRetrieve(apiClient_t *apiClient, char *id);


// Get item
//
// An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.
//
item_detail_t*
ItemsAPI_itemRetrieve(apiClient_t *apiClient, char *id);


