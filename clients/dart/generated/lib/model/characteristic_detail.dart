//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CharacteristicDetail {
  /// Returns a new [CharacteristicDetail] instance.
  CharacteristicDetail({
    required this.id,
    required this.geneModulo,
    this.possibleValues = const [],
    required this.highestStat,
    this.descriptions = const [],
  });

  int id;

  int geneModulo;

  List<int> possibleValues;

  StatSummary highestStat;

  List<CharacteristicDescription> descriptions;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CharacteristicDetail &&
    other.id == id &&
    other.geneModulo == geneModulo &&
    _deepEquality.equals(other.possibleValues, possibleValues) &&
    other.highestStat == highestStat &&
    _deepEquality.equals(other.descriptions, descriptions);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (geneModulo.hashCode) +
    (possibleValues.hashCode) +
    (highestStat.hashCode) +
    (descriptions.hashCode);

  @override
  String toString() => 'CharacteristicDetail[id=$id, geneModulo=$geneModulo, possibleValues=$possibleValues, highestStat=$highestStat, descriptions=$descriptions]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'gene_modulo'] = this.geneModulo;
      json[r'possible_values'] = this.possibleValues;
      json[r'highest_stat'] = this.highestStat;
      json[r'descriptions'] = this.descriptions;
    return json;
  }

  /// Returns a new [CharacteristicDetail] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CharacteristicDetail? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CharacteristicDetail[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CharacteristicDetail[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CharacteristicDetail(
        id: mapValueOfType<int>(json, r'id')!,
        geneModulo: mapValueOfType<int>(json, r'gene_modulo')!,
        possibleValues: json[r'possible_values'] is Iterable
            ? (json[r'possible_values'] as Iterable).cast<int>().toList(growable: false)
            : const [],
        highestStat: StatSummary.fromJson(json[r'highest_stat'])!,
        descriptions: CharacteristicDescription.listFromJson(json[r'descriptions']),
      );
    }
    return null;
  }

  static List<CharacteristicDetail> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CharacteristicDetail>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CharacteristicDetail.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CharacteristicDetail> mapFromJson(dynamic json) {
    final map = <String, CharacteristicDetail>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CharacteristicDetail.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CharacteristicDetail-objects as value to a dart map
  static Map<String, List<CharacteristicDetail>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CharacteristicDetail>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CharacteristicDetail.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'gene_modulo',
    'possible_values',
    'highest_stat',
    'descriptions',
  };
}

