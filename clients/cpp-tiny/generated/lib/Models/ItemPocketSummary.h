
/*
 * ItemPocketSummary.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ItemPocketSummary_H_
#define TINY_CPP_CLIENT_ItemPocketSummary_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ItemPocketSummary{
public:

    /*! \brief Constructor.
	 */
    ItemPocketSummary();
    ItemPocketSummary(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ItemPocketSummary();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string name);
	/*! \brief Get 
	 */
	std::string getUrl();

	/*! \brief Set 
	 */
	void setUrl(std::string url);


    private:
    std::string name{};
    std::string url{};
};
}

#endif /* TINY_CPP_CLIENT_ItemPocketSummary_H_ */
