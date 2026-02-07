/*
 * ContestTypeName.h
 *
 * 
 */

#ifndef _ContestTypeName_H_
#define _ContestTypeName_H_


#include <string>
#include "LanguageSummary.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ContestTypeName : public Object {
public:
	/*! \brief Constructor.
	 */
	ContestTypeName();
	ContestTypeName(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ContestTypeName();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	std::string getColor();

	/*! \brief Set 
	 */
	void setColor(std::string  color);
	/*! \brief Get 
	 */
	LanguageSummary getLanguage();

	/*! \brief Set 
	 */
	void setLanguage(LanguageSummary  language);

private:
	std::string name;
	std::string color;
	LanguageSummary language;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ContestTypeName_H_ */
