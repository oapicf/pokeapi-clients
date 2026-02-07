/*
 * BerryFlavorDetail_berries_inner.h
 *
 * 
 */

#ifndef _BerryFlavorDetail_berries_inner_H_
#define _BerryFlavorDetail_berries_inner_H_


#include <string>
#include "BerryFlavorDetail_berries_inner_berry.h"
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

class BerryFlavorDetail_berries_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	BerryFlavorDetail_berries_inner();
	BerryFlavorDetail_berries_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BerryFlavorDetail_berries_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getPotency();

	/*! \brief Set 
	 */
	void setPotency(int  potency);
	/*! \brief Get 
	 */
	BerryFlavorDetail_berries_inner_berry getBerry();

	/*! \brief Set 
	 */
	void setBerry(BerryFlavorDetail_berries_inner_berry  berry);

private:
	int potency;
	BerryFlavorDetail_berries_inner_berry berry;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BerryFlavorDetail_berries_inner_H_ */
