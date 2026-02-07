/*
 * EggGroupDetail.h
 *
 * 
 */

#ifndef _EggGroupDetail_H_
#define _EggGroupDetail_H_


#include <string>
#include "EggGroupDetail_pokemon_species_inner.h"
#include "EggGroupName.h"
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

class EggGroupDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	EggGroupDetail();
	EggGroupDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~EggGroupDetail();

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
	std::list<EggGroupName> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list <EggGroupName> names);
	/*! \brief Get 
	 */
	std::list<EggGroupDetail_pokemon_species_inner> getPokemonSpecies();

	/*! \brief Set 
	 */
	void setPokemonSpecies(std::list <EggGroupDetail_pokemon_species_inner> pokemon_species);

private:
	int id;
	std::string name;
	std::list <EggGroupName>names;
	std::list <EggGroupDetail_pokemon_species_inner>pokemon_species;
	void __init();
	void __cleanup();

};
}
}

#endif /* _EggGroupDetail_H_ */
