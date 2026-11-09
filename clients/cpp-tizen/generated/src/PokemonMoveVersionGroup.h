/*
 * PokemonMoveVersionGroup.h
 *
 * 
 */

#ifndef _PokemonMoveVersionGroup_H_
#define _PokemonMoveVersionGroup_H_


#include <string>
#include "MoveLearnMethodSummary.h"
#include "VersionGroupSummary.h"
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

class PokemonMoveVersionGroup : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonMoveVersionGroup();
	PokemonMoveVersionGroup(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonMoveVersionGroup();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The minimum level to learn the move.
	 */
	int getLevelLearnedAt();

	/*! \brief Set The minimum level to learn the move.
	 */
	void setLevelLearnedAt(int  level_learned_at);
	/*! \brief Get The method by which the move is learned.
	 */
	MoveLearnMethodSummary getMoveLearnMethod();

	/*! \brief Set The method by which the move is learned.
	 */
	void setMoveLearnMethod(MoveLearnMethodSummary  move_learn_method);
	/*! \brief Get The version group in which the move is learned.
	 */
	VersionGroupSummary getVersionGroup();

	/*! \brief Set The version group in which the move is learned.
	 */
	void setVersionGroup(VersionGroupSummary  version_group);
	/*! \brief Get Order by which the pokemon will learn the move. A newly learnt move will replace the move with lowest order.
	 */
	int getOrder();

	/*! \brief Set Order by which the pokemon will learn the move. A newly learnt move will replace the move with lowest order.
	 */
	void setOrder(int  order);

private:
	int level_learned_at;
	MoveLearnMethodSummary move_learn_method;
	VersionGroupSummary version_group;
	int order;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonMoveVersionGroup_H_ */
