
/*
 * ItemDetail_baby_trigger_for.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ItemDetail_baby_trigger_for_H_
#define TINY_CPP_CLIENT_ItemDetail_baby_trigger_for_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ItemDetail_baby_trigger_for{
public:

    /*! \brief Constructor.
	 */
    ItemDetail_baby_trigger_for();
    ItemDetail_baby_trigger_for(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ItemDetail_baby_trigger_for();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getUrl();

	/*! \brief Set 
	 */
	void setUrl(std::string  url);


    private:
    std::string url{};
};
}

#endif /* TINY_CPP_CLIENT_ItemDetail_baby_trigger_for_H_ */
