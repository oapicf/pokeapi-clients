
/*
 * TypeGameSprite.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_TypeGameSprite_H_
#define TINY_CPP_CLIENT_TypeGameSprite_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class TypeGameSprite{
public:

    /*! \brief Constructor.
	 */
    TypeGameSprite();
    TypeGameSprite(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TypeGameSprite();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The URL of the icon displaying the type name in this game, or null if unavailable.
	 */
	std::string getNameIcon();

	/*! \brief Set The URL of the icon displaying the type name in this game, or null if unavailable.
	 */
	void setNameIcon(std::string name_icon);
	/*! \brief Get The URL of the type symbol icon in this game, or null if unavailable.
	 */
	std::string getSymbolIcon();

	/*! \brief Set The URL of the type symbol icon in this game, or null if unavailable.
	 */
	void setSymbolIcon(std::string symbol_icon);


    private:
    std::string name_icon{};
    std::string symbol_icon{};
};
}

#endif /* TINY_CPP_CLIENT_TypeGameSprite_H_ */
