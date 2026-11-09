
/*
 * ItemSprites.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ItemSprites_H_
#define TINY_CPP_CLIENT_ItemSprites_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ItemSprites{
public:

    /*! \brief Constructor.
	 */
    ItemSprites();
    ItemSprites(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ItemSprites();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The default depiction of this item.
	 */
	std::string getRDefault();

	/*! \brief Set The default depiction of this item.
	 */
	void setRDefault(std::string r_default);


    private:
    std::string r_default{};
};
}

#endif /* TINY_CPP_CLIENT_ItemSprites_H_ */
