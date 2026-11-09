/*
 * BerryFlavorMap.h
 *
 * 
 */

#ifndef _BerryFlavorMap_H_
#define _BerryFlavorMap_H_


#include <string>
#include "BerryFlavorSummary.h"
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

class BerryFlavorMap : public Object {
public:
	/*! \brief Constructor.
	 */
	BerryFlavorMap();
	BerryFlavorMap(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BerryFlavorMap();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get How powerful the referenced flavor is for this berry.
	 */
	int getPotency();

	/*! \brief Set How powerful the referenced flavor is for this berry.
	 */
	void setPotency(int  potency);
	/*! \brief Get The referenced berry flavor.
	 */
	BerryFlavorSummary getFlavor();

	/*! \brief Set The referenced berry flavor.
	 */
	void setFlavor(BerryFlavorSummary  flavor);

private:
	int potency;
	BerryFlavorSummary flavor;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BerryFlavorMap_H_ */
