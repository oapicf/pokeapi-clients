
/*
 * MoveMetaCategorySummary.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_MoveMetaCategorySummary_H_
#define TINY_CPP_CLIENT_MoveMetaCategorySummary_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class MoveMetaCategorySummary{
public:

    /*! \brief Constructor.
	 */
    MoveMetaCategorySummary();
    MoveMetaCategorySummary(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MoveMetaCategorySummary();


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
	void setName(std::string  name);
	/*! \brief Get 
	 */
	std::string getUrl();

	/*! \brief Set 
	 */
	void setUrl(std::string  url);


    private:
    std::string name{};
    std::string url{};
};
}

#endif /* TINY_CPP_CLIENT_MoveMetaCategorySummary_H_ */
