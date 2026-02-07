/*
 * PokemonDetail_cries.h
 *
 * 
 */

#ifndef _PokemonDetail_cries_H_
#define _PokemonDetail_cries_H_


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

class PokemonDetail_cries : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonDetail_cries();
	PokemonDetail_cries(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonDetail_cries();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getLatest();

	/*! \brief Set 
	 */
	void setLatest(std::string  latest);
	/*! \brief Get 
	 */
	std::string getLegacy();

	/*! \brief Set 
	 */
	void setLegacy(std::string  legacy);

private:
	std::string latest;
	std::string legacy;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonDetail_cries_H_ */
