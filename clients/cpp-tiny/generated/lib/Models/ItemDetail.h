
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
#include "AbilityDetail_pokemon_inner_pokemon.h"
#include "ItemCategorySummary.h"
#include "ItemDetail_baby_trigger_for.h"
#include "ItemDetail_held_by_pokemon_inner.h"
#include "ItemDetail_machines_inner.h"
#include "ItemDetail_sprites.h"
#include "ItemEffectText.h"
#include "ItemFlavorText.h"
#include "ItemFlingEffectSummary.h"
#include "ItemGameIndex.h"
#include "ItemName.h"
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

	/*! \brief Get 
	 */
	int getId();

	/*! \brief Set 
	 */
	void setId(int id);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string name);
	/*! \brief Get 
	 */
	int getCost();

	/*! \brief Set 
	 */
	void setCost(int cost);
	/*! \brief Get 
	 */
	int getFlingPower();

	/*! \brief Set 
	 */
	void setFlingPower(int fling_power);
	/*! \brief Get 
	 */
	ItemFlingEffectSummary getFlingEffect();

	/*! \brief Set 
	 */
	void setFlingEffect(ItemFlingEffectSummary fling_effect);
	/*! \brief Get 
	 */
	std::list<AbilityDetail_pokemon_inner_pokemon> getAttributes();

	/*! \brief Set 
	 */
	void setAttributes(std::list<AbilityDetail_pokemon_inner_pokemon> attributes);
	/*! \brief Get 
	 */
	ItemCategorySummary getCategory();

	/*! \brief Set 
	 */
	void setCategory(ItemCategorySummary category);
	/*! \brief Get 
	 */
	std::list<ItemEffectText> getEffectEntries();

	/*! \brief Set 
	 */
	void setEffectEntries(std::list<ItemEffectText> effect_entries);
	/*! \brief Get 
	 */
	std::list<ItemFlavorText> getFlavorTextEntries();

	/*! \brief Set 
	 */
	void setFlavorTextEntries(std::list<ItemFlavorText> flavor_text_entries);
	/*! \brief Get 
	 */
	std::list<ItemGameIndex> getGameIndices();

	/*! \brief Set 
	 */
	void setGameIndices(std::list<ItemGameIndex> game_indices);
	/*! \brief Get 
	 */
	std::list<ItemName> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list<ItemName> names);
	/*! \brief Get 
	 */
	std::list<ItemDetail_held_by_pokemon_inner> getHeldByPokemon();

	/*! \brief Set 
	 */
	void setHeldByPokemon(std::list<ItemDetail_held_by_pokemon_inner> held_by_pokemon);
	/*! \brief Get 
	 */
	ItemDetail_sprites getSprites();

	/*! \brief Set 
	 */
	void setSprites(ItemDetail_sprites sprites);
	/*! \brief Get 
	 */
	ItemDetail_baby_trigger_for getBabyTriggerFor();

	/*! \brief Set 
	 */
	void setBabyTriggerFor(ItemDetail_baby_trigger_for baby_trigger_for);
	/*! \brief Get 
	 */
	std::list<ItemDetail_machines_inner> getMachines();

	/*! \brief Set 
	 */
	void setMachines(std::list<ItemDetail_machines_inner> machines);


    private:
    int id{};
    std::string name{};
    int cost{};
    int fling_power{};
    ItemFlingEffectSummary fling_effect;
    std::list<AbilityDetail_pokemon_inner_pokemon> attributes;
    ItemCategorySummary category;
    std::list<ItemEffectText> effect_entries;
    std::list<ItemFlavorText> flavor_text_entries;
    std::list<ItemGameIndex> game_indices;
    std::list<ItemName> names;
    std::list<ItemDetail_held_by_pokemon_inner> held_by_pokemon;
    ItemDetail_sprites sprites;
    ItemDetail_baby_trigger_for baby_trigger_for;
    std::list<ItemDetail_machines_inner> machines;
};
}

#endif /* TINY_CPP_CLIENT_ItemDetail_H_ */
