/*
 * PalParkAreaDetail.h
 *
 * 
 */

#ifndef _PalParkAreaDetail_H_
#define _PalParkAreaDetail_H_


#include <string>
#include "PalParkAreaDetail_pokemon_encounters_inner.h"
#include "PalParkAreaName.h"
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
	std::list<PalParkAreaName> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list <PalParkAreaName> names);
	/*! \brief Get 
	 */
	std::list<PalParkAreaDetail_pokemon_encounters_inner> getPokemonEncounters();

	/*! \brief Set 
	 */
	void setPokemonEncounters(std::list <PalParkAreaDetail_pokemon_encounters_inner> pokemon_encounters);

private:
	int id;
	std::string name;
	std::list <PalParkAreaName>names;
	std::list <PalParkAreaDetail_pokemon_encounters_inner>pokemon_encounters;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PalParkAreaDetail_H_ */
