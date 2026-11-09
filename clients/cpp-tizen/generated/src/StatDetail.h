/*
 * StatDetail.h
 *
 * 
 */

#ifndef _StatDetail_H_
#define _StatDetail_H_


#include <string>
#include "CharacteristicSummary.h"
#include "ItemSummary.h"
#include "MoveDamageClassSummary.h"
#include "StatAffectingMoves.h"
#include "StatAffectingNatures.h"
#include "StatName.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class StatDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	StatDetail();
	StatDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~StatDetail();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The identifier for this resource.
	 */
	int getId();

	/*! \brief Set The identifier for this resource.
	 */
	void setId(int  id);
	/*! \brief Get The name for this resource.
	 */
	std::string getName();

	/*! \brief Set The name for this resource.
	 */
	void setName(std::string  name);
	/*! \brief Get ID the games use for this stat.
	 */
	int getGameIndex();

	/*! \brief Set ID the games use for this stat.
	 */
	void setGameIndex(int  game_index);
	/*! \brief Get Whether this stat only exists within a battle.
	 */
	bool getIsBattleOnly();

	/*! \brief Set Whether this stat only exists within a battle.
	 */
	void setIsBattleOnly(bool  is_battle_only);
	/*! \brief Get A detail of moves which affect this stat positively or negatively.
	 */
	StatAffectingMoves getAffectingMoves();

	/*! \brief Set A detail of moves which affect this stat positively or negatively.
	 */
	void setAffectingMoves(StatAffectingMoves  affecting_moves);
	/*! \brief Get A detail of natures which affect this stat positively or negatively.
	 */
	StatAffectingNatures getAffectingNatures();

	/*! \brief Set A detail of natures which affect this stat positively or negatively.
	 */
	void setAffectingNatures(StatAffectingNatures  affecting_natures);
	/*! \brief Get Items that affect this stat, such as vitamins and battle items.
	 */
	std::list<ItemSummary> getAffectingItems();

	/*! \brief Set Items that affect this stat, such as vitamins and battle items.
	 */
	void setAffectingItems(std::list <ItemSummary> affecting_items);
	/*! \brief Get A list of characteristics that are set on a Pokémon when its highest base stat is this stat.
	 */
	std::list<CharacteristicSummary> getCharacteristics();

	/*! \brief Set A list of characteristics that are set on a Pokémon when its highest base stat is this stat.
	 */
	void setCharacteristics(std::list <CharacteristicSummary> characteristics);
	/*! \brief Get The class of damage this stat is directly related to.
	 */
	MoveDamageClassSummary getMoveDamageClass();

	/*! \brief Set The class of damage this stat is directly related to.
	 */
	void setMoveDamageClass(MoveDamageClassSummary  move_damage_class);
	/*! \brief Get The name of this resource listed in different languages.
	 */
	std::list<StatName> getNames();

	/*! \brief Set The name of this resource listed in different languages.
	 */
	void setNames(std::list <StatName> names);

private:
	int id;
	std::string name;
	int game_index;
	bool is_battle_only;
	StatAffectingMoves affecting_moves;
	StatAffectingNatures affecting_natures;
	std::list <ItemSummary>affecting_items;
	std::list <CharacteristicSummary>characteristics;
	MoveDamageClassSummary move_damage_class;
	std::list <StatName>names;
	void __init();
	void __cleanup();

};
}
}

#endif /* _StatDetail_H_ */
