/*
 * MoveDetail_contest_combos.h
 *
 * 
 */

#ifndef _MoveDetail_contest_combos_H_
#define _MoveDetail_contest_combos_H_


#include <string>
#include "MoveDetail_contest_combos_normal.h"
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

class MoveDetail_contest_combos : public Object {
public:
	/*! \brief Constructor.
	 */
	MoveDetail_contest_combos();
	MoveDetail_contest_combos(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MoveDetail_contest_combos();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	MoveDetail_contest_combos_normal getNormal();

	/*! \brief Set 
	 */
	void setNormal(MoveDetail_contest_combos_normal  normal);
	/*! \brief Get 
	 */
	MoveDetail_contest_combos_normal getSuper();

	/*! \brief Set 
	 */
	void setSuper(MoveDetail_contest_combos_normal  super);

private:
	MoveDetail_contest_combos_normal normal;
	MoveDetail_contest_combos_normal super;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MoveDetail_contest_combos_H_ */
