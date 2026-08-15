
/*
 * ItemDetail_sprites.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ItemDetail_sprites_H_
#define TINY_CPP_CLIENT_ItemDetail_sprites_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ItemDetail_sprites{
public:

    /*! \brief Constructor.
	 */
    ItemDetail_sprites();
    ItemDetail_sprites(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ItemDetail_sprites();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getRDefault();

	/*! \brief Set 
	 */
	void setRDefault(std::string  r_default);


    private:
    std::string r_default{};
};
}

#endif /* TINY_CPP_CLIENT_ItemDetail_sprites_H_ */
