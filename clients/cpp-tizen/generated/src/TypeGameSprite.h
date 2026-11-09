/*
 * TypeGameSprite.h
 *
 * 
 */

#ifndef _TypeGameSprite_H_
#define _TypeGameSprite_H_


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

class TypeGameSprite : public Object {
public:
	/*! \brief Constructor.
	 */
	TypeGameSprite();
	TypeGameSprite(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TypeGameSprite();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The URL of the icon displaying the type name in this game, or null if unavailable.
	 */
	std::string getNameIcon();

	/*! \brief Set The URL of the icon displaying the type name in this game, or null if unavailable.
	 */
	void setNameIcon(std::string  name_icon);
	/*! \brief Get The URL of the type symbol icon in this game, or null if unavailable.
	 */
	std::string getSymbolIcon();

	/*! \brief Set The URL of the type symbol icon in this game, or null if unavailable.
	 */
	void setSymbolIcon(std::string  symbol_icon);

private:
	std::string name_icon;
	std::string symbol_icon;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TypeGameSprite_H_ */
