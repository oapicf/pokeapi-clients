/*
 * ItemDetail_baby_trigger_for.h
 *
 * 
 */

#ifndef _ItemDetail_baby_trigger_for_H_
#define _ItemDetail_baby_trigger_for_H_


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

class ItemDetail_baby_trigger_for : public Object {
public:
	/*! \brief Constructor.
	 */
	ItemDetail_baby_trigger_for();
	ItemDetail_baby_trigger_for(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ItemDetail_baby_trigger_for();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getUrl();

	/*! \brief Set 
	 */
	void setUrl(std::string  url);

private:
	std::string url;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ItemDetail_baby_trigger_for_H_ */
