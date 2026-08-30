
/*
 * TypeDetail_sprites_value_value.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_TypeDetail_sprites_value_value_H_
#define TINY_CPP_CLIENT_TypeDetail_sprites_value_value_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class TypeDetail_sprites_value_value{
public:

    /*! \brief Constructor.
	 */
    TypeDetail_sprites_value_value();
    TypeDetail_sprites_value_value(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TypeDetail_sprites_value_value();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getNameicon();

	/*! \brief Set 
	 */
	void setNameicon(std::string nameicon);


    private:
    std::string nameicon{};
};
}

#endif /* TINY_CPP_CLIENT_TypeDetail_sprites_value_value_H_ */
