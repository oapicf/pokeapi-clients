/*
 * MoveMetaStatChange.h
 *
 * 
 */

#ifndef _MoveMetaStatChange_H_
#define _MoveMetaStatChange_H_


#include <string>
#include "StatSummary.h"
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

class MoveMetaStatChange : public Object {
public:
	/*! \brief Constructor.
	 */
	MoveMetaStatChange();
	MoveMetaStatChange(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MoveMetaStatChange();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The amount of change.
	 */
	int getChange();

	/*! \brief Set The amount of change.
	 */
	void setChange(int  change);
	/*! \brief Get The stat being affected.
	 */
	StatSummary getStat();

	/*! \brief Set The stat being affected.
	 */
	void setStat(StatSummary  stat);

private:
	int change;
	StatSummary stat;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MoveMetaStatChange_H_ */
