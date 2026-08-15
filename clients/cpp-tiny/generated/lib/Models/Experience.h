
/*
 * Experience.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Experience_H_
#define TINY_CPP_CLIENT_Experience_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Experience{
public:

    /*! \brief Constructor.
	 */
    Experience();
    Experience(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Experience();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	int getLevel();

	/*! \brief Set 
	 */
	void setLevel(int  level);
	/*! \brief Get 
	 */
	int getExperience();

	/*! \brief Set 
	 */
	void setExperience(int  experience);


    private:
    int level{};
    int experience{};
};
}

#endif /* TINY_CPP_CLIENT_Experience_H_ */
