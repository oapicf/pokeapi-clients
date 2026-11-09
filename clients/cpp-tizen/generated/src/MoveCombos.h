/*
 * MoveCombos.h
 *
 * 
 */

#ifndef _MoveCombos_H_
#define _MoveCombos_H_


#include <string>
#include "MoveComboUsage.h"
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

class MoveCombos : public Object {
public:
	/*! \brief Constructor.
	 */
	MoveCombos();
	MoveCombos(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MoveCombos();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get A detail of moves this move can be used before or after, granting additional appeal points in contests.
	 */
	MoveComboUsage getNormal();

	/*! \brief Set A detail of moves this move can be used before or after, granting additional appeal points in contests.
	 */
	void setNormal(MoveComboUsage  normal);
	/*! \brief Get A detail of moves this move can be used before or after, granting additional appeal points in super contests.
	 */
	MoveComboUsage getSuper();

	/*! \brief Set A detail of moves this move can be used before or after, granting additional appeal points in super contests.
	 */
	void setSuper(MoveComboUsage  super);

private:
	MoveComboUsage normal;
	MoveComboUsage super;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MoveCombos_H_ */
