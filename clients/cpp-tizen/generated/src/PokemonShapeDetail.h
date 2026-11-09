/*
 * PokemonShapeDetail.h
 *
 * 
 */

#ifndef _PokemonShapeDetail_H_
#define _PokemonShapeDetail_H_


#include <string>
#include "PokemonShapeAwesomeName.h"
#include "PokemonShapeName.h"
#include "PokemonSpeciesSummary.h"
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

class PokemonShapeDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonShapeDetail();
	PokemonShapeDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonShapeDetail();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The identifier for this resource.
	 */
	int getId();

	/*! \brief Set The identifier for this resource.
	 */
	void setId(int  id);
	/*! \brief Get The name for this resource.
	 */
	std::string getName();

	/*! \brief Set The name for this resource.
	 */
	void setName(std::string  name);
	/*! \brief Get The \"scientific\" name of this Pokémon shape listed in different languages.
	 */
	std::list<PokemonShapeAwesomeName> getAwesomeNames();

	/*! \brief Set The \"scientific\" name of this Pokémon shape listed in different languages.
	 */
	void setAwesomeNames(std::list <PokemonShapeAwesomeName> awesome_names);
	/*! \brief Get The name of this resource listed in different languages.
	 */
	std::list<PokemonShapeName> getNames();

	/*! \brief Set The name of this resource listed in different languages.
	 */
	void setNames(std::list <PokemonShapeName> names);
	/*! \brief Get A list of the Pokémon species that have this shape.
	 */
	std::list<PokemonSpeciesSummary> getPokemonSpecies();

	/*! \brief Set A list of the Pokémon species that have this shape.
	 */
	void setPokemonSpecies(std::list <PokemonSpeciesSummary> pokemon_species);

private:
	int id;
	std::string name;
	std::list <PokemonShapeAwesomeName>awesome_names;
	std::list <PokemonShapeName>names;
	std::list <PokemonSpeciesSummary>pokemon_species;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonShapeDetail_H_ */
