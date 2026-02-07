/*
 * PokemonHabitatName.h
 *
 * 
 */

#ifndef _PokemonHabitatName_H_
#define _PokemonHabitatName_H_


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

class PokemonHabitatName : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonHabitatName();
	PokemonHabitatName(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonHabitatName();

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
	LanguageSummary getLanguage();

	/*! \brief Set 
	 */
	void setLanguage(LanguageSummary  language);

private:
	std::string name;
	LanguageSummary language;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonHabitatName_H_ */
