
/*
 * StatDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_StatDetail_H_
#define TINY_CPP_CLIENT_StatDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CharacteristicSummary.h"
#include "ItemSummary.h"
#include "MoveDamageClassSummary.h"
#include "StatAffectingMoves.h"
#include "StatAffectingNatures.h"
#include "StatName.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class StatDetail{
public:

    /*! \brief Constructor.
	 */
    StatDetail();
    StatDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~StatDetail();


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
	/*! \brief Get ID the games use for this stat.
	 */
	int getGameIndex();

	/*! \brief Set ID the games use for this stat.
	 */
	void setGameIndex(int game_index);
	/*! \brief Get Whether this stat only exists within a battle.
	 */
	bool isIsBattleOnly();

	/*! \brief Set Whether this stat only exists within a battle.
	 */
	void setIsBattleOnly(bool is_battle_only);
	/*! \brief Get A detail of moves which affect this stat positively or negatively.
	 */
	StatAffectingMoves getAffectingMoves();

	/*! \brief Set A detail of moves which affect this stat positively or negatively.
	 */
	void setAffectingMoves(StatAffectingMoves affecting_moves);
	/*! \brief Get A detail of natures which affect this stat positively or negatively.
	 */
	StatAffectingNatures getAffectingNatures();

	/*! \brief Set A detail of natures which affect this stat positively or negatively.
	 */
	void setAffectingNatures(StatAffectingNatures affecting_natures);
	/*! \brief Get Items that affect this stat, such as vitamins and battle items.
	 */
	std::list<ItemSummary> getAffectingItems();

	/*! \brief Set Items that affect this stat, such as vitamins and battle items.
	 */
	void setAffectingItems(std::list<ItemSummary> affecting_items);
	/*! \brief Get A list of characteristics that are set on a Pokémon when its highest base stat is this stat.
	 */
	std::list<CharacteristicSummary> getCharacteristics();

	/*! \brief Set A list of characteristics that are set on a Pokémon when its highest base stat is this stat.
	 */
	void setCharacteristics(std::list<CharacteristicSummary> characteristics);
	/*! \brief Get The class of damage this stat is directly related to.
	 */
	MoveDamageClassSummary getMoveDamageClass();

	/*! \brief Set The class of damage this stat is directly related to.
	 */
	void setMoveDamageClass(MoveDamageClassSummary move_damage_class);
	/*! \brief Get The name of this resource listed in different languages.
	 */
	std::list<StatName> getNames();

	/*! \brief Set The name of this resource listed in different languages.
	 */
	void setNames(std::list<StatName> names);


    private:
    int id{};
    std::string name{};
    int game_index{};
    bool is_battle_only{};
    StatAffectingMoves affecting_moves;
    StatAffectingNatures affecting_natures;
    std::list<ItemSummary> affecting_items;
    std::list<CharacteristicSummary> characteristics;
    MoveDamageClassSummary move_damage_class;
    std::list<StatName> names;
};
}

#endif /* TINY_CPP_CLIENT_StatDetail_H_ */
