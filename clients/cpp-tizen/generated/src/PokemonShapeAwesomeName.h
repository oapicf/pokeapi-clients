/*
 * PokemonShapeAwesomeName.h
 *
 * 
 */

#ifndef _PokemonShapeAwesomeName_H_
#define _PokemonShapeAwesomeName_H_


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

class PokemonShapeAwesomeName : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonShapeAwesomeName();
	PokemonShapeAwesomeName(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonShapeAwesomeName();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The localized \"scientific\" name for an API resource in a specific language.
	 */
	std::string getAwesomeName();

	/*! \brief Set The localized \"scientific\" name for an API resource in a specific language.
	 */
	void setAwesomeName(std::string  awesome_name);
	/*! \brief Get The language this \"scientific\" name is in.
	 */
	LanguageSummary getLanguage();

	/*! \brief Set The language this \"scientific\" name is in.
	 */
	void setLanguage(LanguageSummary  language);

private:
	std::string awesome_name;
	LanguageSummary language;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonShapeAwesomeName_H_ */
