/*
 * ItemDetail_sprites.h
 *
 * 
 */

#ifndef _ItemDetail_sprites_H_
#define _ItemDetail_sprites_H_


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

class ItemDetail_sprites : public Object {
public:
	/*! \brief Constructor.
	 */
	ItemDetail_sprites();
	ItemDetail_sprites(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ItemDetail_sprites();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getRDefault();

	/*! \brief Set 
	 */
	void setRDefault(std::string  r_default);

private:
	std::string r_default;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ItemDetail_sprites_H_ */
