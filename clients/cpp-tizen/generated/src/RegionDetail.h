/*
 * RegionDetail.h
 *
 * 
 */

#ifndef _RegionDetail_H_
#define _RegionDetail_H_


#include <string>
#include "GenerationSummary.h"
#include "LocationSummary.h"
#include "PokedexSummary.h"
#include "RegionName.h"
#include "VersionGroupSummary.h"
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
	/*! \brief Get A list of locations that can be found in this region.
	 */
	std::list<LocationSummary> getLocations();

	/*! \brief Set A list of locations that can be found in this region.
	 */
	void setLocations(std::list <LocationSummary> locations);
	/*! \brief Get The generation this region was introduced in.
	 */
	GenerationSummary getMainGeneration();

	/*! \brief Set The generation this region was introduced in.
	 */
	void setMainGeneration(GenerationSummary  main_generation);
	/*! \brief Get The name of this resource listed in different languages.
	 */
	std::list<RegionName> getNames();

	/*! \brief Set The name of this resource listed in different languages.
	 */
	void setNames(std::list <RegionName> names);
	/*! \brief Get A list of pokédexes that catalogue Pokémon in this region.
	 */
	std::list<PokedexSummary> getPokedexes();

	/*! \brief Set A list of pokédexes that catalogue Pokémon in this region.
	 */
	void setPokedexes(std::list <PokedexSummary> pokedexes);
	/*! \brief Get A list of version groups where this region can be visited.
	 */
	std::list<VersionGroupSummary> getVersionGroups();

	/*! \brief Set A list of version groups where this region can be visited.
	 */
	void setVersionGroups(std::list <VersionGroupSummary> version_groups);

private:
	int id;
	std::string name;
	std::list <LocationSummary>locations;
	GenerationSummary main_generation;
	std::list <RegionName>names;
	std::list <PokedexSummary>pokedexes;
	std::list <VersionGroupSummary>version_groups;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RegionDetail_H_ */
