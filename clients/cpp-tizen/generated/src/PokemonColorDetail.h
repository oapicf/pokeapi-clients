/*
 * PokemonColorDetail.h
 *
 * 
 */

#ifndef _PokemonColorDetail_H_
#define _PokemonColorDetail_H_


#include <string>
#include "PokemonColorName.h"
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

class PokemonColorDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonColorDetail();
	PokemonColorDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonColorDetail();

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
	std::list<PokemonColorName> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list <PokemonColorName> names);
	/*! \brief Get 
	 */
	std::list<PokemonSpeciesSummary> getPokemonSpecies();

	/*! \brief Set 
	 */
	void setPokemonSpecies(std::list <PokemonSpeciesSummary> pokemon_species);

private:
	int id;
	std::string name;
	std::list <PokemonColorName>names;
	std::list <PokemonSpeciesSummary>pokemon_species;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonColorDetail_H_ */
