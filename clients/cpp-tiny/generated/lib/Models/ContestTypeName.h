
/*
 * ContestTypeName.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ContestTypeName_H_
#define TINY_CPP_CLIENT_ContestTypeName_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "LanguageSummary.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ContestTypeName{
public:

    /*! \brief Constructor.
	 */
    ContestTypeName();
    ContestTypeName(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ContestTypeName();


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
	std::string getColor();

	/*! \brief Set 
	 */
	void setColor(std::string color);
	/*! \brief Get 
	 */
	LanguageSummary getLanguage();

	/*! \brief Set 
	 */
	void setLanguage(LanguageSummary language);


    private:
    std::string name{};
    std::string color{};
    LanguageSummary language;
};
}

#endif /* TINY_CPP_CLIENT_ContestTypeName_H_ */
