/*
 * TypeDetail_sprites_value_value.h
 *
 * 
 */

#ifndef _TypeDetail_sprites_value_value_H_
#define _TypeDetail_sprites_value_value_H_


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

class TypeDetail_sprites_value_value : public Object {
public:
	/*! \brief Constructor.
	 */
	TypeDetail_sprites_value_value();
	TypeDetail_sprites_value_value(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TypeDetail_sprites_value_value();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getNameicon();

	/*! \brief Set 
	 */
	void setNameicon(std::string  nameicon);

private:
	std::string nameicon;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TypeDetail_sprites_value_value_H_ */
