//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class EvolutionChainDetail {
  /// Returns a new [EvolutionChainDetail] instance.
  EvolutionChainDetail({
    required this.id,
    required this.babyTriggerItem,
    required this.chain,
  });

  int id;

  ItemSummary babyTriggerItem;

  EvolutionChainDetailChain chain;

  @override
  bool operator ==(Object other) => identical(this, other) || other is EvolutionChainDetail &&
    other.id == id &&
    other.babyTriggerItem == babyTriggerItem &&
    other.chain == chain;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (babyTriggerItem.hashCode) +
    (chain.hashCode);

  @override
  String toString() => 'EvolutionChainDetail[id=$id, babyTriggerItem=$babyTriggerItem, chain=$chain]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'baby_trigger_item'] = this.babyTriggerItem;
      json[r'chain'] = this.chain;
    return json;
  }

  /// Returns a new [EvolutionChainDetail] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static EvolutionChainDetail? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "EvolutionChainDetail[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "EvolutionChainDetail[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return EvolutionChainDetail(
        id: mapValueOfType<int>(json, r'id')!,
        babyTriggerItem: ItemSummary.fromJson(json[r'baby_trigger_item'])!,
        chain: EvolutionChainDetailChain.fromJson(json[r'chain'])!,
      );
    }
    return null;
  }

  static List<EvolutionChainDetail> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <EvolutionChainDetail>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = EvolutionChainDetail.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, EvolutionChainDetail> mapFromJson(dynamic json) {
    final map = <String, EvolutionChainDetail>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = EvolutionChainDetail.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of EvolutionChainDetail-objects as value to a dart map
  static Map<String, List<EvolutionChainDetail>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<EvolutionChainDetail>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = EvolutionChainDetail.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'baby_trigger_item',
    'chain',
  };
}

