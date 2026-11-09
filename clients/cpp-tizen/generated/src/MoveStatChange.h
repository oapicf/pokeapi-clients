/*
 * MoveStatChange.h
 *
 * 
 */

#ifndef _MoveStatChange_H_
#define _MoveStatChange_H_


#include <string>
#include "MoveSummary.h"
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

class MoveStatChange : public Object {
public:
	/*! \brief Constructor.
	 */
	MoveStatChange();
	MoveStatChange(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MoveStatChange();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The maximum amount of change to the referenced stat.
	 */
	int getChange();

	/*! \brief Set The maximum amount of change to the referenced stat.
	 */
	void setChange(int  change);
	/*! \brief Get The move causing the change.
	 */
	MoveSummary getMove();

	/*! \brief Set The move causing the change.
	 */
	void setMove(MoveSummary  move);

private:
	int change;
	MoveSummary move;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MoveStatChange_H_ */
