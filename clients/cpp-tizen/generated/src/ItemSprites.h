/*
 * ItemSprites.h
 *
 * 
 */

#ifndef _ItemSprites_H_
#define _ItemSprites_H_


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

class ItemSprites : public Object {
public:
	/*! \brief Constructor.
	 */
	ItemSprites();
	ItemSprites(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ItemSprites();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The default depiction of this item.
	 */
	std::string getRDefault();

	/*! \brief Set The default depiction of this item.
	 */
	void setRDefault(std::string  r_default);

private:
	std::string r_default;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ItemSprites_H_ */
