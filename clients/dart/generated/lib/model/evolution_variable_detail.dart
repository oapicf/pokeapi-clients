//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class EvolutionVariableDetail {
  /// Returns a new [EvolutionVariableDetail] instance.
  EvolutionVariableDetail({
    required this.id,
    required this.name,
    required this.symbol,
    this.dataType,
    this.source_,
    required this.versionGroup,
    this.names = const [],
    this.descriptions = const [],
  });

  /// The identifier for this resource.
  int id;

  /// The name for this resource.
  String name;

  /// The symbol used for this variable in evolution condition expressions.
  String symbol;

  /// The data type of this variable.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? dataType;

  /// The source of the variable value.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? source_;

  /// The version group in which this variable was introduced.
  VersionGroupSummary versionGroup;

  /// The name of this resource listed in different languages.
  List<EvolutionVariableName> names;

  /// The description of this resource listed in different languages.
  List<EvolutionVariableDescription> descriptions;

  @override
  bool operator ==(Object other) => identical(this, other) || other is EvolutionVariableDetail &&
    other.id == id &&
    other.name == name &&
    other.symbol == symbol &&
    other.dataType == dataType &&
    other.source_ == source_ &&
    other.versionGroup == versionGroup &&
    _deepEquality.equals(other.names, names) &&
    _deepEquality.equals(other.descriptions, descriptions);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (name.hashCode) +
    (symbol.hashCode) +
    (dataType == null ? 0 : dataType!.hashCode) +
    (source_ == null ? 0 : source_!.hashCode) +
    (versionGroup.hashCode) +
    (names.hashCode) +
    (descriptions.hashCode);

  @override
  String toString() => 'EvolutionVariableDetail[id=$id, name=$name, symbol=$symbol, dataType=$dataType, source_=$source_, versionGroup=$versionGroup, names=$names, descriptions=$descriptions]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'name'] = this.name;
      json[r'symbol'] = this.symbol;
    if (this.dataType != null) {
      json[r'data_type'] = this.dataType;
    } else {
      json[r'data_type'] = null;
    }
    if (this.source_ != null) {
      json[r'source'] = this.source_;
    } else {
      json[r'source'] = null;
    }
      json[r'version_group'] = this.versionGroup;
      json[r'names'] = this.names;
      json[r'descriptions'] = this.descriptions;
    return json;
  }

  /// Returns a new [EvolutionVariableDetail] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static EvolutionVariableDetail? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'id'), 'Required key "EvolutionVariableDetail[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "EvolutionVariableDetail[id]" has a null value in JSON.');
        assert(json.containsKey(r'name'), 'Required key "EvolutionVariableDetail[name]" is missing from JSON.');
        assert(json[r'name'] != null, 'Required key "EvolutionVariableDetail[name]" has a null value in JSON.');
        assert(json.containsKey(r'symbol'), 'Required key "EvolutionVariableDetail[symbol]" is missing from JSON.');
        assert(json[r'symbol'] != null, 'Required key "EvolutionVariableDetail[symbol]" has a null value in JSON.');
        assert(json.containsKey(r'version_group'), 'Required key "EvolutionVariableDetail[version_group]" is missing from JSON.');
        assert(json[r'version_group'] != null, 'Required key "EvolutionVariableDetail[version_group]" has a null value in JSON.');
        assert(json.containsKey(r'names'), 'Required key "EvolutionVariableDetail[names]" is missing from JSON.');
        assert(json[r'names'] != null, 'Required key "EvolutionVariableDetail[names]" has a null value in JSON.');
        assert(json.containsKey(r'descriptions'), 'Required key "EvolutionVariableDetail[descriptions]" is missing from JSON.');
        assert(json[r'descriptions'] != null, 'Required key "EvolutionVariableDetail[descriptions]" has a null value in JSON.');
        return true;
      }());

      return EvolutionVariableDetail(
        id: mapValueOfType<int>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name')!,
        symbol: mapValueOfType<String>(json, r'symbol')!,
        dataType: mapValueOfType<String>(json, r'data_type'),
        source_: mapValueOfType<String>(json, r'source'),
        versionGroup: VersionGroupSummary.fromJson(json[r'version_group'])!,
        names: EvolutionVariableName.listFromJson(json[r'names']),
        descriptions: EvolutionVariableDescription.listFromJson(json[r'descriptions']),
      );
    }
    return null;
  }

  static List<EvolutionVariableDetail> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <EvolutionVariableDetail>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = EvolutionVariableDetail.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, EvolutionVariableDetail> mapFromJson(dynamic json) {
    final map = <String, EvolutionVariableDetail>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = EvolutionVariableDetail.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of EvolutionVariableDetail-objects as value to a dart map
  static Map<String, List<EvolutionVariableDetail>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<EvolutionVariableDetail>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = EvolutionVariableDetail.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'name',
    'symbol',
    'version_group',
    'names',
    'descriptions',
  };
}

