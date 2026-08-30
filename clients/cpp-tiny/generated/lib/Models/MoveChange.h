
/*
 * MoveChange.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_MoveChange_H_
#define TINY_CPP_CLIENT_MoveChange_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "MoveChange_effect_entries_inner.h"
#include "TypeSummary.h"
#include "VersionGroupSummary.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class MoveChange{
public:

    /*! \brief Constructor.
	 */
    MoveChange();
    MoveChange(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MoveChange();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	int getAccuracy();

	/*! \brief Set 
	 */
	void setAccuracy(int accuracy);
	/*! \brief Get 
	 */
	int getPower();

	/*! \brief Set 
	 */
	void setPower(int power);
	/*! \brief Get 
	 */
	int getPp();

	/*! \brief Set 
	 */
	void setPp(int pp);
	/*! \brief Get 
	 */
	int getEffectChance();

	/*! \brief Set 
	 */
	void setEffectChance(int effect_chance);
	/*! \brief Get 
	 */
	std::list<MoveChange_effect_entries_inner> getEffectEntries();

	/*! \brief Set 
	 */
	void setEffectEntries(std::list<MoveChange_effect_entries_inner> effect_entries);
	/*! \brief Get 
	 */
	TypeSummary getType();

	/*! \brief Set 
	 */
	void setType(TypeSummary type);
	/*! \brief Get 
	 */
	VersionGroupSummary getVersionGroup();

	/*! \brief Set 
	 */
	void setVersionGroup(VersionGroupSummary version_group);


    private:
    int accuracy{};
    int power{};
    int pp{};
    int effect_chance{};
    std::list<MoveChange_effect_entries_inner> effect_entries;
    TypeSummary type;
    VersionGroupSummary version_group;
};
}

#endif /* TINY_CPP_CLIENT_MoveChange_H_ */
