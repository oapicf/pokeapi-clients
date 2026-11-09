/*
 * PokemonPastType.h
 *
 * 
 */

#ifndef _PokemonPastType_H_
#define _PokemonPastType_H_


#include <string>
#include "GenerationSummary.h"
#include "PokemonType.h"
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

class PokemonPastType : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonPastType();
	PokemonPastType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonPastType();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The last generation in which the referenced pokémon had the listed types.
	 */
	GenerationSummary getGeneration();

	/*! \brief Set The last generation in which the referenced pokémon had the listed types.
	 */
	void setGeneration(GenerationSummary  generation);
	/*! \brief Get The types the referenced pokémon had up to and including the listed generation.
	 */
	std::list<PokemonType> getTypes();

	/*! \brief Set The types the referenced pokémon had up to and including the listed generation.
	 */
	void setTypes(std::list <PokemonType> types);

private:
	GenerationSummary generation;
	std::list <PokemonType>types;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonPastType_H_ */
