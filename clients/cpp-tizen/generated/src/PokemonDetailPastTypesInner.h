/*
 * PokemonDetail_past_types_inner.h
 *
 * 
 */

#ifndef _PokemonDetail_past_types_inner_H_
#define _PokemonDetail_past_types_inner_H_


#include <string>
#include "AbilityDetail_pokemon_inner_pokemon.h"
#include "PokemonDetail_types_inner.h"
#include <list>
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

class PokemonDetail_past_types_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonDetail_past_types_inner();
	PokemonDetail_past_types_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonDetail_past_types_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getGeneration();

	/*! \brief Set 
	 */
	void setGeneration(AbilityDetail_pokemon_inner_pokemon  generation);
	/*! \brief Get 
	 */
	std::list<PokemonDetail_types_inner> getTypes();

	/*! \brief Set 
	 */
	void setTypes(std::list <PokemonDetail_types_inner> types);

private:
	AbilityDetail_pokemon_inner_pokemon generation;
	std::list <PokemonDetail_types_inner>types;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonDetail_past_types_inner_H_ */
