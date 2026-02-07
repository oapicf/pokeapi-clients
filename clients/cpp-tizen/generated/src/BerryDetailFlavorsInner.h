/*
 * BerryDetail_flavors_inner.h
 *
 * 
 */

#ifndef _BerryDetail_flavors_inner_H_
#define _BerryDetail_flavors_inner_H_


#include <string>
#include "BerryDetail_flavors_inner_flavor.h"
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

class BerryDetail_flavors_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	BerryDetail_flavors_inner();
	BerryDetail_flavors_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BerryDetail_flavors_inner();

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
	BerryDetail_flavors_inner_flavor getFlavor();

	/*! \brief Set 
	 */
	void setFlavor(BerryDetail_flavors_inner_flavor  flavor);

private:
	int potency;
	BerryDetail_flavors_inner_flavor flavor;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BerryDetail_flavors_inner_H_ */
