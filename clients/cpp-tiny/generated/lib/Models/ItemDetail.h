
/*
 * ItemDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ItemDetail_H_
#define TINY_CPP_CLIENT_ItemDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "EvolutionChainSummary.h"
#include "ItemAttributeSummary.h"
#include "ItemCategorySummary.h"
#include "ItemEffectText.h"
#include "ItemFlavorText.h"
#include "ItemFlingEffectSummary.h"
#include "ItemGameIndex.h"
#include "ItemMachine.h"
#include "ItemName.h"
#include "ItemPrice.h"
#include "ItemSprites.h"
#include "PokemonHeldItem.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ItemDetail{
public:

    /*! \brief Constructor.
	 */
    ItemDetail();
    ItemDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ItemDetail();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The identifier for this resource.
	 */
	int getId();

	/*! \brief Set The identifier for this resource.
	 */
	void setId(int id);
	/*! \brief Get The name for this resource.
	 */
	std::string getName();

	/*! \brief Set The name for this resource.
	 */
	void setName(std::string name);
	/*! \brief Get The power of the move Fling when used with this item.
	 */
	int getFlingPower();

	/*! \brief Set The power of the move Fling when used with this item.
	 */
	void setFlingPower(int fling_power);
	/*! \brief Get The effect of the move Fling when used with this item.
	 */
	ItemFlingEffectSummary getFlingEffect();

	/*! \brief Set The effect of the move Fling when used with this item.
	 */
	void setFlingEffect(ItemFlingEffectSummary fling_effect);
	/*! \brief Get A list of attributes this item has.
	 */
	std::list<ItemAttributeSummary> getAttributes();

	/*! \brief Set A list of attributes this item has.
	 */
	void setAttributes(std::list<ItemAttributeSummary> attributes);
	/*! \brief Get The category of items this item falls into.
	 */
	ItemCategorySummary getCategory();

	/*! \brief Set The category of items this item falls into.
	 */
	void setCategory(ItemCategorySummary category);
	/*! \brief Get The effect of this ability listed in different languages.
	 */
	std::list<ItemEffectText> getEffectEntries();

	/*! \brief Set The effect of this ability listed in different languages.
	 */
	void setEffectEntries(std::list<ItemEffectText> effect_entries);
	/*! \brief Get The flavor text of this ability listed in different languages.
	 */
	std::list<ItemFlavorText> getFlavorTextEntries();

	/*! \brief Set The flavor text of this ability listed in different languages.
	 */
	void setFlavorTextEntries(std::list<ItemFlavorText> flavor_text_entries);
	/*! \brief Get A list of game indices relevent to this item by generation.
	 */
	std::list<ItemGameIndex> getGameIndices();

	/*! \brief Set A list of game indices relevent to this item by generation.
	 */
	void setGameIndices(std::list<ItemGameIndex> game_indices);
	/*! \brief Get Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold.
	 */
	std::list<ItemPrice> getPrices();

	/*! \brief Set Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold.
	 */
	void setPrices(std::list<ItemPrice> prices);
	/*! \brief Get The name of this item listed in different languages.
	 */
	std::list<ItemName> getNames();

	/*! \brief Set The name of this item listed in different languages.
	 */
	void setNames(std::list<ItemName> names);
	/*! \brief Get A list of Pokémon that might be found in the wild holding this item.
	 */
	std::list<PokemonHeldItem> getHeldByPokemon();

	/*! \brief Set A list of Pokémon that might be found in the wild holding this item.
	 */
	void setHeldByPokemon(std::list<PokemonHeldItem> held_by_pokemon);
	/*! \brief Get A set of sprites used to depict this item in the game.
	 */
	ItemSprites getSprites();

	/*! \brief Set A set of sprites used to depict this item in the game.
	 */
	void setSprites(ItemSprites sprites);
	/*! \brief Get An evolution chain this item requires to produce a bay during mating.
	 */
	EvolutionChainSummary getBabyTriggerFor();

	/*! \brief Set An evolution chain this item requires to produce a bay during mating.
	 */
	void setBabyTriggerFor(EvolutionChainSummary baby_trigger_for);
	/*! \brief Get A list of the machines related to this item.
	 */
	std::list<ItemMachine> getMachines();

	/*! \brief Set A list of the machines related to this item.
	 */
	void setMachines(std::list<ItemMachine> machines);


    private:
    int id{};
    std::string name{};
    int fling_power{};
    ItemFlingEffectSummary fling_effect;
    std::list<ItemAttributeSummary> attributes;
    ItemCategorySummary category;
    std::list<ItemEffectText> effect_entries;
    std::list<ItemFlavorText> flavor_text_entries;
    std::list<ItemGameIndex> game_indices;
    std::list<ItemPrice> prices;
    std::list<ItemName> names;
    std::list<PokemonHeldItem> held_by_pokemon;
    ItemSprites sprites;
    EvolutionChainSummary baby_trigger_for;
    std::list<ItemMachine> machines;
};
}

#endif /* TINY_CPP_CLIENT_ItemDetail_H_ */
