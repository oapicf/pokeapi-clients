/*
 * StatAffectingMoves.h
 *
 * 
 */

#ifndef _StatAffectingMoves_H_
#define _StatAffectingMoves_H_


#include <string>
#include "MoveStatChange.h"
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

class StatAffectingMoves : public Object {
public:
	/*! \brief Constructor.
	 */
	StatAffectingMoves();
	StatAffectingMoves(char* str);

	/*! \brief Destructor.
	 */
	virtual ~StatAffectingMoves();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get A list of moves and how they change the referenced stat.
	 */
	std::list<MoveStatChange> getIncrease();

	/*! \brief Set A list of moves and how they change the referenced stat.
	 */
	void setIncrease(std::list <MoveStatChange> increase);
	/*! \brief Get A list of moves and how they change the referenced stat.
	 */
	std::list<MoveStatChange> getDecrease();

	/*! \brief Set A list of moves and how they change the referenced stat.
	 */
	void setDecrease(std::list <MoveStatChange> decrease);

private:
	std::list <MoveStatChange>increase;
	std::list <MoveStatChange>decrease;
	void __init();
	void __cleanup();

};
}
}

#endif /* _StatAffectingMoves_H_ */
