//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ItemPrice {
  /// Returns a new [ItemPrice] instance.
  ItemPrice({
    this.purchasePrice,
    this.sellPrice,
    required this.currency,
    required this.versionGroup,
  });

  /// The purchase price in this currency and version group, or null if unavailable.
  ///
  /// Minimum value: -2147483648
  /// Maximum value: 2147483647
  int? purchasePrice;

  /// The sell price in this currency and version group, or null if unavailable.
  ///
  /// Minimum value: -2147483648
  /// Maximum value: 2147483647
  int? sellPrice;

  /// The currency used for this price.
  CurrencySummary currency;

  /// The version group to which this price applies.
  VersionGroupSummary versionGroup;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ItemPrice &&
    other.purchasePrice == purchasePrice &&
    other.sellPrice == sellPrice &&
    other.currency == currency &&
    other.versionGroup == versionGroup;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (purchasePrice == null ? 0 : purchasePrice!.hashCode) +
    (sellPrice == null ? 0 : sellPrice!.hashCode) +
    (currency.hashCode) +
    (versionGroup.hashCode);

  @override
  String toString() => 'ItemPrice[purchasePrice=$purchasePrice, sellPrice=$sellPrice, currency=$currency, versionGroup=$versionGroup]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.purchasePrice != null) {
      json[r'purchase_price'] = this.purchasePrice;
    } else {
      json[r'purchase_price'] = null;
    }
    if (this.sellPrice != null) {
      json[r'sell_price'] = this.sellPrice;
    } else {
      json[r'sell_price'] = null;
    }
      json[r'currency'] = this.currency;
      json[r'version_group'] = this.versionGroup;
    return json;
  }

  /// Returns a new [ItemPrice] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ItemPrice? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'currency'), 'Required key "ItemPrice[currency]" is missing from JSON.');
        assert(json[r'currency'] != null, 'Required key "ItemPrice[currency]" has a null value in JSON.');
        assert(json.containsKey(r'version_group'), 'Required key "ItemPrice[version_group]" is missing from JSON.');
        assert(json[r'version_group'] != null, 'Required key "ItemPrice[version_group]" has a null value in JSON.');
        return true;
      }());

      return ItemPrice(
        purchasePrice: mapValueOfType<int>(json, r'purchase_price'),
        sellPrice: mapValueOfType<int>(json, r'sell_price'),
        currency: CurrencySummary.fromJson(json[r'currency'])!,
        versionGroup: VersionGroupSummary.fromJson(json[r'version_group'])!,
      );
    }
    return null;
  }

  static List<ItemPrice> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ItemPrice>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ItemPrice.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ItemPrice> mapFromJson(dynamic json) {
    final map = <String, ItemPrice>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ItemPrice.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ItemPrice-objects as value to a dart map
  static Map<String, List<ItemPrice>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ItemPrice>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ItemPrice.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'currency',
    'version_group',
  };
}

