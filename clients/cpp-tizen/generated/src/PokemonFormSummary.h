/*
 * PokemonFormSummary.h
 *
 * 
 */

#ifndef _PokemonFormSummary_H_
#define _PokemonFormSummary_H_


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

class PokemonFormSummary : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonFormSummary();
	PokemonFormSummary(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonFormSummary();

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
	std::string getUrl();

	/*! \brief Set 
	 */
	void setUrl(std::string  url);

private:
	std::string name;
	std::string url;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonFormSummary_H_ */
