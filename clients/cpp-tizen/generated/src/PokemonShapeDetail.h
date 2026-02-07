/*
 * PokemonShapeDetail.h
 *
 * 
 */

#ifndef _PokemonShapeDetail_H_
#define _PokemonShapeDetail_H_


#include <string>
#include "PokemonShapeDetail_awesome_names_inner.h"
#include "PokemonShapeDetail_names_inner.h"
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

	/*! \brief Get 
	 */
	int getId();

	/*! \brief Set 
	 */
	void setId(int  id);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	std::list<PokemonShapeDetail_awesome_names_inner> getAwesomeNames();

	/*! \brief Set 
	 */
	void setAwesomeNames(std::list <PokemonShapeDetail_awesome_names_inner> awesome_names);
	/*! \brief Get 
	 */
	std::list<PokemonShapeDetail_names_inner> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list <PokemonShapeDetail_names_inner> names);
	/*! \brief Get 
	 */
	std::list<PokemonSpeciesSummary> getPokemonSpecies();

	/*! \brief Set 
	 */
	void setPokemonSpecies(std::list <PokemonSpeciesSummary> pokemon_species);

private:
	int id;
	std::string name;
	std::list <PokemonShapeDetail_awesome_names_inner>awesome_names;
	std::list <PokemonShapeDetail_names_inner>names;
	std::list <PokemonSpeciesSummary>pokemon_species;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonShapeDetail_H_ */
