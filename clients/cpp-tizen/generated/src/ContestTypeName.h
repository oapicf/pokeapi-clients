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

	/*! \brief Get The name for this contest.
	 */
	std::string getName();

	/*! \brief Set The name for this contest.
	 */
	void setName(std::string  name);
	/*! \brief Get The color associated with this contest's name.
	 */
	std::string getColor();

	/*! \brief Set The color associated with this contest's name.
	 */
	void setColor(std::string  color);
	/*! \brief Get The language that this name is in.
	 */
	LanguageSummary getLanguage();

	/*! \brief Set The language that this name is in.
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
