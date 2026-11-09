
/*
 * BerryDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_BerryDetail_H_
#define TINY_CPP_CLIENT_BerryDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BerryFirmnessSummary.h"
#include "BerryFlavorMap.h"
#include "ItemSummary.h"
#include "TypeSummary.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class BerryDetail{
public:

    /*! \brief Constructor.
	 */
    BerryDetail();
    BerryDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BerryDetail();


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
	/*! \brief Get Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked.
	 */
	int getGrowthTime();

	/*! \brief Set Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked.
	 */
	void setGrowthTime(int growth_time);
	/*! \brief Get The maximum number of these berries that can grow on one tree in Generation IV.
	 */
	int getMaxHarvest();

	/*! \brief Set The maximum number of these berries that can grow on one tree in Generation IV.
	 */
	void setMaxHarvest(int max_harvest);
	/*! \brief Get The power of the move \"Natural Gift\" when used with this Berry.
	 */
	int getNaturalGiftPower();

	/*! \brief Set The power of the move \"Natural Gift\" when used with this Berry.
	 */
	void setNaturalGiftPower(int natural_gift_power);
	/*! \brief Get The size of this Berry, in millimeters.
	 */
	int getSize();

	/*! \brief Set The size of this Berry, in millimeters.
	 */
	void setSize(int size);
	/*! \brief Get The smoothness of this Berry, used in making Pokéblocks or Poffins.
	 */
	int getSmoothness();

	/*! \brief Set The smoothness of this Berry, used in making Pokéblocks or Poffins.
	 */
	void setSmoothness(int smoothness);
	/*! \brief Get The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly.
	 */
	int getSoilDryness();

	/*! \brief Set The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly.
	 */
	void setSoilDryness(int soil_dryness);
	/*! \brief Get The firmness of this berry, used in making Pokéblocks or Poffins.
	 */
	BerryFirmnessSummary getFirmness();

	/*! \brief Set The firmness of this berry, used in making Pokéblocks or Poffins.
	 */
	void setFirmness(BerryFirmnessSummary firmness);
	/*! \brief Get A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry.
	 */
	std::list<BerryFlavorMap> getFlavors();

	/*! \brief Set A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry.
	 */
	void setFlavors(std::list<BerryFlavorMap> flavors);
	/*! \brief Get Berries are actually items. This is a reference to the item specific data for this berry.
	 */
	ItemSummary getItem();

	/*! \brief Set Berries are actually items. This is a reference to the item specific data for this berry.
	 */
	void setItem(ItemSummary item);
	/*! \brief Get The type inherited by \"Natural Gift\" when used with this Berry.
	 */
	TypeSummary getNaturalGiftType();

	/*! \brief Set The type inherited by \"Natural Gift\" when used with this Berry.
	 */
	void setNaturalGiftType(TypeSummary natural_gift_type);


    private:
    int id{};
    std::string name{};
    int growth_time{};
    int max_harvest{};
    int natural_gift_power{};
    int size{};
    int smoothness{};
    int soil_dryness{};
    BerryFirmnessSummary firmness;
    std::list<BerryFlavorMap> flavors;
    ItemSummary item;
    TypeSummary natural_gift_type;
};
}

#endif /* TINY_CPP_CLIENT_BerryDetail_H_ */
