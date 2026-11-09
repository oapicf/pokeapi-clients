
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

	/*! \brief Get The level gained.
	 */
	int getLevel();

	/*! \brief Set The level gained.
	 */
	void setLevel(int level);
	/*! \brief Get The amount of experience required to reach the referenced level.
	 */
	int getExperience();

	/*! \brief Set The amount of experience required to reach the referenced level.
	 */
	void setExperience(int experience);


    private:
    int level{};
    int experience{};
};
}

#endif /* TINY_CPP_CLIENT_Experience_H_ */
