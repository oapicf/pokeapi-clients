/*
 * StatDetail.h
 *
 * 
 */

#ifndef _StatDetail_H_
#define _StatDetail_H_


#include <string>
#include "CharacteristicSummary.h"
#include "MoveDamageClassSummary.h"
#include "StatDetail_affecting_moves.h"
#include "StatDetail_affecting_natures.h"
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

	/*! \brief Get 
	 */
	int getId();

	/*! \brief Set 
	 */
	void setId(int  id);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	int getGameIndex();

	/*! \brief Set 
	 */
	void setGameIndex(int  game_index);
	/*! \brief Get 
	 */
	bool getIsBattleOnly();

	/*! \brief Set 
	 */
	void setIsBattleOnly(bool  is_battle_only);
	/*! \brief Get 
	 */
	StatDetail_affecting_moves getAffectingMoves();

	/*! \brief Set 
	 */
	void setAffectingMoves(StatDetail_affecting_moves  affecting_moves);
	/*! \brief Get 
	 */
	StatDetail_affecting_natures getAffectingNatures();

	/*! \brief Set 
	 */
	void setAffectingNatures(StatDetail_affecting_natures  affecting_natures);
	/*! \brief Get 
	 */
	std::list<CharacteristicSummary> getCharacteristics();

	/*! \brief Set 
	 */
	void setCharacteristics(std::list <CharacteristicSummary> characteristics);
	/*! \brief Get 
	 */
	MoveDamageClassSummary getMoveDamageClass();

	/*! \brief Set 
	 */
	void setMoveDamageClass(MoveDamageClassSummary  move_damage_class);
	/*! \brief Get 
	 */
	std::list<StatName> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list <StatName> names);

private:
	int id;
	std::string name;
	int game_index;
	bool is_battle_only;
	StatDetail_affecting_moves affecting_moves;
	StatDetail_affecting_natures affecting_natures;
	std::list <CharacteristicSummary>characteristics;
	MoveDamageClassSummary move_damage_class;
	std::list <StatName>names;
	void __init();
	void __cleanup();

};
}
}

#endif /* _StatDetail_H_ */
