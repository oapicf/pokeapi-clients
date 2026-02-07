/*
 * PokemonShapeSummary.h
 *
 * 
 */

#ifndef _PokemonShapeSummary_H_
#define _PokemonShapeSummary_H_


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

class PokemonShapeSummary : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonShapeSummary();
	PokemonShapeSummary(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonShapeSummary();

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

#endif /* _PokemonShapeSummary_H_ */
