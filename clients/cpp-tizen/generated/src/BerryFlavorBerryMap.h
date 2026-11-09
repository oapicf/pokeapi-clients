/*
 * BerryFlavorBerryMap.h
 *
 * 
 */

#ifndef _BerryFlavorBerryMap_H_
#define _BerryFlavorBerryMap_H_


#include <string>
#include "BerrySummary.h"
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

class BerryFlavorBerryMap : public Object {
public:
	/*! \brief Constructor.
	 */
	BerryFlavorBerryMap();
	BerryFlavorBerryMap(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BerryFlavorBerryMap();

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
	/*! \brief Get The berry with the referenced flavor.
	 */
	BerrySummary getBerry();

	/*! \brief Set The berry with the referenced flavor.
	 */
	void setBerry(BerrySummary  berry);

private:
	int potency;
	BerrySummary berry;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BerryFlavorBerryMap_H_ */
