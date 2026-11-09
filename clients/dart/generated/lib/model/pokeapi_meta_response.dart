//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PokeapiMetaResponse {
  /// Returns a new [PokeapiMetaResponse] instance.
  PokeapiMetaResponse({
    required this.deployDate,
    required this.hash,
    required this.tag,
  });

  /// The deployment time as a Unix timestamp string.
  String? deployDate;

  /// The source commit hash used for this deployment.
  String? hash;

  /// The deployment tag, or null if the deployment has no tag.
  String? tag;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PokeapiMetaResponse &&
    other.deployDate == deployDate &&
    other.hash == hash &&
    other.tag == tag;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (deployDate == null ? 0 : deployDate!.hashCode) +
    (hash == null ? 0 : hash!.hashCode) +
    (tag == null ? 0 : tag!.hashCode);

  @override
  String toString() => 'PokeapiMetaResponse[deployDate=$deployDate, hash=$hash, tag=$tag]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.deployDate != null) {
      json[r'deploy_date'] = this.deployDate;
    } else {
      json[r'deploy_date'] = null;
    }
    if (this.hash != null) {
      json[r'hash'] = this.hash;
    } else {
      json[r'hash'] = null;
    }
    if (this.tag != null) {
      json[r'tag'] = this.tag;
    } else {
      json[r'tag'] = null;
    }
    return json;
  }

  /// Returns a new [PokeapiMetaResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PokeapiMetaResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'deploy_date'), 'Required key "PokeapiMetaResponse[deploy_date]" is missing from JSON.');
        assert(json.containsKey(r'hash'), 'Required key "PokeapiMetaResponse[hash]" is missing from JSON.');
        assert(json.containsKey(r'tag'), 'Required key "PokeapiMetaResponse[tag]" is missing from JSON.');
        return true;
      }());

      return PokeapiMetaResponse(
        deployDate: mapValueOfType<String>(json, r'deploy_date'),
        hash: mapValueOfType<String>(json, r'hash'),
        tag: mapValueOfType<String>(json, r'tag'),
      );
    }
    return null;
  }

  static List<PokeapiMetaResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PokeapiMetaResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PokeapiMetaResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PokeapiMetaResponse> mapFromJson(dynamic json) {
    final map = <String, PokeapiMetaResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PokeapiMetaResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PokeapiMetaResponse-objects as value to a dart map
  static Map<String, List<PokeapiMetaResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PokeapiMetaResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PokeapiMetaResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'deploy_date',
    'hash',
    'tag',
  };
}

