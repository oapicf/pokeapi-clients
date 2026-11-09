
/*
 * RegionDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_RegionDetail_H_
#define TINY_CPP_CLIENT_RegionDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "GenerationSummary.h"
#include "LocationSummary.h"
#include "PokedexSummary.h"
#include "RegionName.h"
#include "VersionGroupSummary.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class RegionDetail{
public:

    /*! \brief Constructor.
	 */
    RegionDetail();
    RegionDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RegionDetail();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The identifier for this resource.
	 */
	int getId();

	/*! \brief Set The identifier for this resource.
	 */
	void setId(int id);
	/*! \brief Get The name for this resource.
	 */
	std::string getName();

	/*! \brief Set The name for this resource.
	 */
	void setName(std::string name);
	/*! \brief Get A list of locations that can be found in this region.
	 */
	std::list<LocationSummary> getLocations();

	/*! \brief Set A list of locations that can be found in this region.
	 */
	void setLocations(std::list<LocationSummary> locations);
	/*! \brief Get The generation this region was introduced in.
	 */
	GenerationSummary getMainGeneration();

	/*! \brief Set The generation this region was introduced in.
	 */
	void setMainGeneration(GenerationSummary main_generation);
	/*! \brief Get The name of this resource listed in different languages.
	 */
	std::list<RegionName> getNames();

	/*! \brief Set The name of this resource listed in different languages.
	 */
	void setNames(std::list<RegionName> names);
	/*! \brief Get A list of pokédexes that catalogue Pokémon in this region.
	 */
	std::list<PokedexSummary> getPokedexes();

	/*! \brief Set A list of pokédexes that catalogue Pokémon in this region.
	 */
	void setPokedexes(std::list<PokedexSummary> pokedexes);
	/*! \brief Get A list of version groups where this region can be visited.
	 */
	std::list<VersionGroupSummary> getVersionGroups();

	/*! \brief Set A list of version groups where this region can be visited.
	 */
	void setVersionGroups(std::list<VersionGroupSummary> version_groups);


    private:
    int id{};
    std::string name{};
    std::list<LocationSummary> locations;
    GenerationSummary main_generation;
    std::list<RegionName> names;
    std::list<PokedexSummary> pokedexes;
    std::list<VersionGroupSummary> version_groups;
};
}

#endif /* TINY_CPP_CLIENT_RegionDetail_H_ */
