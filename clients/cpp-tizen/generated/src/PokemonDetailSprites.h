/*
 * PokemonDetail_sprites.h
 *
 * 
 */

#ifndef _PokemonDetail_sprites_H_
#define _PokemonDetail_sprites_H_


#include <string>
#include <map>
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

class PokemonDetail_sprites : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonDetail_sprites();
	PokemonDetail_sprites(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonDetail_sprites();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getFrontDefault();

	/*! \brief Set 
	 */
	void setFrontDefault(std::string  front_default);

private:
	std::string front_default;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonDetail_sprites_H_ */
