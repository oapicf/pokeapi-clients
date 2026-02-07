/*
 * BerryFlavorDetail_berries_inner_berry.h
 *
 * 
 */

#ifndef _BerryFlavorDetail_berries_inner_berry_H_
#define _BerryFlavorDetail_berries_inner_berry_H_


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

class BerryFlavorDetail_berries_inner_berry : public Object {
public:
	/*! \brief Constructor.
	 */
	BerryFlavorDetail_berries_inner_berry();
	BerryFlavorDetail_berries_inner_berry(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BerryFlavorDetail_berries_inner_berry();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The name of the berry
	 */
	std::string getName();

	/*! \brief Set The name of the berry
	 */
	void setName(std::string  name);
	/*! \brief Get The URL to get more information about the berry
	 */
	std::string getUrl();

	/*! \brief Set The URL to get more information about the berry
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

#endif /* _BerryFlavorDetail_berries_inner_berry_H_ */
