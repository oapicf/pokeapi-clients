/*
 * PokemonFormDetail_sprites.h
 *
 * 
 */

#ifndef _PokemonFormDetail_sprites_H_
#define _PokemonFormDetail_sprites_H_


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

class PokemonFormDetail_sprites : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonFormDetail_sprites();
	PokemonFormDetail_sprites(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonFormDetail_sprites();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getRDefault();

	/*! \brief Set 
	 */
	void setRDefault(std::string  r_default);

private:
	std::string r_default;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonFormDetail_sprites_H_ */
