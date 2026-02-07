/*
 * BerryDetail_flavors_inner_flavor.h
 *
 * 
 */

#ifndef _BerryDetail_flavors_inner_flavor_H_
#define _BerryDetail_flavors_inner_flavor_H_


#include <string>
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

class BerryDetail_flavors_inner_flavor : public Object {
public:
	/*! \brief Constructor.
	 */
	BerryDetail_flavors_inner_flavor();
	BerryDetail_flavors_inner_flavor(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BerryDetail_flavors_inner_flavor();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The name of the flavor
	 */
	std::string getName();

	/*! \brief Set The name of the flavor
	 */
	void setName(std::string  name);
	/*! \brief Get The URL to get more information about the flavor
	 */
	std::string getUrl();

	/*! \brief Set The URL to get more information about the flavor
	 */
	void setUrl(std::string  url);

private:
	std::string name;
	std::string url;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BerryDetail_flavors_inner_flavor_H_ */
