/*
 * MoveTargetDescription.h
 *
 * 
 */

#ifndef _MoveTargetDescription_H_
#define _MoveTargetDescription_H_


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

class MoveTargetDescription : public Object {
public:
	/*! \brief Constructor.
	 */
	MoveTargetDescription();
	MoveTargetDescription(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MoveTargetDescription();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string  description);
	/*! \brief Get 
	 */
	LanguageSummary getLanguage();

	/*! \brief Set 
	 */
	void setLanguage(LanguageSummary  language);

private:
	std::string description;
	LanguageSummary language;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MoveTargetDescription_H_ */
