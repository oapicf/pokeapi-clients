/*
 * Experience.h
 *
 * 
 */

#ifndef _Experience_H_
#define _Experience_H_


#include <string>
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

class Experience : public Object {
public:
	/*! \brief Constructor.
	 */
	Experience();
	Experience(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Experience();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	int level;
	int experience;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Experience_H_ */
