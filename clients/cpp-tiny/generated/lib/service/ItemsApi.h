#ifndef TINY_CPP_CLIENT_ItemsApi_H_
#define TINY_CPP_CLIENT_ItemsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "ItemAttributeDetail.h"
#include "ItemCategoryDetail.h"
#include "ItemDetail.h"
#include "ItemFlingEffectDetail.h"
#include "ItemPocketDetail.h"
#include "PaginatedItemAttributeSummaryList.h"
#include "PaginatedItemCategorySummaryList.h"
#include "PaginatedItemFlingEffectSummaryList.h"
#include "PaginatedItemPocketSummaryList.h"
#include "PaginatedItemSummaryList.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class ItemsApi : public Service {
public:
    ItemsApi() = default;

    virtual ~ItemsApi() = default;

    /**
    * List item attributes.
    *
    * Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\".
    * \param limit Number of results to return per page.
    * \param offset The initial index from which to return the results.
    * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    */
    Response<
                PaginatedItemAttributeSummaryList
        >
    itemAttributeList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
    );
    /**
    * Get item attribute.
    *
    * Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\".
    * \param id This parameter can be a string or an integer. *Required*
    */
    Response<
                ItemAttributeDetail
        >
    itemAttributeRetrieve(
            
            std::string id
            
    );
    /**
    * List item categories.
    *
    * Item categories determine where items will be placed in the players bag.
    * \param limit Number of results to return per page.
    * \param offset The initial index from which to return the results.
    * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    */
    Response<
                PaginatedItemCategorySummaryList
        >
    itemCategoryList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
    );
    /**
    * Get item category.
    *
    * Item categories determine where items will be placed in the players bag.
    * \param id This parameter can be a string or an integer. *Required*
    */
    Response<
                ItemCategoryDetail
        >
    itemCategoryRetrieve(
            
            std::string id
            
    );
    /**
    * List item fling effects.
    *
    * The various effects of the move\"Fling\" when used with different items.
    * \param limit Number of results to return per page.
    * \param offset The initial index from which to return the results.
    * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    */
    Response<
                PaginatedItemFlingEffectSummaryList
        >
    itemFlingEffectList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
    );
    /**
    * Get item fling effect.
    *
    * The various effects of the move\"Fling\" when used with different items.
    * \param id This parameter can be a string or an integer. *Required*
    */
    Response<
                ItemFlingEffectDetail
        >
    itemFlingEffectRetrieve(
            
            std::string id
            
    );
    /**
    * List items.
    *
    * An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.
    * \param limit Number of results to return per page.
    * \param offset The initial index from which to return the results.
    * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    */
    Response<
                PaginatedItemSummaryList
        >
    itemList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
    );
    /**
    * List item pockets.
    *
    * Pockets within the players bag used for storing items by category.
    * \param limit Number of results to return per page.
    * \param offset The initial index from which to return the results.
    * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    */
    Response<
                PaginatedItemPocketSummaryList
        >
    itemPocketList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
    );
    /**
    * Get item pocket.
    *
    * Pockets within the players bag used for storing items by category.
    * \param id This parameter can be a string or an integer. *Required*
    */
    Response<
                ItemPocketDetail
        >
    itemPocketRetrieve(
            
            std::string id
            
    );
    /**
    * Get item.
    *
    * An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.
    * \param id This parameter can be a string or an integer. *Required*
    */
    Response<
                ItemDetail
        >
    itemRetrieve(
            
            std::string id
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_ItemsApi_H_ */