/*
 * RegionDetail.h
 *
 * 
 */

#ifndef _RegionDetail_H_
#define _RegionDetail_H_


#include <string>
#include "AbilityDetail_pokemon_inner_pokemon.h"
#include "GenerationSummary.h"
#include "LocationSummary.h"
#include "PokedexSummary.h"
#include "RegionName.h"
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

class RegionDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	RegionDetail();
	RegionDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RegionDetail();

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
	std::list<LocationSummary> getLocations();

	/*! \brief Set 
	 */
	void setLocations(std::list <LocationSummary> locations);
	/*! \brief Get 
	 */
	GenerationSummary getMainGeneration();

	/*! \brief Set 
	 */
	void setMainGeneration(GenerationSummary  main_generation);
	/*! \brief Get 
	 */
	std::list<RegionName> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list <RegionName> names);
	/*! \brief Get 
	 */
	std::list<PokedexSummary> getPokedexes();

	/*! \brief Set 
	 */
	void setPokedexes(std::list <PokedexSummary> pokedexes);
	/*! \brief Get 
	 */
	std::list<AbilityDetail_pokemon_inner_pokemon> getVersionGroups();

	/*! \brief Set 
	 */
	void setVersionGroups(std::list <AbilityDetail_pokemon_inner_pokemon> version_groups);

private:
	int id;
	std::string name;
	std::list <LocationSummary>locations;
	GenerationSummary main_generation;
	std::list <RegionName>names;
	std::list <PokedexSummary>pokedexes;
	std::list <AbilityDetail_pokemon_inner_pokemon>version_groups;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RegionDetail_H_ */
