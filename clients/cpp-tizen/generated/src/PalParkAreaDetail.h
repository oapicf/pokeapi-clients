/*
 * PalParkAreaDetail.h
 *
 * 
 */

#ifndef _PalParkAreaDetail_H_
#define _PalParkAreaDetail_H_


#include <string>
#include "PalParkAreaName.h"
#include "PalParkEncounter.h"
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

class PalParkAreaDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	PalParkAreaDetail();
	PalParkAreaDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PalParkAreaDetail();

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
	/*! \brief Get The name of this resource listed in different languages.
	 */
	std::list<PalParkAreaName> getNames();

	/*! \brief Set The name of this resource listed in different languages.
	 */
	void setNames(std::list <PalParkAreaName> names);
	/*! \brief Get A list of Pokémon encountered in thi pal park area along with details.
	 */
	std::list<PalParkEncounter> getPokemonEncounters();

	/*! \brief Set A list of Pokémon encountered in thi pal park area along with details.
	 */
	void setPokemonEncounters(std::list <PalParkEncounter> pokemon_encounters);

private:
	int id;
	std::string name;
	std::list <PalParkAreaName>names;
	std::list <PalParkEncounter>pokemon_encounters;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PalParkAreaDetail_H_ */
