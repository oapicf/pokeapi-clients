#ifndef _ItemsManager_H_
#define _ItemsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
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
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Items Items
 * \ingroup Operations
 *  @{
 */
class ItemsManager {
public:
	ItemsManager();
	virtual ~ItemsManager();

/*! \brief List item attributes. *Synchronous*
 *
 * Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\".
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool itemAttributeListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedItemAttributeSummaryList, Error, void* )
	, void* userData);

/*! \brief List item attributes. *Asynchronous*
 *
 * Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\".
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool itemAttributeListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedItemAttributeSummaryList, Error, void* )
	, void* userData);


/*! \brief Get item attribute. *Synchronous*
 *
 * Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\".
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool itemAttributeRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(ItemAttributeDetail, Error, void* )
	, void* userData);

/*! \brief Get item attribute. *Asynchronous*
 *
 * Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\".
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool itemAttributeRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(ItemAttributeDetail, Error, void* )
	, void* userData);


/*! \brief List item categories. *Synchronous*
 *
 * Item categories determine where items will be placed in the players bag.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool itemCategoryListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedItemCategorySummaryList, Error, void* )
	, void* userData);

/*! \brief List item categories. *Asynchronous*
 *
 * Item categories determine where items will be placed in the players bag.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool itemCategoryListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedItemCategorySummaryList, Error, void* )
	, void* userData);


/*! \brief Get item category. *Synchronous*
 *
 * Item categories determine where items will be placed in the players bag.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool itemCategoryRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(ItemCategoryDetail, Error, void* )
	, void* userData);

/*! \brief Get item category. *Asynchronous*
 *
 * Item categories determine where items will be placed in the players bag.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool itemCategoryRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(ItemCategoryDetail, Error, void* )
	, void* userData);


/*! \brief List item fling effects. *Synchronous*
 *
 * The various effects of the move\"Fling\" when used with different items.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool itemFlingEffectListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedItemFlingEffectSummaryList, Error, void* )
	, void* userData);

/*! \brief List item fling effects. *Asynchronous*
 *
 * The various effects of the move\"Fling\" when used with different items.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool itemFlingEffectListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedItemFlingEffectSummaryList, Error, void* )
	, void* userData);


/*! \brief Get item fling effect. *Synchronous*
 *
 * The various effects of the move\"Fling\" when used with different items.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool itemFlingEffectRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(ItemFlingEffectDetail, Error, void* )
	, void* userData);

/*! \brief Get item fling effect. *Asynchronous*
 *
 * The various effects of the move\"Fling\" when used with different items.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool itemFlingEffectRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(ItemFlingEffectDetail, Error, void* )
	, void* userData);


/*! \brief List items. *Synchronous*
 *
 * An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool itemListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedItemSummaryList, Error, void* )
	, void* userData);

/*! \brief List items. *Asynchronous*
 *
 * An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool itemListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedItemSummaryList, Error, void* )
	, void* userData);


/*! \brief List item pockets. *Synchronous*
 *
 * Pockets within the players bag used for storing items by category.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool itemPocketListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedItemPocketSummaryList, Error, void* )
	, void* userData);

/*! \brief List item pockets. *Asynchronous*
 *
 * Pockets within the players bag used for storing items by category.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool itemPocketListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedItemPocketSummaryList, Error, void* )
	, void* userData);


/*! \brief Get item pocket. *Synchronous*
 *
 * Pockets within the players bag used for storing items by category.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool itemPocketRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(ItemPocketDetail, Error, void* )
	, void* userData);

/*! \brief Get item pocket. *Asynchronous*
 *
 * Pockets within the players bag used for storing items by category.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool itemPocketRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(ItemPocketDetail, Error, void* )
	, void* userData);


/*! \brief Get item. *Synchronous*
 *
 * An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool itemRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(ItemDetail, Error, void* )
	, void* userData);

/*! \brief Get item. *Asynchronous*
 *
 * An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool itemRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(ItemDetail, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://pokeapi.co";
	}
};
/** @}*/

}
}
#endif /* ItemsManager_H_ */
