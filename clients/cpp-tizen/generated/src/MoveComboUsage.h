/*
 * MoveComboUsage.h
 *
 * 
 */

#ifndef _MoveComboUsage_H_
#define _MoveComboUsage_H_


#include <string>
#include "MoveSummary.h"
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

class MoveComboUsage : public Object {
public:
	/*! \brief Constructor.
	 */
	MoveComboUsage();
	MoveComboUsage(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MoveComboUsage();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get A list of moves to use before this move.
	 */
	std::list<MoveSummary> getUseBefore();

	/*! \brief Set A list of moves to use before this move.
	 */
	void setUseBefore(std::list <MoveSummary> use_before);
	/*! \brief Get A list of moves to use after this move.
	 */
	std::list<MoveSummary> getUseAfter();

	/*! \brief Set A list of moves to use after this move.
	 */
	void setUseAfter(std::list <MoveSummary> use_after);

private:
	std::list <MoveSummary>use_before;
	std::list <MoveSummary>use_after;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MoveComboUsage_H_ */
